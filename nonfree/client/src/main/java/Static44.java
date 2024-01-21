import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!h", name = "T", descriptor = "I")
	public static int anInt1342;

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "Lclient!cb;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
	public static int anInt1348;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "Lclient!pd;")
	public static Class2_Sub2_Sub3 aClass2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "[Lclient!va;")
	public static Class2_Sub1_Sub17[] aClass2_Sub1_Sub17Array1;

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!wd;")
	private static Class80 aClass80_500 = Static2.method59("Unable to connect)3");

	@OriginalMember(owner = "client!h", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_499 = aClass80_500;

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_501 = aClass80_500;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "[I")
	public static int[] anIntArray173 = new int[1000];

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_502 = Static2.method59("Entfernen");

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_506 = Static2.method59("Service unavailable)3");

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "Lclient!wd;")
	public static Class80 aClass80_503 = aClass80_506;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_504 = Static2.method59(":duelreq:");

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_505 = Static2.method59("sl_stars");

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_507 = Static2.method59("null");

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "I")
	public static int anInt1361 = -1;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	public static void method734() {
		Static48.anInt1498++;
		Static110.method1841(true);
		Static61.method1064(true);
		Static110.method1841(false);
		Static61.method1064(false);
		Static19.method427();
		Static38.method659();
		@Pc(29) int local29;
		@Pc(65) int local65;
		if (!Static45.aBoolean157) {
			local29 = Static74.anInt1961;
			if (local29 < Static55.anInt1308 / 256) {
				local29 = Static55.anInt1308 / 256;
			}
			if (Static37.aBooleanArray11[4] && Static82.anIntArray403[4] + 128 > local29) {
				local29 = Static82.anIntArray403[4] + 128;
			}
			local65 = Static74.anInt1951 + Static124.anInt3139 & 0x7FF;
			Static27.method560(local29 * 3 + 600, Static24.method513(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370, Static16.anInt444, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324) + -50, local65, local29, Static68.anInt1884, Static6.anInt177);
		}
		if (Static45.aBoolean157) {
			local29 = Static111.method1936();
		} else {
			local29 = Static6.method104();
		}
		@Pc(98) int local98 = Static42.anInt1257;
		@Pc(100) int local100 = Static107.anInt2863;
		local65 = Static53.anInt1647;
		@Pc(104) int local104 = Static80.anInt2025;
		@Pc(106) int local106 = Static82.anInt3082;
		for (@Pc(108) int local108 = 0; local108 < 5; local108++) {
			if (Static37.aBooleanArray11[local108]) {
				@Pc(149) int local149 = (int) (Math.random() * (double) (Static108.anIntArray366[local108] * 2 + 1) - (double) Static108.anIntArray366[local108] + Math.sin((double) Static103.anIntArray352[local108] / 100.0D * (double) Static10.anIntArray28[local108]) * (double) Static82.anIntArray403[local108]);
				if (local108 == 2) {
					Static42.anInt1257 += local149;
				}
				if (local108 == 1) {
					Static107.anInt2863 += local149;
				}
				if (local108 == 3) {
					Static80.anInt2025 = local149 + Static80.anInt2025 & 0x7FF;
				}
				if (local108 == 0) {
					Static53.anInt1647 += local149;
				}
				if (local108 == 4) {
					Static82.anInt3082 += local149;
					if (Static82.anInt3082 < 128) {
						Static82.anInt3082 = 128;
					}
					if (Static82.anInt3082 > 383) {
						Static82.anInt3082 = 383;
					}
				}
			}
		}
		Static20.method487();
		Static12.anInt362 = Static95.anInt2430 - 4;
		Static12.aBoolean31 = true;
		Static12.anInt359 = Static93.anInt2398 - 4;
		Static12.anInt358 = 0;
		Static38.method657();
		Static99.method1900();
		Static38.method657();
		Static93.aClass64_1.method1611(Static53.anInt1647, Static107.anInt2863, Static42.anInt1257, Static82.anInt3082, Static80.anInt2025, local29);
		Static38.method657();
		Static93.aClass64_1.method1608();
		Static126.method1993();
		Static119.method1000();
		((Class24) Static52.anInterface1_1).method673(Static106.anInt2840);
		Static7.method115();
		if (Static3.aBoolean12 && Static85.method1258() == 0) {
			Static3.aBoolean12 = false;
		}
		if (Static3.aBoolean12) {
			Static20.method487();
			Static99.method1900();
			Static23.method467(Static86.aClass80_835, null, false);
		}
		Static38.method657();
		Static11.method178();
		Static42.anInt1257 = local98;
		Static80.anInt2025 = local104;
		Static107.anInt2863 = local100;
		Static53.anInt1647 = local65;
		Static82.anInt3082 = local106;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method736() {
		Static113.anInt2928 = 99;
		Static79.anIntArrayArrayArray4 = new int[4][105][105];
		Static71.anIntArray248 = new int[104];
		Static122.anIntArray405 = new int[104];
		Static1.anIntArray1 = new int[104];
		Static35.aByteArrayArrayArray2 = new byte[4][104][104];
		Static51.anIntArrayArray20 = new int[105][105];
		Static106.anIntArray359 = new int[104];
		Static19.anIntArray99 = new int[104];
		Static93.aByteArrayArrayArray5 = new byte[4][104][104];
		Static10.aByteArrayArrayArray1 = new byte[4][104][104];
		Static97.aByteArrayArrayArray6 = new byte[4][105][105];
		Static40.aByteArrayArrayArray3 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!va;)Lclient!va;")
	public static Class2_Sub1_Sub17 method739(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		@Pc(7) int local7 = Static1.method5(Static102.method1660(arg0));
		if (local7 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local7; local22++) {
			arg0 = Static123.method1976(arg0.anInt3008);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public static void method740() {
		aClass80_500 = null;
		aClass10_2 = null;
		aClass80_507 = null;
		aClass80_501 = null;
		aClass80_503 = null;
		aClass80_502 = null;
		aClass80_504 = null;
		aClass80_505 = null;
		aClass80_506 = null;
		aClass80_499 = null;
		anIntArray173 = null;
		aClass2_Sub2_Sub3_2 = null;
		aClass2_Sub1_Sub17Array1 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!v;Lclient!v;)V")
	public static void method742(@OriginalArg(1) Class2_Sub1_Sub9_Sub4 arg0, @OriginalArg(2) Class2_Sub1_Sub9_Sub4 arg1) {
		if (Static104.aClass2_Sub1_Sub9_Sub1Array13 == null) {
			Static104.aClass2_Sub1_Sub9_Sub1Array13 = Static94.method1452(Static79.aClass80_788, Static57.aClass11_Sub1_11, Static65.aClass80_692);
		}
		if (Static126.aClass2_Sub1_Sub9_Sub3Array10 == null) {
			Static126.aClass2_Sub1_Sub9_Sub3Array10 = Static40.method671(Static79.aClass80_788, Static57.aClass11_Sub1_11, Static60.aClass80_632);
		}
		if (Static31.aClass2_Sub1_Sub9_Sub3Array2 == null) {
			Static31.aClass2_Sub1_Sub9_Sub3Array2 = Static40.method671(Static79.aClass80_788, Static57.aClass11_Sub1_11, Static19.aClass80_274);
		}
		if (Static92.aClass2_Sub1_Sub9_Sub3Array7 == null) {
			Static92.aClass2_Sub1_Sub9_Sub3Array7 = Static40.method671(Static79.aClass80_788, Static57.aClass11_Sub1_11, aClass80_505);
		}
		Static99.method1894(0, 23, 765, 480, 0);
		Static99.method1897(0, 0, 125, 23, 12425273, 9135624);
		Static99.method1897(125, 0, 640, 23, 5197647, 2697513);
		arg0.method1924(Static97.aClass80_986, 62, 15, 0);
		if (Static92.aClass2_Sub1_Sub9_Sub3Array7 != null) {
			Static92.aClass2_Sub1_Sub9_Sub3Array7[1].method1494(140, 1);
			arg1.method1925(Static120.aClass80_1172, 152, 10, 16777215);
			Static92.aClass2_Sub1_Sub9_Sub3Array7[0].method1494(140, 12);
			arg1.method1925(Static103.aClass80_1020, 152, 21, 16777215);
		}
		if (Static31.aClass2_Sub1_Sub9_Sub3Array2 != null) {
			if (Static123.anIntArray406[0] == 0 && Static80.anIntArray272[0] == 0) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[2].method1494(280, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[0].method1494(280, 4);
			}
			if (Static123.anIntArray406[0] == 0 && Static80.anIntArray272[0] == 1) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[3].method1494(295, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[1].method1494(295, 4);
			}
			arg0.method1925(Static16.aClass80_176, 312, 17, 16777215);
			if (Static123.anIntArray406[0] == 1 && Static80.anIntArray272[0] == 0) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[2].method1494(390, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[0].method1494(390, 4);
			}
			if (Static123.anIntArray406[0] == 1 && Static80.anIntArray272[0] == 1) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[3].method1494(405, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[1].method1494(405, 4);
			}
			arg0.method1925(Static125.aClass80_1056, 422, 17, 16777215);
			if (Static123.anIntArray406[0] == 2 && Static80.anIntArray272[0] == 0) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[2].method1494(500, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[0].method1494(500, 4);
			}
			if (Static123.anIntArray406[0] == 2 && Static80.anIntArray272[0] == 1) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[3].method1494(515, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[1].method1494(515, 4);
			}
			arg0.method1925(Static95.aClass80_949, 532, 17, 16777215);
			if (Static123.anIntArray406[0] == 3 && Static80.anIntArray272[0] == 0) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[2].method1494(610, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[0].method1494(610, 4);
			}
			if (Static123.anIntArray406[0] == 3 && Static80.anIntArray272[0] == 1) {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[3].method1494(625, 4);
			} else {
				Static31.aClass2_Sub1_Sub9_Sub3Array2[1].method1494(625, 4);
			}
			arg0.method1925(Static71.aClass80_733, 642, 17, 16777215);
		}
		Static99.method1894(708, 4, 50, 16, 0);
		arg1.method1924(Static71.aClass80_730, 733, 16, 16777215);
		Static100.anInt2626 = -1;
		if (Static104.aClass2_Sub1_Sub9_Sub1Array13 != null) {
			@Pc(386) int local386 = 8;
			@Pc(392) int local392 = 24;
			@Pc(394) int local394;
			@Pc(396) int local396;
			do {
				local394 = local392;
				local396 = local386;
				if (Static2.anInt107 <= local392 * (local386 - 1)) {
					local386--;
				}
				if (Static2.anInt107 <= (local392 - 1) * local386) {
					local392--;
				}
				if ((local392 - 1) * local386 >= Static2.anInt107) {
					local392--;
				}
			} while (local394 != local392 || local396 != local386);
			local394 = (765 - local386 * 88) / (local386 + 1);
			if (local394 > 5) {
				local394 = 5;
			}
			local396 = (480 - local392 * 19) / (local392 + 1);
			@Pc(477) int local477 = (765 - local394 * (local386 - 1) - local386 * 88) / 2;
			if (local396 > 5) {
				local396 = 5;
			}
			@Pc(498) int local498 = (480 - local392 * 19 - (local392 - 1) * local396) / 2;
			@Pc(502) int local502 = local498 + 23;
			@Pc(504) int local504 = local477;
			@Pc(506) int local506 = 0;
			for (@Pc(508) int local508 = 0; local508 < Static2.anInt107; local508++) {
				@Pc(514) Class51 local514 = Static106.aClass51Array1[local508];
				@Pc(521) Class80 local521 = Static28.method1422(local514.anInt1967);
				@Pc(523) boolean local523 = true;
				if (local514.anInt1967 == -1) {
					local521 = Static105.aClass80_911;
					local523 = false;
				} else if (local514.anInt1967 > 1980) {
					local521 = Static15.aClass80_168;
					local523 = false;
				}
				if (local504 <= Static93.anInt2398 && local502 <= Static95.anInt2430 && Static93.anInt2398 < local504 + 88 && local502 + 19 > Static95.anInt2430 && local523) {
					Static100.anInt2626 = local508;
					Static104.aClass2_Sub1_Sub9_Sub1Array13[local514.aBoolean140 ? 1 : 0].method840(local504, local502);
				} else {
					Static104.aClass2_Sub1_Sub9_Sub1Array13[local514.aBoolean140 ? 1 : 0].method837(local504, local502);
				}
				if (Static126.aClass2_Sub1_Sub9_Sub3Array10 != null) {
					Static126.aClass2_Sub1_Sub9_Sub3Array10[local514.anInt1966 + (local514.aBoolean140 ? 8 : 0)].method1494(local504 + 29, local502);
				}
				arg0.method1924(Static28.method1422(local514.anInt1965), local504 + 15, local502 + 5 + 9, 0);
				arg1.method1924(local521, local504 + 60, local502 + 5 + 9, 268435455);
				local502 += local396 + 19;
				local506++;
				if (local506 >= local392) {
					local506 = 0;
					local504 += local394 + 88;
					local502 = local498 + 23;
				}
			}
		}
		try {
			@Pc(681) Graphics local681 = Static119.aCanvas2.getGraphics();
			Static19.aClass22_4.method1065(local681, 0, 0);
		} catch (@Pc(689) Exception local689) {
			Static119.aCanvas2.repaint();
		}
	}
}
