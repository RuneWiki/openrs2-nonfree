import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt7695;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_237 = new Class272(43, -2);

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
	public static int[] anIntArray596 = new int[1];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!pc;IIIZ)Z")
	public static boolean method6496(@OriginalArg(0) Class9_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static32.aBoolean54) {
			return false;
		} else if (Static151.anInt3128 < 100) {
			return false;
		} else if (Static477.method6554(arg3, arg2, arg1)) {
			@Pc(24) int local24 = arg3 << Static458.anInt7508;
			@Pc(28) int local28 = arg1 << Static458.anInt7508;
			@Pc(38) int local38 = Static29.aClass139Array6[arg2].method6889(arg3, arg1) - 1;
			@Pc(44) int local44 = arg0.method7478() + local38;
			if (arg0.aShort103 == 1) {
				if (!Static172.method2976(local28, local24, local44, local28, local28 + Static511.anInt8116, local38, local24, local24, local44)) {
					return false;
				} else if (Static172.method2976(local28, local24, local38, Static511.anInt8116 + local28, Static511.anInt8116 + local28, local38, local24, local24, local44)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 == 2) {
				if (!Static172.method2976(local28 + Static511.anInt8116, local24, local44, Static511.anInt8116 + local28, local28 - -Static511.anInt8116, local38, local24, Static511.anInt8116 + local24, local44)) {
					return false;
				} else if (Static172.method2976(Static511.anInt8116 + local28, Static511.anInt8116 + local24, local44, Static511.anInt8116 + local28, local28 + Static511.anInt8116, local38, local24, local24 + Static511.anInt8116, local38)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 == 4) {
				if (!Static172.method2976(local28, local24 + Static511.anInt8116, local44, local28, local28 + Static511.anInt8116, local38, local24 + Static511.anInt8116, Static511.anInt8116 + local24, local44)) {
					return false;
				} else if (Static172.method2976(local28, local24 + Static511.anInt8116, local38, Static511.anInt8116 + local28, local28 - -Static511.anInt8116, local38, Static511.anInt8116 + local24, local24 + Static511.anInt8116, local44)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 == 8) {
				if (!Static172.method2976(local28, local24, local44, local28, local28, local38, local24, local24 + Static511.anInt8116, local44)) {
					return false;
				} else if (Static172.method2976(local28, local24 + Static511.anInt8116, local44, local28, local28, local38, local24, local24 + Static511.anInt8116, local38)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 == 16) {
				if (Static518.method6898(Static122.anInt2780, local44, local38, Static122.anInt2780 + local28, local24, Static122.anInt2780)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 == 32) {
				if (Static518.method6898(Static122.anInt2780, local44, local38, Static122.anInt2780 + local28, Static122.anInt2780 + local24, Static122.anInt2780)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 == 64) {
				if (Static518.method6898(Static122.anInt2780, local44, local38, local28, Static122.anInt2780 + local24, Static122.anInt2780)) {
					Static41.anInt968++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort103 != 128) {
				return true;
			} else if (Static518.method6898(Static122.anInt2780, local44, local38, local28, local24, Static122.anInt2780)) {
				Static41.anInt968++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIIBILclient!fh;)Z")
	public static boolean method6497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class95 arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg8;
		@Pc(17) int local17 = arg2 - 64;
		@Pc(21) int local21 = arg8 - 64;
		Static227.anIntArrayArray33[64][64] = 99;
		Static594.anIntArrayArray72[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static425.anIntArray560[0] = arg2;
		@Pc(52) int local52 = local43 + 1;
		Static554.anIntArray652[0] = arg8;
		@Pc(57) int[][] local57 = arg9.anIntArrayArray22;
		while (local52 != local45) {
			local9 = Static554.anIntArray652[local45];
			local7 = Static425.anIntArray560[local45];
			@Pc(71) int local71 = local7 - local17;
			local45 = local45 + 1 & 0xFFF;
			@Pc(81) int local81 = local9 - local21;
			@Pc(87) int local87 = local9 - arg9.anInt3057;
			@Pc(93) int local93 = local7 - arg9.anInt3047;
			if (arg7 == -4) {
				if (local7 == arg1 && arg6 == local9) {
					Static526.anInt8326 = local7;
					Static531.anInt8359 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static461.method6384(arg3, arg6, local7, 1, arg4, 1, local9, arg1)) {
					Static531.anInt8359 = local9;
					Static526.anInt8326 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg9.method2727(1, arg3, arg6, local9, arg4, arg5, local7, 1, arg1)) {
					Static531.anInt8359 = local9;
					Static526.anInt8326 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg9.method2734(arg1, arg5, arg6, arg3, local9, 1, arg4, local7)) {
					Static526.anInt8326 = local7;
					Static531.anInt8359 = local9;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg9.method2737(arg1, arg7, 1, arg6, arg0, local9, local7)) {
					Static526.anInt8326 = local7;
					Static531.anInt8359 = local9;
					return true;
				}
			} else if (arg9.method2735(1, arg1, local9, arg7, arg6, arg0, local7)) {
				Static531.anInt8359 = local9;
				Static526.anInt8326 = local7;
				return true;
			}
			@Pc(243) int local243 = Static594.anIntArrayArray72[local71][local81] + 1;
			if (local71 > 0 && Static227.anIntArrayArray33[local71 - 1][local81] == 0 && (local57[local93 - 1][local87] & 0x42240000) == 0) {
				Static425.anIntArray560[local52] = local7 - 1;
				Static554.anIntArray652[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local71 - 1][local81] = 2;
				Static594.anIntArrayArray72[local71 - 1][local81] = local243;
			}
			if (local71 < 127 && Static227.anIntArrayArray33[local71 + 1][local81] == 0 && (local57[local93 + 1][local87] & 0x60240000) == 0) {
				Static425.anIntArray560[local52] = local7 + 1;
				Static554.anIntArray652[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local71 + 1][local81] = 8;
				Static594.anIntArrayArray72[local71 + 1][local81] = local243;
			}
			if (local81 > 0 && Static227.anIntArrayArray33[local71][local81 - 1] == 0 && (local57[local93][local87 - 1] & 0x40A40000) == 0) {
				Static425.anIntArray560[local52] = local7;
				Static554.anIntArray652[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local71][local81 - 1] = 1;
				Static594.anIntArrayArray72[local71][local81 - 1] = local243;
			}
			if (local81 < 127 && Static227.anIntArrayArray33[local71][local81 + 1] == 0 && (local57[local93][local87 + 1] & 0x48240000) == 0) {
				Static425.anIntArray560[local52] = local7;
				Static554.anIntArray652[local52] = local9 + 1;
				Static227.anIntArrayArray33[local71][local81 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local71][local81 + 1] = local243;
			}
			if (local71 > 0 && local81 > 0 && Static227.anIntArrayArray33[local71 - 1][local81 - 1] == 0 && (local57[local93 - 1][local87 - 1] & 0x43A40000) == 0 && (local57[local93 - 1][local87] & 0x42240000) == 0 && (local57[local93][local87 - 1] & 0x40A40000) == 0) {
				Static425.anIntArray560[local52] = local7 - 1;
				Static554.anIntArray652[local52] = local9 - 1;
				Static227.anIntArrayArray33[local71 - 1][local81 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local71 - 1][local81 - 1] = local243;
			}
			if (local71 < 127 && local81 > 0 && Static227.anIntArrayArray33[local71 + 1][local81 - 1] == 0 && (local57[local93 + 1][local87 - 1] & 0x60E40000) == 0 && (local57[local93 + 1][local87] & 0x60240000) == 0 && (local57[local93][local87 - 1] & 0x40A40000) == 0) {
				Static425.anIntArray560[local52] = local7 + 1;
				Static554.anIntArray652[local52] = local9 - 1;
				Static227.anIntArrayArray33[local71 + 1][local81 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local71 + 1][local81 - 1] = local243;
			}
			if (local71 > 0 && local81 < 127 && Static227.anIntArrayArray33[local71 - 1][local81 + 1] == 0 && (local57[local93 - 1][local87 + 1] & 0x4E240000) == 0 && (local57[local93 - 1][local87] & 0x42240000) == 0 && (local57[local93][local87 + 1] & 0x48240000) == 0) {
				Static425.anIntArray560[local52] = local7 - 1;
				Static554.anIntArray652[local52] = local9 + 1;
				Static227.anIntArrayArray33[local71 - 1][local81 + 1] = 6;
				local52 = local52 + 1 & 0xFFF;
				Static594.anIntArrayArray72[local71 - 1][local81 + 1] = local243;
			}
			if (local71 < 127 && local81 < 127 && Static227.anIntArrayArray33[local71 + 1][local81 + 1] == 0 && (local57[local93 + 1][local87 + 1] & 0x78240000) == 0 && (local57[local93 + 1][local87] & 0x60240000) == 0 && (local57[local93][local87 + 1] & 0x48240000) == 0) {
				Static425.anIntArray560[local52] = local7 + 1;
				Static554.anIntArray652[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local71 + 1][local81 + 1] = 12;
				Static594.anIntArrayArray72[local71 + 1][local81 + 1] = local243;
			}
		}
		Static526.anInt8326 = local7;
		Static531.anInt8359 = local9;
		return false;
	}
}
