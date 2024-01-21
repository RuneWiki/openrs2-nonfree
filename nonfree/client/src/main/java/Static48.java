import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub15[] aClass3_Sub1_Sub15Array1;

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_12;

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
	public static int anInt1296;

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
	public static int anInt1302;

	@OriginalMember(owner = "client!id", name = "db", descriptor = "I")
	public static int anInt1294 = 0;

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Lclient!na;")
	private static Class53 aClass53_599 = Static109.method1737("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "Lclient!na;")
	public static Class53 aClass53_598 = aClass53_599;

	@OriginalMember(owner = "client!id", name = "nb", descriptor = "Lclient!na;")
	public static Class53 aClass53_600 = Static109.method1737("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "I")
	public static int anInt1301 = 0;

	@OriginalMember(owner = "client!id", name = "qb", descriptor = "Lclient!na;")
	public static Class53 aClass53_601 = Static109.method1737("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBIIIII[Lclient!vb;III)V")
	public static void method923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub1_Sub15[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg6 < arg3 || arg8 < arg5 || arg2 <= arg6 || arg4 <= arg8) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < arg7.length; local28++) {
			@Pc(34) Class3_Sub1_Sub15 local34 = arg7[local28];
			if (local34 != null && arg1 == local34.anInt2704 && (!local34.aBoolean112 || !Static75.method1250(local34))) {
				@Pc(61) int local61 = local34.anInt2708 + arg5 - arg0;
				@Pc(69) int local69 = arg3 + local34.anInt2677 - arg10;
				if (local34.anInt2707 == 8 && local69 <= arg6 && local61 <= arg8 && arg6 < local34.anInt2727 + local69 && local61 + local34.anInt2703 > arg8) {
					Static96.anInt1471 = local28;
				}
				if ((local34.anInt2683 >= 0 || local34.anInt2722 != 0) && local69 <= arg6 && arg8 >= local61 && local34.anInt2727 + local69 > arg6 && arg8 < local61 + local34.anInt2703) {
					if (local34.anInt2683 >= 0) {
						Static125.anInt2891 = local34.anInt2683;
					} else {
						Static125.anInt2891 = local28;
					}
				}
				if (local34.anInt2707 == 0) {
					if (!local34.aBoolean112 && Static75.method1250(local34) && !Static31.method696(local28, arg9)) {
						continue;
					}
					method923(local34.anInt2724, local34.anInt2686, local34.anInt2727 + local69, local69, local34.anInt2703 + local61, local61, arg6, arg7, arg8, arg9, local34.anInt2691);
					if (local34.aClass3_Sub1_Sub15Array2 != null) {
						method923(local34.anInt2724, local34.anInt2686, local69 + local34.anInt2727, local69, local34.anInt2703 + local61, local61, arg6, local34.aClass3_Sub1_Sub15Array2, arg8, arg9, local34.anInt2691);
					}
					if (local34.anInt2669 > local34.anInt2703 && !local34.aBoolean112) {
						Static76.method1279(local34.anInt2669, arg9, local61, local34.anInt2727 + local69, arg6, local34, local34.anInt2703, arg8);
					}
					if (!local34.aBoolean112) {
						continue;
					}
				}
				if (local34.anInt2682 == 1 && arg6 >= local69 && local61 <= arg8 && arg6 < local34.anInt2727 + local69 && local34.anInt2703 + local61 > arg8) {
					@Pc(265) boolean local265 = false;
					if (local34.anInt2712 != 0) {
						local265 = Static31.method694(local34);
					}
					if (!local265) {
						Static59.method1075(3, local34.aClass53_1352, Static35.aClass53_476, 0, 0, local34.anInt2686);
					}
				}
				if (local34.anInt2682 == 2 && !Static117.aBoolean119 && arg6 >= local69 && local61 <= arg8 && arg6 < local69 + local34.anInt2727 && arg8 < local34.anInt2703 + local61) {
					@Pc(332) Class53 local332 = Static20.method381(local34);
					if (local332 != null) {
						Static59.method1075(6, local332, Static103.method1689(new Class53[] { Static105.aClass53_1211, local34.aClass53_1351 }), 0, -1, local34.anInt2686);
					}
				}
				if (local34.anInt2682 == 3 && local69 <= arg6 && arg8 >= local61 && arg6 < local34.anInt2727 + local69 && local61 + local34.anInt2703 > arg8) {
					@Pc(400) byte local400;
					if (arg9 == 3) {
						local400 = 29;
					} else {
						local400 = 32;
					}
					Static59.method1075(local400, Static113.aClass53_1297, Static35.aClass53_476, 0, 0, local34.anInt2686);
				}
				if (local34.anInt2682 == 4 && arg6 >= local69 && arg8 >= local61 && arg6 < local69 + local34.anInt2727 && arg8 < local61 + local34.anInt2703) {
					Static59.method1075(23, local34.aClass53_1352, Static35.aClass53_476, 0, 0, local34.anInt2686);
				}
				if (local34.anInt2682 == 5 && local69 <= arg6 && local61 <= arg8 && local34.anInt2727 + local69 > arg6 && arg8 < local61 + local34.anInt2703) {
					Static59.method1075(17, local34.aClass53_1352, Static35.aClass53_476, 0, 0, local34.anInt2686);
				}
				if (local34.anInt2682 == 6 && Static41.anInt1206 == -1 && arg6 >= local69 && arg8 >= local61 && local34.anInt2727 + local69 > arg6 && arg8 < local61 + local34.anInt2703) {
					Static59.method1075(39, local34.aClass53_1352, Static35.aClass53_476, 0, -1, local34.anInt2686);
				}
				@Pc(568) int local568;
				@Pc(562) int local562;
				if (local34.anInt2707 == 2) {
					local562 = 0;
					for (@Pc(564) int local564 = 0; local564 < local34.anInt2703; local564++) {
						for (local568 = 0; local568 < local34.anInt2727; local568++) {
							@Pc(579) int local579 = local568 * (local34.anInt2680 + 32) + local69;
							@Pc(589) int local589 = (local34.anInt2671 + 32) * local564 + local61;
							if (local562 < 20) {
								local579 += local34.anIntArray382[local562];
								local589 += local34.anIntArray384[local562];
							}
							if (local579 <= arg6 && local589 <= arg8 && local579 + 32 > arg6 && arg8 < local589 + 32) {
								Static44.anInt1239 = local562;
								Static85.anInt2070 = local34.anInt2686;
								if (local34.anIntArray383[local562] > 0) {
									@Pc(655) Class3_Sub1_Sub8 local655 = Static2.method38(local34.anIntArray383[local562] - 1);
									if (Static91.anInt2201 == 1 && Static111.method1789(Static50.method1914(local34))) {
										if (local34.anInt2686 != Static77.anInt1950 || local562 != Static80.anInt2027) {
											Static59.method1075(43, Static94.aClass53_1084, Static103.method1689(new Class53[] { Static5.aClass53_81, Static111.aClass53_1292, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
										}
									} else if (!Static117.aBoolean119 || !Static111.method1789(Static50.method1914(local34))) {
										@Pc(726) Class53[] local726 = local655.aClass53Array13;
										if (Static120.aBoolean126) {
											local726 = Static53.method1447(local726);
										}
										@Pc(740) int local740;
										@Pc(757) byte local757;
										if (Static111.method1789(Static50.method1914(local34))) {
											for (local740 = 4; local740 >= 3; local740--) {
												if (local726 != null && local726[local740] != null) {
													if (local740 == 3) {
														local757 = 12;
													} else {
														local757 = 22;
													}
													Static59.method1075(local757, local726[local740], Static103.method1689(new Class53[] { Static8.aClass53_93, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
												} else if (local740 == 4) {
													Static59.method1075(22, Static16.aClass53_146, Static103.method1689(new Class53[] { Static8.aClass53_93, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
												}
											}
										}
										if (Static123.method1960(Static50.method1914(local34))) {
											Static59.method1075(15, Static94.aClass53_1084, Static103.method1689(new Class53[] { Static8.aClass53_93, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
										}
										if (Static111.method1789(Static50.method1914(local34)) && local726 != null) {
											for (local740 = 2; local740 >= 0; local740--) {
												if (local726[local740] != null) {
													local757 = 0;
													if (local740 == 0) {
														local757 = 10;
													}
													if (local740 == 1) {
														local757 = 36;
													}
													if (local740 == 2) {
														local757 = 48;
													}
													Static59.method1075(local757, local726[local740], Static103.method1689(new Class53[] { Static8.aClass53_93, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
												}
											}
										}
										local726 = local34.aClass53Array19;
										if (Static120.aBoolean126) {
											local726 = Static53.method1447(local726);
										}
										if (local726 != null) {
											for (local740 = 4; local740 >= 0; local740--) {
												if (local726[local740] != null) {
													local757 = 0;
													if (local740 == 0) {
														local757 = 42;
													}
													if (local740 == 1) {
														local757 = 38;
													}
													if (local740 == 2) {
														local757 = 19;
													}
													if (local740 == 3) {
														local757 = 4;
													}
													if (local740 == 4) {
														local757 = 13;
													}
													Static59.method1075(local757, local726[local740], Static103.method1689(new Class53[] { Static8.aClass53_93, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
												}
											}
										}
										Static59.method1075(1001, Static115.aClass53_1316, Static103.method1689(new Class53[] { Static8.aClass53_93, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
									} else if ((Static104.anInt2535 & 0x10) == 16) {
										Static59.method1075(45, Static57.aClass53_672, Static103.method1689(new Class53[] { Static102.aClass53_1162, Static111.aClass53_1292, local655.aClass53_706 }), local655.anInt1594, local562, local34.anInt2686);
									}
								}
							}
							local562++;
						}
					}
				}
				if (local34.aBoolean112) {
					if (Static117.aBoolean119) {
						if (Static56.method1040(Static50.method1914(local34)) && (Static104.anInt2535 & 0x20) == 32 && arg6 >= local69 && arg8 >= local61 && arg6 < local69 + local34.anInt2727 && local34.anInt2703 + local61 > arg8) {
							Static59.method1075(24, Static57.aClass53_672, Static103.method1689(new Class53[] { Static102.aClass53_1162, Static40.aClass53_514, local34.aClass53_1353 }), 0, local34.anInt2693, local34.anInt2686);
						}
					} else if (arg6 >= local69 && local61 <= arg8 && arg6 < local69 + local34.anInt2727 && arg8 < local61 + local34.anInt2703) {
						@Pc(1126) Class53 local1126;
						for (local562 = 9; local562 >= 5; local562--) {
							local1126 = Static4.method76(local562, local34);
							if (local1126 != null) {
								Static59.method1075(25, local1126, local34.aClass53_1353, local562 + 1, local34.anInt2693, local34.anInt2686);
							}
						}
						local1126 = Static20.method381(local34);
						if (local1126 != null) {
							Static59.method1075(6, local1126, local34.aClass53_1353, 0, local34.anInt2693, local34.anInt2686);
						}
						for (local568 = 4; local568 >= 0; local568--) {
							@Pc(1181) Class53 local1181 = Static4.method76(local568, local34);
							if (local1181 != null) {
								Static59.method1075(25, local1181, local34.aClass53_1353, local568 + 1, local34.anInt2693, local34.anInt2686);
							}
						}
						if (Static82.method637(Static50.method1914(local34))) {
							Static59.method1075(39, local34.aClass53_1352, Static35.aClass53_476, 0, -1, local34.anInt2686);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
	public static void method924() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(63) Class3_Sub1_Sub4_Sub4 local63;
		if (Static51.anInt1329 == 128) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method604();
			local20 = (local12 >> 4 & 0x7) + Static99.anInt2345;
			local26 = Static111.anInt2565 + (local12 & 0x7);
			local30 = Static62.aClass3_Sub7_Sub1_2.method611();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(56) Class11 local56 = Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local20][local26];
				if (local56 != null) {
					for (local63 = (Class3_Sub1_Sub4_Sub4) local56.method189(); local63 != null; local63 = (Class3_Sub1_Sub4_Sub4) local56.method187()) {
						if ((local30 & 0x7FFF) == local63.anInt1298) {
							local63.method1962();
							break;
						}
					}
					if (local56.method189() == null) {
						Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local20][local26] = null;
					}
					Static59.method1069(local20, local26);
				}
			}
			return;
		}
		@Pc(133) int local133;
		@Pc(143) int local143;
		@Pc(137) int local137;
		@Pc(147) int local147;
		@Pc(167) int local167;
		if (Static51.anInt1329 == 186) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method647();
			local20 = (local12 >> 4 & 0x7) + Static99.anInt2345;
			local26 = (local12 & 0x7) + Static111.anInt2565;
			local30 = Static62.aClass3_Sub7_Sub1_2.method602();
			local133 = Static62.aClass3_Sub7_Sub1_2.method647();
			local137 = local133 & 0x7;
			local143 = local133 >> 4 & 0xF;
			local147 = Static62.aClass3_Sub7_Sub1_2.method647();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local167 = local143 + 1;
				if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0] >= local20 - local167 && Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0] <= local20 + local167 && local26 - local167 <= Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0] && local167 + local26 >= Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0] && Static56.anInt1508 != 0 && local137 > 0 && Static40.anInt1185 < 50) {
					Static5.anIntArray17[Static40.anInt1185] = local30;
					Static120.anIntArray404[Static40.anInt1185] = local137;
					Static69.anIntArray225[Static40.anInt1185] = local147;
					Static51.aClass72Array1[Static40.anInt1185] = null;
					Static98.anIntArray314[Static40.anInt1185] = local143 + (local20 << 16) + (local26 << 8);
					Static40.anInt1185++;
				}
			}
		}
		@Pc(306) int local306;
		@Pc(320) int local320;
		@Pc(312) int local312;
		@Pc(324) int local324;
		if (Static51.anInt1329 == 195) {
			@Pc(266) byte local266 = Static62.aClass3_Sub7_Sub1_2.method624();
			@Pc(272) byte local272 = Static62.aClass3_Sub7_Sub1_2.method630();
			@Pc(276) byte local276 = Static62.aClass3_Sub7_Sub1_2.method631();
			local30 = Static62.aClass3_Sub7_Sub1_2.method612();
			local143 = local30 & 0x3;
			local133 = local30 >> 2;
			local137 = Static69.anIntArray226[local133];
			local147 = Static62.aClass3_Sub7_Sub1_2.method611();
			local167 = Static62.aClass3_Sub7_Sub1_2.method617();
			local306 = Static62.aClass3_Sub7_Sub1_2.method652();
			local312 = (local306 & 0x7) + Static111.anInt2565;
			local320 = (local306 >> 4 & 0x7) + Static99.anInt2345;
			local324 = Static62.aClass3_Sub7_Sub1_2.method617();
			@Pc(328) byte local328 = Static62.aClass3_Sub7_Sub1_2.method599();
			@Pc(332) int local332 = Static62.aClass3_Sub7_Sub1_2.method611();
			@Pc(339) Class3_Sub1_Sub4_Sub1_Sub2 local339;
			if (local167 == Static78.anInt1959) {
				local339 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1;
			} else {
				local339 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local167];
			}
			if (local339 != null) {
				@Pc(349) Class3_Sub1_Sub2 local349 = Static12.method200(local147);
				@Pc(357) int local357 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local320][local312];
				@Pc(367) int local367 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local320 + 1][local312];
				@Pc(379) int local379 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local320 + 1][local312 + 1];
				@Pc(389) int local389 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local320][local312 + 1];
				@Pc(399) Class3_Sub1_Sub4_Sub7 local399 = local349.method169(local357, local143, local379, local389, local133, local367);
				if (local399 != null) {
					Static38.method781(local320, local312, local332 + 1, Static72.anInt1813, 0, local137, local324 + 1, -1, 0);
					local339.anInt1492 = Static27.anInt843 + local324;
					local339.anInt1491 = Static27.anInt843 + local332;
					local339.aClass3_Sub1_Sub4_Sub7_1 = local399;
					@Pc(432) int local432 = local349.anInt282;
					@Pc(435) int local435 = local349.anInt270;
					@Pc(444) byte local444;
					if (local276 > local272) {
						local444 = local276;
						local276 = local272;
						local272 = local444;
					}
					if (local266 > local328) {
						local444 = local266;
						local266 = local328;
						local328 = local444;
					}
					if (local143 == 1 || local143 == 3) {
						local432 = local349.anInt270;
						local435 = local349.anInt282;
					}
					local339.anInt1487 = local435 * 64 + local320 * 128;
					local339.anInt1507 = local312 * 128 + local432 * 64;
					local339.anInt1501 = Static77.method1355(local339.anInt1507, Static72.anInt1813, local339.anInt1487);
					local339.anInt1499 = local312 + local266;
					local339.anInt1500 = local320 + local276;
					local339.anInt1496 = local320 + local272;
					local339.anInt1495 = local328 + local312;
				}
			}
		}
		if (Static51.anInt1329 == 241) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method647();
			local20 = (local12 >> 4 & 0x7) + Static99.anInt2345;
			local26 = (local12 & 0x7) + Static111.anInt2565;
			local30 = Static62.aClass3_Sub7_Sub1_2.method602();
			local133 = Static62.aClass3_Sub7_Sub1_2.method647();
			local143 = Static62.aClass3_Sub7_Sub1_2.method602();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local26 = local26 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(608) Class3_Sub1_Sub4_Sub6 local608 = new Class3_Sub1_Sub4_Sub6(local30, Static72.anInt1813, local20, local26, Static77.method1355(local26, Static72.anInt1813, local20) - local133, local143, Static27.anInt843);
				Static105.aClass11_12.method190(local608);
			}
		} else if (Static51.anInt1329 == 167) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method647();
			local20 = Static99.anInt2345 + (local12 >> 4 & 0x7);
			local26 = Static111.anInt2565 + (local12 & 0x7);
			local30 = Static62.aClass3_Sub7_Sub1_2.method617();
			local133 = Static62.aClass3_Sub7_Sub1_2.method604();
			local143 = local133 >> 2;
			local147 = Static69.anIntArray226[local143];
			local137 = local133 & 0x3;
			if (local20 >= 0 && local26 >= 0 && local20 < 103 && local26 < 103) {
				local167 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local20][local26];
				local320 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local20 + 1][local26 + 1];
				local306 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local20 + 1][local26];
				local312 = Static107.anIntArrayArrayArray7[Static72.anInt1813][local20][local26 + 1];
				if (local147 == 0) {
					@Pc(724) Class71 local724 = Static120.aClass39_1.method1009(Static72.anInt1813, local20, local26);
					if (local724 != null) {
						@Pc(733) int local733 = local724.anInt2426 >> 14 & 0x7FFF;
						if (local143 == 2) {
							local724.aClass3_Sub1_Sub4_8 = new Class3_Sub1_Sub4_Sub3(local733, 2, local137 + 4, local167, local306, local320, local312, local30, false, local724.aClass3_Sub1_Sub4_8);
							local724.aClass3_Sub1_Sub4_7 = new Class3_Sub1_Sub4_Sub3(local733, 2, local137 + 1 & 0x3, local167, local306, local320, local312, local30, false, local724.aClass3_Sub1_Sub4_7);
						} else {
							local724.aClass3_Sub1_Sub4_8 = new Class3_Sub1_Sub4_Sub3(local733, local143, local137, local167, local306, local320, local312, local30, false, local724.aClass3_Sub1_Sub4_8);
						}
					}
				}
				if (local147 == 1) {
					@Pc(806) Class46 local806 = Static120.aClass39_1.method989(Static72.anInt1813, local20, local26);
					if (local806 != null) {
						local806.aClass3_Sub1_Sub4_6 = new Class3_Sub1_Sub4_Sub3(local806.anInt1683 >> 14 & 0x7FFF, 4, 0, local167, local306, local320, local312, local30, false, local806.aClass3_Sub1_Sub4_6);
					}
				}
				if (local147 == 2) {
					@Pc(840) Class8 local840 = Static120.aClass39_1.method994(Static72.anInt1813, local20, local26);
					if (local143 == 11) {
						local143 = 10;
					}
					if (local840 != null) {
						local840.aClass3_Sub1_Sub4_4 = new Class3_Sub1_Sub4_Sub3(local840.anInt213 >> 14 & 0x7FFF, local143, local137, local167, local306, local320, local312, local30, false, local840.aClass3_Sub1_Sub4_4);
					}
				}
				if (local147 == 3) {
					@Pc(881) Class31 local881 = Static120.aClass39_1.method996(Static72.anInt1813, local20, local26);
					if (local881 != null) {
						local881.aClass3_Sub1_Sub4_5 = new Class3_Sub1_Sub4_Sub3(local881.anInt1204 >> 14 & 0x7FFF, 22, local137, local167, local306, local320, local312, local30, false, local881.aClass3_Sub1_Sub4_5);
					}
				}
			}
		} else if (Static51.anInt1329 == 153) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method647();
			local26 = local12 & 0x3;
			local20 = local12 >> 2;
			local30 = Static69.anIntArray226[local20];
			local133 = Static62.aClass3_Sub7_Sub1_2.method651();
			local143 = Static62.aClass3_Sub7_Sub1_2.method652();
			local147 = (local143 & 0x7) + Static111.anInt2565;
			local137 = Static99.anInt2345 + (local143 >> 4 & 0x7);
			if (local137 >= 0 && local147 >= 0 && local137 < 104 && local147 < 104) {
				Static38.method781(local137, local147, 0, Static72.anInt1813, local26, local30, -1, local133, local20);
			}
		} else if (Static51.anInt1329 == 149) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method602();
			local20 = Static62.aClass3_Sub7_Sub1_2.method652();
			local26 = (local20 >> 4 & 0x7) + Static99.anInt2345;
			local30 = Static111.anInt2565 + (local20 & 0x7);
			local133 = Static62.aClass3_Sub7_Sub1_2.method602();
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
				local63 = new Class3_Sub1_Sub4_Sub4();
				local63.anInt1295 = local133;
				local63.anInt1298 = local12;
				if (Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local26][local30] == null) {
					Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local26][local30] = new Class11();
				}
				Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local26][local30].method190(local63);
				Static59.method1069(local26, local30);
			}
		} else if (Static51.anInt1329 == 6) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method647();
			local20 = (local12 >> 4 & 0x7) + Static99.anInt2345;
			local26 = Static111.anInt2565 + (local12 & 0x7);
			local30 = Static62.aClass3_Sub7_Sub1_2.method624() + local20;
			local133 = local26 + Static62.aClass3_Sub7_Sub1_2.method624();
			local143 = Static62.aClass3_Sub7_Sub1_2.method649();
			local137 = Static62.aClass3_Sub7_Sub1_2.method602();
			local147 = Static62.aClass3_Sub7_Sub1_2.method647() * 4;
			local167 = Static62.aClass3_Sub7_Sub1_2.method647() * 4;
			local306 = Static62.aClass3_Sub7_Sub1_2.method602();
			local320 = Static62.aClass3_Sub7_Sub1_2.method602();
			local312 = Static62.aClass3_Sub7_Sub1_2.method647();
			local324 = Static62.aClass3_Sub7_Sub1_2.method647();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local30 >= 0 && local133 >= 0 && local30 < 104 && local133 < 104 && local137 != 65535) {
				local20 = local20 * 128 + 64;
				local26 = local26 * 128 + 64;
				local133 = local133 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(1230) Class3_Sub1_Sub4_Sub2 local1230 = new Class3_Sub1_Sub4_Sub2(local137, Static72.anInt1813, local20, local26, Static77.method1355(local26, Static72.anInt1813, local20) - local147, local306 + Static27.anInt843, Static27.anInt843 + local320, local312, local324, local143, local167);
				local1230.method521(Static27.anInt843 + local306, Static77.method1355(local133, Static72.anInt1813, local30) - local167, local133, local30);
				Static31.aClass11_3.method190(local1230);
			}
		} else if (Static51.anInt1329 == 51) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method617();
			local20 = Static62.aClass3_Sub7_Sub1_2.method617();
			local26 = Static62.aClass3_Sub7_Sub1_2.method612();
			local133 = Static111.anInt2565 + (local26 & 0x7);
			local30 = Static99.anInt2345 + (local26 >> 4 & 0x7);
			local143 = Static62.aClass3_Sub7_Sub1_2.method611();
			if (local30 >= 0 && local133 >= 0 && local30 < 104 && local133 < 104 && Static78.anInt1959 != local20) {
				@Pc(1311) Class3_Sub1_Sub4_Sub4 local1311 = new Class3_Sub1_Sub4_Sub4();
				local1311.anInt1295 = local143;
				local1311.anInt1298 = local12;
				if (Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local30][local133] == null) {
					Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local30][local133] = new Class11();
				}
				Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local30][local133].method190(local1311);
				Static59.method1069(local30, local133);
			}
		} else if (Static51.anInt1329 == 103) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method647();
			local20 = (local12 >> 4 & 0x7) + Static99.anInt2345;
			local26 = (local12 & 0x7) + Static111.anInt2565;
			local30 = Static62.aClass3_Sub7_Sub1_2.method602();
			local133 = Static62.aClass3_Sub7_Sub1_2.method602();
			local143 = Static62.aClass3_Sub7_Sub1_2.method602();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(1408) Class11 local1408 = Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local20][local26];
				if (local1408 != null) {
					for (@Pc(1417) Class3_Sub1_Sub4_Sub4 local1417 = (Class3_Sub1_Sub4_Sub4) local1408.method189(); local1417 != null; local1417 = (Class3_Sub1_Sub4_Sub4) local1408.method187()) {
						if ((local30 & 0x7FFF) == local1417.anInt1298 && local1417.anInt1295 == local133) {
							local1417.anInt1295 = local143;
							break;
						}
					}
					Static59.method1069(local20, local26);
				}
			}
		} else if (Static51.anInt1329 == 178) {
			local12 = Static62.aClass3_Sub7_Sub1_2.method612();
			local26 = Static111.anInt2565 + (local12 & 0x7);
			local20 = (local12 >> 4 & 0x7) + Static99.anInt2345;
			local30 = Static62.aClass3_Sub7_Sub1_2.method612();
			local143 = local30 & 0x3;
			local133 = local30 >> 2;
			local137 = Static69.anIntArray226[local133];
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				Static38.method781(local20, local26, 0, Static72.anInt1813, local143, local137, -1, -1, local133);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(I)V")
	public static void method925() {
		aClass53_601 = null;
		aClass3_Sub1_Sub15Array1 = null;
		aClass3_Sub1_Sub5_Sub3_12 = null;
		aClass53_598 = null;
		aClass53_600 = null;
		aClass53_599 = null;
	}
}
