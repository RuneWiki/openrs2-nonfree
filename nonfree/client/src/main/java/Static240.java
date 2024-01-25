import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	public static int anInt4746;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_135 = new Class208(75, 12);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
	public static void method4257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg1) {
			Static307.method5019(Static152.anIntArrayArray30[arg3], arg0, arg2, arg1);
		} else {
			Static307.method5019(Static152.anIntArrayArray30[arg3], arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(CB)Z")
	public static boolean method4260(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static86.method1459(Static69.anInt1551, arg0, Static317.anInt5793);
		@Pc(17) int local17 = Static86.method1459(Static69.anInt1551, arg3, Static317.anInt5793);
		@Pc(23) int local23 = Static86.method1459(Static121.anInt6758, arg1, Static179.anInt3768);
		@Pc(29) int local29 = Static86.method1459(Static121.anInt6758, arg5, Static179.anInt3768);
		@Pc(37) int local37 = Static86.method1459(Static69.anInt1551, arg2 + arg0, Static317.anInt5793);
		@Pc(46) int local46 = Static86.method1459(Static69.anInt1551, arg3 - arg2, Static317.anInt5793);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static307.method5019(Static152.anIntArrayArray30[local48], local29, arg4, local23);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static307.method5019(Static152.anIntArrayArray30[local64], local29, arg4, local23);
		}
		@Pc(91) int local91 = Static86.method1459(Static121.anInt6758, arg2 + arg1, Static179.anInt3768);
		@Pc(99) int local99 = Static86.method1459(Static121.anInt6758, arg5 - arg2, Static179.anInt3768);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(107) int[] local107 = Static152.anIntArrayArray30[local101];
			Static307.method5019(local107, local91, arg4, local23);
			Static307.method5019(local107, local99, arg6, local91);
			Static307.method5019(local107, local29, arg4, local99);
		}
	}
}
