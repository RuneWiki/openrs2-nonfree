import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt4107;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt4109;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1439 = Static120.method2057("scrollbar");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt4108 = -1;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1440 = Static120.method2057("Enter your username (V password)3");

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1441 = aClass81_1440;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!rh;)V")
	private static void method3126(@OriginalArg(1) Class77 arg0) {
		@Pc(11) int local11 = arg0.anInt3249;
		if (local11 == 324) {
			if (Static152.anInt3454 == -1) {
				Static172.anInt3996 = arg0.anInt3192;
				Static152.anInt3454 = arg0.anInt3199;
			}
			if (Static33.aClass90_1.aBoolean169) {
				arg0.anInt3199 = Static152.anInt3454;
			} else {
				arg0.anInt3199 = Static172.anInt3996;
			}
		} else if (local11 == 325) {
			if (Static152.anInt3454 == -1) {
				Static152.anInt3454 = arg0.anInt3199;
				Static172.anInt3996 = arg0.anInt3192;
			}
			if (Static33.aClass90_1.aBoolean169) {
				arg0.anInt3199 = Static172.anInt3996;
			} else {
				arg0.anInt3199 = Static152.anInt3454;
			}
		} else if (local11 == 327) {
			arg0.anInt3214 = 150;
			arg0.anInt3210 = (int) (Math.sin((double) Static142.anInt3104 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3190 = 5;
			arg0.anInt3222 = -1;
		} else if (local11 == 328) {
			if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518 == null) {
				arg0.anInt3222 = 0;
			} else {
				arg0.anInt3214 = 150;
				arg0.anInt3210 = (int) (Math.sin((double) Static142.anInt3104 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3190 = 5;
				arg0.anInt3222 = ((int) Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass81_518.method2821() << 11) + 2047;
				arg0.anInt3212 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3054;
				arg0.anInt3216 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3046;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[Lclient!rh;IIIIIIII)V")
	public static void method3127(@OriginalArg(1) Class77[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static4.method2576(arg1, arg3, arg2, arg8);
		Static22.method499();
		for (@Pc(17) int local17 = 0; local17 < arg0.length; local17++) {
			@Pc(23) Class77 local23 = arg0[local17];
			if (local23 != null && (local23.anInt3196 == arg6 || arg6 == -1412584499 && local23 == Static31.aClass77_5)) {
				@Pc(70) int local70;
				if (arg4 == -1) {
					Static175.anIntArray307[Static11.anInt651] = local23.anInt3258 + arg5;
					Static171.anIntArray418[Static11.anInt651] = local23.anInt3230 + arg7;
					Static50.anIntArray98[Static11.anInt651] = local23.anInt3217;
					Static118.anIntArray280[Static11.anInt651] = local23.anInt3245;
					local70 = Static11.anInt651++;
				} else {
					local70 = arg4;
				}
				local23.anInt3235 = Static142.anInt3104;
				local23.anInt3262 = local70;
				if (!local23.aBoolean138 || !Static151.method2628(local23)) {
					if (local23.anInt3249 > 0) {
						method3126(local23);
					}
					@Pc(101) int local101 = local23.anInt3230 + arg7;
					@Pc(107) int local107 = local23.anInt3258 + arg5;
					@Pc(110) int local110 = local23.anInt3208;
					@Pc(167) int local167;
					@Pc(138) int local138;
					if (local23 == Static31.aClass77_5) {
						if (arg6 != -1412584499 && !local23.aBoolean139) {
							Static11.anInt650 = arg5;
							Static168.aClass77Array2 = arg0;
							Static104.anInt2269 = arg7;
							continue;
						}
						if (!local23.aBoolean139) {
							local110 = 128;
						}
						if (Static67.aBoolean66 && Static18.aBoolean8) {
							local138 = Static172.anInt3997;
							local138 -= Static151.anInt3425;
							if (local138 < Static128.anInt2810) {
								local138 = Static128.anInt2810;
							}
							if (local23.anInt3245 + local138 > Static6.aClass77_3.anInt3245 + Static128.anInt2810) {
								local138 = Static6.aClass77_3.anInt3245 + Static128.anInt2810 - local23.anInt3245;
							}
							local167 = Static36.anInt973;
							local101 = local138;
							local167 -= Static10.anInt229;
							if (Static23.anInt584 > local167) {
								local167 = Static23.anInt584;
							}
							if (Static6.aClass77_3.anInt3217 + Static23.anInt584 < local167 - -local23.anInt3217) {
								local167 = Static23.anInt584 + Static6.aClass77_3.anInt3217 - local23.anInt3217;
							}
							local107 = local167;
						}
					}
					@Pc(263) int local263;
					@Pc(270) int local270;
					@Pc(252) int local252;
					@Pc(247) int local247;
					@Pc(281) int local281;
					@Pc(310) int local310;
					if (local23.anInt3226 == 2) {
						local138 = arg3;
						local167 = arg1;
						local263 = arg2;
						local270 = arg8;
					} else if (local23.anInt3226 == 9) {
						local247 = local101;
						local252 = local107;
						local281 = local107 + local23.anInt3217;
						if (local107 > local281) {
							local252 = local281;
							local281 = local107;
						}
						local167 = arg1 >= local252 ? arg1 : local252;
						local310 = local23.anInt3245 + local101;
						if (local101 > local310) {
							local247 = local310;
							local310 = local101;
						}
						local138 = local247 <= arg3 ? arg3 : local247;
						local281++;
						local263 = local281 >= arg2 ? arg2 : local281;
						local310++;
						local270 = arg8 <= local310 ? arg8 : local310;
					} else {
						local167 = arg1 < local107 ? local107 : arg1;
						local138 = arg3 >= local101 ? arg3 : local101;
						local247 = local23.anInt3245 + local101;
						local252 = local23.anInt3217 + local107;
						local263 = arg2 <= local252 ? arg2 : local252;
						local270 = arg8 <= local247 ? arg8 : local247;
					}
					if (!local23.aBoolean138 || local167 < local263 && local270 > local138) {
						if (local23.anInt3249 != 0) {
							if (local23.anInt3249 == 1337) {
								Static24.anInt615 = local101;
								Static66.anInt1659 = local107;
								Static101.method1669(local23.anInt3217, local101, local23.anInt3245, local107);
								Static4.method2576(arg1, arg3, arg2, arg8);
								continue;
							}
							if (local23.anInt3249 == 1338) {
								if (local23.method2498()) {
									Static16.method241(local23, local107, local101, local70);
									Static4.method2576(arg1, arg3, arg2, arg8);
								}
								continue;
							}
							if (local23.anInt3249 == 1339) {
								if (local23.method2498()) {
									Static17.method370(local23, local101, local70, local107);
									Static4.method2576(arg1, arg3, arg2, arg8);
								}
								continue;
							}
						}
						local252 = Static36.anInt973;
						local247 = Static172.anInt3997;
						if (!Static149.aBoolean145 && local252 >= local167 && local138 <= local247 && local252 < local263 && local270 > local247) {
							Static63.method1112(local247 - local101, local23, local252 - local107);
						}
						if (local23.anInt3226 == 0) {
							if (!local23.aBoolean138 && Static151.method2628(local23) && Static62.aClass77_9 != local23) {
								continue;
							}
							if (!local23.aBoolean138) {
								if (local23.anInt3234 > local23.anInt3247 - local23.anInt3245) {
									local23.anInt3234 = local23.anInt3247 - local23.anInt3245;
								}
								if (local23.anInt3234 < 0) {
									local23.anInt3234 = 0;
								}
							}
							method3127(arg0, local167, local263, local138, local70, local107 - local23.anInt3252, local23.anInt3231, local101 - local23.anInt3234, local270);
							if (local23.aClass77Array1 != null) {
								method3127(local23.aClass77Array1, local167, local263, local138, local70, local107 - local23.anInt3252, local23.anInt3231, local101 - local23.anInt3234, local270);
							}
							@Pc(577) Class1_Sub4 local577 = (Class1_Sub4) Static119.aClass5_8.method134((long) local23.anInt3231);
							if (local577 != null) {
								if (local577.anInt157 == 0 && Static36.anInt973 >= local167 && local138 <= Static172.anInt3997 && Static36.anInt973 < local263 && local270 > Static172.anInt3997 && !Static149.aBoolean145 && !Static74.aBoolean69) {
									Static49.aShortArray11[0] = 1007;
									Static35.aClass81Array2[0] = Static16.aClass81_139;
									Static152.aClass81Array19[0] = Static149.aClass81_1213;
									Static118.anInt2616 = 1;
								}
								Static56.method1008(local167, local70, local107, local577.anInt155, local101, local270, local263, local138);
							}
							Static4.method2576(arg1, arg3, arg2, arg8);
							Static22.method499();
						}
						if (Static153.aBooleanArray16[local70] || Static161.anInt3668 > 1) {
							if (local23.anInt3226 == 0 && !local23.aBoolean138 && local23.anInt3245 < local23.anInt3247) {
								Static162.method2836(local23.anInt3217 + local107, local23.anInt3234, local23.anInt3245, local101, local23.anInt3247);
							}
							if (local23.anInt3226 != 1) {
								@Pc(695) int local695;
								@Pc(707) int local707;
								@Pc(877) int local877;
								@Pc(777) int local777;
								@Pc(930) int local930;
								@Pc(928) int local928;
								@Pc(953) int local953;
								@Pc(718) int local718;
								@Pc(873) int local873;
								if (local23.anInt3226 == 2) {
									local281 = 0;
									for (local310 = 0; local310 < local23.anInt3245; local310++) {
										for (local695 = 0; local695 < local23.anInt3217; local695++) {
											local707 = local107 + local695 * (local23.anInt3206 + 32);
											local718 = local101 + local310 * (local23.anInt3256 + 32);
											if (local281 < 20) {
												local707 += local23.anIntArray343[local281];
												local718 += local23.anIntArray338[local281];
											}
											if (local23.anIntArray348[local281] > 0) {
												local777 = local23.anIntArray348[local281] - 1;
												if (arg1 < local707 + 32 && arg2 > local707 && arg3 < local718 + 32 && arg8 > local718 || local23 == Static29.aClass77_4 && Static162.anInt3717 == local281) {
													@Pc(842) Class1_Sub2_Sub2_Sub3 local842;
													if (Static164.anInt3767 == 1 && local281 == Static12.anInt4133 && local23.anInt3231 == Static7.anInt159) {
														local842 = Static109.method1824(0, 2, local777, local23.anIntArray342[local281], false);
													} else {
														local842 = Static109.method1824(3153952, 1, local777, local23.anIntArray342[local281], false);
													}
													if (local842 == null) {
														Static51.method913(local23);
													} else if (Static29.aClass77_4 == local23 && local281 == Static162.anInt3717) {
														local873 = Static36.anInt973 - Static126.anInt2762;
														local877 = Static172.anInt3997 - Static160.anInt3660;
														if (local873 < 5 && local873 > -5) {
															local873 = 0;
														}
														if (local877 < 5 && local877 > -5) {
															local877 = 0;
														}
														if (Static161.anInt3681 < 5) {
															local873 = 0;
															local877 = 0;
														}
														local842.method2144(local707 + local873, local718 - -local877, 128);
														if (arg6 != -1) {
															@Pc(926) Class77 local926 = arg0[arg6 & 0xFFFF];
															local928 = Static4.anInt3353;
															local930 = Static4.anInt3354;
															if (local930 > local877 + local718 && local926.anInt3234 > 0) {
																local953 = Static149.anInt3336 * (local930 - local877 - local718) / 3;
																if (local953 > Static149.anInt3336 * 10) {
																	local953 = Static149.anInt3336 * 10;
																}
																if (local926.anInt3234 < local953) {
																	local953 = local926.anInt3234;
																}
																local926.anInt3234 -= local953;
																Static160.anInt3660 += local953;
																Static51.method913(local926);
															}
															if (local928 < local718 + local877 + 32 && local926.anInt3247 - local926.anInt3245 > local926.anInt3234) {
																local953 = Static149.anInt3336 * (local718 + local877 + 32 - local928) / 3;
																if (local953 > Static149.anInt3336 * 10) {
																	local953 = Static149.anInt3336 * 10;
																}
																if (local926.anInt3247 - local926.anInt3234 - local926.anInt3245 < local953) {
																	local953 = local926.anInt3247 - local926.anInt3234 - local926.anInt3245;
																}
																local926.anInt3234 += local953;
																Static160.anInt3660 -= local953;
																Static51.method913(local926);
															}
														}
													} else if (Static179.aClass77_14 == local23 && local281 == Static52.anInt1240) {
														local842.method2144(local707, local718, 128);
													} else {
														local842.method2130(local707, local718);
													}
												}
											} else if (local23.anIntArray337 != null && local281 < 20) {
												@Pc(755) Class1_Sub2_Sub2_Sub3 local755 = local23.method2494(local281);
												if (local755 != null) {
													local755.method2130(local707, local718);
												} else if (Static1.aBoolean1) {
													Static51.method913(local23);
												}
											}
											local281++;
										}
									}
								} else if (local23.anInt3226 == 3) {
									if (Static47.method851(local23)) {
										local281 = local23.anInt3244;
										if (local23 == Static62.aClass77_9 && local23.anInt3202 != 0) {
											local281 = local23.anInt3202;
										}
									} else {
										local281 = local23.anInt3223;
										if (Static62.aClass77_9 == local23 && local23.anInt3188 != 0) {
											local281 = local23.anInt3188;
										}
									}
									if (local110 == 0) {
										if (local23.aBoolean135) {
											Static4.method2572(local107, local101, local23.anInt3217, local23.anInt3245, local281);
										} else {
											Static4.method2563(local107, local101, local23.anInt3217, local23.anInt3245, local281);
										}
									} else if (local23.aBoolean135) {
										Static4.method2564(local107, local101, local23.anInt3217, local23.anInt3245, local281, 256 - (local110 & 0xFF));
									} else {
										Static4.method2573(local107, local101, local23.anInt3217, local23.anInt3245, local281, 256 - (local110 & 0xFF));
									}
								} else {
									@Pc(1220) Class1_Sub2_Sub2_Sub2_Sub1 local1220;
									if (local23.anInt3226 == 4) {
										local1220 = local23.method2492(Static110.aClass1_Sub2_Sub2_Sub4Array8);
										if (local1220 != null) {
											@Pc(1232) Class81 local1232 = local23.aClass81_1144;
											if (Static47.method851(local23)) {
												local310 = local23.anInt3244;
												if (local23 == Static62.aClass77_9 && local23.anInt3202 != 0) {
													local310 = local23.anInt3202;
												}
												if (local23.aClass81_1139.method2820() > 0) {
													local1232 = local23.aClass81_1139;
												}
											} else {
												local310 = local23.anInt3223;
												if (Static62.aClass77_9 == local23 && local23.anInt3188 != 0) {
													local310 = local23.anInt3188;
												}
											}
											if (local23.aBoolean138 && local23.anInt3211 != -1) {
												@Pc(1288) Class1_Sub2_Sub12 local1288 = Static54.method969(local23.anInt3211);
												local1232 = local1288.aClass81_843;
												if (local1232 == null) {
													local1232 = Static187.aClass81_1450;
												}
												if ((local1288.anInt2414 == 1 || local23.anInt3220 != 1) && local23.anInt3220 != -1) {
													local1232 = Static127.method2169(new Class81[] { Static25.aClass81_219, local1232, Static1.aClass81_7, Static147.method2505(local23.anInt3220) });
												}
											}
											if (local23 == Static46.aClass77_7) {
												local1232 = Static148.aClass81_1199;
												local310 = local23.anInt3223;
											}
											if (!local23.aBoolean138) {
												local1232 = Static72.method1261(local1232, local23);
											}
											local1220.method1937(local1232, local107, local101, local23.anInt3217, local23.anInt3245, local310, local23.aBoolean130 ? 0 : -1, local23.anInt3253, local23.anInt3238, local23.anInt3255);
										} else if (Static1.aBoolean1) {
											Static51.method913(local23);
										}
									} else if (local23.anInt3226 == 5) {
										@Pc(1398) Class1_Sub2_Sub2_Sub3 local1398;
										if (local23.aBoolean138) {
											if (local23.anInt3211 == -1) {
												local1398 = local23.method2491(false);
											} else {
												local1398 = Static109.method1824(local23.anInt3237, local23.anInt3193, local23.anInt3211, local23.anInt3220, false);
											}
											if (local1398 != null) {
												local310 = local1398.anInt2740;
												local695 = local1398.anInt2741;
												if (local23.aBoolean128) {
													Static4.method2567(local107, local101, local23.anInt3217 + local107, local101 - -local23.anInt3245);
													local707 = (local310 + local23.anInt3217 - 1) / local310;
													local718 = (local695 + local23.anInt3245 - 1) / local695;
													for (local873 = 0; local873 < local707; local873++) {
														for (local877 = 0; local877 < local718; local877++) {
															if (local23.anInt3228 != 0) {
																local1398.method2143(local310 / 2 + local107 + local310 * local873, local101 + local877 * local695 - -(local695 / 2), local23.anInt3228, 4096);
															} else if (local110 == 0) {
																local1398.method2130(local873 * local310 + local107, local877 * local695 + local101);
															} else {
																local1398.method2144(local107 + local310 * local873, local101 - -(local877 * local695), 256 - (local110 & 0xFF));
															}
														}
													}
													Static4.method2576(arg1, arg3, arg2, arg8);
												} else {
													local707 = local23.anInt3217 * 4096 / local310;
													if (local23.anInt3228 != 0) {
														local1398.method2143(local23.anInt3217 / 2 + local107, local101 + local23.anInt3245 / 2, local23.anInt3228, local707);
													} else if (local110 != 0) {
														local1398.method2126(local107, local101, local23.anInt3217, local23.anInt3245, 256 - (local110 & 0xFF));
													} else if (local310 == local23.anInt3217 && local23.anInt3245 == local695) {
														local1398.method2130(local107, local101);
													} else {
														local1398.method2133(local107, local101, local23.anInt3217, local23.anInt3245);
													}
												}
											} else if (Static1.aBoolean1) {
												Static51.method913(local23);
											}
										} else {
											local1398 = local23.method2491(Static47.method851(local23));
											if (local1398 != null) {
												local1398.method2130(local107, local101);
											} else if (Static1.aBoolean1) {
												Static51.method913(local23);
											}
										}
									} else {
										@Pc(1683) Class1_Sub2_Sub12 local1683;
										if (local23.anInt3226 == 6) {
											@Pc(1657) Class1_Sub2_Sub1_Sub4 local1657 = null;
											local707 = 0;
											@Pc(1663) boolean local1663 = Static47.method851(local23);
											if (local1663) {
												local310 = local23.anInt3215;
											} else {
												local310 = local23.anInt3212;
											}
											if (local23.anInt3211 != -1) {
												local1683 = Static54.method969(local23.anInt3211);
												if (local1683 != null) {
													local1683 = local1683.method1799(local23.anInt3220);
													local1657 = local1683.method1807(1, 0, null);
													if (local1657 == null) {
														Static51.method913(local23);
													} else {
														local1657.method1459();
														local707 = -local1657.aShort36 / 2;
													}
												}
											} else if (local23.anInt3190 == 5) {
												if (local23.anInt3222 == -1) {
													local1657 = Static33.aClass90_1.method3118(null, -1, -1, null);
												} else {
													local718 = local23.anInt3222 & 0x7FF;
													if (local718 == Static110.anInt2514) {
														local718 = 2047;
													}
													@Pc(1745) Class1_Sub2_Sub1_Sub3_Sub1 local1745 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local718];
													@Pc(1754) Class1_Sub2_Sub18 local1754 = local310 == -1 ? null : Static73.method1277(local310);
													if (local1745 != null && (int) local1745.aClass81_518.method2821() << 11 == (local23.anInt3222 & 0xFFFFF800)) {
														local1657 = local1745.aClass90_2.method3118(local1754, 0, local23.anInt3216, null);
													}
												}
											} else if (local310 == -1) {
												local1657 = local23.method2493(null, local1663, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2, -1);
												if (local1657 == null && Static1.aBoolean1) {
													Static51.method913(local23);
												}
											} else {
												@Pc(1790) Class1_Sub2_Sub18 local1790 = Static73.method1277(local310);
												local1657 = local23.method2493(local1790, local1663, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.aClass90_2, local23.anInt3216);
												if (local1657 == null && Static1.aBoolean1) {
													Static51.method913(local23);
												}
											}
											if (local1657 != null) {
												Static22.method500(local23.anInt3200 + local23.anInt3217 / 2 + local107, local23.anInt3245 / 2 + local101 + local23.anInt3229);
												local718 = local23.anInt3259 * Class1_Sub2_Sub2_Sub1.anIntArray30[local23.anInt3214] >> 16;
												local873 = local23.anInt3259 * Class1_Sub2_Sub2_Sub1.anIntArray33[local23.anInt3214] >> 16;
												if (!local23.aBoolean138) {
													local1657.method1462(local23.anInt3210, 0, local23.anInt3214, 0, local718, local873);
												} else if (local23.aBoolean137) {
													local1657.method1452(local23.anInt3210, local23.anInt3263, local23.anInt3214, local23.anInt3194, local707 + local718 + local23.anInt3221, local873 - -local23.anInt3221, local23.anInt3259);
												} else {
													local1657.method1462(local23.anInt3210, local23.anInt3263, local23.anInt3214, local23.anInt3194, local707 + local718 + local23.anInt3221, local23.anInt3221 + local873);
												}
												Static22.method501();
											}
										} else {
											if (local23.anInt3226 == 7) {
												local1220 = local23.method2492(Static110.aClass1_Sub2_Sub2_Sub4Array8);
												if (local1220 == null) {
													if (Static1.aBoolean1) {
														Static51.method913(local23);
													}
													continue;
												}
												local310 = 0;
												for (local695 = 0; local695 < local23.anInt3245; local695++) {
													for (local707 = 0; local707 < local23.anInt3217; local707++) {
														if (local23.anIntArray348[local310] > 0) {
															local1683 = Static54.method969(local23.anIntArray348[local310] - 1);
															@Pc(2019) Class81 local2019;
															if (local1683.anInt2414 != 1 && local23.anIntArray342[local310] == 1) {
																local2019 = Static127.method2169(new Class81[] { Static25.aClass81_219, local1683.aClass81_843, Static133.aClass81_1039 });
															} else {
																local2019 = Static127.method2169(new Class81[] { Static25.aClass81_219, local1683.aClass81_843, Static1.aClass81_7, Static147.method2505(local23.anIntArray342[local310]) });
															}
															local877 = local707 * (local23.anInt3206 + 115) + local107;
															local777 = local101 + (local23.anInt3256 + 12) * local695;
															if (local23.anInt3253 == 0) {
																local1220.method1949(local2019, local877, local777, local23.anInt3223, local23.aBoolean130 ? 0 : -1);
															} else if (local23.anInt3253 == 1) {
																local1220.method1948(local2019, local877 + local23.anInt3217 / 2, local777, local23.anInt3223, local23.aBoolean130 ? 0 : -1);
															} else {
																local1220.method1947(local2019, local23.anInt3217 + local877 - 1, local777, local23.anInt3223, local23.aBoolean130 ? 0 : -1);
															}
														}
														local310++;
													}
												}
											}
											@Pc(2292) int local2292;
											if (local23.anInt3226 == 8 && Static53.aClass77_8 == local23 && Static104.anInt2267 == Static75.anInt1814) {
												local281 = 0;
												@Pc(2150) Class81 local2150 = local23.aClass81_1144;
												local310 = 0;
												@Pc(2154) Class1_Sub2_Sub2_Sub2_Sub1 local2154 = Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5;
												local2150 = Static72.method1261(local2150, local23);
												@Pc(2175) Class81 local2175;
												while (local2150.method2820() > 0) {
													local873 = local2150.method2803(Static148.aClass81_1200);
													if (local873 == -1) {
														local2175 = local2150;
														local2150 = Static149.aClass81_1213;
													} else {
														local2175 = local2150.method2823(0, local873);
														local2150 = local2150.method2801(local873 + 4);
													}
													local877 = local2154.method1934(local2175);
													if (local877 > local281) {
														local281 = local877;
													}
													local310 += local2154.anInt2496 + 1;
												}
												local281 += 6;
												local310 += 7;
												local873 = local107 + local23.anInt3217 - local281 - 5;
												if (local873 < local107 + 5) {
													local873 = local107 + 5;
												}
												local877 = local23.anInt3245 + local101 + 5;
												if (local281 + local873 > arg2) {
													local873 = arg2 - local281;
												}
												if (local310 + local877 > arg8) {
													local877 = arg8 - local310;
												}
												Static4.method2572(local873, local877, local281, local310, 16777120);
												Static4.method2563(local873, local877, local281, local310, 0);
												local2150 = local23.aClass81_1144;
												local777 = local877 + local2154.anInt2496 + 2;
												local2150 = Static72.method1261(local2150, local23);
												while (local2150.method2820() > 0) {
													local2292 = local2150.method2803(Static148.aClass81_1200);
													if (local2292 == -1) {
														local2175 = local2150;
														local2150 = Static149.aClass81_1213;
													} else {
														local2175 = local2150.method2823(0, local2292);
														local2150 = local2150.method2801(local2292 + 4);
													}
													local2154.method1949(local2175, local873 + 3, local777, 0, -1);
													local777 += local2154.anInt2496 + 1;
												}
											}
											if (local23.anInt3226 == 9) {
												if (local23.anInt3261 == 1) {
													Static4.method2580(local107, local101, local23.anInt3217 + local107, local101 - -local23.anInt3245, local23.anInt3223);
												} else {
													local310 = local23.anInt3245 >= 0 ? local23.anInt3245 : -local23.anInt3245;
													local281 = local23.anInt3217 < 0 ? -local23.anInt3217 : local23.anInt3217;
													local695 = local281;
													if (local281 < local310) {
														local695 = local310;
													}
													if (local695 != 0) {
														local707 = (local23.anInt3217 << 16) / local695;
														local718 = (local23.anInt3245 << 16) / local695;
														@Pc(2414) int local2414 = local107 - arg1;
														if (local718 <= local707) {
															local707 = -local707;
														} else {
															local718 = -local718;
														}
														local2292 = local23.anInt3261 * local707 + 1 >> 17;
														local877 = local718 * local23.anInt3261 + 1 >> 17;
														local930 = local101 - arg3;
														local777 = local23.anInt3261 * local707 >> 17;
														local873 = local23.anInt3261 * local718 >> 17;
														local928 = local2414 + local873;
														@Pc(2475) int local2475 = local2414 + local23.anInt3217 - local877;
														@Pc(2483) int local2483 = local23.anInt3217 + local2414 + local873;
														@Pc(2487) int local2487 = local930 + local777;
														local953 = local2414 - local877;
														@Pc(2500) int local2500 = local930 + local23.anInt3245 - local2292;
														@Pc(2505) int local2505 = local930 - local2292;
														@Pc(2512) int local2512 = local777 + local23.anInt3245 + local930;
														Static22.method495(local928, local953, local2475);
														Static22.method488(local2487, local2505, local2500, local928, local953, local2475, local23.anInt3223);
														Static22.method495(local928, local2475, local2483);
														Static22.method488(local2487, local2500, local2512, local928, local2475, local2483, local23.anInt3223);
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
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method3128() {
		aClass81_1439 = null;
		aClass81_1441 = null;
		aClass81_1440 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)I")
	public static int method3129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) Static157.aClass5_11.method134((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local8.anIntArray72.length; local31++) {
				if (local8.anIntArray73[local31] == arg1) {
					local29 += local8.anIntArray72[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;ILclient!pf;I)Lclient!wf;")
	public static Class31 method3130(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) int arg3) {
		if (Static185.anInt3915 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(39) Class31 local39 = (Class31) Class.forName("Class31_Sub1").getDeclaredConstructor().newInstance();
			local39.anInt3934 = arg3;
			local39.anIntArray417 = new int[(Static107.aBoolean100 ? 2 : 1) * 256];
			local39.method3002(arg0);
			local39.anInt3933 = (arg3 & -1024) + 1024;
			if (local39.anInt3933 > 16384) {
				local39.anInt3933 = 16384;
			}
			local39.method2993(local39.anInt3933);
			if (Static102.anInt2246 > 0 && Static152.aClass78_1 == null) {
				Static152.aClass78_1 = new Class78();
				Static152.aClass78_1.aClass68_4 = arg2;
				arg2.method2226(Static102.anInt2246, Static152.aClass78_1);
			}
			if (Static152.aClass78_1 != null) {
				if (Static152.aClass78_1.aClass31Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static152.aClass78_1.aClass31Array1[arg1] = local39;
			}
			return local39;
		} catch (@Pc(112) Throwable local112) {
			try {
				@Pc(118) Class31_Sub2 local118 = new Class31_Sub2(arg2, arg1);
				local118.anIntArray417 = new int[(Static107.aBoolean100 ? 2 : 1) * 256];
				local118.anInt3934 = arg3;
				local118.method3002(arg0);
				local118.anInt3933 = 16384;
				local118.method2993(local118.anInt3933);
				if (Static102.anInt2246 > 0 && Static152.aClass78_1 == null) {
					Static152.aClass78_1 = new Class78();
					Static152.aClass78_1.aClass68_4 = arg2;
					arg2.method2226(Static102.anInt2246, Static152.aClass78_1);
				}
				if (Static152.aClass78_1 != null) {
					if (Static152.aClass78_1.aClass31Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static152.aClass78_1.aClass31Array1[arg1] = local118;
				}
				return local118;
			} catch (@Pc(180) Throwable local180) {
				return new Class31();
			}
		}
	}
}
