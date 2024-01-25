import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!np", name = "G", descriptor = "I")
	public static int anInt4455;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "I")
	public static int anInt4451 = -1;

	@OriginalMember(owner = "client!np", name = "B", descriptor = "I")
	public static int anInt4453 = 0;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static181.method3367(Static229.anInt4777, arg5, Static165.anInt3366);
		@Pc(17) int local17 = Static181.method3367(Static229.anInt4777, arg1, Static165.anInt3366);
		@Pc(23) int local23 = Static181.method3367(Static338.anInt5369, arg3, Static295.anInt5964);
		@Pc(29) int local29 = Static181.method3367(Static338.anInt5369, arg4, Static295.anInt5964);
		@Pc(37) int local37 = Static181.method3367(Static229.anInt4777, arg0 + arg5, Static165.anInt3366);
		@Pc(46) int local46 = Static181.method3367(Static229.anInt4777, arg1 - arg0, Static165.anInt3366);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static182.method3394(local23, Static30.anIntArrayArray10[local48], arg2, local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static182.method3394(local23, Static30.anIntArrayArray10[local68], arg2, local29);
		}
		@Pc(90) int local90 = Static181.method3367(Static338.anInt5369, arg0 + arg3, Static295.anInt5964);
		@Pc(99) int local99 = Static181.method3367(Static338.anInt5369, arg4 - arg0, Static295.anInt5964);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(107) int[] local107 = Static30.anIntArrayArray10[local101];
			Static182.method3394(local23, local107, arg2, local90);
			Static182.method3394(local99, local107, arg2, local29);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
	public static void method3715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static18.anInt369 == 1) {
			Static67.aClass60Array4[Static273.anInt5607 / 100].method5675(Static1.anInt4 - 8, Static108.anInt2385 + -8);
		}
		if (Static18.anInt369 == 2) {
			Static67.aClass60Array4[Static273.anInt5607 / 100 + 4].method5675(Static1.anInt4 - 8, Static108.anInt2385 + -8);
		}
		Static100.method1858();
	}
}
