import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
	public static int anInt8953 = 0;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
	public static int anInt8955 = 16777215;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_379 = new Class296(9, 3);

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "[I")
	public static final int[] anIntArray828 = new int[25];

	@OriginalMember(owner = "client!wda", name = "F", descriptor = "[S")
	public static final short[] aShortArray154 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
	public static void method7369() {
		if (Static160.method2489(Static268.anInt5100) || Static82.method3792(Static268.anInt5100)) {
			Static539.method7501(Static516.anInt8682 >> 12, Static522.anInt8770 >> 12, 5000);
		} else {
			@Pc(20) int local20 = Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0] >> 3;
			@Pc(27) int local27 = Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] >> 3;
			if (local20 >= 0 && Static459.anInt7799 >> 3 > local20 && local27 >= 0 && local27 < Static482.anInt7990 >> 3) {
				Static539.method7501(local27, local20, 5000);
			} else {
				Static539.method7501(Static482.anInt7990 >> 4, Static459.anInt7799 >> 4, 0);
			}
		}
		Static463.method6530();
		Static503.method6961();
		Static358.method7327();
		Static409.method6078();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIIIILclient!fd;I)Z")
	public static boolean method7370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class91 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg9 - 64;
		Static160.anIntArrayArray35[64][64] = 99;
		@Pc(28) int local28 = arg6 - 64;
		Static186.anIntArrayArray38[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static398.anIntArray690[0] = arg9;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static368.anIntArray663[0] = arg6;
		@Pc(55) int[][] local55 = arg8.anIntArrayArray30;
		while (local50 != local47) {
			local9 = Static368.anIntArray663[local47];
			local7 = Static398.anIntArray690[local47];
			@Pc(69) int local69 = local7 - local18;
			@Pc(74) int local74 = local9 - local28;
			local47 = local47 + 1 & 0xFFF;
			@Pc(86) int local86 = local7 - arg8.anInt2571;
			@Pc(92) int local92 = local9 - arg8.anInt2587;
			if (arg1 == -4) {
				if (local7 == arg2 && arg4 == local9) {
					Static316.anInt5813 = local7;
					Static296.anInt4450 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static205.method3534(2, local9, 2, arg4, arg2, arg7, arg3, local7)) {
					Static296.anInt4450 = local9;
					Static316.anInt5813 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg8.method2181(local9, arg2, arg3, arg7, 2, 2, arg4, arg5, local7)) {
					Static296.anInt4450 = local9;
					Static316.anInt5813 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg8.method2179(arg7, arg5, local7, arg4, arg3, local9, arg2, 2)) {
					Static296.anInt4450 = local9;
					Static316.anInt5813 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg8.method2170(2, arg0, local7, local9, arg2, arg1, arg4)) {
					Static296.anInt4450 = local9;
					Static316.anInt5813 = local7;
					return true;
				}
			} else if (arg8.method2167(arg0, local9, local7, 2, arg1, arg2, arg4)) {
				Static316.anInt5813 = local7;
				Static296.anInt4450 = local9;
				return true;
			}
			@Pc(244) int local244 = Static186.anIntArrayArray38[local69][local74] + 1;
			if (local69 > 0 && Static160.anIntArrayArray35[local69 - 1][local74] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static398.anIntArray690[local50] = local7 - 1;
				Static368.anIntArray663[local50] = local9;
				Static160.anIntArrayArray35[local69 - 1][local74] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local69 - 1][local74] = local244;
			}
			if (local69 < 126 && Static160.anIntArrayArray35[local69 + 1][local74] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static398.anIntArray690[local50] = local7 + 1;
				Static368.anIntArray663[local50] = local9;
				Static160.anIntArrayArray35[local69 + 1][local74] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local69 + 1][local74] = local244;
			}
			if (local74 > 0 && Static160.anIntArrayArray35[local69][local74 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static398.anIntArray690[local50] = local7;
				Static368.anIntArray663[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local69][local74 - 1] = 1;
				Static186.anIntArrayArray38[local69][local74 - 1] = local244;
			}
			if (local74 < 126 && Static160.anIntArrayArray35[local69][local74 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static398.anIntArray690[local50] = local7;
				Static368.anIntArray663[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local69][local74 + 1] = 4;
				Static186.anIntArrayArray38[local69][local74 + 1] = local244;
			}
			if (local69 > 0 && local74 > 0 && Static160.anIntArrayArray35[local69 - 1][local74 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static398.anIntArray690[local50] = local7 - 1;
				Static368.anIntArray663[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static160.anIntArrayArray35[local69 - 1][local74 - 1] = 3;
				Static186.anIntArrayArray38[local69 - 1][local74 - 1] = local244;
			}
			if (local69 < 126 && local74 > 0 && Static160.anIntArrayArray35[local69 + 1][local74 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static398.anIntArray690[local50] = local7 + 1;
				Static368.anIntArray663[local50] = local9 - 1;
				Static160.anIntArrayArray35[local69 + 1][local74 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local69 + 1][local74 - 1] = local244;
			}
			if (local69 > 0 && local74 < 126 && Static160.anIntArrayArray35[local69 - 1][local74 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static398.anIntArray690[local50] = local7 - 1;
				Static368.anIntArray663[local50] = local9 + 1;
				Static160.anIntArrayArray35[local69 - 1][local74 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local69 - 1][local74 + 1] = local244;
			}
			if (local69 < 126 && local74 < 126 && Static160.anIntArrayArray35[local69 + 1][local74 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static398.anIntArray690[local50] = local7 + 1;
				Static368.anIntArray663[local50] = local9 + 1;
				Static160.anIntArrayArray35[local69 + 1][local74 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static186.anIntArrayArray38[local69 + 1][local74 + 1] = local244;
			}
		}
		Static316.anInt5813 = local7;
		Static296.anInt4450 = local9;
		return false;
	}
}
