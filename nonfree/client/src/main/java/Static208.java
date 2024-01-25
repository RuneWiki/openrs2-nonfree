import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[IBI)V")
	public static void method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(12) int local12 = arg3 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg0 < local15) {
			@Pc(19) int local19 = arg0 + 1;
			arg2[local19] = arg1;
			@Pc(24) int local24 = local19 + 1;
			arg2[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg1;
			arg0 = local49 + 1;
			arg2[arg0] = arg1;
		}
		while (local12 > arg0) {
			arg0++;
			arg2[arg0] = arg1;
		}
	}
}
