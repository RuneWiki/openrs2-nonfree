import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static638 {

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
	public static int anInt7975;

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_268 = new Class288(31, 3);

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "J")
	public static long aLong221 = -1L;

	@OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
	public static int anInt7981 = 7000;

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
	public static int anInt7982 = anInt7981;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method6786(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
