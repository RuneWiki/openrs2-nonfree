import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt6242 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method5301() {
		if (Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503) || Static282.anInt4677 == anInt6242) {
			Static266.method3782(Static176.aClass121_5);
			if (Static146.anInt2584 != Static282.anInt4677) {
				Static358.method5319();
			}
		} else {
			Static242.method3514(false, Static374.anInt6445, 11, Static274.anInt3319);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5302(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		Static136.method2051(Static63.aClass160_20);
		Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(arg0) + 1);
		Static218.aClass6_Sub14_Sub2_1.method6040(arg1);
		Static218.aClass6_Sub14_Sub2_1.method5989(arg0);
	}
}
