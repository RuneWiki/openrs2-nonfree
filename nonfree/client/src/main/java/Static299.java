import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[[[Lclient!hl;")
	public static Class133[][][] aClass133ArrayArrayArray3;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString45 = null;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)Lclient!sda;")
	public static Class288 method4520(@OriginalArg(0) int arg0) {
		@Pc(10) Class288 local10 = (Class288) Static518.aClass330_62.method7677((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static400.aClass248_70.method5797(0, arg0);
		local10 = new Class288();
		if (local20 != null) {
			local10.method6526(new Class6_Sub12(local20));
		}
		local10.method6525();
		Static518.aClass330_62.method7676(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg5;
		@Pc(21) int local21 = arg1 - arg5;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = (1 - local57) * local25 + local41;
		@Pc(80) int local80 = local29 - (local57 - 1) * local45;
		@Pc(89) int local89 = local49 + local33 * (1 - local61);
		@Pc(98) int local98 = local37 - local53 * (local61 - 1);
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = (local57 - 3) * local45;
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = local53 * (local61 - 3);
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = local102 * (arg1 - 1);
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (local21 - 1) * local110;
		@Pc(154) int[] local154 = Static155.anIntArrayArray32[arg2];
		Static264.method4006(arg4 - local16, arg3, arg4 - arg0, local154);
		Static264.method4006(arg4 + local16, arg6, arg4 - local16, local154);
		Static264.method4006(arg0 + arg4, arg3, arg4 + local16, local154);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local118;
					local80 += local136;
					local136 += local106;
					local118 += local106;
					local7++;
				}
			}
			if (local200) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local128;
						local98 += local144;
						local128 += local114;
						local11++;
						local144 += local114;
					}
				}
				if (local98 < 0) {
					local89 += local128;
					local98 += local144;
					local128 += local114;
					local11++;
					local144 += local114;
				}
				local98 += -local134;
				local89 += -local150;
				local134 -= local110;
				local150 -= local110;
			}
			if (local80 < 0) {
				local80 += local136;
				local71 += local118;
				local7++;
				local118 += local106;
				local136 += local106;
			}
			local71 += -local142;
			local80 += -local124;
			local124 -= local102;
			local9--;
			local142 -= local102;
			@Pc(340) int local340 = arg2 - local9;
			@Pc(345) int local345 = arg2 + local9;
			@Pc(349) int local349 = arg4 + local7;
			@Pc(353) int local353 = arg4 - local7;
			if (local200) {
				@Pc(377) int local377 = local11 + arg4;
				@Pc(382) int local382 = arg4 - local11;
				Static264.method4006(local382, arg3, local353, Static155.anIntArrayArray32[local340]);
				Static264.method4006(local377, arg6, local382, Static155.anIntArrayArray32[local340]);
				Static264.method4006(local349, arg3, local377, Static155.anIntArrayArray32[local340]);
				Static264.method4006(local382, arg3, local353, Static155.anIntArrayArray32[local345]);
				Static264.method4006(local377, arg6, local382, Static155.anIntArrayArray32[local345]);
				Static264.method4006(local349, arg3, local377, Static155.anIntArrayArray32[local345]);
			} else {
				Static264.method4006(local349, arg3, local353, Static155.anIntArrayArray32[local340]);
				Static264.method4006(local349, arg3, local353, Static155.anIntArrayArray32[local345]);
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method4522() {
		Static186.aClass71_19 = null;
		Static82.anInt1372 = -1;
	}
}
