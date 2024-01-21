import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!ke;")
	public static Class43 aClass43_16;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public static int anInt1528;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_3;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public static int anInt1518 = 0;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_602 = Static146.method2172("l");

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	public static int anInt1521 = 0;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	public static int anInt1522 = 0;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "[Lclient!vg;")
	public static Class2_Sub2_Sub1_Sub6_Sub1[] aClass2_Sub2_Sub1_Sub6_Sub1Array1 = new Class2_Sub2_Sub1_Sub6_Sub1[2048];

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_603 = Static146.method2172(")3runescape)3com");

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!sg;")
	public static Class77 aClass77_604 = Static146.method2172("mn");

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_605 = Static146.method2172(": ");

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public static int anInt1526 = 0;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!sg;")
	public static Class77 aClass77_606 = Static146.method2172("Spieler");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1063() {
		aClass2_Sub2_Sub3_Sub2_3 = null;
		aClass77_605 = null;
		aClass43_16 = null;
		aClass77_603 = null;
		aClass77_602 = null;
		aClass77_604 = null;
		aClass2_Sub2_Sub1_Sub6_Sub1Array1 = null;
		aClass77_606 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ke;IIZII)V")
	public static void method1066(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static100.anInt811 = 10000;
		Static176.anInt4481 = 1;
		Static120.aBoolean53 = false;
		Static42.anInt1180 = arg3;
		Static71.anInt1924 = arg1;
		Static3.aClass43_1 = arg0;
		anInt1528 = arg2;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lclient!ih;")
	public static Class2_Sub10 method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub10 local7 = new Class2_Sub10();
		local7.anInt1896 = arg1;
		local7.anInt1899 = arg0;
		Static177.aClass74_12.method2432((long) arg2, local7);
		Static170.method2835(arg1);
		Static163.method2751(arg1);
		@Pc(29) Class66 local29 = Static55.method1034(arg2);
		if (local29 != null) {
			Static57.method2994(local29);
		}
		if (Static49.aClass66_6 != null) {
			Static57.method2994(Static49.aClass66_6);
			Static49.aClass66_6 = null;
		}
		Static18.anInt618 = 0;
		Static166.aBoolean181 = false;
		Static5.method100(Static156.anInt3881, Static64.anInt1811, Static17.anInt608, Static147.anInt3576);
		if (Static93.anInt2394 != -1) {
			Static175.method2950(Static93.anInt2394, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([BIII)Lclient!sg;")
	public static Class77 method1070(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class77 local7 = new Class77();
		local7.anInt3606 = 0;
		local7.aByteArray46 = new byte[arg2];
		for (@Pc(16) int local16 = arg1; local16 < arg2 + arg1; local16++) {
			if (arg0[local16] != 0) {
				local7.aByteArray46[local7.anInt3606++] = arg0[local16];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public static void method1071(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static128.method2194(Static7.aClass77_104, Static64.aClass77_715, Static100.aClass77_336);
		} else if (arg0 == -2) {
			Static128.method2194(Static7.aClass77_106, Static7.aClass77_117, Static38.aClass77_433);
		} else if (arg0 == -1) {
			Static128.method2194(Static7.aClass77_126, Static25.aClass77_313, Static100.aClass77_331);
		} else if (arg0 == 3) {
			Static128.method2194(Static7.aClass77_99, Static7.aClass77_91, Static64.aClass77_712);
		} else if (arg0 == 4) {
			Static128.method2194(Static7.aClass77_87, Static144.aClass77_1248, Static86.aClass77_882);
		} else if (arg0 == 5) {
			Static128.method2194(Static7.aClass77_88, Static79.aClass77_824, Static120.aClass77_407);
		} else if (arg0 == 6) {
			Static128.method2194(Static7.aClass77_114, Static165.aClass77_1378, Static8.aClass77_132);
		} else if (arg0 == 7) {
			Static128.method2194(Static7.aClass77_125, Static115.aClass77_1081, Static20.aClass77_283);
		} else if (arg0 == 8) {
			Static128.method2194(Static7.aClass77_100, Static55.aClass77_591, Static180.aClass77_1562);
		} else if (arg0 == 9) {
			Static128.method2194(Static7.aClass77_110, Static138.aClass77_1201, Static87.aClass77_892);
		} else if (arg0 == 10) {
			Static128.method2194(Static7.aClass77_89, Static55.aClass77_588, Static11.aClass77_152);
		} else if (arg0 == 11) {
			Static128.method2194(Static7.aClass77_118, Static171.aClass77_1456, Static56.aClass77_599);
		} else if (arg0 == 12) {
			Static128.method2194(Static7.aClass77_122, Static154.aClass77_1313, Static8.aClass77_128);
		} else if (arg0 == 13) {
			Static128.method2194(Static7.aClass77_112, Static110.aClass77_1221, Static100.aClass77_335);
		} else if (arg0 == 14) {
			Static128.method2194(Static7.aClass77_105, Static137.aClass77_1189, Static50.aClass77_541);
		} else if (arg0 == 16) {
			Static128.method2194(Static7.aClass77_97, Static52.aClass77_564, Static128.aClass77_1147);
		} else if (arg0 == 17) {
			Static128.method2194(Static7.aClass77_123, Static152.aClass77_1287, Static118.aClass77_1095);
		} else if (arg0 == 18) {
			Static128.method2194(Static7.aClass77_102, Static3.aClass77_24, Static91.aClass77_912);
		} else if (arg0 == 19) {
			Static128.method2194(Static20.aClass77_278, Static91.aClass77_913, Static66.aClass77_730);
		} else if (arg0 == 20) {
			Static128.method2194(Static7.aClass77_93, Static128.aClass77_1150, Static100.aClass77_330);
		} else if (arg0 == 22) {
			Static128.method2194(Static7.aClass77_83, Static105.aClass77_994, Static37.aClass77_423);
		} else if (arg0 == 23) {
			Static128.method2194(Static7.aClass77_108, Static38.aClass77_432, Static50.aClass77_542);
		} else if (arg0 == 24) {
			Static128.method2194(Static7.aClass77_90, Static86.aClass77_884, Static4.aClass77_1502);
		} else if (arg0 == 25) {
			Static128.method2194(Static7.aClass77_92, Static121.aClass77_1106, Static100.aClass77_333);
		} else if (arg0 == 26) {
			Static128.method2194(Static7.aClass77_95, Static78.aClass77_818, Static83.aClass77_855);
		} else if (arg0 == 27) {
			Static128.method2194(Static7.aClass77_124, Static7.aClass77_101, Static115.aClass77_1083);
		} else {
			Static128.method2194(Static7.aClass77_96, Static106.aClass77_1007, Static100.aClass77_337);
		}
		Static123.method2155(10);
	}
}
