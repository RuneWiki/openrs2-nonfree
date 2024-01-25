import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static526 {

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "Lclient!pu;")
	public static Class293 aClass293_1;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "Lclient!dd;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "[I")
	public static final int[] anIntArray558 = new int[1024];

	@OriginalMember(owner = "client!ro", name = "G", descriptor = "[Lclient!ne;")
	public static final Class4_Sub5_Sub15[] aClass4_Sub5_Sub15Array4 = new Class4_Sub5_Sub15[14];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method7102(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
