import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	public static int anInt5740;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!la;")
	public static Class207 aClass207_68;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt5733 = -1;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_106 = new Class337(117, 6);

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5094(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method5095() {
		Static519.aClass295ArrayArray2 = new Class295[Static546.aClass207_114.method4685()][];
		Static321.aClass295ArrayArray1 = new Class295[Static546.aClass207_114.method4685()][];
		Static490.aBooleanArray25 = new boolean[Static546.aClass207_114.method4685()];
	}
}
