import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array4;

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
	public static int anInt2116;

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "I")
	public static int anInt2122;

	@OriginalMember(owner = "client!hb", name = "Cb", descriptor = "Lclient!td;")
	public static Class71 aClass71_2;

	@OriginalMember(owner = "client!hb", name = "Kb", descriptor = "Lclient!jd;")
	public static Class11 aClass11_89;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public static int anInt2100 = 0;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_883 = Static63.method1251("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!mb;")
	public static Class45 aClass45_884 = Static63.method1251("(Z");

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "Lclient!mb;")
	public static Class45 aClass45_885 = Static63.method1251(" )2>");

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!mb;")
	public static Class45 aClass45_886 = Static63.method1251("@whi@");

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)Z")
	public static boolean method1403() {
		try {
			if (Static45.anInt1317 == 2) {
				if (Static21.aClass5_Sub8_1 == null) {
					Static21.aClass5_Sub8_1 = Static126.method785(Static47.aClass29_31, Static112.anInt2938, Static60.anInt1802);
					if (Static21.aClass5_Sub8_1 == null) {
						return false;
					}
				}
				if (Static21.aClass23_1 == null) {
					Static21.aClass23_1 = new Class23(Static120.aClass29_83, Static76.aClass29_50);
				}
				if (Static54.aClass5_Sub7_Sub4_3.method2033(Static21.aClass23_1, Static19.aClass29_12, Static21.aClass5_Sub8_1)) {
					Static54.aClass5_Sub7_Sub4_3.method2029();
					Static54.aClass5_Sub7_Sub4_3.method2032(Static51.anInt1613);
					Static54.aClass5_Sub7_Sub4_3.method2043(Static21.aClass5_Sub8_1, Static34.aBoolean48);
					Static45.anInt1317 = 0;
					Static21.aClass5_Sub8_1 = null;
					Static21.aClass23_1 = null;
					Static47.aClass29_31 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static54.aClass5_Sub7_Sub4_3.method2052();
			Static45.anInt1317 = 0;
			Static21.aClass23_1 = null;
			Static47.aClass29_31 = null;
			Static21.aClass5_Sub8_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
	public static void method1412() {
		Static104.method1900();
		Static80.aBoolean103 = true;
		Static11.method225();
		if (Static93.aBoolean116) {
			Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static78.aClass45_925, 239, 40, 0);
			Static8.aClass5_Sub2_Sub6_Sub1_1.method514(method1443(new Class45[] { Static78.aClass45_930, aClass45_884 }), 239, 60, 128);
		} else if (Static75.anInt2178 == 1) {
			Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static77.aClass45_916, 239, 40, 0);
			Static8.aClass5_Sub2_Sub6_Sub1_1.method514(method1443(new Class45[] { Static78.aClass45_923, aClass45_884 }), 239, 60, 128);
		} else if (Static75.anInt2178 == 2) {
			Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static72.aClass45_890, 239, 40, 0);
			Static8.aClass5_Sub2_Sub6_Sub1_1.method514(method1443(new Class45[] { Static78.aClass45_923, aClass45_884 }), 239, 60, 128);
		} else {
			@Pc(91) Class5_Sub2_Sub6_Sub1 local91;
			@Pc(98) int local98;
			@Pc(110) int local110;
			if (Static75.anInt2178 == 3) {
				if (Static78.aClass45_923 != Static78.aClass45_921) {
					Static7.method136(Static78.aClass45_923);
					Static78.aClass45_921 = Static78.aClass45_923;
				}
				local91 = Static78.aClass5_Sub2_Sub6_Sub1_5;
				Static118.method1869(0, 0, 463, 77);
				for (local98 = 0; local98 < Static88.anInt2502; local98++) {
					local110 = local98 * 14 + 18 - Static41.anInt2256;
					if (local110 > 0 && local110 < 110) {
						local91.method514(Static16.aClass45Array5[local98], 239, local110, 0);
					}
				}
				Static118.method1862();
				if (Static88.anInt2502 > 5) {
					Static52.method2154(77, 0, Static41.anInt2256, 463, Static88.anInt2502 * 14 + 7);
				}
				if (Static78.aClass45_923.method1317() == 0) {
					Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static105.aClass45_1210, 239, 40, 255);
				} else if (Static88.anInt2502 == 0) {
					Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static69.aClass45_847, 239, 40, 0);
				}
				local91.method514(method1443(new Class45[] { Static78.aClass45_923, aClass45_884 }), 239, 90, 0);
				Static118.method1864(0, 77, 479, 0);
			} else if (Static75.anInt2178 == 4) {
				Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static78.aClass45_928, 239, 40, 0);
				Static8.aClass5_Sub2_Sub6_Sub1_1.method514(method1443(new Class45[] { Static78.aClass45_923, aClass45_884 }), 239, 60, 128);
			} else if (Static53.aClass45_1006 == null) {
				@Pc(236) boolean local236;
				if (Static67.anInt1909 != -1) {
					local236 = Static52.method2151(96, 479, 2, Static67.anInt1909);
					if (!local236) {
						Static51.aBoolean81 = true;
					}
				} else if (Static100.anInt2693 == -1) {
					local91 = Static78.aClass5_Sub2_Sub6_Sub1_5;
					Static118.method1869(0, 0, 463, 77);
					local98 = 0;
					for (local110 = 0; local110 < 100; local110++) {
						if (Static59.aClass45Array16[local110] != null) {
							@Pc(282) int local282 = Static12.anIntArray486[local110];
							@Pc(291) int local291 = Static44.anInt1253 + 70 - local98 * 14;
							@Pc(295) Class45 local295 = Static37.aClass45Array11[local110];
							@Pc(297) byte local297 = 0;
							if (local295 != null && local295.method1302(Static60.aClass45_720)) {
								local295 = local295.method1296(5);
								local297 = 1;
							}
							if (local295 != null && local295.method1302(Static19.aClass45_285)) {
								local297 = 2;
								local295 = local295.method1296(5);
							}
							if (local282 == 0) {
								local98++;
								if (local291 > 0 && local291 < 110) {
									local91.method506(Static59.aClass45Array16[local110], 4, local291, 0);
								}
							}
							@Pc(378) int local378;
							if ((local282 == 1 || local282 == 2) && (local282 == 1 || Static71.anInt2080 == 0 || Static71.anInt2080 == 1 && Static71.method1383(local295))) {
								if (local291 > 0 && local291 < 110) {
									local378 = 4;
									if (local297 == 1) {
										Static14.aClass5_Sub2_Sub6_Sub4Array1[0].method1874(4, local291 - 12);
										local378 += 14;
									}
									if (local297 == 2) {
										Static14.aClass5_Sub2_Sub6_Sub4Array1[1].method1874(local378, local291 - 12);
										local378 += 14;
									}
									local91.method506(method1443(new Class45[] { local295, Static57.aClass45_686 }), local378, local291, 0);
									local378 += local91.method520(local295) + 8;
									local91.method506(Static59.aClass45Array16[local110], local378, local291, 255);
								}
								local98++;
							}
							if ((local282 == 3 || local282 == 7) && Static98.anInt2653 == 0 && (local282 == 7 || Static36.anInt1058 == 0 || Static36.anInt1058 == 1 && Static71.method1383(local295))) {
								if (local291 > 0 && local291 < 110) {
									local91.method506(Static73.aClass45_900, 4, local291, 0);
									local378 = local91.method520(Static73.aClass45_900) + 4;
									local378 += local91.method509(32);
									if (local297 == 1) {
										Static14.aClass5_Sub2_Sub6_Sub4Array1[0].method1874(local378, local291 - 12);
										local378 += 14;
									}
									if (local297 == 2) {
										Static14.aClass5_Sub2_Sub6_Sub4Array1[1].method1874(local378, local291 - 12);
										local378 += 14;
									}
									local91.method506(method1443(new Class45[] { local295, Static57.aClass45_686 }), local378, local291, 0);
									local378 += local91.method520(local295) + 8;
									local91.method506(Static59.aClass45Array16[local110], local378, local291, 8388608);
								}
								local98++;
							}
							if (local282 == 4 && (Static70.anInt2023 == 0 || Static70.anInt2023 == 1 && Static71.method1383(local295))) {
								if (local291 > 0 && local291 < 110) {
									local91.method506(method1443(new Class45[] { local295, Static11.aClass45_172, Static59.aClass45Array16[local110] }), 4, local291, 8388736);
								}
								local98++;
							}
							if (local282 == 5 && Static98.anInt2653 == 0 && Static36.anInt1058 < 2) {
								local98++;
								if (local291 > 0 && local291 < 110) {
									local91.method506(Static59.aClass45Array16[local110], 4, local291, 8388608);
								}
							}
							if (local282 == 6 && Static98.anInt2653 == 0 && Static36.anInt1058 < 2) {
								local98++;
								if (local291 > 0 && local291 < 110) {
									local91.method506(method1443(new Class45[] { Static112.aClass45_1289, Static11.aClass45_172, local295, Static57.aClass45_686 }), 4, local291, 0);
									local91.method506(Static59.aClass45Array16[local110], local91.method520(method1443(new Class45[] { Static112.aClass45_1289, Static11.aClass45_172, local295 })) + 12, local291, 8388608);
								}
							}
							if (local282 == 8 && (Static70.anInt2023 == 0 || Static70.anInt2023 == 1 && Static71.method1383(local295))) {
								if (local291 > 0 && local291 < 110) {
									local91.method506(method1443(new Class45[] { local295, Static11.aClass45_172, Static59.aClass45Array16[local110] }), 4, local291, 8270336);
								}
								local98++;
							}
						}
					}
					Static118.method1862();
					Static44.anInt1239 = local98 * 14 + 7;
					if (Static44.anInt1239 < 78) {
						Static44.anInt1239 = 78;
					}
					Static52.method2154(77, 0, Static44.anInt1239 - Static44.anInt1253 - 77, 463, Static44.anInt1239);
					@Pc(777) Class45 local777;
					if (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1 == null || Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass45_629 == null) {
						local777 = Static40.aClass45_518;
					} else {
						local777 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass45_629;
					}
					local91.method506(method1443(new Class45[] { local777, Static57.aClass45_686 }), 4, 90, 0);
					local91.method506(method1443(new Class45[] { Static78.aClass45_926, aClass45_884 }), local91.method520(method1443(new Class45[] { local777, Static52.aClass45_1367 })) + 6, 90, 255);
					Static118.method1864(0, 77, 479, 0);
				} else {
					local236 = Static52.method2151(96, 479, 3, Static100.anInt2693);
					if (!local236) {
						Static51.aBoolean81 = true;
					}
				}
			} else {
				Static8.aClass5_Sub2_Sub6_Sub1_1.method521(Static53.aClass45_1006, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static8.aClass5_Sub2_Sub6_Sub1_1.method514(Static30.aClass45_218, 239, 80, 128);
			}
		}
		if (Static2.aBoolean2 && Static97.anInt2635 == 2) {
			Static14.method271();
		}
		Static12.method2139();
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(II)V")
	public static void method1422(@OriginalArg(1) int arg0) {
		if (Static121.anInt2385 == arg0) {
			return;
		}
		if (Static121.anInt2385 == 0) {
			Static1.method1();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static75.anInt2182 = 0;
			Static12.anInt3113 = 0;
			Static19.anInt630 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static109.aClass7_4 != null) {
			Static109.aClass7_4.method73();
			Static109.aClass7_4 = null;
		}
		if (Static121.anInt2385 == 25 || Static121.anInt2385 == 40) {
			Static88.method1688();
			Static118.method1865();
		}
		if (Static121.anInt2385 == 25) {
			Static30.anInt470 = 0;
			Static99.anInt2658 = 1;
			Static78.anInt2217 = 0;
			Static66.anInt1898 = 1;
			Static75.anInt2183 = 0;
		}
		if (arg0 == 35) {
			Static104.method1901();
			Static8.method163();
			if (Static42.aClass11_39 == null) {
				Static42.aClass11_39 = Static55.method1154(765, 503, Static75.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static42.aClass11_39 = null;
			Static104.method1901();
			Static16.method316(Static75.aCanvas1, Static36.aClass29_Sub1_15, Static112.aClass29_Sub1_48);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static42.aClass11_39 = null;
			Static8.method163();
			Static35.method699(Static112.aClass29_Sub1_48, Static75.aCanvas1);
		}
		Static19.aBoolean26 = true;
		Static121.anInt2385 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!sd;)V")
	public static void method1429(@OriginalArg(1) Class29 arg0) {
		Static13.aClass29_10 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "(I)V")
	public static void method1438() {
		aClass45_886 = null;
		aClass11_89 = null;
		aClass45_884 = null;
		aClass71_2 = null;
		aClass5_Sub2_Sub6_Sub3Array4 = null;
		aClass45_883 = null;
		aClass45_885 = null;
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "(I)V")
	public static void method1441() {
		try {
			@Pc(12) Graphics local12 = Static75.aCanvas1.getGraphics();
			Static40.aClass11_54.method2148(local12, 553, 205);
		} catch (@Pc(20) Exception local20) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([Lclient!mb;I)Lclient!mb;")
	public static Class45 method1443(@OriginalArg(0) Class45[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static98.method1814(arg0.length, 0, arg0);
	}
}
