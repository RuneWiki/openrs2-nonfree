import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
	public static boolean aBoolean81;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt1311 = 0;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method906() {
		if (Static25.anInt597 > 0) {
			Static25.anInt597--;
		}
		if (Static177.anInt3805 > 1) {
			Static177.anInt3805--;
		}
		if (Static38.aBoolean68) {
			Static38.aBoolean68 = false;
			Static150.method2273();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static163.method2691(); local29++) {
		}
		if (Static31.anInt748 != 30) {
			return;
		}
		Static95.method1382(Static38.aClass1_Sub14_Sub1_3);
		@Pc(53) Object local53 = Static165.aClass51_1.anObject2;
		@Pc(83) int local83;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(102) int local102;
		@Pc(118) int local118;
		synchronized (Static165.aClass51_1.anObject2) {
			if (!Static58.aBoolean95) {
				Static165.aClass51_1.anInt1978 = 0;
			} else if (Static196.anInt4284 != 0 || Static165.aClass51_1.anInt1978 >= 40) {
				Static38.aClass1_Sub14_Sub1_3.method3067(166);
				Static38.aClass1_Sub14_Sub1_3.method3024(0);
				local83 = Static38.aClass1_Sub14_Sub1_3.anInt4061;
				local85 = 0;
				for (local87 = 0; Static165.aClass51_1.anInt1978 > local87 && Static38.aClass1_Sub14_Sub1_3.anInt4061 - local83 < 240; local87++) {
					local85++;
					local102 = Static165.aClass51_1.anIntArray163[local87];
					if (local102 < 0) {
						local102 = 0;
					} else if (local102 > 502) {
						local102 = 502;
					}
					local118 = Static165.aClass51_1.anIntArray162[local87];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 764) {
						local118 = 764;
					}
					@Pc(138) int local138 = local102 * 765 + local118;
					if (Static165.aClass51_1.anIntArray163[local87] == -1 && Static165.aClass51_1.anIntArray162[local87] == -1) {
						local102 = -1;
						local118 = -1;
						local138 = 524287;
					}
					if (local118 != Static109.anInt2357 || Static145.anInt2921 != local102) {
						@Pc(179) int local179 = local118 - Static109.anInt2357;
						@Pc(184) int local184 = local102 - Static145.anInt2921;
						Static145.anInt2921 = local102;
						Static109.anInt2357 = local118;
						if (Static210.anInt4516 < 8 && local179 >= -32 && local179 <= 31 && local184 >= -32 && local184 <= 31) {
							local179 += 32;
							local184 += 32;
							Static38.aClass1_Sub14_Sub1_3.method3020(local184 + (Static210.anInt4516 << 12) + (local179 << 6));
							Static210.anInt4516 = 0;
						} else if (Static210.anInt4516 < 8) {
							Static38.aClass1_Sub14_Sub1_3.method3025(local138 + (Static210.anInt4516 << 19) + 8388608);
							Static210.anInt4516 = 0;
						} else {
							Static38.aClass1_Sub14_Sub1_3.method3032(local138 + (Static210.anInt4516 << 19) - 1073741824);
							Static210.anInt4516 = 0;
						}
					} else if (Static210.anInt4516 < 2047) {
						Static210.anInt4516++;
					}
				}
				Static38.aClass1_Sub14_Sub1_3.method3042(Static38.aClass1_Sub14_Sub1_3.anInt4061 - local83);
				if (local85 >= Static165.aClass51_1.anInt1978) {
					Static165.aClass51_1.anInt1978 = 0;
				} else {
					Static165.aClass51_1.anInt1978 -= local85;
					for (local102 = 0; local102 < Static165.aClass51_1.anInt1978; local102++) {
						Static165.aClass51_1.anIntArray162[local102] = Static165.aClass51_1.anIntArray162[local102 + local85];
						Static165.aClass51_1.anIntArray163[local102] = Static165.aClass51_1.anIntArray163[local85 + local102];
					}
				}
			}
		}
		if (Static196.anInt4284 != 0) {
			local83 = Static140.anInt2804;
			@Pc(350) long local350 = (Static196.aLong230 - Static121.aLong250) / 50L;
			if (local350 > 4095L) {
				local350 = 4095L;
			}
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 502) {
				local83 = 502;
			}
			local85 = Static57.anInt1370;
			@Pc(378) byte local378 = 0;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 764) {
				local85 = 764;
			}
			local118 = (int) local350;
			local87 = local85 + local83 * 765;
			Static121.aLong250 = Static196.aLong230;
			if (Static196.anInt4284 == 2) {
				local378 = 1;
			}
			Static38.aClass1_Sub14_Sub1_3.method3067(117);
			Static38.aClass1_Sub14_Sub1_3.method3050((local378 << 19) + ((local118 << 20) + local87));
		}
		if (Static64.anInt1511 > 0) {
			Static64.anInt1511--;
		}
		if (Static5.aBooleanArray2[96] || Static5.aBooleanArray2[97] || Static5.aBooleanArray2[98] || Static5.aBooleanArray2[99]) {
			Static40.aBoolean198 = true;
		}
		if (Static40.aBoolean198 && Static64.anInt1511 <= 0) {
			Static40.aBoolean198 = false;
			Static64.anInt1511 = 20;
			Static38.aClass1_Sub14_Sub1_3.method3067(39);
			Static38.aClass1_Sub14_Sub1_3.method3008(Static129.anInt2670);
			Static38.aClass1_Sub14_Sub1_3.method3019(Static106.anInt2306);
		}
		if (aBoolean81 && !Static29.aBoolean48) {
			Static29.aBoolean48 = true;
			Static38.aClass1_Sub14_Sub1_3.method3067(27);
			Static38.aClass1_Sub14_Sub1_3.method3024(1);
		}
		if (!aBoolean81 && Static29.aBoolean48) {
			Static29.aBoolean48 = false;
			Static38.aClass1_Sub14_Sub1_3.method3067(27);
			Static38.aClass1_Sub14_Sub1_3.method3024(0);
		}
		Static4.method92();
		if (Static31.anInt748 != 30) {
			return;
		}
		Static41.method730();
		Static185.method2999();
		Static184.anInt3960++;
		if (Static184.anInt3960 > 750) {
			Static150.method2273();
			return;
		}
		Static159.method2503();
		Static170.method2665();
		Static75.method1138();
		Static101.method1519();
		if (Static96.anInt2010 != 0) {
			Static108.anInt2346 += 20;
			if (Static108.anInt2346 >= 400) {
				Static96.anInt2010 = 0;
			}
		}
		Static110.anInt2383++;
		if (Static179.aClass11_19 != null) {
			Static129.anInt2666++;
			if (Static129.anInt2666 >= 15) {
				Static73.method1118(Static179.aClass11_19);
				Static179.aClass11_19 = null;
			}
		}
		@Pc(652) Class11 local652;
		if (Static153.aClass11_14 != null) {
			Static73.method1118(Static153.aClass11_14);
			if (Static117.anInt2509 + 5 < Static85.anInt1855 || Static85.anInt1855 < Static117.anInt2509 - 5 || Static109.anInt2362 + 5 < Static126.anInt2633 || Static109.anInt2362 - 5 > Static126.anInt2633) {
				Static180.aBoolean242 = true;
			}
			Static93.anInt1974++;
			if (Static85.anInt1857 == 0) {
				if (Static180.aBoolean242 && Static93.anInt1974 >= 5) {
					if (Static153.aClass11_14 == Static104.aClass11_8 && Static144.anInt2891 != Static148.anInt3034) {
						local652 = Static153.aClass11_14;
						@Pc(654) byte local654 = 0;
						if (Static60.anInt1457 == 1 && local652.anInt315 == 206) {
							local654 = 1;
						}
						if (local652.anIntArray29[Static148.anInt3034] <= 0) {
							local654 = 0;
						}
						if (Static195.method3195(Static195.method3194(local652))) {
							local85 = Static148.anInt3034;
							local83 = Static144.anInt2891;
							local652.anIntArray29[local85] = local652.anIntArray29[local83];
							local652.anIntArray24[local85] = local652.anIntArray24[local83];
							local652.anIntArray29[local83] = -1;
							local652.anIntArray24[local83] = 0;
						} else if (local654 == 1) {
							local83 = Static144.anInt2891;
							local85 = Static148.anInt3034;
							while (local83 != local85) {
								if (local83 > local85) {
									local652.method206(local83, local83 - 1);
									local83--;
								} else if (local85 > local83) {
									local652.method206(local83, local83 + 1);
									local83++;
								}
							}
						} else {
							local652.method206(Static144.anInt2891, Static148.anInt3034);
						}
						Static38.aClass1_Sub14_Sub1_3.method3067(66);
						Static38.aClass1_Sub14_Sub1_3.method3011(Static144.anInt2891);
						Static38.aClass1_Sub14_Sub1_3.method3050(Static153.aClass11_14.anInt275);
						Static38.aClass1_Sub14_Sub1_3.method3020(Static148.anInt3034);
						Static38.aClass1_Sub14_Sub1_3.method3013(local654);
					}
				} else if ((Static141.anInt2817 == 1 || Static141.method2092(Static152.anInt3135 - 1)) && Static152.anInt3135 > 2) {
					Static18.method406();
				} else if (Static152.anInt3135 > 0) {
					Static64.method1030(Static152.anInt3135 - 1);
				}
				Static196.anInt4284 = 0;
				Static153.aClass11_14 = null;
				Static129.anInt2666 = 10;
			}
		}
		aBoolean80 = false;
		Static74.anInt1648 = 0;
		Static161.aClass11_16 = null;
		Static11.aBoolean21 = false;
		@Pc(824) Class11 local824 = Static138.aClass11_9;
		local652 = Static139.aClass11_10;
		Static138.aClass11_9 = null;
		Static139.aClass11_10 = null;
		while (Static90.method1342() && Static74.anInt1648 < 128) {
			Static165.anIntArray303[Static74.anInt1648] = Static190.anInt4139;
			Static166.anIntArray304[Static74.anInt1648] = Static18.anInt493;
			Static74.anInt1648++;
		}
		Static202.aClass11_20 = null;
		if (Static22.anInt555 != -1) {
			Static158.method2476(0, 0, Static63.anInt3568, 0, Static111.anInt2396, Static22.anInt555, 0);
		}
		Static25.anInt588++;
		while (true) {
			@Pc(878) Class1_Sub24 local878;
			@Pc(894) Class11 local894;
			@Pc(883) Class11 local883;
			do {
				local878 = (Class1_Sub24) Static26.aClass20_1.method475();
				if (local878 == null) {
					while (true) {
						do {
							local878 = (Class1_Sub24) Static143.aClass20_16.method475();
							if (local878 == null) {
								while (true) {
									do {
										local878 = (Class1_Sub24) Static173.aClass20_19.method475();
										if (local878 == null) {
											if (Static109.aBoolean137 && Static202.aClass11_20 == null) {
												Static109.aBoolean137 = false;
											}
											if (Static161.aClass11_15 != null) {
												Static82.method1265();
											}
											if (Static64.anInt1510 != -1) {
												local83 = Static64.anInt1510;
												local85 = Static74.anInt1650;
												@Pc(1044) boolean local1044 = Static55.method911(true, 0, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local85, local83);
												Static64.anInt1510 = -1;
												if (local1044) {
													Static96.anInt2010 = 1;
													Static50.anInt3129 = Static140.anInt2804;
													Static108.anInt2346 = 0;
													Static127.anInt2648 = Static57.anInt1370;
												}
											}
											Static5.method98();
											if (Static139.aClass11_10 != local652) {
												if (local652 != null) {
													Static73.method1118(local652);
												}
												if (Static139.aClass11_10 != null) {
													Static73.method1118(Static139.aClass11_10);
												}
											}
											if (Static138.aClass11_9 != local824 && Static33.anInt799 == Static173.anInt3688) {
												if (local824 != null) {
													Static73.method1118(local824);
												}
												if (Static138.aClass11_9 != null) {
													Static73.method1118(Static138.aClass11_9);
												}
											}
											if (Static138.aClass11_9 == null) {
												if (Static33.anInt799 > 0) {
													Static33.anInt799--;
												}
											} else if (Static33.anInt799 < Static173.anInt3688) {
												Static33.anInt799++;
												if (Static173.anInt3688 == Static33.anInt799) {
													Static73.method1118(Static138.aClass11_9);
												}
											}
											Static101.method1524();
											if (Static40.aBoolean199) {
												Static106.method1592();
											}
											for (local83 = 0; local83 < 5; local83++) {
												@Pc(1138) int local1138 = Static83.anIntArray155[local83]++;
											}
											local85 = Static196.method3214();
											local87 = Static159.method2501();
											if (local85 > 4500 && local87 > 4500) {
												Static25.anInt597 = 250;
												Static177.method2882(4000);
												Static38.aClass1_Sub14_Sub1_3.method3067(3);
											}
											Static28.anInt639++;
											if (Static28.anInt639 > 500) {
												Static28.anInt639 = 0;
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x4) == 4) {
													Static77.anInt1706 += Static52.anInt1298;
												}
												if ((local102 & 0x1) == 1) {
													Static114.anInt2464 += Static84.anInt1845;
												}
												if ((local102 & 0x2) == 2) {
													Static27.anInt618 += Static171.anInt3627;
												}
											}
											if (Static77.anInt1706 < -40) {
												Static52.anInt1298 = 1;
											}
											if (Static114.anInt2464 < -50) {
												Static84.anInt1845 = 2;
											}
											Static118.anInt2522++;
											if (Static77.anInt1706 > 40) {
												Static52.anInt1298 = -1;
											}
											Static203.anInt4423++;
											if (Static203.anInt4423 > 500) {
												Static203.anInt4423 = 0;
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x2) == 2) {
													Static183.anInt3930 += Static143.anInt2855;
												}
												if ((local102 & 0x1) == 1) {
													Static31.anInt742 += Static175.anInt3781;
												}
											}
											if (Static27.anInt618 < -55) {
												Static171.anInt3627 = 2;
											}
											if (Static31.anInt742 < -60) {
												Static175.anInt3781 = 2;
											}
											if (Static27.anInt618 > 55) {
												Static171.anInt3627 = -2;
											}
											if (Static31.anInt742 > 60) {
												Static175.anInt3781 = -2;
											}
											if (Static183.anInt3930 < -20) {
												Static143.anInt2855 = 1;
											}
											if (Static183.anInt3930 > 10) {
												Static143.anInt2855 = -1;
											}
											if (Static114.anInt2464 > 50) {
												Static84.anInt1845 = -2;
											}
											if (Static118.anInt2522 > 50) {
												Static38.aClass1_Sub14_Sub1_3.method3067(207);
											}
											try {
												if (Static27.aClass57_1 != null && Static38.aClass1_Sub14_Sub1_3.anInt4061 > 0) {
													Static27.aClass57_1.method1673(Static38.aClass1_Sub14_Sub1_3.aByteArray49, Static38.aClass1_Sub14_Sub1_3.anInt4061);
													Static118.anInt2522 = 0;
													Static38.aClass1_Sub14_Sub1_3.anInt4061 = 0;
													return;
												}
												return;
											} catch (@Pc(1350) IOException local1350) {
												Static150.method2273();
												return;
											}
										}
										local883 = local878.aClass11_18;
										if (local883.anInt272 < 0) {
											break;
										}
										local894 = Static9.method2342(local883.anInt256);
									} while (local894 == null || local894.aClass11Array1 == null || local883.anInt272 >= local894.aClass11Array1.length || local894.aClass11Array1[local883.anInt272] != local883);
									Static45.method810(local878);
								}
							}
							local883 = local878.aClass11_18;
							if (local883.anInt272 < 0) {
								break;
							}
							local894 = Static9.method2342(local883.anInt256);
						} while (local894 == null || local894.aClass11Array1 == null || local894.aClass11Array1.length <= local883.anInt272 || local883 != local894.aClass11Array1[local883.anInt272]);
						Static45.method810(local878);
					}
				}
				local883 = local878.aClass11_18;
				if (local883.anInt272 < 0) {
					break;
				}
				local894 = Static9.method2342(local883.anInt256);
			} while (local894 == null || local894.aClass11Array1 == null || local894.aClass11Array1.length <= local883.anInt272 || local894.aClass11Array1[local883.anInt272] != local883);
			Static45.method810(local878);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIII[Lclient!ba;II)V")
	public static void method907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg5.length; local12++) {
			@Pc(18) Class11 local18 = arg5[local12];
			if (local18 != null && (!local18.aBoolean28 || local18.anInt326 == 0 || local18.aBoolean18 || Static195.method3194(local18) != 0 || Static50.aClass11_13 == local18 || local18.anInt315 == 1338) && local18.anInt256 == arg2 && (!local18.aBoolean28 || !Static141.method2093(local18))) {
				@Pc(66) int local66 = local18.anInt291 + arg6;
				@Pc(71) int local71 = arg3 + local18.anInt255;
				if (local18 == Static161.aClass11_15) {
					Static148.anInt3029 = local71;
					Static98.anInt2076 = local66;
					Static11.aBoolean21 = true;
				}
				@Pc(116) int local116;
				@Pc(100) int local100;
				@Pc(129) int local129;
				@Pc(136) int local136;
				if (local18.anInt326 == 2) {
					local136 = arg7;
					local116 = arg1;
					local100 = arg0;
					local129 = arg4;
				} else {
					@Pc(89) int local89 = local18.anInt312 + local71;
					local100 = arg0 < local66 ? local66 : arg0;
					@Pc(105) int local105 = local66 + local18.anInt263;
					local116 = local71 > arg1 ? local71 : arg1;
					if (local18.anInt326 == 9) {
						local89++;
						local105++;
					}
					local129 = local89 >= arg4 ? arg4 : local89;
					local136 = local105 < arg7 ? local105 : arg7;
				}
				if (!local18.aBoolean28 || local129 > local116 && local100 < local136) {
					if (local18.anInt315 == 1337) {
						Static73.method1118(local18);
					} else {
						if (local18.anInt315 == 1400) {
							Static202.aClass11_20 = local18;
						}
						if (local18.anInt326 == 0) {
							if (local18.anInt315 == 1400) {
								Static154.aBoolean182 = false;
							}
							if (!local18.aBoolean28 && Static141.method2093(local18) && local18 != Static139.aClass11_10) {
								continue;
							}
							method907(local100, local116, local18.anInt275, local71 - local18.anInt299, local129, arg5, local66 - local18.anInt297, local136);
							if (local18.aClass11Array1 != null) {
								method907(local100, local116, local18.anInt275, local71 - local18.anInt299, local129, local18.aClass11Array1, local66 - local18.anInt297, local136);
							}
							@Pc(251) Class1_Sub4 local251 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local18.anInt275);
							if (local251 != null) {
								Static158.method2476(local116, local71, local129, local66, local136, local251.anInt490, local100);
							}
							if (local18.anInt315 == 1400 && Static154.aBoolean182) {
								return;
							}
						}
						if (local18.aBoolean28) {
							@Pc(287) boolean local287;
							if (local116 <= Static85.anInt1855 && Static126.anInt2633 >= local100 && Static85.anInt1855 < local129 && local136 > Static126.anInt2633) {
								local287 = true;
							} else {
								local287 = false;
							}
							if (local287) {
								Static154.aBoolean182 = true;
							}
							@Pc(297) boolean local297 = false;
							if (Static196.anInt4284 == 1 && local116 <= Static57.anInt1370 && local100 <= Static140.anInt2804 && local129 > Static57.anInt1370 && local136 > Static140.anInt2804) {
								local297 = true;
							}
							@Pc(330) boolean local330 = false;
							if (Static85.anInt1857 == 1 && local287) {
								local330 = true;
							}
							if (local18.anInt315 == 1338) {
								if (local297) {
									Static186.method3066(local18, Static140.anInt2804 - local66, Static57.anInt1370 - local71);
								}
								continue;
							}
							@Pc(415) int local415;
							@Pc(392) int local392;
							if (local18.anInt315 == 1400) {
								if (local297) {
									if (Static5.aBooleanArray2[82] && Static4.anInt101 > 0) {
										local392 = Static155.anInt2984 + Static150.anInt3065 + (int) ((double) (-(local18.anInt312 / 2) + -local71 + Static57.anInt1370) * 2.0D / Static203.aDouble11);
										local415 = Static52.anInt1305 + Static35.anInt988 - (int) ((double) (Static140.anInt2804 - local66 - local18.anInt263 / 2) * 2.0D / Static203.aDouble11) - Static111.anInt2402;
										@Pc(468) Class92 local468 = Static208.method787(new Class92[] { Static146.aClass92_1419, Static49.method872(local392 >> 6), Static210.aClass92_2066, Static49.method872(local415 >> 6), Static210.aClass92_2066, Static49.method872(local392 & 0x3F), Static210.aClass92_2066, Static49.method872(local415 & 0x3F) });
										local468.method3211();
										Static36.method679(local468);
										Static83.method1270();
									} else {
										Static119.anInt2552 = Static85.anInt1855;
										Static109.aBoolean137 = true;
										Static165.anInt3438 = Static126.anInt2633;
										Static57.anInt1369 = Static111.anInt2402;
										Static22.anInt553 = Static155.anInt2984;
									}
									continue;
								}
								if (local330 && Static109.aBoolean137) {
									Static111.method1666(Static22.anInt553 + (int) ((double) (Static119.anInt2552 - Static85.anInt1855) * 2.0D / Static94.aDouble10));
									Static70.method1087(Static57.anInt1369 + (int) ((double) (Static165.anInt3438 - Static126.anInt2633) * 2.0D / Static94.aDouble10));
									continue;
								}
								Static109.aBoolean137 = false;
							}
							if (local18.anInt315 == 1401 && local330) {
								Static200.method3296(Static126.anInt2633 - local66, -local71 + Static85.anInt1855, local18.anInt312, local18.anInt263);
							}
							if (local297) {
								Static159.method2502(local18, Static140.anInt2804 - local66, -local71 + Static57.anInt1370);
							}
							if (Static161.aClass11_15 != null && Static161.aClass11_15 != local18 && local287 && Static66.method1034(Static195.method3194(local18))) {
								Static161.aClass11_16 = local18;
							}
							if (Static50.aClass11_13 == local18) {
								Static59.anInt1434 = local71;
								aBoolean80 = true;
								Static36.anInt1018 = local66;
							}
							if (local18.aBoolean18) {
								@Pc(597) Class1_Sub24 local597;
								if (local287 && Static199.anInt4342 != 0 && local18.anObjectArray11 != null) {
									local597 = new Class1_Sub24();
									local597.aClass11_18 = local18;
									local597.anInt3510 = Static199.anInt4342;
									local597.anObjectArray28 = local18.anObjectArray11;
									Static173.aClass20_19.method466(local597);
								}
								if (Static161.aClass11_15 != null || Static153.aClass11_14 != null || Static35.aBoolean61 || Static109.aBoolean137) {
									local330 = false;
									local297 = false;
									local287 = false;
								}
								if (!local18.aBoolean23 && local297) {
									local18.aBoolean23 = true;
									if (local18.anObjectArray7 != null) {
										local597 = new Class1_Sub24();
										local597.aClass11_18 = local18;
										local597.anInt3510 = Static140.anInt2804 - local66;
										local597.anInt3517 = Static57.anInt1370 - local71;
										local597.anObjectArray28 = local18.anObjectArray7;
										Static173.aClass20_19.method466(local597);
									}
								}
								if (local18.aBoolean23 && local330 && local18.anObjectArray19 != null) {
									local597 = new Class1_Sub24();
									local597.anInt3517 = Static85.anInt1855 - local71;
									local597.anInt3510 = Static126.anInt2633 - local66;
									local597.aClass11_18 = local18;
									local597.anObjectArray28 = local18.anObjectArray19;
									Static173.aClass20_19.method466(local597);
								}
								if (local18.aBoolean23 && !local330) {
									local18.aBoolean23 = false;
									if (local18.anObjectArray21 != null) {
										local597 = new Class1_Sub24();
										local597.anInt3510 = Static126.anInt2633 - local66;
										local597.aClass11_18 = local18;
										local597.anInt3517 = Static85.anInt1855 - local71;
										local597.anObjectArray28 = local18.anObjectArray21;
										Static143.aClass20_16.method466(local597);
									}
								}
								if (local330 && local18.anObjectArray5 != null) {
									local597 = new Class1_Sub24();
									local597.anInt3510 = Static126.anInt2633 - local66;
									local597.aClass11_18 = local18;
									local597.anInt3517 = Static85.anInt1855 - local71;
									local597.anObjectArray28 = local18.anObjectArray5;
									Static173.aClass20_19.method466(local597);
								}
								if (!local18.aBoolean20 && local287) {
									local18.aBoolean20 = true;
									if (local18.anObjectArray12 != null) {
										local597 = new Class1_Sub24();
										local597.anInt3517 = Static85.anInt1855 - local71;
										local597.anInt3510 = Static126.anInt2633 - local66;
										local597.aClass11_18 = local18;
										local597.anObjectArray28 = local18.anObjectArray12;
										Static173.aClass20_19.method466(local597);
									}
								}
								if (local18.aBoolean20 && local287 && local18.anObjectArray17 != null) {
									local597 = new Class1_Sub24();
									local597.anInt3510 = Static126.anInt2633 - local66;
									local597.anObjectArray28 = local18.anObjectArray17;
									local597.anInt3517 = Static85.anInt1855 - local71;
									local597.aClass11_18 = local18;
									Static173.aClass20_19.method466(local597);
								}
								if (local18.aBoolean20 && !local287) {
									local18.aBoolean20 = false;
									if (local18.anObjectArray10 != null) {
										local597 = new Class1_Sub24();
										local597.anInt3517 = Static85.anInt1855 - local71;
										local597.anInt3510 = Static126.anInt2633 - local66;
										local597.anObjectArray28 = local18.anObjectArray10;
										local597.aClass11_18 = local18;
										Static143.aClass20_16.method466(local597);
									}
								}
								if (local18.anObjectArray3 != null) {
									local597 = new Class1_Sub24();
									local597.anObjectArray28 = local18.anObjectArray3;
									local597.aClass11_18 = local18;
									Static26.aClass20_1.method466(local597);
								}
								@Pc(952) int local952;
								@Pc(968) Class1_Sub24 local968;
								if (local18.anObjectArray14 != null && local18.anInt266 < Static162.anInt3397) {
									if (local18.anIntArray25 == null || Static162.anInt3397 - local18.anInt266 > 32) {
										local597 = new Class1_Sub24();
										local597.aClass11_18 = local18;
										local597.anObjectArray28 = local18.anObjectArray14;
										Static173.aClass20_19.method466(local597);
									} else {
										label399: for (local392 = local18.anInt266; local392 < Static162.anInt3397; local392++) {
											local415 = Static101.anIntArray166[local392 & 0x1F];
											for (local952 = 0; local952 < local18.anIntArray25.length; local952++) {
												if (local18.anIntArray25[local952] == local415) {
													local968 = new Class1_Sub24();
													local968.anObjectArray28 = local18.anObjectArray14;
													local968.aClass11_18 = local18;
													Static173.aClass20_19.method466(local968);
													break label399;
												}
											}
										}
									}
									local18.anInt266 = Static162.anInt3397;
								}
								if (local18.anObjectArray22 != null && Static203.anInt4430 > local18.anInt301) {
									if (local18.anIntArray26 == null || Static203.anInt4430 - local18.anInt301 > 32) {
										local597 = new Class1_Sub24();
										local597.anObjectArray28 = local18.anObjectArray22;
										local597.aClass11_18 = local18;
										Static173.aClass20_19.method466(local597);
									} else {
										label375: for (local392 = local18.anInt301; local392 < Static203.anInt4430; local392++) {
											local415 = Static117.anIntArray188[local392 & 0x1F];
											for (local952 = 0; local952 < local18.anIntArray26.length; local952++) {
												if (local415 == local18.anIntArray26[local952]) {
													local968 = new Class1_Sub24();
													local968.anObjectArray28 = local18.anObjectArray22;
													local968.aClass11_18 = local18;
													Static173.aClass20_19.method466(local968);
													break label375;
												}
											}
										}
									}
									local18.anInt301 = Static203.anInt4430;
								}
								if (local18.anObjectArray16 != null && local18.anInt293 < Static110.anInt2387) {
									if (local18.anIntArray34 == null || Static110.anInt2387 - local18.anInt293 > 32) {
										local597 = new Class1_Sub24();
										local597.aClass11_18 = local18;
										local597.anObjectArray28 = local18.anObjectArray16;
										Static173.aClass20_19.method466(local597);
									} else {
										label351: for (local392 = local18.anInt293; local392 < Static110.anInt2387; local392++) {
											local415 = Static35.anIntArray75[local392 & 0x1F];
											for (local952 = 0; local952 < local18.anIntArray34.length; local952++) {
												if (local18.anIntArray34[local952] == local415) {
													local968 = new Class1_Sub24();
													local968.aClass11_18 = local18;
													local968.anObjectArray28 = local18.anObjectArray16;
													Static173.aClass20_19.method466(local968);
													break label351;
												}
											}
										}
									}
									local18.anInt293 = Static110.anInt2387;
								}
								if (Static62.anInt1475 > local18.anInt264 && local18.anObjectArray24 != null) {
									local597 = new Class1_Sub24();
									local597.aClass11_18 = local18;
									local597.anObjectArray28 = local18.anObjectArray24;
									Static173.aClass20_19.method466(local597);
								}
								if (local18.anInt264 < Static61.anInt1468 && local18.anObjectArray18 != null) {
									local597 = new Class1_Sub24();
									local597.anObjectArray28 = local18.anObjectArray18;
									local597.aClass11_18 = local18;
									Static173.aClass20_19.method466(local597);
								}
								if (Static43.anInt1138 > local18.anInt264 && local18.anObjectArray20 != null) {
									local597 = new Class1_Sub24();
									local597.anObjectArray28 = local18.anObjectArray20;
									local597.aClass11_18 = local18;
									Static173.aClass20_19.method466(local597);
								}
								if (Static72.anInt1623 > local18.anInt264 && local18.anObjectArray6 != null) {
									local597 = new Class1_Sub24();
									local597.aClass11_18 = local18;
									local597.anObjectArray28 = local18.anObjectArray6;
									Static173.aClass20_19.method466(local597);
								}
								if (local18.anInt264 < Static45.anInt1168 && local18.anObjectArray9 != null) {
									local597 = new Class1_Sub24();
									local597.anObjectArray28 = local18.anObjectArray9;
									local597.aClass11_18 = local18;
									Static173.aClass20_19.method466(local597);
								}
								local18.anInt264 = Static25.anInt588;
								if (local18.anObjectArray8 != null) {
									for (local392 = 0; local392 < Static74.anInt1648; local392++) {
										@Pc(1326) Class1_Sub24 local1326 = new Class1_Sub24();
										local1326.aClass11_18 = local18;
										local1326.anInt3513 = Static165.anIntArray303[local392];
										local1326.anInt3515 = Static166.anIntArray304[local392];
										local1326.anObjectArray28 = local18.anObjectArray8;
										Static173.aClass20_19.method466(local1326);
									}
								}
							}
						}
						if (!local18.aBoolean28) {
							if (Static161.aClass11_15 != null || Static153.aClass11_14 != null || Static35.aBoolean61) {
								return;
							}
							if ((local18.anInt316 >= 0 || local18.anInt325 != 0) && local116 <= Static85.anInt1855 && local100 <= Static126.anInt2633 && local129 > Static85.anInt1855 && local136 > Static126.anInt2633) {
								if (local18.anInt316 < 0) {
									Static139.aClass11_10 = local18;
								} else {
									Static139.aClass11_10 = arg5[local18.anInt316];
								}
							}
							if (local18.anInt326 == 8 && local116 <= Static85.anInt1855 && local100 <= Static126.anInt2633 && Static85.anInt1855 < local129 && local136 > Static126.anInt2633) {
								Static138.aClass11_9 = local18;
							}
							if (local18.anInt318 > local18.anInt263) {
								Static7.method133(local18.anInt318, local71 + local18.anInt312, local18.anInt263, Static85.anInt1855, local18, local66, Static126.anInt2633);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method908(@OriginalArg(0) int arg0) {
		Static50.anInt3133 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static115.anInt2477; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static160.anInt3334; local6++) {
				if (Static179.aClass1_Sub17ArrayArrayArray1[arg0][local3][local6] == null) {
					Static179.aClass1_Sub17ArrayArrayArray1[arg0][local3][local6] = new Class1_Sub17(arg0, local3, local6);
				}
			}
		}
	}
}
