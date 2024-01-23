import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public static int anInt4915;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array30 = new Class107[100];

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
	public static int anInt4919 = 0;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "[I")
	public static int[] anIntArray379 = new int[100];

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "[I")
	public static int[] anIntArray380 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!jb;II)Lclient!tg;")
	public static Class1_Sub2_Sub2 method3686(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return Static23.method421(arg0, arg1) ? Static188.method3058() : null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 + arg4;
		@Pc(15) int local15 = arg3 - arg4;
		@Pc(20) int local20 = arg1 - arg4;
		for (@Pc(22) int local22 = arg6; local22 < local10; local22++) {
			Static162.method2605(Static231.anIntArrayArray44[local22], arg0, arg2, arg1);
		}
		@Pc(44) int local44 = arg4 + arg0;
		for (@Pc(46) int local46 = arg3; local46 > local15; local46--) {
			Static162.method2605(Static231.anIntArrayArray44[local46], arg0, arg2, arg1);
		}
		for (@Pc(66) int local66 = local10; local66 <= local15; local66++) {
			@Pc(72) int[] local72 = Static231.anIntArrayArray44[local66];
			Static162.method2605(local72, arg0, arg2, local44);
			Static162.method2605(local72, local44, arg5, local20);
			Static162.method2605(local72, local20, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	public static void method3693() {
		Static2.aClass61_5.method1695(5);
		Static98.aClass61_37.method1695(5);
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
	public static void method3694() {
		Static57.aClass61_93.method1697();
		Static185.aClass61_92.method1697();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(BI)I")
	public static int method3695(@OriginalArg(1) int arg0) {
		@Pc(7) Class89 local7 = Static54.method1094(arg0);
		@Pc(10) int local10 = local7.anInt3396;
		@Pc(18) int local18 = local7.anInt3397;
		@Pc(21) int local21 = local7.anInt3393;
		@Pc(28) int local28 = Class1_Sub3.anIntArray18[local18 - local21];
		return Static141.anIntArray267[local10] >> local21 & local28;
	}
}
