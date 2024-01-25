import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "Lclient!ui;")
	public static Class359 aClass359_2;

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(IBIIII)V")
	public static void method1406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static46.anInt958 = arg2;
		Static82.anInt1460 = arg0;
		Static483.anInt8676 = arg3;
		Static4.anInt75 = arg1;
		Static384.anInt7269 = arg4;
		if (Static82.anInt1460 >= 100) {
			@Pc(24) int local24 = Static483.anInt8676 * 512 + 256;
			@Pc(30) int local30 = Static46.anInt958 * 512 + 256;
			@Pc(40) int local40 = Static10.method154(local30, local24, Static547.anInt9550) - Static4.anInt75;
			@Pc(45) int local45 = local24 - Static108.anInt1987;
			@Pc(49) int local49 = local40 - Static229.anInt4615;
			@Pc(53) int local53 = local30 - Static598.anInt10387;
			@Pc(64) int local64 = (int) Math.sqrt((double) (local53 * local53 + local45 * local45));
			Static550.anInt9633 = (int) (Math.atan2((double) local49, (double) local64) * 2607.5945876176133D) & 0x3FFF;
			Static152.anInt3290 = (int) (Math.atan2((double) local45, (double) local53) * -2607.5945876176133D) & 0x3FFF;
			Static297.anInt5413 = 0;
			if (Static550.anInt9633 < 1024) {
				Static550.anInt9633 = 1024;
			}
			if (Static550.anInt9633 > 3072) {
				Static550.anInt9633 = 3072;
			}
		}
		Static484.anInt8685 = 2;
		Static533.anInt9359 = -1;
		Static5.anInt83 = -1;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(ILclient!ea;IBI)V")
	public static void method1408(@OriginalArg(1) Class15_Sub3_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray189[0];
		@Pc(20) int local20 = arg0.anIntArray188[0];
		if (local10 < 0 || Static222.anInt4533 <= local10 || local20 < 0 || local20 >= Static668.anInt11370 || (arg1 < 0 || Static222.anInt4533 <= arg1 || arg2 < 0 || arg2 >= Static668.anInt11370)) {
			return;
		}
		@Pc(79) int local79 = Static93.method9375(Static216.anIntArray200, arg2, arg1, 0, 0, Static269.anIntArray334, true, 0, 0, local20, local10, arg0.method3690(), Static196.aClass200Array1[arg0.aByte142], -4);
		if (local79 >= 1 && local79 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local79 - 1; local91++) {
				arg0.method2228(Static269.anIntArray334[local91], (byte) 2, Static216.anIntArray200[local91]);
			}
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!kn;IIIIIIIIII)Z")
	public static boolean method1409(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg6;
		@Pc(14) int local14 = arg1;
		@Pc(23) int local23 = arg6 - 64;
		Static296.anIntArrayArray19[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static96.anIntArrayArray16[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static456.anIntArray409[0] = arg6;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static312.anIntArray288[0] = arg1;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray23;
		while (local51 != local48) {
			local14 = Static312.anIntArray288[local48];
			local12 = Static456.anIntArray409[local48];
			@Pc(72) int local72 = local14 - arg0.anInt5851;
			@Pc(78) int local78 = local12 - arg0.anInt5838;
			local48 = local48 + 1 & 0xFFF;
			@Pc(89) int local89 = local12 - local23;
			@Pc(94) int local94 = local14 - local34;
			if (arg2 == -4) {
				if (arg4 == local12 && local14 == arg9) {
					Static503.anInt8360 = local12;
					Static539.anInt9400 = local14;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static476.method7598(arg4, arg9, local14, arg5, arg3, 1, local12, 1)) {
					Static503.anInt8360 = local12;
					Static539.anInt9400 = local14;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg0.method5284(1, 1, local14, local12, arg3, arg5, arg9, arg8, arg4)) {
					Static539.anInt9400 = local14;
					Static503.anInt8360 = local12;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg0.method5296(1, local12, arg5, arg3, arg9, arg8, arg4, local14)) {
					Static539.anInt9400 = local14;
					Static503.anInt8360 = local12;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg0.method5300(1, arg2, arg9, arg7, arg4, local12, local14)) {
					Static539.anInt9400 = local14;
					Static503.anInt8360 = local12;
					return true;
				}
			} else if (arg0.method5283(local14, arg2, arg7, 1, arg4, arg9, local12)) {
				Static503.anInt8360 = local12;
				Static539.anInt9400 = local14;
				return true;
			}
			@Pc(246) int local246 = Static96.anIntArrayArray16[local89][local94] + 1;
			if (local89 > 0 && Static296.anIntArrayArray19[local89 - 1][local94] == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0) {
				Static456.anIntArray409[local51] = local12 - 1;
				Static312.anIntArray288[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local89 - 1][local94] = 2;
				Static96.anIntArrayArray16[local89 - 1][local94] = local246;
			}
			if (local89 < 127 && Static296.anIntArrayArray19[local89 + 1][local94] == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0) {
				Static456.anIntArray409[local51] = local12 + 1;
				Static312.anIntArray288[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local89 + 1][local94] = 8;
				Static96.anIntArrayArray16[local89 + 1][local94] = local246;
			}
			if (local94 > 0 && Static296.anIntArrayArray19[local89][local94 - 1] == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static456.anIntArray409[local51] = local12;
				Static312.anIntArray288[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local89][local94 - 1] = 1;
				Static96.anIntArrayArray16[local89][local94 - 1] = local246;
			}
			if (local94 < 127 && Static296.anIntArrayArray19[local89][local94 + 1] == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static456.anIntArray409[local51] = local12;
				Static312.anIntArray288[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local89][local94 + 1] = 4;
				Static96.anIntArrayArray16[local89][local94 + 1] = local246;
			}
			if (local89 > 0 && local94 > 0 && Static296.anIntArrayArray19[local89 - 1][local94 - 1] == 0 && (local56[local78 - 1][local72 - 1] & 0x43A40000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static456.anIntArray409[local51] = local12 - 1;
				Static312.anIntArray288[local51] = local14 - 1;
				Static296.anIntArrayArray19[local89 - 1][local94 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local89 - 1][local94 - 1] = local246;
			}
			if (local89 < 127 && local94 > 0 && Static296.anIntArrayArray19[local89 + 1][local94 - 1] == 0 && (local56[local78 + 1][local72 - 1] & 0x60E40000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static456.anIntArray409[local51] = local12 + 1;
				Static312.anIntArray288[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local89 + 1][local94 - 1] = 9;
				Static96.anIntArrayArray16[local89 + 1][local94 - 1] = local246;
			}
			if (local89 > 0 && local94 < 127 && Static296.anIntArrayArray19[local89 - 1][local94 + 1] == 0 && (local56[local78 - 1][local72 + 1] & 0x4E240000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static456.anIntArray409[local51] = local12 - 1;
				Static312.anIntArray288[local51] = local14 + 1;
				Static296.anIntArrayArray19[local89 - 1][local94 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local89 - 1][local94 + 1] = local246;
			}
			if (local89 < 127 && local94 < 127 && Static296.anIntArrayArray19[local89 + 1][local94 + 1] == 0 && (local56[local78 + 1][local72 + 1] & 0x78240000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static456.anIntArray409[local51] = local12 + 1;
				Static312.anIntArray288[local51] = local14 + 1;
				Static296.anIntArrayArray19[local89 + 1][local94 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local89 + 1][local94 + 1] = local246;
			}
		}
		Static503.anInt8360 = local12;
		Static539.anInt9400 = local14;
		return false;
	}
}
