import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!df;")
	public static Class49 aClass49_31;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Lclient!jm;")
	public static final Class2_Sub22 aClass2_Sub22_24 = new Class2_Sub22(0, 0);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Z")
	public static boolean aBoolean651 = false;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray53 = new boolean[100];

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public static int anInt7602 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method5890(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
