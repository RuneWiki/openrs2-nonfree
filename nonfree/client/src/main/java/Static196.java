import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gw", name = "N", descriptor = "Lclient!aga;")
	public static Class6_Sub3_Sub1 aClass6_Sub3_Sub1_1;

	@OriginalMember(owner = "client!gw", name = "K", descriptor = "Lclient!sca;")
	public static Class302 aClass302_28 = null;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIII)V")
	public static void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg1 + 1;
		Static312.method5228(arg2, Static484.anIntArrayArray41[arg1], arg3, arg4);
		@Pc(18) int local18 = arg0 - 1;
		Static312.method5228(arg2, Static484.anIntArrayArray41[arg0], arg3, arg4);
		for (@Pc(25) int local25 = local9; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static484.anIntArrayArray41[local25];
			local31[arg4] = local31[arg3] = arg2;
		}
	}
}
