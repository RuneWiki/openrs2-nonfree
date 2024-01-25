import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "Z")
	public static boolean aBoolean748;

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_249 = new Class87(4);

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "[Lclient!bfa;")
	public static final Class4_Sub2_Sub1_Sub1_Sub1[] aClass4_Sub2_Sub1_Sub1_Sub1Array12 = new Class4_Sub2_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
	public static int anInt10472 = 0;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!raa;B)Ljava/lang/String;")
	public static String method8896(@OriginalArg(0) Class295 arg0) {
		if (Static75.method1286(arg0).method6707() == 0) {
			return null;
		} else if (arg0.aString91 == null || arg0.aString91.trim().length() == 0) {
			return Static132.aBoolean513 ? "Hidden-use" : null;
		} else {
			return arg0.aString91;
		}
	}
}
