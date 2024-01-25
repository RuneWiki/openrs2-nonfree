import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "Lclient!it;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_3 = new Class376(12, 7);

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_19 = new Class46(40, 1);

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	public static int anInt1677 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLclient!up;IIIIIIII)Z")
	public static boolean method1363(@OriginalArg(0) int arg0, @OriginalArg(2) Class352 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg4;
		@Pc(17) int local17 = arg2 - 64;
		Static499.anIntArrayArray72[64][64] = 99;
		@Pc(28) int local28 = arg4 - 64;
		Static348.anIntArrayArray44[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static120.anIntArray137[0] = arg2;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local36 + 1;
		Static330.anIntArray303[0] = arg4;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray67;
		while (local50 != local47) {
			local9 = Static330.anIntArray303[local47];
			local7 = Static120.anIntArray137[local47];
			@Pc(69) int local69 = local7 - local17;
			local47 = local47 + 1 & 0xFFF;
			@Pc(80) int local80 = local9 - local28;
			@Pc(86) int local86 = local7 - arg1.anInt9711;
			@Pc(92) int local92 = local9 - arg1.anInt9709;
			if (arg9 == -4) {
				if (local7 == arg5 && local9 == arg6) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static536.method7904(arg5, arg6, local9, 2, 2, local7, arg0, arg3)) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg1.method8345(local7, 2, 2, arg6, local9, arg0, arg3, arg5, arg7)) {
					Static199.anInt3913 = local7;
					Static541.anInt9200 = local9;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg1.method8343(arg5, arg0, local7, local9, arg3, arg7, 2, arg6)) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg1.method8334(local7, arg6, 2, arg9, local9, arg8, arg5)) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg1.method8351(arg8, arg6, arg9, 2, arg5, local9, local7)) {
				Static541.anInt9200 = local9;
				Static199.anInt3913 = local7;
				return true;
			}
			@Pc(243) int local243 = Static348.anIntArrayArray44[local69][local80] + 1;
			if (local69 > 0 && Static499.anIntArrayArray72[local69 - 1][local80] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static120.anIntArray137[local50] = local7 - 1;
				Static330.anIntArray303[local50] = local9;
				Static499.anIntArrayArray72[local69 - 1][local80] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local69 - 1][local80] = local243;
			}
			if (local69 < 126 && Static499.anIntArrayArray72[local69 + 1][local80] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static120.anIntArray137[local50] = local7 + 1;
				Static330.anIntArray303[local50] = local9;
				Static499.anIntArrayArray72[local69 + 1][local80] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local69 + 1][local80] = local243;
			}
			if (local80 > 0 && Static499.anIntArrayArray72[local69][local80 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static120.anIntArray137[local50] = local7;
				Static330.anIntArray303[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static499.anIntArrayArray72[local69][local80 - 1] = 1;
				Static348.anIntArrayArray44[local69][local80 - 1] = local243;
			}
			if (local80 < 126 && Static499.anIntArrayArray72[local69][local80 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static120.anIntArray137[local50] = local7;
				Static330.anIntArray303[local50] = local9 + 1;
				Static499.anIntArrayArray72[local69][local80 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local69][local80 + 1] = local243;
			}
			if (local69 > 0 && local80 > 0 && Static499.anIntArrayArray72[local69 - 1][local80 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static120.anIntArray137[local50] = local7 - 1;
				Static330.anIntArray303[local50] = local9 - 1;
				Static499.anIntArrayArray72[local69 - 1][local80 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local69 - 1][local80 - 1] = local243;
			}
			if (local69 < 126 && local80 > 0 && Static499.anIntArrayArray72[local69 + 1][local80 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static120.anIntArray137[local50] = local7 + 1;
				Static330.anIntArray303[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static499.anIntArrayArray72[local69 + 1][local80 - 1] = 9;
				Static348.anIntArrayArray44[local69 + 1][local80 - 1] = local243;
			}
			if (local69 > 0 && local80 < 126 && Static499.anIntArrayArray72[local69 - 1][local80 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static120.anIntArray137[local50] = local7 - 1;
				Static330.anIntArray303[local50] = local9 + 1;
				Static499.anIntArrayArray72[local69 - 1][local80 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local69 - 1][local80 + 1] = local243;
			}
			if (local69 < 126 && local80 < 126 && Static499.anIntArrayArray72[local69 + 1][local80 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static120.anIntArray137[local50] = local7 + 1;
				Static330.anIntArray303[local50] = local9 + 1;
				Static499.anIntArrayArray72[local69 + 1][local80 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local69 + 1][local80 + 1] = local243;
			}
		}
		Static541.anInt9200 = local9;
		Static199.anInt3913 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)Z")
	public static boolean method1365() {
		@Pc(7) boolean local7 = true;
		if (Static137.aClass131_1 == null) {
			if (Static441.aClass207_89.method4678(Static368.anInt6140)) {
				Static137.aClass131_1 = Static649.method2900(Static441.aClass207_89, Static368.anInt6140);
			} else {
				local7 = false;
			}
		}
		if (Static547.aClass131_3 == null) {
			if (Static441.aClass207_89.method4678(Static378.anInt6260)) {
				Static547.aClass131_3 = Static649.method2900(Static441.aClass207_89, Static378.anInt6260);
			} else {
				local7 = false;
			}
		}
		if (Static473.aClass131_2 == null) {
			if (Static441.aClass207_89.method4678(Static140.anInt2438)) {
				Static473.aClass131_2 = Static649.method2900(Static441.aClass207_89, Static140.anInt2438);
			} else {
				local7 = false;
			}
		}
		if (Static307.aClass272_5 == null) {
			if (Static40.aClass207_73.method4678(Static574.anInt9694)) {
				Static307.aClass272_5 = Static531.method7862(Static40.aClass207_73, Static574.anInt9694);
			} else {
				local7 = false;
			}
		}
		if (Static436.aClass131Array1 == null) {
			if (Static441.aClass207_89.method4678(Static574.anInt9694)) {
				Static436.aClass131Array1 = Static649.method2902(Static441.aClass207_89, Static574.anInt9694);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
