import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString7 = null;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIILclient!ep;I)Z")
	public static boolean method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class70 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg7;
		@Pc(17) int local17 = arg9 - 64;
		Static444.anIntArrayArray62[64][64] = 99;
		@Pc(28) int local28 = arg7 - 64;
		Static430.anIntArrayArray61[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static345.anIntArray498[0] = arg9;
		@Pc(42) int local42 = 0;
		@Pc(53) int local53 = local36 + 1;
		Static276.anIntArray422[0] = arg7;
		@Pc(58) int[][] local58 = arg8.anIntArrayArray10;
		while (local42 != local53) {
			local7 = Static345.anIntArray498[local42];
			local9 = Static276.anIntArray422[local42];
			@Pc(74) int local74 = local7 - arg8.anInt1966;
			@Pc(80) int local80 = local9 - arg8.anInt1971;
			local42 = local42 + 1 & 0xFFF;
			@Pc(91) int local91 = local7 - local17;
			@Pc(95) int local95 = local9 - local28;
			if (arg4 == -4) {
				if (arg6 == local7 && arg1 == local9) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static344.method4453(local7, arg6, 1, local9, arg5, arg1, 1, arg3)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg8.method1698(1, arg3, local9, arg5, arg6, 1, arg0, arg1, local7)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg8.method1695(local9, local7, 1, arg3, arg5, arg0, arg1, arg6)) {
					Static448.anInt7376 = local7;
					Static416.anInt6617 = local9;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg8.method1699(local9, arg4, arg6, 1, arg2, local7, arg1)) {
					Static416.anInt6617 = local9;
					Static448.anInt7376 = local7;
					return true;
				}
			} else if (arg8.method1696(arg6, arg2, arg1, local7, local9, 1, arg4)) {
				Static448.anInt7376 = local7;
				Static416.anInt6617 = local9;
				return true;
			}
			@Pc(243) int local243 = Static430.anIntArrayArray61[local91][local95] + 1;
			if (local91 > 0 && Static444.anIntArrayArray62[local91 - 1][local95] == 0 && (local58[local74 - 1][local80] & 0x42240000) == 0) {
				Static345.anIntArray498[local53] = local7 - 1;
				Static276.anIntArray422[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static444.anIntArrayArray62[local91 - 1][local95] = 2;
				Static430.anIntArrayArray61[local91 - 1][local95] = local243;
			}
			if (local91 < 127 && Static444.anIntArrayArray62[local91 + 1][local95] == 0 && (local58[local74 + 1][local80] & 0x60240000) == 0) {
				Static345.anIntArray498[local53] = local7 + 1;
				Static276.anIntArray422[local53] = local9;
				Static444.anIntArrayArray62[local91 + 1][local95] = 8;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local91 + 1][local95] = local243;
			}
			if (local95 > 0 && Static444.anIntArrayArray62[local91][local95 - 1] == 0 && (local58[local74][local80 - 1] & 0x40A40000) == 0) {
				Static345.anIntArray498[local53] = local7;
				Static276.anIntArray422[local53] = local9 - 1;
				Static444.anIntArrayArray62[local91][local95 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local91][local95 - 1] = local243;
			}
			if (local95 < 127 && Static444.anIntArrayArray62[local91][local95 + 1] == 0 && (local58[local74][local80 + 1] & 0x48240000) == 0) {
				Static345.anIntArray498[local53] = local7;
				Static276.anIntArray422[local53] = local9 + 1;
				Static444.anIntArrayArray62[local91][local95 + 1] = 4;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local91][local95 + 1] = local243;
			}
			if (local91 > 0 && local95 > 0 && Static444.anIntArrayArray62[local91 - 1][local95 - 1] == 0 && (local58[local74 - 1][local80 - 1] & 0x43A40000) == 0 && (local58[local74 - 1][local80] & 0x42240000) == 0 && (local58[local74][local80 - 1] & 0x40A40000) == 0) {
				Static345.anIntArray498[local53] = local7 - 1;
				Static276.anIntArray422[local53] = local9 - 1;
				Static444.anIntArrayArray62[local91 - 1][local95 - 1] = 3;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local91 - 1][local95 - 1] = local243;
			}
			if (local91 < 127 && local95 > 0 && Static444.anIntArrayArray62[local91 + 1][local95 - 1] == 0 && (local58[local74 + 1][local80 - 1] & 0x60E40000) == 0 && (local58[local74 + 1][local80] & 0x60240000) == 0 && (local58[local74][local80 - 1] & 0x40A40000) == 0) {
				Static345.anIntArray498[local53] = local7 + 1;
				Static276.anIntArray422[local53] = local9 - 1;
				Static444.anIntArrayArray62[local91 + 1][local95 - 1] = 9;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray61[local91 + 1][local95 - 1] = local243;
			}
			if (local91 > 0 && local95 < 127 && Static444.anIntArrayArray62[local91 - 1][local95 + 1] == 0 && (local58[local74 - 1][local80 + 1] & 0x4E240000) == 0 && (local58[local74 - 1][local80] & 0x42240000) == 0 && (local58[local74][local80 + 1] & 0x48240000) == 0) {
				Static345.anIntArray498[local53] = local7 - 1;
				Static276.anIntArray422[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static444.anIntArrayArray62[local91 - 1][local95 + 1] = 6;
				Static430.anIntArrayArray61[local91 - 1][local95 + 1] = local243;
			}
			if (local91 < 127 && local95 < 127 && Static444.anIntArrayArray62[local91 + 1][local95 + 1] == 0 && (local58[local74 + 1][local80 + 1] & 0x78240000) == 0 && (local58[local74 + 1][local80] & 0x60240000) == 0 && (local58[local74][local80 + 1] & 0x48240000) == 0) {
				Static345.anIntArray498[local53] = local7 + 1;
				Static276.anIntArray422[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static444.anIntArrayArray62[local91 + 1][local95 + 1] = 12;
				Static430.anIntArrayArray61[local91 + 1][local95 + 1] = local243;
			}
		}
		Static448.anInt7376 = local7;
		Static416.anInt6617 = local9;
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!kq;I)Z")
	public static boolean method1202(@OriginalArg(0) Class136 arg0) {
		return Static141.aClass136_4 == arg0 || Static216.aClass136_3 == arg0 || Static330.aClass136_8 == arg0 || Static208.aClass136_6 == arg0;
	}
}
