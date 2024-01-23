import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public static int anInt2677;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt2686;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!vb;")
	public static Class120 aClass120_15 = new Class120();

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Lclient!sc;")
	private static Class107 aClass107_727 = Static231.method3737(" from your ignore list first)3");

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_728 = aClass107_727;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	public static int anInt2690 = 0;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "[I")
	public static int[] anIntArray240 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_729 = Static231.method3737("Fps:");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z")
	public static boolean method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static178.method2833(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static152.method2504(local10 + 1, Static166.anIntArrayArrayArray11[arg0][arg1][arg2] + arg3, local14 + 1) && Static152.method2504(local10 + 128 - 1, Static166.anIntArrayArrayArray11[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static152.method2504(local10 + 128 - 1, Static166.anIntArrayArrayArray11[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static152.method2504(local10 + 1, Static166.anIntArrayArrayArray11[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= Static99.anInt915 && Static38.anInt784 >= arg2 && Static223.anInt4869 <= arg0 && arg3 <= Static47.anInt1057) {
			if (arg5 == 1) {
				Static92.method1548(arg0, arg4, arg2, arg1, arg3);
			} else {
				Static152.method2501(arg2, arg5, arg3, arg1, arg4, arg0);
			}
		} else if (arg5 == 1) {
			Static223.method3650(arg2, arg4, arg1, arg3, arg0);
		} else {
			Static151.method2478(arg4, arg5, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)I")
	public static int method2091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > arg2) {
			return arg1;
		} else if (arg2 <= arg0) {
			return arg2;
		} else {
			return arg0;
		}
	}
}
