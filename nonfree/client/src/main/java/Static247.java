import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jfa", name = "H", descriptor = "[I")
	public static final int[] anIntArray311 = new int[8];

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "(I)V")
	public static void method3875() {
		if (Static273.aClass100_5 != null) {
			Static273.aClass100_5.method6262();
			Static273.aClass100_5 = null;
			Static264.aClass29_7 = null;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!wd;IIIIIIIBI)Z")
	public static boolean method3876(@OriginalArg(0) int arg0, @OriginalArg(1) Class355 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg5 - 64;
		@Pc(22) int local22 = arg9 - 64;
		Static233.anIntArrayArray24[64][64] = 99;
		Static416.anIntArrayArray47[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static6.anIntArray26[0] = arg5;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static255.anIntArray325[0] = arg9;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray68;
		while (local50 != local47) {
			local7 = Static6.anIntArray26[local47];
			local9 = Static255.anIntArray325[local47];
			@Pc(70) int local70 = local9 - local22;
			@Pc(75) int local75 = local7 - arg1.anInt9399;
			@Pc(81) int local81 = local9 - arg1.anInt9391;
			local47 = local47 + 1 & 0xFFF;
			@Pc(92) int local92 = local7 - local18;
			if (arg7 == -4) {
				if (local7 == arg6 && arg8 == local9) {
					Static30.anInt768 = local7;
					Static245.anInt4563 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static108.method1627(local7, 1, local9, arg2, arg6, arg8, 1, arg0)) {
					Static30.anInt768 = local7;
					Static245.anInt4563 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg1.method7814(arg2, 1, arg8, arg4, arg6, arg0, local9, local7, 1)) {
					Static245.anInt4563 = local9;
					Static30.anInt768 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg1.method7804(arg2, arg6, local9, arg8, arg0, local7, arg4, 1)) {
					Static245.anInt4563 = local9;
					Static30.anInt768 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg1.method7819(local7, local9, 1, arg8, arg3, arg7, arg6)) {
					Static245.anInt4563 = local9;
					Static30.anInt768 = local7;
					return true;
				}
			} else if (arg1.method7808(1, arg7, arg8, arg3, local9, local7, arg6)) {
				Static245.anInt4563 = local9;
				Static30.anInt768 = local7;
				return true;
			}
			@Pc(247) int local247 = Static416.anIntArrayArray47[local92][local70] + 1;
			if (local92 > 0 && Static233.anIntArrayArray24[local92 - 1][local70] == 0 && (local55[local75 - 1][local81] & 0x42240000) == 0) {
				Static6.anIntArray26[local50] = local7 - 1;
				Static255.anIntArray325[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local92 - 1][local70] = 2;
				Static416.anIntArrayArray47[local92 - 1][local70] = local247;
			}
			if (local92 < 127 && Static233.anIntArrayArray24[local92 + 1][local70] == 0 && (local55[local75 + 1][local81] & 0x60240000) == 0) {
				Static6.anIntArray26[local50] = local7 + 1;
				Static255.anIntArray325[local50] = local9;
				Static233.anIntArrayArray24[local92 + 1][local70] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local92 + 1][local70] = local247;
			}
			if (local70 > 0 && Static233.anIntArrayArray24[local92][local70 - 1] == 0 && (local55[local75][local81 - 1] & 0x40A40000) == 0) {
				Static6.anIntArray26[local50] = local7;
				Static255.anIntArray325[local50] = local9 - 1;
				Static233.anIntArrayArray24[local92][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local92][local70 - 1] = local247;
			}
			if (local70 < 127 && Static233.anIntArrayArray24[local92][local70 + 1] == 0 && (local55[local75][local81 + 1] & 0x48240000) == 0) {
				Static6.anIntArray26[local50] = local7;
				Static255.anIntArray325[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local92][local70 + 1] = 4;
				Static416.anIntArrayArray47[local92][local70 + 1] = local247;
			}
			if (local92 > 0 && local70 > 0 && Static233.anIntArrayArray24[local92 - 1][local70 - 1] == 0 && (local55[local75 - 1][local81 - 1] & 0x43A40000) == 0 && (local55[local75 - 1][local81] & 0x42240000) == 0 && (local55[local75][local81 - 1] & 0x40A40000) == 0) {
				Static6.anIntArray26[local50] = local7 - 1;
				Static255.anIntArray325[local50] = local9 - 1;
				Static233.anIntArrayArray24[local92 - 1][local70 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local92 - 1][local70 - 1] = local247;
			}
			if (local92 < 127 && local70 > 0 && Static233.anIntArrayArray24[local92 + 1][local70 - 1] == 0 && (local55[local75 + 1][local81 - 1] & 0x60E40000) == 0 && (local55[local75 + 1][local81] & 0x60240000) == 0 && (local55[local75][local81 - 1] & 0x40A40000) == 0) {
				Static6.anIntArray26[local50] = local7 + 1;
				Static255.anIntArray325[local50] = local9 - 1;
				Static233.anIntArrayArray24[local92 + 1][local70 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local92 + 1][local70 - 1] = local247;
			}
			if (local92 > 0 && local70 < 127 && Static233.anIntArrayArray24[local92 - 1][local70 + 1] == 0 && (local55[local75 - 1][local81 + 1] & 0x4E240000) == 0 && (local55[local75 - 1][local81] & 0x42240000) == 0 && (local55[local75][local81 + 1] & 0x48240000) == 0) {
				Static6.anIntArray26[local50] = local7 - 1;
				Static255.anIntArray325[local50] = local9 + 1;
				Static233.anIntArrayArray24[local92 - 1][local70 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local92 - 1][local70 + 1] = local247;
			}
			if (local92 < 127 && local70 < 127 && Static233.anIntArrayArray24[local92 + 1][local70 + 1] == 0 && (local55[local75 + 1][local81 + 1] & 0x78240000) == 0 && (local55[local75 + 1][local81] & 0x60240000) == 0 && (local55[local75][local81 + 1] & 0x48240000) == 0) {
				Static6.anIntArray26[local50] = local7 + 1;
				Static255.anIntArray325[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local92 + 1][local70 + 1] = 12;
				Static416.anIntArrayArray47[local92 + 1][local70 + 1] = local247;
			}
		}
		Static245.anInt4563 = local9;
		Static30.anInt768 = local7;
		return false;
	}
}
