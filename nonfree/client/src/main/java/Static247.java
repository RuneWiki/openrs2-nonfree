import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public static void method3633() throws Exception_Sub1 {
		if (Static106.anInt2134 == 1) {
			Static340.aClass33_9.method8120(Static658.anInt10391, Static426.anInt6744);
		} else {
			Static340.aClass33_9.method8120(0, 0);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg5 - arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = (1 - local61) * local33 + local49;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = (local57 - 3) * local45;
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local53 * (local61 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local101 * (arg5 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local21 - 1) * local113;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(192) int local192;
		@Pc(200) int local200;
		if (Static73.anInt1542 <= arg0 && arg0 <= Static527.anInt8177) {
			@Pc(167) int[] local167 = Static172.anIntArrayArray17[arg0];
			local176 = Static385.method4989(Static472.anInt7503, arg4 - arg3, Static257.anInt4172);
			local184 = Static385.method4989(Static472.anInt7503, arg3 + arg4, Static257.anInt4172);
			local192 = Static385.method4989(Static472.anInt7503, arg4 - local16, Static257.anInt4172);
			local200 = Static385.method4989(Static472.anInt7503, local16 + arg4, Static257.anInt4172);
			Static559.method7424(arg1, local167, local192, local176);
			Static559.method7424(arg6, local167, local200, local192);
			Static559.method7424(arg1, local167, local184, local200);
		}
		while (local9 > 0) {
			@Pc(227) boolean local227 = local9 <= local21;
			if (local227) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local131;
						local97 += local147;
						local11++;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local97 < 0) {
					local88 += local131;
					local97 += local147;
					local131 += local117;
					local11++;
					local147 += local117;
				}
				local97 += -local137;
				local88 += -local153;
				local137 -= local113;
				local153 -= local113;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local139;
					local70 += local121;
					local121 += local109;
					local7++;
					local139 += local109;
				}
			}
			if (local79 < 0) {
				local79 += local139;
				local70 += local121;
				local121 += local109;
				local139 += local109;
				local7++;
			}
			local79 += -local127;
			local70 += -local145;
			local127 -= local101;
			local145 -= local101;
			local9--;
			local176 = arg0 - local9;
			local184 = arg0 + local9;
			if (local184 >= Static73.anInt1542 && Static527.anInt8177 >= local176) {
				local192 = Static385.method4989(Static472.anInt7503, arg4 + local7, Static257.anInt4172);
				local200 = Static385.method4989(Static472.anInt7503, arg4 - local7, Static257.anInt4172);
				if (local227) {
					@Pc(403) int local403 = Static385.method4989(Static472.anInt7503, arg4 + local11, Static257.anInt4172);
					@Pc(412) int local412 = Static385.method4989(Static472.anInt7503, arg4 - local11, Static257.anInt4172);
					@Pc(423) int[] local423;
					if (local176 >= Static73.anInt1542) {
						local423 = Static172.anIntArrayArray17[local176];
						Static559.method7424(arg1, local423, local412, local200);
						Static559.method7424(arg6, local423, local403, local412);
						Static559.method7424(arg1, local423, local192, local403);
					}
					if (local184 <= Static527.anInt8177) {
						local423 = Static172.anIntArrayArray17[local184];
						Static559.method7424(arg1, local423, local412, local200);
						Static559.method7424(arg6, local423, local403, local412);
						Static559.method7424(arg1, local423, local192, local403);
					}
				} else {
					if (local176 >= Static73.anInt1542) {
						Static559.method7424(arg1, Static172.anIntArrayArray17[local176], local192, local200);
					}
					if (Static527.anInt8177 >= local184) {
						Static559.method7424(arg1, Static172.anIntArrayArray17[local184], local192, local200);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)Z")
	public static boolean method3636() {
		return Static61.aBoolean86;
	}
}
