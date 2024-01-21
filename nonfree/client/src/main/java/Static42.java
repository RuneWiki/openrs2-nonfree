import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_4;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] aClass1_Sub1_Sub12_Sub4Array2;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
	public static int[] anIntArray140 = new int[1000];

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!ed;")
	public static Class23 aClass23_436 = Static169.method2903("Mem:");

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!ed;")
	private static Class23 aClass23_437 = Static169.method2903("Close");

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_438 = Static169.method2903("null");

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_439 = aClass23_437;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ob;I)Lclient!ob;")
	public static Class60 method709(@OriginalArg(0) Class60 arg0) {
		@Pc(12) Class60 local12 = Static64.method1132(arg0);
		if (local12 == null) {
			local12 = arg0.aClass60_11;
		}
		return local12;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!ig;)V")
	public static void method710(@OriginalArg(0) int arg0, @OriginalArg(2) Class30_Sub1 arg1) {
		if (Static95.aClass1_Sub8_6 == null) {
			Static47.method768(null, 255, 255, (byte) 0, 0, true);
			Static135.aClass30_Sub1Array1[arg0] = arg1;
		} else {
			Static95.aClass1_Sub8_6.anInt1357 = arg0 * 8 + 5;
			@Pc(21) int local21 = Static95.aClass1_Sub8_6.method868();
			@Pc(27) int local27 = Static95.aClass1_Sub8_6.method868();
			arg1.method1309(local27, local21);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[Lclient!ob;IIIIII)V")
	public static void method711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class60[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static150.method3022(arg1, arg5, arg6, arg8);
		Static121.method2142();
		for (@Pc(18) int local18 = 0; local18 < arg2.length; local18++) {
			@Pc(24) Class60 local24 = arg2[local18];
			if (local24 != null && (local24.anInt2971 == arg7 || arg7 == -1412584499 && Static133.aClass60_12 == local24)) {
				@Pc(77) int local77;
				if (arg0 == -1) {
					Static87.anIntArray121[Static112.anInt2869] = local24.anInt2999 + arg3;
					Static103.anIntArray345[Static112.anInt2869] = local24.anInt2985 + arg4;
					Static23.anIntArray97[Static112.anInt2869] = local24.anInt3014;
					Static18.anIntArray79[Static112.anInt2869] = local24.anInt3017;
					local77 = Static112.anInt2869++;
				} else {
					local77 = arg0;
				}
				local24.anInt2974 = local77;
				local24.anInt3006 = Static26.anInt845;
				if (!local24.aBoolean155 || !Static146.method2528(local24)) {
					if (local24.anInt3007 > 0) {
						Static66.method1175(local24);
					}
					@Pc(106) int local106 = local24.anInt2985 + arg4;
					@Pc(111) int local111 = arg3 + local24.anInt2999;
					@Pc(114) int local114 = local24.anInt2998;
					@Pc(137) int local137;
					@Pc(143) int local143;
					if (Static133.aClass60_12 == local24) {
						if (arg7 != -1412584499 && !local24.aBoolean156) {
							Static66.anInt1747 = arg4;
							Static123.aClass60Array2 = arg2;
							Static86.anInt2305 = arg3;
							continue;
						}
						if (Static86.aBoolean115 && Static50.aBoolean60) {
							local137 = Static163.anInt4014;
							local137 -= Static169.anInt4122;
							local143 = Static96.anInt2484;
							if (local137 < Static178.anInt4247) {
								local137 = Static178.anInt4247;
							}
							local143 -= Static99.anInt2527;
							if (local137 + local24.anInt3014 > Static142.aClass60_13.anInt3014 + Static178.anInt4247) {
								local137 = Static178.anInt4247 + Static142.aClass60_13.anInt3014 - local24.anInt3014;
							}
							local111 = local137;
							if (local143 < Static38.anInt1036) {
								local143 = Static38.anInt1036;
							}
							if (local143 + local24.anInt3017 > Static38.anInt1036 - -Static142.aClass60_13.anInt3017) {
								local143 = Static142.aClass60_13.anInt3017 + Static38.anInt1036 - local24.anInt3017;
							}
							local106 = local143;
						}
						if (!local24.aBoolean156) {
							local114 = 128;
						}
					}
					@Pc(249) int local249;
					@Pc(266) int local266;
					@Pc(242) int local242;
					@Pc(255) int local255;
					@Pc(277) int local277;
					@Pc(304) int local304;
					if (local24.anInt3032 == 2) {
						local249 = arg6;
						local137 = arg1;
						local143 = arg5;
						local266 = arg8;
					} else if (local24.anInt3032 == 9) {
						local255 = local106;
						local242 = local111;
						local277 = local24.anInt3014 + local111;
						if (local111 > local277) {
							local242 = local277;
							local277 = local111;
						}
						local277++;
						local249 = arg6 > local277 ? local277 : arg6;
						local304 = local106 + local24.anInt3017;
						if (local304 < local106) {
							local255 = local304;
							local304 = local106;
						}
						local304++;
						local143 = arg5 >= local255 ? arg5 : local255;
						local137 = arg1 >= local242 ? arg1 : local242;
						local266 = arg8 <= local304 ? arg8 : local304;
					} else {
						local137 = local111 <= arg1 ? arg1 : local111;
						local143 = local106 > arg5 ? local106 : arg5;
						local242 = local24.anInt3014 + local111;
						local249 = arg6 <= local242 ? arg6 : local242;
						local255 = local106 + local24.anInt3017;
						local266 = local255 < arg8 ? local255 : arg8;
					}
					if (!local24.aBoolean155 || local249 > local137 && local266 > local143) {
						if (local24.anInt3007 != 0) {
							if (local24.anInt3007 == 1337) {
								Static166.anInt4091 = local111;
								Static79.anInt2156 = local106;
								Static60.method3144(local111, local106, local24.anInt3014, local24.anInt3017);
								Static150.method3022(arg1, arg5, arg6, arg8);
								continue;
							}
							if (local24.anInt3007 == 1338) {
								Static178.method3067(local106, local111, local77);
								Static150.method3022(arg1, arg5, arg6, arg8);
								continue;
							}
						}
						local255 = Static96.anInt2484;
						local242 = Static163.anInt4014;
						if (!Static164.aBoolean201 && local242 >= local137 && local255 >= local143 && local242 < local249 && local255 < local266) {
							Static110.method1955(local24, local242 - local111, local255 - local106);
						}
						if (local24.anInt3032 == 0) {
							if (!local24.aBoolean155 && Static146.method2528(local24) && Static107.aClass60_8 != local24) {
								continue;
							}
							if (!local24.aBoolean155) {
								if (local24.anInt2977 - local24.anInt3017 < local24.anInt3029) {
									local24.anInt3029 = local24.anInt2977 - local24.anInt3017;
								}
								if (local24.anInt3029 < 0) {
									local24.anInt3029 = 0;
								}
							}
							method711(local77, local137, arg2, local111 - local24.anInt2968, local106 - local24.anInt3029, local143, local249, local24.anInt3019, local266);
							if (local24.aClass60Array1 != null) {
								method711(local77, local137, local24.aClass60Array1, local111 - local24.anInt2968, -local24.anInt3029 + local106, local143, local249, local24.anInt3019, local266);
							}
							@Pc(550) Class1_Sub16 local550 = (Class1_Sub16) Static12.aClass10_1.method256((long) local24.anInt3019);
							if (local550 != null) {
								if (local550.anInt3202 == 0 && Static163.anInt4014 >= local137 && Static96.anInt2484 >= local143 && local249 > Static163.anInt4014 && local266 > Static96.anInt2484 && !Static164.aBoolean201 && !Static109.aBoolean136) {
									Static37.anIntArray124[0] = 1003;
									Static102.aClass23Array11[0] = Static139.aClass23_1332;
									Static38.anInt1037 = 1;
									Static104.aClass23Array12[0] = Static101.aClass23_1001;
								}
								Static47.method764(local111, local106, local137, local249, local266, local143, local550.anInt3207, local77);
							}
							Static150.method3022(arg1, arg5, arg6, arg8);
							Static121.method2142();
						}
						if (Static8.aBooleanArray3[local77] || Static20.anInt670 > 1) {
							if (local24.anInt3032 == 0 && !local24.aBoolean155 && local24.anInt2977 > local24.anInt3017) {
								Static122.method2770(local24.anInt3017, local106, local24.anInt2977, local24.anInt3029, local111 + local24.anInt3014);
							}
							if (local24.anInt3032 != 1) {
								@Pc(664) int local664;
								@Pc(675) int local675;
								@Pc(862) int local862;
								@Pc(749) int local749;
								@Pc(909) int local909;
								@Pc(911) int local911;
								@Pc(936) int local936;
								@Pc(685) int local685;
								@Pc(858) int local858;
								if (local24.anInt3032 == 2) {
									local277 = 0;
									for (local304 = 0; local304 < local24.anInt3017; local304++) {
										for (local664 = 0; local664 < local24.anInt3014; local664++) {
											local675 = local664 * (local24.anInt3009 + 32) + local111;
											local685 = local304 * (local24.anInt3003 + 32) + local106;
											if (local277 < 20) {
												local675 += local24.anIntArray402[local277];
												local685 += local24.anIntArray404[local277];
											}
											if (local24.anIntArray397[local277] > 0) {
												local749 = local24.anIntArray397[local277] - 1;
												if (arg1 < local675 + 32 && local675 < arg6 && arg5 < local685 + 32 && arg8 > local685 || local24 == Static109.aClass60_10 && Static144.anInt3641 == local277) {
													@Pc(808) Class1_Sub1_Sub12_Sub1 local808;
													if (Static144.anInt3643 == 1 && Static66.anInt1741 == local277 && local24.anInt3019 == Static16.anInt493) {
														local808 = Static71.method1274(0, local749, 2, false, local24.anIntArray398[local277]);
													} else {
														local808 = Static71.method1274(3153952, local749, 1, false, local24.anIntArray398[local277]);
													}
													if (local808 == null) {
														Static39.method659(local24);
													} else if (Static109.aClass60_10 == local24 && local277 == Static144.anInt3641) {
														local858 = Static163.anInt4014 - Static171.anInt4154;
														local862 = Static96.anInt2484 - Static149.anInt3741;
														if (local862 < 5 && local862 > -5) {
															local862 = 0;
														}
														if (local858 < 5 && local858 > -5) {
															local858 = 0;
														}
														if (Static80.anInt2161 < 5) {
															local858 = 0;
															local862 = 0;
														}
														local808.method1932(local858 + local675, local862 + local685, 128);
														if (arg7 != -1) {
															@Pc(907) Class60 local907 = arg2[arg7 & 0xFFFF];
															local909 = Static150.anInt4225;
															local911 = Static150.anInt4228;
															if (local909 > local862 + local685 && local907.anInt3029 > 0) {
																local936 = (local909 - local685 - local862) * Static58.anInt1635 / 3;
																if (local936 > Static58.anInt1635 * 10) {
																	local936 = Static58.anInt1635 * 10;
																}
																if (local907.anInt3029 < local936) {
																	local936 = local907.anInt3029;
																}
																Static149.anInt3741 += local936;
																local907.anInt3029 -= local936;
																Static39.method659(local907);
															}
															if (local911 < local862 + local685 + 32 && local907.anInt2977 - local907.anInt3017 > local907.anInt3029) {
																local936 = (local862 + local685 + 32 - local911) * Static58.anInt1635 / 3;
																if (Static58.anInt1635 * 10 < local936) {
																	local936 = Static58.anInt1635 * 10;
																}
																if (local907.anInt2977 - local907.anInt3017 - local907.anInt3029 < local936) {
																	local936 = local907.anInt2977 - local907.anInt3017 - local907.anInt3029;
																}
																Static149.anInt3741 -= local936;
																local907.anInt3029 += local936;
																Static39.method659(local907);
															}
														}
													} else if (local24 == Static67.aClass60_2 && Static156.anInt3818 == local277) {
														local808.method1932(local675, local685, 128);
													} else {
														local808.method1944(local675, local685);
													}
												}
											} else if (local24.anIntArray394 != null && local277 < 20) {
												@Pc(723) Class1_Sub1_Sub12_Sub1 local723 = local24.method2048(local277);
												if (local723 != null) {
													local723.method1944(local675, local685);
												} else if (Static92.aBoolean123) {
													Static39.method659(local24);
												}
											}
											local277++;
										}
									}
								} else if (local24.anInt3032 == 3) {
									if (Static31.method545(local24)) {
										local277 = local24.anInt3034;
										if (local24 == Static107.aClass60_8 && local24.anInt2990 != 0) {
											local277 = local24.anInt2990;
										}
									} else {
										local277 = local24.anInt3013;
										if (local24 == Static107.aClass60_8 && local24.anInt3012 != 0) {
											local277 = local24.anInt3012;
										}
									}
									if (local114 == 0) {
										if (local24.aBoolean149) {
											Static150.method3024(local111, local106, local24.anInt3014, local24.anInt3017, local277);
										} else {
											Static150.method3019(local111, local106, local24.anInt3014, local24.anInt3017, local277);
										}
									} else if (local24.aBoolean149) {
										Static150.method3020(local111, local106, local24.anInt3014, local24.anInt3017, local277, 256 - (local114 & 0xFF));
									} else {
										Static150.method3029(local111, local106, local24.anInt3014, local24.anInt3017, local277, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1185) Class1_Sub1_Sub12_Sub3_Sub1 local1185;
									if (local24.anInt3032 == 4) {
										local1185 = local24.method2056();
										if (local1185 != null) {
											@Pc(1197) Class23 local1197 = local24.aClass23_1142;
											if (Static31.method545(local24)) {
												local304 = local24.anInt3034;
												if (Static107.aClass60_8 == local24 && local24.anInt2990 != 0) {
													local304 = local24.anInt2990;
												}
												if (local24.aClass23_1144.method642() > 0) {
													local1197 = local24.aClass23_1144;
												}
											} else {
												local304 = local24.anInt3013;
												if (Static107.aClass60_8 == local24 && local24.anInt3012 != 0) {
													local304 = local24.anInt3012;
												}
											}
											if (local24.aBoolean155 && local24.anInt3021 != -1) {
												@Pc(1253) Class1_Sub1_Sub7 local1253 = Static2.method118(local24.anInt3021);
												local1197 = local1253.aClass23_431;
												if (local1197 == null) {
													local1197 = aClass23_438;
												}
												if ((local1253.anInt1155 == 1 || local24.anInt2972 != 1) && local24.anInt2972 != -1) {
													local1197 = Static149.method2571(new Class23[] { Static45.aClass23_477, local1197, Static83.aClass23_827, Static36.method588(local24.anInt2972) });
												}
											}
											if (local24 == Static98.aClass60_5) {
												local304 = local24.anInt3013;
												local1197 = Static80.aClass23_787;
											}
											if (!local24.aBoolean155) {
												local1197 = Static170.method473(local24, local1197);
											}
											local1185.method3052(local1197, local111, local106, local24.anInt3014, local24.anInt3017, local304, local24.aBoolean148 ? 0 : -1, local24.anInt2993, local24.anInt2984, local24.anInt3024);
										} else if (Static92.aBoolean123) {
											Static39.method659(local24);
										}
									} else if (local24.anInt3032 == 5) {
										@Pc(1356) Class1_Sub1_Sub12_Sub1 local1356;
										if (local24.aBoolean155) {
											if (local24.anInt3021 == -1) {
												local1356 = local24.method2052(false);
											} else {
												local1356 = Static71.method1274(local24.anInt3038, local24.anInt3021, local24.anInt3004, false, local24.anInt2972);
											}
											if (local1356 != null) {
												local304 = local1356.anInt2797;
												local664 = local1356.anInt2800;
												if (local24.aBoolean145) {
													Static150.method3017(local111, local106, local24.anInt3014 + local111, local106 - -local24.anInt3017);
													local675 = (local24.anInt3014 + local304 - 1) / local304;
													local685 = (local24.anInt3017 + local664 - 1) / local664;
													for (local858 = 0; local858 < local675; local858++) {
														for (local862 = 0; local862 < local685; local862++) {
															if (local24.anInt3031 != 0) {
																local1356.method1931(local304 / 2 + local304 * local858 + local111, local862 * local664 + local106 + local664 / 2, local24.anInt3031, 4096);
															} else if (local114 == 0) {
																local1356.method1944(local111 + local858 * local304, local106 - -(local862 * local664));
															} else {
																local1356.method1932(local858 * local304 + local111, local664 * local862 + local106, 256 - (local114 & 0xFF));
															}
														}
													}
													Static150.method3022(arg1, arg5, arg6, arg8);
												} else {
													local675 = local24.anInt3014 * 4096 / local304;
													if (local24.anInt3031 != 0) {
														local1356.method1931(local24.anInt3014 / 2 + local111, local24.anInt3017 / 2 + local106, local24.anInt3031, local675);
													} else if (local114 != 0) {
														local1356.method1922(local111, local106, local24.anInt3014, local24.anInt3017, 256 - (local114 & 0xFF));
													} else if (local304 == local24.anInt3014 && local664 == local24.anInt3017) {
														local1356.method1944(local111, local106);
													} else {
														local1356.method1942(local111, local106, local24.anInt3014, local24.anInt3017);
													}
												}
											} else if (Static92.aBoolean123) {
												Static39.method659(local24);
											}
										} else {
											local1356 = local24.method2052(Static31.method545(local24));
											if (local1356 != null) {
												local1356.method1944(local111, local106);
											} else if (Static92.aBoolean123) {
												Static39.method659(local24);
											}
										}
									} else {
										@Pc(1650) Class1_Sub1_Sub7 local1650;
										if (local24.anInt3032 == 6) {
											@Pc(1624) Class1_Sub1_Sub1_Sub2 local1624 = null;
											@Pc(1628) boolean local1628 = Static31.method545(local24);
											local675 = 0;
											if (local1628) {
												local304 = local24.anInt3005;
											} else {
												local304 = local24.anInt2975;
											}
											if (local24.anInt3021 != -1) {
												local1650 = Static2.method118(local24.anInt3021);
												if (local1650 != null) {
													local1650 = local1650.method707(local24.anInt2972);
													local1624 = local1650.method703(0, 1, null);
													if (local1624 == null) {
														Static39.method659(local24);
													} else {
														local1624.method1085();
														local675 = -local1624.aShort36 / 2;
													}
												}
											} else if (local24.anInt3000 == 5) {
												if (local24.anInt2982 == -1) {
													local1624 = Static5.aClass41_35.method1188(-1, null, -1, null);
												} else {
													local685 = local24.anInt2982 & 0x7FF;
													if (local685 == Static72.anInt1984) {
														local685 = 2047;
													}
													@Pc(1767) Class1_Sub1_Sub1_Sub1_Sub1 local1767 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local685];
													@Pc(1777) Class1_Sub1_Sub18 local1777 = local304 == -1 ? null : Static157.method2652(local304);
													if (local1767 != null && (int) local1767.aClass23_68.method643() << 11 == (local24.anInt2982 & 0xFFFFF800)) {
														local1624 = local1767.aClass41_5.method1188(local24.anInt2976, null, 0, local1777);
													}
												}
											} else if (local304 == -1) {
												local1624 = local24.method2051(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass41_5, null, -1, local1628);
												if (local1624 == null && Static92.aBoolean123) {
													Static39.method659(local24);
												}
											} else {
												@Pc(1694) Class1_Sub1_Sub18 local1694 = Static157.method2652(local304);
												local1624 = local24.method2051(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass41_5, local1694, local24.anInt2976, local1628);
												if (local1624 == null && Static92.aBoolean123) {
													Static39.method659(local24);
												}
											}
											if (local1624 != null) {
												Static121.method2143(local24.anInt3040 + local111 + local24.anInt3014 / 2, local106 + local24.anInt3017 / 2 - -local24.anInt2970);
												local685 = local24.anInt3030 * Class1_Sub1_Sub12_Sub2.anIntArray416[local24.anInt2979] >> 16;
												local858 = Class1_Sub1_Sub12_Sub2.anIntArray417[local24.anInt2979] * local24.anInt3030 >> 16;
												if (!local24.aBoolean155) {
													local1624.method1082(local24.anInt2978, 0, local24.anInt2979, 0, local685, local858);
												} else if (local24.aBoolean146) {
													local1624.method1075(local24.anInt2978, local24.anInt2983, local24.anInt2979, local24.anInt2988, local24.anInt3035 + local685 + local675, local858 + local24.anInt3035, local24.anInt3030);
												} else {
													local1624.method1082(local24.anInt2978, local24.anInt2983, local24.anInt2979, local24.anInt2988, local24.anInt3035 + local675 + local685, local24.anInt3035 + local858);
												}
												Static121.method2140();
											}
										} else {
											if (local24.anInt3032 == 7) {
												local1185 = local24.method2056();
												if (local1185 == null) {
													if (Static92.aBoolean123) {
														Static39.method659(local24);
													}
													continue;
												}
												local304 = 0;
												for (local664 = 0; local664 < local24.anInt3017; local664++) {
													for (local675 = 0; local675 < local24.anInt3014; local675++) {
														if (local24.anIntArray397[local304] > 0) {
															local1650 = Static2.method118(local24.anIntArray397[local304] - 1);
															@Pc(1984) Class23 local1984;
															if (local1650.anInt1155 != 1 && local24.anIntArray398[local304] == 1) {
																local1984 = Static149.method2571(new Class23[] { Static45.aClass23_477, local1650.aClass23_431, Static67.aClass23_650 });
															} else {
																local1984 = Static149.method2571(new Class23[] { Static45.aClass23_477, local1650.aClass23_431, Static83.aClass23_827, Static36.method588(local24.anIntArray398[local304]) });
															}
															local862 = local111 + (local24.anInt3009 + 115) * local675;
															local749 = (local24.anInt3003 + 12) * local664 + local106;
															if (local24.anInt2993 == 0) {
																local1185.method3058(local1984, local862, local749, local24.anInt3013, local24.aBoolean148 ? 0 : -1);
															} else if (local24.anInt2993 == 1) {
																local1185.method3039(local1984, local862 + local24.anInt3014 / 2, local749, local24.anInt3013, local24.aBoolean148 ? 0 : -1);
															} else {
																local1185.method3053(local1984, local862 + local24.anInt3014 - 1, local749, local24.anInt3013, local24.aBoolean148 ? 0 : -1);
															}
														}
														local304++;
													}
												}
											}
											@Pc(2274) int local2274;
											if (local24.anInt3032 == 8 && Static74.aClass60_3 == local24 && Static88.anInt2338 == Static33.anInt951) {
												local277 = 0;
												@Pc(2132) Class23 local2132 = local24.aClass23_1142;
												@Pc(2134) Class1_Sub1_Sub12_Sub3_Sub1 local2134 = Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1;
												local304 = 0;
												local2132 = Static170.method473(local24, local2132);
												@Pc(2157) Class23 local2157;
												while (local2132.method642() > 0) {
													local858 = local2132.method655(Static26.aClass23_288);
													if (local858 == -1) {
														local2157 = local2132;
														local2132 = Static101.aClass23_1001;
													} else {
														local2157 = local2132.method635(0, local858);
														local2132 = local2132.method632(local858 + 4);
													}
													local862 = local2134.method3056(local2157);
													local304 += local2134.anInt4238 + 1;
													if (local277 < local862) {
														local277 = local862;
													}
												}
												local304 += 7;
												local277 += 6;
												local858 = local111 + local24.anInt3014 - local277 - 5;
												local862 = local24.anInt3017 + local106 + 5;
												if (arg8 < local304 + local862) {
													local862 = arg8 - local304;
												}
												if (local111 + 5 > local858) {
													local858 = local111 + 5;
												}
												if (arg6 < local858 + local277) {
													local858 = arg6 - local277;
												}
												Static150.method3024(local858, local862, local277, local304, 16777120);
												Static150.method3019(local858, local862, local277, local304, 0);
												local749 = local2134.anInt4238 + local862 + 2;
												local2132 = local24.aClass23_1142;
												local2132 = Static170.method473(local24, local2132);
												while (local2132.method642() > 0) {
													local2274 = local2132.method655(Static26.aClass23_288);
													if (local2274 == -1) {
														local2157 = local2132;
														local2132 = Static101.aClass23_1001;
													} else {
														local2157 = local2132.method635(0, local2274);
														local2132 = local2132.method632(local2274 + 4);
													}
													local2134.method3058(local2157, local858 + 3, local749, 0, -1);
													local749 += local2134.anInt4238 + 1;
												}
											}
											if (local24.anInt3032 == 9) {
												if (local24.anInt3027 == 1) {
													Static150.method3023(local111, local106, local24.anInt3014 + local111, local24.anInt3017 + local106, local24.anInt3013);
												} else {
													local277 = local24.anInt3014 < 0 ? -local24.anInt3014 : local24.anInt3014;
													local304 = local24.anInt3017 >= 0 ? local24.anInt3017 : -local24.anInt3017;
													local664 = local277;
													if (local277 < local304) {
														local664 = local304;
													}
													if (local664 != 0) {
														local685 = (local24.anInt3017 << 16) / local664;
														local675 = (local24.anInt3014 << 16) / local664;
														if (local675 < local685) {
															local685 = -local685;
														} else {
															local675 = -local675;
														}
														local2274 = local675 * local24.anInt3027 + 1 >> 17;
														local858 = local24.anInt3027 * local685 >> 17;
														local862 = local685 * local24.anInt3027 + 1 >> 17;
														local749 = local675 * local24.anInt3027 >> 17;
														@Pc(2445) int local2445 = local111 - arg1;
														local936 = local2445 - local862;
														@Pc(2458) int local2458 = local24.anInt3014 + local2445 + local858;
														local911 = local2445 + local858;
														local909 = local106 - arg5;
														@Pc(2471) int local2471 = local909 + local749;
														@Pc(2478) int local2478 = local2445 + local24.anInt3014 - local862;
														@Pc(2486) int local2486 = local24.anInt3017 + local909 - local2274;
														@Pc(2493) int local2493 = local24.anInt3017 + local909 + local749;
														Static121.method2151(local911, local936, local2478);
														@Pc(2501) int local2501 = local909 - local2274;
														Static121.method2150(local2471, local2501, local2486, local911, local936, local2478, local24.anInt3013);
														Static121.method2151(local911, local2478, local2458);
														Static121.method2150(local2471, local2486, local2493, local911, local2478, local2458, local24.anInt3013);
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

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method712() {
		while (true) {
			@Pc(10) Class56 local10 = Static102.aClass56_10;
			@Pc(17) Class1_Sub25 local17;
			synchronized (Static102.aClass56_10) {
				local17 = (Class1_Sub25) Static47.aClass56_4.method1857();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass30_Sub1_19.method1308(local17.aByteArray47, (int) local17.aLong140, local17.aClass27_6, false);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	public static void method713() {
		aClass23_437 = null;
		aClass23_439 = null;
		aClass30_Sub1_4 = null;
		aClass23_438 = null;
		aClass1_Sub1_Sub12_Sub4Array2 = null;
		anIntArray140 = null;
		aClass23_436 = null;
	}
}
