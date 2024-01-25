import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_87 = new Class158(71, 2);

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "[Lclient!eda;")
	public static Class70[] aClass70Array1 = new Class70[50];

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
	public static int anInt6740 = -1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBIIIIILclient!vi;III)Z")
	public static boolean method5634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class306 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg2;
		@Pc(22) int local22 = arg7 - 64;
		@Pc(27) int local27 = arg2 - 64;
		Static474.anIntArrayArray80[64][64] = 99;
		Static290.anIntArrayArray56[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static135.anIntArray273[0] = arg7;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static142.anIntArray282[0] = arg2;
		@Pc(55) int[][] local55 = arg6.anIntArrayArray85;
		while (local50 != local47) {
			local7 = Static135.anIntArray273[local47];
			local9 = Static142.anIntArray282[local47];
			local47 = local47 + 1 & 0xFFF;
			@Pc(76) int local76 = local9 - local27;
			@Pc(82) int local82 = local9 - arg6.anInt8969;
			@Pc(88) int local88 = local7 - arg6.anInt8975;
			@Pc(93) int local93 = local7 - local22;
			if (arg3 == -4) {
				if (local7 == arg0 && arg1 == local9) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static467.method6978(arg0, 1, local9, arg8, arg1, local7, arg4, 1)) {
					Static335.anInt3038 = local7;
					Static23.anInt6895 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg6.method7355(local7, 1, arg4, arg9, arg1, arg0, local9, arg8, 1)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg6.method7356(arg8, local9, arg4, arg1, arg0, local7, arg9, 1)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg6.method7369(arg3, arg5, arg0, arg1, local9, local7, 1)) {
					Static23.anInt6895 = local9;
					Static335.anInt3038 = local7;
					return true;
				}
			} else if (arg6.method7368(arg0, local9, local7, arg3, 1, arg1, arg5)) {
				Static335.anInt3038 = local7;
				Static23.anInt6895 = local9;
				return true;
			}
			@Pc(253) int local253 = Static290.anIntArrayArray56[local93][local76] + 1;
			if (local93 > 0 && Static474.anIntArrayArray80[local93 - 1][local76] == 0 && (local55[local88 - 1][local82] & 0x42240000) == 0) {
				Static135.anIntArray273[local50] = local7 - 1;
				Static142.anIntArray282[local50] = local9;
				Static474.anIntArrayArray80[local93 - 1][local76] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local93 - 1][local76] = local253;
			}
			if (local93 < 127 && Static474.anIntArrayArray80[local93 + 1][local76] == 0 && (local55[local88 + 1][local82] & 0x60240000) == 0) {
				Static135.anIntArray273[local50] = local7 + 1;
				Static142.anIntArray282[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local93 + 1][local76] = 8;
				Static290.anIntArrayArray56[local93 + 1][local76] = local253;
			}
			if (local76 > 0 && Static474.anIntArrayArray80[local93][local76 - 1] == 0 && (local55[local88][local82 - 1] & 0x40A40000) == 0) {
				Static135.anIntArray273[local50] = local7;
				Static142.anIntArray282[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local93][local76 - 1] = 1;
				Static290.anIntArrayArray56[local93][local76 - 1] = local253;
			}
			if (local76 < 127 && Static474.anIntArrayArray80[local93][local76 + 1] == 0 && (local55[local88][local82 + 1] & 0x48240000) == 0) {
				Static135.anIntArray273[local50] = local7;
				Static142.anIntArray282[local50] = local9 + 1;
				Static474.anIntArrayArray80[local93][local76 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local93][local76 + 1] = local253;
			}
			if (local93 > 0 && local76 > 0 && Static474.anIntArrayArray80[local93 - 1][local76 - 1] == 0 && (local55[local88 - 1][local82 - 1] & 0x43A40000) == 0 && (local55[local88 - 1][local82] & 0x42240000) == 0 && (local55[local88][local82 - 1] & 0x40A40000) == 0) {
				Static135.anIntArray273[local50] = local7 - 1;
				Static142.anIntArray282[local50] = local9 - 1;
				Static474.anIntArrayArray80[local93 - 1][local76 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local93 - 1][local76 - 1] = local253;
			}
			if (local93 < 127 && local76 > 0 && Static474.anIntArrayArray80[local93 + 1][local76 - 1] == 0 && (local55[local88 + 1][local82 - 1] & 0x60E40000) == 0 && (local55[local88 + 1][local82] & 0x60240000) == 0 && (local55[local88][local82 - 1] & 0x40A40000) == 0) {
				Static135.anIntArray273[local50] = local7 + 1;
				Static142.anIntArray282[local50] = local9 - 1;
				Static474.anIntArrayArray80[local93 + 1][local76 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local93 + 1][local76 - 1] = local253;
			}
			if (local93 > 0 && local76 < 127 && Static474.anIntArrayArray80[local93 - 1][local76 + 1] == 0 && (local55[local88 - 1][local82 + 1] & 0x4E240000) == 0 && (local55[local88 - 1][local82] & 0x42240000) == 0 && (local55[local88][local82 + 1] & 0x48240000) == 0) {
				Static135.anIntArray273[local50] = local7 - 1;
				Static142.anIntArray282[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static474.anIntArrayArray80[local93 - 1][local76 + 1] = 6;
				Static290.anIntArrayArray56[local93 - 1][local76 + 1] = local253;
			}
			if (local93 < 127 && local76 < 127 && Static474.anIntArrayArray80[local93 + 1][local76 + 1] == 0 && (local55[local88 + 1][local82 + 1] & 0x78240000) == 0 && (local55[local88 + 1][local82] & 0x60240000) == 0 && (local55[local88][local82 + 1] & 0x48240000) == 0) {
				Static135.anIntArray273[local50] = local7 + 1;
				Static142.anIntArray282[local50] = local9 + 1;
				Static474.anIntArrayArray80[local93 + 1][local76 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static290.anIntArrayArray56[local93 + 1][local76 + 1] = local253;
			}
		}
		Static335.anInt3038 = local7;
		Static23.anInt6895 = local9;
		return false;
	}
}
