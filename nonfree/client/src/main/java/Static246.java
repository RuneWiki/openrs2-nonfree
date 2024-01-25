import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	public static int anInt3973;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!m;")
	public static Class153 aClass153_4;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Lclient!rb;")
	public static Class211 aClass211_95;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "I")
	public static int anInt3968 = -1;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public static final int anInt3969 = 1339;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_123 = new Class102(8, 8);

	@OriginalMember(owner = "client!me", name = "F", descriptor = "I")
	public static int anInt3975 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3144(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
