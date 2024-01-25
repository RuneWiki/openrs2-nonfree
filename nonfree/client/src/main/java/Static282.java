import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static282 {

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "Lclient!nca;")
	public static Class254 aClass254_91;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Lclient!bs;")
	public static final Class49 aClass49_1 = new Class49();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3954(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method3956(@OriginalArg(0) File arg0) {
		return Static64.method963((int) arg0.length(), arg0);
	}
}
