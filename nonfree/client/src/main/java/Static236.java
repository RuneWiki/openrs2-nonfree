import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	public static int anInt4460;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3973(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
}
