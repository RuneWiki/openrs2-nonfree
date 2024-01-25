import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
	public static int anInt5934 = -1;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString140 = "";

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIZII)V")
	public static void method5383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg4;
		@Pc(21) int local21 = arg3 - arg4;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(87) int local87 = local49 + local33 * (1 - local61);
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = local45 * (local57 - 3);
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = local53 * (local61 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg3 - 1);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local21 - 1);
		@Pc(152) int[] local152 = Static143.anIntArrayArray33[arg0];
		Static313.method5430(arg5 - local16, arg6, local152, arg5 - arg2);
		Static313.method5430(arg5 + local16, arg1, local152, arg5 - local16);
		Static313.method5430(arg5 + arg2, arg6, local152, local16 + arg5);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local9 <= local21;
			if (local204) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local126;
						local96 += local142;
						local11++;
						local126 += local112;
						local142 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local142;
					local126 += local112;
					local11++;
					local142 += local112;
				}
				local87 += -local148;
				local96 += -local132;
				local148 -= local108;
				local132 -= local108;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local134;
					local70 += local116;
					local116 += local104;
					local134 += local104;
					local7++;
				}
			}
			if (local79 < 0) {
				local70 += local116;
				local79 += local134;
				local134 += local104;
				local7++;
				local116 += local104;
			}
			local79 += -local122;
			local70 += -local140;
			local122 -= local100;
			local140 -= local100;
			local9--;
			@Pc(344) int local344 = arg0 - local9;
			@Pc(348) int local348 = arg0 + local9;
			@Pc(353) int local353 = arg5 + local7;
			@Pc(358) int local358 = arg5 - local7;
			if (local204) {
				@Pc(365) int local365 = arg5 + local11;
				@Pc(370) int local370 = arg5 - local11;
				Static313.method5430(local370, arg6, Static143.anIntArrayArray33[local344], local358);
				Static313.method5430(local365, arg1, Static143.anIntArrayArray33[local344], local370);
				Static313.method5430(local353, arg6, Static143.anIntArrayArray33[local344], local365);
				Static313.method5430(local370, arg6, Static143.anIntArrayArray33[local348], local358);
				Static313.method5430(local365, arg1, Static143.anIntArrayArray33[local348], local370);
				Static313.method5430(local353, arg6, Static143.anIntArrayArray33[local348], local365);
			} else {
				Static313.method5430(local353, arg6, Static143.anIntArrayArray33[local344], local358);
				Static313.method5430(local353, arg6, Static143.anIntArrayArray33[local348], local358);
			}
		}
	}
}
