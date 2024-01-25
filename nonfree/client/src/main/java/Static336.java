import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lea", name = "Hd", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[6][];

	@OriginalMember(owner = "client!lea", name = "Sd", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_65 = new Class341(14, -1);

	@OriginalMember(owner = "client!lea", name = "ue", descriptor = "Lclient!in;")
	public static final Class169 aClass169_159 = new Class169(132, 4);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg3;
		@Pc(20) int local20 = arg6 - arg3;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(70) int local70 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(87) int local87 = local48 + (1 - local60) * local32;
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(105) int local105 = local24 << 2;
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local32 << 2;
		@Pc(117) int local117 = local36 << 2;
		@Pc(121) int local121 = local40 * 3;
		@Pc(127) int local127 = local44 * (local56 - 3);
		@Pc(131) int local131 = local48 * 3;
		@Pc(137) int local137 = local52 * (local60 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg6 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local20 - 1);
		@Pc(157) int[] local157 = Static186.anIntArrayArray12[arg2];
		Static567.method8614(arg4 - arg5, -local16 + arg4, local157, arg0);
		Static567.method8614(arg4 - local16, local16 + arg4, local157, arg1);
		Static567.method8614(local16 + arg4, arg4 - -arg5, local157, arg0);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local20 >= local9;
			if (local202) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local131;
						local96 += local147;
						local11++;
						local131 += local117;
						local147 += local117;
					}
				}
				if (local96 < 0) {
					local87 += local131;
					local96 += local147;
					local131 += local117;
					local147 += local117;
					local11++;
				}
				local87 += -local153;
				local96 += -local137;
				local137 -= local113;
				local153 -= local113;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local121;
					local78 += local139;
					local7++;
					local121 += local109;
					local139 += local109;
				}
			}
			if (local78 < 0) {
				local70 += local121;
				local78 += local139;
				local7++;
				local139 += local109;
				local121 += local109;
			}
			local70 += -local145;
			local78 += -local127;
			local145 -= local105;
			local127 -= local105;
			local9--;
			@Pc(336) int local336 = arg2 - local9;
			@Pc(340) int local340 = local9 + arg2;
			@Pc(344) int local344 = local7 + arg4;
			@Pc(349) int local349 = arg4 - local7;
			if (local202) {
				@Pc(373) int local373 = local11 + arg4;
				@Pc(377) int local377 = arg4 - local11;
				Static567.method8614(local349, local377, Static186.anIntArrayArray12[local336], arg0);
				Static567.method8614(local377, local373, Static186.anIntArrayArray12[local336], arg1);
				Static567.method8614(local373, local344, Static186.anIntArrayArray12[local336], arg0);
				Static567.method8614(local349, local377, Static186.anIntArrayArray12[local340], arg0);
				Static567.method8614(local377, local373, Static186.anIntArrayArray12[local340], arg1);
				Static567.method8614(local373, local344, Static186.anIntArrayArray12[local340], arg0);
			} else {
				Static567.method8614(local349, local344, Static186.anIntArrayArray12[local336], arg0);
				Static567.method8614(local349, local344, Static186.anIntArrayArray12[local340], arg0);
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBIII)V")
	public static void method5644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = Static620.anInt10811;
		if (local9 == 0) {
			return;
		}
		if (local9 == 1) {
			Static584.anInt4545 = arg3;
			Static628.anInt10915 = arg2;
			Static163.anInt3525 = arg1;
			Static451.anInt8145 = arg0;
			Static620.anInt10811 = 2;
		} else if (local9 == 2) {
			if (arg0 > Static451.anInt8145) {
				Static451.anInt8145 = arg0;
			}
			if (arg3 < Static584.anInt4545) {
				Static584.anInt4545 = arg3;
			}
			if (Static163.anInt3525 > arg1) {
				Static163.anInt3525 = arg1;
			}
			if (arg2 > Static628.anInt10915) {
				Static628.anInt10915 = arg2;
			}
		}
	}
}
