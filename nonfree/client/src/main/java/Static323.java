import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Lclient!jb;")
	public static Class50_Sub1 aClass50_Sub1_1;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_74 = new Class215(43, 2);

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public static int anInt5620 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Z")
	public static boolean method4382(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 15 || arg0 == 21 || arg0 == 3 || arg0 == 50) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method4383(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
