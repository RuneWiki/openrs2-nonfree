import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!og", name = "l", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_152 = new Class48(11, 16);

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
	public static final int[] anIntArray538 = new int[2048];

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3891(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
	public static int method3893(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
