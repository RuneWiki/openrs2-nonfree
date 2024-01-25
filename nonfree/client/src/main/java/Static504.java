import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[II)V")
	public static void method6755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(8) int local8 = arg1 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg3 < local11) {
			@Pc(15) int local15 = arg3 + 1;
			arg2[local15] = arg0;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg0;
			arg3 = local45 + 1;
			arg2[arg3] = arg0;
		}
		while (local8 > arg3) {
			arg3++;
			arg2[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
	public static void method6762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		method6755(arg1, arg2 + arg0, Static570.anIntArrayArray100[arg3], arg2 - arg0);
		@Pc(33) int local33 = -1;
		while (local9 > local7) {
			local33 += 2;
			local7++;
			local12 += local33;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(57) int[] local57 = Static570.anIntArrayArray100[arg3 + local9];
				@Pc(63) int[] local63 = Static570.anIntArrayArray100[arg3 - local9];
				@Pc(67) int local67 = local7 + arg2;
				@Pc(72) int local72 = arg2 - local7;
				method6755(arg1, local67, local57, local72);
				method6755(arg1, local67, local63, local72);
			}
			@Pc(88) int local88 = arg2 + local9;
			@Pc(92) int local92 = arg2 - local9;
			@Pc(99) int[] local99 = Static570.anIntArrayArray100[arg3 + local7];
			@Pc(106) int[] local106 = Static570.anIntArrayArray100[arg3 - local7];
			method6755(arg1, local88, local99, local92);
			method6755(arg1, local88, local106, local92);
		}
	}
}
