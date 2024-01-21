import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 aClass1_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!rd;")
	private static Class64 aClass64_115 = Static69.method1153("M");

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_106 = aClass64_115;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!rd;")
	private static Class64 aClass64_107 = Static69.method1153("Connecting to update server");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!rd;")
	private static Class64 aClass64_109 = Static69.method1153("Please try using a different world)3");

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_108 = aClass64_109;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_110 = aClass64_109;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_111 = aClass64_109;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_112 = aClass64_107;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array1 = new Class64[200];

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_113 = Static69.method1153("0(U");

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_114 = aClass64_109;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_116 = aClass64_109;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!rd;")
	private static Class64 aClass64_117 = Static69.method1153("Login limit exceeded)3");

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_118 = Static69.method1153(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
	public static int anInt116 = 0;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_119 = aClass64_109;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_120 = aClass64_117;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
	public static void method125(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class1_Sub13 local13 = (Class1_Sub13) Static10.aClass58_1.method1373(); local13 != null; local13 = (Class1_Sub13) Static10.aClass58_1.method1379()) {
			if ((long) arg0 == (local13.aLong87 >> 48 & 0xFFFFL)) {
				local13.method2076();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)Lclient!sa;")
	public static Class1_Sub1_Sub14 method126(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub14 local10 = (Class1_Sub1_Sub14) Static102.aClass19_88.method410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static119.aClass41_78.method1062(1, arg0);
		local10 = new Class1_Sub1_Sub14();
		if (local20 != null) {
			local10.method1562(arg0, new Class1_Sub6(local20));
		}
		local10.method1568();
		Static102.aClass19_88.method409(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Z")
	public static boolean method127(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static95.anIntArray315[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 7;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method128() {
		@Pc(12) Object local12 = Static28.anObject6;
		synchronized (Static28.anObject6) {
			if (Static31.anInt801 == 0) {
				Static28.aClass28_6.method579(5, new Class15());
			}
			Static31.anInt801 = 600;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method129() {
		aClass64_108 = null;
		aClass64_118 = null;
		aClass64_110 = null;
		aClass64_115 = null;
		aClass64_120 = null;
		aClass64_119 = null;
		aClass64_112 = null;
		aClass64_117 = null;
		aClass64_116 = null;
		aClass64_107 = null;
		aClass64_109 = null;
		aClass64_106 = null;
		aClass64Array1 = null;
		aClass1_Sub1_Sub5_Sub1_1 = null;
		aClass64_113 = null;
		aClass64_111 = null;
		aClass64_114 = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public static void method130() {
		Static64.aClass1_Sub6_Sub1_2.method1879();
		@Pc(11) int local11 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static64.aClass1_Sub6_Sub1_2.method1873(2);
		if (local22 == 0) {
			Static96.anIntArray436[Static39.anInt914++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local22 == 1) {
			local43 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
			Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1688(false, local43);
			local53 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
			if (local53 == 1) {
				Static96.anIntArray436[Static39.anInt914++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local22 == 2) {
			local43 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
			Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1688(true, local43);
			local53 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
			Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1688(true, local53);
			local93 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
			if (local93 == 1) {
				Static96.anIntArray436[Static39.anInt914++] = 2047;
			}
		} else if (local22 == 3) {
			local43 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
			local53 = Static64.aClass1_Sub6_Sub1_2.method1873(7);
			local93 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
			if (local93 == 1) {
				Static96.anIntArray436[Static39.anInt914++] = 2047;
			}
			Static15.anInt463 = Static64.aClass1_Sub6_Sub1_2.method1873(2);
			@Pc(155) int local155 = Static64.aClass1_Sub6_Sub1_2.method1873(7);
			Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1689(local43 == 1, local155, local53);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	public static void method131(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static11.method268(Static83.aClass64_1200, Static23.aClass64_431, aClass64_111);
		} else if (arg0 == -2) {
			Static11.method268(Static83.aClass64_1195, Static83.aClass64_1217, Static70.aClass64_988);
		} else if (arg0 == -1) {
			Static11.method268(Static83.aClass64_1214, Static82.aClass64_1174, aClass64_110);
		} else if (arg0 == 3) {
			Static11.method268(Static83.aClass64_1210, Static83.aClass64_1181, Static2.aClass64_83);
		} else if (arg0 == 4) {
			Static11.method268(Static83.aClass64_1199, Static2.aClass64_84, Static58.aClass64_823);
		} else if (arg0 == 5) {
			Static11.method268(Static83.aClass64_1186, Static85.aClass64_1765, Static52.aClass64_1820);
		} else if (arg0 == 6) {
			Static11.method268(Static83.aClass64_1196, Static53.aClass64_782, Static5.aClass64_124);
		} else if (arg0 == 7) {
			Static11.method268(Static83.aClass64_1191, Static105.aClass64_1578, Static16.aClass64_325);
		} else if (arg0 == 8) {
			Static11.method268(Static83.aClass64_1183, Static98.aClass64_1398, Static75.aClass64_1073);
		} else if (arg0 == 9) {
			Static11.method268(Static83.aClass64_1206, aClass64_120, Static117.aClass64_1805);
		} else if (arg0 == 10) {
			Static11.method268(Static83.aClass64_1184, Static98.aClass64_1400, Static31.aClass64_488);
		} else if (arg0 == 11) {
			Static11.method268(Static83.aClass64_1189, Static101.aClass64_1452, Static21.aClass64_381);
		} else if (arg0 == 12) {
			Static11.method268(Static83.aClass64_1197, Static28.aClass64_1533, Static61.aClass64_888);
		} else if (arg0 == 13) {
			Static11.method268(Static83.aClass64_1207, Static71.aClass64_1019, aClass64_114);
		} else if (arg0 == 14) {
			Static11.method268(Static83.aClass64_1204, Static39.aClass64_604, Static91.aClass64_1291);
		} else if (arg0 == 16) {
			Static11.method268(Static83.aClass64_1209, Static106.aClass64_1602, Static91.aClass64_1292);
		} else if (arg0 == 17) {
			Static11.method268(Static83.aClass64_1221, Static120.aClass64_1841, Static121.aClass64_1845);
		} else if (arg0 == 18) {
			Static11.method268(Static83.aClass64_1192, Static50.aClass64_758, Static44.aClass64_697);
		} else if (arg0 == 19) {
			Static11.method268(Static16.aClass64_333, Static9.aClass64_252, Static60.aClass64_854);
		} else if (arg0 == 20) {
			Static11.method268(Static83.aClass64_1219, Static41.aClass64_1698, aClass64_108);
		} else if (arg0 == 22) {
			Static11.method268(Static83.aClass64_1212, Static83.aClass64_1211, Static62.aClass64_902);
		} else if (arg0 == 23) {
			Static11.method268(Static83.aClass64_1216, Static114.aClass64_1749, Static91.aClass64_1287);
		} else if (arg0 == 24) {
			Static11.method268(Static83.aClass64_1222, Static7.aClass64_240, Static57.aClass64_817);
		} else if (arg0 == 25) {
			Static11.method268(Static83.aClass64_1193, Static98.aClass64_1401, aClass64_119);
		} else if (arg0 == 26) {
			Static11.method268(Static83.aClass64_1187, Static10.aClass64_281, Static12.aClass64_1229);
		} else if (arg0 == 27) {
			Static11.method268(Static83.aClass64_1201, Static83.aClass64_1208, Static27.aClass64_583);
		} else {
			Static11.method268(Static83.aClass64_1194, Static53.aClass64_779, aClass64_116);
		}
		Static10.method258(10);
	}
}
