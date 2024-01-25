import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bu", name = "cb", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_10 = new Class77(64, 3);

	@OriginalMember(owner = "client!bu", name = "eb", descriptor = "I")
	public static int anInt669 = -1;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method705(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static385.method5711(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1 != arg0.charAt(local30); local30++) {
			}
			local15[local17++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg0.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIILclient!vk;III)Z")
	public static boolean method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class239 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg9;
		@Pc(17) int local17 = arg3 - 64;
		@Pc(22) int local22 = arg9 - 64;
		Static287.anIntArrayArray44[64][64] = 99;
		Static203.anIntArrayArray22[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static5.anIntArray808[0] = arg3;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static327.anIntArray702[0] = arg9;
		@Pc(55) int[][] local55 = arg6.anIntArrayArray54;
		while (local47 != local50) {
			local9 = Static327.anIntArray702[local47];
			local7 = Static5.anIntArray808[local47];
			@Pc(70) int local70 = local9 - local22;
			@Pc(74) int local74 = local7 - local17;
			local47 = local47 + 1 & 0xFFF;
			@Pc(86) int local86 = local7 - arg6.anInt6436;
			@Pc(91) int local91 = local9 - arg6.anInt6445;
			if (arg7 == -4) {
				if (local7 == arg4 && local9 == arg1) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static159.method2669(2, 2, arg5, arg1, local7, arg4, local9, arg0)) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg6.method5556(2, 2, arg0, arg1, arg5, arg8, arg4, local9, local7)) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg6.method5550(arg4, arg0, local7, arg5, local9, arg8, arg1, 2)) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg6.method5564(local9, arg2, 2, arg1, arg7, arg4, local7)) {
					Static58.anInt5539 = local7;
					Static168.anInt2996 = local9;
					return true;
				}
			} else if (arg6.method5548(arg1, arg4, local7, arg7, local9, arg2, 2)) {
				Static58.anInt5539 = local7;
				Static168.anInt2996 = local9;
				return true;
			}
			@Pc(243) int local243 = Static203.anIntArrayArray22[local74][local70] + 1;
			if (local74 > 0 && Static287.anIntArrayArray44[local74 - 1][local70] == 0 && (local55[local86 - 1][local91] & 0x43A40000) == 0 && (local55[local86 - 1][local91 + 1] & 0x4E240000) == 0) {
				Static5.anIntArray808[local50] = local7 - 1;
				Static327.anIntArray702[local50] = local9;
				Static287.anIntArrayArray44[local74 - 1][local70] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local74 - 1][local70] = local243;
			}
			if (local74 < 126 && Static287.anIntArrayArray44[local74 + 1][local70] == 0 && (local55[local86 + 2][local91] & 0x60E40000) == 0 && (local55[local86 + 2][local91 + 1] & 0x78240000) == 0) {
				Static5.anIntArray808[local50] = local7 + 1;
				Static327.anIntArray702[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local74 + 1][local70] = 8;
				Static203.anIntArrayArray22[local74 + 1][local70] = local243;
			}
			if (local70 > 0 && Static287.anIntArrayArray44[local74][local70 - 1] == 0 && (local55[local86][local91 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local91 - 1] & 0x60E40000) == 0) {
				Static5.anIntArray808[local50] = local7;
				Static327.anIntArray702[local50] = local9 - 1;
				Static287.anIntArrayArray44[local74][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local74][local70 - 1] = local243;
			}
			if (local70 < 126 && Static287.anIntArrayArray44[local74][local70 + 1] == 0 && (local55[local86][local91 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local91 + 2] & 0x78240000) == 0) {
				Static5.anIntArray808[local50] = local7;
				Static327.anIntArray702[local50] = local9 + 1;
				Static287.anIntArrayArray44[local74][local70 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local74][local70 + 1] = local243;
			}
			if (local74 > 0 && local70 > 0 && Static287.anIntArrayArray44[local74 - 1][local70 - 1] == 0 && (local55[local86 - 1][local91] & 0x4FA40000) == 0 && (local55[local86 - 1][local91 - 1] & 0x43A40000) == 0 && (local55[local86][local91 - 1] & 0x63E40000) == 0) {
				Static5.anIntArray808[local50] = local7 - 1;
				Static327.anIntArray702[local50] = local9 - 1;
				Static287.anIntArrayArray44[local74 - 1][local70 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local74 - 1][local70 - 1] = local243;
			}
			if (local74 < 126 && local70 > 0 && Static287.anIntArrayArray44[local74 + 1][local70 - 1] == 0 && (local55[local86 + 1][local91 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local91 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local91] & 0x78E40000) == 0) {
				Static5.anIntArray808[local50] = local7 + 1;
				Static327.anIntArray702[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local74 + 1][local70 - 1] = 9;
				Static203.anIntArrayArray22[local74 + 1][local70 - 1] = local243;
			}
			if (local74 > 0 && local70 < 126 && Static287.anIntArrayArray44[local74 - 1][local70 + 1] == 0 && (local55[local86 - 1][local91 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local91 + 2] & 0x4E240000) == 0 && (local55[local86][local91 + 2] & 0x7E240000) == 0) {
				Static5.anIntArray808[local50] = local7 - 1;
				Static327.anIntArray702[local50] = local9 + 1;
				Static287.anIntArrayArray44[local74 - 1][local70 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local74 - 1][local70 + 1] = local243;
			}
			if (local74 < 126 && local70 < 126 && Static287.anIntArrayArray44[local74 + 1][local70 + 1] == 0 && (local55[local86 + 1][local91 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local91 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local91 + 1] & 0x78E40000) == 0) {
				Static5.anIntArray808[local50] = local7 + 1;
				Static327.anIntArray702[local50] = local9 + 1;
				Static287.anIntArrayArray44[local74 + 1][local70 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local74 + 1][local70 + 1] = local243;
			}
		}
		Static168.anInt2996 = local9;
		Static58.anInt5539 = local7;
		return false;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg2;
		@Pc(21) int local21 = arg0 - arg2;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(45) int local45 = local16 * local16;
		@Pc(49) int local49 = local21 * local21;
		@Pc(53) int local53 = local29 << 1;
		@Pc(57) int local57 = local25 << 1;
		@Pc(61) int local61 = local49 << 1;
		@Pc(65) int local65 = local45 << 1;
		@Pc(69) int local69 = arg0 << 1;
		@Pc(73) int local73 = local21 << 1;
		@Pc(82) int local82 = local53 + (1 - local69) * local25;
		@Pc(91) int local91 = local29 - (local69 - 1) * local57;
		@Pc(100) int local100 = (1 - local73) * local45 + local61;
		@Pc(109) int local109 = local49 - local65 * (local73 - 1);
		@Pc(113) int local113 = local25 << 2;
		@Pc(117) int local117 = local29 << 2;
		@Pc(121) int local121 = local45 << 2;
		@Pc(125) int local125 = local49 << 2;
		@Pc(129) int local129 = local53 * 3;
		@Pc(135) int local135 = (local69 - 3) * local57;
		@Pc(139) int local139 = local61 * 3;
		@Pc(145) int local145 = (local73 - 3) * local65;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (arg0 - 1) * local113;
		@Pc(155) int local155 = local125;
		@Pc(161) int local161 = (local21 - 1) * local121;
		@Pc(165) int[] local165 = Static267.anIntArrayArray38[arg3];
		Static264.method4096(local165, arg1, arg5 - local16, -arg6 + arg5);
		Static264.method4096(local165, arg4, local16 + arg5, -local16 + arg5);
		Static264.method4096(local165, arg1, arg5 + arg6, local16 + arg5);
		while (local9 > 0) {
			@Pc(212) boolean local212 = local9 <= local21;
			if (local82 < 0) {
				while (local82 < 0) {
					local82 += local129;
					local91 += local147;
					local7++;
					local147 += local117;
					local129 += local117;
				}
			}
			if (local212) {
				if (local100 < 0) {
					while (local100 < 0) {
						local109 += local155;
						local100 += local139;
						local11++;
						local155 += local125;
						local139 += local125;
					}
				}
				if (local109 < 0) {
					local109 += local155;
					local100 += local139;
					local155 += local125;
					local11++;
					local139 += local125;
				}
				local109 += -local145;
				local100 += -local161;
				local145 -= local121;
				local161 -= local121;
			}
			if (local91 < 0) {
				local82 += local129;
				local91 += local147;
				local129 += local117;
				local7++;
				local147 += local117;
			}
			local91 += -local135;
			local82 += -local153;
			local9--;
			local153 -= local113;
			local135 -= local113;
			@Pc(348) int local348 = arg3 - local9;
			@Pc(352) int local352 = arg3 + local9;
			@Pc(356) int local356 = local7 + arg5;
			@Pc(360) int local360 = arg5 - local7;
			if (local212) {
				@Pc(384) int local384 = local11 + arg5;
				@Pc(389) int local389 = arg5 - local11;
				Static264.method4096(Static267.anIntArrayArray38[local348], arg1, local389, local360);
				Static264.method4096(Static267.anIntArrayArray38[local348], arg4, local384, local389);
				Static264.method4096(Static267.anIntArrayArray38[local348], arg1, local356, local384);
				Static264.method4096(Static267.anIntArrayArray38[local352], arg1, local389, local360);
				Static264.method4096(Static267.anIntArrayArray38[local352], arg4, local384, local389);
				Static264.method4096(Static267.anIntArrayArray38[local352], arg1, local356, local384);
			} else {
				Static264.method4096(Static267.anIntArrayArray38[local348], arg1, local356, local360);
				Static264.method4096(Static267.anIntArrayArray38[local352], arg1, local356, local360);
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIBI)V")
	public static void method709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static332.anInt5823 <= arg2 && arg3 <= Static202.anInt3722 && Static313.anInt5542 <= arg4 && arg5 <= Static345.anInt6084) {
			if (arg0 == 1) {
				Static202.method3379(arg4, arg2, arg5, arg3, arg1);
			} else {
				Static369.method5557(arg4, arg3, arg1, arg5, arg0, arg2);
			}
		} else if (arg0 == 1) {
			Static392.method5754(arg2, arg1, arg4, arg5, arg3);
		} else {
			Static275.method4289(arg1, arg5, arg3, arg0, arg4, arg2);
		}
	}
}
