import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static final int anInt897 = 7759444;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!wd;")
	private static Class80 aClass80_286 = Static2.method59("purple:");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!wd;")
	public static Class80 aClass80_287 = aClass80_286;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_291 = Static2.method59("Unexpected server response");

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_288 = aClass80_291;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt906 = 0;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_292 = Static2.method59("Message");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_289 = aClass80_292;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array5 = new Class80[1000];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_290 = Static2.method59("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	public static int anInt911 = 0;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[S")
	public static short[] aShortArray6 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_293 = aClass80_286;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)I")
	public static int method480() {
		return 19;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sa;B[Lclient!me;)V")
	public static void method482(@OriginalArg(0) Class64 arg0, @OriginalArg(2) Class49[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(32) int local32;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static108.aByteArrayArrayArray7[local7][local11][local15] & 0x1) == 1) {
						local32 = local7;
						if ((Static108.aByteArrayArrayArray7[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg1[local32].method1177(local15, local11);
						}
					}
				}
			}
		}
		Static61.anInt1790 += (int) (Math.random() * 5.0D) - 2;
		if (Static61.anInt1790 < -8) {
			Static61.anInt1790 = -8;
		}
		if (Static61.anInt1790 > 8) {
			Static61.anInt1790 = 8;
		}
		Static56.anInt1719 += (int) (Math.random() * 5.0D) - 2;
		if (Static56.anInt1719 < -16) {
			Static56.anInt1719 = -16;
		}
		if (Static56.anInt1719 > 16) {
			Static56.anInt1719 = 16;
		}
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(181) int local181;
		@Pc(160) int local160;
		@Pc(194) int local194;
		@Pc(204) int local204;
		@Pc(198) int local198;
		@Pc(210) int local210;
		@Pc(226) int local226;
		@Pc(276) int local276;
		@Pc(505) int local505;
		@Pc(501) int local501;
		@Pc(637) int local637;
		@Pc(647) int local647;
		@Pc(662) int local662;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(121) byte[][] local121 = Static97.aByteArrayArrayArray6[local11];
			local32 = (int) Math.sqrt(5100.0D);
			local131 = local32 * 768 >> 8;
			for (local133 = 1; local133 < 103; local133++) {
				for (local137 = 1; local137 < 103; local137++) {
					local160 = Static100.anIntArrayArrayArray5[local11][local137][local133 + 1] - Static100.anIntArrayArrayArray5[local11][local137][local133 - 1];
					local181 = Static100.anIntArrayArrayArray5[local11][local137 + 1][local133] - Static100.anIntArrayArrayArray5[local11][local137 - 1][local133];
					local194 = (int) Math.sqrt((double) (local160 * local160 + local181 * local181 + 65536));
					local198 = 65536 / local194;
					local204 = (local181 << 8) / local194;
					local210 = (local160 << 8) / local194;
					local226 = (local210 * -50 + local198 * -10 + local204 * -50) / local131 + 96;
					local276 = (local121[local137][local133] >> 1) + (local121[local137][local133 + 1] >> 3) + (local121[local137 + -1][local133] >> 2) + (local121[local137 + 1][local133] >> 3) + (local121[local137][local133 - 1] >> 2);
					Static51.anIntArrayArray20[local137][local133] = local226 - local276;
				}
			}
			for (local137 = 0; local137 < 104; local137++) {
				Static122.anIntArray405[local137] = 0;
				Static71.anIntArray248[local137] = 0;
				Static1.anIntArray1[local137] = 0;
				Static106.anIntArray359[local137] = 0;
				Static19.anIntArray99[local137] = 0;
			}
			for (local181 = -5; local181 < 109; local181++) {
				for (local160 = 0; local160 < 104; local160++) {
					local194 = local181 + 5;
					@Pc(399) int local399;
					if (local194 >= 0 && local194 < 104) {
						local204 = Static10.aByteArrayArrayArray1[local11][local194][local160] & 0xFF;
						if (local204 > 0) {
							@Pc(363) Class2_Sub1_Sub2 local363 = Static87.method1407(local204 - 1);
							Static122.anIntArray405[local160] += local363.anInt230;
							Static71.anIntArray248[local160] += local363.anInt226;
							Static1.anIntArray1[local160] += local363.anInt223;
							Static106.anIntArray359[local160] += local363.anInt224;
							local399 = Static19.anIntArray99[local160]++;
						}
					}
					local204 = local181 - 5;
					if (local204 >= 0 && local204 < 104) {
						local198 = Static10.aByteArrayArrayArray1[local11][local204][local160] & 0xFF;
						if (local198 > 0) {
							@Pc(434) Class2_Sub1_Sub2 local434 = Static87.method1407(local198 - 1);
							Static122.anIntArray405[local160] -= local434.anInt230;
							Static71.anIntArray248[local160] -= local434.anInt226;
							Static1.anIntArray1[local160] -= local434.anInt223;
							Static106.anIntArray359[local160] -= local434.anInt224;
							local399 = Static19.anIntArray99[local160]--;
						}
					}
				}
				if (local181 >= 1 && local181 < 103) {
					local194 = 0;
					local204 = 0;
					local210 = 0;
					local198 = 0;
					local226 = 0;
					for (local276 = -5; local276 < 109; local276++) {
						local501 = local276 - 5;
						local505 = local276 + 5;
						if (local505 >= 0 && local505 < 104) {
							local198 += Static1.anIntArray1[local505];
							local226 += Static19.anIntArray99[local505];
							local194 += Static122.anIntArray405[local505];
							local210 += Static106.anIntArray359[local505];
							local204 += Static71.anIntArray248[local505];
						}
						if (local501 >= 0 && local501 < 104) {
							local204 -= Static71.anIntArray248[local501];
							local210 -= Static106.anIntArray359[local501];
							local198 -= Static1.anIntArray1[local501];
							local194 -= Static122.anIntArray405[local501];
							local226 -= Static19.anIntArray99[local501];
						}
						if (local276 >= 1 && local276 < 103 && (!Static18.aBoolean51 || (Static108.aByteArrayArrayArray7[0][local181][local276] & 0x2) != 0 || (Static108.aByteArrayArrayArray7[local11][local181][local276] & 0x10) == 0 && Static126.method1983(local181, local11, local276) == Static90.anInt2213)) {
							if (Static113.anInt2928 > local11) {
								Static113.anInt2928 = local11;
							}
							local637 = Static10.aByteArrayArrayArray1[local11][local181][local276] & 0xFF;
							local647 = Static40.aByteArrayArrayArray3[local11][local181][local276] & 0xFF;
							if (local637 > 0 || local647 > 0) {
								local662 = Static100.anIntArrayArrayArray5[local11][local181][local276];
								@Pc(672) int local672 = Static100.anIntArrayArrayArray5[local11][local181 + 1][local276];
								@Pc(684) int local684 = Static100.anIntArrayArrayArray5[local11][local181 + 1][local276 + 1];
								@Pc(694) int local694 = Static100.anIntArrayArrayArray5[local11][local181][local276 + 1];
								@Pc(700) int local700 = Static51.anIntArrayArray20[local181][local276];
								@Pc(708) int local708 = Static51.anIntArrayArray20[local181 + 1][local276];
								@Pc(716) int local716 = Static51.anIntArrayArray20[local181][local276 + 1];
								@Pc(718) int local718 = -1;
								@Pc(720) int local720 = -1;
								@Pc(730) int local730 = Static51.anIntArrayArray20[local181 + 1][local276 + 1];
								@Pc(738) int local738;
								@Pc(742) int local742;
								if (local637 > 0) {
									local738 = local194 * 256 / local210;
									local742 = local204 / local226;
									@Pc(746) int local746 = local198 / local226;
									local718 = Static40.method669(local742, local746, local738);
									@Pc(758) int local758 = Static61.anInt1790 + local738 & 0xFF;
									local746 += Static56.anInt1719;
									if (local746 < 0) {
										local746 = 0;
									} else if (local746 > 255) {
										local746 = 255;
									}
									local720 = Static40.method669(local742, local746, local758);
								}
								if (local11 > 0) {
									@Pc(791) boolean local791 = true;
									if (local637 == 0 && Static35.aByteArrayArrayArray2[local11][local181][local276] != 0) {
										local791 = false;
									}
									if (local647 > 0 && !Static2.method62(local647 - 1).aBoolean196) {
										local791 = false;
									}
									if (local791 && local672 == local662 && local684 == local662 && local662 == local694) {
										Static79.anIntArrayArrayArray4[local11][local181][local276] |= 0x924;
									}
								}
								local738 = 0;
								if (local720 != -1) {
									local738 = Static52.anIntArray201[Static66.method1109(local720, 96)];
								}
								if (local647 == 0) {
									arg0.method1651(local11, local181, local276, 0, 0, -1, local662, local672, local684, local694, Static66.method1109(local718, local700), Static66.method1109(local718, local708), Static66.method1109(local718, local730), Static66.method1109(local718, local716), 0, 0, 0, 0, local738, 0);
								} else {
									local742 = Static35.aByteArrayArrayArray2[local11][local181][local276] + 1;
									@Pc(892) byte local892 = Static93.aByteArrayArrayArray5[local11][local181][local276];
									@Pc(898) Class2_Sub1_Sub14 local898 = Static2.method62(local647 - 1);
									@Pc(901) int local901 = local898.anInt2605;
									@Pc(916) int local916;
									@Pc(914) int local914;
									@Pc(941) int local941;
									@Pc(934) int local934;
									if (local901 >= 0) {
										local914 = Static52.anInterface1_1.method664(local901);
										local916 = -1;
									} else if (local898.anInt2617 == 16711935) {
										local914 = -2;
										local916 = -2;
										local901 = -1;
									} else {
										local916 = Static40.method669(local898.anInt2603, local898.anInt2604, local898.anInt2608);
										local934 = local898.anInt2604 + Static56.anInt1719;
										local941 = Static61.anInt1790 + local898.anInt2608 & 0xFF;
										if (local934 < 0) {
											local934 = 0;
										} else if (local934 > 255) {
											local934 = 255;
										}
										local914 = Static40.method669(local898.anInt2603, local934, local941);
									}
									local941 = 0;
									if (local914 != -2) {
										local941 = Static52.anIntArray201[Static30.method568(local914, 96)];
									}
									if (local898.anInt2610 != -1) {
										local934 = local898.anInt2615 + Static61.anInt1790 & 0xFF;
										@Pc(999) int local999 = local898.anInt2607 + Static56.anInt1719;
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local914 = Static40.method669(local898.anInt2612, local999, local934);
										local941 = Static52.anIntArray201[Static30.method568(local914, 96)];
									}
									arg0.method1651(local11, local181, local276, local742, local892, local901, local662, local672, local684, local694, Static66.method1109(local718, local700), Static66.method1109(local718, local708), Static66.method1109(local718, local730), Static66.method1109(local718, local716), Static30.method568(local916, local700), Static30.method568(local916, local708), Static30.method568(local916, local730), Static30.method568(local916, local716), local738, local941);
								}
							}
						}
					}
				}
			}
			for (local160 = 1; local160 < 103; local160++) {
				for (local194 = 1; local194 < 103; local194++) {
					arg0.method1631(local11, local194, local160, Static126.method1983(local194, local11, local160));
				}
			}
			Static10.aByteArrayArrayArray1[local11] = null;
			Static40.aByteArrayArrayArray3[local11] = null;
			Static35.aByteArrayArrayArray2[local11] = null;
			Static93.aByteArrayArrayArray5[local11] = null;
			Static97.aByteArrayArrayArray6[local11] = null;
		}
		arg0.method1624();
		for (local15 = 0; local15 < 104; local15++) {
			for (local32 = 0; local32 < 104; local32++) {
				if ((Static108.aByteArrayArrayArray7[1][local15][local32] & 0x2) == 2) {
					arg0.method1627(local15, local32);
				}
			}
		}
		local32 = 1;
		local131 = 2;
		local133 = 4;
		for (local137 = 0; local137 < 4; local137++) {
			if (local137 > 0) {
				local133 <<= 0x3;
				local131 <<= 0x3;
				local32 <<= 0x3;
			}
			for (local181 = 0; local181 <= local137; local181++) {
				for (local160 = 0; local160 <= 104; local160++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((local32 & Static79.anIntArrayArrayArray4[local181][local194][local160]) != 0) {
							for (local198 = local160; local198 < 104 && (local32 & Static79.anIntArrayArrayArray4[local181][local194][local198 + 1]) != 0; local198++) {
							}
							local204 = local160;
							local226 = local181;
							local210 = local181;
							while (local204 > 0 && (Static79.anIntArrayArrayArray4[local181][local194][local204 - 1] & local32) != 0) {
								local204--;
							}
							label347: while (local210 > 0) {
								for (local276 = local204; local276 <= local198; local276++) {
									if ((Static79.anIntArrayArrayArray4[local210 - 1][local194][local276] & local32) == 0) {
										break label347;
									}
								}
								local210--;
							}
							label336: while (local226 < local137) {
								for (local276 = local204; local276 <= local198; local276++) {
									if ((Static79.anIntArrayArrayArray4[local226 + 1][local194][local276] & local32) == 0) {
										break label336;
									}
								}
								local226++;
							}
							local276 = (local226 + 1 - local210) * (local198 + (1 - local204));
							if (local276 >= 8) {
								local637 = Static100.anIntArrayArrayArray5[local210][local194][local204];
								local501 = Static100.anIntArrayArrayArray5[local226][local194][local204] - 240;
								Static101.method1650(local137, 1, local194 * 128, local194 * 128, local204 * 128, local198 * 128 + 128, local501, local637);
								for (local647 = local210; local647 <= local226; local647++) {
									for (local662 = local204; local662 <= local198; local662++) {
										Static79.anIntArrayArrayArray4[local647][local194][local662] &= ~local32;
									}
								}
							}
						}
						if ((Static79.anIntArrayArrayArray4[local181][local194][local160] & local131) != 0) {
							local198 = local194;
							for (local204 = local194; local204 > 0 && (local131 & Static79.anIntArrayArrayArray4[local181][local204 - 1][local160]) != 0; local204--) {
							}
							while (local198 < 104 && (Static79.anIntArrayArrayArray4[local181][local198 + 1][local160] & local131) != 0) {
								local198++;
							}
							label402: for (local210 = local181; local210 > 0; local210--) {
								for (local276 = local204; local276 <= local198; local276++) {
									if ((local131 & Static79.anIntArrayArrayArray4[local210 - 1][local276][local160]) == 0) {
										break label402;
									}
								}
							}
							label390: for (local226 = local181; local226 < local137; local226++) {
								for (local276 = local204; local276 <= local198; local276++) {
									if ((Static79.anIntArrayArrayArray4[local226 + 1][local276][local160] & local131) == 0) {
										break label390;
									}
								}
							}
							local276 = (local198 + 1 - local204) * (local226 + 1 - local210);
							if (local276 >= 8) {
								local501 = Static100.anIntArrayArrayArray5[local226][local204][local160] - 240;
								local637 = Static100.anIntArrayArrayArray5[local210][local204][local160];
								Static101.method1650(local137, 2, local204 * 128, local198 * 128 + 128, local160 * 128, local160 * 128, local501, local637);
								for (local647 = local210; local647 <= local226; local647++) {
									for (local662 = local204; local662 <= local198; local662++) {
										Static79.anIntArrayArrayArray4[local647][local662][local160] &= ~local131;
									}
								}
							}
						}
						if ((Static79.anIntArrayArrayArray4[local181][local194][local160] & local133) != 0) {
							local204 = local194;
							local210 = local160;
							local198 = local194;
							while (local210 > 0 && (local133 & Static79.anIntArrayArrayArray4[local181][local194][local210 - 1]) != 0) {
								local210--;
							}
							for (local226 = local160; local226 < 104 && (local133 & Static79.anIntArrayArrayArray4[local181][local194][local226 + 1]) != 0; local226++) {
							}
							label456: while (local204 > 0) {
								for (local276 = local210; local276 <= local226; local276++) {
									if ((Static79.anIntArrayArrayArray4[local181][local204 - 1][local276] & local133) == 0) {
										break label456;
									}
								}
								local204--;
							}
							label445: while (local198 < 104) {
								for (local276 = local210; local276 <= local226; local276++) {
									if ((Static79.anIntArrayArrayArray4[local181][local198 + 1][local276] & local133) == 0) {
										break label445;
									}
								}
								local198++;
							}
							if ((local226 + 1 - local210) * (local198 + 1 - local204) >= 4) {
								local276 = Static100.anIntArrayArrayArray5[local181][local204][local210];
								Static101.method1650(local137, 4, local204 * 128, local198 * 128 + 128, local210 * 128, local226 * 128 + 128, local276, local276);
								for (local505 = local204; local505 <= local198; local505++) {
									for (local501 = local210; local501 <= local226; local501++) {
										Static79.anIntArrayArrayArray4[local181][local505][local501] &= ~local133;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method484() {
		aClass80_292 = null;
		aShortArray6 = null;
		aClass66_1 = null;
		aClass80_287 = null;
		aClass80_286 = null;
		aClass80_290 = null;
		aClass80_288 = null;
		aClass80Array5 = null;
		aClass80_289 = null;
		aClass80_293 = null;
		aClass80_291 = null;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method485() {
		@Pc(14) int local14 = Static111.aClass2_Sub1_Sub9_Sub4_34.method1910(Static120.aClass80_1170);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < Static103.anInt2679; local16++) {
			local24 = Static111.aClass2_Sub1_Sub9_Sub4_34.method1915(Static2.aClass80Array1[local16]);
			if (local14 < local24) {
				local14 = local24;
			}
		}
		local14 += 8;
		local24 = Static103.anInt2679 * 15 + 21;
		@Pc(70) int local70;
		@Pc(72) int local72;
		if (Static91.anInt2232 != -1) {
			Static11.anInt315 = 0;
			Static11.anInt305 = local14;
			Static82.anInt3081 = Static103.anInt2679 * 15 + 22;
			Static122.aBoolean241 = true;
			local70 = Static13.anInt365 - local14 / 2;
			local72 = Static108.anInt2880;
			if (local70 + local14 > 765) {
				local70 = 765 - local14;
			}
			if (local70 < 0) {
				local70 = 0;
			}
			if (local24 + local72 > 503) {
				local72 = 503 - local24;
			}
			if (local72 < 0) {
				local72 = 0;
			}
			Static107.anInt2869 = local70;
			Static51.anInt1545 = local72;
		} else if (Static13.anInt365 > 4 && Static108.anInt2880 > 4 && Static13.anInt365 < 516 && Static108.anInt2880 < 338) {
			Static11.anInt305 = local14;
			Static122.aBoolean241 = true;
			Static82.anInt3081 = Static103.anInt2679 * 15 + 22;
			local70 = Static13.anInt365 - local14 / 2 - 4;
			Static11.anInt315 = 0;
			local72 = Static108.anInt2880 - 4;
			if (local70 + local14 > 512) {
				local70 = 512 - local14;
			}
			if (local24 + local72 > 334) {
				local72 = 334 - local24;
			}
			if (local70 < 0) {
				local70 = 0;
			}
			Static107.anInt2869 = local70;
			if (local72 < 0) {
				local72 = 0;
			}
			Static51.anInt1545 = local72;
		} else if (Static13.anInt365 > 553 && Static108.anInt2880 > 205 && Static13.anInt365 < 743 && Static108.anInt2880 < 466) {
			Static11.anInt305 = local14;
			Static82.anInt3081 = Static103.anInt2679 * 15 + 22;
			Static11.anInt315 = 1;
			local72 = Static108.anInt2880 - 205;
			local70 = Static13.anInt365 - local14 / 2 - 553;
			if (local70 < 0) {
				local70 = 0;
			} else if (local14 + local70 > 190) {
				local70 = 190 - local14;
			}
			Static107.anInt2869 = local70;
			Static122.aBoolean241 = true;
			if (local72 < 0) {
				local72 = 0;
			} else if (local72 + local24 > 261) {
				local72 = 261 - local24;
			}
			Static51.anInt1545 = local72;
		} else if (Static13.anInt365 > 17 && Static108.anInt2880 > 357 && Static13.anInt365 < 496 && Static108.anInt2880 < 453) {
			Static82.anInt3081 = Static103.anInt2679 * 15 + 22;
			Static11.anInt315 = 2;
			Static11.anInt305 = local14;
			local70 = Static13.anInt365 - local14 / 2 - 17;
			local72 = Static108.anInt2880 - 357;
			if (local72 < 0) {
				local72 = 0;
			} else if (local24 + local72 > 96) {
				local72 = 96 - local24;
			}
			Static122.aBoolean241 = true;
			if (local70 < 0) {
				local70 = 0;
			} else if (local14 + local70 > 479) {
				local70 = 479 - local14;
			}
			Static107.anInt2869 = local70;
			Static51.anInt1545 = local72;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method486() {
		Static59.aClass32_34.method878();
		Static74.aClass32_37.method878();
		Static36.aClass32_21.method878();
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method487() {
		Static61.aClass22_13.method1068();
		Static52.method929();
	}
}
