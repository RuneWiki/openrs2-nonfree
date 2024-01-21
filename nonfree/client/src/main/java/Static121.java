import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1332 = Static56.method816("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt2909 = 0;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1333 = Static56.method816("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1334 = Static56.method816(":clan:");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method1929() {
		aClass34_1334 = null;
		aClass34_1332 = null;
		aClass34_1333 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method1931(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
