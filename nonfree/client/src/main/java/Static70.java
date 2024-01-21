import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_33;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array7;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!kd;")
	private static Class39 aClass39_873 = Static108.method1915("Loaded fonts");

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_874 = Static108.method1915(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_875 = aClass39_873;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ta;")
	public static Class70 aClass70_8 = new Class70(4096);

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_876 = Static108.method1915("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!kd;")
	private static Class39 aClass39_877 = Static108.method1915(" more options");

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_878 = aClass39_877;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!jb;")
	public static Class33 aClass33_26 = new Class33(64);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Z")
	public static boolean method1228(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1230() {
		Static29.aClass14_1.method1809();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static43.aLongArray1[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static121.aLongArray6[local22] = 0L;
		}
		Static29.anInt973 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1231() {
		if (Static49.anInt1372 > 1) {
			Static49.anInt1372--;
		}
		if (Static100.anInt2556 > 0) {
			Static100.anInt2556--;
		}
		if (Static24.aBoolean67) {
			Static24.aBoolean67 = false;
			Static67.method1198();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static43.method764(); local32++) {
		}
		if (Static1.anInt62 != 30 && Static1.anInt62 != 35) {
			return;
		}
		if (Static2.aBoolean21 && Static1.anInt62 == 30) {
			Static91.anInt2130 = 0;
			Static85.anInt2030 = 0;
			while (Static117.method2022()) {
			}
			for (@Pc(67) int local67 = 0; local67 < Static65.aBooleanArray8.length; local67++) {
				Static65.aBooleanArray8[local67] = false;
			}
		}
		Static13.method288(Static103.aClass1_Sub18_Sub1_5);
		@Pc(89) Object local89 = Static81.aClass75_1.anObject4;
		@Pc(124) int local124;
		@Pc(117) int local117;
		@Pc(126) int local126;
		@Pc(157) int local157;
		synchronized (Static81.aClass75_1.anObject4) {
			if (!Static90.aBoolean177) {
				Static81.aClass75_1.anInt2970 = 0;
			} else if (Static91.anInt2130 != 0 || Static81.aClass75_1.anInt2970 >= 40) {
				Static103.aClass1_Sub18_Sub1_5.method2203(243);
				local117 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2168(0);
				local124 = Static103.aClass1_Sub18_Sub1_5.anInt3078;
				@Pc(141) int local141;
				for (local126 = 0; Static81.aClass75_1.anInt2970 > local126 && Static103.aClass1_Sub18_Sub1_5.anInt3078 - local124 < 240; local126++) {
					local117++;
					local141 = Static81.aClass75_1.anIntArray465[local126];
					if (local141 < 0) {
						local141 = 0;
					} else if (local141 > 502) {
						local141 = 502;
					}
					local157 = Static81.aClass75_1.anIntArray464[local126];
					if (local157 < 0) {
						local157 = 0;
					} else if (local157 > 764) {
						local157 = 764;
					}
					@Pc(179) int local179 = local157 + local141 * 765;
					if (Static81.aClass75_1.anIntArray465[local126] == -1 && Static81.aClass75_1.anIntArray464[local126] == -1) {
						local179 = 524287;
						local157 = -1;
						local141 = -1;
					}
					if (Static41.anInt3024 != local157 || Static68.anInt1752 != local141) {
						@Pc(222) int local222 = local157 - Static41.anInt3024;
						Static41.anInt3024 = local157;
						@Pc(229) int local229 = local141 - Static68.anInt1752;
						Static68.anInt1752 = local141;
						if (Static19.anInt641 < 8 && local222 >= -32 && local222 <= 31 && local229 >= -32 && local229 <= 31) {
							local229 += 32;
							local222 += 32;
							Static103.aClass1_Sub18_Sub1_5.method2159(local229 + (local222 << 6) + (Static19.anInt641 << 12));
							Static19.anInt641 = 0;
						} else if (Static19.anInt641 < 8) {
							Static103.aClass1_Sub18_Sub1_5.method2188((Static19.anInt641 << 19) + (local179 + 8388608));
							Static19.anInt641 = 0;
						} else {
							Static103.aClass1_Sub18_Sub1_5.method2149((Static19.anInt641 << 19) + local179 - 1073741824);
							Static19.anInt641 = 0;
						}
					} else if (Static19.anInt641 < 2047) {
						Static19.anInt641++;
					}
				}
				Static103.aClass1_Sub18_Sub1_5.method2180(Static103.aClass1_Sub18_Sub1_5.anInt3078 - local124);
				if (Static81.aClass75_1.anInt2970 > local117) {
					Static81.aClass75_1.anInt2970 -= local117;
					for (local141 = 0; local141 < Static81.aClass75_1.anInt2970; local141++) {
						Static81.aClass75_1.anIntArray464[local141] = Static81.aClass75_1.anIntArray464[local117 + local141];
						Static81.aClass75_1.anIntArray465[local141] = Static81.aClass75_1.anIntArray465[local117 + local141];
					}
				} else {
					Static81.aClass75_1.anInt2970 = 0;
				}
			}
		}
		if (Static91.anInt2130 != 0) {
			@Pc(376) long local376 = (Static11.aLong12 - Static87.aLong59) / 50L;
			if (local376 > 4095L) {
				local376 = 4095L;
			}
			Static87.aLong59 = Static11.aLong12;
			local124 = Static38.anInt1157;
			if (local124 < 0) {
				local124 = 0;
			} else if (local124 > 502) {
				local124 = 502;
			}
			local117 = Static89.anInt2109;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 764) {
				local117 = 764;
			}
			local126 = local117 + local124 * 765;
			@Pc(422) byte local422 = 0;
			if (Static91.anInt2130 == 2) {
				local422 = 1;
			}
			Static103.aClass1_Sub18_Sub1_5.method2203(39);
			local157 = (int) local376;
			Static103.aClass1_Sub18_Sub1_5.method2138(local126 + (local422 << 19) + (local157 << 20));
		}
		if (Static65.aBooleanArray8[96] || Static65.aBooleanArray8[97] || Static65.aBooleanArray8[98] || Static65.aBooleanArray8[99]) {
			Static41.aBoolean240 = true;
		}
		if (Static10.anInt477 > 0) {
			Static10.anInt477--;
		}
		if (Static41.aBoolean240 && Static10.anInt477 <= 0) {
			Static10.anInt477 = 20;
			Static41.aBoolean240 = false;
			Static103.aClass1_Sub18_Sub1_5.method2203(175);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static76.anInt1920);
			Static103.aClass1_Sub18_Sub1_5.method2177(Static51.anInt1408);
		}
		if (Static41.aBoolean241 && !Static67.aBoolean147) {
			Static67.aBoolean147 = true;
			Static103.aClass1_Sub18_Sub1_5.method2203(179);
			Static103.aClass1_Sub18_Sub1_5.method2168(1);
		}
		if (!Static41.aBoolean241 && Static67.aBoolean147) {
			Static67.aBoolean147 = false;
			Static103.aClass1_Sub18_Sub1_5.method2203(179);
			Static103.aClass1_Sub18_Sub1_5.method2168(0);
		}
		Static68.method1219();
		if (Static1.anInt62 != 30 && Static1.anInt62 != 35) {
			return;
		}
		Static82.method1396();
		Static116.method1988();
		Static122.anInt2981++;
		if (Static122.anInt2981 > 750) {
			Static67.method1198();
			return;
		}
		Static49.method860();
		Static73.method1258();
		Static123.method2072();
		if (Static77.anInt1930 != 0) {
			Static95.anInt2879 += 20;
			if (Static95.anInt2879 >= 400) {
				Static77.anInt1930 = 0;
			}
		}
		Static107.anInt2687++;
		if (Static91.anInt2127 != 0) {
			Static62.anInt2923++;
			if (Static62.anInt2923 >= 15) {
				if (Static91.anInt2127 == 2) {
					Static35.aBoolean96 = true;
				}
				if (Static91.anInt2127 == 3) {
					Static113.aBoolean226 = true;
				}
				Static91.anInt2127 = 0;
			}
		}
		if (Static77.anInt1932 != 0) {
			Static32.anInt692++;
			if (Static65.anInt1718 + 5 < Static29.anInt971 || Static29.anInt971 < Static65.anInt1718 - 5 || Static3.anInt150 > Static8.anInt426 + 5 || Static8.anInt426 - 5 > Static3.anInt150) {
				Static28.aBoolean205 = true;
			}
			if (Static85.anInt2030 == 0) {
				if (Static77.anInt1932 == 3) {
					Static113.aBoolean226 = true;
				}
				if (Static77.anInt1932 == 2) {
					Static35.aBoolean96 = true;
				}
				Static77.anInt1932 = 0;
				if (Static28.aBoolean205 && Static32.anInt692 >= 5) {
					Static121.anInt2966 = -1;
					Static71.method1241();
					if (Static98.anInt2391 == Static121.anInt2966 && Static26.anInt901 != Static57.anInt1549) {
						@Pc(734) Class1_Sub1_Sub1 local734 = Static41.method2106(Static98.anInt2391);
						@Pc(736) byte local736 = 0;
						if (Static21.anInt737 == 1 && local734.anInt93 == 206) {
							local736 = 1;
						}
						if (local734.anIntArray9[Static26.anInt901] <= 0) {
							local736 = 0;
						}
						if (Static128.method2206(Static129.method2213(local734))) {
							local124 = Static57.anInt1549;
							local117 = Static26.anInt901;
							local734.anIntArray9[local117] = local734.anIntArray9[local124];
							local734.anIntArray14[local117] = local734.anIntArray14[local124];
							local734.anIntArray9[local124] = -1;
							local734.anIntArray14[local124] = 0;
						} else if (local736 == 1) {
							local124 = Static57.anInt1549;
							local117 = Static26.anInt901;
							while (local124 != local117) {
								if (local124 > local117) {
									local734.method41(local124, local124 - 1);
									local124--;
								} else if (local117 > local124) {
									local734.method41(local124, local124 + 1);
									local124++;
								}
							}
						} else {
							local734.method41(Static57.anInt1549, Static26.anInt901);
						}
						Static103.aClass1_Sub18_Sub1_5.method2203(246);
						Static103.aClass1_Sub18_Sub1_5.method2144(Static98.anInt2391);
						Static103.aClass1_Sub18_Sub1_5.method2159(Static57.anInt1549);
						Static103.aClass1_Sub18_Sub1_5.method2159(Static26.anInt901);
						Static103.aClass1_Sub18_Sub1_5.method2183(local736);
					}
				} else if ((Static98.anInt2389 == 1 || Static119.method2050(Static110.anInt2795 - 1)) && Static110.anInt2795 > 2) {
					Static23.method447();
				} else if (Static110.anInt2795 > 0) {
					Static98.method1723(Static110.anInt2795 - 1);
				}
				Static62.anInt2923 = 10;
				Static91.anInt2130 = 0;
			}
		}
		if (Static72.anInt1798 == -1) {
			if (Static48.anInt1318 != -1) {
				Static12.method274(0, 338, Static48.anInt1318, 34, 4, 4, 516);
			} else if (Static1.anInt90 != -1) {
				Static12.method274(0, 338, Static1.anInt90, 34, 4, 4, 516);
			}
			if (Static91.anInt2131 != -1) {
				Static12.method274(1, 466, Static91.anInt2131, 34, 205, 553, 743);
			} else if (Static23.anIntArray117[Static120.anInt3073] != -1) {
				Static12.method274(1, 466, Static23.anIntArray117[Static120.anInt3073], 34, 205, 553, 743);
			}
			if (Static110.anInt2786 != -1) {
				Static12.method274(2, 453, Static110.anInt2786, 34, 357, 17, 496);
			} else if (Static9.anInt2991 != -1) {
				Static12.method274(2, 453, Static9.anInt2991, 34, 357, 17, 496);
			}
		} else {
			Static12.method274(3, 503, Static72.anInt1798, 34, 0, 0, 765);
			if (Static16.anInt2474 != -1) {
				Static12.method274(3, 503, Static16.anInt2474, 34, 0, 0, 765);
			}
		}
		if (Static72.anInt1798 == -1) {
			if (Static48.anInt1318 != -1) {
				Static12.method274(0, 338, Static48.anInt1318, -35, 4, 4, 516);
			} else if (Static1.anInt90 != -1) {
				Static12.method274(0, 338, Static1.anInt90, -35, 4, 4, 516);
			}
			if (Static91.anInt2131 != -1) {
				Static12.method274(1, 466, Static91.anInt2131, -35, 205, 553, 743);
			} else if (Static23.anIntArray117[Static120.anInt3073] != -1) {
				Static12.method274(1, 466, Static23.anIntArray117[Static120.anInt3073], -35, 205, 553, 743);
			}
			if (Static110.anInt2786 != -1) {
				Static12.method274(2, 453, Static110.anInt2786, -35, 357, 17, 496);
			} else if (Static9.anInt2991 != -1) {
				Static12.method274(2, 453, Static9.anInt2991, -35, 357, 17, 496);
			}
		} else {
			Static12.method274(3, 503, Static72.anInt1798, -35, 0, 0, 765);
			if (Static16.anInt2474 != -1) {
				Static12.method274(3, 503, Static16.anInt2474, -35, 0, 0, 765);
			}
		}
		Static26.method516();
		@Pc(1130) int local1130;
		if (Static7.anInt202 != -1) {
			local124 = Static7.anInt209;
			local1130 = Static7.anInt202;
			@Pc(1150) boolean local1150 = Static45.method792(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], 0, 0, 0, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], 0, local1130, local124, 0, 0, true);
			Static7.anInt202 = -1;
			if (local1150) {
				Static77.anInt1930 = 1;
				Static104.anInt2644 = Static89.anInt2109;
				Static95.anInt2879 = 0;
				Static66.anInt1726 = Static38.anInt1157;
			}
		}
		if (Static91.anInt2130 == 1 && Static122.aClass39_1434 != null) {
			Static122.aClass39_1434 = null;
			Static113.aBoolean226 = true;
			Static91.anInt2130 = 0;
		}
		Static128.method2204();
		if (Static72.anInt1798 == -1) {
			Static58.method1032();
			Static108.method1911();
			Static13.method285();
		}
		if (Static85.anInt2030 == 1 || Static91.anInt2130 == 1) {
			Static69.anInt1769++;
		}
		if (Static114.anInt2847 == -1 && Static23.anInt813 == -1 && Static101.anInt2575 == -1) {
			if (Static16.anInt2472 > 0) {
				Static16.anInt2472--;
			}
		} else if (Static16.anInt2472 < Static26.anInt895) {
			Static16.anInt2472++;
			if (Static16.anInt2472 == Static26.anInt895) {
				if (Static23.anInt813 != -1) {
					Static35.aBoolean96 = true;
				}
				if (Static114.anInt2847 != -1) {
					Static113.aBoolean226 = true;
				}
			}
		}
		Static38.method689();
		if (Static29.aBoolean86) {
			Static26.method522();
		}
		for (local1130 = 0; local1130 < 5; local1130++) {
			@Pc(1257) int local1257 = Static55.anIntArray213[local1130]++;
		}
		Static110.method1941();
		local124 = Static100.method1806();
		local117 = Static51.method883();
		if (local124 > 4500 && local117 > 4500) {
			Static100.anInt2556 = 250;
			Static69.method1222(4000);
			Static103.aClass1_Sub18_Sub1_5.method2203(10);
		}
		Static1.anInt113++;
		Static104.anInt2639++;
		Static63.anInt1659++;
		if (Static63.anInt1659 > 500) {
			Static63.anInt1659 = 0;
			local126 = (int) (Math.random() * 8.0D);
			if ((local126 & 0x4) == 4) {
				Static103.anInt2618 += Static73.anInt1817;
			}
			if ((local126 & 0x1) == 1) {
				Static35.anInt1068 += Static53.anInt1463;
			}
			if ((local126 & 0x2) == 2) {
				Static53.anInt1466 += Static52.anInt1453;
			}
		}
		if (Static1.anInt113 > 500) {
			Static1.anInt113 = 0;
			local126 = (int) (Math.random() * 8.0D);
			if ((local126 & 0x1) == 1) {
				Static75.anInt1879 += Static14.anInt551;
			}
			if ((local126 & 0x2) == 2) {
				Static39.anInt1165 += Static65.anInt1719;
			}
		}
		if (Static35.anInt1068 < -50) {
			Static53.anInt1463 = 2;
		}
		if (Static75.anInt1879 < -60) {
			Static14.anInt551 = 2;
		}
		if (Static103.anInt2618 < -40) {
			Static73.anInt1817 = 1;
		}
		if (Static53.anInt1466 < -55) {
			Static52.anInt1453 = 2;
		}
		if (Static75.anInt1879 > 60) {
			Static14.anInt551 = -2;
		}
		if (Static103.anInt2618 > 40) {
			Static73.anInt1817 = -1;
		}
		if (Static35.anInt1068 > 50) {
			Static53.anInt1463 = -2;
		}
		if (Static39.anInt1165 < -20) {
			Static65.anInt1719 = 1;
		}
		if (Static53.anInt1466 > 55) {
			Static52.anInt1453 = -2;
		}
		if (Static39.anInt1165 > 10) {
			Static65.anInt1719 = -1;
		}
		if (Static104.anInt2639 > 50) {
			Static103.aClass1_Sub18_Sub1_5.method2203(150);
		}
		try {
			if (Static29.aClass74_1 != null && Static103.aClass1_Sub18_Sub1_5.anInt3078 > 0) {
				Static29.aClass74_1.method2055(Static103.aClass1_Sub18_Sub1_5.aByteArray96, Static103.aClass1_Sub18_Sub1_5.anInt3078);
				Static104.anInt2639 = 0;
				Static103.aClass1_Sub18_Sub1_5.anInt3078 = 0;
			}
		} catch (@Pc(1468) IOException local1468) {
			Static67.method1198();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1232() {
		aClass39_876 = null;
		aClass33_26 = null;
		aClass1_Sub1_Sub4_Sub1_33 = null;
		aClass39_874 = null;
		aClass39_875 = null;
		aClass39_878 = null;
		aClass39_873 = null;
		aClass70_8 = null;
		aClass39_877 = null;
		aClass1_Sub1_Sub4_Sub1Array7 = null;
	}
}
