import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Lclient!ff;")
	public static Class26 aClass26_24;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array1 = new Class66[4];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!r;")
	private static Class61 aClass61_802 = Static129.method2060("Take");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_803 = Static129.method2060("Loading fonts )2 ");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_804 = aClass61_802;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_805 = Static129.method2060("titlebutton");

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!r;")
	private static Class61 aClass61_807 = Static129.method2060("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_806 = aClass61_807;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_808 = aClass61_803;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method1743(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static27.anInt2920 > 0) {
			local18 = Static25.aByteArrayArray3[--Static27.anInt2920];
			Static25.aByteArrayArray3[Static27.anInt2920] = null;
			return local18;
		} else if (arg0 == 5000 && Static47.anInt1221 > 0) {
			local18 = Static74.aByteArrayArray9[--Static47.anInt1221];
			Static74.aByteArrayArray9[Static47.anInt1221] = null;
			return local18;
		} else if (arg0 == 30000 && Static93.anInt2433 > 0) {
			local18 = Static70.aByteArrayArray8[--Static93.anInt2433];
			Static70.aByteArrayArray8[Static93.anInt2433] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static129.anInt3251; local15++) {
			if (Static82.anIntArray288[local15] + Static56.anIntArray209[local15] > arg0 && Static82.anIntArray288[local15] < arg0 + arg1 && arg3 < Static81.anIntArray444[local15] + Static40.anIntArray176[local15] && arg3 + arg2 > Static40.anIntArray176[local15]) {
				Static48.aBooleanArray5[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ff;BLclient!r;Lclient!r;)[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] method1745(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(8) int local8 = arg0.method1044(arg1);
		@Pc(22) int local22 = arg0.method1039(arg2, local8);
		return Static24.method502(local22, arg0, local8);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!df;ILclient!df;)V")
	public static void method1746(@OriginalArg(0) Class5_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) Class5_Sub2_Sub1_Sub1_Sub1 arg1) {
		if (Static95.aBoolean86) {
			Static81.method2181(arg0, arg1);
			return;
		}
		if (Static24.anInt723 == 0 || Static24.anInt723 == 5) {
			arg0.method555(Static4.aClass61_780, 382, 225, 16777215, -1);
			Static46.method2006(230, 233, 304, 34, 9179409);
			Static46.method2006(231, 234, 302, 32, 0);
			Static46.method2001(232, 235, Static33.anInt1001 * 3, 30, 9179409);
			Static46.method2001(Static33.anInt1001 * 3 + 232, 235, 300 - Static33.anInt1001 * 3, 30, 0);
			arg0.method555(Static112.aClass61_886, 382, 256, 16777215, -1);
		}
		@Pc(94) short local94;
		@Pc(117) int local117;
		if (Static24.anInt723 == 20) {
			local94 = 211;
			Static82.aClass5_Sub2_Sub1_Sub3_5.method1354(382 - Static82.aClass5_Sub2_Sub1_Sub3_5.anInt2091 / 2, -(Static82.aClass5_Sub2_Sub1_Sub3_5.anInt2090 / 2) + 271);
			arg0.method555(Static112.aClass61_883, 382, 211, 16776960, 0);
			local117 = local94 + 15;
			arg0.method555(Static112.aClass61_885, 382, 226, 16776960, 0);
			@Pc(125) int local125 = local117 + 15;
			arg0.method555(Static112.aClass61_884, 382, 241, 16776960, 0);
			@Pc(133) int local133 = local125 + 15;
			@Pc(134) int local134 = local133 + 10;
			arg0.method558(Static123.method1929(new Class61[] { Static9.aClass61_81, Static7.method570(Static112.aClass61_881) }), 272, 266, 16777215, 0);
			@Pc(154) int local154 = local134 + 15;
			arg0.method558(Static123.method1929(new Class61[] { Static2.aClass61_6, Static112.aClass61_880.method1728() }), 274, 281, 16777215, 0);
			@Pc(175) int local175 = local154 + 15;
		}
		if (Static24.anInt723 == 10) {
			Static82.aClass5_Sub2_Sub1_Sub3_5.method1354(202, 171);
			if (Static2.anInt22 == 0) {
				local94 = 251;
				arg0.method555(Static101.aClass61_797, 382, 251, 16776960, 0);
				local117 = local94 + 30;
				Static22.aClass5_Sub2_Sub1_Sub3_2.method1354(229, 271);
				arg0.method561(Static78.aClass61_598, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static22.aClass5_Sub2_Sub1_Sub3_2.method1354(389, 271);
				arg0.method561(Static49.aClass61_384, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static2.anInt22 == 2) {
				local94 = 211;
				arg0.method555(Static112.aClass61_883, 382, 211, 16776960, 0);
				local117 = local94 + 15;
				arg0.method555(Static112.aClass61_885, 382, 226, 16776960, 0);
				local117 += 15;
				arg0.method555(Static112.aClass61_884, 382, 241, 16776960, 0);
				@Pc(234) boolean local234;
				if (Static43.anInt1118 == 0 && Static58.anInt1422 % 40 < 20 && Static60.aBoolean51) {
					local234 = true;
				} else {
					local234 = false;
				}
				local117 += 15;
				local117 += 10;
				arg0.method558(Static123.method1929(new Class61[] { Static9.aClass61_81, Static7.method570(Static112.aClass61_881), local234 ? Static9.aClass61_88 : Static112.aClass61_882 }), 272, 266, 16777215, 0);
				local117 += 15;
				if (Static43.anInt1118 == 1 && Static58.anInt1422 % 40 < 20 && Static60.aBoolean51) {
					local234 = true;
				} else {
					local234 = false;
				}
				arg0.method558(Static123.method1929(new Class61[] { Static2.aClass61_6, Static112.aClass61_880.method1728(), local234 ? Static9.aClass61_88 : Static112.aClass61_882 }), 274, 281, 16777215, 0);
				local117 += 15;
				Static22.aClass5_Sub2_Sub1_Sub3_2.method1354(229, 301);
				arg0.method555(Static12.aClass61_106, 302, 326, 16777215, 0);
				Static22.aClass5_Sub2_Sub1_Sub3_2.method1354(389, 301);
				arg0.method555(Static76.aClass61_572, 462, 326, 16777215, 0);
			} else if (Static2.anInt22 == 3) {
				arg0.method555(Static125.aClass61_994, 382, 211, 16776960, 0);
				local94 = 236;
				arg0.method555(Static77.aClass61_586, 382, 236, 16777215, 0);
				local117 = local94 + 15;
				arg0.method555(Static73.aClass61_539, 382, 251, 16777215, 0);
				local117 += 15;
				arg0.method555(Static8.aClass61_74, 382, 266, 16777215, 0);
				local117 += 15;
				arg0.method555(Static71.aClass61_529, 382, 281, 16777215, 0);
				local117 += 15;
				Static22.aClass5_Sub2_Sub1_Sub3_2.method1354(309, 301);
				arg0.method555(Static76.aClass61_572, 382, 326, 16777215, 0);
			}
		}
		if (Static106.anInt2743 != 1) {
			if (Static62.anInt1534 > 0) {
				Static31.method641(Static62.anInt1534);
				Static62.anInt1534 = 0;
			}
			Static53.method983();
		}
		Static12.aClass5_Sub2_Sub1_Sub3Array7[Static41.aBoolean80 ? 1 : 0].method1354(725, 463);
		if (Static24.anInt723 <= 5 || Static91.anInt2419 == 2 || Static13.anInt367 != 0) {
			return;
		}
		if (Static36.aClass5_Sub2_Sub1_Sub3_3 == null) {
			Static36.aClass5_Sub2_Sub1_Sub3_3 = Static68.method1135(Static112.aClass61_882, Static47.aClass26_Sub1_8, Static108.aClass61_33);
			return;
		}
		Static36.aClass5_Sub2_Sub1_Sub3_3.method1354(5, 463);
		arg0.method555(Static123.method1929(new Class61[] { Static39.aClass61_318, Static95.aClass61_728, Static39.method730(Static67.anInt1683) }), 55, 478, 16777215, 0);
		if (Static118.aClass1_1 == null) {
			arg1.method555(Static106.aClass61_824, 55, 492, 16777215, 0);
		} else {
			arg1.method555(Static47.aClass61_369, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method1747() {
		Static63.method1087();
		Static101.method1725();
		Static32.method652();
		Static108.method52();
		Static21.method459();
		Static126.method1975();
		Static58.method1014();
		Static29.method629();
		Static72.method1287();
		Static91.method1595();
		Static121.method1907();
		Static66.method1110();
		((Class46) Static51.anInterface1_1).method1159();
		Static115.aClass29_25.method765();
		Static49.aClass26_Sub1_10.method1024();
		Static63.aClass26_Sub1_13.method1024();
		Static4.aClass26_Sub1_17.method1024();
		Static82.aClass26_Sub1_15.method1024();
		Static45.aClass26_Sub1_7.method1024();
		Static42.aClass26_Sub1_6.method1024();
		Static134.aClass26_Sub1_20.method1024();
		Static47.aClass26_Sub1_8.method1024();
		Static83.aClass26_Sub1_16.method1024();
		Static49.aClass26_Sub1_9.method1024();
		Static19.aClass26_Sub1_3.method1024();
		Static121.aClass26_Sub1_19.method1024();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1748() {
		for (@Pc(17) Class5_Sub2_Sub2_Sub2 local17 = (Class5_Sub2_Sub2_Sub2) Static119.aClass58_66.method1669(); local17 != null; local17 = (Class5_Sub2_Sub2_Sub2) Static119.aClass58_66.method1664()) {
			if (Static93.anInt2428 != local17.anInt686 || local17.anInt693 < Static58.anInt1422) {
				local17.method2189();
			} else if (Static58.anInt1422 >= local17.anInt676) {
				if (local17.anInt680 > 0) {
					@Pc(54) Class5_Sub2_Sub2_Sub3_Sub1 local54 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local17.anInt680 - 1];
					if (local54 != null && local54.anInt2912 >= 0 && local54.anInt2912 < 13312 && local54.anInt2875 >= 0 && local54.anInt2875 < 13312) {
						local17.method484(Static42.method757(local17.anInt686, local54.anInt2912, local54.anInt2875) - local17.anInt690, Static58.anInt1422, local54.anInt2912, local54.anInt2875);
					}
				}
				if (local17.anInt680 < 0) {
					@Pc(107) int local107 = -local17.anInt680 - 1;
					@Pc(116) Class5_Sub2_Sub2_Sub3_Sub2 local116;
					if (local107 == Static85.anInt2316) {
						local116 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10;
					} else {
						local116 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local107];
					}
					if (local116 != null && local116.anInt2912 >= 0 && local116.anInt2912 < 13312 && local116.anInt2875 >= 0 && local116.anInt2875 < 13312) {
						local17.method484(Static42.method757(local17.anInt686, local116.anInt2912, local116.anInt2875) - local17.anInt690, Static58.anInt1422, local116.anInt2912, local116.anInt2875);
					}
				}
				local17.method486(Static8.anInt198);
				Static61.aClass81_1.method2115(Static93.anInt2428, (int) local17.aDouble5, (int) local17.aDouble8, (int) local17.aDouble7, 60, local17, local17.anInt675, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I")
	public static int method1749() {
		return 6;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I")
	public static int method1750(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method1751() {
		if (Static4.aClass34_2 != null) {
			@Pc(3) Class34 local3 = Static4.aClass34_2;
			synchronized (Static4.aClass34_2) {
				Static4.aClass34_2 = null;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public static void method1752() {
		aClass61_802 = null;
		aClass61_803 = null;
		aClass66Array1 = null;
		aClass61_808 = null;
		aClass26_24 = null;
		aClass61_805 = null;
		aClass61_804 = null;
		aClass61_806 = null;
		aClass61_807 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method1753(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
