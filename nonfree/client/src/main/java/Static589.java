import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
	public static boolean method7763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static310.method4315(arg1, arg0) | (arg1 & 0x70000) != 0 || Static567.method7517(arg1, arg0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg2;
		@Pc(21) int local21 = arg5 - arg2;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(45) int local45 = local21 * local21;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local25 << 1;
		@Pc(57) int local57 = local45 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = arg5 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(77) int local77 = local25 * (1 - local65) + local49;
		@Pc(86) int local86 = local29 - (local65 - 1) * local53;
		@Pc(95) int local95 = local57 + local33 * (1 - local69);
		@Pc(103) int local103 = local45 - local61 * (local69 - 1);
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local29 << 2;
		@Pc(115) int local115 = local33 << 2;
		@Pc(119) int local119 = local45 << 2;
		@Pc(123) int local123 = local49 * 3;
		@Pc(129) int local129 = (local65 - 3) * local53;
		@Pc(133) int local133 = local57 * 3;
		@Pc(139) int local139 = local61 * (local69 - 3);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (arg5 - 1);
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local21 - 1) * local115;
		@Pc(159) int[] local159 = Static172.anIntArrayArray17[arg3];
		Static559.method7424(arg0, local159, arg4 - local16, arg4 - arg1);
		Static559.method7424(arg6, local159, local16 + arg4, arg4 - local16);
		Static559.method7424(arg0, local159, arg4 + arg1, arg4 - -local16);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local21 >= local9;
			if (local77 < 0) {
				while (local77 < 0) {
					local86 += local141;
					local77 += local123;
					local7++;
					local123 += local111;
					local141 += local111;
				}
			}
			if (local201) {
				if (local95 < 0) {
					while (local95 < 0) {
						local103 += local149;
						local95 += local133;
						local11++;
						local133 += local119;
						local149 += local119;
					}
				}
				if (local103 < 0) {
					local103 += local149;
					local95 += local133;
					local11++;
					local133 += local119;
					local149 += local119;
				}
				local103 += -local139;
				local95 += -local155;
				local155 -= local115;
				local139 -= local115;
			}
			if (local86 < 0) {
				local77 += local123;
				local86 += local141;
				local7++;
				local123 += local111;
				local141 += local111;
			}
			local86 += -local129;
			local77 += -local147;
			local147 -= local107;
			local129 -= local107;
			local9--;
			@Pc(335) int local335 = arg3 - local9;
			@Pc(339) int local339 = arg3 + local9;
			@Pc(343) int local343 = local7 + arg4;
			@Pc(348) int local348 = arg4 - local7;
			if (local201) {
				@Pc(372) int local372 = arg4 + local11;
				@Pc(377) int local377 = arg4 - local11;
				Static559.method7424(arg0, Static172.anIntArrayArray17[local335], local377, local348);
				Static559.method7424(arg6, Static172.anIntArrayArray17[local335], local372, local377);
				Static559.method7424(arg0, Static172.anIntArrayArray17[local335], local343, local372);
				Static559.method7424(arg0, Static172.anIntArrayArray17[local339], local377, local348);
				Static559.method7424(arg6, Static172.anIntArrayArray17[local339], local372, local377);
				Static559.method7424(arg0, Static172.anIntArrayArray17[local339], local343, local372);
			} else {
				Static559.method7424(arg0, Static172.anIntArrayArray17[local335], local343, local348);
				Static559.method7424(arg0, Static172.anIntArrayArray17[local339], local343, local348);
			}
		}
	}
}
