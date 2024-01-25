import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "Lclient!la;")
	public static Class37 aClass37_11;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
	public static int anInt4965;

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "Lclient!mb;")
	public static final Class220 aClass220_8 = new Class220();

	@OriginalMember(owner = "client!cm", name = "A", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_37 = new Class70();

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "[I")
	public static final int[] anIntArray337 = new int[2];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4251(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lclient!eda;")
	public static Class86_Sub1 method4252() {
		return Static505.anInt8015 < Static495.aClass86_Sub1Array2.length ? Static495.aClass86_Sub1Array2[Static505.anInt8015++] : null;
	}
}
