import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1133 = Static120.method1824(" ");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1132 = aClass80_1133;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1134 = Static120.method1824("::qa_op_test");

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1135 = Static120.method1824("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1136 = Static120.method1824("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(JB)Lclient!rd;")
	public static Class80 method2052(@OriginalArg(0) long arg0) {
		return Static154.method2426(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBI)I")
	public static int method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static18.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static18.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	public static void method2057() {
		Static161.aClass5_49.method146();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJ)V")
	public static void method2059(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static154.method2457(arg0 - 1L);
			Static154.method2457(1L);
		} else {
			Static154.method2457(arg0);
		}
	}
}
