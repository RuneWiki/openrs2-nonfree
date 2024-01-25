import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public static int anInt7038 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILclient!in;Z)V")
	public static void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class118 arg3) {
		for (@Pc(8) Class6_Sub14 local8 = (Class6_Sub14) Static329.aClass88_40.method1882(); local8 != null; local8 = (Class6_Sub14) Static329.aClass88_40.method1891()) {
			if (local8.anInt2366 == arg0 && arg2 << 7 == local8.anInt2370 && local8.anInt2369 == arg1 << 7 && local8.aClass118_1.anInt3021 == arg3.anInt3021) {
				if (local8.aClass6_Sub5_Sub4_1 != null) {
					Static371.aClass6_Sub5_Sub2_2.method2168(local8.aClass6_Sub5_Sub4_1);
					local8.aClass6_Sub5_Sub4_1 = null;
				}
				if (local8.aClass6_Sub5_Sub4_2 != null) {
					Static371.aClass6_Sub5_Sub2_2.method2168(local8.aClass6_Sub5_Sub4_2);
					local8.aClass6_Sub5_Sub4_2 = null;
				}
				local8.method5977();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)V")
	public static void method5721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg4) {
			Static65.method1233(arg0, arg1, arg3, arg2);
		} else if (arg3 - arg1 >= Static81.anInt1574 && arg3 + arg1 <= Static99.anInt1808 && arg2 - arg4 >= Static97.anInt1796 && Static85.anInt1636 >= arg4 + arg2) {
			Static345.method4853(arg1, arg3, arg0, arg4, arg2);
		} else {
			Static441.method5933(arg1, arg3, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg5;
		@Pc(21) int local21 = arg0 - arg5;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = (1 - local57) * local25 + local41;
		@Pc(80) int local80 = local29 - local45 * (local57 - 1);
		@Pc(89) int local89 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg0 - 1);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local21 - 1) * local109;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(188) int local188;
		@Pc(197) int local197;
		if (Static97.anInt1796 <= arg4 && Static85.anInt1636 >= arg4) {
			@Pc(163) int[] local163 = Static347.anIntArrayArray54[arg4];
			local171 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - arg6);
			local179 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 + arg6);
			local188 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - local16);
			local197 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 + local16);
			Static73.method1404(local163, local188, arg2, local171);
			Static73.method1404(local163, local197, arg3, local188);
			Static73.method1404(local163, local179, arg2, local197);
		}
		while (local9 > 0) {
			@Pc(230) boolean local230 = local9 <= local21;
			if (local230) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local127;
						local97 += local143;
						local143 += local113;
						local11++;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local143;
					local89 += local127;
					local11++;
					local127 += local113;
					local143 += local113;
				}
				local97 += -local133;
				local89 += -local149;
				local149 -= local109;
				local133 -= local109;
			}
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local135;
					local71 += local117;
					local135 += local105;
					local117 += local105;
					local7++;
				}
			}
			if (local80 < 0) {
				local80 += local135;
				local71 += local117;
				local135 += local105;
				local117 += local105;
				local7++;
			}
			local80 += -local123;
			local71 += -local141;
			local9--;
			local141 -= local101;
			local123 -= local101;
			local171 = arg4 - local9;
			local179 = arg4 + local9;
			if (local179 >= Static97.anInt1796 && Static85.anInt1636 >= local171) {
				local188 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 + local7);
				local197 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - local7);
				if (local230) {
					@Pc(443) int local443 = Static53.method977(Static99.anInt1808, Static81.anInt1574, local11 + arg1);
					@Pc(452) int local452 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - local11);
					@Pc(463) int[] local463;
					if (local171 >= Static97.anInt1796) {
						local463 = Static347.anIntArrayArray54[local171];
						Static73.method1404(local463, local452, arg2, local197);
						Static73.method1404(local463, local443, arg3, local452);
						Static73.method1404(local463, local188, arg2, local443);
					}
					if (Static85.anInt1636 >= local179) {
						local463 = Static347.anIntArrayArray54[local179];
						Static73.method1404(local463, local452, arg2, local197);
						Static73.method1404(local463, local443, arg3, local452);
						Static73.method1404(local463, local188, arg2, local443);
					}
				} else {
					if (local171 >= Static97.anInt1796) {
						Static73.method1404(Static347.anIntArrayArray54[local171], local188, arg2, local197);
					}
					if (local179 <= Static85.anInt1636) {
						Static73.method1404(Static347.anIntArrayArray54[local179], local188, arg2, local197);
					}
				}
			}
		}
	}
}
