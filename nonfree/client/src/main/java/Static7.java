import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
	public static int anInt85;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
	public static int anInt86;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIBIII)V")
	public static void method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(13) int local13 = arg3 + arg1;
		for (@Pc(15) int local15 = arg1; local15 < local13; local15++) {
			Static646.method7025(Static569.anIntArrayArray54[local15], arg5, arg2, arg0);
		}
		@Pc(39) int local39 = arg3 + arg5;
		@Pc(44) int local44 = arg2 - arg3;
		for (@Pc(46) int local46 = arg4; local46 > local9; local46--) {
			Static646.method7025(Static569.anIntArrayArray54[local46], arg5, arg2, arg0);
		}
		for (@Pc(66) int local66 = local13; local66 <= local9; local66++) {
			@Pc(74) int[] local74 = Static569.anIntArrayArray54[local66];
			Static646.method7025(local74, arg5, local39, arg0);
			Static646.method7025(local74, local44, arg2, arg0);
		}
	}
}
