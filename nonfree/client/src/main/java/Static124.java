import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array8;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString77 = "";

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public static int anInt2686 = 1;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString78 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!lc;III)Lclient!tb;")
	public static Class59_Sub2 method2086(@OriginalArg(0) Class98 arg0, @OriginalArg(3) int arg1) {
		return Static292.method4344(arg1, 0, arg0) ? Static59.method2487() : null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method2087() {
		aString77 = null;
		aClass4_Sub2_Sub1Array8 = null;
		aString78 = null;
	}
}
