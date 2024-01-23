import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!ah;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!ge;")
	public static Class39 aClass39_5 = new Class39(128);

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_195 = Static200.method3116(" <col=ffff00>");

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!kh;")
	private static Class60 aClass60_198 = Static200.method3116("flash1:");

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_196 = aClass60_198;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public static int anInt594 = 0;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_197 = Static200.method3116("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_199 = aClass60_198;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I")
	public static int method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIIII)V")
	public static void method430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			Static104.method1768(arg0, arg3, arg2, Static148.anIntArrayArray78[arg1]);
		} else {
			Static104.method1768(arg3, arg0, arg2, Static148.anIntArrayArray78[arg1]);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	public static int method431() {
		return Static24.anInt568;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	public static void method432() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static55.anInt1475; local1++) {
			for (local4 = 0; local4 < Static83.anInt1959; local4++) {
				for (local7 = 0; local7 < Static150.anInt3350; local7++) {
					Static100.aClass1_Sub22ArrayArrayArray3[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static77.anInt1873; local4++) {
			for (local7 = 0; local7 < Static77.anIntArray217[local4]; local7++) {
				Static77.aClass89ArrayArray1[local4][local7] = null;
			}
			Static77.anIntArray217[local4] = 0;
		}
		for (local7 = 0; local7 < Static4.anInt97; local7++) {
			Static141.aClass29Array2[local7] = null;
		}
		Static4.anInt97 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static16.aClass29Array1.length; local69++) {
			Static16.aClass29Array1[local69] = null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
	public static void method434(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static141.method2417(Static27.aClass60_213, Static27.aClass60_212, Static216.aClass60_1605);
		} else if (arg0 == -2) {
			Static141.method2417(Static216.aClass60_1617, Static1.aClass60_29, Static216.aClass60_1613);
		} else if (arg0 == -1) {
			Static141.method2417(Static176.aClass60_262, Static27.aClass60_211, Static216.aClass60_1610);
		} else if (arg0 == 3) {
			Static141.method2417(Static216.aClass60_1606, Static129.aClass60_379, Static216.aClass60_1584);
		} else if (arg0 == 4) {
			Static141.method2417(Static59.aClass60_460, Static128.aClass60_964, Static216.aClass60_1595);
		} else if (arg0 == 5) {
			Static141.method2417(Static85.aClass60_655, Static185.aClass60_1334, Static216.aClass60_1586);
		} else if (arg0 == 6) {
			Static141.method2417(Static86.aClass60_659, Static55.aClass60_444, Static216.aClass60_1607);
		} else if (arg0 == 7) {
			Static141.method2417(Static6.aClass60_61, Static114.aClass60_862, Static216.aClass60_1590);
		} else if (arg0 == 8) {
			Static141.method2417(Static82.aClass60_643, Static168.aClass60_1255, Static216.aClass60_1604);
		} else if (arg0 == 9) {
			Static141.method2417(Static204.aClass60_1488, Static101.aClass60_1242, Static216.aClass60_1597);
		} else if (arg0 == 10) {
			Static141.method2417(Static82.aClass60_639, Static49.aClass60_392, Static216.aClass60_1591);
		} else if (arg0 == 11) {
			Static141.method2417(Static201.aClass60_1468, Static112.aClass60_841, Static216.aClass60_1583);
		} else if (arg0 == 12) {
			Static141.method2417(Static79.aClass60_613, Static6.aClass60_62, Static216.aClass60_1587);
		} else if (arg0 == 13) {
			Static141.method2417(Static15.aClass60_129, Static27.aClass60_216, Static216.aClass60_1614);
		} else if (arg0 == 14) {
			Static141.method2417(Static208.aClass60_1517, Static155.aClass60_1195, Static216.aClass60_1594);
		} else if (arg0 == 16) {
			Static141.method2417(Static188.aClass60_1359, Static124.aClass60_934, Static216.aClass60_1611);
		} else if (arg0 == 17) {
			Static141.method2417(Static59.aClass60_463, Static5.aClass60_45, Static216.aClass60_1612);
		} else if (arg0 == 18) {
			Static141.method2417(Static191.aClass60_1376, Static100.aClass60_754, Static216.aClass60_1600);
		} else if (arg0 == 19) {
			Static141.method2417(Static84.aClass60_436, Static38.aClass60_289, Static114.aClass60_867);
		} else if (arg0 == 20) {
			Static141.method2417(Static66.aClass60_519, Static27.aClass60_214, Static216.aClass60_1603);
		} else if (arg0 == 22) {
			Static141.method2417(Static25.aClass60_191, Static49.aClass60_387, Static216.aClass60_1593);
		} else if (arg0 == 23) {
			Static141.method2417(Static196.aClass60_1422, Static155.aClass60_1193, Static216.aClass60_1616);
		} else if (arg0 == 24) {
			Static141.method2417(Static112.aClass60_842, Static173.aClass60_1277, Static216.aClass60_1609);
		} else if (arg0 == 25) {
			Static141.method2417(Static68.aClass60_536, Static27.aClass60_218, Static216.aClass60_1608);
		} else if (arg0 == 26) {
			Static141.method2417(Static56.aClass60_453, Static55.aClass60_447, Static216.aClass60_1582);
		} else if (arg0 == 27) {
			Static141.method2417(Static216.aClass60_1618, Static75.aClass60_583, Static216.aClass60_1601);
		} else {
			Static141.method2417(Static157.aClass60_1205, Static27.aClass60_217, Static216.aClass60_1619);
		}
		Static85.method1486(10);
	}
}
