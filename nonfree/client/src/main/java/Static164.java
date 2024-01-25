import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "[Lclient!sa;")
	public static Class75[] aClass75Array1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BIIII)V")
	public static void method2784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg2) {
			Static403.method6377(arg0, Static130.anIntArrayArray89[arg3], arg2, arg1);
		} else {
			Static403.method6377(arg0, Static130.anIntArrayArray89[arg3], arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)V")
	public static void method2785(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 10);
		local8.method6974();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(21) int local21 = arg0 - arg6;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local25 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = arg0 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local25 * (1 - local61) + local45;
		@Pc(83) int local83 = local29 - (local61 - 1) * local49;
		@Pc(92) int local92 = local53 + local33 * (1 - local65);
		@Pc(101) int local101 = local37 - local57 * (local65 - 1);
		@Pc(105) int local105 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local45 * 3;
		@Pc(127) int local127 = local49 * (local61 - 3);
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = (local65 - 3) * local57;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg0 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local21 - 1) * local113;
		@Pc(172) int local172;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (Static328.anInt6154 <= arg4 && Static394.anInt7462 >= arg4) {
			@Pc(163) int[] local163 = Static130.anIntArrayArray89[arg4];
			local172 = Static84.method1650(Static7.anInt8119, arg2 - arg5, Static34.anInt603);
			local180 = Static84.method1650(Static7.anInt8119, arg5 + arg2, Static34.anInt603);
			local189 = Static84.method1650(Static7.anInt8119, arg2 - local16, Static34.anInt603);
			local197 = Static84.method1650(Static7.anInt8119, arg2 + local16, Static34.anInt603);
			Static403.method6377(arg1, local163, local189, local172);
			Static403.method6377(arg3, local163, local197, local189);
			Static403.method6377(arg1, local163, local180, local197);
		}
		while (local9 > 0) {
			@Pc(224) boolean local224 = local9 <= local21;
			if (local224) {
				if (local92 < 0) {
					while (local92 < 0) {
						local101 += local147;
						local92 += local131;
						local147 += local117;
						local11++;
						local131 += local117;
					}
				}
				if (local101 < 0) {
					local92 += local131;
					local101 += local147;
					local147 += local117;
					local11++;
					local131 += local117;
				}
				local101 += -local137;
				local92 += -local153;
				local153 -= local113;
				local137 -= local113;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local139;
					local74 += local121;
					local139 += local109;
					local7++;
					local121 += local109;
				}
			}
			if (local83 < 0) {
				local74 += local121;
				local83 += local139;
				local121 += local109;
				local139 += local109;
				local7++;
			}
			local74 += -local145;
			local83 += -local127;
			local145 -= local105;
			local9--;
			local127 -= local105;
			local172 = arg4 - local9;
			local180 = local9 + arg4;
			if (local180 >= Static328.anInt6154 && Static394.anInt7462 >= local172) {
				local189 = Static84.method1650(Static7.anInt8119, arg2 + local7, Static34.anInt603);
				local197 = Static84.method1650(Static7.anInt8119, arg2 - local7, Static34.anInt603);
				if (local224) {
					@Pc(396) int local396 = Static84.method1650(Static7.anInt8119, local11 + arg2, Static34.anInt603);
					@Pc(405) int local405 = Static84.method1650(Static7.anInt8119, arg2 - local11, Static34.anInt603);
					@Pc(416) int[] local416;
					if (Static328.anInt6154 <= local172) {
						local416 = Static130.anIntArrayArray89[local172];
						Static403.method6377(arg1, local416, local405, local197);
						Static403.method6377(arg3, local416, local396, local405);
						Static403.method6377(arg1, local416, local189, local396);
					}
					if (Static394.anInt7462 >= local180) {
						local416 = Static130.anIntArrayArray89[local180];
						Static403.method6377(arg1, local416, local405, local197);
						Static403.method6377(arg3, local416, local396, local405);
						Static403.method6377(arg1, local416, local189, local396);
					}
				} else {
					if (local172 >= Static328.anInt6154) {
						Static403.method6377(arg1, Static130.anIntArrayArray89[local172], local189, local197);
					}
					if (local180 <= Static394.anInt7462) {
						Static403.method6377(arg1, Static130.anIntArrayArray89[local180], local189, local197);
					}
				}
			}
		}
	}
}
