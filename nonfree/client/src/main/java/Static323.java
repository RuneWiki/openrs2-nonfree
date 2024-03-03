import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public static int anInt6434;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 6)
	public static void method5829() {
		Class162.aBoolean297 = true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!r;Lclient!wm;)V", line = 43)
	public static void method5831(@OriginalArg(1) Class197 arg0, @OriginalArg(2) Class19 arg1) {
		if (Static260.aBoolean383) {
			return;
		}
		arg1.method2869(0);
		Static232.aClass13_14 = arg1.method2893(Static372.method1678(arg0, Class2_Sub9.anInt1734));
		Static232.aClass13_14.method6386((Static231.anInt4656 - Static232.aClass13_14.method6400()) / 2, (Static161.anInt3295 - Static232.aClass13_14.method6385()) / 2);
		Static310.aClass13_21 = arg1.method2893(Static372.method1678(arg0, Class173_Sub2.anInt4846));
		Static310.aClass13_21.method6386((Static231.anInt4656 - Static310.aClass13_21.method6400()) / 2, 18);
		Static260.aBoolean383 = true;
	}
}
