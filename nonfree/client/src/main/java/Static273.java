import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!ih;")
	public static final Class92 aClass92_8 = new Class92(64);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIB)V")
	public static void method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg1 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(95) int local95;
		@Pc(103) int local103;
		if (arg4 >= Static197.anInt4211 && arg4 <= Static326.anInt2469) {
			local95 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg0 + arg3);
			local103 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 - arg0);
			Static39.method919(arg2, Static344.anIntArrayArray65[arg4], local95, local103);
		}
		@Pc(121) int local121 = local51 * (arg1 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local63 += local55;
					local7++;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local63 += local55;
				local77 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local121;
			local121 -= local51;
			local71 -= local51;
			local9--;
			local95 = arg4 - local9;
			local103 = arg4 + local9;
			if (Static197.anInt4211 <= local103 && local95 <= Static326.anInt2469) {
				@Pc(217) int local217 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, local7 + arg3);
				@Pc(226) int local226 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 - local7);
				if (local95 >= Static197.anInt4211) {
					Static39.method919(arg2, Static344.anIntArrayArray65[local95], local217, local226);
				}
				if (local103 <= Static326.anInt2469) {
					Static39.method919(arg2, Static344.anIntArrayArray65[local103], local217, local226);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lclient!bg;B)V")
	public static void method4774(@OriginalArg(0) Class1_Sub8 arg0) {
		if (arg0.aByteArray81.length - arg0.anInt5182 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4532();
		if (local21 < 0 || local21 > 15) {
			return;
		}
		@Pc(40) byte local40;
		if (local21 == 15) {
			local40 = 37;
		} else if (local21 == 14) {
			local40 = 36;
		} else if (local21 == 13) {
			local40 = 35;
		} else if (local21 == 12) {
			local40 = 34;
		} else if (local21 == 11) {
			local40 = 33;
		} else if (local21 == 10) {
			local40 = 32;
		} else if (local21 == 9) {
			local40 = 31;
		} else if (local21 == 8) {
			local40 = 30;
		} else if (local21 == 7) {
			local40 = 29;
		} else if (local21 == 6) {
			local40 = 28;
		} else if (local21 == 5) {
			local40 = 28;
		} else if (local21 == 4) {
			local40 = 24;
		} else if (local21 == 3) {
			local40 = 23;
		} else if (local21 == 2) {
			local40 = 22;
		} else if (local21 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray81.length - arg0.anInt5182) {
			return;
		}
		Static13.anInt489 = arg0.method4532();
		if (Static13.anInt489 < 1) {
			Static13.anInt489 = 1;
		} else if (Static13.anInt489 > 4) {
			Static13.anInt489 = 4;
		}
		Static7.method274(arg0.method4532() == 1);
		Static221.aBoolean435 = arg0.method4532() == 1;
		Static84.aBoolean195 = arg0.method4532() == 1;
		Static125.aBoolean268 = arg0.method4532() == 1;
		Static323.anInt6216 = arg0.method4532() == 1 ? 1 : 0;
		Static111.aBoolean254 = arg0.method4532() == 1;
		Static336.aBoolean628 = arg0.method4532() == 1;
		Static282.aBoolean648 = arg0.method4532() == 1;
		Static163.anInt3549 = arg0.method4532();
		if (Static163.anInt3549 > 2) {
			Static163.anInt3549 = 2;
		}
		if (local21 < 2) {
			Static129.aBoolean269 = arg0.method4532() == 1;
			arg0.method4532();
		} else {
			Static129.aBoolean269 = arg0.method4532() == 1;
		}
		Static304.aBoolean580 = arg0.method4532() == 1;
		Static306.aBoolean584 = arg0.method4532() == 1;
		Static279.anInt5666 = arg0.method4532();
		if (Static279.anInt5666 > 2) {
			Static279.anInt5666 = 2;
		}
		Static322.anInt6180 = Static279.anInt5666;
		Static259.aBoolean281 = arg0.method4532() == 1;
		Static80.anInt2078 = arg0.method4532();
		if (Static80.anInt2078 > 127) {
			Static80.anInt2078 = 127;
		}
		Static167.anInt3605 = arg0.method4532();
		Static114.anInt4335 = arg0.method4532();
		if (Static114.anInt4335 > 127) {
			Static114.anInt4335 = 127;
		}
		if (local21 >= 1) {
			Static252.anInt5211 = arg0.method4556();
			Static327.anInt6283 = arg0.method4556();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4532();
		}
		@Pc(403) int local403;
		if (local21 >= 4) {
			local403 = arg0.method4532();
			if (local403 < 0 || local403 > 2) {
				local403 = 0;
			}
			if (Static257.anInt5344 < 96) {
				local403 = 0;
			}
			Static183.method3606(local403);
		}
		if (local21 >= 5) {
			Static34.anInt1164 = arg0.method4545();
		}
		local403 = 0;
		if (local21 >= 6) {
			Static168.anInt3612 = local403 = arg0.method4532();
		}
		if (Static168.anInt3612 != 1 && Static168.anInt3612 != 2) {
			Static168.anInt3612 = 2;
		}
		if (local21 >= 7) {
			Static45.aBoolean140 = arg0.method4532() == 1;
		}
		if (local21 >= 8) {
			Static327.aBoolean607 = arg0.method4532() == 1;
		}
		if (local21 >= 9) {
			Static324.anInt6232 = arg0.method4532();
		}
		if (Static324.anInt6232 < 0 || Static324.anInt6232 > Static228.method4253(Static257.anInt5344)) {
			Static324.anInt6232 = 0;
		}
		if (local21 >= 10) {
			Static278.aBoolean547 = arg0.method4532() != 0;
		}
		if (local21 >= 11) {
			Static332.aBoolean626 = arg0.method4532() != 0;
		}
		if (local21 >= 12) {
			Static323.anInt6216 = arg0.method4532();
		}
		if (Static323.anInt6216 < 0 || Static323.anInt6216 > 2) {
			Static323.anInt6216 = 1;
		}
		if (local21 >= 13) {
			Static348.aBoolean657 = arg0.method4532() == 1;
		}
		if (local21 >= 14) {
			Static204.anInt4306 = arg0.method4532();
		} else if (local403 == 0) {
			Static204.anInt4306 = 2;
		} else {
			Static204.anInt4306 = 1;
		}
		if (Static204.anInt4306 < 0 || Static204.anInt4306 > 3) {
			Static204.anInt4306 = 2;
		}
		if (local21 >= 15) {
			Static218.anInt4605 = arg0.method4532();
			if (Static218.anInt4605 < 0 || Static218.anInt4605 > 4) {
				Static218.anInt4605 = Static342.anInt3001 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)I")
	public static int method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static281.anIntArray479[arg0 & 0x3] : 256;
	}
}
