import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	public static int anInt2803;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!od;")
	private static Class60 aClass60_1101 = Static41.method597("Your account is already logged in)3");

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	public static int anInt2802 = -1;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_1102 = aClass60_1101;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!od;")
	private static Class60 aClass60_1103 = Static41.method597("yellow:");

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_1104 = aClass60_1103;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_1105 = Static41.method597("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_1106 = aClass60_1103;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!od;")
	public static Class60 aClass60_1107 = Static41.method597("null");

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!od;")
	public static Class60 aClass60_1108 = null;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Lclient!od;")
	public static Class60 aClass60_1109 = Static41.method597("<col=00ffff>");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)Z")
	public static boolean method1929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!rd;IIII)V")
	public static void method1930(@OriginalArg(1) Class4_Sub3_Sub6_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg4 * arg4 + arg1 * arg1;
		if (local19 <= 4225 || local19 >= 90000) {
			Static80.method1279(arg3, arg0, arg2, arg4, arg1);
			return;
		}
		@Pc(42) int local42 = Static79.anInt1896 + Static62.anInt1585 & 0x7FF;
		@Pc(46) int local46 = Class4_Sub3_Sub6_Sub4.anIntArray301[local42];
		@Pc(50) int local50 = Class4_Sub3_Sub6_Sub4.anIntArray304[local42];
		@Pc(58) int local58 = local46 * 256 / (Static116.anInt2717 + 256);
		@Pc(66) int local66 = local50 * 256 / (Static116.anInt2717 + 256);
		@Pc(76) int local76 = arg1 * local66 - local58 * arg4 >> 16;
		@Pc(87) int local87 = arg1 * local58 + arg4 * local66 >> 16;
		@Pc(93) double local93 = Math.atan2((double) local87, (double) local76);
		@Pc(99) int local99 = (int) (Math.sin(local93) * 63.0D);
		@Pc(105) int local105 = (int) (Math.cos(local93) * 57.0D);
		Static6.aClass4_Sub3_Sub6_Sub3_1.method1617(arg2 + local99 + 4 + 94 - 10, -local105 + arg3 + 63, local93);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method1931() {
		aClass60_1108 = null;
		aClass60_1104 = null;
		aClass60_1109 = null;
		aClass60_1101 = null;
		aClass60_1102 = null;
		aClass60_1105 = null;
		aClass60_1106 = null;
		aFontMetrics1 = null;
		aClass60_1103 = null;
		aClass60_1107 = null;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public static void method1932() {
		if (Static72.aClass37_6 != null) {
			Static72.aClass37_6.method877();
			Static72.aClass37_6 = null;
		}
		Static86.method1378();
		Static30.aClass48_1.method1040();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static50.aClass28Array3[local23].method610();
		}
		System.gc();
		Static30.method480();
		Static23.anInt808 = -1;
		Static130.aBoolean126 = false;
		Static19.method373();
		Static32.method496(10);
	}
}
