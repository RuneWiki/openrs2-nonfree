import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "Lclient!cf;")
	public static final Class51 aClass51_10 = new Class51();

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
	public static int anInt4840 = -1;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
	public static int anInt4841 = 0;

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "F")
	public static float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILclient!nc;IIBIIII)Z")
	public static boolean method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class220 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(22) int local22 = arg5 - 64;
		Static418.anIntArrayArray75[64][64] = 99;
		Static360.anIntArrayArray105[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static346.anIntArray349[0] = arg6;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static307.anIntArray276[0] = arg5;
		@Pc(55) int[][] local55 = arg3.anIntArrayArray66;
		while (local47 != local50) {
			local9 = Static307.anIntArray276[local47];
			local7 = Static346.anIntArray349[local47];
			@Pc(70) int local70 = local9 - local22;
			@Pc(75) int local75 = local7 - local18;
			local47 = local47 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg3.anInt6298;
			@Pc(93) int local93 = local9 - arg3.anInt6303;
			if (arg0 == -4) {
				if (arg9 == local7 && arg4 == local9) {
					Static395.anInt6981 = local7;
					Static454.anInt7943 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static391.method5552(local9, arg2, 2, arg4, arg1, local7, 2, arg9)) {
					Static454.anInt7943 = local9;
					Static395.anInt6981 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg3.method5078(arg2, local7, local9, arg9, arg4, arg7, 2, 2, arg1)) {
					Static395.anInt6981 = local7;
					Static454.anInt7943 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg3.method5082(arg1, local7, local9, arg7, 2, arg2, arg9, arg4)) {
					Static454.anInt7943 = local9;
					Static395.anInt6981 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg3.method5083(arg4, local9, arg8, arg0, arg9, 2, local7)) {
					Static395.anInt6981 = local7;
					Static454.anInt7943 = local9;
					return true;
				}
			} else if (arg3.method5089(2, arg4, arg8, arg9, local9, arg0, local7)) {
				Static454.anInt7943 = local9;
				Static395.anInt6981 = local7;
				return true;
			}
			@Pc(243) int local243 = Static360.anIntArrayArray105[local75][local70] + 1;
			if (local75 > 0 && Static418.anIntArrayArray75[local75 - 1][local70] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static346.anIntArray349[local50] = local7 - 1;
				Static307.anIntArray276[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local75 - 1][local70] = 2;
				Static360.anIntArrayArray105[local75 - 1][local70] = local243;
			}
			if (local75 < 126 && Static418.anIntArrayArray75[local75 + 1][local70] == 0 && (local55[local87 + 2][local93] & 0x60E40000) == 0 && (local55[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static346.anIntArray349[local50] = local7 + 1;
				Static307.anIntArray276[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local75 + 1][local70] = 8;
				Static360.anIntArrayArray105[local75 + 1][local70] = local243;
			}
			if (local70 > 0 && Static418.anIntArrayArray75[local75][local70 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static346.anIntArray349[local50] = local7;
				Static307.anIntArray276[local50] = local9 - 1;
				Static418.anIntArrayArray75[local75][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static360.anIntArrayArray105[local75][local70 - 1] = local243;
			}
			if (local70 < 126 && Static418.anIntArrayArray75[local75][local70 + 1] == 0 && (local55[local87][local93 + 2] & 0x4E240000) == 0 && (local55[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static346.anIntArray349[local50] = local7;
				Static307.anIntArray276[local50] = local9 + 1;
				Static418.anIntArrayArray75[local75][local70 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static360.anIntArrayArray105[local75][local70 + 1] = local243;
			}
			if (local75 > 0 && local70 > 0 && Static418.anIntArrayArray75[local75 - 1][local70 - 1] == 0 && (local55[local87 - 1][local93] & 0x4FA40000) == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local55[local87][local93 - 1] & 0x63E40000) == 0) {
				Static346.anIntArray349[local50] = local7 - 1;
				Static307.anIntArray276[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local75 - 1][local70 - 1] = 3;
				Static360.anIntArrayArray105[local75 - 1][local70 - 1] = local243;
			}
			if (local75 < 126 && local70 > 0 && Static418.anIntArrayArray75[local75 + 1][local70 - 1] == 0 && (local55[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local55[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local55[local87 + 2][local93] & 0x78E40000) == 0) {
				Static346.anIntArray349[local50] = local7 + 1;
				Static307.anIntArray276[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static418.anIntArrayArray75[local75 + 1][local70 - 1] = 9;
				Static360.anIntArrayArray105[local75 + 1][local70 - 1] = local243;
			}
			if (local75 > 0 && local70 < 126 && Static418.anIntArrayArray75[local75 - 1][local70 + 1] == 0 && (local55[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local55[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local55[local87][local93 + 2] & 0x7E240000) == 0) {
				Static346.anIntArray349[local50] = local7 - 1;
				Static307.anIntArray276[local50] = local9 + 1;
				Static418.anIntArrayArray75[local75 - 1][local70 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static360.anIntArrayArray105[local75 - 1][local70 + 1] = local243;
			}
			if (local75 < 126 && local70 < 126 && Static418.anIntArrayArray75[local75 + 1][local70 + 1] == 0 && (local55[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local55[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local55[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static346.anIntArray349[local50] = local7 + 1;
				Static307.anIntArray276[local50] = local9 + 1;
				Static418.anIntArrayArray75[local75 + 1][local70 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static360.anIntArrayArray105[local75 + 1][local70 + 1] = local243;
			}
		}
		Static454.anInt7943 = local9;
		Static395.anInt6981 = local7;
		return false;
	}
}
