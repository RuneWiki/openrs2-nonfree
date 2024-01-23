import java.awt.Image;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "Ljava/awt/Image;")
	public static Image anImage44;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "[I")
	public static int[] anIntArray653;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1638 = Static200.method3116("Spieler");

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)Lclient!kh;")
	public static Class60 method3506(@OriginalArg(1) long arg0) {
		Static193.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static193.aCalendar2.get(7);
		@Pc(17) int local17 = Static193.aCalendar2.get(5);
		@Pc(30) int local30 = Static193.aCalendar2.get(2);
		@Pc(34) int local34 = Static193.aCalendar2.get(1);
		@Pc(38) int local38 = Static193.aCalendar2.get(11);
		@Pc(42) int local42 = Static193.aCalendar2.get(12);
		@Pc(46) int local46 = Static193.aCalendar2.get(13);
		return Static34.method611(new Class60[] { Static74.aClass60Array12[local13 - 1], Static197.aClass60_1437, Static40.method681(local17 / 10), Static40.method681(local17 % 10), Static53.aClass60_419, Static62.aClass60Array10[local30], Static53.aClass60_419, Static40.method681(local34), Static84.aClass60_437, Static40.method681(local38 / 10), Static40.method681(local38 % 10), Static35.aClass60_276, Static40.method681(local42 / 10), Static40.method681(local42 % 10), Static35.aClass60_276, Static40.method681(local46 / 10), Static40.method681(local46 % 10), Static83.aClass60_644 });
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III[Lclient!ah;IIIIII)V")
	public static void method3507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static76.method1363(arg5, arg7, arg2, arg0);
		Static81.method1437();
		for (@Pc(9) int local9 = 0; local9 < arg3.length; local9++) {
			@Pc(17) Class6 local17 = arg3[local9];
			if (local17 != null && (local17.anInt204 == arg4 || arg4 == -1412584499 && Static60.aClass6_9 == local17)) {
				@Pc(66) int local66;
				if (arg8 == -1) {
					Static6.anIntArray20[Static124.anInt2763] = arg1 + local17.anInt262;
					Static34.anIntArray123[Static124.anInt2763] = local17.anInt235 + arg6;
					Static1.anIntArray9[Static124.anInt2763] = local17.anInt251;
					Static91.anIntArray252[Static124.anInt2763] = local17.anInt221;
					local66 = Static124.anInt2763++;
				} else {
					local66 = arg8;
				}
				local17.anInt267 = Static42.anInt910;
				local17.anInt218 = local66;
				if (!local17.aBoolean13 || !Static132.method2209(local17)) {
					if (local17.anInt245 > 0) {
						Static45.method774(local17);
					}
					@Pc(92) int local92 = local17.anInt217;
					@Pc(98) int local98 = local17.anInt262 + arg1;
					@Pc(103) int local103 = local17.anInt235 + arg6;
					if (Static94.aBoolean118 && (Static166.method2717(local17) != 0 || local17.anInt233 == 0) && local92 > 127) {
						local92 = 127;
					}
					@Pc(148) int local148;
					@Pc(163) int local163;
					if (local17 == Static60.aClass6_9) {
						if (arg4 != -1412584499 && !local17.aBoolean12) {
							Static68.anInt1699 = arg1;
							Static199.aClass6Array2 = arg3;
							Static150.anInt3351 = arg6;
							continue;
						}
						if (Static37.aBoolean55 && Static128.aBoolean157) {
							local148 = Static122.anInt2732;
							local148 -= Static29.anInt707;
							if (local148 < Static190.anInt4082) {
								local148 = Static190.anInt4082;
							}
							local163 = Static176.anInt768;
							local163 -= Static184.anInt3955;
							if (local163 < Static83.anInt1957) {
								local163 = Static83.anInt1957;
							}
							if (Static84.aClass6_8.anInt251 + Static190.anInt4082 < local148 - -local17.anInt251) {
								local148 = Static84.aClass6_8.anInt251 + Static190.anInt4082 - local17.anInt251;
							}
							local98 = local148;
							if (Static84.aClass6_8.anInt221 + Static83.anInt1957 < local17.anInt221 + local163) {
								local163 = Static83.anInt1957 + Static84.aClass6_8.anInt221 - local17.anInt221;
							}
							local103 = local163;
						}
						if (!local17.aBoolean12) {
							local92 = 128;
						}
					}
					@Pc(230) int local230;
					@Pc(234) int local234;
					@Pc(252) int local252;
					@Pc(269) int local269;
					if (local17.anInt233 == 2) {
						local148 = arg5;
						local230 = arg2;
						local163 = arg7;
						local234 = arg0;
					} else {
						local148 = local98 > arg5 ? local98 : arg5;
						local252 = local17.anInt251 + local98;
						local163 = local103 <= arg7 ? arg7 : local103;
						local269 = local103 + local17.anInt221;
						if (local17.anInt233 == 9) {
							local269++;
							local252++;
						}
						local230 = arg2 > local252 ? local252 : arg2;
						local234 = local269 >= arg0 ? arg0 : local269;
					}
					if (!local17.aBoolean13 || local230 > local148 && local163 < local234) {
						if (local17.anInt245 != 0) {
							if (local17.anInt245 == 1337) {
								Static30.anInt719 = local98;
								Static36.anInt3884 = local103;
								Static50.method1421(local103, local17.anInt221, local17.anInt251, local98);
								Static76.method1363(arg5, arg7, arg2, arg0);
								continue;
							}
							if (local17.anInt245 == 1338) {
								if (local17.method160()) {
									Static67.method1209(local98, local103, local66, local17);
									Static76.method1363(arg5, arg7, arg2, arg0);
								}
								continue;
							}
							if (local17.anInt245 == 1339) {
								if (local17.method160()) {
									Static60.method1098(local98, local103, local17, local66);
									Static76.method1363(arg5, arg7, arg2, arg0);
								}
								continue;
							}
							if (local17.anInt245 == 1400) {
								Static192.method3005(local17.anInt251, local17.anInt221, local103, local98);
								Static153.aBooleanArray19[local66] = true;
								Static47.aBooleanArray4[local66] = true;
								Static76.method1363(arg5, arg7, arg2, arg0);
								continue;
							}
							if (local17.anInt245 == 1401) {
								Static181.method2866(local103, local98, local17.anInt221, local17.anInt251);
								Static153.aBooleanArray19[local66] = true;
								Static47.aBooleanArray4[local66] = true;
								Static76.method1363(arg5, arg7, arg2, arg0);
								continue;
							}
						}
						local269 = Static176.anInt768;
						local252 = Static122.anInt2732;
						if (local17.anInt233 == 0 && local17.aBoolean18 && local148 <= Static122.anInt2732 && local163 <= Static176.anInt768 && Static122.anInt2732 < local230 && local234 > Static176.anInt768 && !Static162.aBoolean261 && !Static94.aBoolean118) {
							Static171.aShortArray50[0] = 1004;
							Static23.aClass60Array17[0] = Static185.aClass60_1341;
							Static91.anInt2134 = 1;
							Static52.aClass60Array8[0] = Static149.aClass60_1155;
						}
						if (!Static162.aBoolean261 && local252 >= local148 && local163 <= local269 && local230 > local252 && local269 < local234) {
							Static136.method2300(local252 - local98, local17, local269 - local103);
						}
						if (local17.anInt233 == 0) {
							if (!local17.aBoolean13 && Static132.method2209(local17) && Static173.aClass6_15 != local17) {
								continue;
							}
							if (!local17.aBoolean13) {
								if (local17.anInt266 - local17.anInt221 < local17.anInt247) {
									local17.anInt247 = local17.anInt266 - local17.anInt221;
								}
								if (local17.anInt247 < 0) {
									local17.anInt247 = 0;
								}
							}
							method3507(local234, local98 - local17.anInt250, local230, arg3, local17.anInt229, local148, local103 - local17.anInt247, local163, local66);
							if (local17.aClass6Array1 != null) {
								method3507(local234, local98 - local17.anInt250, local230, local17.aClass6Array1, local17.anInt229, local148, local103 - local17.anInt247, local163, local66);
							}
							@Pc(626) Class1_Sub11 local626 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local17.anInt229);
							if (local626 != null) {
								if (local626.anInt1627 == 0 && Static122.anInt2732 >= local148 && Static176.anInt768 >= local163 && local230 > Static122.anInt2732 && local234 > Static176.anInt768 && !Static162.aBoolean261 && !Static94.aBoolean118) {
									Static91.anInt2134 = 1;
									Static23.aClass60Array17[0] = Static185.aClass60_1341;
									Static171.aShortArray50[0] = 1004;
									Static52.aClass60Array8[0] = Static149.aClass60_1155;
								}
								Static202.method3135(local163, local230, local234, local148, local103, local98, local626.anInt1626, local66);
							}
							Static76.method1363(arg5, arg7, arg2, arg0);
							Static81.method1437();
						}
						if (Static15.aBooleanArray1[local66] || Static84.anInt1466 > 1) {
							if (local17.anInt233 == 0 && !local17.aBoolean13 && local17.anInt266 > local17.anInt221) {
								Static143.method2449(local103, local17.anInt221, local17.anInt266, local17.anInt247, local98 + local17.anInt251);
							}
							if (local17.anInt233 != 1) {
								@Pc(739) int local739;
								@Pc(743) int local743;
								@Pc(754) int local754;
								@Pc(956) int local956;
								@Pc(824) int local824;
								@Pc(737) int local737;
								@Pc(939) int local939;
								@Pc(763) int local763;
								if (local17.anInt233 == 2) {
									local737 = 0;
									for (local739 = 0; local739 < local17.anInt271; local739++) {
										for (local743 = 0; local743 < local17.anInt232; local743++) {
											local754 = (local17.anInt238 + 32) * local743 + local98;
											local763 = (local17.anInt260 + 32) * local739 + local103;
											if (local737 < 20) {
												local763 += local17.anIntArray36[local737];
												local754 += local17.anIntArray34[local737];
											}
											if (local17.anIntArray31[local737] > 0) {
												local824 = local17.anIntArray31[local737] - 1;
												if (local754 + 32 > arg5 && local754 < arg2 && local763 + 32 > arg7 && arg0 > local763 || local17 == Static17.aClass6_2 && Static27.anInt637 == local737) {
													@Pc(882) Class1_Sub1_Sub6 local882;
													if (Static79.anInt1905 == 1 && Static163.anInt3585 == local737 && local17.anInt229 == Static55.anInt1474) {
														local882 = Static137.method3328(local17.anIntArray26[local737], local17.aBoolean19, 0, 2, local824);
													} else {
														local882 = Static137.method3328(local17.anIntArray26[local737], local17.aBoolean19, 3153952, 1, local824);
													}
													if (Static81.aBoolean105) {
														Static153.aBooleanArray19[local66] = true;
													}
													if (local882 == null) {
														Static57.method1068(local17);
													} else if (local17 == Static17.aClass6_2 && local737 == Static27.anInt637) {
														local939 = Static122.anInt2732 - Static38.anInt870;
														if (local939 < 5 && local939 > -5) {
															local939 = 0;
														}
														local956 = Static176.anInt768 - Static116.anInt2635;
														if (local956 < 5 && local956 > -5) {
															local956 = 0;
														}
														if (Static67.anInt1655 < 5) {
															local956 = 0;
															local939 = 0;
														}
														local882.method2161(local939 + local754, local763 + local956, 128);
														if (arg4 != -1) {
															@Pc(993) Class6 local993 = arg3[arg4 & 0xFFFF];
															@Pc(995) int local995 = Static76.anInt1844;
															@Pc(997) int local997 = Static76.anInt1847;
															@Pc(1015) int local1015;
															if (local956 + local763 < local997 && local993.anInt247 > 0) {
																local1015 = Static26.anInt594 * (local997 - local763 - local956) / 3;
																if (Static26.anInt594 * 10 < local1015) {
																	local1015 = Static26.anInt594 * 10;
																}
																if (local993.anInt247 < local1015) {
																	local1015 = local993.anInt247;
																}
																Static116.anInt2635 += local1015;
																local993.anInt247 -= local1015;
																Static57.method1068(local993);
															}
															if (local956 + local763 + 32 > local995 && local993.anInt247 < local993.anInt266 - local993.anInt221) {
																local1015 = (local763 + local956 + 32 - local995) * Static26.anInt594 / 3;
																if (local1015 > Static26.anInt594 * 10) {
																	local1015 = Static26.anInt594 * 10;
																}
																if (local993.anInt266 - local993.anInt221 - local993.anInt247 < local1015) {
																	local1015 = local993.anInt266 - local993.anInt221 - local993.anInt247;
																}
																local993.anInt247 += local1015;
																Static116.anInt2635 -= local1015;
																Static57.method1068(local993);
															}
														}
													} else if (Static105.aClass6_11 == local17 && local737 == Static147.anInt3280) {
														local882.method2161(local754, local763, 128);
													} else {
														local882.method2164(local754, local763);
													}
												}
											} else if (local17.anIntArray28 != null && local737 < 20) {
												@Pc(798) Class1_Sub1_Sub6 local798 = local17.method149(local737);
												if (local798 != null) {
													local798.method2164(local754, local763);
												} else if (Static92.aBoolean117) {
													Static57.method1068(local17);
												}
											}
											local737++;
										}
									}
								} else if (local17.anInt233 == 3) {
									if (Static3.method60(local17)) {
										local737 = local17.anInt210;
										if (local17 == Static173.aClass6_15 && local17.anInt203 != 0) {
											local737 = local17.anInt203;
										}
									} else {
										local737 = local17.anInt191;
										if (Static173.aClass6_15 == local17 && local17.anInt249 != 0) {
											local737 = local17.anInt249;
										}
									}
									if (local92 == 0) {
										if (local17.aBoolean11) {
											Static76.method1367(local98, local103, local17.anInt251, local17.anInt221, local737);
										} else {
											Static76.method1374(local98, local103, local17.anInt251, local17.anInt221, local737);
										}
									} else if (local17.aBoolean11) {
										Static76.method1368(local98, local103, local17.anInt251, local17.anInt221, local737, 256 - (local92 & 0xFF));
									} else {
										Static76.method1373(local98, local103, local17.anInt251, local17.anInt221, local737, 256 - (local92 & 0xFF));
									}
								} else {
									@Pc(1262) Class1_Sub1_Sub14 local1262;
									if (local17.anInt233 == 4) {
										local1262 = local17.method155(Static108.aClass73Array4);
										if (local1262 != null) {
											@Pc(1274) Class60 local1274 = local17.aClass60_73;
											if (Static3.method60(local17)) {
												local739 = local17.anInt210;
												if (Static173.aClass6_15 == local17 && local17.anInt203 != 0) {
													local739 = local17.anInt203;
												}
												if (local17.aClass60_81.method1835() > 0) {
													local1274 = local17.aClass60_81;
												}
											} else {
												local739 = local17.anInt191;
												if (local17 == Static173.aClass6_15 && local17.anInt249 != 0) {
													local739 = local17.anInt249;
												}
											}
											if (local17.aBoolean13 && local17.anInt195 != -1) {
												@Pc(1330) Class1_Sub1_Sub18 local1330 = Static191.method2990(local17.anInt195);
												local1274 = local1330.aClass60_1043;
												if (local1274 == null) {
													local1274 = Static159.aClass60_1222;
												}
												if ((local1330.anInt3014 == 1 || local17.anInt193 != 1) && local17.anInt193 != -1) {
													local1274 = Static34.method611(new Class60[] { Static211.aClass60_1198, local1274, Static187.aClass60_1349, Static180.method2859(local17.anInt193) });
												}
											}
											if (Static168.aClass6_14 == local17) {
												local739 = local17.anInt191;
												local1274 = Static218.aClass60_1640;
											}
											if (!local17.aBoolean13) {
												local1274 = Static107.method1860(local1274, local17);
											}
											local1262.method3298(local1274, local98, local103, local17.anInt251, local17.anInt221, local739, local17.aBoolean20 ? 0 : -1, local17.anInt254, local17.anInt227, local17.anInt225);
										} else if (Static92.aBoolean117) {
											Static57.method1068(local17);
										}
									} else if (local17.anInt233 == 5) {
										@Pc(1446) Class1_Sub1_Sub6 local1446;
										if (local17.aBoolean13) {
											if (local17.anInt195 == -1) {
												local1446 = local17.method154(false);
											} else {
												local1446 = Static137.method3328(local17.anInt193, local17.aBoolean19, local17.anInt259, local17.anInt211, local17.anInt195);
											}
											if (local1446 != null) {
												local739 = local1446.anInt2843;
												local743 = local1446.anInt2835;
												if (local17.aBoolean8) {
													local754 = (local17.anInt251 + local739 - 1) / local739;
													local763 = (local743 + local17.anInt221 - 1) / local743;
													Static76.method1358(local98, local103, local98 + local17.anInt251, local17.anInt221 + local103);
													for (local939 = 0; local939 < local754; local939++) {
														for (local956 = 0; local956 < local763; local956++) {
															if (local17.anInt230 != 0) {
																local1446.method2163(local17.anInt230, 4096, local98 + local939 * local739 + local739 / 2, local743 * local956 + local103 + local743 / 2);
															} else if (local92 == 0) {
																local1446.method2164(local98 + local939 * local739, local956 * local743 + local103);
															} else {
																local1446.method2161(local939 * local739 + local98, local743 * local956 + local103, 256 - (local92 & 0xFF));
															}
														}
													}
													Static76.method1363(arg5, arg7, arg2, arg0);
												} else {
													local754 = local17.anInt251 * 4096 / local739;
													if (local17.anInt230 != 0) {
														local1446.method2163(local17.anInt230, local754, local17.anInt251 / 2 + local98, local17.anInt221 / 2 + local103);
													} else if (local92 != 0) {
														local1446.method2159(local98, local103, local17.anInt251, local17.anInt221, 256 - (local92 & 0xFF));
													} else if (local739 == local17.anInt251 && local743 == local17.anInt221) {
														local1446.method2164(local98, local103);
													} else {
														local1446.method2158(local98, local103, local17.anInt251, local17.anInt221);
													}
												}
											} else if (Static92.aBoolean117) {
												Static57.method1068(local17);
											}
										} else {
											local1446 = local17.method154(Static3.method60(local17));
											if (local1446 != null) {
												local1446.method2164(local98, local103);
											} else if (Static92.aBoolean117) {
												Static57.method1068(local17);
											}
										}
									} else {
										@Pc(1834) Class1_Sub1_Sub18 local1834;
										@Pc(1940) int local1940;
										if (local17.anInt233 == 6) {
											@Pc(1693) boolean local1693 = Static3.method60(local17);
											if (local1693) {
												local739 = local17.anInt213;
											} else {
												local739 = local17.anInt264;
											}
											@Pc(1705) Class9_Sub2 local1705 = null;
											local754 = 0;
											if (local17.anInt195 != -1) {
												local1834 = Static191.method2990(local17.anInt195);
												if (local1834 != null) {
													local1834 = local1834.method2303(local17.anInt193);
													local1705 = local1834.method2298(1, 0, null);
													if (local1705 == null) {
														Static57.method1068(local17);
													} else {
														local754 = -local1705.method2902() / 2;
													}
												}
											} else if (local17.anInt246 == 5) {
												if (local17.anInt239 == -1) {
													local1705 = Static9.aClass50_3.method1526(null, -1, -1, null);
												} else {
													local763 = local17.anInt239 & 0x7FF;
													if (local763 == Static65.anInt1615) {
														local763 = 2047;
													}
													@Pc(1782) Class9_Sub4_Sub1 local1782 = Static41.aClass9_Sub4_Sub1Array2[local763];
													@Pc(1791) Class1_Sub1_Sub21 local1791 = local739 == -1 ? null : Static74.method1343(local739);
													if (local1782 != null && (int) local1782.aClass60_414.method1829() << 11 == (local17.anInt239 & 0xFFFFF800)) {
														local1705 = local1782.aClass50_2.method1526(local1791, local17.anInt269, 0, null);
													}
												}
											} else if (local739 == -1) {
												local1705 = local17.method158(Static84.aClass9_Sub4_Sub1_2.aClass50_2, null, -1, local1693);
												if (local1705 == null && Static92.aBoolean117) {
													Static57.method1068(local17);
												}
											} else {
												@Pc(1745) Class1_Sub1_Sub21 local1745 = Static74.method1343(local739);
												local1705 = local17.method158(Static84.aClass9_Sub4_Sub1_2.aClass50_2, local1745, local17.anInt269, local1693);
												if (local1705 == null && Static92.aBoolean117) {
													Static57.method1068(local17);
												}
											}
											if (local1705 != null) {
												if (local17.anInt205 <= 0) {
													local763 = 256;
												} else {
													local763 = (local17.anInt251 << 8) / local17.anInt205;
												}
												if (local17.anInt234 > 0) {
													local939 = (local17.anInt221 << 8) / local17.anInt234;
												} else {
													local939 = 256;
												}
												local956 = (local17.anInt209 * local763 >> 8) + local17.anInt251 / 2 + local98;
												local824 = local103 + local17.anInt221 / 2 + (local17.anInt268 * local939 >> 8);
												Static81.method1448(local956, local824);
												local1940 = local17.anInt212 * Class46.anIntArray226[local17.anInt237] >> 16;
												@Pc(1950) int local1950 = Class46.anIntArray225[local17.anInt237] * local17.anInt212 >> 16;
												if (!local17.aBoolean13) {
													local1705.method1710(local17.anInt223, 0, local17.anInt237, 0, local1940, local1950);
												} else if (local17.aBoolean10) {
													((Class9_Sub2_Sub1) local1705).method1720(local17.anInt223, local17.anInt265, local17.anInt237, local17.anInt216, local17.anInt192 + local754 + local1940, local1950 + local17.anInt192, local17.anInt212);
												} else {
													local1705.method1710(local17.anInt223, local17.anInt265, local17.anInt237, local17.anInt216, local1940 + local754 + local17.anInt192, local1950 + local17.anInt192);
												}
												Static81.method1440();
											}
										} else {
											if (local17.anInt233 == 7) {
												local1262 = local17.method155(Static108.aClass73Array4);
												if (local1262 == null) {
													if (Static92.aBoolean117) {
														Static57.method1068(local17);
													}
													continue;
												}
												local739 = 0;
												for (local743 = 0; local743 < local17.anInt271; local743++) {
													for (local754 = 0; local754 < local17.anInt232; local754++) {
														if (local17.anIntArray31[local739] > 0) {
															local1834 = Static191.method2990(local17.anIntArray31[local739] - 1);
															@Pc(2106) Class60 local2106;
															if (local1834.anInt3014 != 1 && local17.anIntArray26[local739] == 1) {
																local2106 = Static34.method611(new Class60[] { Static211.aClass60_1198, local1834.aClass60_1043, Static178.aClass60_1300 });
															} else {
																local2106 = Static34.method611(new Class60[] { Static211.aClass60_1198, local1834.aClass60_1043, Static187.aClass60_1349, Static180.method2859(local17.anIntArray26[local739]) });
															}
															local956 = local98 + local754 * (local17.anInt238 + 115);
															local824 = local103 + (local17.anInt260 + 12) * local743;
															if (local17.anInt254 == 0) {
																local1262.method3317(local2106, local956, local824, local17.anInt191, local17.aBoolean20 ? 0 : -1);
															} else if (local17.anInt254 == 1) {
																local1262.method3314(local2106, local956 + 57, local824, local17.anInt191, local17.aBoolean20 ? 0 : -1);
															} else {
																local1262.method3308(local2106, local956 + 115 - 1, local824, local17.anInt191, local17.aBoolean20 ? 0 : -1);
															}
														}
														local739++;
													}
												}
											}
											if (local17.anInt233 == 8 && local17 == Static26.aClass6_3 && Static7.anInt185 == Static146.anInt3258) {
												local737 = 0;
												local739 = 0;
												@Pc(2244) Class1_Sub1_Sub14 local2244 = Static49.aClass1_Sub1_Sub14_3;
												@Pc(2247) Class60 local2247 = local17.aClass60_73;
												local2247 = Static107.method1860(local2247, local17);
												@Pc(2269) Class60 local2269;
												while (local2247.method1835() > 0) {
													local939 = local2247.method1815(Static201.aClass60_1465);
													if (local939 == -1) {
														local2269 = local2247;
														local2247 = Static149.aClass60_1155;
													} else {
														local2269 = local2247.method1797(0, local939);
														local2247 = local2247.method1818(local939 + 4);
													}
													local956 = local2244.method3307(local2269);
													if (local737 < local956) {
														local737 = local956;
													}
													local739 += local2244.anInt4516 + 1;
												}
												local739 += 7;
												local737 += 6;
												local956 = local103 + local17.anInt221 + 5;
												local939 = local17.anInt251 + local98 - local737 - 5;
												if (local956 + local739 > arg0) {
													local956 = arg0 - local739;
												}
												if (local939 < local98 + 5) {
													local939 = local98 + 5;
												}
												if (local939 + local737 > arg2) {
													local939 = arg2 - local737;
												}
												Static76.method1367(local939, local956, local737, local739, 16777120);
												Static76.method1374(local939, local956, local737, local739, 0);
												local2247 = local17.aClass60_73;
												local824 = local956 + local2244.anInt4516 + 2;
												local2247 = Static107.method1860(local2247, local17);
												while (local2247.method1835() > 0) {
													local1940 = local2247.method1815(Static201.aClass60_1465);
													if (local1940 == -1) {
														local2269 = local2247;
														local2247 = Static149.aClass60_1155;
													} else {
														local2269 = local2247.method1797(0, local1940);
														local2247 = local2247.method1818(local1940 + 4);
													}
													local2244.method3317(local2269, local939 + 3, local824, 0, -1);
													local824 += local2244.anInt4516 + 1;
												}
											}
											if (local17.anInt233 == 9) {
												if (local17.aBoolean14) {
													local743 = local98 + local17.anInt251;
													local754 = local103;
													local739 = local103 + local17.anInt221;
												} else {
													local743 = local17.anInt251 + local98;
													local754 = local17.anInt221 + local103;
													local739 = local103;
												}
												if (local17.anInt270 == 1) {
													Static76.method1355(local98, local739, local743, local754, local17.anInt191);
												} else {
													Static76.method1360(local98, local739, local743, local754, local17.anInt191, local17.anInt270);
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

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ai;III)[Lclient!o;")
	public static Class73_Sub1[] method3511(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static87.method1515(arg1, arg2, arg0) ? Static105.method1784() : null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!ai;II)Lclient!r;")
	public static Class73 method3515(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		return Static87.method1515(0, arg1, arg0) ? Static89.method1534() : null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIBI)V")
	public static void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg1 - arg3;
		@Pc(23) int local23 = arg2 - arg0;
		if (local18 == 0) {
			if (local23 != 0) {
				Static199.method3111(arg0, arg4, arg3, arg2);
			}
		} else if (local23 == 0) {
			Static26.method430(arg3, arg0, arg4, arg1);
		} else {
			if (local18 < 0) {
				local18 = -local18;
			}
			if (local23 < 0) {
				local23 = -local23;
			}
			@Pc(76) boolean local76 = local23 > local18;
			@Pc(80) int local80;
			@Pc(84) int local84;
			if (local76) {
				local80 = arg3;
				arg3 = arg0;
				local84 = arg1;
				arg1 = arg2;
				arg0 = local80;
				arg2 = local84;
			}
			if (arg1 < arg3) {
				local80 = arg3;
				arg3 = arg1;
				arg1 = local80;
				local84 = arg0;
				arg0 = arg2;
				arg2 = local84;
			}
			local80 = arg0;
			local84 = arg1 - arg3;
			@Pc(116) int local116 = arg2 - arg0;
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(132) int local132 = arg2 <= arg0 ? -1 : 1;
			@Pc(137) int local137 = -(local84 >> 1);
			@Pc(141) int local141;
			if (local76) {
				for (local141 = arg3; local141 <= arg1; local141++) {
					local137 += local116;
					anIntArrayArray78[local141][local80] = arg4;
					if (local137 > 0) {
						local80 += local132;
						local137 -= local84;
					}
				}
			} else {
				for (local141 = arg3; local141 <= arg1; local141++) {
					local137 += local116;
					anIntArrayArray78[local80][local141] = arg4;
					if (local137 > 0) {
						local137 -= local84;
						local80 += local132;
					}
				}
			}
		}
	}
}
