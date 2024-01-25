import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!raa", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!raa", name = "G", descriptor = "Z")
	public static boolean aBoolean537 = false;

	@OriginalMember(owner = "client!raa", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[6][];

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method6328(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "(B)V")
	public static void method6329() {
		Static249.aClass66_9.X(Static148.anInt7119, Static189.aClass4_Sub2_Sub1_1.aBoolean657 ? Static530.anInt9010 + 256 << 2 : -1, 0);
	}
}
