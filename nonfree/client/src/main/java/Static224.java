import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Lclient!vf;")
	public static Class1_Sub1_Sub8 aClass1_Sub1_Sub8_2;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_28 = Static186.method3527("Standort");

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!oj;")
	public static Class84 aClass84_6 = new Class84(500);

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_29 = Static186.method3527("(U0a )2 in: ");

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_30 = Static186.method3527("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method66() {
		if (Static2.anInt52 == 0) {
			return;
		}
		try {
			if (++Static12.anInt241 > 2000) {
				if (Static33.aClass26_2 != null) {
					Static33.aClass26_2.method776();
					Static33.aClass26_2 = null;
				}
				if (Static109.anInt2170 >= 1) {
					Static151.anInt3156 = -5;
					Static2.anInt52 = 0;
					return;
				}
				Static2.anInt52 = 1;
				if (Static14.anInt261 == Static8.anInt192) {
					Static14.anInt261 = Static8.anInt188;
				} else {
					Static14.anInt261 = Static8.anInt192;
				}
				Static12.anInt241 = 0;
				Static109.anInt2170++;
			}
			if (Static2.anInt52 == 1) {
				Static153.aClass116_4 = Static4.aClass87_1.method2686(Static14.anInt261, Static20.aString1);
				Static2.anInt52 = 2;
			}
			@Pc(129) int local129;
			if (Static2.anInt52 == 2) {
				if (Static153.aClass116_4.anInt4156 == 2) {
					throw new IOException();
				}
				if (Static153.aClass116_4.anInt4156 != 1) {
					return;
				}
				Static33.aClass26_2 = new Class26((Socket) Static153.aClass116_4.anObject5, Static4.aClass87_1);
				Static153.aClass116_4 = null;
				Static33.aClass26_2.method781(Static32.aClass1_Sub17_Sub1_1.aByteArray40, Static32.aClass1_Sub17_Sub1_1.anInt2656);
				if (Static58.aClass48_1 != null) {
					Static58.aClass48_1.method3221();
				}
				if (Static132.aClass48_2 != null) {
					Static132.aClass48_2.method3221();
				}
				local129 = Static33.aClass26_2.method782();
				if (Static58.aClass48_1 != null) {
					Static58.aClass48_1.method3221();
				}
				if (Static132.aClass48_2 != null) {
					Static132.aClass48_2.method3221();
				}
				if (local129 != 21) {
					Static2.anInt52 = 0;
					Static151.anInt3156 = local129;
					Static33.aClass26_2.method776();
					Static33.aClass26_2 = null;
					return;
				}
				Static2.anInt52 = 3;
			}
			if (Static2.anInt52 == 3) {
				if (Static33.aClass26_2.method777() < 1) {
					return;
				}
				Static184.aClass50Array71 = new Class50[Static33.aClass26_2.method782()];
				Static2.anInt52 = 4;
			}
			if (Static2.anInt52 == 4 && Static33.aClass26_2.method777() >= Static184.aClass50Array71.length * 8) {
				Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
				Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, Static184.aClass50Array71.length * 8, 0);
				for (local129 = 0; local129 < Static184.aClass50Array71.length; local129++) {
					Static184.aClass50Array71[local129] = Static130.method2183(Static97.aClass1_Sub17_Sub1_2.method2172());
				}
				Static2.anInt52 = 0;
				Static151.anInt3156 = 21;
				Static33.aClass26_2.method776();
				Static33.aClass26_2 = null;
			}
		} catch (@Pc(229) IOException local229) {
			if (Static33.aClass26_2 != null) {
				Static33.aClass26_2.method776();
				Static33.aClass26_2 = null;
			}
			if (Static109.anInt2170 < 1) {
				Static2.anInt52 = 1;
				Static12.anInt241 = 0;
				if (Static8.anInt192 == Static14.anInt261) {
					Static14.anInt261 = Static8.anInt188;
				} else {
					Static14.anInt261 = Static8.anInt192;
				}
				Static109.anInt2170++;
			} else {
				Static151.anInt3156 = -4;
				Static2.anInt52 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	public static void method67(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static9.anIntArray21[arg0];
		@Pc(17) int local17 = Static66.anIntArray109[arg0];
		@Pc(21) int local21 = Static27.aShortArray4[arg0];
		@Pc(25) long local25 = Static225.aLongArray9[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(36) int local36 = (int) Static225.aLongArray9[arg0];
		if (local21 == 12) {
			Static32.aClass1_Sub17_Sub1_1.method2182(63);
			Static32.aClass1_Sub17_Sub1_1.method2144(local17);
			Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			Static32.aClass1_Sub17_Sub1_1.method2166(local13);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 58 && Static199.aClass93_112 == null) {
			Static190.method3124(local13, local17);
			Static199.aClass93_112 = Static186.method3524(local13, local17);
			Static66.method999(Static199.aClass93_112);
		}
		if (local21 == 42) {
			Static32.aClass1_Sub17_Sub1_1.method2182(153);
			Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			Static32.aClass1_Sub17_Sub1_1.method2166(local13);
			Static32.aClass1_Sub17_Sub1_1.method2144(local17);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 37) {
			Static32.aClass1_Sub17_Sub1_1.method2182(254);
			Static32.aClass1_Sub17_Sub1_1.method2136(local13);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			Static32.aClass1_Sub17_Sub1_1.method2160(local17);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 45) {
			Static63.method969(Static212.anInt4195, local13, local17);
		}
		@Pc(166) Class20_Sub3_Sub1 local166;
		if (local21 == 5) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static169.anInt3448 = 2;
				Static52.anInt3318 = Static163.anInt3374;
				Static198.anInt3992 = 0;
				Static144.anInt2938 = Static70.anInt1323;
				Static32.aClass1_Sub17_Sub1_1.method2182(233);
				Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			}
		}
		@Pc(245) boolean local245;
		if (local21 == 6) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static169.anInt3448 = 2;
			Static198.anInt3992 = 0;
			Static52.anInt3318 = Static163.anInt3374;
			Static144.anInt2938 = Static70.anInt1323;
			Static32.aClass1_Sub17_Sub1_1.method2182(177);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static91.anInt4078 + local13);
			Static32.aClass1_Sub17_Sub1_1.method2166(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
		}
		@Pc(306) Class93 local306;
		if (local21 == 1004) {
			local306 = Static164.method2725(local17);
			if (local306 == null || local306.anIntArray401[local13] < 100000) {
				Static32.aClass1_Sub17_Sub1_1.method2182(175);
				Static32.aClass1_Sub17_Sub1_1.method2166(local36);
			} else {
				Static123.method1275(Static17.method257(new Class50[] { Static160.method2684(local306.anIntArray401[local13]), Static93.aClass50_596, Static16.method227(local36).aClass50_833 }), Static7.aClass50_69, 0);
			}
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 1) {
			Static116.method1855(local17, local25, local13);
			Static32.aClass1_Sub17_Sub1_1.method2182(88);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static101.anInt2041 + local17);
			Static32.aClass1_Sub17_Sub1_1.method2166(local13 + Static91.anInt4078);
			Static32.aClass1_Sub17_Sub1_1.method2154((int) (local25 >>> 32) & Integer.MAX_VALUE);
		}
		if (local21 == 30) {
			Static32.aClass1_Sub17_Sub1_1.method2182(37);
			Static32.aClass1_Sub17_Sub1_1.method2151(local13);
			Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			Static32.aClass1_Sub17_Sub1_1.method2144(local17);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 3) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static169.anInt3448 = 2;
				Static144.anInt2938 = Static70.anInt1323;
				Static32.aClass1_Sub17_Sub1_1.method2182(134);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			}
		}
		if (local21 == 49) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static169.anInt3448 = 2;
				Static144.anInt2938 = Static70.anInt1323;
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static32.aClass1_Sub17_Sub1_1.method2182(178);
				Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			}
		}
		if (local21 == 50 && Static116.method1855(local17, local25, local13)) {
			Static32.aClass1_Sub17_Sub1_1.method2182(0);
			Static32.aClass1_Sub17_Sub1_1.method2136(Static101.anInt2041 + local17);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static169.anInt3444);
			Static32.aClass1_Sub17_Sub1_1.method2154(local13 + Static91.anInt4078);
			Static32.aClass1_Sub17_Sub1_1.method2154(Integer.MAX_VALUE & (int) (local25 >>> 32));
			Static32.aClass1_Sub17_Sub1_1.method2144(Static138.anInt2812);
		}
		if (local21 == 17) {
			Static195.method3169();
			local306 = Static164.method2725(local17);
			Static99.anInt4483 = local36;
			Static165.anInt2639 = local13;
			Static110.anInt2200 = local17;
			Static123.anInt1750 = 1;
			Static66.method999(local306);
			Static234.aClass50_1437 = Static17.method257(new Class50[] { Static80.aClass50_529, Static16.method227(local36).aClass50_833, Static25.aClass50_197 });
			if (Static234.aClass50_1437 == null) {
				Static234.aClass50_1437 = Static216.aClass50_1347;
			}
			return;
		}
		if (local21 == 51) {
			Static32.aClass1_Sub17_Sub1_1.method2182(78);
			Static32.aClass1_Sub17_Sub1_1.method2151(local13);
			Static32.aClass1_Sub17_Sub1_1.method2173(local17);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 8) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static52.anInt3318 = Static163.anInt3374;
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static198.anInt3992 = 0;
			Static32.aClass1_Sub17_Sub1_1.method2182(57);
			Static32.aClass1_Sub17_Sub1_1.method2173(Static138.anInt2812);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static169.anInt3444);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			Static32.aClass1_Sub17_Sub1_1.method2154(local13 + Static91.anInt4078);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static101.anInt2041 + local17);
		}
		if (local21 == 21) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static144.anInt2938 = Static70.anInt1323;
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static169.anInt3448 = 2;
				Static32.aClass1_Sub17_Sub1_1.method2182(226);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			}
		}
		if (local21 == 15 && Static116.method1855(local17, local25, local13)) {
			Static32.aClass1_Sub17_Sub1_1.method2182(182);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static91.anInt4078 + local13);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static165.anInt2639);
			Static32.aClass1_Sub17_Sub1_1.method2166(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2136(Integer.MAX_VALUE & (int) (local25 >>> 32));
			Static32.aClass1_Sub17_Sub1_1.method2160(Static110.anInt2200);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static99.anInt4483);
		}
		if (local21 == 9) {
			Static32.aClass1_Sub17_Sub1_1.method2182(238);
			Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			Static32.aClass1_Sub17_Sub1_1.method2173(local17);
			Static32.aClass1_Sub17_Sub1_1.method2151(local13);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		@Pc(945) Class20_Sub3_Sub2 local945;
		if (local21 == 29) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static169.anInt3448 = 2;
				Static52.anInt3318 = Static163.anInt3374;
				Static144.anInt2938 = Static70.anInt1323;
				Static198.anInt3992 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2182(170);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
				Static32.aClass1_Sub17_Sub1_1.method2160(Static110.anInt2200);
				Static32.aClass1_Sub17_Sub1_1.method2136(Static165.anInt2639);
				Static32.aClass1_Sub17_Sub1_1.method2151(Static99.anInt4483);
			}
		}
		if (local21 == 39) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static144.anInt2938 = Static70.anInt1323;
				Static169.anInt3448 = 2;
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static32.aClass1_Sub17_Sub1_1.method2182(187);
				Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			}
		}
		if (local21 == 2) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static198.anInt3992 = 0;
			Static52.anInt3318 = Static163.anInt3374;
			Static169.anInt3448 = 2;
			Static144.anInt2938 = Static70.anInt1323;
			Static32.aClass1_Sub17_Sub1_1.method2182(202);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static91.anInt4078 + local13);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static101.anInt2041 + local17);
		}
		if (local21 == 44) {
			Static32.aClass1_Sub17_Sub1_1.method2182(98);
			Static32.aClass1_Sub17_Sub1_1.method2144(local17);
			Static32.aClass1_Sub17_Sub1_1.method2136(local13);
			Static32.aClass1_Sub17_Sub1_1.method2124(Static138.anInt2812);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static169.anInt3444);
		}
		if (local21 == 57) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static144.anInt2938 = Static70.anInt1323;
				Static169.anInt3448 = 2;
				Static52.anInt3318 = Static163.anInt3374;
				Static198.anInt3992 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2182(114);
				Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			}
		}
		if (local21 == 34) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static52.anInt3318 = Static163.anInt3374;
			Static198.anInt3992 = 0;
			Static32.aClass1_Sub17_Sub1_1.method2182(6);
			Static32.aClass1_Sub17_Sub1_1.method2154(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static91.anInt4078 + local13);
		}
		@Pc(1353) int local1353;
		if (local21 == 16) {
			Static32.aClass1_Sub17_Sub1_1.method2182(130);
			Static32.aClass1_Sub17_Sub1_1.method2124(local17);
			local306 = Static164.method2725(local17);
			if (local306.anIntArrayArray26 != null && local306.anIntArrayArray26[0][0] == 5) {
				local1353 = local306.anIntArrayArray26[0][1];
				Static24.anIntArray49[local1353] = 1 - Static24.anIntArray49[local1353];
				Static203.method543(local1353);
			}
		}
		if (local21 == 23) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static144.anInt2938 = Static70.anInt1323;
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static169.anInt3448 = 2;
				Static32.aClass1_Sub17_Sub1_1.method2182(10);
				Static32.aClass1_Sub17_Sub1_1.method2166(local36);
			}
		}
		if (local21 == 1001) {
			Static169.anInt3448 = 2;
			Static52.anInt3318 = Static163.anInt3374;
			Static198.anInt3992 = 0;
			Static144.anInt2938 = Static70.anInt1323;
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				@Pc(1446) Class105 local1446 = local945.aClass105_1;
				if (local1446.anIntArray443 != null) {
					local1446 = local1446.method3127();
				}
				if (local1446 != null) {
					Static32.aClass1_Sub17_Sub1_1.method2182(184);
					Static32.aClass1_Sub17_Sub1_1.method2136(local1446.anInt3917);
				}
			}
		}
		if (local21 == 24) {
			Static32.aClass1_Sub17_Sub1_1.method2182(41);
			Static32.aClass1_Sub17_Sub1_1.method2166(local13);
			Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			Static32.aClass1_Sub17_Sub1_1.method2160(Static138.anInt2812);
			Static32.aClass1_Sub17_Sub1_1.method2173(local17);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static169.anInt3444);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 1002) {
			Static116.method1855(local17, local25, local13);
			Static32.aClass1_Sub17_Sub1_1.method2182(132);
			Static32.aClass1_Sub17_Sub1_1.method2151(Integer.MAX_VALUE & (int) (local25 >>> 32));
			Static32.aClass1_Sub17_Sub1_1.method2136(local13 + Static91.anInt4078);
			Static32.aClass1_Sub17_Sub1_1.method2154(local17 + Static101.anInt2041);
		}
		if (local21 == 38) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static169.anInt3448 = 2;
				Static144.anInt2938 = Static70.anInt1323;
				Static32.aClass1_Sub17_Sub1_1.method2182(128);
				Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			}
		}
		if (local21 == 43) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static52.anInt3318 = Static163.anInt3374;
				Static169.anInt3448 = 2;
				Static144.anInt2938 = Static70.anInt1323;
				Static198.anInt3992 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2182(220);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			}
		}
		if (local21 == 14) {
			Static32.aClass1_Sub17_Sub1_1.method2182(28);
			Static32.aClass1_Sub17_Sub1_1.method2166(local13);
			Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			Static32.aClass1_Sub17_Sub1_1.method2124(local17);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 10) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static144.anInt2938 = Static70.anInt1323;
				Static198.anInt3992 = 0;
				Static169.anInt3448 = 2;
				Static52.anInt3318 = Static163.anInt3374;
				Static32.aClass1_Sub17_Sub1_1.method2182(47);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			}
		}
		if (local21 == 1005) {
			Static198.anInt3992 = 0;
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static52.anInt3318 = Static163.anInt3374;
			Static32.aClass1_Sub17_Sub1_1.method2182(175);
			Static32.aClass1_Sub17_Sub1_1.method2166(local36);
		}
		if (local21 == 32) {
			Static116.method1855(local17, local25, local13);
			Static32.aClass1_Sub17_Sub1_1.method2182(122);
			Static32.aClass1_Sub17_Sub1_1.method2151(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2151((int) (local25 >>> 32) & Integer.MAX_VALUE);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static91.anInt4078 + local13);
		}
		if (local21 == 33) {
			Static95.method1498();
		}
		if (local21 == 26) {
			Static32.aClass1_Sub17_Sub1_1.method2182(130);
			Static32.aClass1_Sub17_Sub1_1.method2124(local17);
			local306 = Static164.method2725(local17);
			if (local306.anIntArrayArray26 != null && local306.anIntArrayArray26[0][0] == 5) {
				local1353 = local306.anIntArrayArray26[0][1];
				if (Static24.anIntArray49[local1353] != local306.anIntArray399[0]) {
					Static24.anIntArray49[local1353] = local306.anIntArray399[0];
					Static203.method543(local1353);
				}
			}
		}
		if (local21 == 48) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static52.anInt3318 = Static163.anInt3374;
				Static198.anInt3992 = 0;
				Static169.anInt3448 = 2;
				Static144.anInt2938 = Static70.anInt1323;
				Static32.aClass1_Sub17_Sub1_1.method2182(142);
				Static32.aClass1_Sub17_Sub1_1.method2173(Static110.anInt2200);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
				Static32.aClass1_Sub17_Sub1_1.method2136(Static99.anInt4483);
				Static32.aClass1_Sub17_Sub1_1.method2136(Static165.anInt2639);
			}
		}
		if (local21 == 25) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static169.anInt3448 = 2;
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static144.anInt2938 = Static70.anInt1323;
				Static32.aClass1_Sub17_Sub1_1.method2182(121);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			}
		}
		if (local21 == 7) {
			Static32.aClass1_Sub17_Sub1_1.method2182(58);
			Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static99.anInt4483);
			Static32.aClass1_Sub17_Sub1_1.method2166(local13);
			Static32.aClass1_Sub17_Sub1_1.method2160(local17);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static165.anInt2639);
			Static32.aClass1_Sub17_Sub1_1.method2144(Static110.anInt2200);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 40) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static52.anInt3318 = Static163.anInt3374;
			Static198.anInt3992 = 0;
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static32.aClass1_Sub17_Sub1_1.method2182(203);
			Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			Static32.aClass1_Sub17_Sub1_1.method2136(Static101.anInt2041 + local17);
			Static32.aClass1_Sub17_Sub1_1.method2166(Static91.anInt4078 + local13);
		}
		if (local21 == 20) {
			Static32.aClass1_Sub17_Sub1_1.method2182(59);
			Static32.aClass1_Sub17_Sub1_1.method2160(local17);
			Static32.aClass1_Sub17_Sub1_1.method2136(local13);
			Static32.aClass1_Sub17_Sub1_1.method2166(local36);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 1003) {
			Static198.anInt3992 = 0;
			Static52.anInt3318 = Static163.anInt3374;
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static32.aClass1_Sub17_Sub1_1.method2182(117);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
		}
		if (local21 == 22) {
			Static116.method1855(local17, local25, local13);
			Static32.aClass1_Sub17_Sub1_1.method2182(136);
			Static32.aClass1_Sub17_Sub1_1.method2151(Integer.MAX_VALUE & (int) (local25 >>> 32));
			Static32.aClass1_Sub17_Sub1_1.method2136(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2151(local13 + Static91.anInt4078);
		}
		if (local21 == 28) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static144.anInt2938 = Static70.anInt1323;
				Static52.anInt3318 = Static163.anInt3374;
				Static169.anInt3448 = 2;
				Static198.anInt3992 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2182(163);
				Static32.aClass1_Sub17_Sub1_1.method2144(Static138.anInt2812);
				Static32.aClass1_Sub17_Sub1_1.method2136(Static169.anInt3444);
				Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			}
		}
		if (local21 == 36) {
			Static32.aClass1_Sub17_Sub1_1.method2182(133);
			Static32.aClass1_Sub17_Sub1_1.method2151(local13);
			Static32.aClass1_Sub17_Sub1_1.method2124(local17);
			Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 19 || local21 == 1007) {
			Static4.method71(local13, local36, local17, Static211.aClass50Array80[arg0]);
		}
		if (local21 == 41) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static52.anInt3318 = Static163.anInt3374;
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static198.anInt3992 = 0;
			Static32.aClass1_Sub17_Sub1_1.method2182(236);
			Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			Static32.aClass1_Sub17_Sub1_1.method2166(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static91.anInt4078 + local13);
		}
		if (local21 == 13) {
			local166 = Static232.aClass20_Sub3_Sub1Array1[local36];
			if (local166 != null) {
				Static233.method3515(local166.anIntArray311[0], 2, 1, 0, 1, local166.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static52.anInt3318 = Static163.anInt3374;
				Static198.anInt3992 = 0;
				Static169.anInt3448 = 2;
				Static144.anInt2938 = Static70.anInt1323;
				Static32.aClass1_Sub17_Sub1_1.method2182(252);
				Static32.aClass1_Sub17_Sub1_1.method2154(Static169.anInt3444);
				Static32.aClass1_Sub17_Sub1_1.method2160(Static138.anInt2812);
				Static32.aClass1_Sub17_Sub1_1.method2151(local36);
			}
		}
		if (local21 == 11) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static52.anInt3318 = Static163.anInt3374;
				Static144.anInt2938 = Static70.anInt1323;
				Static169.anInt3448 = 2;
				Static198.anInt3992 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2182(115);
				Static32.aClass1_Sub17_Sub1_1.method2154(local36);
			}
		}
		if (local21 == 35) {
			Static116.method1855(local17, local25, local13);
			Static32.aClass1_Sub17_Sub1_1.method2182(11);
			Static32.aClass1_Sub17_Sub1_1.method2154(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2154(local13 + Static91.anInt4078);
			Static32.aClass1_Sub17_Sub1_1.method2136(Integer.MAX_VALUE & (int) (local25 >>> 32));
		}
		if (local21 == 31) {
			Static32.aClass1_Sub17_Sub1_1.method2182(35);
			Static32.aClass1_Sub17_Sub1_1.method2136(local13);
			Static32.aClass1_Sub17_Sub1_1.method2166(local36);
			Static32.aClass1_Sub17_Sub1_1.method2173(local17);
			Static151.anInt3155 = 0;
			Static66.aClass93_44 = Static164.method2725(local17);
			Static182.anInt3776 = local13;
		}
		if (local21 == 46) {
			local945 = Static78.aClass20_Sub3_Sub2Array1[local36];
			if (local945 != null) {
				Static233.method3515(local945.anIntArray311[0], 2, 1, 0, 1, local945.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				Static198.anInt3992 = 0;
				Static52.anInt3318 = Static163.anInt3374;
				Static144.anInt2938 = Static70.anInt1323;
				Static169.anInt3448 = 2;
				Static32.aClass1_Sub17_Sub1_1.method2182(32);
				Static32.aClass1_Sub17_Sub1_1.method2136(local36);
			}
		}
		if (local21 == 47) {
			local306 = Static186.method3524(local13, local17);
			if (local306 != null) {
				Static195.method3169();
				Static190.method3125(local17, Static170.method2810(Static35.method552(local306)), local13);
				Static123.anInt1750 = 0;
				Static148.aClass50_1016 = Static197.method3491(local306);
				if (Static148.aClass50_1016 == null) {
					Static148.aClass50_1016 = Static132.aClass50_925;
				}
				if (local306.aBoolean156) {
					Static191.aClass50_1261 = Static17.method257(new Class50[] { local306.aClass50_1197, Static25.aClass50_197 });
					return;
				}
				Static191.aClass50_1261 = Static17.method257(new Class50[] { Static104.aClass50_675, local306.aClass50_1194, Static25.aClass50_197 });
			}
			return;
		}
		if (local21 == 4) {
			local306 = Static164.method2725(local17);
			@Pc(2777) boolean local2777 = true;
			if (local306.anInt3618 > 0) {
				local2777 = Static41.method649(local306);
			}
			if (local2777) {
				Static32.aClass1_Sub17_Sub1_1.method2182(130);
				Static32.aClass1_Sub17_Sub1_1.method2124(local17);
			}
		}
		if (local21 == 18) {
			local245 = Static233.method3515(local13, 2, 0, 0, 0, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			if (!local245) {
				Static233.method3515(local13, 2, 1, 0, 1, local17, false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
			}
			Static144.anInt2938 = Static70.anInt1323;
			Static169.anInt3448 = 2;
			Static198.anInt3992 = 0;
			Static52.anInt3318 = Static163.anInt3374;
			Static32.aClass1_Sub17_Sub1_1.method2182(104);
			Static32.aClass1_Sub17_Sub1_1.method2154(Static91.anInt4078 + local13);
			Static32.aClass1_Sub17_Sub1_1.method2136(Static99.anInt4483);
			Static32.aClass1_Sub17_Sub1_1.method2154(local17 + Static101.anInt2041);
			Static32.aClass1_Sub17_Sub1_1.method2124(Static110.anInt2200);
			Static32.aClass1_Sub17_Sub1_1.method2166(local36);
			Static32.aClass1_Sub17_Sub1_1.method2136(Static165.anInt2639);
		}
		if (Static123.anInt1750 != 0) {
			Static123.anInt1750 = 0;
			Static66.method999(Static164.method2725(Static110.anInt2200));
		}
		if (Static234.aBoolean218) {
			Static195.method3169();
		}
		if (Static66.aClass93_44 != null && Static151.anInt3155 == 0) {
			Static66.method999(Static66.aClass93_44);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method68(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class91 local7 = Static181.method2968(arg1);
		@Pc(10) int local10 = local7.anInt3507;
		@Pc(13) int local13 = local7.anInt3503;
		@Pc(16) int local16 = local7.anInt3510;
		@Pc(23) int local23 = Class1_Sub1_Sub4.anIntArray42[local16 - local10];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local10;
		Static70.method1018(local13, ~local23 & Static66.anIntArray108[local13] | local23 & arg0 << local10);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	public static void method70(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class64[] local7 = Static229.aClass64Array1;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class64 local20 = local7[local14];
			if (local20 != null && local20.anInt2222 == 2) {
				Static40.method647(arg1 >> 1, local20.anInt2219 * 2, local20.anInt2218 + (local20.anInt2214 - Static101.anInt2041 << 7), arg0 >> 1, local20.anInt2220 + (local20.anInt2224 - Static91.anInt4078 << 7));
				if (Static165.anInt2637 > -1 && Static107.anInt2132 % 20 < 10) {
					Static14.aClass1_Sub1_Sub8Array1[local20.anInt2213].method2417(Static165.anInt2637 + arg3 - 12, arg2 - -Static226.anInt4354 - 28);
				}
			}
		}
	}
}
