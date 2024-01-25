import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public static int anInt2851 = 0;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIBIIII)V")
	public static void method2651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static452.method6975(Static187.anInt3872, arg5, Static94.anInt2057);
		@Pc(17) int local17 = Static452.method6975(Static187.anInt3872, arg2, Static94.anInt2057);
		@Pc(23) int local23 = Static452.method6975(Static119.anInt2469, arg0, Static325.anInt6148);
		@Pc(29) int local29 = Static452.method6975(Static119.anInt2469, arg1, Static325.anInt6148);
		@Pc(37) int local37 = Static452.method6975(Static187.anInt3872, arg3 + arg5, Static94.anInt2057);
		@Pc(45) int local45 = Static452.method6975(Static187.anInt3872, arg2 - arg3, Static94.anInt2057);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static313.method5430(local29, arg4, Static143.anIntArrayArray33[local47], local23);
		}
		for (@Pc(71) int local71 = local17; local71 > local45; local71--) {
			Static313.method5430(local29, arg4, Static143.anIntArrayArray33[local71], local23);
		}
		@Pc(93) int local93 = Static452.method6975(Static119.anInt2469, arg3 + arg0, Static325.anInt6148);
		@Pc(102) int local102 = Static452.method6975(Static119.anInt2469, arg1 - arg3, Static325.anInt6148);
		for (@Pc(104) int local104 = local37; local104 <= local45; local104++) {
			@Pc(110) int[] local110 = Static143.anIntArrayArray33[local104];
			Static313.method5430(local93, arg4, local110, local23);
			Static313.method5430(local29, arg4, local110, local102);
		}
	}
}
