import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIII)V")
	public static void method870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg3;
		@Pc(21) int local21 = arg0 - arg3;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(61) int local61 = arg0 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(75) int local75 = local25 * (1 - local61) + local41;
		@Pc(84) int local84 = local29 - local45 * (local61 - 1);
		@Pc(94) int local94 = local33 * (1 - local65) + local49;
		@Pc(103) int local103 = local37 - local53 * (local65 - 1);
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local29 << 2;
		@Pc(115) int local115 = local33 << 2;
		@Pc(119) int local119 = local37 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = local45 * (local61 - 3);
		@Pc(133) int local133 = local49 * 3;
		@Pc(139) int local139 = local53 * (local65 - 3);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg0 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (Static92.anInt2338 <= arg5 && arg5 <= Static341.anInt6379) {
			@Pc(167) int[] local167 = Static81.anIntArrayArray25[arg5];
			local176 = Static193.method3621(Static299.anInt4491, arg1 - arg2, Static95.anInt2358);
			local184 = Static193.method3621(Static299.anInt4491, arg1 + arg2, Static95.anInt2358);
			local193 = Static193.method3621(Static299.anInt4491, arg1 - local16, Static95.anInt2358);
			local201 = Static193.method3621(Static299.anInt4491, local16 + arg1, Static95.anInt2358);
			Static227.method7421(local176, arg6, local193, local167);
			Static227.method7421(local193, arg4, local201, local167);
			Static227.method7421(local201, arg6, local184, local167);
		}
		@Pc(225) int local225 = (local21 - 1) * local115;
		while (local9 > 0) {
			@Pc(238) boolean local238 = local9 <= local21;
			if (local238) {
				if (local94 < 0) {
					while (local94 < 0) {
						local103 += local149;
						local94 += local133;
						local149 += local119;
						local133 += local119;
						local11++;
					}
				}
				if (local103 < 0) {
					local94 += local133;
					local103 += local149;
					local149 += local119;
					local11++;
					local133 += local119;
				}
				local103 += -local139;
				local94 += -local225;
				local139 -= local115;
				local225 -= local115;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local123;
					local84 += local141;
					local123 += local111;
					local7++;
					local141 += local111;
				}
			}
			if (local84 < 0) {
				local84 += local141;
				local75 += local123;
				local123 += local111;
				local141 += local111;
				local7++;
			}
			local75 += -local147;
			local84 += -local129;
			local147 -= local107;
			local9--;
			local129 -= local107;
			local176 = arg5 - local9;
			local184 = arg5 + local9;
			if (local184 >= Static92.anInt2338 && Static341.anInt6379 >= local176) {
				local193 = Static193.method3621(Static299.anInt4491, local7 + arg1, Static95.anInt2358);
				local201 = Static193.method3621(Static299.anInt4491, arg1 - local7, Static95.anInt2358);
				if (local238) {
					@Pc(436) int local436 = Static193.method3621(Static299.anInt4491, local11 + arg1, Static95.anInt2358);
					@Pc(445) int local445 = Static193.method3621(Static299.anInt4491, arg1 - local11, Static95.anInt2358);
					@Pc(452) int[] local452;
					if (Static92.anInt2338 <= local176) {
						local452 = Static81.anIntArrayArray25[local176];
						Static227.method7421(local201, arg6, local445, local452);
						Static227.method7421(local445, arg4, local436, local452);
						Static227.method7421(local436, arg6, local193, local452);
					}
					if (Static341.anInt6379 >= local184) {
						local452 = Static81.anIntArrayArray25[local184];
						Static227.method7421(local201, arg6, local445, local452);
						Static227.method7421(local445, arg4, local436, local452);
						Static227.method7421(local436, arg6, local193, local452);
					}
				} else {
					if (Static92.anInt2338 <= local176) {
						Static227.method7421(local201, arg6, local193, Static81.anIntArrayArray25[local176]);
					}
					if (local184 <= Static341.anInt6379) {
						Static227.method7421(local201, arg6, local193, Static81.anIntArrayArray25[local184]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III[J[I)V")
	public static void method871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) int local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg1; local52 < arg0; local52++) {
			if (local16 + (long) (local50 & local52) > arg2[local52]) {
				@Pc(74) long local74 = arg2[local52];
				arg2[local52] = arg2[local12];
				arg2[local12] = local74;
				@Pc(88) int local88 = arg3[local52];
				arg3[local52] = arg3[local12];
				arg3[local12++] = local88;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method871(local12 - 1, arg1, arg2, arg3);
		method871(arg0, local12 + 1, arg2, arg3);
	}
}
