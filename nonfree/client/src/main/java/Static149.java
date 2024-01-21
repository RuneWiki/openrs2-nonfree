import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
	public static final int[] anIntArray275 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1450 = Static187.method3089("Art");

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
	public static int method2256() {
		@Pc(17) int local17 = Static64.method1027(Static100.anInt2140, Static186.anInt4074, Static192.anInt4180);
		return local17 - Static107.anInt2320 >= 800 || (Static146.aByteArrayArrayArray33[Static192.anInt4180][Static186.anInt4074 >> 7][Static100.anInt2140 >> 7] & 0x4) == 0 ? 3 : Static192.anInt4180;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([Lclient!vd;[SB)V")
	public static void method2258(@OriginalArg(0) Class92[] arg0, @OriginalArg(1) short[] arg1) {
		Static62.method1002(0, arg1, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII[Lclient!ba;IIII)V")
	public static void method2261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static46.method3170(arg5, arg8, arg3, arg6);
		Static174.method2841();
		for (@Pc(18) int local18 = 0; local18 < arg4.length; local18++) {
			@Pc(24) Class11 local24 = arg4[local18];
			if (local24 != null && (local24.anInt256 == arg1 || arg1 == -1412584499 && Static161.aClass11_15 == local24)) {
				@Pc(74) int local74;
				if (arg2 == -1) {
					Static111.anIntArray182[Static89.anInt1911] = local24.anInt255 + arg0;
					Static49.anIntArray90[Static89.anInt1911] = local24.anInt291 + arg7;
					Static189.anIntArray331[Static89.anInt1911] = local24.anInt312;
					Static110.anIntArray176[Static89.anInt1911] = local24.anInt263;
					local74 = Static89.anInt1911++;
				} else {
					local74 = arg2;
				}
				local24.anInt274 = Static155.anInt2981;
				local24.anInt265 = local74;
				if (!local24.aBoolean28 || !Static141.method2093(local24)) {
					if (local24.anInt315 > 0) {
						Static150.method2274(local24);
					}
					@Pc(102) int local102 = arg0 + local24.anInt255;
					@Pc(107) int local107 = arg7 + local24.anInt291;
					@Pc(110) int local110 = local24.anInt251;
					if (Static151.aBoolean178 && (Static195.method3194(local24) != 0 || local24.anInt326 == 0) && local110 > 127) {
						local110 = 127;
					}
					@Pc(153) int local153;
					@Pc(155) int local155;
					if (local24 == Static161.aClass11_15) {
						if (arg1 != -1412584499 && !local24.aBoolean25) {
							Static28.anInt640 = arg7;
							Static152.aClass11Array2 = arg4;
							Static33.anInt803 = arg0;
							continue;
						}
						if (Static75.aBoolean101 && Static53.aBoolean80) {
							local153 = Static85.anInt1855;
							local155 = Static126.anInt2633;
							local153 -= Static119.anInt2552;
							if (local153 < Static59.anInt1434) {
								local153 = Static59.anInt1434;
							}
							local155 -= Static165.anInt3438;
							if (Static50.aClass11_13.anInt312 + Static59.anInt1434 < local153 - -local24.anInt312) {
								local153 = Static59.anInt1434 + Static50.aClass11_13.anInt312 - local24.anInt312;
							}
							if (local155 < Static36.anInt1018) {
								local155 = Static36.anInt1018;
							}
							local102 = local153;
							if (local24.anInt263 + local155 > Static36.anInt1018 - -Static50.aClass11_13.anInt263) {
								local155 = Static36.anInt1018 + Static50.aClass11_13.anInt263 - local24.anInt263;
							}
							local107 = local155;
						}
						if (!local24.aBoolean25) {
							local110 = 128;
						}
					}
					@Pc(285) int local285;
					@Pc(278) int local278;
					@Pc(252) int local252;
					@Pc(247) int local247;
					if (local24.anInt326 == 2) {
						local285 = arg3;
						local278 = arg6;
						local155 = arg8;
						local153 = arg5;
					} else {
						local155 = local107 <= arg8 ? arg8 : local107;
						local247 = local107 + local24.anInt263;
						local252 = local102 + local24.anInt312;
						if (local24.anInt326 == 9) {
							local247++;
							local252++;
						}
						local153 = arg5 < local102 ? local102 : arg5;
						local278 = local247 < arg6 ? local247 : arg6;
						local285 = local252 >= arg3 ? arg3 : local252;
					}
					if (!local24.aBoolean28 || local285 > local153 && local155 < local278) {
						if (local24.anInt315 != 0) {
							if (local24.anInt315 == 1337) {
								Static204.anInt2392 = local107;
								Static66.anInt1521 = local102;
								Static147.method2196(local24.anInt263, local102, local24.anInt312, local107);
								Static46.method3170(arg5, arg8, arg3, arg6);
								continue;
							}
							if (local24.anInt315 == 1338) {
								if (local24.method199()) {
									Static179.method2929(local24, local107, local74, local102);
									Static46.method3170(arg5, arg8, arg3, arg6);
								}
								continue;
							}
							if (local24.anInt315 == 1339) {
								if (local24.method199()) {
									Static129.method1875(local107, local102, local74, local24);
									Static46.method3170(arg5, arg8, arg3, arg6);
								}
								continue;
							}
							if (local24.anInt315 == 1400) {
								Static10.method191(local107, local102, local24.anInt312, local24.anInt263);
								Static84.aBooleanArray5[local74] = true;
								Static143.aBooleanArray13[local74] = true;
								Static46.method3170(arg5, arg8, arg3, arg6);
							}
							if (local24.anInt315 == 1401) {
								Static173.method2742(local102, local24.anInt312, local107, local24.anInt263);
								Static84.aBooleanArray5[local74] = true;
								Static143.aBooleanArray13[local74] = true;
								Static46.method3170(arg5, arg8, arg3, arg6);
								continue;
							}
						}
						local252 = Static85.anInt1855;
						local247 = Static126.anInt2633;
						if (!Static35.aBoolean61 && local252 >= local153 && local155 <= local247 && local285 > local252 && local278 > local247) {
							Static115.method1718(local247 - local107, -local102 + local252, local24);
						}
						if (local24.anInt326 == 0) {
							if (!local24.aBoolean28 && Static141.method2093(local24) && local24 != Static139.aClass11_10) {
								continue;
							}
							if (!local24.aBoolean28) {
								if (local24.anInt297 > local24.anInt318 - local24.anInt263) {
									local24.anInt297 = local24.anInt318 - local24.anInt263;
								}
								if (local24.anInt297 < 0) {
									local24.anInt297 = 0;
								}
							}
							method2261(local102 - local24.anInt299, local24.anInt275, local74, local285, arg4, local153, local278, local107 - local24.anInt297, local155);
							if (local24.aClass11Array1 != null) {
								method2261(local102 - local24.anInt299, local24.anInt275, local74, local285, local24.aClass11Array1, local153, local278, local107 - local24.anInt297, local155);
							}
							@Pc(555) Class1_Sub4 local555 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local24.anInt275);
							if (local555 != null) {
								if (local555.anInt489 == 0 && Static85.anInt1855 >= local153 && Static126.anInt2633 >= local155 && local285 > Static85.anInt1855 && local278 > Static126.anInt2633 && !Static35.aBoolean61 && !Static151.aBoolean178) {
									Static120.aShortArray21[0] = 1004;
									Static152.anInt3135 = 1;
									Static158.aClass92Array23[0] = Static71.aClass92_663;
									Static65.aClass92Array9[0] = Static26.aClass92_268;
								}
								Static102.method1546(local278, local74, local102, local153, local285, local107, local555.anInt490, local155);
							}
							Static46.method3170(arg5, arg8, arg3, arg6);
							Static174.method2841();
						}
						if (local24.anInt315 != 1400 && (Static101.aBooleanArray7[local74] || Static173.anInt3701 > 1)) {
							if (local24.anInt326 == 0 && !local24.aBoolean28 && local24.anInt318 > local24.anInt263) {
								Static148.method2248(local102 + local24.anInt312, local24.anInt263, local24.anInt318, local24.anInt297, local107);
							}
							if (local24.anInt326 != 1) {
								@Pc(665) int local665;
								@Pc(669) int local669;
								@Pc(681) int local681;
								@Pc(837) int local837;
								@Pc(730) int local730;
								@Pc(663) int local663;
								@Pc(832) int local832;
								@Pc(692) int local692;
								if (local24.anInt326 == 2) {
									local663 = 0;
									for (local665 = 0; local665 < local24.anInt296; local665++) {
										for (local669 = 0; local669 < local24.anInt307; local669++) {
											local681 = local102 + local669 * (local24.anInt278 + 32);
											local692 = local107 + local665 * (local24.anInt254 + 32);
											if (local663 < 20) {
												local692 += local24.anIntArray33[local663];
												local681 += local24.anIntArray35[local663];
											}
											if (local24.anIntArray29[local663] > 0) {
												local730 = local24.anIntArray29[local663] - 1;
												if (local681 + 32 > arg5 && local681 < arg3 && local692 + 32 > arg8 && local692 < arg6 || local24 == Static153.aClass11_14 && local663 == Static144.anInt2891) {
													@Pc(800) Class1_Sub3_Sub1_Sub1 local800;
													if (Static189.anInt4128 == 1 && Static47.anInt1198 == local663 && Static153.anInt3185 == local24.anInt275) {
														local800 = Static48.method864(0, local730, local24.anIntArray24[local663], false, false, local24.aBoolean31, 2);
													} else {
														local800 = Static48.method864(3153952, local730, local24.anIntArray24[local663], false, false, local24.aBoolean31, 1);
													}
													if (local800 == null) {
														Static73.method1118(local24);
													} else if (Static153.aClass11_14 == local24 && local663 == Static144.anInt2891) {
														local832 = Static85.anInt1855 - Static117.anInt2509;
														local837 = Static126.anInt2633 - Static109.anInt2362;
														if (local832 < 5 && local832 > -5) {
															local832 = 0;
														}
														if (local837 < 5 && local837 > -5) {
															local837 = 0;
														}
														if (Static93.anInt1974 < 5) {
															local832 = 0;
															local837 = 0;
														}
														local800.method363(local832 + local681, local692 - -local837, 128);
														if (arg1 != -1) {
															@Pc(884) Class11 local884 = arg4[arg1 & 0xFFFF];
															@Pc(886) int local886 = Static46.anInt4200;
															@Pc(888) int local888 = Static46.anInt4197;
															@Pc(914) int local914;
															if (local837 + local692 < local888 && local884.anInt297 > 0) {
																local914 = Static110.anInt2383 * (local888 - local692 - local837) / 3;
																if (Static110.anInt2383 * 10 < local914) {
																	local914 = Static110.anInt2383 * 10;
																}
																if (local884.anInt297 < local914) {
																	local914 = local884.anInt297;
																}
																local884.anInt297 -= local914;
																Static109.anInt2362 += local914;
																Static73.method1118(local884);
															}
															if (local837 + local692 + 32 > local886 && local884.anInt297 < local884.anInt318 - local884.anInt263) {
																local914 = (local837 + local692 + 32 - local886) * Static110.anInt2383 / 3;
																if (local914 > Static110.anInt2383 * 10) {
																	local914 = Static110.anInt2383 * 10;
																}
																if (local914 > local884.anInt318 - local884.anInt297 - local884.anInt263) {
																	local914 = local884.anInt318 - local884.anInt297 - local884.anInt263;
																}
																local884.anInt297 += local914;
																Static109.anInt2362 -= local914;
																Static73.method1118(local884);
															}
														}
													} else if (Static179.aClass11_19 == local24 && Static121.anInt4508 == local663) {
														local800.method363(local681, local692, 128);
													} else {
														local800.method358(local681, local692);
													}
												}
											} else if (local24.anIntArray30 != null && local663 < 20) {
												@Pc(1067) Class1_Sub3_Sub1_Sub1 local1067 = local24.method200(local663);
												if (local1067 != null) {
													local1067.method358(local681, local692);
												} else if (Static27.aBoolean41) {
													Static73.method1118(local24);
												}
											}
											local663++;
										}
									}
								} else if (local24.anInt326 == 3) {
									if (Static47.method837(local24)) {
										local663 = local24.anInt306;
										if (Static139.aClass11_10 == local24 && local24.anInt289 != 0) {
											local663 = local24.anInt289;
										}
									} else {
										local663 = local24.anInt321;
										if (local24 == Static139.aClass11_10 && local24.anInt325 != 0) {
											local663 = local24.anInt325;
										}
									}
									if (local110 == 0) {
										if (local24.aBoolean19) {
											Static46.method3173(local102, local107, local24.anInt312, local24.anInt263, local663);
										} else {
											Static46.method3175(local102, local107, local24.anInt312, local24.anInt263, local663);
										}
									} else if (local24.aBoolean19) {
										Static46.method3163(local102, local107, local24.anInt312, local24.anInt263, local663, 256 - (local110 & 0xFF));
									} else {
										Static46.method3176(local102, local107, local24.anInt312, local24.anInt263, local663, 256 - (local110 & 0xFF));
									}
								} else {
									@Pc(1205) Class1_Sub3_Sub1_Sub3_Sub1 local1205;
									if (local24.anInt326 == 4) {
										local1205 = local24.method194(Static21.aClass1_Sub3_Sub1_Sub5Array2);
										if (local1205 != null) {
											@Pc(1217) Class92 local1217 = local24.aClass92_104;
											if (Static47.method837(local24)) {
												local665 = local24.anInt306;
												if (Static139.aClass11_10 == local24 && local24.anInt289 != 0) {
													local665 = local24.anInt289;
												}
												if (local24.aClass92_100.method3233() > 0) {
													local1217 = local24.aClass92_100;
												}
											} else {
												local665 = local24.anInt321;
												if (Static139.aClass11_10 == local24 && local24.anInt325 != 0) {
													local665 = local24.anInt325;
												}
											}
											if (local24.aBoolean28 && local24.anInt309 != -1) {
												@Pc(1274) Class1_Sub3_Sub22 local1274 = Static102.method1549(local24.anInt309);
												local1217 = local1274.aClass92_1846;
												if (local1217 == null) {
													local1217 = Static193.aClass92_1451;
												}
												if ((local1274.anInt3863 == 1 || local24.anInt314 != 1) && local24.anInt314 != -1) {
													local1217 = Static208.method787(new Class92[] { Static98.aClass92_936, local1217, Static95.aClass92_892, Static76.method1145(local24.anInt314) });
												}
											}
											if (Static82.aClass11_6 == local24) {
												local1217 = Static152.aClass92_1489;
												local665 = local24.anInt321;
											}
											if (!local24.aBoolean28) {
												local1217 = Static210.method3419(local24, local1217);
											}
											local1205.method2473(local1217, local102, local107, local24.anInt312, local24.anInt263, local665, local24.aBoolean29 ? 0 : -1, local24.anInt283, local24.anInt304, local24.anInt320);
										} else if (Static27.aBoolean41) {
											Static73.method1118(local24);
										}
									} else if (local24.anInt326 == 5) {
										@Pc(1375) Class1_Sub3_Sub1_Sub1 local1375;
										if (local24.aBoolean28) {
											if (local24.anInt309 == -1) {
												local1375 = local24.method203(false);
											} else {
												local1375 = Static48.method864(local24.anInt298, local24.anInt309, local24.anInt314, false, false, local24.aBoolean31, local24.anInt257);
											}
											if (local1375 != null) {
												local665 = local1375.anInt451;
												local669 = local1375.anInt449;
												if (local24.aBoolean27) {
													local681 = (local24.anInt312 + local665 - 1) / local665;
													local692 = (local669 + local24.anInt263 - 1) / local669;
													Static46.method3155(local102, local107, local24.anInt312 + local102, local107 + local24.anInt263);
													for (local832 = 0; local832 < local681; local832++) {
														for (local837 = 0; local837 < local692; local837++) {
															if (local24.anInt286 != 0) {
																local1375.method360(local665 / 2 + local102 + local832 * local665, local669 * local837 + local107 + local669 / 2, local24.anInt286, 4096);
															} else if (local110 == 0) {
																local1375.method358(local665 * local832 + local102, local669 * local837 + local107);
															} else {
																local1375.method363(local102 + local665 * local832, local669 * local837 + local107, 256 - (local110 & 0xFF));
															}
														}
													}
													Static46.method3170(arg5, arg8, arg3, arg6);
												} else {
													local681 = local24.anInt312 * 4096 / local665;
													if (local24.anInt286 != 0) {
														local1375.method360(local102 + local24.anInt312 / 2, local24.anInt263 / 2 + local107, local24.anInt286, local681);
													} else if (local110 != 0) {
														local1375.method371(local102, local107, local24.anInt312, local24.anInt263, 256 - (local110 & 0xFF));
													} else if (local24.anInt312 == local665 && local24.anInt263 == local669) {
														local1375.method358(local102, local107);
													} else {
														local1375.method375(local102, local107, local24.anInt312, local24.anInt263);
													}
												}
											} else if (Static27.aBoolean41) {
												Static73.method1118(local24);
											}
										} else {
											local1375 = local24.method203(Static47.method837(local24));
											if (local1375 != null) {
												local1375.method358(local102, local107);
											} else if (Static27.aBoolean41) {
												Static73.method1118(local24);
											}
										}
									} else {
										@Pc(1666) Class1_Sub3_Sub22 local1666;
										@Pc(1880) int local1880;
										if (local24.anInt326 == 6) {
											@Pc(1642) boolean local1642 = Static47.method837(local24);
											if (local1642) {
												local665 = local24.anInt279;
											} else {
												local665 = local24.anInt311;
											}
											local681 = 0;
											@Pc(1656) Class8_Sub5 local1656 = null;
											if (local24.anInt309 != -1) {
												local1666 = Static102.method1549(local24.anInt309);
												if (local1666 != null) {
													local1666 = local1666.method2931(local24.anInt314);
													local1656 = local1666.method2938(null, 1, 0);
													if (local1656 == null) {
														Static73.method1118(local24);
													} else {
														local681 = -local1656.method2668() / 2;
													}
												}
											} else if (local24.anInt302 == 5) {
												if (local24.anInt250 == -1) {
													local1656 = Static121.aClass95_106.method3298(-1, null, null, -1);
												} else {
													local692 = local24.anInt250 & 0x7FF;
													if (Static32.anInt769 == local692) {
														local692 = 2047;
													}
													@Pc(1769) Class8_Sub3_Sub1 local1769 = Static47.aClass8_Sub3_Sub1Array1[local692];
													@Pc(1778) Class1_Sub3_Sub20 local1778 = local665 == -1 ? null : Static84.method1279(local665);
													if (local1769 != null && (int) local1769.aClass92_374.method3217() << 11 == (local24.anInt250 & 0xFFFFF800)) {
														local1656 = local1769.aClass95_18.method3298(0, null, local1778, local24.anInt276);
													}
												}
											} else if (local665 == -1) {
												local1656 = local24.method202(-1, Static15.aClass8_Sub3_Sub1_1.aClass95_18, null, local1642);
												if (local1656 == null && Static27.aBoolean41) {
													Static73.method1118(local24);
												}
											} else {
												@Pc(1707) Class1_Sub3_Sub20 local1707 = Static84.method1279(local665);
												local1656 = local24.method202(local24.anInt276, Static15.aClass8_Sub3_Sub1_1.aClass95_18, local1707, local1642);
												if (local1656 == null && Static27.aBoolean41) {
													Static73.method1118(local24);
												}
											}
											if (local1656 != null) {
												if (local24.anInt284 <= 0) {
													local832 = 256;
												} else {
													local832 = (local24.anInt263 << 8) / local24.anInt284;
												}
												local730 = local107 + local24.anInt263 / 2 + (local24.anInt303 * local832 >> 8);
												if (local24.anInt287 <= 0) {
													local692 = 256;
												} else {
													local692 = (local24.anInt312 << 8) / local24.anInt287;
												}
												local837 = (local24.anInt290 * local692 >> 8) + local102 + local24.anInt312 / 2;
												Static174.method2849(local837, local730);
												local1880 = local24.anInt308 * Class1_Sub3_Sub1_Sub4.anIntArray320[local24.anInt258] >> 16;
												@Pc(1890) int local1890 = local24.anInt308 * Class1_Sub3_Sub1_Sub4.anIntArray317[local24.anInt258] >> 16;
												if (!local24.aBoolean28) {
													local1656.method2036(local24.anInt317, 0, local24.anInt258, 0, local1880, local1890);
												} else if (local24.aBoolean22) {
													((Class8_Sub5_Sub1) local1656).method2055(local24.anInt317, local24.anInt323, local24.anInt258, local24.anInt281, local24.anInt328 + local1880 + local681, local24.anInt328 + local1890, local24.anInt308);
												} else {
													local1656.method2036(local24.anInt317, local24.anInt323, local24.anInt258, local24.anInt281, local1880 + local681 + local24.anInt328, local24.anInt328 + local1890);
												}
												Static174.method2835();
											}
										} else {
											if (local24.anInt326 == 7) {
												local1205 = local24.method194(Static21.aClass1_Sub3_Sub1_Sub5Array2);
												if (local1205 == null) {
													if (Static27.aBoolean41) {
														Static73.method1118(local24);
													}
													continue;
												}
												local665 = 0;
												for (local669 = 0; local669 < local24.anInt296; local669++) {
													for (local681 = 0; local681 < local24.anInt307; local681++) {
														if (local24.anIntArray29[local665] > 0) {
															local1666 = Static102.method1549(local24.anIntArray29[local665] - 1);
															@Pc(2037) Class92 local2037;
															if (local1666.anInt3863 != 1 && local24.anIntArray24[local665] == 1) {
																local2037 = Static208.method787(new Class92[] { Static98.aClass92_936, local1666.aClass92_1846, Static195.aClass92_1982 });
															} else {
																local2037 = Static208.method787(new Class92[] { Static98.aClass92_936, local1666.aClass92_1846, Static95.aClass92_892, Static76.method1145(local24.anIntArray24[local665]) });
															}
															local837 = (local24.anInt278 + 115) * local681 + local102;
															local730 = local107 + local669 * (local24.anInt254 + 12);
															if (local24.anInt283 == 0) {
																local1205.method2443(local2037, local837, local730, local24.anInt321, local24.aBoolean29 ? 0 : -1);
															} else if (local24.anInt283 == 1) {
																local1205.method2451(local2037, local837 + 57, local730, local24.anInt321, local24.aBoolean29 ? 0 : -1);
															} else {
																local1205.method2444(local2037, local837 + 115 - 1, local730, local24.anInt321, local24.aBoolean29 ? 0 : -1);
															}
														}
														local665++;
													}
												}
											}
											if (local24.anInt326 == 8 && Static138.aClass11_9 == local24 && Static173.anInt3688 == Static33.anInt799) {
												local663 = 0;
												@Pc(2174) Class92 local2174 = local24.aClass92_104;
												@Pc(2176) Class1_Sub3_Sub1_Sub3_Sub1 local2176 = Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2;
												local2174 = Static210.method3419(local24, local2174);
												local665 = 0;
												@Pc(2199) Class92 local2199;
												while (local2174.method3233() > 0) {
													local832 = local2174.method3234(Static117.aClass92_1159);
													if (local832 == -1) {
														local2199 = local2174;
														local2174 = Static26.aClass92_268;
													} else {
														local2199 = local2174.method3208(local832, 0);
														local2174 = local2174.method3232(local832 + 4);
													}
													local837 = local2176.method2462(local2199);
													local665 += local2176.anInt3279 + 1;
													if (local663 < local837) {
														local663 = local837;
													}
												}
												local663 += 6;
												local832 = local102 + local24.anInt312 - local663 - 5;
												local837 = local24.anInt263 + local107 + 5;
												if (local102 + 5 > local832) {
													local832 = local102 + 5;
												}
												local665 += 7;
												if (local663 + local832 > arg3) {
													local832 = arg3 - local663;
												}
												if (arg6 < local665 + local837) {
													local837 = arg6 - local665;
												}
												Static46.method3173(local832, local837, local663, local665, 16777120);
												Static46.method3175(local832, local837, local663, local665, 0);
												local730 = local837 + local2176.anInt3279 + 2;
												local2174 = local24.aClass92_104;
												local2174 = Static210.method3419(local24, local2174);
												while (local2174.method3233() > 0) {
													local1880 = local2174.method3234(Static117.aClass92_1159);
													if (local1880 == -1) {
														local2199 = local2174;
														local2174 = Static26.aClass92_268;
													} else {
														local2199 = local2174.method3208(local1880, 0);
														local2174 = local2174.method3232(local1880 + 4);
													}
													local2176.method2443(local2199, local832 + 3, local730, 0, -1);
													local730 += local2176.anInt3279 + 1;
												}
											}
											if (local24.anInt326 == 9) {
												if (local24.aBoolean17) {
													local669 = local102 + local24.anInt312;
													local665 = local24.anInt263 + local107;
													local681 = local107;
												} else {
													local669 = local24.anInt312 + local102;
													local681 = local24.anInt263 + local107;
													local665 = local107;
												}
												if (local24.anInt295 == 1) {
													Static46.method3177(local102, local665, local669, local681, local24.anInt321);
												} else {
													Static46.method3160(local102, local665, local669, local681, local24.anInt321, local24.anInt295);
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

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([[II)V")
	public static void method2263(@OriginalArg(0) int[][] arg0) {
		Static142.anIntArrayArray25 = arg0;
	}
}
