import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static623 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
	public static boolean aBoolean725 = false;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static int anInt9826 = 0;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public static int anInt9828 = 0;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString118 = "";

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method8540(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	public static void method8541(@OriginalArg(1) boolean arg0) {
		Static530.method7616(Static535.anInt4128, arg0, Static274.anInt3226, Static635.anInt9910);
	}
}
