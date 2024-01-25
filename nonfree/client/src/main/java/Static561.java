import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array14;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_106 = new Class230(1, -1);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILclient!wca;IIIII)Z")
	public static boolean method8101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class350 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg6;
		@Pc(21) int local21 = arg0 - 64;
		@Pc(26) int local26 = arg6 - 64;
		Static114.anIntArrayArray22[64][64] = 99;
		Static187.anIntArrayArray30[64][64] = 0;
		@Pc(40) byte local40 = 0;
		@Pc(42) int local42 = 0;
		Static299.anIntArray374[0] = arg0;
		@Pc(49) int local49 = local40 + 1;
		Static279.anIntArray360[0] = arg6;
		@Pc(54) int[][] local54 = arg4.anIntArrayArray82;
		while (local42 != local49) {
			local7 = Static279.anIntArray360[local42];
			local5 = Static299.anIntArray374[local42];
			@Pc(67) int local67 = local5 - local21;
			@Pc(71) int local71 = local7 - local26;
			local42 = local42 + 1 & 0xFFF;
			@Pc(83) int local83 = local5 - arg4.anInt10126;
			@Pc(89) int local89 = local7 - arg4.anInt10122;
			if (arg1 == -4) {
				if (local5 == arg3 && local7 == arg2) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static2.method179(local7, 2, 2, local5, arg8, arg3, arg7, arg2)) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg4.method8221(arg3, arg7, 2, local5, local7, arg2, arg9, arg8, 2)) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg4.method8214(arg3, arg8, local7, arg7, arg2, local5, arg9, 2)) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg4.method8218(arg3, 2, arg1, arg5, arg2, local5, local7)) {
					Static524.anInt9583 = local7;
					Static364.anInt7216 = local5;
					return true;
				}
			} else if (arg4.method8216(local7, 2, arg2, arg3, arg5, arg1, local5)) {
				Static524.anInt9583 = local7;
				Static364.anInt7216 = local5;
				return true;
			}
			@Pc(233) int local233 = Static187.anIntArrayArray30[local67][local71] + 1;
			if (local67 > 0 && Static114.anIntArrayArray22[local67 - 1][local71] == 0 && (local54[local83 - 1][local89] & 0x43A40000) == 0 && (local54[local83 - 1][local89 + 1] & 0x4E240000) == 0) {
				Static299.anIntArray374[local49] = local5 - 1;
				Static279.anIntArray360[local49] = local7;
				Static114.anIntArrayArray22[local67 - 1][local71] = 2;
				local49 = local49 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local67 - 1][local71] = local233;
			}
			if (local67 < 126 && Static114.anIntArrayArray22[local67 + 1][local71] == 0 && (local54[local83 + 2][local89] & 0x60E40000) == 0 && (local54[local83 + 2][local89 + 1] & 0x78240000) == 0) {
				Static299.anIntArray374[local49] = local5 + 1;
				Static279.anIntArray360[local49] = local7;
				Static114.anIntArrayArray22[local67 + 1][local71] = 8;
				local49 = local49 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local67 + 1][local71] = local233;
			}
			if (local71 > 0 && Static114.anIntArrayArray22[local67][local71 - 1] == 0 && (local54[local83][local89 - 1] & 0x43A40000) == 0 && (local54[local83 + 1][local89 - 1] & 0x60E40000) == 0) {
				Static299.anIntArray374[local49] = local5;
				Static279.anIntArray360[local49] = local7 - 1;
				Static114.anIntArrayArray22[local67][local71 - 1] = 1;
				local49 = local49 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local67][local71 - 1] = local233;
			}
			if (local71 < 126 && Static114.anIntArrayArray22[local67][local71 + 1] == 0 && (local54[local83][local89 + 2] & 0x4E240000) == 0 && (local54[local83 + 1][local89 + 2] & 0x78240000) == 0) {
				Static299.anIntArray374[local49] = local5;
				Static279.anIntArray360[local49] = local7 + 1;
				Static114.anIntArrayArray22[local67][local71 + 1] = 4;
				local49 = local49 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local67][local71 + 1] = local233;
			}
			if (local67 > 0 && local71 > 0 && Static114.anIntArrayArray22[local67 - 1][local71 - 1] == 0 && (local54[local83 - 1][local89] & 0x4FA40000) == 0 && (local54[local83 - 1][local89 - 1] & 0x43A40000) == 0 && (local54[local83][local89 - 1] & 0x63E40000) == 0) {
				Static299.anIntArray374[local49] = local5 - 1;
				Static279.anIntArray360[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static114.anIntArrayArray22[local67 - 1][local71 - 1] = 3;
				Static187.anIntArrayArray30[local67 - 1][local71 - 1] = local233;
			}
			if (local67 < 126 && local71 > 0 && Static114.anIntArrayArray22[local67 + 1][local71 - 1] == 0 && (local54[local83 + 1][local89 - 1] & 0x63E40000) == 0 && (local54[local83 + 2][local89 - 1] & 0x60E40000) == 0 && (local54[local83 + 2][local89] & 0x78E40000) == 0) {
				Static299.anIntArray374[local49] = local5 + 1;
				Static279.anIntArray360[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static114.anIntArrayArray22[local67 + 1][local71 - 1] = 9;
				Static187.anIntArrayArray30[local67 + 1][local71 - 1] = local233;
			}
			if (local67 > 0 && local71 < 126 && Static114.anIntArrayArray22[local67 - 1][local71 + 1] == 0 && (local54[local83 - 1][local89 + 1] & 0x4FA40000) == 0 && (local54[local83 - 1][local89 + 2] & 0x4E240000) == 0 && (local54[local83][local89 + 2] & 0x7E240000) == 0) {
				Static299.anIntArray374[local49] = local5 - 1;
				Static279.anIntArray360[local49] = local7 + 1;
				Static114.anIntArrayArray22[local67 - 1][local71 + 1] = 6;
				local49 = local49 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local67 - 1][local71 + 1] = local233;
			}
			if (local67 < 126 && local71 < 126 && Static114.anIntArrayArray22[local67 + 1][local71 + 1] == 0 && (local54[local83 + 1][local89 + 2] & 0x7E240000) == 0 && (local54[local83 + 2][local89 + 2] & 0x78240000) == 0 && (local54[local83 + 2][local89 + 1] & 0x78E40000) == 0) {
				Static299.anIntArray374[local49] = local5 + 1;
				Static279.anIntArray360[local49] = local7 + 1;
				Static114.anIntArrayArray22[local67 + 1][local71 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local67 + 1][local71 + 1] = local233;
			}
		}
		Static364.anInt7216 = local5;
		Static524.anInt9583 = local7;
		return false;
	}
}
