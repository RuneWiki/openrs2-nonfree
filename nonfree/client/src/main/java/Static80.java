import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Lclient!oja;")
	public static Class256 aClass256_8;

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIIILclient!oga;I)Z")
	public static boolean method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class252 arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = arg7;
		@Pc(12) int local12 = arg1;
		@Pc(21) int local21 = arg7 - 64;
		Static199.anIntArrayArray20[64][64] = 99;
		@Pc(32) int local32 = arg1 - 64;
		Static94.anIntArrayArray13[64][64] = 0;
		@Pc(40) byte local40 = 0;
		@Pc(42) int local42 = 0;
		Static19.anIntArray26[0] = arg7;
		@Pc(49) int local49 = local40 + 1;
		Static491.anIntArray684[0] = arg1;
		@Pc(54) int[][] local54 = arg8.anIntArrayArray45;
		while (local42 != local49) {
			local12 = Static491.anIntArray684[local42];
			local10 = Static19.anIntArray26[local42];
			@Pc(68) int local68 = local10 - local21;
			@Pc(73) int local73 = local12 - local32;
			local42 = local42 + 1 & 0xFFF;
			@Pc(85) int local85 = local10 - arg8.anInt6837;
			@Pc(90) int local90 = local12 - arg8.anInt6831;
			if (arg0 == -4) {
				if (local10 == arg9 && local12 == arg5) {
					Static561.anInt9113 = local12;
					Static421.anInt6741 = local10;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static510.method4484(arg3, arg5, arg9, arg2, local10, 2, 2, local12)) {
					Static561.anInt9113 = local12;
					Static421.anInt6741 = local10;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg8.method6162(arg9, local10, 2, arg3, arg5, local12, 2, arg4, arg2)) {
					Static561.anInt9113 = local12;
					Static421.anInt6741 = local10;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg8.method6168(local12, arg3, arg2, arg4, arg9, local10, arg5, 2)) {
					Static421.anInt6741 = local10;
					Static561.anInt9113 = local12;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg8.method6163(arg0, arg5, local12, arg9, 2, arg6, local10)) {
					Static561.anInt9113 = local12;
					Static421.anInt6741 = local10;
					return true;
				}
			} else if (arg8.method6171(arg6, arg9, local10, arg0, local12, arg5, 2)) {
				Static421.anInt6741 = local10;
				Static561.anInt9113 = local12;
				return true;
			}
			@Pc(245) int local245 = Static94.anIntArrayArray13[local68][local73] + 1;
			if (local68 > 0 && Static199.anIntArrayArray20[local68 - 1][local73] == 0 && (local54[local85 - 1][local90] & 0x43A40000) == 0 && (local54[local85 - 1][local90 + 1] & 0x4E240000) == 0) {
				Static19.anIntArray26[local49] = local10 - 1;
				Static491.anIntArray684[local49] = local12;
				local49 = local49 + 1 & 0xFFF;
				Static199.anIntArrayArray20[local68 - 1][local73] = 2;
				Static94.anIntArrayArray13[local68 - 1][local73] = local245;
			}
			if (local68 < 126 && Static199.anIntArrayArray20[local68 + 1][local73] == 0 && (local54[local85 + 2][local90] & 0x60E40000) == 0 && (local54[local85 + 2][local90 + 1] & 0x78240000) == 0) {
				Static19.anIntArray26[local49] = local10 + 1;
				Static491.anIntArray684[local49] = local12;
				Static199.anIntArrayArray20[local68 + 1][local73] = 8;
				local49 = local49 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local68 + 1][local73] = local245;
			}
			if (local73 > 0 && Static199.anIntArrayArray20[local68][local73 - 1] == 0 && (local54[local85][local90 - 1] & 0x43A40000) == 0 && (local54[local85 + 1][local90 - 1] & 0x60E40000) == 0) {
				Static19.anIntArray26[local49] = local10;
				Static491.anIntArray684[local49] = local12 - 1;
				Static199.anIntArrayArray20[local68][local73 - 1] = 1;
				local49 = local49 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local68][local73 - 1] = local245;
			}
			if (local73 < 126 && Static199.anIntArrayArray20[local68][local73 + 1] == 0 && (local54[local85][local90 + 2] & 0x4E240000) == 0 && (local54[local85 + 1][local90 + 2] & 0x78240000) == 0) {
				Static19.anIntArray26[local49] = local10;
				Static491.anIntArray684[local49] = local12 + 1;
				Static199.anIntArrayArray20[local68][local73 + 1] = 4;
				local49 = local49 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local68][local73 + 1] = local245;
			}
			if (local68 > 0 && local73 > 0 && Static199.anIntArrayArray20[local68 - 1][local73 - 1] == 0 && (local54[local85 - 1][local90] & 0x4FA40000) == 0 && (local54[local85 - 1][local90 - 1] & 0x43A40000) == 0 && (local54[local85][local90 - 1] & 0x63E40000) == 0) {
				Static19.anIntArray26[local49] = local10 - 1;
				Static491.anIntArray684[local49] = local12 - 1;
				Static199.anIntArrayArray20[local68 - 1][local73 - 1] = 3;
				local49 = local49 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local68 - 1][local73 - 1] = local245;
			}
			if (local68 < 126 && local73 > 0 && Static199.anIntArrayArray20[local68 + 1][local73 - 1] == 0 && (local54[local85 + 1][local90 - 1] & 0x63E40000) == 0 && (local54[local85 + 2][local90 - 1] & 0x60E40000) == 0 && (local54[local85 + 2][local90] & 0x78E40000) == 0) {
				Static19.anIntArray26[local49] = local10 + 1;
				Static491.anIntArray684[local49] = local12 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static199.anIntArrayArray20[local68 + 1][local73 - 1] = 9;
				Static94.anIntArrayArray13[local68 + 1][local73 - 1] = local245;
			}
			if (local68 > 0 && local73 < 126 && Static199.anIntArrayArray20[local68 - 1][local73 + 1] == 0 && (local54[local85 - 1][local90 + 1] & 0x4FA40000) == 0 && (local54[local85 - 1][local90 + 2] & 0x4E240000) == 0 && (local54[local85][local90 + 2] & 0x7E240000) == 0) {
				Static19.anIntArray26[local49] = local10 - 1;
				Static491.anIntArray684[local49] = local12 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static199.anIntArrayArray20[local68 - 1][local73 + 1] = 6;
				Static94.anIntArrayArray13[local68 - 1][local73 + 1] = local245;
			}
			if (local68 < 126 && local73 < 126 && Static199.anIntArrayArray20[local68 + 1][local73 + 1] == 0 && (local54[local85 + 1][local90 + 2] & 0x7E240000) == 0 && (local54[local85 + 2][local90 + 2] & 0x78240000) == 0 && (local54[local85 + 2][local90 + 1] & 0x78E40000) == 0) {
				Static19.anIntArray26[local49] = local10 + 1;
				Static491.anIntArray684[local49] = local12 + 1;
				Static199.anIntArrayArray20[local68 + 1][local73 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local68 + 1][local73 + 1] = local245;
			}
		}
		Static561.anInt9113 = local12;
		Static421.anInt6741 = local10;
		return false;
	}
}
