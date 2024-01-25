import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	public static int anInt4464;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
	public static boolean aBoolean285 = false;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_98 = new Class55(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_97 = new Class253(69, 4);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ep;IIBIIIII)Z")
	public static boolean method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg4;
		@Pc(23) int local23 = arg8 - 64;
		Static444.anIntArrayArray62[64][64] = 99;
		@Pc(34) int local34 = arg4 - 64;
		Static430.anIntArrayArray61[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static345.anIntArray498[0] = arg8;
		@Pc(51) int local51 = local42 + 1;
		Static276.anIntArray422[0] = arg4;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray10;
		while (local51 != local44) {
			local7 = Static345.anIntArray498[local44];
			local9 = Static276.anIntArray422[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local23;
			@Pc(81) int local81 = local9 - local34;
			@Pc(87) int local87 = local7 - arg2.anInt1966;
			@Pc(93) int local93 = local9 - arg2.anInt1971;
			if (arg5 == -4) {
				if (arg9 == local7 && local9 == arg1) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static344.method4453(local7, arg9, 2, local9, arg6, arg1, 2, arg7)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg2.method1698(2, arg7, local9, arg6, arg9, 2, arg3, arg1, local7)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg2.method1695(local9, local7, 2, arg7, arg6, arg3, arg1, arg9)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg2.method1699(local9, arg5, arg9, 2, arg0, local7, arg1)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg2.method1696(arg9, arg0, arg1, local7, local9, 2, arg5)) {
				Static448.anInt7376 = local7;
				Static416.anInt6617 = local9;
				return true;
			}
			@Pc(246) int local246 = Static430.anIntArrayArray61[local76][local81] + 1;
			if (local76 > 0 && Static444.anIntArrayArray62[local76 - 1][local81] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static345.anIntArray498[local51] = local7 - 1;
				Static276.anIntArray422[local51] = local9;
				Static444.anIntArrayArray62[local76 - 1][local81] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local76 - 1][local81] = local246;
			}
			if (local76 < 126 && Static444.anIntArrayArray62[local76 + 1][local81] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static345.anIntArray498[local51] = local7 + 1;
				Static276.anIntArray422[local51] = local9;
				Static444.anIntArrayArray62[local76 + 1][local81] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local76 + 1][local81] = local246;
			}
			if (local81 > 0 && Static444.anIntArrayArray62[local76][local81 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static345.anIntArray498[local51] = local7;
				Static276.anIntArray422[local51] = local9 - 1;
				Static444.anIntArrayArray62[local76][local81 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local76][local81 - 1] = local246;
			}
			if (local81 < 126 && Static444.anIntArrayArray62[local76][local81 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static345.anIntArray498[local51] = local7;
				Static276.anIntArray422[local51] = local9 + 1;
				Static444.anIntArrayArray62[local76][local81 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local76][local81 + 1] = local246;
			}
			if (local76 > 0 && local81 > 0 && Static444.anIntArrayArray62[local76 - 1][local81 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static345.anIntArray498[local51] = local7 - 1;
				Static276.anIntArray422[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static444.anIntArrayArray62[local76 - 1][local81 - 1] = 3;
				Static430.anIntArrayArray61[local76 - 1][local81 - 1] = local246;
			}
			if (local76 < 126 && local81 > 0 && Static444.anIntArrayArray62[local76 + 1][local81 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static345.anIntArray498[local51] = local7 + 1;
				Static276.anIntArray422[local51] = local9 - 1;
				Static444.anIntArrayArray62[local76 + 1][local81 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local76 + 1][local81 - 1] = local246;
			}
			if (local76 > 0 && local81 < 126 && Static444.anIntArrayArray62[local76 - 1][local81 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static345.anIntArray498[local51] = local7 - 1;
				Static276.anIntArray422[local51] = local9 + 1;
				Static444.anIntArrayArray62[local76 - 1][local81 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local76 - 1][local81 + 1] = local246;
			}
			if (local76 < 126 && local81 < 126 && Static444.anIntArrayArray62[local76 + 1][local81 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static345.anIntArray498[local51] = local7 + 1;
				Static276.anIntArray422[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static444.anIntArrayArray62[local76 + 1][local81 + 1] = 12;
				Static430.anIntArrayArray61[local76 + 1][local81 + 1] = local246;
			}
		}
		Static448.anInt7376 = local7;
		Static416.anInt6617 = local9;
		return false;
	}
}
