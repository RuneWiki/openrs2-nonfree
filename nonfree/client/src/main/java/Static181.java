import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array9;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
	public static int anInt3978;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
	public static int anInt3973 = 0;

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString266 = "Cancel";

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2924(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 >= 10000000) {
			return "<col=00ff80>" + arg0 / 1000000 + Static271.aString383 + "</col>";
		} else {
			return "<col=ffffff>" + arg0 / 1000 + Static129.aString175 + "</col>";
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII[Lclient!wf;IIIII)V")
	public static void method2925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class191[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static294.aBoolean367) {
			Static156.method2546(arg7, arg6, arg5, arg0);
		} else {
			Static231.method3634(arg7, arg6, arg5, arg0);
			Static237.method3736();
		}
		for (@Pc(32) int local32 = 0; local32 < arg3.length; local32++) {
			@Pc(44) Class191 local44 = arg3[local32];
			if (local44 != null && (arg2 == local44.anInt6093 || arg2 == -1412584499 && Static238.aClass191_11 == local44)) {
				@Pc(101) int local101;
				if (arg4 == -1) {
					Static117.anIntArray424[Static203.anInt5700] = arg8 + local44.anInt6123;
					Static103.anIntArray231[Static203.anInt5700] = local44.anInt6157 + arg1;
					Static197.anIntArray379[Static203.anInt5700] = local44.anInt6088;
					Static128.anIntArray278[Static203.anInt5700] = local44.anInt6128;
					local101 = Static203.anInt5700++;
				} else {
					local101 = arg4;
				}
				local44.anInt6133 = local101;
				local44.anInt6152 = Static133.anInt3061;
				if (!local44.aBoolean408 || !Static35.method759(local44)) {
					if (local44.anInt6115 > 0) {
						Static86.method1569(local44);
					}
					@Pc(132) int local132 = arg8 + local44.anInt6123;
					@Pc(138) int local138 = local44.anInt6157 + arg1;
					@Pc(141) int local141 = local44.anInt6094;
					if (Static303.aBoolean389 && (Static35.method737(local44).anInt5933 != 0 || local44.anInt6086 == 0) && local141 > 127) {
						local141 = 127;
					}
					@Pc(185) int local185;
					@Pc(187) int local187;
					if (Static238.aClass191_11 == local44) {
						if (arg2 != -1412584499 && !local44.aBoolean396) {
							Static122.aClass191Array1 = arg3;
							Static302.anInt5987 = arg1;
							Static282.anInt5659 = arg8;
							continue;
						}
						if (Static102.aBoolean61 && Static129.aBoolean173) {
							local185 = Static89.anInt5974;
							local187 = Static289.anInt5816;
							local185 -= Static40.anInt989;
							local187 -= Static270.anInt5414;
							if (Static289.anInt5817 > local185) {
								local185 = Static289.anInt5817;
							}
							if (Static120.aClass191_18.anInt6088 + Static289.anInt5817 < local185 - -local44.anInt6088) {
								local185 = Static289.anInt5817 + Static120.aClass191_18.anInt6088 - local44.anInt6088;
							}
							local132 = local185;
							if (Static118.anInt2546 > local187) {
								local187 = Static118.anInt2546;
							}
							if (local187 + local44.anInt6128 > Static120.aClass191_18.anInt6128 + Static118.anInt2546) {
								local187 = Static118.anInt2546 + Static120.aClass191_18.anInt6128 - local44.anInt6128;
							}
							local138 = local187;
						}
						if (!local44.aBoolean396) {
							local141 = 128;
						}
					}
					@Pc(269) int local269;
					@Pc(267) int local267;
					@Pc(289) int local289;
					@Pc(305) int local305;
					if (local44.anInt6086 == 2) {
						local187 = arg6;
						local267 = arg0;
						local269 = arg5;
						local185 = arg7;
					} else {
						local185 = arg7 < local132 ? local132 : arg7;
						local289 = local44.anInt6088 + local132;
						local187 = local138 > arg6 ? local138 : arg6;
						local305 = local138 + local44.anInt6128;
						if (local44.anInt6086 == 9) {
							local289++;
							local305++;
						}
						local267 = arg0 > local305 ? local305 : arg0;
						local269 = local289 < arg5 ? local289 : arg5;
					}
					if (!local44.aBoolean408 || local269 > local185 && local267 > local187) {
						@Pc(475) int local475;
						@Pc(525) int local525;
						@Pc(536) int local536;
						@Pc(540) int local540;
						@Pc(569) int local569;
						@Pc(580) int local580;
						@Pc(592) int local592;
						@Pc(598) int local598;
						if (local44.anInt6115 != 0) {
							if (local44.anInt6115 == 1337 || local44.anInt6115 == 1403) {
								Static210.aClass191_10 = local44;
								Static236.anInt1714 = local138;
								Static281.anInt2781 = local132;
								Static270.method4099(local44.anInt6115 == 1403, local132, local138, local44.anInt6088, local44.anInt6128);
								Static29.aBooleanArray6[local101] = true;
								if (Static294.aBoolean367) {
									Static156.method2546(arg7, arg6, arg5, arg0);
								} else {
									Static231.method3634(arg7, arg6, arg5, arg0);
								}
								continue;
							}
							if (local44.anInt6115 == 1338) {
								if (!local44.method4667()) {
									continue;
								}
								Static289.method4435(local132, local44, local138, local101);
								if (Static294.aBoolean367) {
									Static156.method2546(arg7, arg6, arg5, arg0);
								} else {
									Static231.method3634(arg7, arg6, arg5, arg0);
								}
								if (Static221.anInt4695 != 0 && Static221.anInt4695 != 3 || Static128.aBoolean171 || local185 > Static57.anInt6304 || local187 > Static107.anInt1674 || local269 <= Static57.anInt6304 || Static107.anInt1674 >= local267) {
									continue;
								}
								local305 = Static107.anInt1674 - local138;
								local475 = local44.anIntArray557[local305];
								local289 = Static57.anInt6304 - local132;
								if (local289 < local475 || local289 > local475 + local44.anIntArray554[local305]) {
									continue;
								}
								local305 -= local44.anInt6128 / 2;
								local289 -= local44.anInt6088 / 2;
								if (Static106.anInt2378 == 4) {
									local525 = (int) Static62.aFloat16 & 0x7FF;
								} else {
									local525 = (int) Static62.aFloat16 + Static220.anInt4691 & 0x7FF;
								}
								local536 = Class146.anIntArray461[local525];
								local540 = Class146.anIntArray463[local525];
								if (Static106.anInt2378 != 4) {
									local540 = local540 * (Static253.anInt5117 + 256) >> 8;
									local536 = (Static253.anInt5117 + 256) * local536 >> 8;
								}
								local569 = local540 * local289 + local536 * local305 >> 11;
								local580 = local305 * local540 - local289 * local536 >> 11;
								if (Static106.anInt2378 == 4) {
									local592 = Static109.anInt2425 + local569 >> 7;
									local598 = Static23.anInt641 - local580 >> 7;
								} else {
									local592 = Static56.aClass2_Sub4_Sub2_1.anInt2846 + local569 + 64 - Static56.aClass2_Sub4_Sub2_1.method2088() * 64 >> 7;
									local598 = Static56.aClass2_Sub4_Sub2_1.anInt2794 - local580 - (Static56.aClass2_Sub4_Sub2_1.method2088() + -1) * 64 >> 7;
								}
								if (Static230.aBoolean185 && (Static56.anInt1257 & 0x40) != 0) {
									@Pc(644) Class191 local644 = Static205.method3267(Static8.anInt225, Static217.anInt4676);
									if (local644 == null) {
										Static269.method4059();
									} else {
										Static12.method2960(local598, anInt3978, 1L, " ->", local592, Static244.aString290, (short) 49);
									}
									continue;
								}
								if (Static208.anInt4489 == 1) {
									Static12.method2960(local598, -1, 1L, "", local592, Static120.aString447, (short) 44);
								}
								Static12.method2960(local598, -1, 1L, "", local592, Static86.aString118, (short) 48);
								continue;
							}
							if (local44.anInt6115 == 1339) {
								if (local44.method4667()) {
									Static272.method4132(local132, local44, local138, local101);
									if (Static294.aBoolean367) {
										Static156.method2546(arg7, arg6, arg5, arg0);
									} else {
										Static231.method3634(arg7, arg6, arg5, arg0);
									}
								}
								continue;
							}
							if (local44.anInt6115 == 1400) {
								Static222.method3476(local44.anInt6088, local138, local44.anInt6128, local132);
								Static29.aBooleanArray6[local101] = true;
								Static55.aBooleanArray15[local101] = true;
								if (Static294.aBoolean367) {
									Static156.method2546(arg7, arg6, arg5, arg0);
								} else {
									Static231.method3634(arg7, arg6, arg5, arg0);
								}
								continue;
							}
							if (local44.anInt6115 == 1401) {
								Static136.method2299(local44.anInt6088, local44.anInt6128, local138, local132);
								Static29.aBooleanArray6[local101] = true;
								Static55.aBooleanArray15[local101] = true;
								if (Static294.aBoolean367) {
									Static156.method2546(arg7, arg6, arg5, arg0);
								} else {
									Static231.method3634(arg7, arg6, arg5, arg0);
								}
								continue;
							}
							if (local44.anInt6115 == 1402) {
								if (!Static294.aBoolean367) {
									Static197.method3168(local138, local132);
									Static29.aBooleanArray6[local101] = true;
									Static55.aBooleanArray15[local101] = true;
								}
								continue;
							}
							if (local44.anInt6115 == 1405) {
								if (!Static24.aBoolean36) {
									continue;
								}
								local305 = local138 + 15;
								local289 = local132 + local44.anInt6088;
								local536 = 16776960;
								Static195.aClass1_Sub3_Sub5_3.method3494("Fps:" + Static25.anInt692, local289, local305, 16776960, -1);
								local305 += 15;
								@Pc(849) Runtime local849 = Runtime.getRuntime();
								local525 = (int) ((local849.totalMemory() - local849.freeMemory()) / 1024L);
								if (local525 > 65536) {
									local536 = 16711680;
								}
								Static195.aClass1_Sub3_Sub5_3.method3494("Mem:" + local525 + "k", local289, local305, local536, -1);
								local305 += 15;
								if (Static294.aBoolean367) {
									local536 = 16776960;
									local540 = (Static113.anInt2465 + Static113.anInt2466 + Static113.anInt2463) / 1024;
									if (local540 > 65536) {
										local536 = 16711680;
									}
									Static195.aClass1_Sub3_Sub5_3.method3494("Card:" + local540 + "k", local289, local305, local536, -1);
									local305 += 15;
								}
								local540 = 0;
								local580 = 0;
								local569 = 0;
								for (local592 = 0; local592 < 29; local592++) {
									local540 += Static62.aClass13_Sub1Array1[local592].method2974();
									local569 += Static62.aClass13_Sub1Array1[local592].method2966();
									local580 += Static62.aClass13_Sub1Array1[local592].method2968();
								}
								local592 = local580 * 100 / local540;
								local598 = local569 * 10000 / local540;
								@Pc(993) String local993 = "Cache:" + Static22.method476(2, 0, true, (long) local598) + "% (" + local592 + "%)";
								Static160.aClass1_Sub3_Sub5_1.method3494(local993, local289, local305, 16776960, -1);
								local305 += 12;
								if (Static42.anInt1034 > 0) {
									Static160.aClass1_Sub3_Sub5_1.method3494("Particles: " + Static42.anInt1036 + " / " + Static42.anInt1034, local289, local305, 16776960, -1);
								}
								local305 += 12;
								Static29.aBooleanArray6[local101] = true;
								Static55.aBooleanArray15[local101] = true;
								continue;
							}
							if (local44.anInt6115 == 1406) {
								Static21.aClass191_3 = local44;
								Static296.anInt5899 = local138;
								Static192.anInt4222 = local132;
								continue;
							}
						}
						if (!Static128.aBoolean171) {
							if (local44.anInt6086 == 0 && local44.aBoolean401 && Static57.anInt6304 >= local185 && Static107.anInt1674 >= local187 && local269 > Static57.anInt6304 && Static107.anInt1674 < local267 && !Static303.aBoolean389) {
								anInt3973 = 1;
								Static112.aStringArray24[0] = aString266;
								Static144.anIntArray304[0] = Static263.anInt5294;
								Static190.aStringArray34[0] = "";
								Static86.aShortArray64[0] = 1003;
							}
							if (Static57.anInt6304 >= local185 && local187 <= Static107.anInt1674 && Static57.anInt6304 < local269 && local267 > Static107.anInt1674) {
								Static122.method2011(local44, Static57.anInt6304 - local132, Static107.anInt1674 - local138);
							}
						}
						if (local44.anInt6086 == 0) {
							if (!local44.aBoolean408 && Static35.method759(local44) && local44 != Static2.aClass191_2) {
								continue;
							}
							if (!local44.aBoolean408) {
								if (local44.anInt6106 > local44.anInt6151 - local44.anInt6128) {
									local44.anInt6106 = local44.anInt6151 - local44.anInt6128;
								}
								if (local44.anInt6106 < 0) {
									local44.anInt6106 = 0;
								}
							}
							if (Static294.aBoolean367 && local44.anInt6115 == 1407) {
								Static314.method4742(local132, local138, local44.anInt6088, local44.anInt6128);
							}
							method2925(local267, local138 - local44.anInt6106, local44.anInt6134, arg3, local101, local269, local187, local185, local132 - local44.anInt6163);
							if (local44.aClass191Array2 != null) {
								method2925(local267, local138 - local44.anInt6106, local44.anInt6134, local44.aClass191Array2, local101, local269, local187, local185, local132 - local44.anInt6163);
							}
							@Pc(1254) Class1_Sub12 local1254 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local44.anInt6134);
							if (local1254 != null) {
								if (local1254.anInt2207 == 0 && !Static128.aBoolean171 && local185 <= Static57.anInt6304 && Static107.anInt1674 >= local187 && local269 > Static57.anInt6304 && Static107.anInt1674 < local267 && !Static303.aBoolean389) {
									Static112.aStringArray24[0] = aString266;
									Static86.aShortArray64[0] = 1003;
									anInt3973 = 1;
									Static190.aStringArray34[0] = "";
									Static144.anIntArray304[0] = Static263.anInt5294;
								}
								Static251.method4180(local269, local101, local185, local187, local138, local267, local132, local1254.anInt2208);
							}
							if (Static294.aBoolean367 && local44.anInt6115 == 1407) {
								Static314.method4741();
								Static182.aBoolean252 = true;
							}
							if (Static294.aBoolean367) {
								Static156.method2546(arg7, arg6, arg5, arg0);
							} else {
								Static231.method3634(arg7, arg6, arg5, arg0);
								Static237.method3736();
							}
						}
						if (Static207.aBooleanArray22[local101] || Static206.anInt4453 > 1) {
							if (local44.anInt6086 == 0 && !local44.aBoolean408 && local44.anInt6128 < local44.anInt6151) {
								Static106.method1769(local44.anInt6106, local44.anInt6088 + local132, local44.anInt6128, local138, local44.anInt6151);
							}
							if (local44.anInt6086 != 1) {
								if (local44.anInt6086 == 2) {
									local289 = 0;
									for (local305 = 0; local305 < local44.anInt6102; local305++) {
										for (local475 = 0; local475 < local44.anInt6150; local475++) {
											local525 = local132 + local475 * (local44.anInt6135 + 32);
											local536 = local138 + local305 * (local44.anInt6148 + 32);
											if (local289 < 20) {
												local525 += local44.anIntArray548[local289];
												local536 += local44.anIntArray545[local289];
											}
											if (local44.anIntArray561[local289] > 0) {
												local580 = local44.anIntArray561[local289] - 1;
												if (local525 + 32 > arg7 && local525 < arg5 && local536 + 32 > arg6 && local536 < arg0 || Static75.aClass191_4 == local44 && local289 == Static200.anInt4363) {
													@Pc(1522) Class1_Sub3_Sub13 local1522;
													if (Static24.anInt662 == 1 && local289 == Static174.anInt5576 && Static289.anInt5818 == local44.anInt6134) {
														local1522 = Static195.method3123(local580, local44.anIntArray553[local289], 0, local44.aBoolean405, null, 2);
													} else {
														local1522 = Static195.method3123(local580, local44.anIntArray553[local289], 3153952, local44.aBoolean405, null, 1);
													}
													if (Static237.aBoolean308) {
														Static29.aBooleanArray6[local101] = true;
													}
													if (local1522 == null) {
														Static40.method817(local44);
													} else if (local44 == Static75.aClass191_4 && Static200.anInt4363 == local289) {
														local569 = Static289.anInt5816 - Static234.anInt4914;
														local540 = Static89.anInt5974 - Static149.anInt3345;
														if (local540 < 5 && local540 > -5) {
															local540 = 0;
														}
														if (local569 < 5 && local569 > -5) {
															local569 = 0;
														}
														if (Static183.anInt4047 < 5) {
															local540 = 0;
															local569 = 0;
														}
														local1522.method4207(local525 + local540, local569 + local536, 128);
														if (arg2 != -1) {
															@Pc(1643) Class191 local1643 = arg3[arg2 & 0xFFFF];
															@Pc(1647) int local1647;
															@Pc(1649) int local1649;
															if (Static294.aBoolean367) {
																local1649 = Static156.anInt3502;
																local1647 = Static156.anInt3501;
															} else {
																local1647 = Static231.anInt4852;
																local1649 = Static231.anInt4853;
															}
															@Pc(1674) int local1674;
															if (local536 + local569 < local1647 && local1643.anInt6106 > 0) {
																local1674 = Static286.anInt5740 * (local1647 - local536 - local569) / 3;
																if (local1674 > Static286.anInt5740 * 10) {
																	local1674 = Static286.anInt5740 * 10;
																}
																if (local1643.anInt6106 < local1674) {
																	local1674 = local1643.anInt6106;
																}
																local1643.anInt6106 -= local1674;
																Static234.anInt4914 += local1674;
																Static40.method817(local1643);
															}
															if (local569 + local536 + 32 > local1649 && local1643.anInt6106 < local1643.anInt6151 - local1643.anInt6128) {
																local1674 = Static286.anInt5740 * (local569 + local536 + 32 - local1649) / 3;
																if (Static286.anInt5740 * 10 < local1674) {
																	local1674 = Static286.anInt5740 * 10;
																}
																if (local1674 > local1643.anInt6151 - local1643.anInt6128 - local1643.anInt6106) {
																	local1674 = local1643.anInt6151 - local1643.anInt6106 - local1643.anInt6128;
																}
																local1643.anInt6106 += local1674;
																Static234.anInt4914 -= local1674;
																Static40.method817(local1643);
															}
														}
													} else if (local44 == Static270.aClass191_15 && Static215.anInt4656 == local289) {
														local1522.method4207(local525, local536, 128);
													} else {
														local1522.method4204(local525, local536);
													}
												}
											} else if (local44.anIntArray558 != null && local289 < 20) {
												@Pc(1799) Class1_Sub3_Sub13 local1799 = local44.method4672(local289);
												if (local1799 != null) {
													local1799.method4204(local525, local536);
												} else if (Static145.aBoolean391) {
													Static40.method817(local44);
												}
											}
											local289++;
										}
									}
								} else if (local44.anInt6086 == 3) {
									if (Static125.method2042(local44)) {
										local289 = local44.anInt6146;
										if (Static2.aClass191_2 == local44 && local44.anInt6172 != 0) {
											local289 = local44.anInt6172;
										}
									} else {
										local289 = local44.anInt6083;
										if (Static2.aClass191_2 == local44 && local44.anInt6170 != 0) {
											local289 = local44.anInt6170;
										}
									}
									if (local141 == 0) {
										if (local44.aBoolean392) {
											if (Static294.aBoolean367) {
												Static156.method2537(local132, local138, local44.anInt6088, local44.anInt6128, local289);
											} else {
												Static231.method3630(local132, local138, local44.anInt6088, local44.anInt6128, local289);
											}
										} else if (Static294.aBoolean367) {
											Static156.method2540(local132, local138, local44.anInt6088, local44.anInt6128, local289);
										} else {
											Static231.method3626(local132, local138, local44.anInt6088, local44.anInt6128, local289);
										}
									} else if (local44.aBoolean392) {
										if (Static294.aBoolean367) {
											Static156.method2547(local132, local138, local44.anInt6088, local44.anInt6128, local289, 256 - (local141 & 0xFF));
										} else {
											Static231.method3650(local132, local138, local44.anInt6088, local44.anInt6128, local289, 256 - (local141 & 0xFF));
										}
									} else if (Static294.aBoolean367) {
										Static156.method2544(local132, local138, local44.anInt6088, local44.anInt6128, local289, 256 - (local141 & 0xFF));
									} else {
										Static231.method3623(local132, local138, local44.anInt6088, local44.anInt6128, local289, 256 - (local141 & 0xFF));
									}
								} else {
									@Pc(1998) Class1_Sub3_Sub5 local1998;
									if (local44.anInt6086 == 4) {
										local1998 = local44.method4675(Static225.aClass46Array5);
										if (local1998 != null) {
											@Pc(2012) String local2012 = local44.aString436;
											if (Static125.method2042(local44)) {
												local305 = local44.anInt6146;
												if (local44 == Static2.aClass191_2 && local44.anInt6172 != 0) {
													local305 = local44.anInt6172;
												}
												if (local44.aString439.length() > 0) {
													local2012 = local44.aString439;
												}
											} else {
												local305 = local44.anInt6083;
												if (local44 == Static2.aClass191_2 && local44.anInt6170 != 0) {
													local305 = local44.anInt6170;
												}
											}
											if (local44.aBoolean408 && local44.anInt6167 != -1) {
												@Pc(2070) Class57 local2070 = Static56.method1050(local44.anInt6167);
												local2012 = local2070.aString102;
												if (local2012 == null) {
													local2012 = "null";
												}
												if ((local2070.anInt1824 == 1 || local44.anInt6139 != 1) && local44.anInt6139 != -1) {
													local2012 = "<col=ff9040>" + local2012 + "</col> x" + Static226.method3588(local44.anInt6139);
												}
											}
											if (Static290.aClass191_16 == local44) {
												local2012 = Static7.aString18;
												local305 = local44.anInt6083;
											}
											if (!local44.aBoolean408) {
												local2012 = Static279.method4261(local2012, local44);
											}
											local1998.method3512(local2012, local132, local138, local44.anInt6088, local44.anInt6128, local305, local44.aBoolean404 ? 0 : -1, local44.anInt6108, local44.anInt6153, local44.anInt6110);
										} else if (Static145.aBoolean391) {
											Static40.method817(local44);
										}
									} else if (local44.anInt6086 == 5) {
										@Pc(2164) Class1_Sub3_Sub13 local2164;
										if (!local44.aBoolean408) {
											local2164 = local44.method4674(Static125.method2042(local44));
											if (local2164 != null) {
												local2164.method4204(local132, local138);
											} else if (Static145.aBoolean391) {
												Static40.method817(local44);
											}
										} else if (local44.anInt6099 >= 0) {
											@Pc(2188) Class139 local2188 = local44.method4676();
											if (Static294.aBoolean367) {
												local2188.method3548(0, local132, local138, local44.anInt6088, local44.anInt6128, local44.anInt6090, local44.anInt6101, 0);
											} else {
												local2188.method3544(0, local132, local138, local44.anInt6088, local44.anInt6128, local44.anInt6090, local44.anInt6101);
											}
										} else {
											if (local44.anInt6167 == -1) {
												local2164 = local44.method4674(false);
											} else if (local44.aBoolean407 && Static56.aClass2_Sub4_Sub2_1.aClass167_1 != null) {
												local2164 = Static195.method3123(local44.anInt6167, local44.anInt6139, local44.anInt6109, local44.aBoolean405, Static56.aClass2_Sub4_Sub2_1.aClass167_1, local44.anInt6162);
											} else {
												local2164 = Static195.method3123(local44.anInt6167, local44.anInt6139, local44.anInt6109, local44.aBoolean405, null, local44.anInt6162);
											}
											if (local2164 != null) {
												local305 = local2164.anInt5572;
												local475 = local2164.anInt5575;
												if (local44.aBoolean398) {
													local525 = (local305 + local44.anInt6088 - 1) / local305;
													local536 = (local475 + local44.anInt6128 - 1) / local475;
													if (Static294.aBoolean367) {
														Static156.method2534(local132, local138, local44.anInt6088 + local132, local138 + local44.anInt6128);
														@Pc(2330) boolean local2330 = Static213.method3403(local2164.anInt5571);
														@Pc(2335) boolean local2335 = Static213.method3403(local2164.anInt5573);
														@Pc(2338) Class1_Sub3_Sub13_Sub1 local2338 = (Class1_Sub3_Sub13_Sub1) local2164;
														if (local2330 && local2335) {
															if (local141 == 0) {
																local2338.method2665(local132, local138, local525, local536);
															} else {
																local2338.method2666(local132, local138, 256 - (local141 & 0xFF), local525, local536);
															}
														} else if (local2330) {
															for (local592 = 0; local592 < local536; local592++) {
																if (local141 == 0) {
																	local2338.method2665(local132, local475 * local592 + local138, local525, 1);
																} else {
																	local2338.method2666(local132, local138 + local592 * local475, -(local141 & 0xFF) + 256, local525, 1);
																}
															}
														} else if (local2335) {
															for (local592 = 0; local592 < local525; local592++) {
																if (local141 == 0) {
																	local2338.method2665(local305 * local592 + local132, local138, 1, local536);
																} else {
																	local2338.method2666(local592 * local305 + local132, local138, 256 - (local141 & 0xFF), 1, local536);
																}
															}
														} else {
															for (local592 = 0; local592 < local525; local592++) {
																for (local598 = 0; local598 < local536; local598++) {
																	if (local141 == 0) {
																		local2164.method4204(local132 + local592 * local305, local138 - -(local475 * local598));
																	} else {
																		local2164.method4207(local305 * local592 + local132, local138 - -(local598 * local475), 256 - (local141 & 0xFF));
																	}
																}
															}
														}
														Static156.method2546(arg7, arg6, arg5, arg0);
													} else {
														Static231.method3629(local132, local138, local44.anInt6088 + local132, local138 + local44.anInt6128);
														for (local540 = 0; local540 < local525; local540++) {
															for (local569 = 0; local569 < local536; local569++) {
																if (local44.anInt6107 != 0) {
																	local2164.method4213(local138 + local569 * local475 + local475 / 2, local44.anInt6107, local305 / 2 + local132 + local305 * local540, 4096);
																} else if (local141 == 0) {
																	local2164.method4204(local132 + local540 * local305, local138 - -(local569 * local475));
																} else {
																	local2164.method4207(local540 * local305 + local132, local138 - -(local475 * local569), 256 - (local141 & 0xFF));
																}
															}
														}
														Static231.method3634(arg7, arg6, arg5, arg0);
													}
												} else {
													local525 = local44.anInt6088 * 4096 / local305;
													if (local44.anInt6107 != 0) {
														local2164.method4213(local138 + local44.anInt6128 / 2, local44.anInt6107, local132 + local44.anInt6088 / 2, local525);
													} else if (local141 != 0) {
														local2164.method4209(local132, local138, local44.anInt6088, local44.anInt6128, 256 - (local141 & 0xFF));
													} else if (local305 == local44.anInt6088 && local44.anInt6128 == local475) {
														local2164.method4204(local132, local138);
													} else {
														local2164.method4205(local132, local138, local44.anInt6088, local44.anInt6128);
													}
												}
											} else if (Static145.aBoolean391) {
												Static40.method817(local44);
											}
										}
									} else {
										@Pc(2876) Class57 local2876;
										if (local44.anInt6086 == 6) {
											@Pc(2712) boolean local2712 = Static125.method2042(local44);
											if (local2712) {
												local305 = local44.anInt6098;
											} else {
												local305 = local44.anInt6080;
											}
											local525 = 0;
											@Pc(2726) Class2_Sub1 local2726 = null;
											if (local44.anInt6167 != -1) {
												local2876 = Static56.method1050(local44.anInt6167);
												if (local2876 != null) {
													local2876 = local2876.method1336(local44.anInt6139);
													@Pc(2894) Class32 local2894 = local305 == -1 ? null : Static202.method3231(local305);
													if (local44.aBoolean407 && Static56.aClass2_Sub4_Sub2_1.aClass167_1 != null) {
														local2726 = local2876.method1334(local44.anInt6116, local44.anInt6104, 1, Static56.aClass2_Sub4_Sub2_1.aClass167_1, local2894, local44.anInt6103);
													} else {
														local2726 = local2876.method1334(local44.anInt6116, local44.anInt6104, 1, null, local2894, local44.anInt6103);
													}
													if (local2726 == null) {
														Static40.method817(local44);
													} else {
														local525 = -local2726.method3948() / 2;
													}
												}
											} else if (local44.anInt6149 == 5) {
												if (local44.anInt6171 == -1) {
													local2726 = Static280.aClass167_2.method4027(null, 0, null, -1, -1, true, -1, -1, false, 0, null);
												} else {
													local536 = local44.anInt6171;
													@Pc(2766) Class2_Sub4_Sub2 local2766;
													if (Static62.anInt1348 == local536) {
														local2766 = Static56.aClass2_Sub4_Sub2_1;
													} else {
														local2766 = Static155.aClass2_Sub4_Sub2Array1[local536];
													}
													@Pc(2780) Class32 local2780 = local305 == -1 ? null : Static202.method3231(local305);
													if (local2766 != null && (local536 == 2047 || Static104.method1735(local2766.aString182) == local44.anInt6160)) {
														local2726 = local2766.aClass167_1.method4027(null, 0, local2780, -1, local44.anInt6104, true, -1, 0, false, 0, null);
													}
												}
											} else if (local305 == -1) {
												local2726 = local44.method4669(-1, Static56.aClass2_Sub4_Sub2_1.aClass167_1, -1, 0, local2712, null);
												if (local2726 == null && Static145.aBoolean391) {
													Static40.method817(local44);
												}
											} else {
												@Pc(2825) Class32 local2825 = Static202.method3231(local305);
												local2726 = local44.method4669(local44.anInt6104, Static56.aClass2_Sub4_Sub2_1.aClass167_1, local44.anInt6116, local44.anInt6103, local2712, local2825);
												if (local2726 == null && Static145.aBoolean391) {
													Static40.method817(local44);
												}
											}
											if (local2726 != null) {
												if (local44.anInt6084 > 0) {
													local536 = (local44.anInt6088 << 8) / local44.anInt6084;
												} else {
													local536 = 256;
												}
												local569 = (local44.anInt6147 * local536 >> 8) + local44.anInt6088 / 2 + local132;
												if (local44.anInt6111 <= 0) {
													local540 = 256;
												} else {
													local540 = (local44.anInt6128 << 8) / local44.anInt6111;
												}
												local580 = (local44.anInt6113 * local540 >> 8) + local44.anInt6128 / 2 + local138;
												if (Static294.aBoolean367) {
													if (local44.aBoolean393) {
														Static294.method4514(local569, local580, local44.anInt6173, local44.aShort83, local536, local540);
													} else {
														Static294.method4515(local569, local580, local536, local540);
														Static294.method4513((float) local44.aShort82, (float) local44.aShort83 * 1.5F);
													}
													Static294.method4500();
													Static294.method4491(true);
													Static294.method4499(false);
													Static194.method3117(Static166.anInt3743);
													if (Static182.aBoolean252) {
														Static156.method2538();
														Static294.method4521();
														Static156.method2546(arg7, arg6, arg5, arg0);
														Static182.aBoolean252 = false;
													}
													if (local44.aBoolean395) {
														Static294.method4492();
													}
													local598 = Class146.anIntArray463[local44.anInt6091] * local44.anInt6173 >> 16;
													local592 = Class146.anIntArray461[local44.anInt6091] * local44.anInt6173 >> 16;
													if (local44.aBoolean408) {
														local2726.method559(local44.anInt6118, local44.anInt6092, local44.anInt6091, local44.anInt6137, local44.anInt6138 + local525 + local592, local598 + local44.anInt6138, -1L);
													} else {
														local2726.method559(local44.anInt6118, 0, local44.anInt6091, 0, local592, local598, -1L);
													}
													if (local44.aBoolean395) {
														Static294.method4495();
													}
												} else {
													Static237.method3747(local569, local580);
													local592 = Class146.anIntArray461[local44.anInt6091] * local44.anInt6173 >> 16;
													local598 = Class146.anIntArray463[local44.anInt6091] * local44.anInt6173 >> 16;
													if (!local44.aBoolean408) {
														local2726.method559(local44.anInt6118, 0, local44.anInt6091, 0, local592, local598, -1L);
													} else if (local44.aBoolean393) {
														((Class2_Sub1_Sub2) local2726).method591(local44.anInt6118, local44.anInt6092, local44.anInt6091, local44.anInt6137, local592 + local525 + local44.anInt6138, local44.anInt6138 + local598, local44.anInt6173);
													} else {
														local2726.method559(local44.anInt6118, local44.anInt6092, local44.anInt6091, local44.anInt6137, local525 + local592 + local44.anInt6138, local44.anInt6138 + local598, -1L);
													}
													Static237.method3749();
												}
											}
										} else {
											if (local44.anInt6086 == 7) {
												local1998 = local44.method4675(Static225.aClass46Array5);
												if (local1998 == null) {
													if (Static145.aBoolean391) {
														Static40.method817(local44);
													}
													continue;
												}
												local305 = 0;
												for (local475 = 0; local475 < local44.anInt6102; local475++) {
													for (local525 = 0; local525 < local44.anInt6150; local525++) {
														if (local44.anIntArray561[local305] > 0) {
															local2876 = Static56.method1050(local44.anIntArray561[local305] - 1);
															@Pc(3307) String local3307;
															if (local2876.anInt1824 != 1 && local44.anIntArray553[local305] == 1) {
																local3307 = "<col=ff9040>" + local2876.aString102 + "</col>";
															} else {
																local3307 = "<col=ff9040>" + local2876.aString102 + "</col> x" + Static226.method3588(local44.anIntArray553[local305]);
															}
															local569 = (local44.anInt6135 + 115) * local525 + local132;
															local580 = local138 + local475 * (local44.anInt6148 + 12);
															if (local44.anInt6108 == 0) {
																local1998.method3503(local3307, local569, local580, local44.anInt6083, local44.aBoolean404 ? 0 : -1);
															} else if (local44.anInt6108 == 1) {
																local1998.method3499(local3307, local569 + 57, local580, local44.anInt6083, local44.aBoolean404 ? 0 : -1);
															} else {
																local1998.method3494(local3307, local569 + 115 - 1, local580, local44.anInt6083, local44.aBoolean404 ? 0 : -1);
															}
														}
														local305++;
													}
												}
											}
											if (local44.anInt6086 == 8 && local44 == Static129.aClass191_8 && Static129.anInt2751 == Static193.anInt4248) {
												local289 = 0;
												local305 = 0;
												@Pc(3422) Class1_Sub3_Sub5 local3422 = Static195.aClass1_Sub3_Sub5_3;
												@Pc(3425) String local3425 = local44.aString436;
												local3425 = Static279.method4261(local3425, local44);
												@Pc(3446) String local3446;
												while (local3425.length() > 0) {
													local540 = local3425.indexOf("<br>");
													if (local540 == -1) {
														local3446 = local3425;
														local3425 = "";
													} else {
														local3446 = local3425.substring(0, local540);
														local3425 = local3425.substring(local540 + 4);
													}
													local569 = local3422.method3510(local3446);
													if (local569 > local289) {
														local289 = local569;
													}
													local305 += local3422.anInt4730 + 1;
												}
												local289 += 6;
												local305 += 7;
												local540 = local132 + local44.anInt6088 - local289 - 5;
												local569 = local44.anInt6128 + local138 + 5;
												if (local132 + 5 > local540) {
													local540 = local132 + 5;
												}
												if (arg5 < local289 + local540) {
													local540 = arg5 - local289;
												}
												if (arg0 < local569 + local305) {
													local569 = arg0 - local305;
												}
												if (Static294.aBoolean367) {
													Static156.method2537(local540, local569, local289, local305, 16777120);
													Static156.method2540(local540, local569, local289, local305, 0);
												} else {
													Static231.method3630(local540, local569, local289, local305, 16777120);
													Static231.method3626(local540, local569, local289, local305, 0);
												}
												local3425 = local44.aString436;
												local580 = local3422.anInt4730 + local569 + 2;
												local3425 = Static279.method4261(local3425, local44);
												while (local3425.length() > 0) {
													local592 = local3425.indexOf("<br>");
													if (local592 == -1) {
														local3446 = local3425;
														local3425 = "";
													} else {
														local3446 = local3425.substring(0, local592);
														local3425 = local3425.substring(local592 + 4);
													}
													local3422.method3503(local3446, local540 + 3, local580, 0, -1);
													local580 += local3422.anInt4730 + 1;
												}
											}
											if (local44.anInt6086 == 9) {
												if (local44.aBoolean397) {
													local525 = local138;
													local475 = local44.anInt6088 + local132;
													local305 = local44.anInt6128 + local138;
												} else {
													local525 = local138 + local44.anInt6128;
													local305 = local138;
													local475 = local132 + local44.anInt6088;
												}
												if (local44.anInt6154 == 1) {
													if (Static294.aBoolean367) {
														Static156.method2533(local132, local305, local475, local525, local44.anInt6083);
													} else {
														Static231.method3642(local132, local305, local475, local525, local44.anInt6083);
													}
												} else if (Static294.aBoolean367) {
													Static156.method2530(local132, local305, local475, local525, local44.anInt6083, local44.anInt6154);
												} else {
													Static231.method3648(local132, local305, local475, local525, local44.anInt6083, local44.anInt6154);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZBZIZ)Lclient!th;")
	public static Class168 method2931(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class83 local10 = null;
		if (Static6.aClass193_1 != null) {
			local10 = new Class83(arg2, Static6.aClass193_1, Static255.aClass193Array1[arg2], 1000000);
		}
		Static62.aClass13_Sub1Array1[arg2] = Static311.aClass51_1.method1176(arg2, local10, Static124.aClass83_2);
		if (arg1) {
			Static62.aClass13_Sub1Array1[arg2].method2977();
		}
		return new Class168(Static62.aClass13_Sub1Array1[arg2], arg3, arg0);
	}
}
