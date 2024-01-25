import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_4 = new Class44(8);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!qo;IIIIIIII[II[IIZ)I")
	public static int method1172(@OriginalArg(0) int arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static336.anIntArrayArray37[local7][local11] = 0;
				Static203.anIntArrayArray25[local7][local11] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg0 == 1) {
			local55 = Static242.method3799(arg1, arg9, arg8, arg7, arg12, arg3, arg4, arg6, arg2, arg5);
		} else if (arg0 == 2) {
			local55 = Static253.method4332(arg8, arg1, arg5, arg6, arg2, arg9, arg4, arg12, arg7, arg3);
		} else {
			local55 = Static54.method1221(arg4, arg3, arg0, arg5, arg2, arg8, arg1, arg12, arg7, arg9, arg6);
		}
		@Pc(97) int local97 = arg6 - 64;
		@Pc(101) int local101 = arg5 - 64;
		@Pc(103) int local103 = Static219.anInt3951;
		@Pc(105) int local105 = Static446.anInt8003;
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(119) int local119;
		if (!local55) {
			if (!arg13) {
				return -1;
			}
			local111 = Integer.MAX_VALUE;
			local113 = Integer.MAX_VALUE;
			for (local119 = arg12 - 10; local119 <= arg12 + 10; local119++) {
				for (@Pc(125) int local125 = arg9 - 10; local125 <= arg9 + 10; local125++) {
					@Pc(131) int local131 = local119 - local97;
					@Pc(136) int local136 = local125 - local101;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static203.anIntArrayArray25[local131][local136] < 100) {
						@Pc(157) int local157 = 0;
						if (arg12 > local119) {
							local157 = arg12 - local119;
						} else if (local119 > arg12 + arg2 - 1) {
							local157 = local119 + 1 - arg2 - arg12;
						}
						@Pc(187) int local187 = 0;
						if (local125 < arg9) {
							local187 = arg9 - local125;
						} else if (arg9 + arg8 - 1 < local125) {
							local187 = local125 + 1 - arg8 - arg9;
						}
						@Pc(225) int local225 = local187 * local187 + local157 * local157;
						if (local225 < local111 || local225 == local111 && Static203.anIntArrayArray25[local131][local136] < local113) {
							local111 = local225;
							local105 = local125;
							local113 = Static203.anIntArrayArray25[local131][local136];
							local103 = local119;
						}
					}
				}
			}
			if (local111 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg6 == local103 && local105 == arg5) {
			return 0;
		}
		@Pc(283) byte local283 = 0;
		Static146.anIntArray183[0] = local103;
		local111 = local283 + 1;
		Static190.anIntArray25[0] = local105;
		@Pc(304) int local304;
		local113 = local304 = Static336.anIntArrayArray37[local103 - local97][local105 - local101];
		while (arg6 != local103 || local105 != arg5) {
			if (local304 != local113) {
				local304 = local113;
				Static146.anIntArray183[local111] = local103;
				Static190.anIntArray25[local111++] = local105;
			}
			if ((local113 & 0x2) != 0) {
				local103++;
			} else if ((local113 & 0x8) != 0) {
				local103--;
			}
			if ((local113 & 0x1) != 0) {
				local105++;
			} else if ((local113 & 0x4) != 0) {
				local105--;
			}
			local113 = Static336.anIntArrayArray37[local103 - local97][local105 - local101];
		}
		local119 = 0;
		while (local111-- > 0) {
			arg10[local119] = Static146.anIntArray183[local111];
			arg11[local119++] = Static190.anIntArray25[local111];
			if (local119 >= arg10.length) {
				break;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(B)[Lclient!tq;")
	public static Class238[] method1175() {
		return new Class238[] { Static447.aClass238_30, Static91.aClass238_10, Static68.aClass238_31, Static401.aClass238_29, Static388.aClass238_28, Static84.aClass238_9, Static116.aClass238_11, Static306.aClass238_22, Static265.aClass238_20, Static425.aClass238_25, Static292.aClass238_21, Static16.aClass238_4, Static3.aClass238_1, Static421.aClass238_32, Static172.aClass238_16 };
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)I")
	public static int method1176(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}
}
