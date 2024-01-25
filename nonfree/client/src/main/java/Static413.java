import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static413 {

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	public static int anInt7711 = -1;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "[I")
	public static final int[] anIntArray477 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method6466(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
