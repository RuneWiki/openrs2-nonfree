import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "Lclient!lb;")
	public static Class221 aClass221_42;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "Lclient!qg;")
	public static Class301 aClass301_1;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	public static int anInt2857 = -1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method2471(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method2474(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	public static void method2475() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static591.aClass83Array1[local3] = null;
		}
		if (15660 != 15660) {
			anImage1 = null;
		}
		Static111.anInt2225 = 0;
	}
}
