import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt4546;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
	public static int[] anIntArray374 = new int[14];

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public static int anInt4539 = 0;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public static int anInt4542 = -1;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString228 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3657(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIB)I")
	public static int method3661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Z")
	public static boolean method3664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static253.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static183.anInt3890) {
			return false;
		} else if (local7 == Static183.anInt3890) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static113.method2086(local22 + 1, Static141.anIntArrayArrayArray4[arg0][arg1][arg2], local26 + 1) && Static113.method2086(local22 + 128 - 1, Static141.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local26 + 1) && Static113.method2086(local22 + 128 - 1, Static141.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static113.method2086(local22 + 1, Static141.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static253.anIntArrayArrayArray13[arg0][arg1][arg2] = Static183.anInt3890;
				return true;
			} else {
				Static253.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static183.anInt3890;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
	public static void method3666() {
		Static112.aClass46_17.method1068(5);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I")
	public static int method3667(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
