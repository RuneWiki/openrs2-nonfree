import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hea", name = "H", descriptor = "Z")
	public static boolean aBoolean360;

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "[[[Lclient!mf;")
	public static Class217[][][] aClass217ArrayArrayArray2;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
	public static void method3577(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub5_Sub10 local13 = Static594.method8175(arg0, 14);
		local13.method4387();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIILclient!jn;IBIII)Z")
	public static boolean method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class179 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg7;
		@Pc(7) int local7 = arg1;
		@Pc(16) int local16 = arg7 - 64;
		@Pc(21) int local21 = arg1 - 64;
		Static559.anIntArrayArray88[64][64] = 99;
		Static597.anIntArrayArray96[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static369.anIntArray441[0] = arg7;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local35 + 1;
		Static423.anIntArray719[0] = arg1;
		@Pc(49) int[][] local49 = arg5.anIntArrayArray44;
		while (local44 != local41) {
			local5 = Static369.anIntArray441[local41];
			local7 = Static423.anIntArray719[local41];
			local41 = local41 + 1 & 0xFFF;
			@Pc(69) int local69 = local5 - local16;
			@Pc(75) int local75 = local7 - arg5.anInt5199;
			@Pc(80) int local80 = local7 - local21;
			@Pc(85) int local85 = local5 - arg5.anInt5187;
			if (arg9 == -4) {
				if (local5 == arg3 && arg4 == local7) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static299.method4661(arg6, arg8, local7, 1, local5, arg3, 1, arg4)) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg5.method4345(arg4, arg6, local7, 1, local5, arg3, arg8, 1, arg2)) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg5.method4339(local5, local7, arg2, 1, arg3, arg6, arg4, arg8)) {
					Static540.anInt9014 = local5;
					Static590.anInt9764 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg5.method4353(arg4, local7, arg9, arg0, 1, arg3, local5)) {
					Static540.anInt9014 = local5;
					Static590.anInt9764 = local7;
					return true;
				}
			} else if (arg5.method4346(1, arg4, arg0, local5, arg9, arg3, local7)) {
				Static540.anInt9014 = local5;
				Static590.anInt9764 = local7;
				return true;
			}
			@Pc(243) int local243 = Static597.anIntArrayArray96[local69][local80] + 1;
			if (local69 > 0 && Static559.anIntArrayArray88[local69 - 1][local80] == 0 && (local49[local85 - 1][local75] & 0x42240000) == 0) {
				Static369.anIntArray441[local44] = local5 - 1;
				Static423.anIntArray719[local44] = local7;
				local44 = local44 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local69 - 1][local80] = 2;
				Static597.anIntArrayArray96[local69 - 1][local80] = local243;
			}
			if (local69 < 127 && Static559.anIntArrayArray88[local69 + 1][local80] == 0 && (local49[local85 + 1][local75] & 0x60240000) == 0) {
				Static369.anIntArray441[local44] = local5 + 1;
				Static423.anIntArray719[local44] = local7;
				Static559.anIntArrayArray88[local69 + 1][local80] = 8;
				local44 = local44 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local69 + 1][local80] = local243;
			}
			if (local80 > 0 && Static559.anIntArrayArray88[local69][local80 - 1] == 0 && (local49[local85][local75 - 1] & 0x40A40000) == 0) {
				Static369.anIntArray441[local44] = local5;
				Static423.anIntArray719[local44] = local7 - 1;
				Static559.anIntArrayArray88[local69][local80 - 1] = 1;
				local44 = local44 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local69][local80 - 1] = local243;
			}
			if (local80 < 127 && Static559.anIntArrayArray88[local69][local80 + 1] == 0 && (local49[local85][local75 + 1] & 0x48240000) == 0) {
				Static369.anIntArray441[local44] = local5;
				Static423.anIntArray719[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local69][local80 + 1] = 4;
				Static597.anIntArrayArray96[local69][local80 + 1] = local243;
			}
			if (local69 > 0 && local80 > 0 && Static559.anIntArrayArray88[local69 - 1][local80 - 1] == 0 && (local49[local85 - 1][local75 - 1] & 0x43A40000) == 0 && (local49[local85 - 1][local75] & 0x42240000) == 0 && (local49[local85][local75 - 1] & 0x40A40000) == 0) {
				Static369.anIntArray441[local44] = local5 - 1;
				Static423.anIntArray719[local44] = local7 - 1;
				Static559.anIntArrayArray88[local69 - 1][local80 - 1] = 3;
				local44 = local44 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local69 - 1][local80 - 1] = local243;
			}
			if (local69 < 127 && local80 > 0 && Static559.anIntArrayArray88[local69 + 1][local80 - 1] == 0 && (local49[local85 + 1][local75 - 1] & 0x60E40000) == 0 && (local49[local85 + 1][local75] & 0x60240000) == 0 && (local49[local85][local75 - 1] & 0x40A40000) == 0) {
				Static369.anIntArray441[local44] = local5 + 1;
				Static423.anIntArray719[local44] = local7 - 1;
				Static559.anIntArrayArray88[local69 + 1][local80 - 1] = 9;
				local44 = local44 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local69 + 1][local80 - 1] = local243;
			}
			if (local69 > 0 && local80 < 127 && Static559.anIntArrayArray88[local69 - 1][local80 + 1] == 0 && (local49[local85 - 1][local75 + 1] & 0x4E240000) == 0 && (local49[local85 - 1][local75] & 0x42240000) == 0 && (local49[local85][local75 + 1] & 0x48240000) == 0) {
				Static369.anIntArray441[local44] = local5 - 1;
				Static423.anIntArray719[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local69 - 1][local80 + 1] = 6;
				Static597.anIntArrayArray96[local69 - 1][local80 + 1] = local243;
			}
			if (local69 < 127 && local80 < 127 && Static559.anIntArrayArray88[local69 + 1][local80 + 1] == 0 && (local49[local85 + 1][local75 + 1] & 0x78240000) == 0 && (local49[local85 + 1][local75] & 0x60240000) == 0 && (local49[local85][local75 + 1] & 0x48240000) == 0) {
				Static369.anIntArray441[local44] = local5 + 1;
				Static423.anIntArray719[local44] = local7 + 1;
				Static559.anIntArrayArray88[local69 + 1][local80 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local69 + 1][local80 + 1] = local243;
			}
		}
		Static590.anInt9764 = local7;
		Static540.anInt9014 = local5;
		return false;
	}
}
