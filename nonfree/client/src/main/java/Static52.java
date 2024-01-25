import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!tja;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!iia;")
	public static Class175 aClass175_1;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Lclient!sfa;")
	public static Class14_Sub2_Sub17 aClass14_Sub2_Sub17_1 = null;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
	public static int method948() {
		return Static18.anInt243 == 1 ? Static187.anInt3099 : Static453.anInt7570;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BFFF)I")
	public static int method950(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(19) float local19 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(29) float local29 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(39) float local39 = arg1 < 0.0F ? -arg1 : arg1;
		if (local19 < local29 && local39 < local29) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local39 > local19 && local29 < local39) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V")
	public static void method951(@OriginalArg(0) int arg0) {
		Static686.anInt11152 = 2;
		Static426.anInt7228 = arg0;
		Static591.aClass347_3 = Static277.aClass347_2;
		Static56.method1003("", Static423.aString83.equals(""), Static423.aString83, true);
	}
}
