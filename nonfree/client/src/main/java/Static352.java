import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
	public static final int[] anIntArray443 = new int[4];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIIILclient!uh;)Z")
	public static boolean method4973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class240 arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(27) int local27 = arg1 - 64;
		Static73.anIntArrayArray6[64][64] = 99;
		Static93.anIntArrayArray9[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static37.anIntArray34[0] = arg6;
		@Pc(50) int local50 = local41 + 1;
		Static168.anIntArray365[0] = arg1;
		@Pc(55) int[][] local55 = arg9.anIntArrayArray60;
		while (local50 != local43) {
			local7 = Static37.anIntArray34[local43];
			local9 = Static168.anIntArray365[local43];
			@Pc(71) int local71 = local7 - arg9.anInt6848;
			@Pc(77) int local77 = local9 - arg9.anInt6844;
			@Pc(81) int local81 = local9 - local27;
			local43 = local43 + 1 & 0xFFF;
			@Pc(92) int local92 = local7 - local18;
			if (arg0 == -4) {
				if (local7 == arg8 && local9 == arg5) {
					Static116.anInt1976 = local9;
					Static134.anInt2388 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static246.method3174(local7, 1, arg8, arg5, local9, arg4, arg3, 1)) {
					Static116.anInt1976 = local9;
					Static134.anInt2388 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg9.method5418(local9, 1, arg3, arg8, 1, local7, arg5, arg7, arg4)) {
					Static116.anInt1976 = local9;
					Static134.anInt2388 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg9.method5421(arg7, local9, 1, arg3, arg4, arg5, arg8, local7)) {
					Static134.anInt2388 = local7;
					Static116.anInt1976 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg9.method5420(local7, arg0, local9, arg2, 1, arg5, arg8)) {
					Static134.anInt2388 = local7;
					Static116.anInt1976 = local9;
					return true;
				}
			} else if (arg9.method5410(arg0, local9, arg5, arg2, arg8, 1, local7)) {
				Static116.anInt1976 = local9;
				Static134.anInt2388 = local7;
				return true;
			}
			@Pc(238) int local238 = Static93.anIntArrayArray9[local92][local81] + 1;
			if (local92 > 0 && Static73.anIntArrayArray6[local92 - 1][local81] == 0 && (local55[local71 - 1][local77] & 0x42240000) == 0) {
				Static37.anIntArray34[local50] = local7 - 1;
				Static168.anIntArray365[local50] = local9;
				Static73.anIntArrayArray6[local92 - 1][local81] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local92 - 1][local81] = local238;
			}
			if (local92 < 127 && Static73.anIntArrayArray6[local92 + 1][local81] == 0 && (local55[local71 + 1][local77] & 0x60240000) == 0) {
				Static37.anIntArray34[local50] = local7 + 1;
				Static168.anIntArray365[local50] = local9;
				Static73.anIntArrayArray6[local92 + 1][local81] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local92 + 1][local81] = local238;
			}
			if (local81 > 0 && Static73.anIntArrayArray6[local92][local81 - 1] == 0 && (local55[local71][local77 - 1] & 0x40A40000) == 0) {
				Static37.anIntArray34[local50] = local7;
				Static168.anIntArray365[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local92][local81 - 1] = 1;
				Static93.anIntArrayArray9[local92][local81 - 1] = local238;
			}
			if (local81 < 127 && Static73.anIntArrayArray6[local92][local81 + 1] == 0 && (local55[local71][local77 + 1] & 0x48240000) == 0) {
				Static37.anIntArray34[local50] = local7;
				Static168.anIntArray365[local50] = local9 + 1;
				Static73.anIntArrayArray6[local92][local81 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local92][local81 + 1] = local238;
			}
			if (local92 > 0 && local81 > 0 && Static73.anIntArrayArray6[local92 - 1][local81 - 1] == 0 && (local55[local71 - 1][local77 - 1] & 0x43A40000) == 0 && (local55[local71 - 1][local77] & 0x42240000) == 0 && (local55[local71][local77 - 1] & 0x40A40000) == 0) {
				Static37.anIntArray34[local50] = local7 - 1;
				Static168.anIntArray365[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local92 - 1][local81 - 1] = 3;
				Static93.anIntArrayArray9[local92 - 1][local81 - 1] = local238;
			}
			if (local92 < 127 && local81 > 0 && Static73.anIntArrayArray6[local92 + 1][local81 - 1] == 0 && (local55[local71 + 1][local77 - 1] & 0x60E40000) == 0 && (local55[local71 + 1][local77] & 0x60240000) == 0 && (local55[local71][local77 - 1] & 0x40A40000) == 0) {
				Static37.anIntArray34[local50] = local7 + 1;
				Static168.anIntArray365[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local92 + 1][local81 - 1] = 9;
				Static93.anIntArrayArray9[local92 + 1][local81 - 1] = local238;
			}
			if (local92 > 0 && local81 < 127 && Static73.anIntArrayArray6[local92 - 1][local81 + 1] == 0 && (local55[local71 - 1][local77 + 1] & 0x4E240000) == 0 && (local55[local71 - 1][local77] & 0x42240000) == 0 && (local55[local71][local77 + 1] & 0x48240000) == 0) {
				Static37.anIntArray34[local50] = local7 - 1;
				Static168.anIntArray365[local50] = local9 + 1;
				Static73.anIntArrayArray6[local92 - 1][local81 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static93.anIntArrayArray9[local92 - 1][local81 + 1] = local238;
			}
			if (local92 < 127 && local81 < 127 && Static73.anIntArrayArray6[local92 + 1][local81 + 1] == 0 && (local55[local71 + 1][local77 + 1] & 0x78240000) == 0 && (local55[local71 + 1][local77] & 0x60240000) == 0 && (local55[local71][local77 + 1] & 0x48240000) == 0) {
				Static37.anIntArray34[local50] = local7 + 1;
				Static168.anIntArray365[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static73.anIntArrayArray6[local92 + 1][local81 + 1] = 12;
				Static93.anIntArrayArray9[local92 + 1][local81 + 1] = local238;
			}
		}
		Static116.anInt1976 = local9;
		Static134.anInt2388 = local7;
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method4976() {
		if (Static424.aClass200_10 != null) {
			Static424.aClass200_10.method5827();
			Static424.aClass200_10 = null;
			Static207.aClass23_3 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
	public static void method4983() {
		try {
			if (Static223.anInt3720 == 1) {
				@Pc(10) int local10 = Static210.aClass5_Sub22_Sub1_1.method2759();
				if (local10 > 0 && Static210.aClass5_Sub22_Sub1_1.method2739()) {
					local10 -= Static340.anInt5517;
					if (local10 < 0) {
						local10 = 0;
					}
					Static210.aClass5_Sub22_Sub1_1.method2762(local10);
					return;
				}
				Static210.aClass5_Sub22_Sub1_1.method2747();
				Static210.aClass5_Sub22_Sub1_1.method2729();
				if (Static199.aClass243_113 == null) {
					Static223.anInt3720 = 0;
				} else {
					Static223.anInt3720 = 2;
				}
				Static76.aClass13_1 = null;
				Static440.aClass5_Sub37_2 = null;
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static210.aClass5_Sub22_Sub1_1.method2747();
			Static199.aClass243_113 = null;
			Static440.aClass5_Sub37_2 = null;
			Static223.anInt3720 = 0;
			Static76.aClass13_1 = null;
		}
	}
}
