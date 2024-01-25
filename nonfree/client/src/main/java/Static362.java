import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static362 {

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
	public static int anInt6170;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Lclient!jd;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!rr", name = "L", descriptor = "Lclient!of;")
	public static final Class174 aClass174_178 = new Class174("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method5072(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
