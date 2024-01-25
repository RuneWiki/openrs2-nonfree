import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static352.method5522(arg1, arg0) & Static51.method7363(arg0, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method6780(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
