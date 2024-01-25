import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qda", name = "z", descriptor = "Lclient!la;")
	public static Class208 aClass208_107;

	@OriginalMember(owner = "client!qda", name = "v", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_44 = new Class391(64);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIBI)V")
	public static void method6890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg1 + 1;
		Static646.method7025(Static569.anIntArrayArray54[arg1], arg2, arg0, arg3);
		@Pc(15) int local15 = arg4 - 1;
		Static646.method7025(Static569.anIntArrayArray54[arg4], arg2, arg0, arg3);
		for (@Pc(23) int local23 = local6; local23 <= local15; local23++) {
			@Pc(32) int[] local32 = Static569.anIntArrayArray54[local23];
			local32[arg2] = local32[arg0] = arg3;
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)I")
	public static int method6892(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static65.method1086(arg0);
	}
}
