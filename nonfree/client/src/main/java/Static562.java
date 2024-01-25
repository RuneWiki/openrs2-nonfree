import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "F")
	public static float aFloat252;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "J")
	public static long aLong254 = -1L;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBIII)V")
	public static void method8114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static258.method3697(arg3, Static370.anInt10475, Static468.anInt355);
		@Pc(28) int local28 = Static258.method3697(arg4, Static370.anInt10475, Static468.anInt355);
		@Pc(34) int local34 = Static258.method3697(arg1, Static575.anInt9879, Static313.anInt9045);
		@Pc(42) int local42 = Static258.method3697(arg5, Static575.anInt9879, Static313.anInt9045);
		@Pc(50) int local50 = Static258.method3697(arg2 + arg3, Static370.anInt10475, Static468.anInt355);
		@Pc(59) int local59 = Static258.method3697(arg4 - arg2, Static370.anInt10475, Static468.anInt355);
		for (@Pc(61) int local61 = local11; local61 < local50; local61++) {
			Static679.method9323(Static274.anIntArrayArray34[local61], local34, arg0, local42);
		}
		for (@Pc(77) int local77 = local28; local77 > local59; local77--) {
			Static679.method9323(Static274.anIntArrayArray34[local77], local34, arg0, local42);
		}
		@Pc(99) int local99 = Static258.method3697(arg2 + arg1, Static575.anInt9879, Static313.anInt9045);
		@Pc(110) int local110 = Static258.method3697(arg5 - arg2, Static575.anInt9879, Static313.anInt9045);
		for (@Pc(112) int local112 = local50; local112 <= local59; local112++) {
			@Pc(118) int[] local118 = Static274.anIntArrayArray34[local112];
			Static679.method9323(local118, local34, arg0, local99);
			Static679.method9323(local118, local110, arg0, local42);
		}
	}
}
