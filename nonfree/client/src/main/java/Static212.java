import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	public static int anInt4104;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	public static int anInt4111;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
	public static void method3266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg0) {
			method3267(arg0, arg1, arg2, Class10_Sub10_Sub1.lb[arg3]);
		} else {
			method3267(arg1, arg0, arg2, Class10_Sub10_Sub1.lb[arg3]);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBII[I)V")
	public static void method3267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(16) int local16 = arg1 - 1;
		@Pc(20) int local20 = local16 - 7;
		while (local20 > arg0) {
			@Pc(24) int local24 = arg0 + 1;
			arg3[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg3[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg3[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg3[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg3[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg3[local49] = arg2;
			@Pc(54) int local54 = local49 + 1;
			arg3[local54] = arg2;
			arg0 = local54 + 1;
			arg3[arg0] = arg2;
		}
		while (arg0 < local16) {
			arg0++;
			arg3[arg0] = arg2;
		}
	}
}
