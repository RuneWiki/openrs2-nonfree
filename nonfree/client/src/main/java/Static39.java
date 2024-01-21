import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
	public static int anInt1072;

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
	public static int anInt1074;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public static int anInt1062 = 0;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "Lclient!ad;")
	public static Class4 aClass4_541 = Static75.method1216("headicons_hint");

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
	public static volatile int anInt1066 = -1;

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
	public static int anInt1067 = 0;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "Lclient!hd;")
	public static Class34 aClass34_4 = new Class34(32);

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_542 = Static75.method1216("Drop");

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
	public static int anInt1073 = 0;

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_543 = aClass4_542;

	@OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!ha", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public static void method727() {
		Static95.anInt2230 = 0;
		Static29.anInt911 = 0;
		Static44.method805();
		Static106.method1812();
		Static96.method1162();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static29.anInt911; local22++) {
			local28 = Static1.anIntArray1[local22];
			if (Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local28].anInt2343 != Static60.anInt1489) {
				Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local28].aClass3_Sub1_Sub17_1 = null;
				Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local28] = null;
			}
		}
		if (Static65.anInt1630 != Static32.aClass3_Sub4_Sub1_2.anInt627) {
			throw new RuntimeException("gnp1 pos:" + Static32.aClass3_Sub4_Sub1_2.anInt627 + " psize:" + Static65.anInt1630);
		}
		for (local28 = 0; local28 < Static29.anInt905; local28++) {
			if (Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static24.anIntArray40[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static29.anInt905);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public static void method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class20 local15 = Static22.aClass20ArrayArrayArray1[Static49.anInt1203][arg0][arg1];
		if (local15 == null) {
			Static38.aClass61_30.method1305(Static49.anInt1203, arg0, arg1);
			return;
		}
		@Pc(25) int local25 = -99999999;
		@Pc(27) Class3_Sub1_Sub1_Sub2 local27 = null;
		@Pc(32) Class3_Sub1_Sub1_Sub2 local32;
		for (local32 = (Class3_Sub1_Sub1_Sub2) local15.method308(); local32 != null; local32 = (Class3_Sub1_Sub1_Sub2) local15.method309()) {
			@Pc(38) Class3_Sub1_Sub2 local38 = Static3.method1550(local32.anInt197);
			@Pc(41) int local41 = local38.anInt753;
			if (local38.anInt748 == 1) {
				local41 *= local32.anInt199 + 1;
			}
			if (local25 < local41) {
				local27 = local32;
				local25 = local41;
			}
		}
		if (local27 == null) {
			Static38.aClass61_30.method1305(Static49.anInt1203, arg0, arg1);
			return;
		}
		local15.method307(local27);
		@Pc(82) Class3_Sub1_Sub1_Sub2 local82 = null;
		@Pc(84) Class3_Sub1_Sub1_Sub2 local84 = null;
		for (local32 = (Class3_Sub1_Sub1_Sub2) local15.method308(); local32 != null; local32 = (Class3_Sub1_Sub1_Sub2) local15.method309()) {
			if (local32.anInt197 != local27.anInt197) {
				if (local82 == null) {
					local82 = local32;
				}
				if (local32.anInt197 != local82.anInt197 && local84 == null) {
					local84 = local32;
				}
			}
		}
		@Pc(123) int local123 = arg0 + (arg1 << 7) + 1610612736;
		Static38.aClass61_30.method1311(Static49.anInt1203, arg0, arg1, Static82.method1293(arg0 * 128 + 64, Static49.anInt1203, arg1 * 128 + 64), local27, local123, local82, local84);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public static void method729() {
		Static16.method229(Static60.anInt1484);
		if (Static29.anInt909 != -1) {
			Static16.method229(Static29.anInt909);
		}
		Static85.anInt1995 = 0;
		Static4.aClass25_18.method1157();
		Static15.anIntArray32 = Static99.method1592(Static15.anIntArray32);
		Static50.method1842();
		Static73.method1186(503, 765, 0, Static60.anInt1484);
		if (Static29.anInt909 != -1) {
			Static73.method1186(503, 765, 0, Static29.anInt909);
		}
		if (Static106.aBoolean231) {
			Static104.method1698();
		} else {
			Static68.method1120();
			Static90.method1918();
		}
		try {
			@Pc(59) Graphics local59 = Static9.aCanvas1.getGraphics();
			Static4.aClass25_18.method1161(0, local59, 0);
		} catch (@Pc(72) Exception local72) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!aa;Ljava/awt/Component;I)Lclient!le;")
	public static Class3_Sub3_Sub2 method730(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Component arg1) {
		Static101.method1674(arg1, arg0);
		@Pc(16) Class3_Sub3_Sub2 local16 = new Class3_Sub3_Sub2();
		Static87.method987(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public static void method731() {
		aClass4_543 = null;
		aClass4_541 = null;
		anIntArray112 = null;
		aClass34_4 = null;
		aClass4_542 = null;
		aBooleanArray8 = null;
		aBooleanArray7 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V")
	public static void method732(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static103.method1696(Static78.aClass4_223, Static74.aClass4_953, Static71.aClass4_906);
		} else if (arg0 == -2) {
			Static103.method1696(Static55.aClass4_713, Static74.aClass4_960, Static74.aClass4_932);
		} else if (arg0 == -1) {
			Static103.method1696(Static78.aClass4_230, Static74.aClass4_961, Static89.aClass4_1156);
		} else if (arg0 == 3) {
			Static103.method1696(Static9.aClass4_165, Static74.aClass4_935, Static74.aClass4_937);
		} else if (arg0 == 4) {
			Static103.method1696(Static53.aClass4_1361, Static74.aClass4_956, Static54.aClass4_678);
		} else if (arg0 == 5) {
			Static103.method1696(Static79.aClass4_1054, Static74.aClass4_936, Static82.aClass4_1073);
		} else if (arg0 == 6) {
			Static103.method1696(Static103.aClass4_1396, Static74.aClass4_962, Static36.aClass4_527);
		} else if (arg0 == 7) {
			Static103.method1696(Static48.aClass4_623, Static74.aClass4_959, Static101.aClass4_1385);
		} else if (arg0 == 8) {
			Static103.method1696(Static111.aClass4_1557, Static74.aClass4_958, Static35.aClass4_317);
		} else if (arg0 == 9) {
			Static103.method1696(Static21.aClass4_250, Static74.aClass4_949, Static47.aClass4_604);
		} else if (arg0 == 10) {
			Static103.method1696(Static43.aClass4_576, Static74.aClass4_940, Static35.aClass4_323);
		} else if (arg0 == 11) {
			Static103.method1696(Static10.aClass4_179, Static74.aClass4_950, Static92.aClass4_1191);
		} else if (arg0 == 12) {
			Static103.method1696(Static48.aClass4_620, Static74.aClass4_934, Static65.aClass4_830);
		} else if (arg0 == 13) {
			Static103.method1696(Static78.aClass4_225, Static74.aClass4_942, Static45.aClass4_583);
		} else if (arg0 == 14) {
			Static103.method1696(Static93.aClass4_1341, Static74.aClass4_964, Static101.aClass4_1387);
		} else if (arg0 == 16) {
			Static103.method1696(Static48.aClass4_627, Static74.aClass4_952, Static71.aClass4_909);
		} else if (arg0 == 17) {
			Static103.method1696(Static86.aClass4_1126, Static74.aClass4_957, Static82.aClass4_1086);
		} else if (arg0 == 18) {
			Static103.method1696(Static74.aClass4_968, Static74.aClass4_951, Static87.aClass4_745);
		} else if (arg0 == 20) {
			Static103.method1696(Static78.aClass4_226, Static74.aClass4_931, Static100.aClass4_1349);
		} else if (arg0 == 22) {
			Static103.method1696(Static16.aClass4_197, Static74.aClass4_933, Static75.aClass4_990);
		} else if (arg0 == 23) {
			Static103.method1696(Static93.aClass4_1343, Static74.aClass4_965, Static11.aClass4_1597);
		} else if (arg0 == 24) {
			Static103.method1696(Static25.aClass4_351, Static74.aClass4_947, Static5.aClass4_113);
		} else if (arg0 == 25) {
			Static103.method1696(Static78.aClass4_232, Static74.aClass4_948, Static73.aClass4_928);
		} else if (arg0 == 26) {
			Static103.method1696(Static48.aClass4_621, Static74.aClass4_944, Static32.aClass4_458);
		} else if (arg0 == 27) {
			Static103.method1696(Static64.aClass4_823, Static74.aClass4_945, Static74.aClass4_938);
		} else {
			Static103.method1696(Static78.aClass4_222, Static74.aClass4_963, Static25.aClass4_353);
		}
		Static60.method1007(10);
	}
}
