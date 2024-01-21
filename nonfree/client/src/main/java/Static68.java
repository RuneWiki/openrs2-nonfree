import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt1700;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_896 = Static28.method504("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!ja;")
	private static Class39 aClass39_898 = Static28.method504("Please try again)3");

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_897 = aClass39_898;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_899 = Static28.method504("blinken2:");

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_900 = Static28.method504("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public static int anInt1705 = 0;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
	public static int[] anIntArray193 = new int[50];

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
	public static int anInt1707 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public static void method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static122.method2094();
		Static17.method1680(arg0, arg2, Static108.aClass4_Sub2_Sub3_Sub4_6.anInt2267 + arg0, arg2 - -Static108.aClass4_Sub2_Sub3_Sub4_6.anInt2266);
		if (Static14.anInt371 == 2 || Static14.anInt371 == 5) {
			Static17.method1685(arg0 + 25, arg2 + 5, Static16.anIntArray50, Static59.anIntArray160);
		} else {
			@Pc(43) int local43 = Static45.anInt1164 + Static54.anInt1446 & 0x7FF;
			@Pc(50) int local50 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32 + 48;
			@Pc(57) int local57 = 464 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
			Static110.aClass4_Sub2_Sub3_Sub1_7.method881(arg0 + 25, arg2 + 5, 146, 151, local50, local57, local43, Static105.anInt2051 + 256, Static16.anIntArray50, Static59.anIntArray160);
			@Pc(94) int local94;
			@Pc(108) int local108;
			for (@Pc(78) int local78 = 0; local78 < Static84.anInt2107; local78++) {
				local94 = Static92.anIntArray78[local78] * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
				local108 = Static118.anIntArray318[local78] * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
				Static33.method550(local94, Static91.aClass4_Sub2_Sub3_Sub1Array8[local78], arg2, arg0, local108);
			}
			@Pc(155) int local155;
			@Pc(167) int local167;
			for (local94 = 0; local94 < 104; local94++) {
				for (local108 = 0; local108 < 104; local108++) {
					@Pc(141) Class61 local141 = Static26.aClass61ArrayArrayArray1[Static131.anInt3202][local94][local108];
					if (local141 != null) {
						local155 = local94 * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
						local167 = local108 * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
						Static33.method550(local155, Static3.aClass4_Sub2_Sub3_Sub1Array1[0], arg2, arg0, local167);
					}
				}
			}
			@Pc(242) int local242;
			for (local108 = 0; local108 < Static72.anInt799; local108++) {
				@Pc(194) Class4_Sub2_Sub1_Sub1_Sub2 local194 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static33.anIntArray94[local108]];
				if (local194 != null && local194.method1915()) {
					@Pc(203) Class4_Sub2_Sub16 local203 = local194.aClass4_Sub2_Sub16_1;
					if (local203 != null && local203.anIntArray316 != null) {
						local203 = local203.method2043();
					}
					if (local203 != null && local203.aBoolean143 && local203.aBoolean142) {
						local167 = local194.anInt2643 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
						local242 = local194.anInt2641 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
						Static33.method550(local167, Static3.aClass4_Sub2_Sub3_Sub1Array1[1], arg2, arg0, local242);
					}
				}
			}
			@Pc(265) Class4_Sub2_Sub1_Sub1_Sub1 local265;
			for (@Pc(257) int local257 = 0; local257 < Static122.anInt3021; local257++) {
				local265 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local257]];
				if (local265 != null && local265.method1915()) {
					local242 = local265.anInt2641 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
					local167 = local265.anInt2643 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
					@Pc(294) boolean local294 = false;
					@Pc(299) long local299 = local265.aClass39_1279.method941();
					for (@Pc(301) int local301 = 0; local301 < Static48.anInt1254; local301++) {
						if (local299 == Static80.aLongArray4[local301] && Static114.anIntArray307[local301] != 0) {
							local294 = true;
							break;
						}
					}
					@Pc(334) boolean local334 = false;
					if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2449 != 0 && local265.anInt2449 != 0 && Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2449 == local265.anInt2449) {
						local334 = true;
					}
					if (local294) {
						Static33.method550(local167, Static3.aClass4_Sub2_Sub3_Sub1Array1[3], arg2, arg0, local242);
					} else if (local334) {
						Static33.method550(local167, Static3.aClass4_Sub2_Sub3_Sub1Array1[4], arg2, arg0, local242);
					} else {
						Static33.method550(local167, Static3.aClass4_Sub2_Sub3_Sub1Array1[2], arg2, arg0, local242);
					}
				}
			}
			if (Static98.anInt1022 != 0 && Static71.anInt1738 % 20 < 10) {
				if (Static98.anInt1022 == 1 && Static103.anInt2556 >= 0 && Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1.length > Static103.anInt2556) {
					@Pc(420) Class4_Sub2_Sub1_Sub1_Sub2 local420 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static103.anInt2556];
					if (local420 != null) {
						local167 = local420.anInt2643 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
						local242 = local420.anInt2641 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
						Static104.method1854(Static69.aClass4_Sub2_Sub3_Sub1Array5[1], arg0, local242, local167, arg2);
					}
				}
				if (Static98.anInt1022 == 2) {
					local155 = (Static70.anInt1732 - Static36.anInt909) * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
					local167 = (Static123.anInt3042 - Static24.anInt503) * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
					Static104.method1854(Static69.aClass4_Sub2_Sub3_Sub1Array5[1], arg0, local167, local155, arg2);
				}
				if (Static98.anInt1022 == 10 && Static51.anInt2458 >= 0 && Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1.length > Static51.anInt2458) {
					local265 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static51.anInt2458];
					if (local265 != null) {
						local167 = local265.anInt2643 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
						local242 = local265.anInt2641 / 32 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
						Static104.method1854(Static69.aClass4_Sub2_Sub3_Sub1Array5[1], arg0, local242, local167, arg2);
					}
				}
			}
			if (Static125.anInt3127 != 0) {
				local155 = Static125.anInt3127 * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 / 32;
				local167 = Static22.anInt642 * 4 + 2 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 / 32;
				Static33.method550(local155, Static69.aClass4_Sub2_Sub3_Sub1Array5[0], arg2, arg0, local167);
			}
			Static17.method1682(arg0 + 97, arg2 - -78, 3, 3, 16777215);
		}
		if (Static14.anInt371 >= 3) {
			Static17.method1685(arg0, arg2, Static111.anIntArray305, Static69.anIntArray194);
		} else {
			Static99.aClass4_Sub2_Sub3_Sub1_6.method881(arg0, arg2, 33, 33, 25, 25, Static54.anInt1446, 256, Static111.anIntArray305, Static69.anIntArray194);
		}
		if (Static99.aBooleanArray13[arg1]) {
			Static108.aClass4_Sub2_Sub3_Sub4_6.method1688(arg0, arg2);
		}
		Static113.aBooleanArray16[arg1] = true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Component;Lclient!pd;Lclient!pd;)V")
	public static void method1171(@OriginalArg(1) Component arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		if (Static64.aBoolean94) {
			return;
		}
		Static17.method1672();
		@Pc(13) byte[] local13 = arg1.method477(Static98.aClass39_583, Static6.aClass39_180);
		Static93.aClass4_Sub2_Sub3_Sub1_9 = new Class4_Sub2_Sub3_Sub1(local13, arg0);
		Static51.aClass4_Sub2_Sub3_Sub1_5 = Static93.aClass4_Sub2_Sub3_Sub1_9.method869();
		Static105.aClass4_Sub2_Sub3_Sub4_5 = Static77.method1296(arg2, Static6.aClass39_180, Static62.aClass39_861);
		Static14.aClass4_Sub2_Sub3_Sub4_1 = Static77.method1296(arg2, Static6.aClass39_180, Static121.aClass39_1609);
		Static36.aClass4_Sub2_Sub3_Sub4_3 = Static77.method1296(arg2, Static6.aClass39_180, Static111.aClass39_1465);
		Static111.aClass4_Sub2_Sub3_Sub4Array7 = Static45.method761(Static6.aClass39_180, Static58.aClass39_833, arg2);
		Static130.aClass4_Sub2_Sub3_Sub4Array9 = Static45.method761(Static6.aClass39_180, Static127.aClass39_1754, arg2);
		Static28.anIntArray84 = new int[256];
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static28.anIntArray84[local65] = local65 * 262144;
		}
		for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
			Static28.anIntArray84[local78 + 64] = local78 * 1024 + 16711680;
		}
		for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
			Static28.anIntArray84[local97 + 128] = local97 * 4 + 16776960;
		}
		for (@Pc(114) int local114 = 0; local114 < 64; local114++) {
			Static28.anIntArray84[local114 + 192] = 16777215;
		}
		Static97.anIntArray276 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static97.anIntArray276[local132] = local132 * 1024;
		}
		for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
			Static97.anIntArray276[local145 + 64] = local145 * 4 + 65280;
		}
		for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
			Static97.anIntArray276[local164 + 128] = local164 * 262144 + 65535;
		}
		for (@Pc(181) int local181 = 0; local181 < 64; local181++) {
			Static97.anIntArray276[local181 + 192] = 16777215;
		}
		Static20.anIntArray59 = new int[256];
		for (@Pc(197) int local197 = 0; local197 < 64; local197++) {
			Static20.anIntArray59[local197] = local197 * 4;
		}
		for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
			Static20.anIntArray59[local212 + 64] = local212 * 262144 + 255;
		}
		for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
			Static20.anIntArray59[local231 + 128] = local231 * 1024 + 16711935;
		}
		for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
			Static20.anIntArray59[local248 + 192] = 16777215;
		}
		Static30.anIntArray86 = new int[256];
		Static64.anIntArray177 = new int[32768];
		Static1.anIntArray2 = new int[32768];
		Static121.method2079(null);
		Static113.anIntArray306 = new int[32768];
		if (Static116.anInt2896 == 0) {
			Static5.aBoolean135 = true;
		} else {
			Static5.aBoolean135 = false;
		}
		Static46.aBoolean54 = false;
		Static9.anInt286 = 0;
		Static6.aClass39_183 = Static6.aClass39_180;
		Static6.aClass39_179 = Static6.aClass39_180;
		Static130.anIntArray365 = new int[32768];
		if (Static5.aBoolean135) {
			Static16.method258();
		} else {
			Static4.method79(Static29.aClass20_Sub1_3, Static6.aClass39_180, Static49.aClass39_730);
		}
		method1172(false);
		Static64.aBoolean94 = true;
		Static93.aClass4_Sub2_Sub3_Sub1_9.method870(0, 0);
		Static51.aClass4_Sub2_Sub3_Sub1_5.method870(382, 0);
		Static105.aClass4_Sub2_Sub3_Sub4_5.method1688(382 - Static105.aClass4_Sub2_Sub3_Sub4_5.anInt2267 / 2, 18);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	public static void method1172(@OriginalArg(1) boolean arg0) {
		if (Static106.aClass69_4 == null) {
			return;
		}
		try {
			@Pc(16) Class4_Sub16 local16 = new Class4_Sub16(4);
			local16.method1459(arg0 ? 2 : 3);
			local16.method1452(0);
			Static106.aClass69_4.method1860(4, local16.aByteArray22);
		} catch (@Pc(37) IOException local37) {
			try {
				Static106.aClass69_4.method1859();
			} catch (@Pc(42) Exception local42) {
			}
			Static64.anInt1659++;
			Static106.aClass69_4 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1173() {
		for (@Pc(15) Class4_Sub19 local15 = (Class4_Sub19) Static117.aClass61_15.method1628(); local15 != null; local15 = (Class4_Sub19) Static117.aClass61_15.method1629()) {
			if (local15.anInt2721 > 0) {
				local15.anInt2721--;
			}
			if (local15.anInt2721 != 0) {
				if (local15.anInt2718 > 0) {
					local15.anInt2718--;
				}
				if (local15.anInt2718 == 0 && local15.anInt2719 >= 1 && local15.anInt2727 >= 1 && local15.anInt2719 <= 102 && local15.anInt2727 <= 102 && (local15.anInt2717 < 0 || Static16.method257(local15.anInt2717, local15.anInt2723))) {
					Static42.method710(local15.anInt2717, local15.anInt2723, local15.anInt2725, local15.anInt2719, local15.anInt2728, local15.anInt2727, local15.anInt2726);
					local15.anInt2718 = -1;
					if (local15.anInt2716 == local15.anInt2717 && local15.anInt2716 == -1) {
						local15.method2189();
					} else if (local15.anInt2716 == local15.anInt2717 && local15.anInt2725 == local15.anInt2722 && local15.anInt2723 == local15.anInt2713) {
						local15.method2189();
					}
				}
			} else if (local15.anInt2716 < 0 || Static16.method257(local15.anInt2716, local15.anInt2713)) {
				Static42.method710(local15.anInt2716, local15.anInt2713, local15.anInt2722, local15.anInt2719, local15.anInt2728, local15.anInt2727, local15.anInt2726);
				local15.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	public static boolean method1174(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method1175() {
		Static96.method1760(false);
		@Pc(6) boolean local6 = true;
		anInt1705 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static30.aByteArrayArray4.length; local14++) {
			if (Static125.anIntArray359[local14] != -1 && Static30.aByteArrayArray4[local14] == null) {
				Static30.aByteArrayArray4[local14] = Static16.aClass20_Sub1_2.method474(Static125.anIntArray359[local14], 0);
				if (Static30.aByteArrayArray4[local14] == null) {
					local6 = false;
					anInt1705++;
				}
			}
			if (Static20.anIntArray58[local14] != -1 && Static22.aByteArrayArray3[local14] == null) {
				Static22.aByteArrayArray3[local14] = Static16.aClass20_Sub1_2.method483(Static20.anIntArray58[local14], Static111.anIntArrayArray22[local14], 0);
				if (Static22.aByteArrayArray3[local14] == null) {
					local6 = false;
					anInt1705++;
				}
			}
		}
		if (!local6) {
			Static75.anInt1799 = 1;
			return;
		}
		local6 = true;
		Static111.anInt2777 = 0;
		@Pc(116) int local116;
		@Pc(127) int local127;
		for (@Pc(98) int local98 = 0; local98 < Static30.aByteArrayArray4.length; local98++) {
			@Pc(104) byte[] local104 = Static22.aByteArrayArray3[local98];
			if (local104 != null) {
				local116 = (Static74.anIntArray195[local98] >> 8) * 64 - Static36.anInt909;
				local127 = (Static74.anIntArray195[local98] & 0xFF) * 64 - Static24.anInt503;
				if (Static22.aBoolean26) {
					local116 = 10;
					local127 = 10;
				}
				local6 &= Static82.method1365(local116, local127, local104);
			}
		}
		if (!local6) {
			Static75.anInt1799 = 2;
			return;
		}
		if (Static75.anInt1799 != 0) {
			Static103.method1845(Static62.method1123(new Class39[] { Static40.aClass39_574, Static6.aClass39_176 }), true);
		}
		Static122.method2094();
		Static117.method2041();
		Static122.method2094();
		Static101.aClass43_1.method1120();
		Static122.method2094();
		System.gc();
		for (@Pc(185) int local185 = 0; local185 < 4; local185++) {
			Static109.aClass81Array1[local185].method2220();
		}
		@Pc(206) int local206;
		for (local116 = 0; local116 < 4; local116++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local206 = 0; local206 < 104; local206++) {
					Static131.aByteArrayArrayArray7[local116][local127][local206] = 0;
				}
			}
		}
		Static122.method2094();
		Static101.method1820();
		local127 = Static30.aByteArrayArray4.length;
		Static96.method1759();
		Static96.method1760(true);
		@Pc(273) int local273;
		@Pc(262) int local262;
		@Pc(384) int local384;
		@Pc(326) int local326;
		@Pc(373) int local373;
		if (!Static22.aBoolean26) {
			@Pc(252) byte[] local252;
			for (local206 = 0; local206 < local127; local206++) {
				local252 = Static30.aByteArrayArray4[local206];
				local262 = (Static74.anIntArray195[local206] & 0xFF) * 64 - Static24.anInt503;
				local273 = (Static74.anIntArray195[local206] >> 8) * 64 - Static36.anInt909;
				if (local252 != null) {
					Static122.method2094();
					Static31.method540(Static25.anInt3168 * 8 - 48, local262, anInt1700 * 8 - 48, local252, Static109.aClass81Array1, local273);
				}
			}
			for (local273 = 0; local273 < local127; local273++) {
				local262 = (Static74.anIntArray195[local273] >> 8) * 64 - Static36.anInt909;
				local326 = (Static74.anIntArray195[local273] & 0xFF) * 64 - Static24.anInt503;
				@Pc(330) byte[] local330 = Static30.aByteArrayArray4[local273];
				if (local330 == null && anInt1700 < 800) {
					Static122.method2094();
					Static16.method263(64, local262, local326, 64);
				}
			}
			Static96.method1760(true);
			for (local262 = 0; local262 < local127; local262++) {
				local252 = Static22.aByteArrayArray3[local262];
				if (local252 != null) {
					local373 = (Static74.anIntArray195[local262] >> 8) * 64 - Static36.anInt909;
					local384 = (Static74.anIntArray195[local262] & 0xFF) * 64 - Static24.anInt503;
					Static122.method2094();
					Static128.method2182(local384, local252, Static109.aClass81Array1, local373, Static101.aClass43_1);
				}
			}
		}
		@Pc(439) int local439;
		@Pc(445) int local445;
		if (Static22.aBoolean26) {
			@Pc(451) int local451;
			@Pc(461) int local461;
			@Pc(463) int local463;
			for (local206 = 0; local206 < 4; local206++) {
				Static122.method2094();
				for (local273 = 0; local273 < 13; local273++) {
					for (local262 = 0; local262 < 13; local262++) {
						@Pc(415) boolean local415 = false;
						local373 = Static36.anIntArrayArrayArray5[local206][local273][local262];
						if (local373 != -1) {
							local384 = local373 >> 24 & 0x3;
							local439 = local373 >> 1 & 0x3;
							local445 = local373 >> 14 & 0x3FF;
							local451 = local373 >> 3 & 0x7FF;
							local461 = (local445 / 8 << 8) + local451 / 8;
							for (local463 = 0; local463 < Static74.anIntArray195.length; local463++) {
								if (Static74.anIntArray195[local463] == local461 && Static30.aByteArrayArray4[local463] != null) {
									local415 = true;
									Static59.method1048(local384, local206, local273 * 8, (local451 & 0x7) * 8, local262 * 8, Static109.aClass81Array1, (local445 & 0x7) * 8, local439, Static30.aByteArrayArray4[local463]);
									break;
								}
							}
						}
						if (!local415) {
							Static19.method343(local206, local273 * 8, local262 * 8);
						}
					}
				}
			}
			for (local273 = 0; local273 < 13; local273++) {
				for (local262 = 0; local262 < 13; local262++) {
					local326 = Static36.anIntArrayArrayArray5[0][local273][local262];
					if (local326 == -1) {
						Static16.method263(8, local273 * 8, local262 * 8, 8);
					}
				}
			}
			Static96.method1760(true);
			for (local262 = 0; local262 < 4; local262++) {
				Static122.method2094();
				for (local326 = 0; local326 < 13; local326++) {
					for (local373 = 0; local373 < 13; local373++) {
						local384 = Static36.anIntArrayArrayArray5[local262][local326][local373];
						if (local384 != -1) {
							local439 = local384 >> 24 & 0x3;
							local461 = local384 >> 3 & 0x7FF;
							local445 = local384 >> 1 & 0x3;
							local451 = local384 >> 14 & 0x3FF;
							local463 = local461 / 8 + (local451 / 8 << 8);
							for (@Pc(637) int local637 = 0; local637 < Static74.anIntArray195.length; local637++) {
								if (local463 == Static74.anIntArray195[local637] && Static22.aByteArrayArray3[local637] != null) {
									Static131.method2230(local445, local373 * 8, (local461 & 0x7) * 8, local439, Static101.aClass43_1, local326 * 8, Static22.aByteArrayArray3[local637], Static109.aClass81Array1, local262, (local451 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static96.method1760(true);
		Static117.method2041();
		Static122.method2094();
		Static104.method1856(Static109.aClass81Array1, Static101.aClass43_1);
		Static96.method1760(true);
		local206 = Static73.anInt1760;
		if (local206 > Static131.anInt3202) {
			local206 = Static131.anInt3202;
		}
		if (local206 < Static131.anInt3202 - 1) {
		}
		if (Static123.aBoolean150) {
			Static101.aClass43_1.method1095(Static73.anInt1760);
		} else {
			Static101.aClass43_1.method1095(0);
		}
		for (local273 = 0; local273 < 104; local273++) {
			for (local262 = 0; local262 < 104; local262++) {
				Static77.method1293(local273, local262);
			}
		}
		Static122.method2094();
		Static55.method979();
		Static63.aClass12_43.method233();
		if (Static14.aFrame1 != null) {
			Static114.aClass4_Sub16_Sub1_3.method1499(229);
			Static114.aClass4_Sub16_Sub1_3.method1489(1057001181);
		}
		if (!Static22.aBoolean26) {
			local262 = (Static25.anInt3168 - 6) / 8;
			local326 = (Static25.anInt3168 + 6) / 8;
			local373 = (anInt1700 - 6) / 8;
			local384 = (anInt1700 + 6) / 8;
			for (local439 = local262 - 1; local439 <= local326 + 1; local439++) {
				for (local445 = local373 - 1; local445 <= local384 + 1; local445++) {
					if (local262 > local439 || local326 < local439 || local373 > local445 || local445 > local384) {
						Static16.aClass20_Sub1_2.method473(Static62.method1123(new Class39[] { Static94.aClass39_1143, Static29.method510(local439), Static113.aClass39_1484, Static29.method510(local445) }));
						Static16.aClass20_Sub1_2.method473(Static62.method1123(new Class39[] { Static49.aClass39_731, Static29.method510(local439), Static113.aClass39_1484, Static29.method510(local445) }));
					}
				}
			}
		}
		Static54.method966(30);
		Static122.method2094();
		Static111.method1968();
		Static114.aClass4_Sub16_Sub1_3.method1499(65);
		Static113.method1985();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1176() {
		aClass39_896 = null;
		aClass39_897 = null;
		aClass39_900 = null;
		aClass39_898 = null;
		anIntArray193 = null;
		aClass39_899 = null;
	}
}
