import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	public static int anInt5773;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!br;")
	public static Class21 aClass21_15;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!tj;")
	public static Class193 aClass193_95;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BILclient!qr;IIIIIIII)Z")
	public static boolean method4959(@OriginalArg(1) int arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg9;
		@Pc(17) int local17 = arg8 - 64;
		Static98.anIntArrayArray66[64][64] = 99;
		@Pc(28) int local28 = arg9 - 64;
		Static315.anIntArrayArray169[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static142.anIntArray279[0] = arg8;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static186.anIntArray331[0] = arg9;
		@Pc(50) int[][] local50 = arg1.anIntArrayArray143;
		while (local42 != local45) {
			local7 = Static142.anIntArray279[local42];
			local9 = Static186.anIntArray331[local42];
			@Pc(65) int local65 = local7 - local17;
			@Pc(70) int local70 = local9 - local28;
			local42 = local42 + 1 & 0xFFF;
			@Pc(82) int local82 = local7 - arg1.anInt5336;
			@Pc(88) int local88 = local9 - arg1.anInt5341;
			if (arg3 == -4) {
				if (local7 == arg0 && arg4 == local9) {
					Static123.anInt2948 = local7;
					Static132.anInt3100 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static174.method3349(arg5, 2, arg0, 2, arg2, arg4, local9, local7)) {
					Static132.anInt3100 = local9;
					Static123.anInt2948 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg1.method4586(arg7, arg2, arg5, 2, arg0, 2, local9, local7, arg4)) {
					Static123.anInt2948 = local7;
					Static132.anInt3100 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg1.method4587(arg7, local9, arg5, arg4, arg0, local7, 2, arg2)) {
					Static132.anInt3100 = local9;
					Static123.anInt2948 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg1.method4585(arg6, arg4, arg3, local9, arg0, local7, 2)) {
					Static132.anInt3100 = local9;
					Static123.anInt2948 = local7;
					return true;
				}
			} else if (arg1.method4599(arg3, local9, arg6, arg0, 2, arg4, local7)) {
				Static123.anInt2948 = local7;
				Static132.anInt3100 = local9;
				return true;
			}
			@Pc(246) int local246 = Static315.anIntArrayArray169[local65][local70] + 1;
			if (local65 > 0 && Static98.anIntArrayArray66[local65 - 1][local70] == 0 && (local50[local82 - 1][local88] & 0x43A40000) == 0 && (local50[local82 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static142.anIntArray279[local45] = local7 - 1;
				Static186.anIntArray331[local45] = local9;
				Static98.anIntArrayArray66[local65 - 1][local70] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local65 - 1][local70] = local246;
			}
			if (local65 < 126 && Static98.anIntArrayArray66[local65 + 1][local70] == 0 && (local50[local82 + 2][local88] & 0x60E40000) == 0 && (local50[local82 + 2][local88 + 1] & 0x78240000) == 0) {
				Static142.anIntArray279[local45] = local7 + 1;
				Static186.anIntArray331[local45] = local9;
				Static98.anIntArrayArray66[local65 + 1][local70] = 8;
				local45 = local45 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local65 + 1][local70] = local246;
			}
			if (local70 > 0 && Static98.anIntArrayArray66[local65][local70 - 1] == 0 && (local50[local82][local88 - 1] & 0x43A40000) == 0 && (local50[local82 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static142.anIntArray279[local45] = local7;
				Static186.anIntArray331[local45] = local9 - 1;
				Static98.anIntArrayArray66[local65][local70 - 1] = 1;
				local45 = local45 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local65][local70 - 1] = local246;
			}
			if (local70 < 126 && Static98.anIntArrayArray66[local65][local70 + 1] == 0 && (local50[local82][local88 + 2] & 0x4E240000) == 0 && (local50[local82 + 1][local88 + 2] & 0x78240000) == 0) {
				Static142.anIntArray279[local45] = local7;
				Static186.anIntArray331[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local65][local70 + 1] = 4;
				Static315.anIntArrayArray169[local65][local70 + 1] = local246;
			}
			if (local65 > 0 && local70 > 0 && Static98.anIntArrayArray66[local65 - 1][local70 - 1] == 0 && (local50[local82 - 1][local88] & 0x4FA40000) == 0 && (local50[local82 - 1][local88 - 1] & 0x43A40000) == 0 && (local50[local82][local88 - 1] & 0x63E40000) == 0) {
				Static142.anIntArray279[local45] = local7 - 1;
				Static186.anIntArray331[local45] = local9 - 1;
				Static98.anIntArrayArray66[local65 - 1][local70 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local65 - 1][local70 - 1] = local246;
			}
			if (local65 < 126 && local70 > 0 && Static98.anIntArrayArray66[local65 + 1][local70 - 1] == 0 && (local50[local82 + 1][local88 - 1] & 0x63E40000) == 0 && (local50[local82 + 2][local88 - 1] & 0x60E40000) == 0 && (local50[local82 + 2][local88] & 0x78E40000) == 0) {
				Static142.anIntArray279[local45] = local7 + 1;
				Static186.anIntArray331[local45] = local9 - 1;
				Static98.anIntArrayArray66[local65 + 1][local70 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local65 + 1][local70 - 1] = local246;
			}
			if (local65 > 0 && local70 < 126 && Static98.anIntArrayArray66[local65 - 1][local70 + 1] == 0 && (local50[local82 - 1][local88 + 1] & 0x4FA40000) == 0 && (local50[local82 - 1][local88 + 2] & 0x4E240000) == 0 && (local50[local82][local88 + 2] & 0x7E240000) == 0) {
				Static142.anIntArray279[local45] = local7 - 1;
				Static186.anIntArray331[local45] = local9 + 1;
				Static98.anIntArrayArray66[local65 - 1][local70 + 1] = 6;
				local45 = local45 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local65 - 1][local70 + 1] = local246;
			}
			if (local65 < 126 && local70 < 126 && Static98.anIntArrayArray66[local65 + 1][local70 + 1] == 0 && (local50[local82 + 1][local88 + 2] & 0x7E240000) == 0 && (local50[local82 + 2][local88 + 2] & 0x78240000) == 0 && (local50[local82 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static142.anIntArray279[local45] = local7 + 1;
				Static186.anIntArray331[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local65 + 1][local70 + 1] = 12;
				Static315.anIntArrayArray169[local65 + 1][local70 + 1] = local246;
			}
		}
		Static123.anInt2948 = local7;
		Static132.anInt3100 = local9;
		return false;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method4960() {
		if (Static86.aBoolean171) {
			Static220.aClass58_46 = null;
			Static86.aBoolean171 = false;
			Static22.aClass58_3 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)Lclient!so;")
	public static Class4_Sub4_Sub18 method4961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub4_Sub18 local15 = (Class4_Sub4_Sub18) Static2.aClass43_1.method1273((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class4_Sub4_Sub18(arg1, arg0);
			Static2.aClass43_1.method1276(local15, local15.aLong223);
		}
		return local15;
	}
}
