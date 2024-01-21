import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "Lclient!gg;")
	public static Class32 aClass32_3;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	public static int anInt2085;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_10 = new Class25(64);

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "Lclient!rf;")
	public static Class70 aClass70_644 = Static49.method1293("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_645 = Static49.method1293("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "[Lclient!fi;")
	public static Class29[] aClass29Array1 = new Class29[6];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[Lclient!ig;IIIIII)V")
	public static void method1540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class39[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static155.method2998(arg2, arg7, arg0, arg1);
		Static1.method93();
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(19) Class39 local19 = arg3[local13];
			if (local19 != null && (arg8 == local19.anInt2325 || arg8 == -1412584499 && local19 == Static110.aClass39_30)) {
				@Pc(72) int local72;
				if (arg6 == -1) {
					Static99.anIntArray437[Static44.anInt1474] = local19.anInt2326 + arg4;
					Static92.anIntArray254[Static44.anInt1474] = arg5 + local19.anInt2338;
					Static19.anIntArray32[Static44.anInt1474] = local19.anInt2340;
					Static146.anIntArray363[Static44.anInt1474] = local19.anInt2369;
					local72 = Static44.anInt1474++;
				} else {
					local72 = arg6;
				}
				local19.anInt2322 = Static47.anInt1654;
				local19.anInt2352 = local72;
				if (!local19.aBoolean89 || !Static169.method3347(local19)) {
					if (local19.anInt2381 > 0) {
						Static71.method1640(local19);
					}
					@Pc(100) int local100 = local19.anInt2326 + arg4;
					@Pc(105) int local105 = arg5 + local19.anInt2338;
					@Pc(108) int local108 = local19.anInt2368;
					@Pc(136) int local136;
					@Pc(142) int local142;
					if (Static110.aClass39_30 == local19) {
						if (arg8 != -1412584499 && !local19.aBoolean81) {
							Static85.anInt2549 = arg4;
							Static124.aClass39Array2 = arg3;
							Static95.anInt2754 = arg5;
							continue;
						}
						if (!local19.aBoolean81) {
							local108 = 128;
						}
						if (Static26.aBoolean29 && Static48.aBoolean61) {
							local136 = Static21.anInt591;
							local136 -= Static147.anInt3873;
							local142 = Static70.anInt2156;
							local142 -= Static123.anInt3348;
							if (local136 < Static132.anInt3450) {
								local136 = Static132.anInt3450;
							}
							if (local19.anInt2340 + local136 > Static119.aClass39_35.anInt2340 + Static132.anInt3450) {
								local136 = Static119.aClass39_35.anInt2340 + Static132.anInt3450 - local19.anInt2340;
							}
							if (Static81.anInt2479 > local142) {
								local142 = Static81.anInt2479;
							}
							local100 = local136;
							if (local142 + local19.anInt2369 > Static119.aClass39_35.anInt2369 + Static81.anInt2479) {
								local142 = Static81.anInt2479 + Static119.aClass39_35.anInt2369 - local19.anInt2369;
							}
							local105 = local142;
						}
					}
					@Pc(266) int local266;
					@Pc(273) int local273;
					@Pc(213) int local213;
					@Pc(234) int local234;
					@Pc(218) int local218;
					@Pc(223) int local223;
					if (local19.anInt2342 == 2) {
						local142 = arg7;
						local273 = arg1;
						local136 = arg2;
						local266 = arg0;
					} else if (local19.anInt2342 == 9) {
						local213 = local100;
						local218 = local100 + local19.anInt2340;
						local223 = local105 + local19.anInt2369;
						if (local100 > local218) {
							local213 = local218;
							local218 = local100;
						}
						local234 = local105;
						local136 = arg2 >= local213 ? arg2 : local213;
						if (local223 < local105) {
							local234 = local223;
							local223 = local105;
						}
						local218++;
						local142 = local234 > arg7 ? local234 : arg7;
						local223++;
						local266 = local218 >= arg0 ? arg0 : local218;
						local273 = local223 < arg1 ? local223 : arg1;
					} else {
						local136 = local100 > arg2 ? local100 : arg2;
						local142 = arg7 >= local105 ? arg7 : local105;
						local213 = local100 + local19.anInt2340;
						local266 = local213 < arg0 ? local213 : arg0;
						local234 = local19.anInt2369 + local105;
						local273 = arg1 > local234 ? local234 : arg1;
					}
					if (!local19.aBoolean89 || local266 > local136 && local142 < local273) {
						if (local19.anInt2381 != 0) {
							if (local19.anInt2381 == 1337) {
								Static149.anInt4000 = local105;
								Static167.anInt4342 = local100;
								Static172.method3410(local100, local19.anInt2369, local105, local19.anInt2340);
								Static155.method2998(arg2, arg7, arg0, arg1);
								continue;
							}
							if (local19.anInt2381 == 1338) {
								if (local19.method1756()) {
									Static79.method1806(local72, local105, local19, local100);
									Static155.method2998(arg2, arg7, arg0, arg1);
								}
								continue;
							}
							if (local19.anInt2381 == 1339) {
								if (local19.method1756()) {
									Static133.method2574(local105, local72, local19, local100);
									Static155.method2998(arg2, arg7, arg0, arg1);
								}
								continue;
							}
						}
						local213 = Static21.anInt591;
						local234 = Static70.anInt2156;
						if (!Static32.aBoolean47 && local213 >= local136 && local142 <= local234 && local266 > local213 && local273 > local234) {
							Static14.method367(local19, local213 - local100, -local105 + local234);
						}
						if (local19.anInt2342 == 0) {
							if (!local19.aBoolean89 && Static169.method3347(local19) && local19 != Static144.aClass39_42) {
								continue;
							}
							if (!local19.aBoolean89) {
								if (local19.anInt2341 > local19.anInt2353 - local19.anInt2369) {
									local19.anInt2341 = local19.anInt2353 - local19.anInt2369;
								}
								if (local19.anInt2341 < 0) {
									local19.anInt2341 = 0;
								}
							}
							method1540(local266, local273, local136, arg3, local100 - local19.anInt2354, local105 + -local19.anInt2341, local72, local142, local19.anInt2355);
							if (local19.aClass39Array1 != null) {
								method1540(local266, local273, local136, local19.aClass39Array1, local100 - local19.anInt2354, -local19.anInt2341 + local105, local72, local142, local19.anInt2355);
							}
							@Pc(532) Class1_Sub14 local532 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local19.anInt2355);
							if (local532 != null) {
								if (local532.anInt2464 == 0 && Static21.anInt591 >= local136 && local142 <= Static70.anInt2156 && Static21.anInt591 < local266 && Static70.anInt2156 < local273 && !Static32.aBoolean47 && !Static125.aBoolean134) {
									Static20.aShortArray7[0] = 1004;
									Static162.anInt4331 = 1;
									Static30.aClass70Array6[0] = Static70.aClass70_676;
									Static174.aClass70Array23[0] = Static35.aClass70_632;
								}
								Static139.method2728(local273, local266, local105, local136, local142, local100, local72, local532.anInt2467);
							}
							Static155.method2998(arg2, arg7, arg0, arg1);
							Static1.method93();
						}
						if (Static164.aBooleanArray19[local72] || Static45.anInt1478 > 1) {
							if (local19.anInt2342 == 0 && !local19.aBoolean89 && local19.anInt2353 > local19.anInt2369) {
								Static120.method2462(local19.anInt2341, local19.anInt2369, local100 + local19.anInt2340, local19.anInt2353, local105);
							}
							if (local19.anInt2342 != 1) {
								@Pc(642) int local642;
								@Pc(654) int local654;
								@Pc(820) int local820;
								@Pc(728) int local728;
								@Pc(875) int local875;
								@Pc(877) int local877;
								@Pc(899) int local899;
								@Pc(664) int local664;
								@Pc(825) int local825;
								if (local19.anInt2342 == 2) {
									local218 = 0;
									for (local223 = 0; local223 < local19.anInt2369; local223++) {
										for (local642 = 0; local642 < local19.anInt2340; local642++) {
											local654 = local100 + (local19.anInt2361 + 32) * local642;
											local664 = local223 * (local19.anInt2366 + 32) + local105;
											if (local218 < 20) {
												local664 += local19.anIntArray229[local218];
												local654 += local19.anIntArray233[local218];
											}
											if (local19.anIntArray228[local218] > 0) {
												local728 = local19.anIntArray228[local218] - 1;
												if (local654 + 32 > arg2 && local654 < arg0 && arg7 < local664 + 32 && arg1 > local664 || local19 == Static20.aClass39_6 && Static146.anInt3839 == local218) {
													@Pc(785) Class1_Sub1_Sub1_Sub4 local785;
													if (Static58.anInt1876 == 1 && Static8.anInt286 == local218 && Static168.anInt2253 == local19.anInt2355) {
														local785 = Static184.method3515(local728, false, local19.anIntArray231[local218], 2, 0);
													} else {
														local785 = Static184.method3515(local728, false, local19.anIntArray231[local218], 1, 3153952);
													}
													if (local785 == null) {
														Static171.method3407(local19);
													} else if (local19 == Static20.aClass39_6 && local218 == Static146.anInt3839) {
														local820 = Static70.anInt2156 - Static77.anInt2390;
														local825 = Static21.anInt591 - Static140.anInt3677;
														if (local825 < 5 && local825 > -5) {
															local825 = 0;
														}
														if (local820 < 5 && local820 > -5) {
															local820 = 0;
														}
														if (Static69.anInt2126 < 5) {
															local825 = 0;
															local820 = 0;
														}
														local785.method3039(local825 + local654, local820 + local664, 128);
														if (arg8 != -1) {
															@Pc(873) Class39 local873 = arg3[arg8 & 0xFFFF];
															local875 = Static155.anInt3965;
															local877 = Static155.anInt3961;
															if (local875 > local664 + local820 && local873.anInt2341 > 0) {
																local899 = (local875 - local820 - local664) * Static72.anInt2243 / 3;
																if (Static72.anInt2243 * 10 < local899) {
																	local899 = Static72.anInt2243 * 10;
																}
																if (local873.anInt2341 < local899) {
																	local899 = local873.anInt2341;
																}
																Static77.anInt2390 += local899;
																local873.anInt2341 -= local899;
																Static171.method3407(local873);
															}
															if (local877 < local820 + local664 + 32 && local873.anInt2341 < local873.anInt2353 - local873.anInt2369) {
																local899 = (local664 + local820 + 32 - local877) * Static72.anInt2243 / 3;
																if (local899 > Static72.anInt2243 * 10) {
																	local899 = Static72.anInt2243 * 10;
																}
																if (local899 > local873.anInt2353 - local873.anInt2341 - local873.anInt2369) {
																	local899 = local873.anInt2353 - local873.anInt2369 - local873.anInt2341;
																}
																Static77.anInt2390 -= local899;
																local873.anInt2341 += local899;
																Static171.method3407(local873);
															}
														}
													} else if (local19 == Static118.aClass39_33 && Static70.anInt2170 == local218) {
														local785.method3039(local654, local664, 128);
													} else {
														local785.method3021(local654, local664);
													}
												}
											} else if (local19.anIntArray235 != null && local218 < 20) {
												@Pc(702) Class1_Sub1_Sub1_Sub4 local702 = local19.method1758(local218);
												if (local702 != null) {
													local702.method3021(local654, local664);
												} else if (Static90.aBoolean105) {
													Static171.method3407(local19);
												}
											}
											local218++;
										}
									}
								} else if (local19.anInt2342 == 3) {
									if (Static90.method1961(local19)) {
										local218 = local19.anInt2371;
										if (Static144.aClass39_42 == local19 && local19.anInt2379 != 0) {
											local218 = local19.anInt2379;
										}
									} else {
										local218 = local19.anInt2380;
										if (local19 == Static144.aClass39_42 && local19.anInt2364 != 0) {
											local218 = local19.anInt2364;
										}
									}
									if (local108 == 0) {
										if (local19.aBoolean84) {
											Static155.method3012(local100, local105, local19.anInt2340, local19.anInt2369, local218);
										} else {
											Static155.method3016(local100, local105, local19.anInt2340, local19.anInt2369, local218);
										}
									} else if (local19.aBoolean84) {
										Static155.method3010(local100, local105, local19.anInt2340, local19.anInt2369, local218, 256 - (local108 & 0xFF));
									} else {
										Static155.method3007(local100, local105, local19.anInt2340, local19.anInt2369, local218, 256 - (local108 & 0xFF));
									}
								} else {
									@Pc(1151) Class1_Sub1_Sub1_Sub2_Sub1 local1151;
									if (local19.anInt2342 == 4) {
										local1151 = local19.method1749(Static123.aClass1_Sub1_Sub1_Sub3Array9);
										if (local1151 != null) {
											@Pc(1163) Class70 local1163 = local19.aClass70_772;
											if (Static90.method1961(local19)) {
												local223 = local19.anInt2371;
												if (Static144.aClass39_42 == local19 && local19.anInt2379 != 0) {
													local223 = local19.anInt2379;
												}
												if (local19.aClass70_771.method2896() > 0) {
													local1163 = local19.aClass70_771;
												}
											} else {
												local223 = local19.anInt2380;
												if (Static144.aClass39_42 == local19 && local19.anInt2364 != 0) {
													local223 = local19.anInt2364;
												}
											}
											if (local19.aBoolean89 && local19.anInt2373 != -1) {
												@Pc(1217) Class1_Sub1_Sub2 local1217 = Static90.method1963(local19.anInt2373);
												local1163 = local1217.aClass70_49;
												if (local1163 == null) {
													local1163 = Static80.aClass70_816;
												}
												if ((local1217.anInt184 == 1 || local19.anInt2360 != 1) && local19.anInt2360 != -1) {
													local1163 = Static160.method3210(new Class70[] { Static169.aClass70_1465, local1163, Static35.aClass70_628, Static72.method1656(local19.anInt2360) });
												}
											}
											if (Static81.aClass39_25 == local19) {
												local1163 = Static120.aClass70_1107;
												local223 = local19.anInt2380;
											}
											if (!local19.aBoolean89) {
												local1163 = Static81.method1833(local1163, local19);
											}
											local1151.method2382(local1163, local100, local105, local19.anInt2340, local19.anInt2369, local223, local19.aBoolean86 ? 0 : -1, local19.anInt2394, local19.anInt2328, local19.anInt2385);
										} else if (Static90.aBoolean105) {
											Static171.method3407(local19);
										}
									} else if (local19.anInt2342 == 5) {
										@Pc(1330) Class1_Sub1_Sub1_Sub4 local1330;
										if (local19.aBoolean89) {
											if (local19.anInt2373 == -1) {
												local1330 = local19.method1753(false);
											} else {
												local1330 = Static184.method3515(local19.anInt2373, false, local19.anInt2360, local19.anInt2391, local19.anInt2362);
											}
											if (local1330 != null) {
												local223 = local1330.anInt3972;
												local642 = local1330.anInt3970;
												if (local19.aBoolean78) {
													Static155.method3011(local100, local105, local100 + local19.anInt2340, local19.anInt2369 + local105);
													local654 = (local223 + local19.anInt2340 - 1) / local223;
													local664 = (local642 + local19.anInt2369 - 1) / local642;
													for (local825 = 0; local825 < local654; local825++) {
														for (local820 = 0; local820 < local664; local820++) {
															if (local19.anInt2382 != 0) {
																local1330.method3018(local100 + local825 * local223 + local223 / 2, local642 * local820 + (local105 - -(local642 / 2)), local19.anInt2382, 4096);
															} else if (local108 == 0) {
																local1330.method3021(local100 + local825 * local223, local105 + local820 * local642);
															} else {
																local1330.method3039(local100 + local825 * local223, local820 * local642 + local105, 256 - (local108 & 0xFF));
															}
														}
													}
													Static155.method2998(arg2, arg7, arg0, arg1);
												} else {
													local654 = local19.anInt2340 * 4096 / local223;
													if (local19.anInt2382 != 0) {
														local1330.method3018(local100 + local19.anInt2340 / 2, local105 + local19.anInt2369 / 2, local19.anInt2382, local654);
													} else if (local108 != 0) {
														local1330.method3036(local100, local105, local19.anInt2340, local19.anInt2369, 256 - (local108 & 0xFF));
													} else if (local19.anInt2340 == local223 && local642 == local19.anInt2369) {
														local1330.method3021(local100, local105);
													} else {
														local1330.method3020(local100, local105, local19.anInt2340, local19.anInt2369);
													}
												}
											} else if (Static90.aBoolean105) {
												Static171.method3407(local19);
											}
										} else {
											local1330 = local19.method1753(Static90.method1961(local19));
											if (local1330 != null) {
												local1330.method3021(local100, local105);
											} else if (Static90.aBoolean105) {
												Static171.method3407(local19);
											}
										}
									} else {
										@Pc(1716) Class1_Sub1_Sub2 local1716;
										if (local19.anInt2342 == 6) {
											@Pc(1585) boolean local1585 = Static90.method1961(local19);
											if (local1585) {
												local223 = local19.anInt2331;
											} else {
												local223 = local19.anInt2378;
											}
											@Pc(1597) Class1_Sub1_Sub4_Sub1 local1597 = null;
											local654 = 0;
											if (local19.anInt2373 != -1) {
												local1716 = Static90.method1963(local19.anInt2373);
												if (local1716 != null) {
													local1716 = local1716.method169(local19.anInt2360);
													local1597 = local1716.method162(null, 1, 0);
													if (local1597 == null) {
														Static171.method3407(local19);
													} else {
														local1597.method723();
														local654 = -local1597.aShort36 / 2;
													}
												}
											} else if (local19.anInt2370 == 5) {
												if (local19.anInt2358 == -1) {
													local1597 = Static101.aClass49_2.method2218(null, null, -1, -1);
												} else {
													local664 = local19.anInt2358 & 0x7FF;
													if (local664 == Static177.anInt4484) {
														local664 = 2047;
													}
													@Pc(1677) Class1_Sub1_Sub4_Sub2_Sub1 local1677 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local664];
													@Pc(1686) Class1_Sub1_Sub17 local1686 = local223 == -1 ? null : Static90.method1962(local223);
													if (local1677 != null && (int) local1677.aClass70_408.method2925() << 11 == (local19.anInt2358 & 0xFFFFF800)) {
														local1597 = local1677.aClass49_1.method2218(local1686, null, local19.anInt2357, 0);
													}
												}
											} else if (local223 == -1) {
												local1597 = local19.method1757(-1, local1585, null, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1);
												if (local1597 == null && Static90.aBoolean105) {
													Static171.method3407(local19);
												}
											} else {
												@Pc(1632) Class1_Sub1_Sub17 local1632 = Static90.method1962(local223);
												local1597 = local19.method1757(local19.anInt2357, local1585, local1632, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass49_1);
												if (local1597 == null && Static90.aBoolean105) {
													Static171.method3407(local19);
												}
											}
											if (local1597 != null) {
												Static1.method105(local19.anInt2324 + local100 + local19.anInt2340 / 2, local105 + local19.anInt2369 / 2 + local19.anInt2348);
												local825 = Class1_Sub1_Sub1_Sub1.anIntArray8[local19.anInt2336] * local19.anInt2363 >> 16;
												local664 = Class1_Sub1_Sub1_Sub1.anIntArray11[local19.anInt2336] * local19.anInt2363 >> 16;
												if (!local19.aBoolean89) {
													local1597.method725(local19.anInt2334, 0, local19.anInt2336, 0, local664, local825);
												} else if (local19.aBoolean82) {
													local1597.method722(local19.anInt2334, local19.anInt2335, local19.anInt2336, local19.anInt2345, local654 + local664 + local19.anInt2359, local825 + local19.anInt2359, local19.anInt2363);
												} else {
													local1597.method725(local19.anInt2334, local19.anInt2335, local19.anInt2336, local19.anInt2345, local654 + local664 + local19.anInt2359, local825 + local19.anInt2359);
												}
												Static1.method97();
											}
										} else {
											if (local19.anInt2342 == 7) {
												local1151 = local19.method1749(Static123.aClass1_Sub1_Sub1_Sub3Array9);
												if (local1151 == null) {
													if (Static90.aBoolean105) {
														Static171.method3407(local19);
													}
													continue;
												}
												local223 = 0;
												for (local642 = 0; local642 < local19.anInt2369; local642++) {
													for (local654 = 0; local654 < local19.anInt2340; local654++) {
														if (local19.anIntArray228[local223] > 0) {
															local1716 = Static90.method1963(local19.anIntArray228[local223] - 1);
															@Pc(1939) Class70 local1939;
															if (local1716.anInt184 != 1 && local19.anIntArray231[local223] == 1) {
																local1939 = Static160.method3210(new Class70[] { Static169.aClass70_1465, local1716.aClass70_49, Static34.aClass70_368 });
															} else {
																local1939 = Static160.method3210(new Class70[] { Static169.aClass70_1465, local1716.aClass70_49, Static35.aClass70_628, Static72.method1656(local19.anIntArray231[local223]) });
															}
															local820 = local100 + local654 * (local19.anInt2361 + 115);
															local728 = local105 + local642 * (local19.anInt2366 + 12);
															if (local19.anInt2394 == 0) {
																local1151.method2391(local1939, local820, local728, local19.anInt2380, local19.aBoolean86 ? 0 : -1);
															} else if (local19.anInt2394 == 1) {
																local1151.method2397(local1939, local19.anInt2340 / 2 + local820, local728, local19.anInt2380, local19.aBoolean86 ? 0 : -1);
															} else {
																local1151.method2387(local1939, local820 + local19.anInt2340 - 1, local728, local19.anInt2380, local19.aBoolean86 ? 0 : -1);
															}
														}
														local223++;
													}
												}
											}
											@Pc(2234) int local2234;
											if (local19.anInt2342 == 8 && local19 == Static107.aClass39_28 && Static133.anInt3476 == Static126.anInt823) {
												local223 = 0;
												@Pc(2076) Class1_Sub1_Sub1_Sub2_Sub1 local2076 = Static113.aClass1_Sub1_Sub1_Sub2_Sub1_3;
												local218 = 0;
												@Pc(2081) Class70 local2081 = local19.aClass70_772;
												local2081 = Static81.method1833(local2081, local19);
												@Pc(2099) Class70 local2099;
												while (local2081.method2896() > 0) {
													local825 = local2081.method2902(Static102.aClass70_942);
													if (local825 == -1) {
														local2099 = local2081;
														local2081 = Static35.aClass70_632;
													} else {
														local2099 = local2081.method2903(local825, 0);
														local2081 = local2081.method2906(local825 + 4);
													}
													local820 = local2076.method2374(local2099);
													if (local218 < local820) {
														local218 = local820;
													}
													local223 += local2076.anInt3198 + 1;
												}
												local223 += 7;
												local820 = local105 + local19.anInt2369 + 5;
												if (local820 + local223 > arg1) {
													local820 = arg1 - local223;
												}
												local218 += 6;
												local825 = local100 + local19.anInt2340 - local218 - 5;
												if (local100 + 5 > local825) {
													local825 = local100 + 5;
												}
												if (local218 + local825 > arg0) {
													local825 = arg0 - local218;
												}
												Static155.method3012(local825, local820, local218, local223, 16777120);
												Static155.method3016(local825, local820, local218, local223, 0);
												local2081 = local19.aClass70_772;
												local728 = local2076.anInt3198 + local820 + 2;
												local2081 = Static81.method1833(local2081, local19);
												while (local2081.method2896() > 0) {
													local2234 = local2081.method2902(Static102.aClass70_942);
													if (local2234 == -1) {
														local2099 = local2081;
														local2081 = Static35.aClass70_632;
													} else {
														local2099 = local2081.method2903(local2234, 0);
														local2081 = local2081.method2906(local2234 + 4);
													}
													local2076.method2391(local2099, local825 + 3, local728, 0, -1);
													local728 += local2076.anInt3198 + 1;
												}
											}
											if (local19.anInt2342 == 9) {
												if (local19.anInt2388 == 1) {
													Static155.method3013(local100, local105, local19.anInt2340 + local100, local105 + local19.anInt2369, local19.anInt2380);
												} else {
													local218 = local19.anInt2340 < 0 ? -local19.anInt2340 : local19.anInt2340;
													local223 = local19.anInt2369 >= 0 ? local19.anInt2369 : -local19.anInt2369;
													local642 = local218;
													if (local223 > local218) {
														local642 = local223;
													}
													if (local642 != 0) {
														local654 = (local19.anInt2340 << 16) / local642;
														local664 = (local19.anInt2369 << 16) / local642;
														if (local654 < local664) {
															local664 = -local664;
														} else {
															local654 = -local654;
														}
														local820 = local664 * local19.anInt2388 + 1 >> 17;
														local825 = local19.anInt2388 * local664 >> 17;
														local728 = local19.anInt2388 * local654 >> 17;
														local2234 = local19.anInt2388 * local654 + 1 >> 17;
														@Pc(2407) int local2407 = local100 - arg2;
														local875 = local105 - arg7;
														local877 = local2407 + local825;
														local899 = local2407 - local820;
														@Pc(2429) int local2429 = local19.anInt2340 + local2407 - local820;
														@Pc(2433) int local2433 = local875 + local728;
														@Pc(2438) int local2438 = local875 - local2234;
														@Pc(2446) int local2446 = local825 + local2407 + local19.anInt2340;
														@Pc(2453) int local2453 = local19.anInt2369 + local875 - local2234;
														@Pc(2461) int local2461 = local19.anInt2369 + local875 + local728;
														Static1.method92(local877, local899, local2429);
														Static1.method99(local2433, local2438, local2453, local877, local899, local2429, local19.anInt2380);
														Static1.method92(local877, local2429, local2446);
														Static1.method99(local2433, local2453, local2461, local877, local2429, local2446, local19.anInt2380);
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

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
	public static void method1542() {
		Static61.aClass30_8 = new Class30(32);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
	public static void method1544() {
		aClass70_644 = null;
		aClass32_3 = null;
		aClass25_10 = null;
		aClass1_Sub1_Sub1_Sub3_1 = null;
		aClass29Array1 = null;
		aClass70_645 = null;
	}
}
