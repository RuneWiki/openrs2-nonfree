import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "Lclient!vj;")
	public static Class58 aClass58_41;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
	public static int anInt6056;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array122;

	@OriginalMember(owner = "client!tq", name = "V", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
	public static int anInt6062 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5142(@OriginalArg(1) String arg0) {
		return Static332.method5378(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIBIIIII)V")
	public static void method5143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg2;
		@Pc(21) int local21 = arg0 - arg2;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
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
		@Pc(145) int local145 = local101 * (arg0 - 1);
		@Pc(147) int local147 = local113;
		@Pc(166) int local166;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(190) int local190;
		if (Static349.anInt6619 <= arg5 && arg5 <= Static195.anInt4097) {
			@Pc(157) int[] local157 = Static223.anIntArrayArray124[arg5];
			local166 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 - arg1);
			local174 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1 + arg4);
			local182 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 - local16);
			local190 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 + local16);
			Static135.method2878(local157, local182, arg3, local166);
			Static135.method2878(local157, local190, arg6, local182);
			Static135.method2878(local157, local174, arg3, local190);
		}
		@Pc(214) int local214 = local109 * (local21 - 1);
		while (local9 > 0) {
			@Pc(223) boolean local223 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local117;
					local79 += local135;
					local135 += local105;
					local7++;
					local117 += local105;
				}
			}
			if (local223) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local147;
						local147 += local113;
						local11++;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local147;
					local88 += local127;
					local127 += local113;
					local11++;
					local147 += local113;
				}
				local88 += -local214;
				local97 += -local133;
				local214 -= local109;
				local133 -= local109;
			}
			if (local79 < 0) {
				local71 += local117;
				local79 += local135;
				local7++;
				local117 += local105;
				local135 += local105;
			}
			local79 += -local123;
			local71 += -local145;
			local9--;
			local145 -= local101;
			local123 -= local101;
			local166 = arg5 - local9;
			local174 = arg5 + local9;
			if (Static349.anInt6619 <= local174 && local166 <= Static195.anInt4097) {
				local182 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 + local7);
				local190 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 - local7);
				if (local223) {
					@Pc(437) int local437 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 + local11);
					@Pc(445) int local445 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg4 - local11);
					@Pc(456) int[] local456;
					if (local166 >= Static349.anInt6619) {
						local456 = Static223.anIntArrayArray124[local166];
						Static135.method2878(local456, local445, arg3, local190);
						Static135.method2878(local456, local437, arg6, local445);
						Static135.method2878(local456, local182, arg3, local437);
					}
					if (local174 <= Static195.anInt4097) {
						local456 = Static223.anIntArrayArray124[local174];
						Static135.method2878(local456, local445, arg3, local190);
						Static135.method2878(local456, local437, arg6, local445);
						Static135.method2878(local456, local182, arg3, local437);
					}
				} else {
					if (local166 >= Static349.anInt6619) {
						Static135.method2878(Static223.anIntArrayArray124[local166], local182, arg3, local190);
					}
					if (Static195.anInt4097 >= local174) {
						Static135.method2878(Static223.anIntArrayArray124[local174], local182, arg3, local190);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z[Ljava/lang/String;[S)V")
	public static void method5145(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static74.method1739(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!pn;ILclient!bi;ZLclient!fa;II)V")
	public static void method5146(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(5) Class8_Sub1_Sub2_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class4_Sub29 local14 = new Class4_Sub29();
		local14.anInt4315 = arg2;
		local14.anInt4300 = arg6 * 128;
		local14.anInt4306 = arg0 * 128;
		if (arg3 != null) {
			local14.aClass18_1 = arg3;
			@Pc(35) int local35 = arg3.anInt532;
			@Pc(38) int local38 = arg3.anInt529;
			if (arg5 == 1 || arg5 == 3) {
				local38 = arg3.anInt532;
				local35 = arg3.anInt529;
			}
			local14.anInt4313 = (arg0 + local38) * 128;
			local14.anIntArray366 = arg3.anIntArray16;
			local14.anInt4299 = (local35 + arg6) * 128;
			local14.anInt4307 = arg3.anInt544;
			local14.anInt4302 = arg3.anInt540;
			local14.anInt4304 = arg3.anInt502;
			local14.anInt4309 = arg3.anInt543 * 128;
			local14.anInt4308 = arg3.anInt517;
			if (arg3.anIntArray23 != null) {
				local14.aBoolean332 = true;
				local14.method3871();
			}
			if (local14.anIntArray366 != null) {
				local14.anInt4312 = (int) ((double) (local14.anInt4302 - local14.anInt4308) * Math.random()) + local14.anInt4308;
			}
			Static292.aClass116_43.method3274(local14);
		} else if (arg1 != null) {
			local14.aClass8_Sub1_Sub2_Sub2_1 = arg1;
			@Pc(179) Class141 local179 = arg1.aClass141_1;
			if (local179.anIntArray380 != null) {
				local14.aBoolean332 = true;
				local179 = local179.method3908();
			}
			if (local179 != null) {
				local14.anInt4313 = (arg0 + local179.anInt4382) * 128;
				local14.anInt4299 = (local179.anInt4382 + arg6) * 128;
				local14.anInt4304 = Static232.method4120(arg1);
				local14.anInt4309 = local179.anInt4390 * 128;
				local14.anInt4307 = local179.anInt4372;
			}
			Static114.aClass116_14.method3274(local14);
		} else if (arg4 != null) {
			local14.aClass8_Sub1_Sub2_Sub1_2 = arg4;
			local14.anInt4299 = (arg6 + arg4.method4349()) * 128;
			local14.anInt4313 = (arg4.method4349() + arg0) * 128;
			local14.anInt4304 = Static310.method5113(arg4);
			local14.anInt4307 = arg4.anInt2374;
			local14.anInt4309 = arg4.anInt2365 * 128;
			Static74.aClass43_11.method1276(local14, (long) arg4.anInt4916);
			return;
		}
	}
}
