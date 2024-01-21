import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public static int anInt1594 = -1;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt1595 = 100;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_20 = new Class86(64);

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public static int anInt1608 = 0;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt1609 = -1;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_454 = Static81.method1507("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean81 = true;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_455 = Static81.method1507(")3)3)3");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!dj;I)V")
	public static void method1275(@OriginalArg(0) Class24 arg0) {
		if (Static76.aClass99_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class24 local13 = Static17.aClass24_131.method775(Static76.aClass99_1.anApplet1);
			@Pc(19) Class24 local19 = Static73.aClass24_542.method775(Static76.aClass99_1.anApplet1);
			@Pc(44) Class24 local44 = method1281(new Class24[] { local13, Static153.aClass24_1002, arg0, Static30.aClass24_203, local19 });
			if (arg0.method781() == 0) {
				local44 = method1281(new Class24[] { local44, Static58.aClass24_391 });
			} else {
				local44 = method1281(new Class24[] { local44, Static54.aClass24_1111, Static202.method3414(Static24.method503() + 94608000000L), Static50.aClass24_314, Static158.method2688(94608000L) });
			}
			method1281(new Class24[] { Static73.aClass24_540, local44, Static126.aClass24_835 }).method770(Static76.aClass99_1.anApplet1);
		} catch (@Pc(122) Throwable local122) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lclient!ue;IIIIIII[B)V")
	public static void method1276(@OriginalArg(0) int arg0, @OriginalArg(1) Class93[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg7 + local7 > 0 && local7 + arg7 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
					arg1[arg4].anIntArrayArray33[arg7 + local7][arg0 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(76) Class1_Sub7 local76 = new Class1_Sub7(arg8);
		for (@Pc(83) int local83 = 0; local83 < 4; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					if (local83 == arg3 && arg5 <= local87 && local87 < arg5 + 8 && local91 >= arg2 && arg2 + 8 > local91) {
						Static110.method1904(0, arg6, arg7 + Static77.method1422(arg6, local91 & 0x7, local87 & 0x7), arg0 - -Static145.method2525(local91 & 0x7, local87 & 0x7, arg6), 0, local76, arg4);
					} else {
						Static110.method1904(0, 0, -1, -1, 0, local76, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!vc;)Lclient!dj;")
	public static Class24 method1277(@OriginalArg(1) Class98 arg0) {
		if (Static31.method612(Static105.method1831(arg0)) == 0) {
			return null;
		} else if (arg0.aClass24_1263 == null || arg0.aClass24_1263.method780().method781() == 0) {
			return Static134.aBoolean140 ? Static123.aClass24_811 : null;
		} else {
			return arg0.aClass24_1263;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public static void method1279(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(11) int local11 = Static210.anIntArray412[arg0];
		@Pc(15) int local15 = Static17.anIntArray38[arg0];
		@Pc(20) int local20 = (int) Static197.aLongArray36[arg0];
		@Pc(24) long local24 = Static197.aLongArray36[arg0];
		@Pc(28) int local28 = Static98.aShortArray28[arg0];
		if (local28 >= 2000) {
			local28 -= 2000;
		}
		@Pc(43) Class98 local43;
		if (local28 == 12) {
			Static132.method2264();
			local43 = Static188.method3229(local15);
			Static115.anInt2585 = local11;
			Static118.anInt2644 = local20;
			Static150.anInt3363 = local15;
			Static36.anInt973 = 1;
			Static199.method2199(local43);
			Static129.aClass24_858 = method1281(new Class24[] { Static71.aClass24_526, Static168.method2886(local20).aClass24_1214, Static196.aClass24_1256 });
			if (Static129.aClass24_858 == null) {
				Static129.aClass24_858 = Static145.aClass24_965;
			}
			return;
		}
		if (local28 == 1) {
			Static148.method2539();
		}
		@Pc(127) int local127;
		if (local28 == 57) {
			Static176.aClass1_Sub7_Sub1_34.method2808(118);
			Static176.aClass1_Sub7_Sub1_34.method2754(local15);
			local43 = Static188.method3229(local15);
			if (local43.anIntArrayArray34 != null && local43.anIntArrayArray34[0][0] == 5) {
				local127 = local43.anIntArrayArray34[0][1];
				if (local43.anIntArray384[0] != Static122.anIntArray213[local127]) {
					Static122.anIntArray213[local127] = local43.anIntArray384[0];
					Static148.method2538(local127);
				}
			}
		}
		if (local28 == 41) {
			Static176.aClass1_Sub7_Sub1_34.method2808(194);
			Static176.aClass1_Sub7_Sub1_34.method2787(local15);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
			Static176.aClass1_Sub7_Sub1_34.method2789(local11);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 49) {
			Static176.aClass1_Sub7_Sub1_34.method2808(49);
			Static176.aClass1_Sub7_Sub1_34.method2758(local11);
			Static176.aClass1_Sub7_Sub1_34.method2762(local15);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 19) {
			Static121.method2051(local24, local11, local15);
			Static176.aClass1_Sub7_Sub1_34.method2808(88);
			Static176.aClass1_Sub7_Sub1_34.method2791(Integer.MAX_VALUE & (int) (local24 >>> 32));
			Static176.aClass1_Sub7_Sub1_34.method2791(local11 + Static196.anInt4343);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static127.anInt2789 + local15);
		}
		@Pc(269) Class5_Sub2_Sub1 local269;
		if (local28 == 48) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static79.anInt1889 = Static92.anInt2141;
				Static192.anInt4305 = Static157.anInt3462;
				Static178.anInt3964 = 0;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(253);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			}
		}
		if (local28 == 46) {
			Static176.aClass1_Sub7_Sub1_34.method2808(151);
			Static176.aClass1_Sub7_Sub1_34.method2776(Static30.anInt777);
			Static176.aClass1_Sub7_Sub1_34.method2776(local15);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static38.anInt1025);
			Static176.aClass1_Sub7_Sub1_34.method2758(local11);
		}
		@Pc(359) Class5_Sub2_Sub2 local359;
		if (local28 == 9) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static79.anInt1889 = Static92.anInt2141;
				Static178.anInt3964 = 0;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(200);
				Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			}
		}
		if (local28 == 2) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static79.anInt1889 = Static92.anInt2141;
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static178.anInt3964 = 0;
				Static176.aClass1_Sub7_Sub1_34.method2808(94);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			}
		}
		if (local28 == 15) {
			Static176.aClass1_Sub7_Sub1_34.method2808(216);
			Static176.aClass1_Sub7_Sub1_34.method2787(local15);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
			Static176.aClass1_Sub7_Sub1_34.method2789(local11);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		@Pc(520) boolean local520;
		if (local28 == 20) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static79.anInt1889 = Static92.anInt2141;
			Static1.anInt63 = 2;
			Static178.anInt3964 = 0;
			Static192.anInt4305 = Static157.anInt3462;
			Static176.aClass1_Sub7_Sub1_34.method2808(83);
			Static176.aClass1_Sub7_Sub1_34.method2789(local11 + Static196.anInt4343);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
			Static176.aClass1_Sub7_Sub1_34.method2775(Static127.anInt2789 + local15);
		}
		if (local28 == 35) {
			Static176.aClass1_Sub7_Sub1_34.method2808(244);
			Static176.aClass1_Sub7_Sub1_34.method2789(local11);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
			Static176.aClass1_Sub7_Sub1_34.method2754(local15);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 32 || local28 == 1004) {
			Static55.method1067(local20, Static66.aClass24Array11[arg0], local15, local11);
		}
		if (local28 == 17) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static178.anInt3964 = 0;
			Static79.anInt1889 = Static92.anInt2141;
			Static1.anInt63 = 2;
			Static192.anInt4305 = Static157.anInt3462;
			Static176.aClass1_Sub7_Sub1_34.method2808(184);
			Static176.aClass1_Sub7_Sub1_34.method2791(Static196.anInt4343 + local11);
			Static176.aClass1_Sub7_Sub1_34.method2791(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			Static176.aClass1_Sub7_Sub1_34.method2762(Static30.anInt777);
			Static176.aClass1_Sub7_Sub1_34.method2791(Static38.anInt1025);
		}
		if (local28 == 43) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static178.anInt3964 = 0;
				Static1.anInt63 = 2;
				Static79.anInt1889 = Static92.anInt2141;
				Static176.aClass1_Sub7_Sub1_34.method2808(122);
				Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			}
		}
		if (local28 == 4) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static79.anInt1889 = Static92.anInt2141;
				Static178.anInt3964 = 0;
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(66);
				Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			}
		}
		if (local28 == 1005) {
			Static178.anInt3964 = 0;
			Static1.anInt63 = 2;
			Static192.anInt4305 = Static157.anInt3462;
			Static79.anInt1889 = Static92.anInt2141;
			Static176.aClass1_Sub7_Sub1_34.method2808(207);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
		}
		if (local28 == 51) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static1.anInt63 = 2;
				Static192.anInt4305 = Static157.anInt3462;
				Static178.anInt3964 = 0;
				Static79.anInt1889 = Static92.anInt2141;
				Static176.aClass1_Sub7_Sub1_34.method2808(227);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			}
		}
		if (local28 == 44) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static178.anInt3964 = 0;
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static79.anInt1889 = Static92.anInt2141;
				Static176.aClass1_Sub7_Sub1_34.method2808(67);
				Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			}
		}
		if (local28 == 23) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static178.anInt3964 = 0;
				Static79.anInt1889 = Static92.anInt2141;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(19);
				Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			}
		}
		if (local28 == 21) {
			Static176.aClass1_Sub7_Sub1_34.method2808(23);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			Static176.aClass1_Sub7_Sub1_34.method2787(local15);
			Static176.aClass1_Sub7_Sub1_34.method2791(local11);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 3) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static1.anInt63 = 2;
				Static192.anInt4305 = Static157.anInt3462;
				Static178.anInt3964 = 0;
				Static79.anInt1889 = Static92.anInt2141;
				Static176.aClass1_Sub7_Sub1_34.method2808(12);
				Static176.aClass1_Sub7_Sub1_34.method2791(Static38.anInt1025);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
				Static176.aClass1_Sub7_Sub1_34.method2776(Static30.anInt777);
			}
		}
		if (local28 == 29) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static178.anInt3964 = 0;
				Static1.anInt63 = 2;
				Static192.anInt4305 = Static157.anInt3462;
				Static79.anInt1889 = Static92.anInt2141;
				Static176.aClass1_Sub7_Sub1_34.method2808(99);
				Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			}
		}
		if (local28 == 5) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static1.anInt63 = 2;
			Static192.anInt4305 = Static157.anInt3462;
			Static178.anInt3964 = 0;
			Static79.anInt1889 = Static92.anInt2141;
			Static176.aClass1_Sub7_Sub1_34.method2808(100);
			Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2775(local11 + Static196.anInt4343);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static118.anInt2644);
			Static176.aClass1_Sub7_Sub1_34.method2775(Static115.anInt2585);
			Static176.aClass1_Sub7_Sub1_34.method2762(Static150.anInt3363);
		}
		if (local28 == 1001) {
			local43 = Static188.method3229(local15);
			if (local43 == null || local43.anIntArray386[local11] < 100000) {
				Static176.aClass1_Sub7_Sub1_34.method2808(207);
				Static176.aClass1_Sub7_Sub1_34.method2775(local20);
			} else {
				Static200.method3377(method1281(new Class24[] { Static175.method3020(local43.anIntArray386[local11]), Static40.aClass24_249, Static168.method2886(local20).aClass24_1214 }), 0, Static85.aClass24_1000);
			}
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 24 && Static10.aClass98_10 == null) {
			Static137.method2408(local15, local11);
			Static10.aClass98_10 = Static87.method1589(local15, local11);
			Static199.method2199(Static10.aClass98_10);
		}
		if (local28 == 1002) {
			Static178.anInt3964 = 0;
			Static1.anInt63 = 2;
			Static79.anInt1889 = Static92.anInt2141;
			Static192.anInt4305 = Static157.anInt3462;
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				@Pc(1379) Class1_Sub2_Sub21 local1379 = local359.aClass1_Sub2_Sub21_1;
				if (local1379.anIntArray337 != null) {
					local1379 = local1379.method3046();
				}
				if (local1379 != null) {
					Static176.aClass1_Sub7_Sub1_34.method2808(84);
					Static176.aClass1_Sub7_Sub1_34.method2775(local1379.anInt3946);
				}
			}
		}
		if (local28 == 26 && Static121.method2051(local24, local11, local15)) {
			Static176.aClass1_Sub7_Sub1_34.method2808(249);
			Static176.aClass1_Sub7_Sub1_34.method2791(local15 + Static127.anInt2789);
			Static176.aClass1_Sub7_Sub1_34.method2754(Static30.anInt777);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static38.anInt1025);
			Static176.aClass1_Sub7_Sub1_34.method2758((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static176.aClass1_Sub7_Sub1_34.method2791(local11 + Static196.anInt4343);
		}
		if (local28 == 7) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static79.anInt1889 = Static92.anInt2141;
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static178.anInt3964 = 0;
				Static176.aClass1_Sub7_Sub1_34.method2808(33);
				Static176.aClass1_Sub7_Sub1_34.method2758(local20);
				Static176.aClass1_Sub7_Sub1_34.method2776(Static30.anInt777);
				Static176.aClass1_Sub7_Sub1_34.method2758(Static38.anInt1025);
			}
		}
		if (local28 == 13) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static178.anInt3964 = 0;
				Static79.anInt1889 = Static92.anInt2141;
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(65);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			}
		}
		if (local28 == 6) {
			Static176.aClass1_Sub7_Sub1_34.method2808(214);
			Static176.aClass1_Sub7_Sub1_34.method2789(local11);
			Static176.aClass1_Sub7_Sub1_34.method2754(local15);
			Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 58) {
			Static121.method2051(local24, local11, local15);
			Static176.aClass1_Sub7_Sub1_34.method2808(114);
			Static176.aClass1_Sub7_Sub1_34.method2789((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2791(Static196.anInt4343 + local11);
		}
		if (local28 == 33) {
			local43 = Static87.method1589(local15, local11);
			if (local43 != null) {
				Static132.method2264();
				Static173.method2982(local15, local11, Static31.method612(Static105.method1831(local43)));
				Static36.anInt973 = 0;
				Static102.aClass24_681 = method1277(local43);
				if (Static102.aClass24_681 == null) {
					Static102.aClass24_681 = Static37.aClass24_238;
				}
				if (local43.aBoolean211) {
					Static177.aClass24_1140 = method1281(new Class24[] { local43.aClass24_1264, Static196.aClass24_1256 });
					return;
				}
				Static177.aClass24_1140 = method1281(new Class24[] { Static158.aClass24_1020, local43.aClass24_1259, Static196.aClass24_1256 });
			}
			return;
		}
		if (local28 == 38) {
			Static188.method3228(Static170.anInt3799, local11, local15);
		}
		if (local28 == 40) {
			Static176.aClass1_Sub7_Sub1_34.method2808(98);
			Static176.aClass1_Sub7_Sub1_34.method2787(local15);
			Static176.aClass1_Sub7_Sub1_34.method2791(local11);
			Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 34) {
			Static176.aClass1_Sub7_Sub1_34.method2808(118);
			Static176.aClass1_Sub7_Sub1_34.method2754(local15);
			local43 = Static188.method3229(local15);
			if (local43.anIntArrayArray34 != null && local43.anIntArrayArray34[0][0] == 5) {
				local127 = local43.anIntArrayArray34[0][1];
				Static122.anIntArray213[local127] = 1 - Static122.anIntArray213[local127];
				Static148.method2538(local127);
			}
		}
		if (local28 == 18) {
			Static121.method2051(local24, local11, local15);
			Static176.aClass1_Sub7_Sub1_34.method2808(198);
			Static176.aClass1_Sub7_Sub1_34.method2789(Integer.MAX_VALUE & (int) (local24 >>> 32));
			Static176.aClass1_Sub7_Sub1_34.method2758(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static196.anInt4343 + local11);
		}
		if (local28 == 28) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static79.anInt1889 = Static92.anInt2141;
				Static1.anInt63 = 2;
				Static178.anInt3964 = 0;
				Static176.aClass1_Sub7_Sub1_34.method2808(154);
				Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			}
		}
		if (local28 == 37) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static1.anInt63 = 2;
			Static178.anInt3964 = 0;
			Static192.anInt4305 = Static157.anInt3462;
			Static79.anInt1889 = Static92.anInt2141;
			Static176.aClass1_Sub7_Sub1_34.method2808(234);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			Static176.aClass1_Sub7_Sub1_34.method2789(local15 + Static127.anInt2789);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static196.anInt4343 + local11);
		}
		if (local28 == 50) {
			local43 = Static188.method3229(local15);
			@Pc(2000) boolean local2000 = true;
			if (local43.anInt4351 > 0) {
				local2000 = Static2.method91(local43);
			}
			if (local2000) {
				Static176.aClass1_Sub7_Sub1_34.method2808(118);
				Static176.aClass1_Sub7_Sub1_34.method2754(local15);
			}
		}
		if (local28 == 1007) {
			Static79.anInt1889 = Static92.anInt2141;
			Static192.anInt4305 = Static157.anInt3462;
			Static178.anInt3964 = 0;
			Static1.anInt63 = 2;
			Static176.aClass1_Sub7_Sub1_34.method2808(41);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
		}
		if (local28 == 16) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static79.anInt1889 = Static92.anInt2141;
			Static192.anInt4305 = Static157.anInt3462;
			Static1.anInt63 = 2;
			Static178.anInt3964 = 0;
			Static176.aClass1_Sub7_Sub1_34.method2808(208);
			Static176.aClass1_Sub7_Sub1_34.method2775(Static196.anInt4343 + local11);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
		}
		if (local28 == 31) {
			Static121.method2051(local24, local11, local15);
			Static176.aClass1_Sub7_Sub1_34.method2808(43);
			Static176.aClass1_Sub7_Sub1_34.method2791((int) (local24 >>> 32) & Integer.MAX_VALUE);
			Static176.aClass1_Sub7_Sub1_34.method2775(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static196.anInt4343 + local11);
		}
		if (local28 == 47) {
			Static176.aClass1_Sub7_Sub1_34.method2808(55);
			Static176.aClass1_Sub7_Sub1_34.method2762(local15);
			Static176.aClass1_Sub7_Sub1_34.method2791(local11);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 25) {
			Static176.aClass1_Sub7_Sub1_34.method2808(144);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static115.anInt2585);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static118.anInt2644);
			Static176.aClass1_Sub7_Sub1_34.method2775(local11);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
			Static176.aClass1_Sub7_Sub1_34.method2776(Static150.anInt3363);
			Static176.aClass1_Sub7_Sub1_34.method2787(local15);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 39) {
			Static176.aClass1_Sub7_Sub1_34.method2808(171);
			Static176.aClass1_Sub7_Sub1_34.method2775(local11);
			Static176.aClass1_Sub7_Sub1_34.method2775(Static38.anInt1025);
			Static176.aClass1_Sub7_Sub1_34.method2754(local15);
			Static176.aClass1_Sub7_Sub1_34.method2754(Static30.anInt777);
			Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 30) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static178.anInt3964 = 0;
			Static1.anInt63 = 2;
			Static79.anInt1889 = Static92.anInt2141;
			Static192.anInt4305 = Static157.anInt3462;
			Static176.aClass1_Sub7_Sub1_34.method2808(57);
			Static176.aClass1_Sub7_Sub1_34.method2791(Static196.anInt4343 + local11);
			Static176.aClass1_Sub7_Sub1_34.method2789(local15 + Static127.anInt2789);
			Static176.aClass1_Sub7_Sub1_34.method2775(local20);
		}
		if (local28 == 11) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static79.anInt1889 = Static92.anInt2141;
				Static178.anInt3964 = 0;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(172);
				Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			}
		}
		if (local28 == 8) {
			Static176.aClass1_Sub7_Sub1_34.method2808(202);
			Static176.aClass1_Sub7_Sub1_34.method2775(local11);
			Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			Static176.aClass1_Sub7_Sub1_34.method2762(local15);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 45) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static79.anInt1889 = Static92.anInt2141;
				Static178.anInt3964 = 0;
				Static176.aClass1_Sub7_Sub1_34.method2808(147);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
				Static176.aClass1_Sub7_Sub1_34.method2787(Static150.anInt3363);
				Static176.aClass1_Sub7_Sub1_34.method2789(Static118.anInt2644);
				Static176.aClass1_Sub7_Sub1_34.method2791(Static115.anInt2585);
			}
		}
		if (local28 == 1006) {
			Static121.method2051(local24, local11, local15);
			Static176.aClass1_Sub7_Sub1_34.method2808(185);
			Static176.aClass1_Sub7_Sub1_34.method2758(local15 + Static127.anInt2789);
			Static176.aClass1_Sub7_Sub1_34.method2789(Static196.anInt4343 + local11);
			Static176.aClass1_Sub7_Sub1_34.method2758(Integer.MAX_VALUE & (int) (local24 >>> 32));
		}
		if (local28 == 42) {
			Static176.aClass1_Sub7_Sub1_34.method2808(119);
			Static176.aClass1_Sub7_Sub1_34.method2762(local15);
			Static176.aClass1_Sub7_Sub1_34.method2758(local20);
			Static176.aClass1_Sub7_Sub1_34.method2758(local11);
			Static201.anInt4501 = 0;
			Static32.aClass98_3 = Static188.method3229(local15);
			Static126.anInt2764 = local11;
		}
		if (local28 == 22) {
			local520 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 0, 0);
			if (!local520) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local15, local11, 0, 1, 1);
			}
			Static178.anInt3964 = 0;
			Static1.anInt63 = 2;
			Static192.anInt4305 = Static157.anInt3462;
			Static79.anInt1889 = Static92.anInt2141;
			Static176.aClass1_Sub7_Sub1_34.method2808(46);
			Static176.aClass1_Sub7_Sub1_34.method2789(local20);
			Static176.aClass1_Sub7_Sub1_34.method2791(Static127.anInt2789 + local15);
			Static176.aClass1_Sub7_Sub1_34.method2775(local11 + Static196.anInt4343);
		}
		if (local28 == 10) {
			local359 = Static148.aClass5_Sub2_Sub2Array1[local20];
			if (local359 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local359.anIntArray196[0], local359.anIntArray199[0], 0, 1, 1);
				Static178.anInt3964 = 0;
				Static192.anInt4305 = Static157.anInt3462;
				Static1.anInt63 = 2;
				Static79.anInt1889 = Static92.anInt2141;
				Static176.aClass1_Sub7_Sub1_34.method2808(54);
				Static176.aClass1_Sub7_Sub1_34.method2787(Static150.anInt3363);
				Static176.aClass1_Sub7_Sub1_34.method2789(Static115.anInt2585);
				Static176.aClass1_Sub7_Sub1_34.method2775(local20);
				Static176.aClass1_Sub7_Sub1_34.method2789(Static118.anInt2644);
			}
		}
		if (local28 == 14 && Static121.method2051(local24, local11, local15)) {
			Static176.aClass1_Sub7_Sub1_34.method2808(195);
			Static176.aClass1_Sub7_Sub1_34.method2758(local15 + Static127.anInt2789);
			Static176.aClass1_Sub7_Sub1_34.method2775(Integer.MAX_VALUE & (int) (local24 >>> 32));
			Static176.aClass1_Sub7_Sub1_34.method2776(Static150.anInt3363);
			Static176.aClass1_Sub7_Sub1_34.method2775(local11 + Static196.anInt4343);
			Static176.aClass1_Sub7_Sub1_34.method2758(Static115.anInt2585);
			Static176.aClass1_Sub7_Sub1_34.method2775(Static118.anInt2644);
		}
		if (local28 == 36) {
			local269 = Static110.aClass5_Sub2_Sub1Array1[local20];
			if (local269 != null) {
				Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], false, local269.anIntArray196[0], local269.anIntArray199[0], 0, 1, 1);
				Static192.anInt4305 = Static157.anInt3462;
				Static79.anInt1889 = Static92.anInt2141;
				Static178.anInt3964 = 0;
				Static1.anInt63 = 2;
				Static176.aClass1_Sub7_Sub1_34.method2808(20);
				Static176.aClass1_Sub7_Sub1_34.method2791(local20);
			}
		}
		if (Static36.anInt973 != 0) {
			Static36.anInt973 = 0;
			Static199.method2199(Static188.method3229(Static150.anInt3363));
		}
		if (Static178.aBoolean185) {
			Static132.method2264();
		}
		if (Static32.aClass98_3 != null && Static201.anInt4501 == 0) {
			Static199.method2199(Static32.aClass98_3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([Lclient!dj;I)Lclient!dj;")
	public static Class24 method1281(@OriginalArg(0) Class24[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static145.method2523(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = 2048 - arg6 & 0x7FF;
		@Pc(8) int local8 = 0;
		@Pc(15) int local15 = 2048 - arg0 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = arg3;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (local15 != 0) {
			local29 = Class1_Sub2_Sub8_Sub4.anIntArray350[local15];
			local33 = Class1_Sub2_Sub8_Sub4.anIntArray355[local15];
			local43 = local33 * 0 - arg3 * local29 >> 16;
			local23 = local33 * arg3 + local29 * 0 >> 16;
			local17 = local43;
		}
		if (local6 != 0) {
			local33 = Class1_Sub2_Sub8_Sub4.anIntArray355[local6];
			local29 = Class1_Sub2_Sub8_Sub4.anIntArray350[local6];
			local43 = local33 * 0 + local23 * local29 >> 16;
			local23 = local33 * local23 - local29 * 0 >> 16;
			local8 = local43;
		}
		Static92.anInt2140 = arg2 - local23;
		Static35.anInt4158 = arg6;
		Static32.anInt875 = arg5 - local17;
		Static146.anInt3111 = arg4 - local8;
		Static175.anInt3914 = arg0;
	}
}
