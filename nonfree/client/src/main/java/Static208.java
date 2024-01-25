import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
	public static int anInt4252;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
	public static void method3674() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static353.aBooleanArray124[local5] = true;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method3675(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
