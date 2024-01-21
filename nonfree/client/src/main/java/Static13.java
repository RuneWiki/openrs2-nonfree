import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "Lclient!fb;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
	public static int anInt799;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "Lclient!pb;")
	public static Class40 aClass40_13;

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
	private static int anInt803;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!pe;")
	public static Class6_Sub1_Sub1 aClass6_Sub1_Sub1_2 = new Class6_Sub1_Sub1(5000);

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
	public static int anInt795 = -1;

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Lclient!rc;")
	public static Class55 aClass55_264 = Static34.method846(" x");

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_265 = Static34.method846(":");

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "[I")
	public static int[] anIntArray46 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
	public static int anInt800 = -1;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
	public static int anInt801 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method488() {
		anIntArray46 = null;
		aFrame2 = null;
		aClass55_264 = null;
		aClass40_13 = null;
		aClass55_265 = null;
		aClass6_Sub1_Sub1_2 = null;
		aByteArrayArrayArray4 = null;
		aClass20_2 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method494() {
		if (Static19.anInt945 > 1) {
			Static19.anInt945--;
		}
		if (Static100.anInt2949 > 0) {
			Static100.anInt2949--;
		}
		if (Static5.aBoolean103) {
			Static5.aBoolean103 = false;
			Static91.method1745();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static6.method241(); local30++) {
		}
		if (Static61.anInt1879 != 30 && Static61.anInt1879 != 35) {
			return;
		}
		if (Static7.aBoolean18 && Static61.anInt1879 == 30) {
			Static6.anInt275 = 0;
			Static85.anInt2400 = 0;
			while (Static9.method353()) {
			}
			for (@Pc(69) int local69 = 0; local69 < Static41.aBooleanArray3.length; local69++) {
				Static41.aBooleanArray3[local69] = false;
			}
		}
		Static63.method1323(Static51.aClass6_Sub1_Sub1_3);
		@Pc(92) Object local92 = Static56.aClass51_1.anObject4;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(124) int local124;
		@Pc(154) int local154;
		synchronized (Static56.aClass51_1.anObject4) {
			if (!Static68.aBoolean92) {
				Static56.aClass51_1.anInt2245 = 0;
			} else if (Static85.anInt2400 != 0 || Static56.aClass51_1.anInt2245 >= 40) {
				Static51.aClass6_Sub1_Sub1_3.method1515(87);
				Static51.aClass6_Sub1_Sub1_3.method1501(0);
				local120 = Static51.aClass6_Sub1_Sub1_3.anInt2209;
				local122 = 0;
				@Pc(138) int local138;
				for (local124 = 0; local124 < Static56.aClass51_1.anInt2245 && Static51.aClass6_Sub1_Sub1_3.anInt2209 - local120 < 240; local124++) {
					local138 = Static56.aClass51_1.anIntArray220[local124];
					if (local138 < 0) {
						local138 = 0;
					} else if (local138 > 502) {
						local138 = 502;
					}
					local154 = Static56.aClass51_1.anIntArray219[local124];
					local122++;
					if (local154 < 0) {
						local154 = 0;
					} else if (local154 > 764) {
						local154 = 764;
					}
					@Pc(172) int local172 = local154 + local138 * 765;
					if (Static56.aClass51_1.anIntArray220[local124] == -1 && Static56.aClass51_1.anIntArray219[local124] == -1) {
						local138 = -1;
						local154 = -1;
						local172 = 524287;
					}
					if (Static44.anInt2758 != local154 || local138 != Static4.anInt2362) {
						@Pc(217) int local217 = local154 - Static44.anInt2758;
						Static44.anInt2758 = local154;
						@Pc(224) int local224 = local138 - Static4.anInt2362;
						Static4.anInt2362 = local138;
						if (anInt801 < 8 && local217 >= -32 && local217 <= 31 && local224 >= -32 && local224 <= 31) {
							local217 += 32;
							local224 += 32;
							Static51.aClass6_Sub1_Sub1_3.method1512(local224 + (local217 << 6) + (anInt801 << 12));
							anInt801 = 0;
						} else if (anInt801 < 8) {
							Static51.aClass6_Sub1_Sub1_3.method1490((anInt801 << 19) + local172 + 8388608);
							anInt801 = 0;
						} else {
							Static51.aClass6_Sub1_Sub1_3.method1499((anInt801 << 19) + local172 - 1073741824);
							anInt801 = 0;
						}
					} else if (anInt801 < 2047) {
						anInt801++;
					}
				}
				Static51.aClass6_Sub1_Sub1_3.method1506(Static51.aClass6_Sub1_Sub1_3.anInt2209 - local120);
				if (local122 < Static56.aClass51_1.anInt2245) {
					Static56.aClass51_1.anInt2245 -= local122;
					for (local138 = 0; local138 < Static56.aClass51_1.anInt2245; local138++) {
						Static56.aClass51_1.anIntArray219[local138] = Static56.aClass51_1.anIntArray219[local122 + local138];
						Static56.aClass51_1.anIntArray220[local138] = Static56.aClass51_1.anIntArray220[local138 + local122];
					}
				} else {
					Static56.aClass51_1.anInt2245 = 0;
				}
			}
		}
		if (Static85.anInt2400 != 0) {
			local120 = Static23.anInt1030;
			@Pc(383) long local383 = (Static15.aLong30 - Static75.aLong76) / 50L;
			if (local120 < 0) {
				local120 = 0;
			} else if (local120 > 502) {
				local120 = 502;
			}
			if (local383 > 4095L) {
				local383 = 4095L;
			}
			Static75.aLong76 = Static15.aLong30;
			local122 = Static68.anInt2013;
			@Pc(415) byte local415 = 0;
			if (Static85.anInt2400 == 2) {
				local415 = 1;
			}
			local154 = (int) local383;
			if (local122 < 0) {
				local122 = 0;
			} else if (local122 > 764) {
				local122 = 764;
			}
			local124 = local122 + local120 * 765;
			Static51.aClass6_Sub1_Sub1_3.method1515(79);
			Static51.aClass6_Sub1_Sub1_3.method1499(local124 + (local415 << 19) + (local154 << 20));
		}
		if (Static88.anInt3266 > 0) {
			Static88.anInt3266--;
		}
		if (Static41.aBooleanArray3[96] || Static41.aBooleanArray3[97] || Static41.aBooleanArray3[98] || Static41.aBooleanArray3[99]) {
			Static108.aBoolean161 = true;
		}
		if (Static108.aBoolean161 && Static88.anInt3266 <= 0) {
			Static88.anInt3266 = 20;
			Static108.aBoolean161 = false;
			Static51.aClass6_Sub1_Sub1_3.method1515(210);
			Static51.aClass6_Sub1_Sub1_3.method1467(Static14.anInt811);
			Static51.aClass6_Sub1_Sub1_3.method1510(Static26.anInt2144);
		}
		if (Static57.aBoolean78 && !Static33.aBoolean57) {
			Static33.aBoolean57 = true;
			Static51.aClass6_Sub1_Sub1_3.method1515(155);
			Static51.aClass6_Sub1_Sub1_3.method1501(1);
		}
		if (!Static57.aBoolean78 && Static33.aBoolean57) {
			Static33.aBoolean57 = false;
			Static51.aClass6_Sub1_Sub1_3.method1515(155);
			Static51.aClass6_Sub1_Sub1_3.method1501(0);
		}
		Static18.method584();
		if (Static61.anInt1879 != 30 && Static61.anInt1879 != 35) {
			return;
		}
		Static29.method745();
		Static20.method592();
		Static55.anInt1706++;
		if (Static55.anInt1706 > 750) {
			Static91.method1745();
			return;
		}
		Static111.method2044();
		Static5.method1482();
		Static45.method991();
		if (Static97.anInt2829 != 0) {
			Static51.anInt1585++;
			if (Static51.anInt1585 >= 15) {
				if (Static97.anInt2829 == 2) {
					Static63.aBoolean89 = true;
				}
				if (Static97.anInt2829 == 3) {
					Static72.aBoolean99 = true;
				}
				Static97.anInt2829 = 0;
			}
		}
		Static45.anInt1477++;
		if (Static19.anInt946 != 0) {
			Static111.anInt3172 += 20;
			if (Static111.anInt3172 >= 400) {
				Static19.anInt946 = 0;
			}
		}
		if (Static58.anInt1746 != 0) {
			if (Static58.anInt1741 > Static57.anInt1733 + 5 || Static58.anInt1741 < Static57.anInt1733 - 5 || Static27.anInt1358 > Static56.anInt1716 + 5 || Static56.anInt1716 - 5 > Static27.anInt1358) {
				Static75.aBoolean101 = true;
			}
			Static54.anInt1680++;
			if (Static6.anInt275 == 0) {
				if (Static58.anInt1746 == 2) {
					Static63.aBoolean89 = true;
				}
				if (Static58.anInt1746 == 3) {
					Static72.aBoolean99 = true;
				}
				Static58.anInt1746 = 0;
				if (Static75.aBoolean101 && Static54.anInt1680 >= 5) {
					Static114.anInt3279 = -1;
					Static71.method1425();
					if (Static114.anInt3279 == Static11.anInt702 && Static95.anInt2763 != Static65.anInt1931) {
						@Pc(737) Class6_Sub2_Sub14 local737 = Static99.method1897(Static11.anInt702);
						@Pc(743) byte local743 = 0;
						if (Static101.anInt3016 == 1 && local737.anInt2909 == 206) {
							local743 = 1;
						}
						if (local737.anIntArray267[Static95.anInt2763] <= 0) {
							local743 = 0;
						}
						if (local737.aBoolean142) {
							local120 = Static65.anInt1931;
							local122 = Static95.anInt2763;
							local737.anIntArray267[local122] = local737.anIntArray267[local120];
							local737.anIntArray268[local122] = local737.anIntArray268[local120];
							local737.anIntArray267[local120] = -1;
							local737.anIntArray268[local120] = 0;
						} else if (local743 == 1) {
							local120 = Static65.anInt1931;
							local122 = Static95.anInt2763;
							while (local120 != local122) {
								if (local122 < local120) {
									local737.method1896(local120, local120 - 1);
									local120--;
								} else if (local122 > local120) {
									local737.method1896(local120, local120 + 1);
									local120++;
								}
							}
						} else {
							local737.method1896(Static65.anInt1931, Static95.anInt2763);
						}
						Static51.aClass6_Sub1_Sub1_3.method1515(116);
						Static51.aClass6_Sub1_Sub1_3.method1499(Static11.anInt702);
						Static51.aClass6_Sub1_Sub1_3.method1512(Static65.anInt1931);
						Static51.aClass6_Sub1_Sub1_3.method1501(local743);
						Static51.aClass6_Sub1_Sub1_3.method1512(Static95.anInt2763);
					}
				} else if ((Static1.anInt5 == 1 || Static51.method1096(Static94.anInt2645 - 1)) && Static94.anInt2645 > 2) {
					Static9.method352();
				} else if (Static94.anInt2645 > 0) {
					Static57.method1185(Static94.anInt2645 - 1);
				}
				Static85.anInt2400 = 0;
				Static51.anInt1585 = 10;
			}
		}
		if (Static76.anInt2217 == -1) {
			if (anInt800 != -1) {
				Static114.method2099(516, 34, anInt800, 4, 338, 4);
			}
			if (Static14.anInt804 != -1) {
				Static114.method2099(743, 34, Static14.anInt804, 205, 466, 553);
			} else if (Static100.anIntArray277[Static112.anInt3228] != -1) {
				Static114.method2099(743, 34, Static100.anIntArray277[Static112.anInt3228], 205, 466, 553);
			}
			if (Static1.anInt3 != -1) {
				Static114.method2099(496, 34, Static1.anInt3, 357, 453, 17);
			} else if (Static39.anInt1691 != -1) {
				Static114.method2099(496, 34, Static39.anInt1691, 357, 453, 17);
			}
		} else {
			Static114.method2099(765, 34, Static76.anInt2217, 0, 503, 0);
			if (Static24.anInt1098 != -1) {
				Static114.method2099(765, 34, Static24.anInt1098, 0, 503, 0);
			}
		}
		if (Static76.anInt2217 == -1) {
			if (anInt800 != -1) {
				Static114.method2099(516, -35, anInt800, 4, 338, 4);
			}
			if (Static14.anInt804 != -1) {
				Static114.method2099(743, -35, Static14.anInt804, 205, 466, 553);
			} else if (Static100.anIntArray277[Static112.anInt3228] != -1) {
				Static114.method2099(743, -35, Static100.anIntArray277[Static112.anInt3228], 205, 466, 553);
			}
			if (Static1.anInt3 != -1) {
				Static114.method2099(496, -35, Static1.anInt3, 357, 453, 17);
			} else if (Static39.anInt1691 != -1) {
				Static114.method2099(496, -35, Static39.anInt1691, 357, 453, 17);
			}
		} else {
			Static114.method2099(765, -35, Static76.anInt2217, 0, 503, 0);
			if (Static24.anInt1098 != -1) {
				Static114.method2099(765, -35, Static24.anInt1098, 0, 503, 0);
			}
		}
		Static89.method1696();
		@Pc(1069) int local1069;
		if (Static48.anInt1533 != -1) {
			local1069 = Static48.anInt1533;
			local120 = Static48.anInt1538;
			@Pc(1091) boolean local1091 = Static75.method1436(local120, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], true, 0, 0, 0, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local1069);
			Static48.anInt1533 = -1;
			if (local1091) {
				Static64.anInt1921 = Static23.anInt1030;
				Static11.anInt696 = Static68.anInt2013;
				Static111.anInt3172 = 0;
				Static19.anInt946 = 1;
			}
		}
		if (Static85.anInt2400 == 1 && Static44.aClass55_1159 != null) {
			Static85.anInt2400 = 0;
			Static72.aBoolean99 = true;
			Static44.aClass55_1159 = null;
		}
		Static76.method1517();
		if (Static76.anInt2217 == -1) {
			Static63.method1318();
			Static44.method1830();
			Static104.method1983();
		}
		if (Static59.anInt1819 == -1 && Static33.anInt1267 == -1 && Static103.anInt3042 == -1) {
			if (Static44.anInt2748 > 0) {
				Static44.anInt2748--;
			}
		} else if (Static44.anInt2748 < Static88.anInt3275) {
			Static44.anInt2748++;
			if (Static44.anInt2748 == Static88.anInt3275) {
				if (Static33.anInt1267 != -1) {
					Static63.aBoolean89 = true;
				}
				if (Static59.anInt1819 != -1) {
					Static72.aBoolean99 = true;
				}
			}
		}
		if (Static6.anInt275 == 1 || Static85.anInt2400 == 1) {
			Static45.anInt1471++;
		}
		Static75.method1439();
		if (Static97.aBoolean129) {
			Static54.method1158();
		}
		for (local1069 = 0; local1069 < 5; local1069++) {
			@Pc(1192) int local1192 = Static85.anIntArray236[local1069]++;
		}
		Static64.method1336();
		local120 = Static21.method650();
		local122 = Static4.method1615();
		if (local120 > 4500 && local122 > 4500) {
			Static100.anInt2949 = 250;
			Static91.method1728(4000);
			Static51.aClass6_Sub1_Sub1_3.method1515(135);
		}
		Static93.anInt2610++;
		Static101.anInt2986++;
		if (Static101.anInt2986 > 500) {
			local124 = (int) (Math.random() * 8.0D);
			Static101.anInt2986 = 0;
			if ((local124 & 0x2) == 2) {
				Static94.anInt2648 += Static67.anInt1975;
			}
			if ((local124 & 0x4) == 4) {
				Static64.anInt1910 += Static67.anInt1980;
			}
			if ((local124 & 0x1) == 1) {
				Static35.anInt1336 += Static24.anInt1089;
			}
		}
		if (Static93.anInt2610 > 500) {
			Static93.anInt2610 = 0;
			local124 = (int) (Math.random() * 8.0D);
			if ((local124 & 0x1) == 1) {
				Static8.anInt383 += Static65.anInt1941;
			}
			if ((local124 & 0x2) == 2) {
				Static27.anInt1352 += Static71.anInt2110;
			}
		}
		if (Static8.anInt383 < -60) {
			Static65.anInt1941 = 2;
		}
		if (Static64.anInt1910 < -40) {
			Static67.anInt1980 = 1;
		}
		if (Static64.anInt1910 > 40) {
			Static67.anInt1980 = -1;
		}
		if (Static94.anInt2648 < -55) {
			Static67.anInt1975 = 2;
		}
		if (Static27.anInt1352 < -20) {
			Static71.anInt2110 = 1;
		}
		if (Static94.anInt2648 > 55) {
			Static67.anInt1975 = -2;
		}
		if (Static27.anInt1352 > 10) {
			Static71.anInt2110 = -1;
		}
		if (Static8.anInt383 > 60) {
			Static65.anInt1941 = -2;
		}
		Static52.anInt1648++;
		if (Static35.anInt1336 < -50) {
			Static24.anInt1089 = 2;
		}
		if (Static35.anInt1336 > 50) {
			Static24.anInt1089 = -2;
		}
		if (Static52.anInt1648 > 50) {
			Static51.aClass6_Sub1_Sub1_3.method1515(185);
		}
		try {
			if (Static19.aClass65_1 != null && Static51.aClass6_Sub1_Sub1_3.anInt2209 > 0) {
				Static19.aClass65_1.method2009(Static51.aClass6_Sub1_Sub1_3.aByteArray11, Static51.aClass6_Sub1_Sub1_3.anInt2209);
				Static51.aClass6_Sub1_Sub1_3.anInt2209 = 0;
				Static52.anInt1648 = 0;
			}
		} catch (@Pc(1407) IOException local1407) {
			Static91.method1745();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZI[B)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (Static57.aClass5_1 == null) {
			return;
		}
		if (Static49.anInt1569 >= 0) {
			arg1 -= 20;
			if (arg1 < 1) {
				arg1 = 1;
			}
			Static52.anInt1647 = arg1;
			if (Static49.anInt1569 == 0) {
				Static85.anInt2394 = 0;
			} else {
				@Pc(35) int local35 = Static94.method1797(Static49.anInt1569);
				@Pc(39) int local39 = local35 - Static104.anInt3067;
				Static85.anInt2394 = (local39 + arg1 + 3600 - 1) / arg1;
			}
			anInt799 = arg0;
			Static58.aBoolean79 = arg2;
			Static93.aByteArray13 = arg3;
		} else if (Static52.anInt1647 == 0) {
			Static50.method2079(arg3, arg2, arg0);
		} else {
			Static58.aBoolean79 = arg2;
			Static93.aByteArray13 = arg3;
			anInt799 = arg0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!b;B)[Ljava/lang/Object;")
	public static Object[] method499(@OriginalArg(0) Class6_Sub1 arg0) {
		@Pc(9) int local9 = arg0.method1495();
		if (local9 == 0) {
			return null;
		}
		@Pc(16) Object[] local16 = new Object[local9];
		for (@Pc(23) int local23 = 0; local23 < local9; local23++) {
			@Pc(29) int local29 = arg0.method1495();
			if (local29 == 0) {
				local16[local23] = Integer.valueOf(arg0.method1503());
			} else if (local29 == 1) {
				local16[local23] = arg0.method1461();
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public static void method500() {
		Static4.aClass36_29.method1155();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)I")
	public static int method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(48) int local48 = Static98.method1874(4, arg0 + 45365, arg1 + 91923) + (Static98.method1874(2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (Static98.method1874(1, arg0, arg1) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)I")
	public static int method502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZI[BI)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (Static57.aClass5_1 == null) {
			return;
		}
		if (Static49.anInt1569 >= 0) {
			Static85.anInt2394 = arg0;
			if (Static49.anInt1569 == 0) {
				Static52.anInt1647 = 1;
			} else {
				@Pc(39) int local39 = Static94.method1797(Static49.anInt1569);
				@Pc(43) int local43 = local39 - Static104.anInt3067;
				Static52.anInt1647 = (local43 + 3600) / arg0;
				if (Static52.anInt1647 < 1) {
					Static52.anInt1647 = 1;
				}
			}
			anInt799 = arg2;
			Static58.aBoolean79 = arg1;
			Static93.aByteArray13 = arg3;
		} else if (Static52.anInt1647 == 0) {
			Static50.method2079(arg3, arg1, arg2);
		} else {
			anInt799 = arg2;
			Static93.aByteArray13 = arg3;
			Static58.aBoolean79 = arg1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public static void method505() {
		while (true) {
			if (aClass6_Sub1_Sub1_2.method1514(Static63.anInt1889) >= 11) {
				@Pc(22) int local22 = aClass6_Sub1_Sub1_2.method1519(11);
				if (local22 != 2047) {
					@Pc(29) boolean local29 = false;
					if (Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local22] == null) {
						local29 = true;
						Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local22] = new Class6_Sub2_Sub3_Sub1_Sub1();
						if (Static61.aClass6_Sub1Array1[local22] != null) {
							Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local22].method446(Static61.aClass6_Sub1Array1[local22]);
						}
					}
					Static101.anIntArray283[Static78.anInt2246++] = local22;
					@Pc(65) Class6_Sub2_Sub3_Sub1_Sub1 local65 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local22];
					local65.anInt2739 = Static85.anInt2389;
					@Pc(75) int local75 = aClass6_Sub1_Sub1_2.method1519(1);
					@Pc(82) int local82 = aClass6_Sub1_Sub1_2.method1519(1);
					if (local82 == 1) {
						Static102.anIntArray288[Static59.anInt1826++] = local22;
					}
					@Pc(100) int local100 = aClass6_Sub1_Sub1_2.method1519(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(111) int local111 = Static18.anIntArray59[aClass6_Sub1_Sub1_2.method1519(3)];
					if (local29) {
						local65.anInt2707 = local111;
					}
					@Pc(121) int local121 = aClass6_Sub1_Sub1_2.method1519(5);
					if (local121 > 15) {
						local121 -= 32;
					}
					local65.method1832(local121 + Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], local75 == 1, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0] + local100);
					continue;
				}
			}
			aClass6_Sub1_Sub1_2.method1523();
			return;
		}
	}
}
