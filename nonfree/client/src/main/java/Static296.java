import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	public static int anInt5524 = -1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public static void method4744() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static356.aClass232Array1[local3] = null;
		}
		Static221.anInt4606 = 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIIIIIILclient!ld;I)Z")
	public static boolean method4746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class189 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg0 - 64;
		Static85.anIntArrayArray13[64][64] = 99;
		@Pc(28) int local28 = arg1 - 64;
		Static39.anIntArrayArray40[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static292.anIntArray406[0] = arg0;
		@Pc(45) int local45 = local36 + 1;
		Static127.anIntArray174[0] = arg1;
		@Pc(50) int[][] local50 = arg8.anIntArrayArray43;
		while (local38 != local45) {
			local9 = Static127.anIntArray174[local38];
			local7 = Static292.anIntArray406[local38];
			@Pc(65) int local65 = local7 - local18;
			@Pc(71) int local71 = local7 - arg8.anInt5301;
			@Pc(76) int local76 = local9 - local28;
			@Pc(81) int local81 = local9 - arg8.anInt5293;
			local38 = local38 + 1 & 0xFFF;
			if (arg2 == -4) {
				if (arg3 == local7 && local9 == arg7) {
					Static362.anInt6349 = local7;
					Static524.anInt8784 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static395.method5805(arg5, arg3, arg4, local9, 1, 1, local7, arg7)) {
					Static524.anInt8784 = local9;
					Static362.anInt6349 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg8.method4596(1, arg6, 1, arg7, arg5, arg3, local7, arg4, local9)) {
					Static362.anInt6349 = local7;
					Static524.anInt8784 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg8.method4590(local7, arg6, arg5, arg7, arg3, arg4, 1, local9)) {
					Static524.anInt8784 = local9;
					Static362.anInt6349 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg8.method4591(local9, arg7, 1, arg9, local7, arg3, arg2)) {
					Static524.anInt8784 = local9;
					Static362.anInt6349 = local7;
					return true;
				}
			} else if (arg8.method4592(local9, arg9, 1, arg2, arg3, arg7, local7)) {
				Static362.anInt6349 = local7;
				Static524.anInt8784 = local9;
				return true;
			}
			@Pc(236) int local236 = Static39.anIntArrayArray40[local65][local76] + 1;
			if (local65 > 0 && Static85.anIntArrayArray13[local65 - 1][local76] == 0 && (local50[local71 - 1][local81] & 0x42240000) == 0) {
				Static292.anIntArray406[local45] = local7 - 1;
				Static127.anIntArray174[local45] = local9;
				Static85.anIntArrayArray13[local65 - 1][local76] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local65 - 1][local76] = local236;
			}
			if (local65 < 127 && Static85.anIntArrayArray13[local65 + 1][local76] == 0 && (local50[local71 + 1][local81] & 0x60240000) == 0) {
				Static292.anIntArray406[local45] = local7 + 1;
				Static127.anIntArray174[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local65 + 1][local76] = 8;
				Static39.anIntArrayArray40[local65 + 1][local76] = local236;
			}
			if (local76 > 0 && Static85.anIntArrayArray13[local65][local76 - 1] == 0 && (local50[local71][local81 - 1] & 0x40A40000) == 0) {
				Static292.anIntArray406[local45] = local7;
				Static127.anIntArray174[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local65][local76 - 1] = 1;
				Static39.anIntArrayArray40[local65][local76 - 1] = local236;
			}
			if (local76 < 127 && Static85.anIntArrayArray13[local65][local76 + 1] == 0 && (local50[local71][local81 + 1] & 0x48240000) == 0) {
				Static292.anIntArray406[local45] = local7;
				Static127.anIntArray174[local45] = local9 + 1;
				Static85.anIntArrayArray13[local65][local76 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local65][local76 + 1] = local236;
			}
			if (local65 > 0 && local76 > 0 && Static85.anIntArrayArray13[local65 - 1][local76 - 1] == 0 && (local50[local71 - 1][local81 - 1] & 0x43A40000) == 0 && (local50[local71 - 1][local81] & 0x42240000) == 0 && (local50[local71][local81 - 1] & 0x40A40000) == 0) {
				Static292.anIntArray406[local45] = local7 - 1;
				Static127.anIntArray174[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local65 - 1][local76 - 1] = 3;
				Static39.anIntArrayArray40[local65 - 1][local76 - 1] = local236;
			}
			if (local65 < 127 && local76 > 0 && Static85.anIntArrayArray13[local65 + 1][local76 - 1] == 0 && (local50[local71 + 1][local81 - 1] & 0x60E40000) == 0 && (local50[local71 + 1][local81] & 0x60240000) == 0 && (local50[local71][local81 - 1] & 0x40A40000) == 0) {
				Static292.anIntArray406[local45] = local7 + 1;
				Static127.anIntArray174[local45] = local9 - 1;
				Static85.anIntArrayArray13[local65 + 1][local76 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local65 + 1][local76 - 1] = local236;
			}
			if (local65 > 0 && local76 < 127 && Static85.anIntArrayArray13[local65 - 1][local76 + 1] == 0 && (local50[local71 - 1][local81 + 1] & 0x4E240000) == 0 && (local50[local71 - 1][local81] & 0x42240000) == 0 && (local50[local71][local81 + 1] & 0x48240000) == 0) {
				Static292.anIntArray406[local45] = local7 - 1;
				Static127.anIntArray174[local45] = local9 + 1;
				Static85.anIntArrayArray13[local65 - 1][local76 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local65 - 1][local76 + 1] = local236;
			}
			if (local65 < 127 && local76 < 127 && Static85.anIntArrayArray13[local65 + 1][local76 + 1] == 0 && (local50[local71 + 1][local81 + 1] & 0x78240000) == 0 && (local50[local71 + 1][local81] & 0x60240000) == 0 && (local50[local71][local81 + 1] & 0x48240000) == 0) {
				Static292.anIntArray406[local45] = local7 + 1;
				Static127.anIntArray174[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local65 + 1][local76 + 1] = 12;
				Static39.anIntArrayArray40[local65 + 1][local76 + 1] = local236;
			}
		}
		Static362.anInt6349 = local7;
		Static524.anInt8784 = local9;
		return false;
	}
}
