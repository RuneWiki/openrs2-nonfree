import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt6171 = 0;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_180 = new Class208(35, 12);

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public static int anInt6174 = 0;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_97 = new Class183(39, 15);

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public static int anInt6175 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg0;
		@Pc(21) int local21 = arg3 - arg0;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = (arg3 - 1) * local101;
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local21 - 1) * local109;
		@Pc(153) int[] local153 = Static152.anIntArrayArray30[arg4];
		Static307.method5019(local153, arg1 - local16, arg5, arg1 - arg6);
		Static307.method5019(local153, local16 + arg1, arg2, arg1 - local16);
		Static307.method5019(local153, arg6 + arg1, arg5, local16 + arg1);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local7++;
					local135 += local105;
					local117 += local105;
				}
			}
			if (local200) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local143;
						local143 += local113;
						local127 += local113;
						local11++;
					}
				}
				if (local97 < 0) {
					local88 += local127;
					local97 += local143;
					local127 += local113;
					local11++;
					local143 += local113;
				}
				local88 += -local149;
				local97 += -local133;
				local133 -= local109;
				local149 -= local109;
			}
			if (local79 < 0) {
				local79 += local135;
				local70 += local117;
				local135 += local105;
				local7++;
				local117 += local105;
			}
			local70 += -local141;
			local79 += -local123;
			local123 -= local101;
			local9--;
			local141 -= local101;
			@Pc(340) int local340 = arg4 - local9;
			@Pc(344) int local344 = local9 + arg4;
			@Pc(348) int local348 = arg1 + local7;
			@Pc(352) int local352 = arg1 - local7;
			if (local200) {
				@Pc(377) int local377 = arg1 + local11;
				@Pc(382) int local382 = arg1 - local11;
				Static307.method5019(Static152.anIntArrayArray30[local340], local382, arg5, local352);
				Static307.method5019(Static152.anIntArrayArray30[local340], local377, arg2, local382);
				Static307.method5019(Static152.anIntArrayArray30[local340], local348, arg5, local377);
				Static307.method5019(Static152.anIntArrayArray30[local344], local382, arg5, local352);
				Static307.method5019(Static152.anIntArrayArray30[local344], local377, arg2, local382);
				Static307.method5019(Static152.anIntArrayArray30[local344], local348, arg5, local377);
			} else {
				Static307.method5019(Static152.anIntArrayArray30[local340], local348, arg5, local352);
				Static307.method5019(Static152.anIntArrayArray30[local344], local348, arg5, local352);
			}
		}
	}
}
