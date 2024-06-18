package com.akirachix.fibonacci_series

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonacci_series.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            val numbers = fibonacci(100)
            binding.rvNumbers.layoutManager = LinearLayoutManager(this)


            val numberAdapter = fibonacci(numbers)
            binding.rvNumbers.adapter = numberAdapter

        }

        fun fibonacci(n: Int): List<Int> {
            val numbers = mutableListOf(0, 1)
            while (numbers.size < n) {
                numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex - 1])
            }
            return numbers
        }
    }
}
