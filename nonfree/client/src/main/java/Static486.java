import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static486 {

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "Lclient!gh;")
	public static Class118 aClass118_4;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_118 = new Class71(93, -2);

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_93 = new Class257(65, 7);

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method7166(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
