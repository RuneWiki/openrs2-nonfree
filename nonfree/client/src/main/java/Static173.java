import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	public static int anInt3514;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public static int anInt3515 = -1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIII)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 4);
		local8.method7133();
		local8.anInt8738 = arg2;
		local8.anInt8736 = arg1;
		local8.anInt8739 = arg3;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIIIIILclient!ga;)Z")
	public static boolean method3153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class111 arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg2 - 64;
		Static398.anIntArrayArray43[64][64] = 99;
		Static404.anIntArrayArray45[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static242.anIntArray221[0] = arg6;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static478.anIntArray477[0] = arg2;
		@Pc(51) int[][] local51 = arg9.anIntArrayArray20;
		while (local46 != local43) {
			local7 = Static242.anIntArray221[local43];
			local9 = Static478.anIntArray477[local43];
			@Pc(65) int local65 = local7 - local18;
			@Pc(71) int local71 = local9 - arg9.anInt3177;
			local43 = local43 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local23;
			@Pc(88) int local88 = local7 - arg9.anInt3180;
			if (arg8 == -4) {
				if (arg0 == local7 && arg7 == local9) {
					Static145.anInt3095 = local7;
					Static61.anInt985 = local9;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static415.method6524(arg5, 1, arg1, 1, local9, arg0, local7, arg7)) {
					Static61.anInt985 = local9;
					Static145.anInt3095 = local7;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg9.method2859(1, arg7, arg5, arg0, 1, local9, local7, arg3, arg1)) {
					Static61.anInt985 = local9;
					Static145.anInt3095 = local7;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg9.method2852(local9, arg3, 1, arg0, arg7, local7, arg1, arg5)) {
					Static145.anInt3095 = local7;
					Static61.anInt985 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg9.method2849(1, arg7, local7, arg0, arg4, arg8, local9)) {
					Static61.anInt985 = local9;
					Static145.anInt3095 = local7;
					return true;
				}
			} else if (arg9.method2856(arg8, arg0, arg7, arg4, local7, 1, local9)) {
				Static61.anInt985 = local9;
				Static145.anInt3095 = local7;
				return true;
			}
			@Pc(235) int local235 = Static404.anIntArrayArray45[local65][local82] + 1;
			if (local65 > 0 && Static398.anIntArrayArray43[local65 - 1][local82] == 0 && (local51[local88 - 1][local71] & 0x42240000) == 0) {
				Static242.anIntArray221[local46] = local7 - 1;
				Static478.anIntArray477[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local65 - 1][local82] = 2;
				Static404.anIntArrayArray45[local65 - 1][local82] = local235;
			}
			if (local65 < 127 && Static398.anIntArrayArray43[local65 + 1][local82] == 0 && (local51[local88 + 1][local71] & 0x60240000) == 0) {
				Static242.anIntArray221[local46] = local7 + 1;
				Static478.anIntArray477[local46] = local9;
				Static398.anIntArrayArray43[local65 + 1][local82] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static404.anIntArrayArray45[local65 + 1][local82] = local235;
			}
			if (local82 > 0 && Static398.anIntArrayArray43[local65][local82 - 1] == 0 && (local51[local88][local71 - 1] & 0x40A40000) == 0) {
				Static242.anIntArray221[local46] = local7;
				Static478.anIntArray477[local46] = local9 - 1;
				Static398.anIntArrayArray43[local65][local82 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static404.anIntArrayArray45[local65][local82 - 1] = local235;
			}
			if (local82 < 127 && Static398.anIntArrayArray43[local65][local82 + 1] == 0 && (local51[local88][local71 + 1] & 0x48240000) == 0) {
				Static242.anIntArray221[local46] = local7;
				Static478.anIntArray477[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local65][local82 + 1] = 4;
				Static404.anIntArrayArray45[local65][local82 + 1] = local235;
			}
			if (local65 > 0 && local82 > 0 && Static398.anIntArrayArray43[local65 - 1][local82 - 1] == 0 && (local51[local88 - 1][local71 - 1] & 0x43A40000) == 0 && (local51[local88 - 1][local71] & 0x42240000) == 0 && (local51[local88][local71 - 1] & 0x40A40000) == 0) {
				Static242.anIntArray221[local46] = local7 - 1;
				Static478.anIntArray477[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local65 - 1][local82 - 1] = 3;
				Static404.anIntArrayArray45[local65 - 1][local82 - 1] = local235;
			}
			if (local65 < 127 && local82 > 0 && Static398.anIntArrayArray43[local65 + 1][local82 - 1] == 0 && (local51[local88 + 1][local71 - 1] & 0x60E40000) == 0 && (local51[local88 + 1][local71] & 0x60240000) == 0 && (local51[local88][local71 - 1] & 0x40A40000) == 0) {
				Static242.anIntArray221[local46] = local7 + 1;
				Static478.anIntArray477[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local65 + 1][local82 - 1] = 9;
				Static404.anIntArrayArray45[local65 + 1][local82 - 1] = local235;
			}
			if (local65 > 0 && local82 < 127 && Static398.anIntArrayArray43[local65 - 1][local82 + 1] == 0 && (local51[local88 - 1][local71 + 1] & 0x4E240000) == 0 && (local51[local88 - 1][local71] & 0x42240000) == 0 && (local51[local88][local71 + 1] & 0x48240000) == 0) {
				Static242.anIntArray221[local46] = local7 - 1;
				Static478.anIntArray477[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local65 - 1][local82 + 1] = 6;
				Static404.anIntArrayArray45[local65 - 1][local82 + 1] = local235;
			}
			if (local65 < 127 && local82 < 127 && Static398.anIntArrayArray43[local65 + 1][local82 + 1] == 0 && (local51[local88 + 1][local71 + 1] & 0x78240000) == 0 && (local51[local88 + 1][local71] & 0x60240000) == 0 && (local51[local88][local71 + 1] & 0x48240000) == 0) {
				Static242.anIntArray221[local46] = local7 + 1;
				Static478.anIntArray477[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local65 + 1][local82 + 1] = 12;
				Static404.anIntArrayArray45[local65 + 1][local82 + 1] = local235;
			}
		}
		Static145.anInt3095 = local7;
		Static61.anInt985 = local9;
		return false;
	}
}
