import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
	public static int anInt2507;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
	public static int anInt2499 = 0;

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "[I")
	public static int[] anIntArray214 = new int[32768];

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString87 = null;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ[Lclient!lg;IIIIII)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class97[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static251.aBoolean330) {
			Static87.method1457(arg8, arg5, arg0, arg7);
		} else {
			Static258.method4029(arg8, arg5, arg0, arg7);
			Static283.method4415();
		}
		for (@Pc(26) int local26 = 0; local26 < arg2.length; local26++) {
			@Pc(38) Class97 local38 = arg2[local26];
			if (local38 != null && (arg3 == local38.anInt3165 || arg3 == -1412584499 && local38 == Static186.aClass97_17)) {
				@Pc(89) int local89;
				if (arg6 == -1) {
					Static226.anIntArray370[Static65.anInt5697] = arg1 + local38.anInt3160;
					Static242.anIntArray380[Static65.anInt5697] = local38.anInt3152 + arg4;
					Static184.anIntArray305[Static65.anInt5697] = local38.anInt3201;
					Static184.anIntArray304[Static65.anInt5697] = local38.anInt3190;
					local89 = Static65.anInt5697++;
				} else {
					local89 = arg6;
				}
				local38.anInt3179 = Static50.anInt1118;
				local38.anInt3126 = local89;
				if (!local38.aBoolean192 || !Static41.method790(local38)) {
					if (local38.anInt3123 > 0) {
						Static73.method1227(local38);
					}
					@Pc(121) int local121 = arg1 + local38.anInt3160;
					@Pc(126) int local126 = arg4 + local38.anInt3152;
					@Pc(129) int local129 = local38.anInt3170;
					if (Static14.aBoolean26 && (Static41.method791(local38).anInt3271 != 0 || local38.anInt3177 == 0) && local129 > 127) {
						local129 = 127;
					}
					@Pc(170) int local170;
					@Pc(168) int local168;
					if (Static186.aClass97_17 == local38) {
						if (arg3 != -1412584499 && !local38.aBoolean195) {
							Static256.anInt5021 = arg1;
							Static160.anInt3284 = arg4;
							Static183.aClass97Array2 = arg2;
							continue;
						}
						if (Static173.aBoolean229 && Static274.aBoolean366) {
							local168 = Static178.anInt3603;
							local170 = Static79.anInt1661;
							local168 -= Static257.anInt5060;
							local170 -= Static85.anInt1726;
							if (local170 < Static190.anInt3864) {
								local170 = Static190.anInt3864;
							}
							if (local38.anInt3201 + local170 > Static190.anInt3864 - -Static48.aClass97_7.anInt3201) {
								local170 = Static48.aClass97_7.anInt3201 + Static190.anInt3864 - local38.anInt3201;
							}
							if (Static264.anInt5206 > local168) {
								local168 = Static264.anInt5206;
							}
							local121 = local170;
							if (Static264.anInt5206 + Static48.aClass97_7.anInt3190 < local168 - -local38.anInt3190) {
								local168 = Static48.aClass97_7.anInt3190 + Static264.anInt5206 - local38.anInt3190;
							}
							local126 = local168;
						}
						if (!local38.aBoolean195) {
							local129 = 128;
						}
					}
					@Pc(290) int local290;
					@Pc(297) int local297;
					@Pc(276) int local276;
					@Pc(257) int local257;
					if (local38.anInt3177 == 2) {
						local170 = arg8;
						local168 = arg5;
						local297 = arg7;
						local290 = arg0;
					} else {
						local257 = local126 + local38.anInt3190;
						local170 = local121 > arg8 ? local121 : arg8;
						local168 = local126 > arg5 ? local126 : arg5;
						local276 = local38.anInt3201 + local121;
						if (local38.anInt3177 == 9) {
							local276++;
							local257++;
						}
						local290 = arg0 <= local276 ? arg0 : local276;
						local297 = local257 >= arg7 ? arg7 : local257;
					}
					if (!local38.aBoolean192 || local170 < local290 && local297 > local168) {
						@Pc(499) int local499;
						@Pc(511) int local511;
						@Pc(541) int local541;
						@Pc(558) int local558;
						@Pc(575) int local575;
						@Pc(495) int local495;
						@Pc(458) int local458;
						@Pc(530) int local530;
						if (local38.anInt3123 != 0) {
							if (local38.anInt3123 == 1337 || local38.anInt3123 == 1403) {
								Static171.anInt3430 = local121;
								Static304.aClass97_23 = local38;
								Static278.anInt5387 = local126;
								Static150.method2370(local126, local38.anInt3190, local121, local38.anInt3201, local38.anInt3123 == 1403);
								Static48.aBooleanArray14[local89] = true;
								if (Static251.aBoolean330) {
									Static87.method1457(arg8, arg5, arg0, arg7);
								} else {
									Static258.method4029(arg8, arg5, arg0, arg7);
								}
								continue;
							}
							if (local38.anInt3123 == 1338) {
								if (!local38.method2519()) {
									continue;
								}
								method2039(local126, local121, local89, local38);
								if (Static251.aBoolean330) {
									Static87.method1457(arg8, arg5, arg0, arg7);
								} else {
									Static258.method4029(arg8, arg5, arg0, arg7);
								}
								if (Static169.anInt3385 != 0 && Static169.anInt3385 != 3 || Static137.aBoolean176 || Static167.anInt3358 < local170 || Static73.anInt1479 < local168 || local290 <= Static167.anInt3358 || local297 <= Static73.anInt1479) {
									continue;
								}
								local276 = Static167.anInt3358 - local121;
								local257 = Static73.anInt1479 - local126;
								local458 = local38.anIntArray257[local257];
								if (local276 < local458 || local458 + local38.anIntArray259[local257] < local276) {
									continue;
								}
								local276 -= local38.anInt3201 / 2;
								local257 -= local38.anInt3190 / 2;
								local495 = (int) Static126.aFloat73 + Static234.anInt4655 & 0x7FF;
								local499 = Class174.anIntArray444[local495];
								local499 = (Static161.anInt3301 + 256) * local499 >> 8;
								local511 = Class174.anIntArray443[local495];
								local511 = local511 * (Static161.anInt3301 + 256) >> 8;
								local530 = local257 * local511 - local499 * local276 >> 11;
								local541 = local257 * local499 + local511 * local276 >> 11;
								local558 = Static72.aClass13_Sub5_Sub1_1.anInt5334 + local541 - (Static72.aClass13_Sub5_Sub1_1.method4219() - 1) * 64 >> 7;
								local575 = Static72.aClass13_Sub5_Sub1_1.anInt5294 + 64 - local530 - Static72.aClass13_Sub5_Sub1_1.method4219() * 64 >> 7;
								if (Static145.aBoolean386 && (Static282.anInt5536 & 0x40) != 0) {
									@Pc(587) Class97 local587 = Static77.method1320(Static109.anInt2178, Static144.anInt2858);
									if (local587 == null) {
										Static229.method3599();
									} else {
										Static140.method2241((short) 26, " ->", Static201.aString139, Static43.anInt871, 1L, local575, local558);
									}
									continue;
								}
								if (Static122.anInt2465 == 1) {
									Static140.method2241((short) 28, "", Static278.aString179, -1, 1L, local575, local558);
								}
								Static140.method2241((short) 15, "", Static265.aString174, -1, 1L, local575, local558);
								continue;
							}
							if (local38.anInt3123 == 1339) {
								if (local38.method2519()) {
									Static8.method121(local126, local89, local121, local38);
									if (Static251.aBoolean330) {
										Static87.method1457(arg8, arg5, arg0, arg7);
									} else {
										Static258.method4029(arg8, arg5, arg0, arg7);
									}
								}
								continue;
							}
							if (local38.anInt3123 == 1400) {
								Static99.method1633(local38.anInt3190, local38.anInt3201, local121, local126);
								Static48.aBooleanArray14[local89] = true;
								Static22.aBooleanArray8[local89] = true;
								if (Static251.aBoolean330) {
									Static87.method1457(arg8, arg5, arg0, arg7);
								} else {
									Static258.method4029(arg8, arg5, arg0, arg7);
								}
								continue;
							}
							if (local38.anInt3123 == 1401) {
								Static37.method1933(local126, local38.anInt3190, local38.anInt3201, local121);
								Static48.aBooleanArray14[local89] = true;
								Static22.aBooleanArray8[local89] = true;
								if (Static251.aBoolean330) {
									Static87.method1457(arg8, arg5, arg0, arg7);
								} else {
									Static258.method4029(arg8, arg5, arg0, arg7);
								}
								continue;
							}
							if (local38.anInt3123 == 1402) {
								if (!Static251.aBoolean330) {
									Static141.method2263(local121, local126);
									Static48.aBooleanArray14[local89] = true;
									Static22.aBooleanArray8[local89] = true;
								}
								continue;
							}
							if (local38.anInt3123 == 1405) {
								if (!Static262.aBoolean344) {
									continue;
								}
								local276 = local121 + local38.anInt3201;
								local257 = local126 + 15;
								Static156.aClass4_Sub2_Sub9_4.method4104("Fps:" + Static278.anInt5386, local276, local257, 16776960, -1);
								local257 += 15;
								local499 = 16776960;
								@Pc(798) Runtime local798 = Runtime.getRuntime();
								local495 = (int) ((local798.totalMemory() - local798.freeMemory()) / 1024L);
								if (local495 > 65536) {
									local499 = 16711680;
								}
								Static156.aClass4_Sub2_Sub9_4.method4104("Mem:" + local495 + "k", local276, local257, local499, -1);
								local257 += 15;
								if (Static251.aBoolean330) {
									local499 = 16776960;
									local511 = (Static239.anInt4728 + Static239.anInt4725 + Static239.anInt4727) / 1024;
									if (local511 > 65536) {
										local499 = 16711680;
									}
									Static156.aClass4_Sub2_Sub9_4.method4104("Card:" + local511 + "k", local276, local257, local499, -1);
									local257 += 15;
								}
								local511 = 0;
								local541 = 0;
								local530 = 0;
								for (local558 = 0; local558 < 29; local558++) {
									local511 += Static45.aClass39_Sub1Array1[local558].method1139();
									local541 += Static45.aClass39_Sub1Array1[local558].method1146();
									local530 += Static45.aClass39_Sub1Array1[local558].method1148();
								}
								local558 = local530 * 100 / local511;
								local575 = local541 * 10000 / local511;
								@Pc(939) String local939 = "Cache:" + Static224.method3524(2, 0, (long) local575, true) + "% (" + local558 + "%)";
								Static131.aClass4_Sub2_Sub9_2.method4104(local939, local276, local257, 16776960, -1);
								local257 += 12;
								if (Static117.anInt2422 > 0) {
									Static131.aClass4_Sub2_Sub9_2.method4104("Particles: " + Static117.anInt2418 + " / " + Static117.anInt2422, local276, local257, 16776960, -1);
								}
								local257 += 12;
								Static48.aBooleanArray14[local89] = true;
								Static22.aBooleanArray8[local89] = true;
								continue;
							}
							if (local38.anInt3123 == 1406) {
								Static42.anInt863 = local126;
								Static4.anInt70 = local121;
								Static279.aClass97_21 = local38;
								continue;
							}
						}
						if (!Static137.aBoolean176) {
							if (local38.anInt3177 == 0 && local38.aBoolean199 && Static167.anInt3358 >= local170 && Static73.anInt1479 >= local168 && Static167.anInt3358 < local290 && Static73.anInt1479 < local297 && !Static14.aBoolean26) {
								Static102.anIntArray167[0] = Static60.anInt1341;
								Static256.aShortArray81[0] = 1004;
								Static52.aStringArray6[0] = Static29.aString25;
								Static286.anInt5602 = 1;
								Static156.aStringArray21[0] = "";
							}
							if (local170 <= Static167.anInt3358 && local168 <= Static73.anInt1479 && local290 > Static167.anInt3358 && Static73.anInt1479 < local297) {
								Static125.method2043(local38, Static167.anInt3358 - local121, -local126 + Static73.anInt1479);
							}
						}
						if (local38.anInt3177 == 0) {
							if (!local38.aBoolean192 && Static41.method790(local38) && Static218.aClass97_19 != local38) {
								continue;
							}
							if (!local38.aBoolean192) {
								if (local38.anInt3180 - local38.anInt3190 < local38.anInt3199) {
									local38.anInt3199 = local38.anInt3180 - local38.anInt3190;
								}
								if (local38.anInt3199 < 0) {
									local38.anInt3199 = 0;
								}
							}
							if (Static251.aBoolean330 && local38.anInt3123 == 1407) {
								Static281.method4366(local121, local126, local38.anInt3201, local38.anInt3190);
							}
							method2032(local290, local121 - local38.anInt3169, arg2, local38.anInt3162, local126 - local38.anInt3199, local168, local89, local297, local170);
							if (local38.aClass97Array1 != null) {
								method2032(local290, local121 - local38.anInt3169, local38.aClass97Array1, local38.anInt3162, local126 - local38.anInt3199, local168, local89, local297, local170);
							}
							@Pc(1189) Class4_Sub30 local1189 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local38.anInt3162);
							if (local1189 != null) {
								if (local1189.anInt5201 == 0 && !Static137.aBoolean176 && Static167.anInt3358 >= local170 && local168 <= Static73.anInt1479 && local290 > Static167.anInt3358 && Static73.anInt1479 < local297 && !Static14.aBoolean26) {
									Static52.aStringArray6[0] = Static29.aString25;
									Static102.anIntArray167[0] = Static60.anInt1341;
									Static286.anInt5602 = 1;
									Static256.aShortArray81[0] = 1004;
									Static156.aStringArray21[0] = "";
								}
								Static207.method1814(local168, local290, local89, local126, local170, local121, local297, local1189.anInt5208);
							}
							if (Static251.aBoolean330 && local38.anInt3123 == 1407) {
								Static281.method4372();
							}
							if (Static251.aBoolean330) {
								Static87.method1457(arg8, arg5, arg0, arg7);
							} else {
								Static258.method4029(arg8, arg5, arg0, arg7);
								Static283.method4415();
							}
						}
						if (Static7.aBooleanArray1[local89] || Static20.anInt2891 > 1) {
							if (local38.anInt3177 == 0 && !local38.aBoolean192 && local38.anInt3180 > local38.anInt3190) {
								Static159.method2569(local38.anInt3190, local126, local121 + local38.anInt3201, local38.anInt3199, local38.anInt3180);
							}
							if (local38.anInt3177 != 1) {
								if (local38.anInt3177 == 2) {
									local276 = 0;
									for (local257 = 0; local257 < local38.anInt3151; local257++) {
										for (local458 = 0; local458 < local38.anInt3147; local458++) {
											local495 = local121 + (local38.anInt3112 + 32) * local458;
											local499 = (local38.anInt3206 + 32) * local257 + local126;
											if (local276 < 20) {
												local499 += local38.anIntArray262[local276];
												local495 += local38.anIntArray263[local276];
											}
											if (local38.anIntArray249[local276] > 0) {
												local530 = local38.anIntArray249[local276] - 1;
												if (arg8 < local495 + 32 && local495 < arg0 && arg5 < local499 + 32 && arg7 > local499 || local38 == Static97.aClass97_20 && Static28.anInt606 == local276) {
													@Pc(1464) Class4_Sub2_Sub4 local1464;
													if (Static116.anInt5523 == 1 && Static174.anInt3532 == local276 && Static2.anInt10 == local38.anInt3162) {
														local1464 = Static80.method1373(local38.aBoolean203, 2, local530, null, 0, local38.anIntArray256[local276]);
													} else {
														local1464 = Static80.method1373(local38.aBoolean203, 1, local530, null, 3153952, local38.anIntArray256[local276]);
													}
													if (Static283.aBoolean375) {
														Static48.aBooleanArray14[local89] = true;
													}
													if (local1464 == null) {
														Static178.method2927(local38);
													} else if (local38 == Static97.aClass97_20 && local276 == Static28.anInt606) {
														local541 = Static178.anInt3603 - Static195.anInt3933;
														if (local541 < 5 && local541 > -5) {
															local541 = 0;
														}
														local511 = Static79.anInt1661 - Static194.anInt3905;
														if (local511 < 5 && local511 > -5) {
															local511 = 0;
														}
														if (Static76.anInt1553 < 5) {
															local511 = 0;
															local541 = 0;
														}
														local1464.method4143(local495 + local511, local499 + local541, 128);
														if (arg3 != -1) {
															@Pc(1575) Class97 local1575 = arg2[arg3 & 0xFFFF];
															@Pc(1579) int local1579;
															@Pc(1581) int local1581;
															if (Static251.aBoolean330) {
																local1581 = Static87.anInt1758;
																local1579 = Static87.anInt1760;
															} else {
																local1579 = Static258.anInt5065;
																local1581 = Static258.anInt5068;
															}
															@Pc(1614) int local1614;
															if (local499 + local541 < local1579 && local1575.anInt3199 > 0) {
																local1614 = (local1579 - local499 - local541) * Static309.anInt1336 / 3;
																if (local1614 > Static309.anInt1336 * 10) {
																	local1614 = Static309.anInt1336 * 10;
																}
																if (local1575.anInt3199 < local1614) {
																	local1614 = local1575.anInt3199;
																}
																local1575.anInt3199 -= local1614;
																Static195.anInt3933 += local1614;
																Static178.method2927(local1575);
															}
															if (local499 + local541 + 32 > local1581 && local1575.anInt3180 - local1575.anInt3190 > local1575.anInt3199) {
																local1614 = Static309.anInt1336 * (local541 + local499 + 32 - local1581) / 3;
																if (Static309.anInt1336 * 10 < local1614) {
																	local1614 = Static309.anInt1336 * 10;
																}
																if (local1614 > local1575.anInt3180 - local1575.anInt3199 - local1575.anInt3190) {
																	local1614 = local1575.anInt3180 - local1575.anInt3190 - local1575.anInt3199;
																}
																local1575.anInt3199 += local1614;
																Static195.anInt3933 -= local1614;
																Static178.method2927(local1575);
															}
														}
													} else if (local38 == Static291.aClass97_22 && Static39.anInt742 == local276) {
														local1464.method4143(local495, local499, 128);
													} else {
														local1464.method4142(local495, local499);
													}
												}
											} else if (local38.anIntArray264 != null && local276 < 20) {
												@Pc(1748) Class4_Sub2_Sub4 local1748 = local38.method2522(local276);
												if (local1748 != null) {
													local1748.method4142(local495, local499);
												} else if (Static263.aBoolean346) {
													Static178.method2927(local38);
												}
											}
											local276++;
										}
									}
								} else if (local38.anInt3177 == 3) {
									if (Static182.method2941(local38)) {
										local276 = local38.anInt3166;
										if (local38 == Static218.aClass97_19 && local38.anInt3159 != 0) {
											local276 = local38.anInt3159;
										}
									} else {
										local276 = local38.anInt3187;
										if (local38 == Static218.aClass97_19 && local38.anInt3154 != 0) {
											local276 = local38.anInt3154;
										}
									}
									if (local129 == 0) {
										if (local38.aBoolean197) {
											if (Static251.aBoolean330) {
												Static87.method1464(local121, local126, local38.anInt3201, local38.anInt3190, local276);
											} else {
												Static258.method4031(local121, local126, local38.anInt3201, local38.anInt3190, local276);
											}
										} else if (Static251.aBoolean330) {
											Static87.method1452(local121, local126, local38.anInt3201, local38.anInt3190, local276);
										} else {
											Static258.method4025(local121, local126, local38.anInt3201, local38.anInt3190, local276);
										}
									} else if (local38.aBoolean197) {
										if (Static251.aBoolean330) {
											Static87.method1456(local121, local126, local38.anInt3201, local38.anInt3190, local276, 256 - (local129 & 0xFF));
										} else {
											Static258.method4026(local121, local126, local38.anInt3201, local38.anInt3190, local276, 256 - (local129 & 0xFF));
										}
									} else if (Static251.aBoolean330) {
										Static87.method1461(local121, local126, local38.anInt3201, local38.anInt3190, local276, 256 - (local129 & 0xFF));
									} else {
										Static258.method4011(local121, local126, local38.anInt3201, local38.anInt3190, local276, 256 - (local129 & 0xFF));
									}
								} else {
									@Pc(1943) Class4_Sub2_Sub9 local1943;
									if (local38.anInt3177 == 4) {
										local1943 = local38.method2520(Static303.aClass58Array5);
										if (local1943 != null) {
											@Pc(1956) String local1956 = local38.aString110;
											if (Static182.method2941(local38)) {
												local257 = local38.anInt3166;
												if (Static218.aClass97_19 == local38 && local38.anInt3159 != 0) {
													local257 = local38.anInt3159;
												}
												if (local38.aString104.length() > 0) {
													local1956 = local38.aString104;
												}
											} else {
												local257 = local38.anInt3187;
												if (Static218.aClass97_19 == local38 && local38.anInt3154 != 0) {
													local257 = local38.anInt3154;
												}
											}
											if (local38.aBoolean192 && local38.anInt3163 != -1) {
												@Pc(2017) Class29 local2017 = Static187.method3128(local38.anInt3163);
												local1956 = local2017.aString35;
												if (local1956 == null) {
													local1956 = "null";
												}
												if ((local2017.anInt1033 == 1 || local38.anInt3202 != 1) && local38.anInt3202 != -1) {
													local1956 = "<col=ff9040>" + local1956 + "</col> x" + Static11.method229(local38.anInt3202);
												}
											}
											if (local38 == Static44.aClass97_6) {
												local1956 = Static137.aString93;
												local257 = local38.anInt3187;
											}
											if (!local38.aBoolean192) {
												local1956 = Static77.method1317(local38, local1956);
											}
											local1943.method4095(local1956, local121, local126, local38.anInt3201, local38.anInt3190, local257, local38.aBoolean193 ? 0 : -1, local38.anInt3156, local38.anInt3144, local38.anInt3176);
										} else if (Static263.aBoolean346) {
											Static178.method2927(local38);
										}
									} else if (local38.anInt3177 == 5) {
										@Pc(2115) Class4_Sub2_Sub4 local2115;
										if (!local38.aBoolean192) {
											local2115 = local38.method2517(Static182.method2941(local38));
											if (local2115 != null) {
												local2115.method4142(local121, local126);
											} else if (Static263.aBoolean346) {
												Static178.method2927(local38);
											}
										} else if (local38.anInt3137 >= 0) {
											@Pc(2141) Class78 local2141 = local38.method2526();
											if (Static251.aBoolean330) {
												local2141.method2004(0, local121, local126, local38.anInt3201, local38.anInt3190, local38.anInt3204, local38.anInt3178, 0);
											} else {
												local2141.method2005(0, local121, local126, local38.anInt3201, local38.anInt3190, local38.anInt3204, local38.anInt3178);
											}
										} else {
											if (local38.anInt3163 == -1) {
												local2115 = local38.method2517(false);
											} else if (local38.aBoolean206 && Static72.aClass13_Sub5_Sub1_1.aClass175_2 != null) {
												local2115 = Static80.method1373(local38.aBoolean203, local38.anInt3155, local38.anInt3163, Static72.aClass13_Sub5_Sub1_1.aClass175_2, local38.anInt3185, local38.anInt3202);
											} else {
												local2115 = Static80.method1373(local38.aBoolean203, local38.anInt3155, local38.anInt3163, null, local38.anInt3185, local38.anInt3202);
											}
											if (local2115 != null) {
												local257 = local2115.anInt5185;
												local458 = local2115.anInt5195;
												if (local38.aBoolean205) {
													local495 = (local38.anInt3201 + local257 - 1) / local257;
													local499 = (local38.anInt3190 + local458 - 1) / local458;
													if (Static251.aBoolean330) {
														Static87.method1458(local121, local126, local121 + local38.anInt3201, local126 - -local38.anInt3190);
														@Pc(2365) boolean local2365 = Static40.method747(local2115.anInt5193);
														@Pc(2370) boolean local2370 = Static40.method747(local2115.anInt5191);
														@Pc(2373) Class4_Sub2_Sub4_Sub1 local2373 = (Class4_Sub2_Sub4_Sub1) local2115;
														if (local2365 && local2370) {
															if (local129 == 0) {
																local2373.method2482(local121, local126, local495, local499);
															} else {
																local2373.method2487(local121, local126, 256 - (local129 & 0xFF), local495, local499);
															}
														} else if (local2365) {
															for (local558 = 0; local558 < local499; local558++) {
																if (local129 == 0) {
																	local2373.method2482(local121, local126 + local458 * local558, local495, 1);
																} else {
																	local2373.method2487(local121, local458 * local558 + local126, 256 - (local129 & 0xFF), local495, 1);
																}
															}
														} else if (local2370) {
															for (local558 = 0; local558 < local495; local558++) {
																if (local129 == 0) {
																	local2373.method2482(local121 + local257 * local558, local126, 1, local499);
																} else {
																	local2373.method2487(local257 * local558 + local121, local126, 256 - (local129 & 0xFF), 1, local499);
																}
															}
														} else {
															for (local558 = 0; local558 < local495; local558++) {
																for (local575 = 0; local575 < local499; local575++) {
																	if (local129 == 0) {
																		local2115.method4142(local558 * local257 + local121, local126 + local458 * local575);
																	} else {
																		local2115.method4143(local121 + local558 * local257, local126 - -(local458 * local575), 256 - (local129 & 0xFF));
																	}
																}
															}
														}
														Static87.method1457(arg8, arg5, arg0, arg7);
													} else {
														Static258.method4023(local121, local126, local38.anInt3201 + local121, local126 - -local38.anInt3190);
														for (local511 = 0; local511 < local495; local511++) {
															for (local541 = 0; local541 < local499; local541++) {
																if (local38.anInt3192 != 0) {
																	local2115.method4138(local126 + local458 * local541 + local458 / 2, 4096, local257 / 2 + local257 * local511 + local121, local38.anInt3192);
																} else if (local129 == 0) {
																	local2115.method4142(local121 + local257 * local511, local126 + local541 * local458);
																} else {
																	local2115.method4143(local257 * local511 + local121, local126 + local541 * local458, 256 - (local129 & 0xFF));
																}
															}
														}
														Static258.method4029(arg8, arg5, arg0, arg7);
													}
												} else {
													local495 = local38.anInt3201 * 4096 / local257;
													if (local38.anInt3192 != 0) {
														local2115.method4138(local126 + local38.anInt3190 / 2, local495, local38.anInt3201 / 2 + local121, local38.anInt3192);
													} else if (local129 != 0) {
														local2115.method4141(local121, local126, local38.anInt3201, local38.anInt3190, 256 - (local129 & 0xFF));
													} else if (local257 == local38.anInt3201 && local38.anInt3190 == local458) {
														local2115.method4142(local121, local126);
													} else {
														local2115.method4136(local121, local126, local38.anInt3201, local38.anInt3190);
													}
												}
											} else if (Static263.aBoolean346) {
												Static178.method2927(local38);
											}
										}
									} else {
										@Pc(2830) Class29 local2830;
										if (local38.anInt3177 == 6) {
											@Pc(2672) Class13_Sub1 local2672 = null;
											@Pc(2676) boolean local2676 = Static182.method2941(local38);
											local495 = 0;
											if (local2676) {
												local257 = local38.anInt3139;
											} else {
												local257 = local38.anInt3122;
											}
											if (local38.anInt3163 != -1) {
												local2830 = Static187.method3128(local38.anInt3163);
												if (local2830 != null) {
													local2830 = local2830.method920(local38.anInt3202);
													@Pc(2848) Class186 local2848 = local257 == -1 ? null : Static51.method992(local257);
													if (local38.aBoolean206 && Static72.aClass13_Sub5_Sub1_1.aClass175_2 != null) {
														local2672 = local2830.method924(local2848, local38.anInt3194, local38.anInt3120, Static72.aClass13_Sub5_Sub1_1.aClass175_2, 1, local38.anInt3188);
													} else {
														local2672 = local2830.method924(local2848, local38.anInt3194, local38.anInt3120, null, 1, local38.anInt3188);
													}
													if (local2672 == null) {
														Static178.method2927(local38);
													} else {
														local495 = -local2672.method4266() / 2;
													}
												}
											} else if (local38.anInt3125 == 5) {
												if (local38.anInt3121 == -1) {
													local2672 = Static165.aClass175_1.method4468(true, null, -1, null, 0, -1, null, -1, 0, -1);
												} else {
													local499 = local38.anInt3121 & 0x7FF;
													if (local499 == Static169.anInt3387) {
														local499 = 2047;
													}
													@Pc(2784) Class13_Sub5_Sub1 local2784 = Static100.aClass13_Sub5_Sub1Array1[local499];
													@Pc(2793) Class186 local2793 = local257 == -1 ? null : Static51.method992(local257);
													if (local2784 != null && (int) Static193.method3171(local2784.aString148) << 11 == (local38.anInt3121 & 0xFFFFF800)) {
														local2672 = local2784.aClass175_2.method4468(true, null, local38.anInt3194, local2793, 0, -1, null, -1, 0, 0);
													}
												}
											} else if (local257 == -1) {
												local2672 = local38.method2528(-1, null, local2676, -1, 0, Static72.aClass13_Sub5_Sub1_1.aClass175_2);
												if (local2672 == null && Static263.aBoolean346) {
													Static178.method2927(local38);
												}
											} else {
												@Pc(2708) Class186 local2708 = Static51.method992(local257);
												local2672 = local38.method2528(local38.anInt3120, local2708, local2676, local38.anInt3194, local38.anInt3188, Static72.aClass13_Sub5_Sub1_1.aClass175_2);
												if (local2672 == null && Static263.aBoolean346) {
													Static178.method2927(local38);
												}
											}
											if (local2672 != null) {
												if (local38.anInt3148 > 0) {
													local499 = (local38.anInt3201 << 8) / local38.anInt3148;
												} else {
													local499 = 256;
												}
												if (local38.anInt3135 > 0) {
													local511 = (local38.anInt3190 << 8) / local38.anInt3135;
												} else {
													local511 = 256;
												}
												local541 = local38.anInt3201 / 2 + local121 + (local38.anInt3173 * local499 >> 8);
												local530 = (local511 * local38.anInt3191 >> 8) + local126 + local38.anInt3190 / 2;
												if (Static251.aBoolean330) {
													if (local38.aBoolean190) {
														Static251.method3880(local541, local530, local38.anInt3184, local38.aShort25, local499, local511);
													} else {
														Static251.method3852(local541, local530, local499, local511);
														Static251.method3877((float) local38.aShort24, (float) local38.aShort25 * 1.5F);
													}
													Static251.method3864();
													Static251.method3868(true);
													Static251.method3894(false);
													Static68.method1443(Static248.anInt4872);
													if (Static125.aBoolean161) {
														Static87.method1462();
														Static251.method3862();
														Static87.method1457(arg8, arg5, arg0, arg7);
														Static125.aBoolean161 = false;
													}
													if (local38.aBoolean201) {
														Static251.method3856();
													}
													local558 = Class174.anIntArray444[local38.anInt3114] * local38.anInt3184 >> 16;
													local575 = local38.anInt3184 * Class174.anIntArray443[local38.anInt3114] >> 16;
													if (local38.aBoolean192) {
														local2672.method2743(local38.anInt3143, local38.anInt3138, local38.anInt3114, local38.anInt3158, local38.anInt3183 + local558 + local495, local575 + local38.anInt3183, -1L);
													} else {
														local2672.method2743(local38.anInt3143, 0, local38.anInt3114, 0, local558, local575, -1L);
													}
													if (local38.aBoolean201) {
														Static251.method3878();
													}
												} else {
													Static283.method4416(local541, local530);
													local558 = Class174.anIntArray444[local38.anInt3114] * local38.anInt3184 >> 16;
													local575 = Class174.anIntArray443[local38.anInt3114] * local38.anInt3184 >> 16;
													if (!local38.aBoolean192) {
														local2672.method2743(local38.anInt3143, 0, local38.anInt3114, 0, local558, local575, -1L);
													} else if (local38.aBoolean190) {
														((Class13_Sub1_Sub1) local2672).method405(local38.anInt3143, local38.anInt3138, local38.anInt3114, local38.anInt3158, local495 + local558 + local38.anInt3183, local38.anInt3183 + local575, local38.anInt3184);
													} else {
														local2672.method2743(local38.anInt3143, local38.anInt3138, local38.anInt3114, local38.anInt3158, local495 + local558 + local38.anInt3183, local38.anInt3183 + local575, -1L);
													}
													Static283.method4418();
												}
											}
										} else {
											if (local38.anInt3177 == 7) {
												local1943 = local38.method2520(Static303.aClass58Array5);
												if (local1943 == null) {
													if (Static263.aBoolean346) {
														Static178.method2927(local38);
													}
													continue;
												}
												local257 = 0;
												for (local458 = 0; local458 < local38.anInt3151; local458++) {
													for (local495 = 0; local495 < local38.anInt3147; local495++) {
														if (local38.anIntArray249[local257] > 0) {
															local2830 = Static187.method3128(local38.anIntArray249[local257] - 1);
															@Pc(3263) String local3263;
															if (local2830.anInt1033 != 1 && local38.anIntArray256[local257] == 1) {
																local3263 = "<col=ff9040>" + local2830.aString35 + "</col>";
															} else {
																local3263 = "<col=ff9040>" + local2830.aString35 + "</col> x" + Static11.method229(local38.anIntArray256[local257]);
															}
															local541 = local121 + local495 * (local38.anInt3112 + 115);
															local530 = local126 + (local38.anInt3206 + 12) * local458;
															if (local38.anInt3156 == 0) {
																local1943.method4105(local3263, local541, local530, local38.anInt3187, local38.aBoolean193 ? 0 : -1);
															} else if (local38.anInt3156 == 1) {
																local1943.method4101(local3263, local541 + 57, local530, local38.anInt3187, local38.aBoolean193 ? 0 : -1);
															} else {
																local1943.method4104(local3263, local541 + 115 - 1, local530, local38.anInt3187, local38.aBoolean193 ? 0 : -1);
															}
														}
														local257++;
													}
												}
											}
											if (local38.anInt3177 == 8 && Static95.aClass97_9 == local38 && Static101.anInt2013 == Static222.anInt4461) {
												local276 = 0;
												@Pc(3378) String local3378 = local38.aString110;
												local257 = 0;
												@Pc(3382) Class4_Sub2_Sub9 local3382 = Static156.aClass4_Sub2_Sub9_4;
												local3378 = Static77.method1317(local38, local3378);
												@Pc(3401) String local3401;
												while (local3378.length() > 0) {
													local511 = local3378.indexOf("<br>");
													if (local511 == -1) {
														local3401 = local3378;
														local3378 = "";
													} else {
														local3401 = local3378.substring(0, local511);
														local3378 = local3378.substring(local511 + 4);
													}
													local541 = local3382.method4086(local3401);
													if (local276 < local541) {
														local276 = local541;
													}
													local257 += local3382.anInt5130 + 1;
												}
												local257 += 7;
												local276 += 6;
												local541 = local126 + local38.anInt3190 + 5;
												local511 = local121 + local38.anInt3201 - local276 - 5;
												if (local257 + local541 > arg7) {
													local541 = arg7 - local257;
												}
												if (local511 < local121 + 5) {
													local511 = local121 + 5;
												}
												if (local511 + local276 > arg0) {
													local511 = arg0 - local276;
												}
												if (Static251.aBoolean330) {
													Static87.method1464(local511, local541, local276, local257, 16777120);
													Static87.method1452(local511, local541, local276, local257, 0);
												} else {
													Static258.method4031(local511, local541, local276, local257, 16777120);
													Static258.method4025(local511, local541, local276, local257, 0);
												}
												local3378 = local38.aString110;
												local530 = local541 + local3382.anInt5130 + 2;
												local3378 = Static77.method1317(local38, local3378);
												while (local3378.length() > 0) {
													local558 = local3378.indexOf("<br>");
													if (local558 == -1) {
														local3401 = local3378;
														local3378 = "";
													} else {
														local3401 = local3378.substring(0, local558);
														local3378 = local3378.substring(local558 + 4);
													}
													local3382.method4105(local3401, local511 + 3, local530, 0, -1);
													local530 += local3382.anInt5130 + 1;
												}
											}
											if (local38.anInt3177 == 9) {
												if (local38.aBoolean200) {
													local495 = local126;
													local257 = local126 + local38.anInt3190;
													local458 = local121 + local38.anInt3201;
												} else {
													local495 = local126 + local38.anInt3190;
													local458 = local121 + local38.anInt3201;
													local257 = local126;
												}
												if (local38.anInt3150 == 1) {
													if (Static251.aBoolean330) {
														Static87.method1448(local121, local257, local458, local495, local38.anInt3187);
													} else {
														Static258.method4014(local121, local257, local458, local495, local38.anInt3187);
													}
												} else if (Static251.aBoolean330) {
													Static87.method1459(local121, local257, local458, local495, local38.anInt3187, local38.anInt3150);
												} else {
													Static258.method4022(local121, local257, local458, local495, local38.anInt3187, local38.anInt3150);
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public static void method2033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) int local17 = 0; local17 < Static65.anInt5697; local17++) {
			if (Static226.anIntArray370[local17] + Static184.anIntArray305[local17] > arg3 && arg2 + arg3 > Static226.anIntArray370[local17] && Static242.anIntArray380[local17] + Static184.anIntArray304[local17] > arg1 && arg1 + arg0 > Static242.anIntArray380[local17]) {
				Static48.aBooleanArray14[local17] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
	public static void method2035(@OriginalArg(1) int arg0) {
		if (arg0 == Static204.anInt4047) {
			return;
		}
		if (Static204.anInt4047 == 0) {
			Static99.method1631();
		}
		if (arg0 == 40) {
			Static240.method2128();
		}
		@Pc(44) boolean local44 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 != 40 && Static46.aClass91_1 != null) {
			Static46.aClass91_1.method2302();
			Static46.aClass91_1 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static143.anInt2834 = 1;
			Static160.anInt3279 = 0;
			Static240.anInt2598 = 1;
			Static97.anInt4591 = 0;
			Static276.anInt5449 = 0;
			Static284.method4439(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static301.method4629();
		}
		if (arg0 == 5) {
			Static301.method4631(Static60.aClass22_26);
		} else {
			Static118.method1997();
		}
		@Pc(108) boolean local108 = Static204.anInt4047 == 5 || Static204.anInt4047 == 10 || Static204.anInt4047 == 28;
		if (local108 != local44) {
			if (local44) {
				Static111.anInt2209 = Static186.anInt3694;
				if (Static279.anInt5471 == 0) {
					Static44.method847();
				} else {
					Static257.method4008(255, Static145.aClass22_101, Static186.anInt3694);
				}
				Static82.aClass70_2.method1831(false);
			} else {
				Static44.method847();
				Static82.aClass70_2.method1831(true);
			}
		}
		if (Static251.aBoolean330 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static251.method3865();
		}
		Static204.anInt4047 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
	public static void method2036() {
		if (Static169.method2691() != 2) {
			return;
		}
		@Pc(17) int local17 = Static180.anInt3623 % 104;
		@Pc(24) byte local24 = (byte) (Static180.anInt3623 - 4 & 0xFF);
		@Pc(26) int local26;
		@Pc(31) int local31;
		for (local26 = 0; local26 < 4; local26++) {
			for (local31 = 0; local31 < 104; local31++) {
				Static185.aByteArrayArrayArray10[local26][local17][local31] = local24;
			}
		}
		if (Static222.anInt4467 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static241.anIntArray379[local26] = -1000000;
			Static1.anIntArray1[local26] = 1000000;
			Static307.anIntArray488[local26] = 0;
			Static237.anIntArray377[local26] = 1000000;
			Static148.anIntArray236[local26] = 0;
		}
		if (Static99.anInt1946 != 1) {
			local26 = Static58.method2504(Static248.anInt4865, Static71.anInt1457, Static222.anInt4467);
			if (local26 - Static153.anInt3111 < 800 && (Static27.aByteArrayArrayArray2[Static222.anInt4467][Static71.anInt1457 >> 7][Static248.anInt4865 >> 7] & 0x4) != 0) {
				Static55.method1059(1, Static261.aClass4_Sub21ArrayArrayArray4, Static248.anInt4865 >> 7, Static71.anInt1457 >> 7, false);
			}
			return;
		}
		if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7][Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7] & 0x4) != 0) {
			Static55.method1059(0, Static261.aClass4_Sub21ArrayArrayArray4, Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7, Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7, false);
		}
		if (Static254.anInt4974 >= 310) {
			return;
		}
		local26 = Static71.anInt1457 >> 7;
		local31 = Static248.anInt4865 >> 7;
		@Pc(180) int local180 = Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7;
		@Pc(185) int local185 = Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7;
		@Pc(193) int local193;
		if (local180 <= local26) {
			local193 = local26 - local180;
		} else {
			local193 = local180 - local26;
		}
		@Pc(211) int local211;
		if (local185 <= local31) {
			local211 = local31 - local185;
		} else {
			local211 = local185 - local31;
		}
		if (local193 == 0 && local211 == 0 || local193 <= -104 || local193 >= 104 || local211 <= -104 || local211 >= 104) {
			Static204.method3269(null, "RC: " + local26 + "," + local31 + " " + local180 + "," + local185 + " " + Static269.anInt5357 + "," + Static105.anInt2105);
			return;
		}
		@Pc(294) int local294;
		@Pc(288) int local288;
		if (local193 > local211) {
			local288 = 32768;
			local294 = local211 * 65536 / local193;
			while (local26 != local180) {
				if (local26 < local180) {
					local26++;
				} else if (local26 > local180) {
					local26--;
				}
				if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][local26][local31] & 0x4) != 0) {
					Static55.method1059(1, Static261.aClass4_Sub21ArrayArrayArray4, local31, local26, false);
					break;
				}
				local288 += local294;
				if (local288 >= 65536) {
					local288 -= 65536;
					if (local185 > local31) {
						local31++;
					} else if (local31 > local185) {
						local31--;
					}
					if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][local26][local31] & 0x4) != 0) {
						Static55.method1059(1, Static261.aClass4_Sub21ArrayArrayArray4, local31, local26, false);
						break;
					}
				}
			}
			return;
		}
		local288 = 32768;
		local294 = local193 * 65536 / local211;
		while (local185 != local31) {
			if (local31 < local185) {
				local31++;
			} else if (local185 < local31) {
				local31--;
			}
			if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][local26][local31] & 0x4) != 0) {
				Static55.method1059(1, Static261.aClass4_Sub21ArrayArrayArray4, local31, local26, false);
				break;
			}
			local288 += local294;
			if (local288 >= 65536) {
				if (local26 < local180) {
					local26++;
				} else if (local180 < local26) {
					local26--;
				}
				local288 -= 65536;
				if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][local26][local31] & 0x4) != 0) {
					Static55.method1059(1, Static261.aClass4_Sub21ArrayArrayArray4, local31, local26, false);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
	public static void method2037() {
		if (Static276.aFloat156 < 128.0F) {
			Static276.aFloat156 = 128.0F;
		}
		while (Static126.aFloat73 >= 2048.0F) {
			Static126.aFloat73 -= 2048.0F;
		}
		while (Static126.aFloat73 < 0.0F) {
			Static126.aFloat73 += 2048.0F;
		}
		@Pc(40) int local40 = Static81.anInt1698 >> 7;
		if (Static276.aFloat156 > 383.0F) {
			Static276.aFloat156 = 383.0F;
		}
		@Pc(51) int local51 = Static153.anInt3107 >> 7;
		@Pc(57) int local57 = Static58.method2504(Static153.anInt3107, Static81.anInt1698, Static222.anInt4467);
		@Pc(59) int local59 = 0;
		@Pc(80) int local80;
		if (local40 > 3 && local51 > 3 && local40 < 100 && local51 < 100) {
			for (local80 = local40 - 4; local80 <= local40 + 4; local80++) {
				for (@Pc(89) int local89 = local51 - 4; local89 <= local51 + 4; local89++) {
					@Pc(96) int local96 = Static222.anInt4467;
					if (local96 < 3 && (Static27.aByteArrayArrayArray2[1][local80][local89] & 0x2) == 2) {
						local96++;
					}
					@Pc(138) int local138 = (Static98.aByteArrayArrayArray6[local96][local80][local89] & 0xFF) * 8 + local57 - Static154.anIntArrayArrayArray5[local96][local80][local89];
					if (local138 > local59) {
						local59 = local138;
					}
				}
			}
		}
		local80 = local59 * 192;
		if (local80 > 98048) {
			local80 = 98048;
		}
		if (local80 < 32768) {
			local80 = 32768;
		}
		if (local80 > Static134.anInt2667) {
			Static134.anInt2667 += (local80 - Static134.anInt2667) / 24;
		} else if (local80 < Static134.anInt2667) {
			Static134.anInt2667 += (local80 - Static134.anInt2667) / 80;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!cg;ZLclient!cg;)V")
	public static void method2038(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		Static131.aClass4_Sub2_Sub9_2 = Static225.method3542(arg1, arg0, Static299.anInt5734);
		if (Static251.aBoolean330) {
			Static94.aClass4_Sub2_Sub9_Sub2_1 = Static223.method3498(Static299.anInt5734, arg0, arg1);
		} else {
			Static94.aClass4_Sub2_Sub9_Sub2_1 = (Class4_Sub2_Sub9_Sub2) Static131.aClass4_Sub2_Sub9_2;
		}
		Static156.aClass4_Sub2_Sub9_4 = Static225.method3542(arg1, arg0, Static280.anInt5489);
		Static86.aClass4_Sub2_Sub9_3 = Static225.method3542(arg1, arg0, Static237.anInt4716);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZLclient!lg;)V")
	private static void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class97 arg3) {
		Static65.method4575();
		if (Static251.aBoolean330) {
			Static87.method1457(arg1, arg0, arg3.anInt3201 + arg1, arg3.anInt3190 + arg0);
		} else {
			Static258.method4029(arg1, arg0, arg1 + arg3.anInt3201, arg0 + arg3.anInt3190);
		}
		if (Static169.anInt3385 != 2 && Static169.anInt3385 != 5 && Static41.aClass4_Sub2_Sub4_2 != null) {
			@Pc(56) int local56 = (int) Static126.aFloat73 + Static234.anInt4655 & 0x7FF;
			@Pc(64) int local64 = Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32 + 48;
			@Pc(74) int local74 = 464 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
			if (Static251.aBoolean330) {
				((Class4_Sub2_Sub4_Sub1) Static41.aClass4_Sub2_Sub4_2).method2483(arg1, arg0, arg3.anInt3201, arg3.anInt3190, local64, local74, local56, Static161.anInt3301 + 256, (Class4_Sub2_Sub4_Sub1) arg3.method2517(false));
			} else {
				((Class4_Sub2_Sub4_Sub2) Static41.aClass4_Sub2_Sub4_2).method4159(arg1, arg0, arg3.anInt3201, arg3.anInt3190, local64, local74, local56, Static161.anInt3301 + 256, arg3.anIntArray257, arg3.anIntArray259);
			}
			@Pc(156) int local156;
			@Pc(175) int local175;
			@Pc(179) int local179;
			@Pc(183) int local183;
			@Pc(211) int local211;
			@Pc(222) int local222;
			@Pc(250) int local250;
			@Pc(280) int local280;
			if (Static68.aClass100_2 != null) {
				for (@Pc(126) int local126 = 0; local126 < Static68.aClass100_2.anInt3236; local126++) {
					if (Static68.aClass100_2.method2547(local126)) {
						local156 = ((Static68.aClass100_2.anIntArray266[local126] >> 14 & 0x3FFF) - Static269.anInt5357) * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
						local175 = ((Static68.aClass100_2.anIntArray266[local126] & 0x3FFF) - Static105.anInt2105) * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
						local179 = Class174.anIntArray444[local56];
						local183 = Class174.anIntArray443[local56];
						@Pc(191) int local191 = local183 * 256 / (Static161.anInt3301 + 256);
						@Pc(193) Class4_Sub2_Sub9 local193 = Static131.aClass4_Sub2_Sub9_2;
						@Pc(201) int local201 = local179 * 256 / (Static161.anInt3301 + 256);
						local211 = local201 * local175 + local156 * local191 >> 16;
						local222 = local175 * local191 - local201 * local156 >> 16;
						if (Static68.aClass100_2.method2542(local126) == 1) {
							local193 = Static156.aClass4_Sub2_Sub9_4;
						}
						if (Static68.aClass100_2.method2542(local126) == 2) {
							local193 = Static86.aClass4_Sub2_Sub9_3;
						}
						local250 = local193.method4100(Static68.aClass100_2.aStringArray22[local126], 100);
						local211 -= local250 / 2;
						if (-arg3.anInt3201 <= local211 && arg3.anInt3201 >= local211 && -arg3.anInt3190 <= local222 && arg3.anInt3190 >= local222) {
							local280 = 16777215;
							if (Static68.aClass100_2.anIntArray265[local126] != -1) {
								local280 = Static68.aClass100_2.anIntArray265[local126];
							}
							if (Static251.aBoolean330) {
								Static87.method1463((Class4_Sub2_Sub4_Sub1) arg3.method2517(false));
							} else {
								Static258.method4013(arg3.anIntArray257, arg3.anIntArray259);
							}
							local193.method4102(Static68.aClass100_2.aStringArray22[local126], arg1 + local211 + arg3.anInt3201 / 2, -local222 + arg3.anInt3190 / 2 + arg0, local250, 50, local280, 0, 1, 0, 0);
							if (Static251.aBoolean330) {
								Static87.method1449();
							} else {
								Static258.method4020();
							}
						}
					}
				}
			}
			for (local156 = 0; local156 < Static145.anInt5622; local156++) {
				local175 = Static48.anIntArray116[local156] * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
				local179 = Static153.anIntArray245[local156] * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
				@Pc(391) Class73 local391 = Static296.method4591(Static69.anIntArray134[local156]);
				if (local391.anIntArray196 != null) {
					local391 = local391.method1899();
					if (local391 == null || local391.anInt2265 == -1) {
						continue;
					}
				}
				Static162.method2606(arg1, arg3, arg0, local175, Static91.aClass4_Sub2_Sub4Array5[local391.anInt2265], local179);
			}
			for (local156 = 0; local156 < 104; local156++) {
				for (local175 = 0; local175 < 104; local175++) {
					@Pc(440) Class17 local440 = Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local156][local175];
					if (local440 != null) {
						local183 = local156 * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
						local211 = local175 * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
						Static162.method2606(arg1, arg3, arg0, local183, Static71.aClass4_Sub2_Sub4Array2[0], local211);
					}
				}
			}
			for (local156 = 0; local156 < Static99.anInt1950; local156++) {
				@Pc(499) Class13_Sub5_Sub2 local499 = Static260.aClass13_Sub5_Sub2Array114[anIntArray214[local156]];
				if (local499 != null && local499.method4213()) {
					@Pc(510) Class185 local510 = local499.aClass185_1;
					if (local510 != null && local510.anIntArray466 != null) {
						local510 = local510.method4658();
					}
					if (local510 != null && local510.aBoolean401 && local510.aBoolean400) {
						local183 = local499.anInt5334 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
						local211 = local499.anInt5294 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
						if (local510.anInt5777 == -1) {
							Static162.method2606(arg1, arg3, arg0, local183, Static71.aClass4_Sub2_Sub4Array2[1], local211);
						} else {
							Static162.method2606(arg1, arg3, arg0, local183, Static91.aClass4_Sub2_Sub4Array5[local510.anInt5777], local211);
						}
					}
				}
			}
			for (local156 = 0; local156 < Static85.anInt1730; local156++) {
				@Pc(596) Class13_Sub5_Sub1 local596 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local156]];
				if (local596 != null && local596.method4213()) {
					local179 = local596.anInt5334 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
					@Pc(616) boolean local616 = false;
					local183 = local596.anInt5294 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
					@Pc(632) long local632 = Static193.method3171(local596.aString148);
					for (local250 = 0; local250 < Static149.anInt2911; local250++) {
						if (Static262.aLongArray9[local250] == local632 && Static73.anIntArray139[local250] != 0) {
							local616 = true;
							break;
						}
					}
					@Pc(667) boolean local667 = false;
					for (local280 = 0; local280 < Static244.anInt4812; local280++) {
						if (local632 == Static168.aClass4_Sub12Array1[local280].aLong211) {
							local667 = true;
							break;
						}
					}
					@Pc(689) boolean local689 = false;
					if (Static72.aClass13_Sub5_Sub1_1.anInt4462 != 0 && local596.anInt4462 != 0 && local596.anInt4462 == Static72.aClass13_Sub5_Sub1_1.anInt4462) {
						local689 = true;
					}
					if (local616) {
						Static162.method2606(arg1, arg3, arg0, local179, Static71.aClass4_Sub2_Sub4Array2[3], local183);
					} else if (local667) {
						Static162.method2606(arg1, arg3, arg0, local179, Static71.aClass4_Sub2_Sub4Array2[5], local183);
					} else if (local689) {
						Static162.method2606(arg1, arg3, arg0, local179, Static71.aClass4_Sub2_Sub4Array2[4], local183);
					} else {
						Static162.method2606(arg1, arg3, arg0, local179, Static71.aClass4_Sub2_Sub4Array2[2], local183);
					}
				}
			}
			@Pc(767) Class171[] local767 = Static56.aClass171Array1;
			for (local175 = 0; local175 < local767.length; local175++) {
				@Pc(781) Class171 local781 = local767[local175];
				if (local781 != null && local781.anInt5452 != 0 && Static50.anInt1118 % 20 < 10) {
					if (local781.anInt5452 == 1 && local781.anInt5453 >= 0 && local781.anInt5453 < Static260.aClass13_Sub5_Sub2Array114.length) {
						@Pc(820) Class13_Sub5_Sub2 local820 = Static260.aClass13_Sub5_Sub2Array114[local781.anInt5453];
						if (local820 != null) {
							local222 = local820.anInt5294 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
							local211 = local820.anInt5334 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
							Static15.method272(local211, 360000, local781.anInt5450, arg0, arg1, arg3, local222);
						}
					}
					if (local781.anInt5452 == 2) {
						local211 = (local781.anInt5458 - Static105.anInt2105) * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
						local222 = local781.anInt5460 * 4;
						local183 = (local781.anInt5454 - Static269.anInt5357) * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
						local222 *= local222;
						Static15.method272(local183, local222, local781.anInt5450, arg0, arg1, arg3, local211);
					}
					if (local781.anInt5452 == 10 && local781.anInt5453 >= 0 && local781.anInt5453 < Static100.aClass13_Sub5_Sub1Array1.length) {
						@Pc(929) Class13_Sub5_Sub1 local929 = Static100.aClass13_Sub5_Sub1Array1[local781.anInt5453];
						if (local929 != null) {
							local211 = local929.anInt5334 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
							local222 = local929.anInt5294 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
							Static15.method272(local211, 360000, local781.anInt5450, arg0, arg1, arg3, local222);
						}
					}
				}
			}
			if (Static11.anInt279 != 0) {
				local156 = Static11.anInt279 * 4 + (Static72.aClass13_Sub5_Sub1_1.method4219() - 1) * 2 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
				local175 = Static274.anInt5438 * 4 + Static72.aClass13_Sub5_Sub1_1.method4219() * 2 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32 - 2;
				Static162.method2606(arg1, arg3, arg0, local156, Static122.aClass4_Sub2_Sub4_5, local175);
			}
			if (Static251.aBoolean330) {
				Static87.method1464(arg3.anInt3201 / 2 + arg1 - 1, arg0 + arg3.anInt3190 / 2 - 1, 3, 3, 16777215);
			} else {
				Static258.method4031(arg3.anInt3201 / 2 + arg1 - 1, arg0 + -1 - -(arg3.anInt3190 / 2), 3, 3, 16777215);
			}
		} else if (Static251.aBoolean330) {
			@Pc(1078) Class4_Sub2_Sub4 local1078 = arg3.method2517(false);
			if (local1078 != null) {
				local1078.method4142(arg1, arg0);
			}
		} else {
			Static258.method4028(arg1, arg0, arg3.anIntArray257, arg3.anIntArray259);
		}
		Static22.aBooleanArray8[arg2] = true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method2040(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg1); local14 != -1; local14 = arg0.indexOf(arg1, arg2.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg2 + arg0.substring(arg1.length() + local14);
		}
		return arg0;
	}
}
