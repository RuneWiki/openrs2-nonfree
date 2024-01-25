import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static427 {

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
	public static int anInt7214 = 0;

	@OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
	public static int anInt7220 = -1;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
	public static int anInt7221 = 0;

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "[I")
	public static final int[] anIntArray488 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
	public static void method5659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static325.anInt5565 = arg0;
		Static364.anInt3533 = arg5;
		Static357.anInt6117 = arg4;
		Static309.anInt5372 = arg3;
		Static85.anInt1605 = arg1;
		Static225.anInt4007 = arg2;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILclient!jk;I)V")
	public static void method5661(@OriginalArg(1) int arg0, @OriginalArg(2) Class124 arg1, @OriginalArg(3) int arg2) {
		if (Static371.aClass124_10 != null || Static17.aBoolean39 || (arg1 == null || Static201.method2866(arg1) == null)) {
			return;
		}
		Static371.aClass124_10 = arg1;
		Static401.aClass124_12 = Static201.method2866(arg1);
		Static148.anInt2545 = arg2;
		Static230.anInt4043 = 0;
		Static237.anInt4218 = arg0;
		Static109.aBoolean554 = false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ug;B)Lclient!fu;")
	public static Class78_Sub2 method5662(@OriginalArg(0) Class1_Sub28 arg0) {
		return new Class78_Sub2(arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5345(), arg0.method5345(), arg0.method5337());
	}
}
