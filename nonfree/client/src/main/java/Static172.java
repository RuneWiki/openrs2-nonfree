import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "Lclient!of;")
	public static Class40 aClass40_10;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "[I")
	public static final int[] anIntArray388 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	public static final int anInt3231 = 12;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
	public static int anInt3234 = 0;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	public static int anInt3235 = 1;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "[I")
	public static final int[] anIntArray389 = new int[14];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3362(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
	public static void method3365() {
		Static170.method3312();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
	public static void method3366(@OriginalArg(1) int arg0) {
		if (Static31.method490(arg0)) {
			Static22.method338(-1, Static81.aClass132ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I")
	public static int method3367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static265.aByteArrayArrayArray11[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static265.aByteArrayArrayArray11[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
