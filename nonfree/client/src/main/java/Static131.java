import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	public static int anInt2627 = -1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILclient!qv;Lclient!qv;)V")
	public static void method2282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31_Sub3 arg3, @OriginalArg(4) Class31_Sub3 arg4) {
		@Pc(4) Class80 local4 = Static317.method4490(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass31_Sub3_3 = arg3;
			local4.aClass31_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
	public static void method2283() {
		Static80.aClass134_14.method3270(5);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg1 - arg2;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = arg1 * arg1;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local21 * local21;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg1 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(75) int local75 = local29 * (1 - local61) + local45;
		@Pc(84) int local84 = local33 - local49 * (local61 - 1);
		@Pc(93) int local93 = (1 - local65) * local37 + local53;
		@Pc(101) int local101 = local41 - (local65 - 1) * local57;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 << 2;
		@Pc(121) int local121 = local45 * 3;
		@Pc(127) int local127 = (local61 - 3) * local49;
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = local57 * (local65 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg1 - 1);
		@Pc(147) int local147 = local117;
		@Pc(170) int local170;
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(196) int local196;
		if (arg6 >= Static108.anInt2276 && Static173.anInt3208 >= arg6) {
			@Pc(161) int[] local161 = Static163.anIntArrayArray35[arg6];
			local170 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 - arg3);
			local179 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 + arg3);
			local187 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 - local16);
			local196 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 + local16);
			Static59.method1261(local161, local187, local170, arg4);
			Static59.method1261(local161, local196, local187, arg0);
			Static59.method1261(local161, local179, local196, arg4);
		}
		@Pc(220) int local220 = local113 * (local21 - 1);
		while (local9 > 0) {
			@Pc(233) boolean local233 = local21 >= local9;
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local139;
					local75 += local121;
					local7++;
					local121 += local109;
					local139 += local109;
				}
			}
			if (local233) {
				if (local93 < 0) {
					while (local93 < 0) {
						local101 += local147;
						local93 += local131;
						local131 += local117;
						local147 += local117;
						local11++;
					}
				}
				if (local101 < 0) {
					local93 += local131;
					local101 += local147;
					local147 += local117;
					local11++;
					local131 += local117;
				}
				local93 += -local220;
				local101 += -local137;
				local220 -= local113;
				local137 -= local113;
			}
			if (local84 < 0) {
				local84 += local139;
				local75 += local121;
				local139 += local109;
				local121 += local109;
				local7++;
			}
			local75 += -local145;
			local84 += -local127;
			local145 -= local105;
			local9--;
			local127 -= local105;
			local170 = arg6 - local9;
			local179 = local9 + arg6;
			if (Static108.anInt2276 <= local179 && Static173.anInt3208 >= local170) {
				local187 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 + local7);
				local196 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 - local7);
				if (local233) {
					@Pc(442) int local442 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local11 + arg5);
					@Pc(451) int local451 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 - local11);
					@Pc(462) int[] local462;
					if (Static108.anInt2276 <= local170) {
						local462 = Static163.anIntArrayArray35[local170];
						Static59.method1261(local462, local451, local196, arg4);
						Static59.method1261(local462, local442, local451, arg0);
						Static59.method1261(local462, local187, local442, arg4);
					}
					if (Static173.anInt3208 >= local179) {
						local462 = Static163.anIntArrayArray35[local179];
						Static59.method1261(local462, local451, local196, arg4);
						Static59.method1261(local462, local442, local451, arg0);
						Static59.method1261(local462, local187, local442, arg4);
					}
				} else {
					if (Static108.anInt2276 <= local170) {
						Static59.method1261(Static163.anIntArrayArray35[local170], local187, local196, arg4);
					}
					if (local179 <= Static173.anInt3208) {
						Static59.method1261(Static163.anIntArrayArray35[local179], local187, local196, arg4);
					}
				}
			}
		}
	}
}
