import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!bu;")
	public static Class32 aClass32_17;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!an;")
	public static final Class11 aClass11_4 = new Class11(16);

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!ug;")
	public static Class243 aClass243_7 = new Class243();

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public static final int anInt1170 = 1403;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IF)F")
	public static float method854(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
	public static int method858(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!cu;I)Lclient!tn;")
	public static Class71_Sub3 method861(@OriginalArg(0) Class3_Sub7 arg0) {
		return new Class71_Sub3(arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2604(), arg0.method2582());
	}
}
