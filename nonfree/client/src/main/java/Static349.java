import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_37 = new Class165(4);

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_77 = new Class218(46, 7);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg4;
		@Pc(21) int local21 = arg6 - arg4;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(95) int local95 = local37 - (local61 - 1) * local53;
		@Pc(99) int local99 = local25 << 2;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = local45 * (local57 - 3);
		@Pc(125) int local125 = local49 * 3;
		@Pc(131) int local131 = (local61 - 3) * local53;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg6 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local21 - 1);
		@Pc(151) int[] local151 = Static392.anIntArrayArray39[arg0];
		Static483.method7014(local151, arg2 - arg5, -local16 + arg2, arg3);
		Static483.method7014(local151, arg2 - local16, local16 + arg2, arg1);
		Static483.method7014(local151, arg2 + local16, arg5 + arg2, arg3);
		while (local9 > 0) {
			@Pc(193) boolean local193 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local133;
					local70 += local115;
					local7++;
					local115 += local103;
					local133 += local103;
				}
			}
			if (local193) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local141;
						local87 += local125;
						local141 += local111;
						local125 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local87 += local125;
					local125 += local111;
					local11++;
					local141 += local111;
				}
				local87 += -local147;
				local95 += -local131;
				local131 -= local107;
				local147 -= local107;
			}
			if (local78 < 0) {
				local78 += local133;
				local70 += local115;
				local7++;
				local115 += local103;
				local133 += local103;
			}
			local70 += -local139;
			local78 += -local121;
			local9--;
			local139 -= local99;
			local121 -= local99;
			@Pc(329) int local329 = arg0 - local9;
			@Pc(333) int local333 = arg0 + local9;
			@Pc(338) int local338 = arg2 + local7;
			@Pc(343) int local343 = arg2 - local7;
			if (local193) {
				@Pc(349) int local349 = local11 + arg2;
				@Pc(354) int local354 = arg2 - local11;
				Static483.method7014(Static392.anIntArrayArray39[local329], local343, local354, arg3);
				Static483.method7014(Static392.anIntArrayArray39[local329], local354, local349, arg1);
				Static483.method7014(Static392.anIntArrayArray39[local329], local349, local338, arg3);
				Static483.method7014(Static392.anIntArrayArray39[local333], local343, local354, arg3);
				Static483.method7014(Static392.anIntArrayArray39[local333], local354, local349, arg1);
				Static483.method7014(Static392.anIntArrayArray39[local333], local349, local338, arg3);
			} else {
				Static483.method7014(Static392.anIntArrayArray39[local329], local343, local338, arg3);
				Static483.method7014(Static392.anIntArrayArray39[local333], local343, local338, arg3);
			}
		}
	}
}
