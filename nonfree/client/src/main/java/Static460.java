import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "[I")
	public static final int[] anIntArray527 = new int[1000];

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_108 = new Class218(107, 17);

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!nl;Z)V")
	public static void method6909(@OriginalArg(1) Class3_Sub7_Sub5 arg0) {
		Static189.aClass122_1.method6808(arg0);
		Static647.method8667(Static189.aClass122_1, Static462.aClass181_92, arg0, Static349.aClass181_64, Static35.aClass181_3);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IBIIIIIIIILclient!rl;)Z")
	public static boolean method6913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class291 arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg5 - 64;
		@Pc(23) int local23 = arg6 - 64;
		Static97.anIntArrayArray23[64][64] = 99;
		Static634.anIntArrayArray103[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static478.anIntArray606[0] = arg5;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static273.anIntArray338[0] = arg6;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray89;
		while (local48 != local51) {
			local9 = Static273.anIntArray338[local48];
			local7 = Static478.anIntArray606[local48];
			@Pc(72) int local72 = local7 - arg9.anInt8721;
			local48 = local48 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - local18;
			@Pc(88) int local88 = local9 - local23;
			@Pc(94) int local94 = local9 - arg9.anInt8715;
			if (arg3 == -4) {
				if (local7 == arg1 && arg2 == local9) {
					Static390.anInt7402 = local7;
					Static243.anInt5476 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static192.method3820(arg0, local7, arg8, 1, arg1, arg2, 1, local9)) {
					Static390.anInt7402 = local7;
					Static243.anInt5476 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg9.method7199(1, arg8, arg2, local9, arg0, 1, arg7, arg1, local7)) {
					Static243.anInt5476 = local9;
					Static390.anInt7402 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg9.method7204(arg1, local7, arg0, arg7, arg2, 1, arg8, local9)) {
					Static243.anInt5476 = local9;
					Static390.anInt7402 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg9.method7210(local9, 1, arg1, arg3, arg4, local7, arg2)) {
					Static390.anInt7402 = local7;
					Static243.anInt5476 = local9;
					return true;
				}
			} else if (arg9.method7203(local9, arg1, arg3, 1, arg4, arg2, local7)) {
				Static390.anInt7402 = local7;
				Static243.anInt5476 = local9;
				return true;
			}
			@Pc(236) int local236 = Static634.anIntArrayArray103[local83][local88] + 1;
			if (local83 > 0 && Static97.anIntArrayArray23[local83 - 1][local88] == 0 && (local56[local72 - 1][local94] & 0x42240000) == 0) {
				Static478.anIntArray606[local51] = local7 - 1;
				Static273.anIntArray338[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local83 - 1][local88] = 2;
				Static634.anIntArrayArray103[local83 - 1][local88] = local236;
			}
			if (local83 < 127 && Static97.anIntArrayArray23[local83 + 1][local88] == 0 && (local56[local72 + 1][local94] & 0x60240000) == 0) {
				Static478.anIntArray606[local51] = local7 + 1;
				Static273.anIntArray338[local51] = local9;
				Static97.anIntArrayArray23[local83 + 1][local88] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local83 + 1][local88] = local236;
			}
			if (local88 > 0 && Static97.anIntArrayArray23[local83][local88 - 1] == 0 && (local56[local72][local94 - 1] & 0x40A40000) == 0) {
				Static478.anIntArray606[local51] = local7;
				Static273.anIntArray338[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local83][local88 - 1] = 1;
				Static634.anIntArrayArray103[local83][local88 - 1] = local236;
			}
			if (local88 < 127 && Static97.anIntArrayArray23[local83][local88 + 1] == 0 && (local56[local72][local94 + 1] & 0x48240000) == 0) {
				Static478.anIntArray606[local51] = local7;
				Static273.anIntArray338[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local83][local88 + 1] = 4;
				Static634.anIntArrayArray103[local83][local88 + 1] = local236;
			}
			if (local83 > 0 && local88 > 0 && Static97.anIntArrayArray23[local83 - 1][local88 - 1] == 0 && (local56[local72 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local72 - 1][local94] & 0x42240000) == 0 && (local56[local72][local94 - 1] & 0x40A40000) == 0) {
				Static478.anIntArray606[local51] = local7 - 1;
				Static273.anIntArray338[local51] = local9 - 1;
				Static97.anIntArrayArray23[local83 - 1][local88 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local83 - 1][local88 - 1] = local236;
			}
			if (local83 < 127 && local88 > 0 && Static97.anIntArrayArray23[local83 + 1][local88 - 1] == 0 && (local56[local72 + 1][local94 - 1] & 0x60E40000) == 0 && (local56[local72 + 1][local94] & 0x60240000) == 0 && (local56[local72][local94 - 1] & 0x40A40000) == 0) {
				Static478.anIntArray606[local51] = local7 + 1;
				Static273.anIntArray338[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local83 + 1][local88 - 1] = 9;
				Static634.anIntArrayArray103[local83 + 1][local88 - 1] = local236;
			}
			if (local83 > 0 && local88 < 127 && Static97.anIntArrayArray23[local83 - 1][local88 + 1] == 0 && (local56[local72 - 1][local94 + 1] & 0x4E240000) == 0 && (local56[local72 - 1][local94] & 0x42240000) == 0 && (local56[local72][local94 + 1] & 0x48240000) == 0) {
				Static478.anIntArray606[local51] = local7 - 1;
				Static273.anIntArray338[local51] = local9 + 1;
				Static97.anIntArrayArray23[local83 - 1][local88 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static634.anIntArrayArray103[local83 - 1][local88 + 1] = local236;
			}
			if (local83 < 127 && local88 < 127 && Static97.anIntArrayArray23[local83 + 1][local88 + 1] == 0 && (local56[local72 + 1][local94 + 1] & 0x78240000) == 0 && (local56[local72 + 1][local94] & 0x60240000) == 0 && (local56[local72][local94 + 1] & 0x48240000) == 0) {
				Static478.anIntArray606[local51] = local7 + 1;
				Static273.anIntArray338[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static97.anIntArrayArray23[local83 + 1][local88 + 1] = 12;
				Static634.anIntArrayArray103[local83 + 1][local88 + 1] = local236;
			}
		}
		Static390.anInt7402 = local7;
		Static243.anInt5476 = local9;
		return false;
	}
}
