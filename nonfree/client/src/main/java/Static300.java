import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array23;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	public static int anInt5956;

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int anInt5954 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIIIII)V")
	public static void method5084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static268.anInt5477 <= arg0 && Static342.anInt3000 >= arg5 && Static197.anInt4211 <= arg2 && arg4 <= Static326.anInt2469) {
			if (arg3 == 1) {
				Static84.method1827(arg4, arg2, arg1, arg0, arg5);
			} else {
				Static136.method2780(arg0, arg3, arg2, arg1, arg4, arg5);
			}
		} else if (arg3 == 1) {
			Static266.method4686(arg0, arg5, arg1, arg4, arg2);
		} else {
			Static95.method2044(arg5, arg1, arg3, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method5085(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static169.aClass34_110.method1285(Static259.anInt2907) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static282.aClass34_188.method1285(Static259.anInt2907) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIII)V")
	public static void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg1) {
			Static39.method919(arg0, Static344.anIntArrayArray65[arg3], arg1, arg2);
		} else {
			Static39.method919(arg0, Static344.anIntArrayArray65[arg3], arg2, arg1);
		}
	}
}
