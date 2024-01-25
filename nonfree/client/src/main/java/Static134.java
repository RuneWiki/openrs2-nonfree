import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt2971 = 104;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public static int anInt2972 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg5;
		@Pc(21) int local21 = arg2 - arg5;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(41) int local41 = local16 * local16;
		@Pc(45) int local45 = local21 * local21;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local25 << 1;
		@Pc(57) int local57 = local45 << 1;
		@Pc(61) int local61 = local41 << 1;
		@Pc(65) int local65 = arg2 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(77) int local77 = (1 - local65) * local25 + local49;
		@Pc(86) int local86 = local29 - (local65 - 1) * local53;
		@Pc(94) int local94 = local57 + local41 * (1 - local69);
		@Pc(103) int local103 = local45 - local61 * (local69 - 1);
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local29 << 2;
		@Pc(115) int local115 = local41 << 2;
		@Pc(119) int local119 = local45 << 2;
		@Pc(123) int local123 = local49 * 3;
		@Pc(129) int local129 = local53 * (local65 - 3);
		@Pc(133) int local133 = local57 * 3;
		@Pc(139) int local139 = local61 * (local69 - 3);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg2 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (Static197.anInt4211 <= arg6 && arg6 <= Static326.anInt2469) {
			@Pc(167) int[] local167 = Static344.anIntArrayArray65[arg6];
			local176 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 - arg3);
			local184 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 + arg1);
			local193 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 - local16);
			local201 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 + local16);
			Static39.method919(arg0, local167, local193, local176);
			Static39.method919(arg4, local167, local201, local193);
			Static39.method919(arg0, local167, local184, local201);
		}
		@Pc(225) int local225 = local115 * (local21 - 1);
		while (local9 > 0) {
			@Pc(238) boolean local238 = local9 <= local21;
			if (local238) {
				if (local94 < 0) {
					while (local94 < 0) {
						local103 += local149;
						local94 += local133;
						local149 += local119;
						local11++;
						local133 += local119;
					}
				}
				if (local103 < 0) {
					local103 += local149;
					local94 += local133;
					local133 += local119;
					local11++;
					local149 += local119;
				}
				local94 += -local225;
				local103 += -local139;
				local139 -= local115;
				local225 -= local115;
			}
			if (local77 < 0) {
				while (local77 < 0) {
					local86 += local141;
					local77 += local123;
					local7++;
					local141 += local111;
					local123 += local111;
				}
			}
			if (local86 < 0) {
				local86 += local141;
				local77 += local123;
				local141 += local111;
				local7++;
				local123 += local111;
			}
			local77 += -local147;
			local86 += -local129;
			local9--;
			local129 -= local107;
			local147 -= local107;
			local176 = arg6 - local9;
			local184 = local9 + arg6;
			if (Static197.anInt4211 <= local184 && Static326.anInt2469 >= local176) {
				local193 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 + local7);
				local201 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 - local7);
				if (local238) {
					@Pc(422) int local422 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, local11 + arg1);
					@Pc(431) int local431 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 - local11);
					@Pc(442) int[] local442;
					if (local176 >= Static197.anInt4211) {
						local442 = Static344.anIntArrayArray65[local176];
						Static39.method919(arg0, local442, local431, local201);
						Static39.method919(arg4, local442, local422, local431);
						Static39.method919(arg0, local442, local193, local422);
					}
					if (Static326.anInt2469 >= local184) {
						local442 = Static344.anIntArrayArray65[local184];
						Static39.method919(arg0, local442, local431, local201);
						Static39.method919(arg4, local442, local422, local431);
						Static39.method919(arg0, local442, local193, local422);
					}
				} else {
					if (Static197.anInt4211 <= local176) {
						Static39.method919(arg0, Static344.anIntArrayArray65[local176], local193, local201);
					}
					if (Static326.anInt2469 >= local184) {
						Static39.method919(arg0, Static344.anIntArrayArray65[local184], local193, local201);
					}
				}
			}
		}
	}
}
