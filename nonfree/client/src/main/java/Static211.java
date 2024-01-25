import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	public static int anInt3648;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	public static int anInt3646 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method2967() {
		Static148.aClipboard1 = null;
		Static55.anIntArray146 = null;
		Static380.aBoolean567 = false;
		Static197.anIntArray410 = null;
		Static100.anIntArray749 = null;
		Static265.aBooleanArray22 = null;
		Static262.method5507();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public static void method2968() {
		if (Static216.aClass14_1 != null) {
			Static216.aClass14_1.method4893();
		}
		if (Static296.aClass14_2 != null) {
			Static296.aClass14_2.method4893();
		}
		Static227.method4204(Static188.aClass135_Sub1_1.aBoolean325);
		Static216.aClass14_1 = Static55.method899(22050, Static177.aCanvas3, 0, Static341.aClass162_5);
		Static216.aClass14_1.method4894(Static90.aClass1_Sub7_Sub1_1);
		Static296.aClass14_2 = Static55.method899(2048, Static177.aCanvas3, 1, Static341.aClass162_5);
		Static296.aClass14_2.method4894(Static366.aClass1_Sub7_Sub4_2);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ui;Lclient!tq;I)V")
	public static void method2969(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class164 arg1) {
		if (Static35.aBoolean62) {
			return;
		}
		arg1.method5402(0);
		Static247.aClass51_11 = arg1.method5360(Static397.method1430(arg0, Static386.anInt6288));
		Static247.aClass51_11.method4669((Static136.anInt6304 - Static247.aClass51_11.method4682()) / 2, (Static218.anInt3871 - Static247.aClass51_11.method4673()) / 2);
		Static71.aClass51_2 = arg1.method5360(Static397.method1430(arg0, Static187.anInt3284));
		Static71.aClass51_2.method4669((Static136.anInt6304 - Static71.aClass51_2.method4682()) / 2, 18);
		Static35.aBoolean62 = true;
	}
}
