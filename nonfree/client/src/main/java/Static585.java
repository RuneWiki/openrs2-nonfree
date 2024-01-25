import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIZIII)V")
	public static void method7922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(21) int local21 = arg6 - arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = (local57 - 3) * local45;
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = local53 * (local61 - 3);
		@Pc(138) int local138 = local104;
		@Pc(144) int local144 = local100 * (arg6 - 1);
		@Pc(146) int local146 = local112;
		@Pc(152) int local152 = (local21 - 1) * local108;
		@Pc(175) int local175;
		@Pc(183) int local183;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (arg3 >= Static252.anInt4971 && Static359.anInt6232 >= arg3) {
			@Pc(166) int[] local166 = Static383.anIntArrayArray62[arg3];
			local175 = Static572.method7817(Static68.anInt1306, arg1 - arg2, Static589.anInt9684);
			local183 = Static572.method7817(Static68.anInt1306, arg2 + arg1, Static589.anInt9684);
			local191 = Static572.method7817(Static68.anInt1306, arg1 - local16, Static589.anInt9684);
			local199 = Static572.method7817(Static68.anInt1306, local16 + arg1, Static589.anInt9684);
			Static336.method5023(arg4, local191, local166, local175);
			Static336.method5023(arg5, local199, local166, local191);
			Static336.method5023(arg4, local183, local166, local199);
		}
		while (local9 > 0) {
			@Pc(226) boolean local226 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local116;
					local79 += local138;
					local7++;
					local116 += local104;
					local138 += local104;
				}
			}
			if (local226) {
				if (local88 < 0) {
					while (local88 < 0) {
						local96 += local146;
						local88 += local126;
						local146 += local112;
						local126 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local88 += local126;
					local96 += local146;
					local11++;
					local146 += local112;
					local126 += local112;
				}
				local96 += -local132;
				local88 += -local152;
				local132 -= local108;
				local152 -= local108;
			}
			if (local79 < 0) {
				local70 += local116;
				local79 += local138;
				local116 += local104;
				local138 += local104;
				local7++;
			}
			local79 += -local122;
			local70 += -local144;
			local9--;
			local122 -= local100;
			local144 -= local100;
			local175 = arg3 - local9;
			local183 = local9 + arg3;
			if (Static252.anInt4971 <= local183 && Static359.anInt6232 >= local175) {
				local191 = Static572.method7817(Static68.anInt1306, local7 + arg1, Static589.anInt9684);
				local199 = Static572.method7817(Static68.anInt1306, arg1 - local7, Static589.anInt9684);
				if (local226) {
					@Pc(408) int local408 = Static572.method7817(Static68.anInt1306, arg1 + local11, Static589.anInt9684);
					@Pc(417) int local417 = Static572.method7817(Static68.anInt1306, arg1 - local11, Static589.anInt9684);
					@Pc(428) int[] local428;
					if (local175 >= Static252.anInt4971) {
						local428 = Static383.anIntArrayArray62[local175];
						Static336.method5023(arg4, local417, local428, local199);
						Static336.method5023(arg5, local408, local428, local417);
						Static336.method5023(arg4, local191, local428, local408);
					}
					if (local183 <= Static359.anInt6232) {
						local428 = Static383.anIntArrayArray62[local183];
						Static336.method5023(arg4, local417, local428, local199);
						Static336.method5023(arg5, local408, local428, local417);
						Static336.method5023(arg4, local191, local428, local408);
					}
				} else {
					if (local175 >= Static252.anInt4971) {
						Static336.method5023(arg4, local191, Static383.anIntArrayArray62[local175], local199);
					}
					if (local183 <= Static359.anInt6232) {
						Static336.method5023(arg4, local191, Static383.anIntArrayArray62[local183], local199);
					}
				}
			}
		}
	}
}
