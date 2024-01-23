import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
	public static int[] anIntArray564 = new int[14];

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "[J")
	public static long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg2 - arg5;
		@Pc(10) int local10 = arg1 + arg5;
		@Pc(15) int local15 = arg4 + arg5;
		@Pc(29) int local29 = arg6 - arg5;
		@Pc(31) int local31;
		for (local31 = arg1; local31 < local10; local31++) {
			Static25.method486(Static275.anIntArrayArray37[local31], arg4, arg6, arg0);
		}
		for (local31 = arg2; local31 > local6; local31--) {
			Static25.method486(Static275.anIntArrayArray37[local31], arg4, arg6, arg0);
		}
		for (local31 = local10; local31 <= local6; local31++) {
			@Pc(74) int[] local74 = Static275.anIntArrayArray37[local31];
			Static25.method486(local74, arg4, local15, arg0);
			Static25.method486(local74, local15, local29, arg3);
			Static25.method486(local74, local29, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ek;Lclient!ek;I)V")
	public static void method4544(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		Static256.aClass42_78 = arg1;
		Static72.aClass42_21 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	public static void method4546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class2_Sub8_Sub10 local4 = Static92.method1633(12, arg0);
		local4.method2052();
		local4.anInt2698 = arg1;
	}
}
