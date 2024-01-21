import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
	public static int anInt3114;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[5][5000];

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_931 = Static181.method2795("gr-Un:");

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	public static void method2368() {
		if (Static71.aBooleanArray10[96]) {
			Static84.anInt1858 += (-Static84.anInt1858 - 24) / 2;
		} else if (Static71.aBooleanArray10[97]) {
			Static84.anInt1858 += (24 - Static84.anInt1858) / 2;
		} else {
			Static84.anInt1858 /= 2;
		}
		Static210.anInt4184 += Static84.anInt1858 / 2;
		@Pc(55) int local55 = Static125.anInt2772 + Static54.aClass24_Sub4_Sub1_1.anInt3316;
		if (Static71.aBooleanArray10[98]) {
			Static214.anInt4259 += (12 - Static214.anInt4259) / 2;
		} else if (Static71.aBooleanArray10[99]) {
			Static214.anInt4259 += (-Static214.anInt4259 - 12) / 2;
		} else {
			Static214.anInt4259 /= 2;
		}
		@Pc(94) int local94 = Static54.aClass24_Sub4_Sub1_1.anInt3349 + Static18.anInt2020;
		Static153.anInt3302 += Static214.anInt4259 / 2;
		if (Static204.anInt4028 - local55 < -500 || Static204.anInt4028 - local55 > 500 || Static208.anInt4121 - local94 < -500 || Static208.anInt4121 - local94 > 500) {
			Static208.anInt4121 = local94;
			Static204.anInt4028 = local55;
		}
		if (Static204.anInt4028 != local55) {
			Static204.anInt4028 += (local55 - Static204.anInt4028) / 16;
		}
		if (local94 != Static208.anInt4121) {
			Static208.anInt4121 += (local94 - Static208.anInt4121) / 16;
		}
		Static104.method1814();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[Lclient!ae;IIIII)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static126.method2119(arg5, arg6, arg0, arg1);
		Static24.method464();
		for (@Pc(18) int local18 = 0; local18 < arg4.length; local18++) {
			@Pc(24) Class5 local24 = arg4[local18];
			if (local24 != null && (arg7 == local24.anInt132 || arg7 == -1412584499 && Static73.aClass5_9 == local24)) {
				@Pc(47) int local47;
				if (arg8 == -1) {
					Static86.anIntArray181[Static139.anInt2948] = local24.anInt154 + arg2;
					Static101.anIntArray226[Static139.anInt2948] = local24.anInt105 + arg3;
					Static71.anIntArray167[Static139.anInt2948] = local24.anInt157;
					Static15.anIntArray27[Static139.anInt2948] = local24.anInt100;
					local47 = Static139.anInt2948++;
				} else {
					local47 = arg8;
				}
				local24.anInt155 = local47;
				local24.anInt141 = Static13.anInt386;
				if (!local24.aBoolean7 || !Static29.method604(local24)) {
					if (local24.anInt180 > 0) {
						Static167.method2593(local24);
					}
					@Pc(111) int local111 = local24.anInt105 + arg3;
					@Pc(114) int local114 = local24.anInt145;
					@Pc(120) int local120 = local24.anInt154 + arg2;
					if (Static60.aBoolean108 && (Static138.method2242(local24) != 0 || local24.anInt130 == 0) && local114 > 127) {
						local114 = 127;
					}
					@Pc(165) int local165;
					@Pc(171) int local171;
					if (local24 == Static73.aClass5_9) {
						if (arg7 != -1412584499 && !local24.aBoolean17) {
							Static214.anInt4263 = arg2;
							Static181.aClass5Array2 = arg4;
							Static99.anInt2139 = arg3;
							continue;
						}
						if (!local24.aBoolean17) {
							local114 = 128;
						}
						if (Static201.aBoolean185 && Static71.aBoolean89) {
							local165 = Static4.anInt95;
							local165 -= Static131.anInt2840;
							local171 = Static121.anInt2740;
							if (local165 < Static18.anInt2016) {
								local165 = Static18.anInt2016;
							}
							local171 -= Static207.anInt4084;
							if (Static106.aClass5_12.anInt157 + Static18.anInt2016 < local165 - -local24.anInt157) {
								local165 = Static18.anInt2016 + Static106.aClass5_12.anInt157 - local24.anInt157;
							}
							if (local171 < Static172.anInt3536) {
								local171 = Static172.anInt3536;
							}
							if (local171 + local24.anInt100 > Static172.anInt3536 + Static106.aClass5_12.anInt100) {
								local171 = Static172.anInt3536 + Static106.aClass5_12.anInt100 - local24.anInt100;
							}
							local111 = local171;
							local120 = local165;
						}
					}
					@Pc(290) int local290;
					@Pc(283) int local283;
					@Pc(263) int local263;
					@Pc(268) int local268;
					if (local24.anInt130 == 2) {
						local171 = arg6;
						local165 = arg5;
						local290 = arg0;
						local283 = arg1;
					} else {
						local171 = arg6 >= local111 ? arg6 : local111;
						local165 = arg5 >= local120 ? arg5 : local120;
						local263 = local120 + local24.anInt157;
						local268 = local24.anInt100 + local111;
						if (local24.anInt130 == 9) {
							local268++;
							local263++;
						}
						local283 = arg1 <= local268 ? arg1 : local268;
						local290 = local263 >= arg0 ? arg0 : local263;
					}
					if (!local24.aBoolean7 || local165 < local290 && local171 < local283) {
						if (local24.anInt180 != 0) {
							if (local24.anInt180 == 1337) {
								Static86.anInt1878 = local120;
								Static113.anInt2594 = local111;
								Static39.method784(local24.anInt157, local24.anInt100, local111, local120);
								Static126.method2119(arg5, arg6, arg0, arg1);
								continue;
							}
							if (local24.anInt180 == 1338) {
								if (local24.method100()) {
									Static98.method1680(local47, local111, local24, local120);
									Static126.method2119(arg5, arg6, arg0, arg1);
								}
								continue;
							}
							if (local24.anInt180 == 1339) {
								if (local24.method100()) {
									Static176.method2704(local120, local24, local111, local47);
									Static126.method2119(arg5, arg6, arg0, arg1);
								}
								continue;
							}
							if (local24.anInt180 == 1400) {
								Static36.method731(local24.anInt100, local120, local111, local24.anInt157);
								Static124.aBooleanArray16[local47] = true;
								Static162.aBooleanArray28[local47] = true;
								Static126.method2119(arg5, arg6, arg0, arg1);
								continue;
							}
							if (local24.anInt180 == 1401) {
								Static33.method687(local24.anInt157, local111, local120, local24.anInt100);
								Static124.aBooleanArray16[local47] = true;
								Static162.aBooleanArray28[local47] = true;
								Static126.method2119(arg5, arg6, arg0, arg1);
								continue;
							}
						}
						local263 = Static4.anInt95;
						if (local24.anInt130 == 0 && local24.aBoolean9 && local165 <= Static4.anInt95 && local171 <= Static121.anInt2740 && Static4.anInt95 < local290 && Static121.anInt2740 < local283 && !Static159.aBoolean152 && !Static60.aBoolean108) {
							Static189.aClass83Array55[0] = Static165.aClass83_979;
							Static22.aShortArray9[0] = 1005;
							Static22.aClass83Array12[0] = Static182.aClass83_1067;
							Static98.anInt2124 = 1;
						}
						local268 = Static121.anInt2740;
						if (!Static159.aBoolean152 && local165 <= local263 && local171 <= local268 && local263 < local290 && local268 < local283) {
							Static9.method149(local24, local268 - local111, -local120 + local263);
						}
						if (local24.anInt130 == 0) {
							if (!local24.aBoolean7 && Static29.method604(local24) && Static135.aClass5_16 != local24) {
								continue;
							}
							if (!local24.aBoolean7) {
								if (local24.anInt125 > local24.anInt114 - local24.anInt100) {
									local24.anInt125 = local24.anInt114 - local24.anInt100;
								}
								if (local24.anInt125 < 0) {
									local24.anInt125 = 0;
								}
							}
							method2369(local290, local283, local120 - local24.anInt99, local111 - local24.anInt125, arg4, local165, local171, local24.anInt159, local47);
							if (local24.aClass5Array1 != null) {
								method2369(local290, local283, local120 - local24.anInt99, local111 + -local24.anInt125, local24.aClass5Array1, local165, local171, local24.anInt159, local47);
							}
							@Pc(611) Class2_Sub13 local611 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local24.anInt159);
							if (local611 != null) {
								if (local611.anInt1867 == 0 && Static4.anInt95 >= local165 && local171 <= Static121.anInt2740 && Static4.anInt95 < local290 && local283 > Static121.anInt2740 && !Static159.aBoolean152 && !Static60.aBoolean108) {
									Static22.aShortArray9[0] = 1005;
									Static98.anInt2124 = 1;
									Static189.aClass83Array55[0] = Static165.aClass83_979;
									Static22.aClass83Array12[0] = Static182.aClass83_1067;
								}
								Static91.method1588(local611.anInt1869, local283, local47, local171, local111, local120, local165, local290);
							}
							Static126.method2119(arg5, arg6, arg0, arg1);
							Static24.method464();
						}
						if (Static128.aBooleanArray17[local47] || Static95.anInt2022 > 1) {
							if (local24.anInt130 == 0 && !local24.aBoolean7 && local24.anInt114 > local24.anInt100) {
								Static131.method2190(local24.anInt157 + local120, local24.anInt125, local24.anInt114, local111, local24.anInt100);
							}
							if (local24.anInt130 != 1) {
								@Pc(717) int local717;
								@Pc(721) int local721;
								@Pc(732) int local732;
								@Pc(907) int local907;
								@Pc(807) int local807;
								@Pc(715) int local715;
								@Pc(743) int local743;
								@Pc(912) int local912;
								if (local24.anInt130 == 2) {
									local715 = 0;
									for (local717 = 0; local717 < local24.anInt108; local717++) {
										for (local721 = 0; local721 < local24.anInt111; local721++) {
											local732 = local120 + local721 * (local24.anInt104 + 32);
											local743 = local111 + local717 * (local24.anInt118 + 32);
											if (local715 < 20) {
												local743 += local24.anIntArray10[local715];
												local732 += local24.anIntArray14[local715];
											}
											if (local24.anIntArray9[local715] > 0) {
												local807 = local24.anIntArray9[local715] - 1;
												if (arg5 < local732 + 32 && local732 < arg0 && arg6 < local743 + 32 && local743 < arg1 || local24 == Static124.aClass5_14 && Static142.anInt2990 == local715) {
													@Pc(867) Class2_Sub2_Sub17 local867;
													if (Static150.anInt3074 == 1 && local715 == Static183.anInt803 && local24.anInt159 == Static63.anInt3436) {
														local867 = Static89.method3258(2, local807, local24.anIntArray5[local715], local24.aBoolean13, 0);
													} else {
														local867 = Static89.method3258(1, local807, local24.anIntArray5[local715], local24.aBoolean13, 3153952);
													}
													if (local867 == null) {
														Static121.method2085(local24);
													} else if (Static124.aClass5_14 == local24 && local715 == Static142.anInt2990) {
														local907 = Static121.anInt2740 - Static191.anInt3781;
														local912 = Static4.anInt95 - Static146.anInt3027;
														if (local907 < 5 && local907 > -5) {
															local907 = 0;
														}
														if (local912 < 5 && local912 > -5) {
															local912 = 0;
														}
														if (Static172.anInt3540 < 5) {
															local907 = 0;
															local912 = 0;
														}
														local867.method1910(local732 + local912, local743 + local907, 128);
														if (arg7 != -1) {
															@Pc(958) Class5 local958 = arg4[arg7 & 0xFFFF];
															@Pc(960) int local960 = Static126.anInt2776;
															@Pc(962) int local962 = Static126.anInt2778;
															@Pc(989) int local989;
															if (local743 + local907 < local960 && local958.anInt125 > 0) {
																local989 = Static57.anInt1427 * (local960 - local743 - local907) / 3;
																if (local989 > Static57.anInt1427 * 10) {
																	local989 = Static57.anInt1427 * 10;
																}
																if (local989 > local958.anInt125) {
																	local989 = local958.anInt125;
																}
																Static191.anInt3781 += local989;
																local958.anInt125 -= local989;
																Static121.method2085(local958);
															}
															if (local743 + local907 + 32 > local962 && local958.anInt125 < local958.anInt114 - local958.anInt100) {
																local989 = Static57.anInt1427 * (local743 + local907 + 32 - local962) / 3;
																if (local989 > Static57.anInt1427 * 10) {
																	local989 = Static57.anInt1427 * 10;
																}
																if (local989 > local958.anInt114 - local958.anInt100 - local958.anInt125) {
																	local989 = local958.anInt114 - local958.anInt125 - local958.anInt100;
																}
																local958.anInt125 += local989;
																Static191.anInt3781 -= local989;
																Static121.method2085(local958);
															}
														}
													} else if (local24 == Static183.aClass5_6 && local715 == Static153.anInt3291) {
														local867.method1910(local732, local743, 128);
													} else {
														local867.method1905(local732, local743);
													}
												}
											} else if (local24.anIntArray8 != null && local715 < 20) {
												@Pc(781) Class2_Sub2_Sub17 local781 = local24.method95(local715);
												if (local781 != null) {
													local781.method1905(local732, local743);
												} else if (Static189.aBoolean176) {
													Static121.method2085(local24);
												}
											}
											local715++;
										}
									}
								} else if (local24.anInt130 == 3) {
									if (Static60.method1674(local24)) {
										local715 = local24.anInt122;
										if (local24 == Static135.aClass5_16 && local24.anInt113 != 0) {
											local715 = local24.anInt113;
										}
									} else {
										local715 = local24.anInt167;
										if (local24 == Static135.aClass5_16 && local24.anInt134 != 0) {
											local715 = local24.anInt134;
										}
									}
									if (local114 == 0) {
										if (local24.aBoolean6) {
											Static126.method2138(local120, local111, local24.anInt157, local24.anInt100, local715);
										} else {
											Static126.method2120(local120, local111, local24.anInt157, local24.anInt100, local715);
										}
									} else if (local24.aBoolean6) {
										Static126.method2124(local120, local111, local24.anInt157, local24.anInt100, local715, 256 - (local114 & 0xFF));
									} else {
										Static126.method2123(local120, local111, local24.anInt157, local24.anInt100, local715, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1260) Class2_Sub2_Sub5 local1260;
									if (local24.anInt130 == 4) {
										local1260 = local24.method99(Static177.aClass29Array8);
										if (local1260 != null) {
											@Pc(1272) Class83 local1272 = local24.aClass83_29;
											if (Static60.method1674(local24)) {
												local717 = local24.anInt122;
												if (local24 == Static135.aClass5_16 && local24.anInt113 != 0) {
													local717 = local24.anInt113;
												}
												if (local24.aClass83_31.method2428() > 0) {
													local1272 = local24.aClass83_31;
												}
											} else {
												local717 = local24.anInt167;
												if (local24 == Static135.aClass5_16 && local24.anInt134 != 0) {
													local717 = local24.anInt134;
												}
											}
											if (local24.aBoolean7 && local24.anInt158 != -1) {
												@Pc(1329) Class2_Sub2_Sub3 local1329 = Static113.method1987(local24.anInt158);
												local1272 = local1329.aClass83_87;
												if (local1272 == null) {
													local1272 = Static21.aClass83_129;
												}
												if ((local1329.anInt465 == 1 || local24.anInt165 != 1) && local24.anInt165 != -1) {
													local1272 = Static67.method1268(new Class83[] { Static182.aClass83_1066, local1272, Static35.aClass83_285, Static209.method3166(local24.anInt165) });
												}
											}
											if (Static104.aClass5_11 == local24) {
												local1272 = Static150.aClass83_910;
												local717 = local24.anInt167;
											}
											if (!local24.aBoolean7) {
												local1272 = Static142.method2284(local1272, local24);
											}
											local1260.method1099(local1272, local120, local111, local24.anInt157, local24.anInt100, local717, local24.aBoolean10 ? 0 : -1, local24.anInt137, local24.anInt168, local24.anInt136);
										} else if (Static189.aBoolean176) {
											Static121.method2085(local24);
										}
									} else if (local24.anInt130 == 5) {
										@Pc(1433) Class2_Sub2_Sub17 local1433;
										if (local24.aBoolean7) {
											if (local24.anInt158 == -1) {
												local1433 = local24.method94(false);
											} else {
												local1433 = Static89.method3258(local24.anInt174, local24.anInt158, local24.anInt165, local24.aBoolean13, local24.anInt170);
											}
											if (local1433 != null) {
												local721 = local1433.anInt2519;
												local717 = local1433.anInt2525;
												if (local24.aBoolean18) {
													local732 = (local717 + local24.anInt157 - 1) / local717;
													local743 = (local721 + local24.anInt100 - 1) / local721;
													Static126.method2121(local120, local111, local120 + local24.anInt157, local111 - -local24.anInt100);
													for (local912 = 0; local912 < local732; local912++) {
														for (local907 = 0; local907 < local743; local907++) {
															if (local24.anInt176 != 0) {
																local1433.method1912(local721 / 2 + local907 * local721 + local111, 4096, local24.anInt176, local912 * local717 + local120 + local717 / 2);
															} else if (local114 == 0) {
																local1433.method1905(local120 + local717 * local912, local111 - -(local721 * local907));
															} else {
																local1433.method1910(local717 * local912 + local120, local721 * local907 + local111, 256 - (local114 & 0xFF));
															}
														}
													}
													Static126.method2119(arg5, arg6, arg0, arg1);
												} else {
													local732 = local24.anInt157 * 4096 / local717;
													if (local24.anInt176 != 0) {
														local1433.method1912(local111 + local24.anInt100 / 2, local732, local24.anInt176, local120 + local24.anInt157 / 2);
													} else if (local114 != 0) {
														local1433.method1911(local120, local111, local24.anInt157, local24.anInt100, 256 - (local114 & 0xFF));
													} else if (local24.anInt157 == local717 && local721 == local24.anInt100) {
														local1433.method1905(local120, local111);
													} else {
														local1433.method1909(local120, local111, local24.anInt157, local24.anInt100);
													}
												}
											} else if (Static189.aBoolean176) {
												Static121.method2085(local24);
											}
										} else {
											local1433 = local24.method94(Static60.method1674(local24));
											if (local1433 != null) {
												local1433.method1905(local120, local111);
											} else if (Static189.aBoolean176) {
												Static121.method2085(local24);
											}
										}
									} else {
										@Pc(1842) Class2_Sub2_Sub3 local1842;
										@Pc(1961) int local1961;
										if (local24.anInt130 == 6) {
											@Pc(1699) boolean local1699 = Static60.method1674(local24);
											local732 = 0;
											@Pc(1703) Class24_Sub3 local1703 = null;
											if (local1699) {
												local717 = local24.anInt119;
											} else {
												local717 = local24.anInt164;
											}
											if (local24.anInt158 != -1) {
												local1842 = Static113.method1987(local24.anInt158);
												if (local1842 != null) {
													local1842 = local1842.method344(local24.anInt165);
													local1703 = local1842.method332(1, null, 0);
													if (local1703 == null) {
														Static121.method2085(local24);
													} else {
														local732 = -local1703.method2978() / 2;
													}
												}
											} else if (local24.anInt178 == 5) {
												if (local24.anInt144 == -1) {
													local1703 = Static4.aClass49_1.method1521(null, -1, null, -1);
												} else {
													local743 = local24.anInt144 & 0x7FF;
													if (Static138.anInt2924 == local743) {
														local743 = 2047;
													}
													@Pc(1745) Class24_Sub4_Sub1 local1745 = Static22.aClass24_Sub4_Sub1Array1[local743];
													@Pc(1755) Class2_Sub2_Sub16 local1755 = local717 == -1 ? null : Static213.method3229(local717);
													if (local1745 != null && (int) local1745.aClass83_664.method2397() << 11 == (local24.anInt144 & 0xFFFFF800)) {
														local1703 = local1745.aClass49_2.method1521(null, local24.anInt169, local1755, 0);
													}
												}
											} else if (local717 == -1) {
												local1703 = local24.method98(null, Static54.aClass24_Sub4_Sub1_1.aClass49_2, -1, local1699);
												if (local1703 == null && Static189.aBoolean176) {
													Static121.method2085(local24);
												}
											} else {
												@Pc(1800) Class2_Sub2_Sub16 local1800 = Static213.method3229(local717);
												local1703 = local24.method98(local1800, Static54.aClass24_Sub4_Sub1_1.aClass49_2, local24.anInt169, local1699);
												if (local1703 == null && Static189.aBoolean176) {
													Static121.method2085(local24);
												}
											}
											if (local1703 != null) {
												if (local24.anInt177 <= 0) {
													local743 = 256;
												} else {
													local743 = (local24.anInt157 << 8) / local24.anInt177;
												}
												if (local24.anInt151 <= 0) {
													local912 = 256;
												} else {
													local912 = (local24.anInt100 << 8) / local24.anInt151;
												}
												local907 = (local24.anInt120 * local743 >> 8) + local120 + local24.anInt157 / 2;
												local807 = local111 + local24.anInt100 / 2 + (local24.anInt124 * local912 >> 8);
												Static24.method475(local907, local807);
												@Pc(1951) int local1951 = Class16.anIntArray39[local24.anInt152] * local24.anInt142 >> 16;
												local1961 = Class16.anIntArray44[local24.anInt152] * local24.anInt142 >> 16;
												if (!local24.aBoolean7) {
													local1703.method2734(local24.anInt171, 0, local24.anInt152, 0, local1961, local1951);
												} else if (local24.aBoolean11) {
													((Class24_Sub3_Sub1) local1703).method2745(local24.anInt171, local24.anInt148, local24.anInt152, local24.anInt146, local732 + local1961 + local24.anInt179, local1951 + local24.anInt179, local24.anInt142);
												} else {
													local1703.method2734(local24.anInt171, local24.anInt148, local24.anInt152, local24.anInt146, local1961 + local732 + local24.anInt179, local24.anInt179 + local1951);
												}
												Static24.method470();
											}
										} else {
											if (local24.anInt130 == 7) {
												local1260 = local24.method99(Static177.aClass29Array8);
												if (local1260 == null) {
													if (Static189.aBoolean176) {
														Static121.method2085(local24);
													}
													continue;
												}
												local717 = 0;
												for (local721 = 0; local721 < local24.anInt108; local721++) {
													for (local732 = 0; local732 < local24.anInt111; local732++) {
														if (local24.anIntArray9[local717] > 0) {
															local1842 = Static113.method1987(local24.anIntArray9[local717] - 1);
															@Pc(2106) Class83 local2106;
															if (local1842.anInt465 != 1 && local24.anIntArray5[local717] == 1) {
																local2106 = Static67.method1268(new Class83[] { Static182.aClass83_1066, local1842.aClass83_87, Static71.aClass83_525 });
															} else {
																local2106 = Static67.method1268(new Class83[] { Static182.aClass83_1066, local1842.aClass83_87, Static35.aClass83_285, Static209.method3166(local24.anIntArray5[local717]) });
															}
															local907 = local120 + (local24.anInt104 + 115) * local732;
															local807 = local721 * (local24.anInt118 + 12) + local111;
															if (local24.anInt137 == 0) {
																local1260.method1100(local2106, local907, local807, local24.anInt167, local24.aBoolean10 ? 0 : -1);
															} else if (local24.anInt137 == 1) {
																local1260.method1083(local2106, local907 + 57, local807, local24.anInt167, local24.aBoolean10 ? 0 : -1);
															} else {
																local1260.method1082(local2106, local907 + 115 - 1, local807, local24.anInt167, local24.aBoolean10 ? 0 : -1);
															}
														}
														local717++;
													}
												}
											}
											if (local24.anInt130 == 8 && Static114.aClass5_15 == local24 && Static39.anInt996 == Static22.anInt591) {
												local715 = 0;
												@Pc(2250) Class2_Sub2_Sub5 local2250 = Static167.aClass2_Sub2_Sub5_3;
												local717 = 0;
												@Pc(2255) Class83 local2255 = local24.aClass83_29;
												local2255 = Static142.method2284(local2255, local24);
												@Pc(2279) Class83 local2279;
												while (local2255.method2428() > 0) {
													local912 = local2255.method2388(Static28.aClass83_212);
													if (local912 == -1) {
														local2279 = local2255;
														local2255 = Static182.aClass83_1067;
													} else {
														local2279 = local2255.method2416(local912, 0);
														local2255 = local2255.method2422(local912 + 4);
													}
													local907 = local2250.method1089(local2279);
													local717 += local2250.anInt1400 + 1;
													if (local715 < local907) {
														local715 = local907;
													}
												}
												local717 += 7;
												local715 += 6;
												local912 = local24.anInt157 + local120 - local715 - 5;
												local907 = local24.anInt100 + local111 + 5;
												if (local717 + local907 > arg1) {
													local907 = arg1 - local717;
												}
												if (local120 + 5 > local912) {
													local912 = local120 + 5;
												}
												if (local715 + local912 > arg0) {
													local912 = arg0 - local715;
												}
												Static126.method2138(local912, local907, local715, local717, 16777120);
												Static126.method2120(local912, local907, local715, local717, 0);
												local807 = local2250.anInt1400 + local907 + 2;
												local2255 = local24.aClass83_29;
												local2255 = Static142.method2284(local2255, local24);
												while (local2255.method2428() > 0) {
													local1961 = local2255.method2388(Static28.aClass83_212);
													if (local1961 == -1) {
														local2279 = local2255;
														local2255 = Static182.aClass83_1067;
													} else {
														local2279 = local2255.method2416(local1961, 0);
														local2255 = local2255.method2422(local1961 + 4);
													}
													local2250.method1100(local2279, local912 + 3, local807, 0, -1);
													local807 += local2250.anInt1400 + 1;
												}
											}
											if (local24.anInt130 == 9) {
												if (local24.aBoolean16) {
													local721 = local120 + local24.anInt157;
													local732 = local111;
													local717 = local24.anInt100 + local111;
												} else {
													local717 = local111;
													local721 = local24.anInt157 + local120;
													local732 = local111 + local24.anInt100;
												}
												if (local24.anInt126 == 1) {
													Static126.method2129(local120, local717, local721, local732, local24.anInt167);
												} else {
													Static126.method2118(local120, local717, local721, local732, local24.anInt167, local24.anInt126);
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

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILclient!kg;)V")
	public static void method2371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24_Sub4_Sub1 arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if ((arg0 & 0x1) != 0) {
			local13 = Static33.aClass2_Sub3_Sub1_1.method240();
			local17 = Static33.aClass2_Sub3_Sub1_1.method240();
			arg2.method2525(local13, Static13.anInt386, local17);
			arg2.anInt3354 = Static13.anInt386 + 300;
			arg2.anInt3352 = Static33.aClass2_Sub3_Sub1_1.method219();
		}
		if ((arg0 & 0x10) != 0) {
			arg2.anInt3306 = Static33.aClass2_Sub3_Sub1_1.method267();
			arg2.anInt3320 = Static33.aClass2_Sub3_Sub1_1.method254();
		}
		if ((arg0 & 0x2) != 0) {
			local13 = Static33.aClass2_Sub3_Sub1_1.method262();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Static33.aClass2_Sub3_Sub1_1.method260();
			Static67.method1269(local17, local13, arg2);
		}
		if ((arg0 & 0x100) != 0) {
			arg2.anInt3315 = Static33.aClass2_Sub3_Sub1_1.method220();
			arg2.anInt3314 = Static33.aClass2_Sub3_Sub1_1.method240();
			arg2.anInt3325 = Static33.aClass2_Sub3_Sub1_1.method260();
			arg2.anInt3329 = Static33.aClass2_Sub3_Sub1_1.method220();
			arg2.anInt3294 = Static33.aClass2_Sub3_Sub1_1.method269() + Static13.anInt386;
			arg2.anInt3308 = Static33.aClass2_Sub3_Sub1_1.method269() + Static13.anInt386;
			arg2.anInt3347 = Static33.aClass2_Sub3_Sub1_1.method240();
			arg2.anInt3330 = 1;
			arg2.anInt3334 = 0;
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt3311 = Static33.aClass2_Sub3_Sub1_1.method254();
			local13 = Static33.aClass2_Sub3_Sub1_1.method257();
			arg2.anInt3344 = 0;
			arg2.anInt3296 = local13 >> 16;
			arg2.anInt3343 = 0;
			arg2.anInt3353 = Static13.anInt386 + (local13 & 0xFFFF);
			if (arg2.anInt3311 == 65535) {
				arg2.anInt3311 = -1;
			}
			if (arg2.anInt3353 > Static13.anInt386) {
				arg2.anInt3343 = -1;
			}
		}
		if ((arg0 & 0x4) != 0) {
			arg2.aClass83_972 = Static33.aClass2_Sub3_Sub1_1.method259();
			if (arg2.aClass83_972.method2421(0) == 126) {
				arg2.aClass83_972 = arg2.aClass83_972.method2422(1);
				Static165.method2554(2, arg2.aClass83_972, arg2.aClass83_664);
			} else if (Static54.aClass24_Sub4_Sub1_1 == arg2) {
				Static165.method2554(2, arg2.aClass83_972, arg2.aClass83_664);
			}
			arg2.anInt3293 = 0;
			arg2.anInt3338 = 0;
			arg2.anInt3295 = 150;
		}
		if ((arg0 & 0x40) != 0) {
			local13 = Static33.aClass2_Sub3_Sub1_1.method260();
			@Pc(240) byte[] local240 = new byte[local13];
			@Pc(245) Class2_Sub3 local245 = new Class2_Sub3(local240);
			Static33.aClass2_Sub3_Sub1_1.method234(local240, local13);
			Static174.aClass2_Sub3Array1[arg1] = local245;
			arg2.method1731(local245);
		}
		if ((arg0 & 0x20) != 0) {
			arg2.anInt3299 = Static33.aClass2_Sub3_Sub1_1.method267();
			if (arg2.anInt3299 == 65535) {
				arg2.anInt3299 = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			local13 = Static33.aClass2_Sub3_Sub1_1.method254();
			local17 = Static33.aClass2_Sub3_Sub1_1.method260();
			@Pc(300) int local300 = Static33.aClass2_Sub3_Sub1_1.method219();
			@Pc(303) int local303 = Static33.aClass2_Sub3_Sub1_1.anInt340;
			if (arg2.aClass83_664 != null && arg2.aClass49_2 != null) {
				@Pc(314) long local314 = arg2.aClass83_664.method2397();
				@Pc(316) boolean local316 = false;
				if (local17 <= 1) {
					for (@Pc(323) int local323 = 0; local323 < Static85.anInt1875; local323++) {
						if (Static211.aLongArray8[local323] == local314) {
							local316 = true;
							break;
						}
					}
				}
				if (!local316 && Static95.anInt2023 == 0) {
					Static216.aClass2_Sub3_5.anInt340 = 0;
					@Pc(352) int local352 = -1;
					@Pc(360) boolean local360 = (local13 & 0x8000) != 0;
					Static33.aClass2_Sub3_Sub1_1.method234(Static216.aClass2_Sub3_5.aByteArray2, local300);
					Static216.aClass2_Sub3_5.anInt340 = 0;
					@Pc(379) Class83 local379;
					if (local360) {
						local13 &= 0x7FFF;
						@Pc(389) Class85 local389 = Static67.method1266(Static216.aClass2_Sub3_5);
						local352 = local389.anInt3228;
						local379 = local389.aClass2_Sub2_Sub18_1.method1989(Static216.aClass2_Sub3_5);
					} else {
						local379 = Static136.method1098(Static157.method2393(Static216.aClass2_Sub3_5).method2419());
					}
					arg2.aClass83_972 = local379.method2403();
					arg2.anInt3338 = local13 & 0xFF;
					arg2.anInt3295 = 150;
					arg2.anInt3293 = local13 >> 8;
					if (local17 == 2) {
						Static51.method1183(local379, local360 ? 17 : 1, null, Static67.method1268(new Class83[] { Static153.aClass83_971, arg2.aClass83_664 }), local352);
					} else if (local17 == 1) {
						Static51.method1183(local379, local360 ? 17 : 1, null, Static67.method1268(new Class83[] { Static107.aClass83_928, arg2.aClass83_664 }), local352);
					} else {
						Static51.method1183(local379, local360 ? 17 : 2, null, arg2.aClass83_664, local352);
					}
				}
			}
			Static33.aClass2_Sub3_Sub1_1.anInt340 = local303 + local300;
		}
		if ((arg0 & 0x200) != 0) {
			local13 = Static33.aClass2_Sub3_Sub1_1.method240();
			local17 = Static33.aClass2_Sub3_Sub1_1.method220();
			arg2.method2525(local13, Static13.anInt386, local17);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	public static void method2372() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt2895; local1++) {
			for (local4 = 0; local4 < Static35.anInt916; local4++) {
				for (local7 = 0; local7 < Static31.anInt825; local7++) {
					Static203.aClass2_Sub23ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static61.anInt1504; local4++) {
			for (local7 = 0; local7 < Static61.anIntArray122[local4]; local7++) {
				Static61.aClass54ArrayArray1[local4][local7] = null;
			}
			Static61.anIntArray122[local4] = 0;
		}
		for (local7 = 0; local7 < Static63.anInt3434; local7++) {
			Static155.aClass78Array2[local7] = null;
		}
		Static63.anInt3434 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static99.aClass78Array1.length; local69++) {
			Static99.aClass78Array1[local69] = null;
		}
	}
}
