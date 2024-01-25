import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public static int anInt970;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public static int anInt975 = 1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method862() {
		Static377.aClass238_40.method5841();
		Static423.anInt10048 = 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method863(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
