import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	public static int anInt5340;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	public static int anInt5342;

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Lclient!bi;")
	public static Class31 aClass31_63;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!gba;")
	public static Class115 aClass115_12 = null;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!bi;Lclient!bi;ILclient!bi;Lclient!nb;)Z")
	public static boolean method4528(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) Class4_Sub13_Sub3 arg3) {
		Static85.aClass31_22 = arg2;
		Static156.aClass31_35 = arg0;
		Static228.aClass4_Sub13_Sub3_2 = arg3;
		Static454.aClass31_98 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIILclient!ed;IIIIZII)Z")
	public static boolean method4529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(23) int local23 = arg6 - 64;
		Static456.anIntArrayArray66[64][64] = 99;
		Static518.anIntArrayArray74[64][64] = 0;
		@Pc(53) byte local53 = 0;
		Static539.anIntArray693[0] = arg8;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local53 + 1;
		Static440.anIntArray616[0] = arg6;
		@Pc(67) int[][] local67 = arg3.anIntArrayArray37;
		while (local59 != local62) {
			local9 = Static440.anIntArray616[local59];
			local7 = Static539.anIntArray693[local59];
			local59 = local59 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - local18;
			@Pc(93) int local93 = local9 - local23;
			@Pc(99) int local99 = local9 - arg3.anInt2638;
			@Pc(105) int local105 = local7 - arg3.anInt2635;
			if (arg1 == -4) {
				if (local7 == arg0 && local9 == arg7) {
					Static499.anInt8659 = local7;
					Static437.anInt7500 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static34.method7578(local9, 1, arg4, arg9, arg0, 1, arg7, local7)) {
					Static437.anInt7500 = local9;
					Static499.anInt8659 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg3.method2357(1, arg9, 1, arg7, local7, arg4, arg2, local9, arg0)) {
					Static499.anInt8659 = local7;
					Static437.anInt7500 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg3.method2347(local7, 1, arg7, arg9, local9, arg0, arg2, arg4)) {
					Static499.anInt8659 = local7;
					Static437.anInt7500 = local9;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg3.method2346(1, arg7, local9, local7, arg1, arg5, arg0)) {
					Static437.anInt7500 = local9;
					Static499.anInt8659 = local7;
					return true;
				}
			} else if (arg3.method2348(local9, 1, arg5, arg0, arg1, arg7, local7)) {
				Static437.anInt7500 = local9;
				Static499.anInt8659 = local7;
				return true;
			}
			@Pc(259) int local259 = Static518.anIntArrayArray74[local88][local93] + 1;
			if (local88 > 0 && Static456.anIntArrayArray66[local88 - 1][local93] == 0 && (local67[local105 - 1][local99] & 0x42240000) == 0) {
				Static539.anIntArray693[local62] = local7 - 1;
				Static440.anIntArray616[local62] = local9;
				Static456.anIntArrayArray66[local88 - 1][local93] = 2;
				local62 = local62 + 1 & 0xFFF;
				Static518.anIntArrayArray74[local88 - 1][local93] = local259;
			}
			if (local88 < 127 && Static456.anIntArrayArray66[local88 + 1][local93] == 0 && (local67[local105 + 1][local99] & 0x60240000) == 0) {
				Static539.anIntArray693[local62] = local7 + 1;
				Static440.anIntArray616[local62] = local9;
				local62 = local62 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local88 + 1][local93] = 8;
				Static518.anIntArrayArray74[local88 + 1][local93] = local259;
			}
			if (local93 > 0 && Static456.anIntArrayArray66[local88][local93 - 1] == 0 && (local67[local105][local99 - 1] & 0x40A40000) == 0) {
				Static539.anIntArray693[local62] = local7;
				Static440.anIntArray616[local62] = local9 - 1;
				Static456.anIntArrayArray66[local88][local93 - 1] = 1;
				local62 = local62 + 1 & 0xFFF;
				Static518.anIntArrayArray74[local88][local93 - 1] = local259;
			}
			if (local93 < 127 && Static456.anIntArrayArray66[local88][local93 + 1] == 0 && (local67[local105][local99 + 1] & 0x48240000) == 0) {
				Static539.anIntArray693[local62] = local7;
				Static440.anIntArray616[local62] = local9 + 1;
				Static456.anIntArrayArray66[local88][local93 + 1] = 4;
				local62 = local62 + 1 & 0xFFF;
				Static518.anIntArrayArray74[local88][local93 + 1] = local259;
			}
			if (local88 > 0 && local93 > 0 && Static456.anIntArrayArray66[local88 - 1][local93 - 1] == 0 && (local67[local105 - 1][local99 - 1] & 0x43A40000) == 0 && (local67[local105 - 1][local99] & 0x42240000) == 0 && (local67[local105][local99 - 1] & 0x40A40000) == 0) {
				Static539.anIntArray693[local62] = local7 - 1;
				Static440.anIntArray616[local62] = local9 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local88 - 1][local93 - 1] = 3;
				Static518.anIntArrayArray74[local88 - 1][local93 - 1] = local259;
			}
			if (local88 < 127 && local93 > 0 && Static456.anIntArrayArray66[local88 + 1][local93 - 1] == 0 && (local67[local105 + 1][local99 - 1] & 0x60E40000) == 0 && (local67[local105 + 1][local99] & 0x60240000) == 0 && (local67[local105][local99 - 1] & 0x40A40000) == 0) {
				Static539.anIntArray693[local62] = local7 + 1;
				Static440.anIntArray616[local62] = local9 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local88 + 1][local93 - 1] = 9;
				Static518.anIntArrayArray74[local88 + 1][local93 - 1] = local259;
			}
			if (local88 > 0 && local93 < 127 && Static456.anIntArrayArray66[local88 - 1][local93 + 1] == 0 && (local67[local105 - 1][local99 + 1] & 0x4E240000) == 0 && (local67[local105 - 1][local99] & 0x42240000) == 0 && (local67[local105][local99 + 1] & 0x48240000) == 0) {
				Static539.anIntArray693[local62] = local7 - 1;
				Static440.anIntArray616[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local88 - 1][local93 + 1] = 6;
				Static518.anIntArrayArray74[local88 - 1][local93 + 1] = local259;
			}
			if (local88 < 127 && local93 < 127 && Static456.anIntArrayArray66[local88 + 1][local93 + 1] == 0 && (local67[local105 + 1][local99 + 1] & 0x78240000) == 0 && (local67[local105 + 1][local99] & 0x60240000) == 0 && (local67[local105][local99 + 1] & 0x48240000) == 0) {
				Static539.anIntArray693[local62] = local7 + 1;
				Static440.anIntArray616[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static456.anIntArrayArray66[local88 + 1][local93 + 1] = 12;
				Static518.anIntArrayArray74[local88 + 1][local93 + 1] = local259;
			}
		}
		Static499.anInt8659 = local7;
		Static437.anInt7500 = local9;
		return false;
	}
}
