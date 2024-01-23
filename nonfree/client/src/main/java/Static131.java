import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "[I")
	public static int[] anIntArray489;

	@OriginalMember(owner = "client!mi", name = "T", descriptor = "[Z")
	public static boolean[] aBooleanArray90;

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!mi", name = "mb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_585 = Static199.method3560("www)2wtrc");

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!qe;)Lclient!qe;")
	public static Class78 method2396(@OriginalArg(1) Class78 arg0) {
		@Pc(13) Class2_Sub27 local13 = Static112.method1914(arg0);
		return local13 == null ? Static91.aClass78_448 : local13.aClass78_858;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z[Lclient!mj;IIIIIIII)V")
	public static void method2397(@OriginalArg(1) Class64[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static217.method3759(arg8, arg1, arg3, arg5);
		Static163.method2944();
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class64 local20 = arg0[local14];
			if (local20 != null && (local20.anInt3075 == arg7 || arg7 == -1412584499 && local20 == Static227.aClass64_17)) {
				@Pc(46) int local46;
				if (arg2 == -1) {
					Static123.anIntArray461[Static109.anInt2416] = local20.anInt3004 + arg4;
					Static56.anIntArray160[Static109.anInt2416] = local20.anInt3052 + arg6;
					Static202.anIntArray728[Static109.anInt2416] = local20.anInt3021;
					Static92.anIntArray363[Static109.anInt2416] = local20.anInt3040;
					local46 = Static109.anInt2416++;
				} else {
					local46 = arg2;
				}
				local20.anInt3042 = Static123.anInt2808;
				local20.anInt3005 = local46;
				if (!local20.aBoolean132 || !Static36.method472(local20)) {
					if (local20.anInt3002 > 0) {
						Static223.method3926(local20);
					}
					@Pc(104) int local104 = local20.anInt3047;
					@Pc(109) int local109 = arg6 + local20.anInt3052;
					@Pc(114) int local114 = local20.anInt3004 + arg4;
					if (Static57.aBoolean21 && (Static36.method473(local20) != 0 || local20.anInt3051 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(152) int local152;
					@Pc(163) int local163;
					if (local20 == Static227.aClass64_17) {
						if (arg7 != -1412584499 && !local20.aBoolean122) {
							Static40.aClass64Array1 = arg0;
							Static80.anInt1730 = arg4;
							Static183.anInt4268 = arg6;
							continue;
						}
						if (Static60.aBoolean39 && Static226.aBoolean213) {
							local152 = Static44.anInt806;
							local152 -= Static114.anInt2545;
							if (Static4.anInt119 > local152) {
								local152 = Static4.anInt119;
							}
							local163 = Static81.anInt1744;
							local163 -= Static148.anInt3382;
							if (Static223.aClass64_14.anInt3021 + Static4.anInt119 < local152 - -local20.anInt3021) {
								local152 = Static223.aClass64_14.anInt3021 + Static4.anInt119 - local20.anInt3021;
							}
							if (Static202.anInt4530 > local163) {
								local163 = Static202.anInt4530;
							}
							if (Static202.anInt4530 + Static223.aClass64_14.anInt3040 < local20.anInt3040 + local163) {
								local163 = Static223.aClass64_14.anInt3040 + Static202.anInt4530 - local20.anInt3040;
							}
							local114 = local152;
							local109 = local163;
						}
						if (!local20.aBoolean122) {
							local104 = 128;
						}
					}
					@Pc(282) int local282;
					@Pc(289) int local289;
					@Pc(263) int local263;
					@Pc(258) int local258;
					if (local20.anInt3051 == 2) {
						local152 = arg8;
						local163 = arg1;
						local289 = arg5;
						local282 = arg3;
					} else {
						local163 = local109 > arg1 ? local109 : arg1;
						local152 = local114 <= arg8 ? arg8 : local114;
						local258 = local20.anInt3040 + local109;
						local263 = local20.anInt3021 + local114;
						if (local20.anInt3051 == 9) {
							local258++;
							local263++;
						}
						local282 = arg3 > local263 ? local263 : arg3;
						local289 = arg5 <= local258 ? arg5 : local258;
					}
					if (!local20.aBoolean132 || local152 < local282 && local289 > local163) {
						@Pc(549) int local549;
						@Pc(538) int local538;
						if (local20.anInt3002 != 0) {
							if (local20.anInt3002 == 1337) {
								Static28.anInt499 = local114;
								Static93.anInt2055 = local109;
								Static226.aClass64_16 = local20;
								Static82.method1367(local114, local20.anInt3002 == 1403, local20.anInt3040, local109, local20.anInt3021);
								Static217.method3759(arg8, arg1, arg3, arg5);
								continue;
							}
							if (local20.anInt3002 == 1338) {
								if (local20.method2406()) {
									Static67.method667(local109, local114, local20, local46);
									Static217.method3759(arg8, arg1, arg3, arg5);
								}
								continue;
							}
							if (local20.anInt3002 == 1339) {
								if (local20.method2406()) {
									Static216.method3745(local114, local46, local109, local20);
									Static217.method3759(arg8, arg1, arg3, arg5);
								}
								continue;
							}
							if (local20.anInt3002 == 1400) {
								Static173.method3151(local20.anInt3021, local109, local114, local20.anInt3040);
								Static165.aBooleanArray111[local46] = true;
								Static84.aBooleanArray57[local46] = true;
								Static217.method3759(arg8, arg1, arg3, arg5);
								continue;
							}
							if (local20.anInt3002 == 1401) {
								Static20.method288(local20.anInt3040, local109, local20.anInt3021, local114);
								Static165.aBooleanArray111[local46] = true;
								Static84.aBooleanArray57[local46] = true;
								Static217.method3759(arg8, arg1, arg3, arg5);
								continue;
							}
							if (local20.anInt3002 == 1402) {
								Static157.method2819(local109, local114);
								Static165.aBooleanArray111[local46] = true;
								Static84.aBooleanArray57[local46] = true;
								continue;
							}
							if (local20.anInt3002 == 1404) {
								Static180.method3307(local20, local109, Static110.aClass2_Sub3_Sub7_2, local20.anInt3040, local114, Static75.aClass2_Sub3_Sub7_1, local20.anInt3021);
								Static165.aBooleanArray111[local46] = true;
								Static84.aBooleanArray57[local46] = true;
								continue;
							}
							if (local20.anInt3002 == 1405) {
								if (Static108.aBoolean95) {
									local263 = local114 + local20.anInt3021;
									local258 = local109 + 15;
									Static211.aClass2_Sub3_Sub7_3.method877(Static94.method1640(new Class78[] { Static126.aClass78_577, Static19.method268(Static180.anInt4191) }), local263, local258, 16776960, -1);
									local258 += 15;
									local538 = 16776960;
									@Pc(540) Runtime local540 = Runtime.getRuntime();
									local549 = (int) ((local540.totalMemory() - local540.freeMemory()) / 1024L);
									if (local549 > 65536) {
										local538 = 16711680;
									}
									Static211.aClass2_Sub3_Sub7_3.method877(Static94.method1640(new Class78[] { Static148.aClass78_625, Static19.method268(local549), Static96.aClass78_466 }), local263, local258, local538, -1);
									local258 += 15;
									Static165.aBooleanArray111[local46] = true;
									Static84.aBooleanArray57[local46] = true;
								}
								continue;
							}
						}
						local258 = Static81.anInt1744;
						if (local20.anInt3051 == 0 && local20.aBoolean128 && local152 <= Static44.anInt806 && Static81.anInt1744 >= local163 && Static44.anInt806 < local282 && Static81.anInt1744 < local289 && !Static202.aBoolean194 && !Static57.aBoolean21) {
							Static79.aShortArray53[0] = 1006;
							Static32.aClass78Array30[0] = Static20.aClass78_72;
							Static57.aClass78Array6[0] = Static73.aClass78_352;
							Static138.anInt3182 = 1;
						}
						local263 = Static44.anInt806;
						if (!Static202.aBoolean194 && local263 >= local152 && local258 >= local163 && local282 > local263 && local258 < local289) {
							Static10.method221(local263 - local114, local20, local258 - local109);
						}
						if (local20.anInt3051 == 0) {
							if (!local20.aBoolean132 && Static36.method472(local20) && Static132.aClass64_10 != local20) {
								continue;
							}
							if (!local20.aBoolean132) {
								if (local20.anInt3046 > local20.anInt3082 - local20.anInt3040) {
									local20.anInt3046 = local20.anInt3082 - local20.anInt3040;
								}
								if (local20.anInt3046 < 0) {
									local20.anInt3046 = 0;
								}
							}
							method2397(arg0, local163, local46, local282, local114 - local20.anInt3037, local289, local109 - local20.anInt3046, local20.anInt3044, local152);
							if (local20.aClass64Array2 != null) {
								method2397(local20.aClass64Array2, local163, local46, local282, local114 - local20.anInt3037, local289, local109 - local20.anInt3046, local20.anInt3044, local152);
							}
							@Pc(775) Class2_Sub11 local775 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local20.anInt3044);
							if (local775 != null) {
								if (local775.anInt729 == 0 && Static44.anInt806 >= local152 && Static81.anInt1744 >= local163 && Static44.anInt806 < local282 && local289 > Static81.anInt1744 && !Static202.aBoolean194 && !Static57.aBoolean21) {
									Static79.aShortArray53[0] = 1006;
									Static32.aClass78Array30[0] = Static20.aClass78_72;
									Static138.anInt3182 = 1;
									Static57.aClass78Array6[0] = Static73.aClass78_352;
								}
								Static185.method3423(local114, local163, local282, local775.anInt726, local289, local152, local109, local46);
							}
							Static217.method3759(arg8, arg1, arg3, arg5);
							Static163.method2944();
						}
						if (Static162.aBooleanArray108[local46] || Static89.anInt1998 > 1) {
							if (local20.anInt3051 == 0 && !local20.aBoolean132 && local20.anInt3040 < local20.anInt3082) {
								Static225.method3968(local109, local20.anInt3082, local20.anInt3040, local20.anInt3046, local114 + local20.anInt3021);
							}
							if (local20.anInt3051 != 1) {
								@Pc(892) int local892;
								@Pc(1088) int local1088;
								@Pc(965) int local965;
								@Pc(875) int local875;
								@Pc(1083) int local1083;
								@Pc(902) int local902;
								if (local20.anInt3051 == 2) {
									local875 = 0;
									for (local549 = 0; local549 < local20.anInt3064; local549++) {
										for (local538 = 0; local538 < local20.anInt3018; local538++) {
											local892 = (local20.anInt3023 + 32) * local538 + local114;
											local902 = local549 * (local20.anInt3035 + 32) + local109;
											if (local875 < 20) {
												local902 += local20.anIntArray498[local875];
												local892 += local20.anIntArray502[local875];
											}
											if (local20.anIntArray493[local875] > 0) {
												local965 = local20.anIntArray493[local875] - 1;
												if (arg8 < local892 + 32 && local892 < arg3 && local902 + 32 > arg1 && arg5 > local902 || local20 == Static55.aClass64_4 && local875 == Static67.anInt931) {
													@Pc(1027) Class2_Sub3_Sub8 local1027;
													if (Static121.anInt4906 == 1 && local875 == Static213.anInt2031 && local20.anInt3044 == Static73.anInt1574) {
														local1027 = Static110.method1905(local20.aBoolean131, local20.anIntArray496[local875], 2, 0, local965);
													} else {
														local1027 = Static110.method1905(local20.aBoolean131, local20.anIntArray496[local875], 1, 3153952, local965);
													}
													if (Static163.aBoolean162) {
														Static165.aBooleanArray111[local46] = true;
													}
													if (local1027 == null) {
														Static70.method2259(local20);
													} else if (local20 == Static55.aClass64_4 && local875 == Static67.anInt931) {
														local1083 = Static44.anInt806 - Static49.anInt904;
														local1088 = Static81.anInt1744 - Static10.anInt309;
														if (local1088 < 5 && local1088 > -5) {
															local1088 = 0;
														}
														if (local1083 < 5 && local1083 > -5) {
															local1083 = 0;
														}
														if (Static181.anInt4196 < 5) {
															local1083 = 0;
															local1088 = 0;
														}
														local1027.method2255(local892 + local1083, local1088 + local902, 128);
														if (arg7 != -1) {
															@Pc(1135) int local1135 = Static217.anInt4730;
															@Pc(1137) int local1137 = Static217.anInt4734;
															@Pc(1143) Class64 local1143 = arg0[arg7 & 0xFFFF];
															@Pc(1164) int local1164;
															if (local902 + local1088 < local1137 && local1143.anInt3046 > 0) {
																local1164 = Static44.anInt797 * (local1137 - local1088 - local902) / 3;
																if (Static44.anInt797 * 10 < local1164) {
																	local1164 = Static44.anInt797 * 10;
																}
																if (local1143.anInt3046 < local1164) {
																	local1164 = local1143.anInt3046;
																}
																Static10.anInt309 += local1164;
																local1143.anInt3046 -= local1164;
																Static70.method2259(local1143);
															}
															if (local1135 < local1088 + local902 + 32 && local1143.anInt3046 < local1143.anInt3082 - local1143.anInt3040) {
																local1164 = (local902 + local1088 + 32 - local1135) * Static44.anInt797 / 3;
																if (Static44.anInt797 * 10 < local1164) {
																	local1164 = Static44.anInt797 * 10;
																}
																if (local1143.anInt3082 - local1143.anInt3040 - local1143.anInt3046 < local1164) {
																	local1164 = local1143.anInt3082 - local1143.anInt3040 - local1143.anInt3046;
																}
																Static10.anInt309 -= local1164;
																local1143.anInt3046 += local1164;
																Static70.method2259(local1143);
															}
														}
													} else if (Static68.aClass64_7 == local20 && Static69.anInt1366 == local875) {
														local1027.method2255(local892, local902, 128);
													} else {
														local1027.method2262(local892, local902);
													}
												}
											} else if (local20.anIntArray492 != null && local875 < 20) {
												@Pc(939) Class2_Sub3_Sub8 local939 = local20.method2410(local875);
												if (local939 != null) {
													local939.method2262(local892, local902);
												} else if (Static21.aBoolean11) {
													Static70.method2259(local20);
												}
											}
											local875++;
										}
									}
								} else if (local20.anInt3051 == 3) {
									if (Static47.method627(local20)) {
										local875 = local20.anInt3077;
										if (local20 == Static132.aClass64_10 && local20.anInt3039 != 0) {
											local875 = local20.anInt3039;
										}
									} else {
										local875 = local20.anInt3003;
										if (Static132.aClass64_10 == local20 && local20.anInt3031 != 0) {
											local875 = local20.anInt3031;
										}
									}
									if (local104 == 0) {
										if (local20.aBoolean124) {
											Static217.method3761(local114, local109, local20.anInt3021, local20.anInt3040, local875);
										} else {
											Static217.method3751(local114, local109, local20.anInt3021, local20.anInt3040, local875);
										}
									} else if (local20.aBoolean124) {
										Static217.method3749(local114, local109, local20.anInt3021, local20.anInt3040, local875, 256 - (local104 & 0xFF));
									} else {
										Static217.method3768(local114, local109, local20.anInt3021, local20.anInt3040, local875, 256 - (local104 & 0xFF));
									}
								} else {
									@Pc(1410) Class2_Sub3_Sub7 local1410;
									if (local20.anInt3051 == 4) {
										local1410 = local20.method2400(Static73.aClass79Array5);
										if (local1410 != null) {
											@Pc(1422) Class78 local1422 = local20.aClass78_589;
											if (Static47.method627(local20)) {
												local549 = local20.anInt3077;
												if (Static132.aClass64_10 == local20 && local20.anInt3039 != 0) {
													local549 = local20.anInt3039;
												}
												if (local20.aClass78_586.method3041() > 0) {
													local1422 = local20.aClass78_586;
												}
											} else {
												local549 = local20.anInt3003;
												if (local20 == Static132.aClass64_10 && local20.anInt3031 != 0) {
													local549 = local20.anInt3031;
												}
											}
											if (local20.aBoolean132 && local20.anInt3029 != -1) {
												@Pc(1479) Class2_Sub3_Sub23 local1479 = Static32.method3209(local20.anInt3029);
												local1422 = local1479.aClass78_640;
												if (local1422 == null) {
													local1422 = Static100.aClass78_482;
												}
												if ((local1479.anInt3505 == 1 || local20.anInt3033 != 1) && local20.anInt3033 != -1) {
													local1422 = Static94.method1640(new Class78[] { Static113.aClass78_532, local1422, Static85.aClass78_426, Static152.method2725(local20.anInt3033) });
												}
											}
											if (local20 == Static119.aClass64_9) {
												local549 = local20.anInt3003;
												local1422 = Static20.aClass78_71;
											}
											if (!local20.aBoolean132) {
												local1422 = Static96.method1682(local1422, local20);
											}
											local1410.method905(local1422, local114, local109, local20.anInt3021, local20.anInt3040, local549, local20.aBoolean136 ? 0 : -1, local20.anInt3080, local20.anInt3032, local20.anInt2999);
										} else if (Static21.aBoolean11) {
											Static70.method2259(local20);
										}
									} else if (local20.anInt3051 == 5) {
										@Pc(1596) Class2_Sub3_Sub8 local1596;
										if (local20.aBoolean132) {
											if (local20.anInt3029 == -1) {
												local1596 = local20.method2403(false);
											} else {
												local1596 = Static110.method1905(local20.aBoolean131, local20.anInt3033, local20.anInt3007, local20.anInt3059, local20.anInt3029);
											}
											if (local1596 != null) {
												local538 = local1596.anInt2844;
												local549 = local1596.anInt2850;
												if (local20.aBoolean135) {
													local892 = (local20.anInt3021 + local549 - 1) / local549;
													local902 = (local538 + local20.anInt3040 - 1) / local538;
													Static217.method3764(local114, local109, local114 + local20.anInt3021, local20.anInt3040 + local109);
													for (local1083 = 0; local1083 < local892; local1083++) {
														for (local1088 = 0; local1088 < local902; local1088++) {
															if (local20.anInt3030 != 0) {
																local1596.method2258(local20.anInt3030, 4096, local109 + local538 * local1088 + local538 / 2, local1083 * local549 + (local114 - -(local549 / 2)));
															} else if (local104 == 0) {
																local1596.method2262(local114 + local1083 * local549, local109 - -(local1088 * local538));
															} else {
																local1596.method2255(local1083 * local549 + local114, local538 * local1088 + local109, 256 - (local104 & 0xFF));
															}
														}
													}
													Static217.method3759(arg8, arg1, arg3, arg5);
												} else {
													local892 = local20.anInt3021 * 4096 / local549;
													if (local20.anInt3030 != 0) {
														local1596.method2258(local20.anInt3030, local892, local20.anInt3040 / 2 + local109, local20.anInt3021 / 2 + local114);
													} else if (local104 != 0) {
														local1596.method2257(local114, local109, local20.anInt3021, local20.anInt3040, 256 - (local104 & 0xFF));
													} else if (local20.anInt3021 == local549 && local538 == local20.anInt3040) {
														local1596.method2262(local114, local109);
													} else {
														local1596.method2253(local114, local109, local20.anInt3021, local20.anInt3040);
													}
												}
											} else if (Static21.aBoolean11) {
												Static70.method2259(local20);
											}
										} else {
											local1596 = local20.method2403(Static47.method627(local20));
											if (local1596 != null) {
												local1596.method2262(local114, local109);
											} else if (Static21.aBoolean11) {
												Static70.method2259(local20);
											}
										}
									} else {
										@Pc(1996) Class2_Sub3_Sub23 local1996;
										@Pc(2113) int local2113;
										if (local20.anInt3051 == 6) {
											@Pc(1856) boolean local1856 = Static47.method627(local20);
											if (local1856) {
												local549 = local20.anInt2996;
											} else {
												local549 = local20.anInt3058;
											}
											local892 = 0;
											@Pc(1870) Class5_Sub3 local1870 = null;
											if (local20.anInt3029 != -1) {
												local1996 = Static32.method3209(local20.anInt3029);
												if (local1996 != null) {
													local1996 = local1996.method2736(local20.anInt3033);
													@Pc(2018) Class2_Sub3_Sub3 local2018 = local549 == -1 ? null : Static187.method3447(local549);
													local1870 = local1996.method2737(1, local2018, local20.anInt3050);
													if (local1870 == null) {
														Static70.method2259(local20);
													} else {
														local892 = -local1870.method3773() / 2;
													}
												}
											} else if (local20.anInt3024 == 5) {
												if (local20.anInt3067 == -1) {
													local1870 = Static106.aClass112_2.method3940(-1, -1, null, null);
												} else {
													local902 = local20.anInt3067 & 0x7FF;
													if (Static195.anInt4463 == local902) {
														local902 = 2047;
													}
													@Pc(1956) Class5_Sub2_Sub2 local1956 = Static213.aClass5_Sub2_Sub2Array3[local902];
													@Pc(1966) Class2_Sub3_Sub3 local1966 = local549 == -1 ? null : Static187.method3447(local549);
													if (local1956 != null && (int) local1956.aClass78_423.method3016() << 11 == (local20.anInt3067 & 0xFFFFF800)) {
														local1870 = local1956.aClass112_1.method3940(0, local20.anInt3050, local1966, null);
													}
												}
											} else if (local549 == -1) {
												local1870 = local20.method2412(Static31.aClass5_Sub2_Sub2_1.aClass112_1, -1, local1856, null);
												if (local1870 == null && Static21.aBoolean11) {
													Static70.method2259(local20);
												}
											} else {
												@Pc(1889) Class2_Sub3_Sub3 local1889 = Static187.method3447(local549);
												local1870 = local20.method2412(Static31.aClass5_Sub2_Sub2_1.aClass112_1, local20.anInt3050, local1856, local1889);
												if (local1870 == null && Static21.aBoolean11) {
													Static70.method2259(local20);
												}
											}
											if (local1870 != null) {
												if (local20.anInt3068 > 0) {
													local1083 = (local20.anInt3040 << 8) / local20.anInt3068;
												} else {
													local1083 = 256;
												}
												if (local20.anInt3013 <= 0) {
													local902 = 256;
												} else {
													local902 = (local20.anInt3021 << 8) / local20.anInt3013;
												}
												local1088 = local20.anInt3021 / 2 + local114 + (local902 * local20.anInt3078 >> 8);
												local965 = (local1083 * local20.anInt3009 >> 8) + local109 + local20.anInt3040 / 2;
												Static163.method2939(local1088, local965);
												local2113 = Class77.anIntArray631[local20.anInt2994] * local20.anInt3012 >> 16;
												@Pc(2123) int local2123 = Class77.anIntArray632[local20.anInt2994] * local20.anInt3012 >> 16;
												if (!local20.aBoolean132) {
													local1870.method1415(local20.anInt3028, 0, local20.anInt2994, 0, local2113, local2123);
												} else if (local20.aBoolean129) {
													((Class5_Sub3_Sub1) local1870).method1434(local20.anInt3028, local20.anInt3017, local20.anInt2994, local20.anInt3062, local892 + local2113 + local20.anInt3015, local20.anInt3015 + local2123, local20.anInt3012);
												} else {
													local1870.method1415(local20.anInt3028, local20.anInt3017, local20.anInt2994, local20.anInt3062, local892 + local2113 + local20.anInt3015, local2123 + local20.anInt3015);
												}
												Static163.method2934();
											}
										} else {
											if (local20.anInt3051 == 7) {
												local1410 = local20.method2400(Static73.aClass79Array5);
												if (local1410 == null) {
													if (Static21.aBoolean11) {
														Static70.method2259(local20);
													}
													continue;
												}
												local549 = 0;
												for (local538 = 0; local538 < local20.anInt3064; local538++) {
													for (local892 = 0; local892 < local20.anInt3018; local892++) {
														if (local20.anIntArray493[local549] > 0) {
															local1996 = Static32.method3209(local20.anIntArray493[local549] - 1);
															@Pc(2277) Class78 local2277;
															if (local1996.anInt3505 != 1 && local20.anIntArray496[local549] == 1) {
																local2277 = Static94.method1640(new Class78[] { Static113.aClass78_532, local1996.aClass78_640, Static173.aClass78_689 });
															} else {
																local2277 = Static94.method1640(new Class78[] { Static113.aClass78_532, local1996.aClass78_640, Static85.aClass78_426, Static152.method2725(local20.anIntArray496[local549]) });
															}
															local965 = (local20.anInt3035 + 12) * local538 + local109;
															local1088 = (local20.anInt3023 + 115) * local892 + local114;
															if (local20.anInt3080 == 0) {
																local1410.method904(local2277, local1088, local965, local20.anInt3003, local20.aBoolean136 ? 0 : -1);
															} else if (local20.anInt3080 == 1) {
																local1410.method886(local2277, local1088 + 57, local965, local20.anInt3003, local20.aBoolean136 ? 0 : -1);
															} else {
																local1410.method877(local2277, local1088 + 114, local965, local20.anInt3003, local20.aBoolean136 ? 0 : -1);
															}
														}
														local549++;
													}
												}
											}
											if (local20.anInt3051 == 8 && local20 == Static185.aClass64_13 && Static125.anInt1648 == Static148.anInt3377) {
												local875 = 0;
												local549 = 0;
												@Pc(2409) Class2_Sub3_Sub7 local2409 = Static211.aClass2_Sub3_Sub7_3;
												@Pc(2412) Class78 local2412 = local20.aClass78_589;
												local2412 = Static96.method1682(local2412, local20);
												@Pc(2430) Class78 local2430;
												while (local2412.method3041() > 0) {
													local1083 = local2412.method3036(Static185.aClass78_737);
													if (local1083 == -1) {
														local2430 = local2412;
														local2412 = Static73.aClass78_352;
													} else {
														local2430 = local2412.method3010(0, local1083);
														local2412 = local2412.method3052(local1083 + 4);
													}
													local1088 = local2409.method883(local2430);
													local549 += local2409.anInt1125 + 1;
													if (local1088 > local875) {
														local875 = local1088;
													}
												}
												local549 += 7;
												local1088 = local109 + local20.anInt3040 + 5;
												local875 += 6;
												if (arg5 < local1088 + local549) {
													local1088 = arg5 - local549;
												}
												local1083 = local114 + local20.anInt3021 - local875 - 5;
												if (local1083 < local114 + 5) {
													local1083 = local114 + 5;
												}
												if (local1083 + local875 > arg3) {
													local1083 = arg3 - local875;
												}
												Static217.method3761(local1083, local1088, local875, local549, 16777120);
												Static217.method3751(local1083, local1088, local875, local549, 0);
												local965 = local1088 + local2409.anInt1125 + 2;
												local2412 = local20.aClass78_589;
												local2412 = Static96.method1682(local2412, local20);
												while (local2412.method3041() > 0) {
													local2113 = local2412.method3036(Static185.aClass78_737);
													if (local2113 == -1) {
														local2430 = local2412;
														local2412 = Static73.aClass78_352;
													} else {
														local2430 = local2412.method3010(0, local2113);
														local2412 = local2412.method3052(local2113 + 4);
													}
													local2409.method904(local2430, local1083 + 3, local965, 0, -1);
													local965 += local2409.anInt1125 + 1;
												}
											}
											if (local20.anInt3051 == 9) {
												if (local20.aBoolean123) {
													local549 = local109 + local20.anInt3040;
													local538 = local20.anInt3021 + local114;
													local892 = local109;
												} else {
													local549 = local109;
													local538 = local114 + local20.anInt3021;
													local892 = local109 + local20.anInt3040;
												}
												if (local20.anInt2997 == 1) {
													Static217.method3750(local114, local549, local538, local892, local20.anInt3003);
												} else {
													Static217.method3760(local114, local549, local538, local892, local20.anInt3003, local20.anInt2997);
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

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
	public static void method2398() {
		Static98.aClass2_Sub3_Sub8Array6 = null;
		Static62.aClass79Array4 = null;
		Static160.aClass79Array6 = null;
		Static198.aClass79Array7 = null;
	}
}
