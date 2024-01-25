import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg5);
		@Pc(17) int local17 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg1);
		@Pc(23) int local23 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2);
		@Pc(29) int local29 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4);
		@Pc(37) int local37 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg5 + arg3);
		@Pc(46) int local46 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg1 - arg3);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static571.method7990(arg0, Static173.anIntArrayArray15[local48], local23, local29);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static571.method7990(arg0, Static173.anIntArrayArray15[local72], local23, local29);
		}
		@Pc(99) int local99 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2 + arg3);
		@Pc(107) int local107 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - arg3);
		for (@Pc(109) int local109 = local37; local109 <= local46; local109++) {
			@Pc(115) int[] local115 = Static173.anIntArrayArray15[local109];
			Static571.method7990(arg0, local115, local23, local99);
			Static571.method7990(arg6, local115, local99, local107);
			Static571.method7990(arg0, local115, local107, local29);
		}
	}
}
