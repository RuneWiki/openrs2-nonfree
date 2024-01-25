import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "Lclient!sj;")
	public static final Class4_Sub13_Sub2 aClass4_Sub13_Sub2_2 = new Class4_Sub13_Sub2(7500);

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "[I")
	public static final int[] anIntArray566 = new int[14];

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "S")
	public static short aShort124 = 1;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIIIIILclient!nea;)Z")
	public static boolean method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class232 arg9) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg1 - 64;
		@Pc(23) int local23 = arg8 - 64;
		Static237.anIntArrayArray26[64][64] = 99;
		Static481.anIntArrayArray53[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static140.anIntArray146[0] = arg1;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static398.anIntArray416[0] = arg8;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray31;
		while (local48 != local51) {
			local9 = Static398.anIntArray416[local48];
			local7 = Static140.anIntArray146[local48];
			@Pc(71) int local71 = local7 - local18;
			local48 = local48 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local23;
			@Pc(88) int local88 = local7 - arg9.anInt6640;
			@Pc(93) int local93 = local9 - arg9.anInt6654;
			if (arg3 == -4) {
				if (local7 == arg0 && arg4 == local9) {
					Static208.anInt4412 = local9;
					Static263.anInt5323 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static407.method6148(2, local7, arg0, 2, local9, arg7, arg5, arg4)) {
					Static208.anInt4412 = local9;
					Static263.anInt5323 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg9.method5279(arg4, local7, arg6, local9, arg5, 2, 2, arg0, arg7)) {
					Static208.anInt4412 = local9;
					Static263.anInt5323 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg9.method5277(local9, local7, arg5, arg7, arg0, arg6, arg4, 2)) {
					Static263.anInt5323 = local7;
					Static208.anInt4412 = local9;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg9.method5267(local9, 2, arg3, arg2, arg0, local7, arg4)) {
					Static263.anInt5323 = local7;
					Static208.anInt4412 = local9;
					return true;
				}
			} else if (arg9.method5265(arg4, 2, arg3, arg0, local9, arg2, local7)) {
				Static263.anInt5323 = local7;
				Static208.anInt4412 = local9;
				return true;
			}
			@Pc(248) int local248 = Static481.anIntArrayArray53[local71][local82] + 1;
			if (local71 > 0 && Static237.anIntArrayArray26[local71 - 1][local82] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static140.anIntArray146[local51] = local7 - 1;
				Static398.anIntArray416[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local71 - 1][local82] = 2;
				Static481.anIntArrayArray53[local71 - 1][local82] = local248;
			}
			if (local71 < 126 && Static237.anIntArrayArray26[local71 + 1][local82] == 0 && (local56[local88 + 2][local93] & 0x60E40000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78240000) == 0) {
				Static140.anIntArray146[local51] = local7 + 1;
				Static398.anIntArray416[local51] = local9;
				Static237.anIntArrayArray26[local71 + 1][local82] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 + 1][local82] = local248;
			}
			if (local82 > 0 && Static237.anIntArrayArray26[local71][local82 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static140.anIntArray146[local51] = local7;
				Static398.anIntArray416[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local71][local82 - 1] = 1;
				Static481.anIntArrayArray53[local71][local82 - 1] = local248;
			}
			if (local82 < 126 && Static237.anIntArrayArray26[local71][local82 + 1] == 0 && (local56[local88][local93 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local93 + 2] & 0x78240000) == 0) {
				Static140.anIntArray146[local51] = local7;
				Static398.anIntArray416[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local71][local82 + 1] = 4;
				Static481.anIntArrayArray53[local71][local82 + 1] = local248;
			}
			if (local71 > 0 && local82 > 0 && Static237.anIntArrayArray26[local71 - 1][local82 - 1] == 0 && (local56[local88 - 1][local93] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local88][local93 - 1] & 0x63E40000) == 0) {
				Static140.anIntArray146[local51] = local7 - 1;
				Static398.anIntArray416[local51] = local9 - 1;
				Static237.anIntArrayArray26[local71 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 - 1][local82 - 1] = local248;
			}
			if (local71 < 126 && local82 > 0 && Static237.anIntArrayArray26[local71 + 1][local82 - 1] == 0 && (local56[local88 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local93] & 0x78E40000) == 0) {
				Static140.anIntArray146[local51] = local7 + 1;
				Static398.anIntArray416[local51] = local9 - 1;
				Static237.anIntArrayArray26[local71 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 + 1][local82 - 1] = local248;
			}
			if (local71 > 0 && local82 < 126 && Static237.anIntArrayArray26[local71 - 1][local82 + 1] == 0 && (local56[local88 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local88][local93 + 2] & 0x7E240000) == 0) {
				Static140.anIntArray146[local51] = local7 - 1;
				Static398.anIntArray416[local51] = local9 + 1;
				Static237.anIntArrayArray26[local71 - 1][local82 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local71 - 1][local82 + 1] = local248;
			}
			if (local71 < 126 && local82 < 126 && Static237.anIntArrayArray26[local71 + 1][local82 + 1] == 0 && (local56[local88 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static140.anIntArray146[local51] = local7 + 1;
				Static398.anIntArray416[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static237.anIntArrayArray26[local71 + 1][local82 + 1] = 12;
				Static481.anIntArrayArray53[local71 + 1][local82 + 1] = local248;
			}
		}
		Static263.anInt5323 = local7;
		Static208.anInt4412 = local9;
		return false;
	}
}
