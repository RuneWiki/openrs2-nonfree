import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	public static int anInt2971;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "Lclient!st;")
	public static Class10_Sub1_Sub2_Sub2 aClass10_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
	public static int anInt2976;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	public static int anInt2966 = -1;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "Lclient!hi;")
	public static final Class141 aClass141_7 = new Class141(1);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2714(@OriginalArg(0) String arg0) {
		if (Class191.aString62.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class191.aString62.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class191.aString62.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)V")
	public static void method2715(@OriginalArg(1) int arg0) {
		Static70.anInt1454 = -1;
		Static397.anInt6936 = arg0;
		Static439.anInt9627 = -1;
		Static575.method7836();
	}
}
