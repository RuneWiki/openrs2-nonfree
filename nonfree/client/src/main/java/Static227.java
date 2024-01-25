import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)V")
	public static void method3715(@OriginalArg(1) int arg0) {
		Static323.anInt6283 = arg0;
		@Pc(7) Class223 local7 = Static9.aClass223_2;
		synchronized (Static9.aClass223_2) {
			Static9.aClass223_2.method5398();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIIILclient!ga;BI)Z")
	public static boolean method3716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class111 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg4 - 64;
		Static398.anIntArrayArray43[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static404.anIntArrayArray45[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static242.anIntArray221[0] = arg4;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static478.anIntArray477[0] = arg0;
		@Pc(51) int[][] local51 = arg8.anIntArrayArray20;
		while (local46 != local43) {
			local7 = Static242.anIntArray221[local43];
			local9 = Static478.anIntArray477[local43];
			@Pc(69) int local69 = local9 - local29;
			local43 = local43 + 1 & 0xFFF;
			@Pc(80) int local80 = local7 - local18;
			@Pc(86) int local86 = local7 - arg8.anInt3180;
			@Pc(92) int local92 = local9 - arg8.anInt3177;
			if (arg1 == -4) {
				if (local7 == arg3 && arg2 == local9) {
					Static61.anInt985 = local9;
					Static145.anInt3095 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static415.method6524(arg7, 2, arg9, 2, local9, arg3, local7, arg2)) {
					Static145.anInt3095 = local7;
					Static61.anInt985 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg8.method2859(2, arg2, arg7, arg3, 2, local9, local7, arg6, arg9)) {
					Static145.anInt3095 = local7;
					Static61.anInt985 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg8.method2852(local9, arg6, 2, arg3, arg2, local7, arg9, arg7)) {
					Static61.anInt985 = local9;
					Static145.anInt3095 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg8.method2849(2, arg2, local7, arg3, arg5, arg1, local9)) {
					Static61.anInt985 = local9;
					Static145.anInt3095 = local7;
					return true;
				}
			} else if (arg8.method2856(arg1, arg3, arg2, arg5, local7, 2, local9)) {
				Static145.anInt3095 = local7;
				Static61.anInt985 = local9;
				return true;
			}
			@Pc(248) int local248 = Static404.anIntArrayArray45[local80][local69] + 1;
			if (local80 > 0 && Static398.anIntArrayArray43[local80 - 1][local69] == 0 && (local51[local86 - 1][local92] & 0x43A40000) == 0 && (local51[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static242.anIntArray221[local46] = local7 - 1;
				Static478.anIntArray477[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local80 - 1][local69] = 2;
				Static404.anIntArrayArray45[local80 - 1][local69] = local248;
			}
			if (local80 < 126 && Static398.anIntArrayArray43[local80 + 1][local69] == 0 && (local51[local86 + 2][local92] & 0x60E40000) == 0 && (local51[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static242.anIntArray221[local46] = local7 + 1;
				Static478.anIntArray477[local46] = local9;
				Static398.anIntArrayArray43[local80 + 1][local69] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static404.anIntArrayArray45[local80 + 1][local69] = local248;
			}
			if (local69 > 0 && Static398.anIntArrayArray43[local80][local69 - 1] == 0 && (local51[local86][local92 - 1] & 0x43A40000) == 0 && (local51[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static242.anIntArray221[local46] = local7;
				Static478.anIntArray477[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local80][local69 - 1] = 1;
				Static404.anIntArrayArray45[local80][local69 - 1] = local248;
			}
			if (local69 < 126 && Static398.anIntArrayArray43[local80][local69 + 1] == 0 && (local51[local86][local92 + 2] & 0x4E240000) == 0 && (local51[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static242.anIntArray221[local46] = local7;
				Static478.anIntArray477[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local80][local69 + 1] = 4;
				Static404.anIntArrayArray45[local80][local69 + 1] = local248;
			}
			if (local80 > 0 && local69 > 0 && Static398.anIntArrayArray43[local80 - 1][local69 - 1] == 0 && (local51[local86 - 1][local92] & 0x4FA40000) == 0 && (local51[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local51[local86][local92 - 1] & 0x63E40000) == 0) {
				Static242.anIntArray221[local46] = local7 - 1;
				Static478.anIntArray477[local46] = local9 - 1;
				Static398.anIntArrayArray43[local80 - 1][local69 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static404.anIntArrayArray45[local80 - 1][local69 - 1] = local248;
			}
			if (local80 < 126 && local69 > 0 && Static398.anIntArrayArray43[local80 + 1][local69 - 1] == 0 && (local51[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local51[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local51[local86 + 2][local92] & 0x78E40000) == 0) {
				Static242.anIntArray221[local46] = local7 + 1;
				Static478.anIntArray477[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local80 + 1][local69 - 1] = 9;
				Static404.anIntArrayArray45[local80 + 1][local69 - 1] = local248;
			}
			if (local80 > 0 && local69 < 126 && Static398.anIntArrayArray43[local80 - 1][local69 + 1] == 0 && (local51[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local51[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local51[local86][local92 + 2] & 0x7E240000) == 0) {
				Static242.anIntArray221[local46] = local7 - 1;
				Static478.anIntArray477[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static398.anIntArrayArray43[local80 - 1][local69 + 1] = 6;
				Static404.anIntArrayArray45[local80 - 1][local69 + 1] = local248;
			}
			if (local80 < 126 && local69 < 126 && Static398.anIntArrayArray43[local80 + 1][local69 + 1] == 0 && (local51[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local51[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local51[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static242.anIntArray221[local46] = local7 + 1;
				Static478.anIntArray477[local46] = local9 + 1;
				Static398.anIntArrayArray43[local80 + 1][local69 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static404.anIntArrayArray45[local80 + 1][local69 + 1] = local248;
			}
		}
		Static61.anInt985 = local9;
		Static145.anInt3095 = local7;
		return false;
	}
}
