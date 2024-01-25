import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bj", name = "O", descriptor = "[I")
	public static int[] anIntArray24;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "S")
	public static short aShort10 = 256;

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
	public static int anInt577 = 255;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIIIILclient!qr;IIIII)Z")
	public static boolean method443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class170 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg8 - 64;
		Static98.anIntArrayArray66[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static315.anIntArrayArray169[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static142.anIntArray279[0] = arg8;
		@Pc(46) int local46 = local37 + 1;
		Static186.anIntArray331[0] = arg0;
		@Pc(51) int[][] local51 = arg4.anIntArrayArray143;
		while (local46 != local39) {
			local9 = Static186.anIntArray331[local39];
			local7 = Static142.anIntArray279[local39];
			@Pc(74) int local74 = local7 - arg4.anInt5336;
			local39 = local39 + 1 & 0xFFF;
			@Pc(85) int local85 = local7 - local18;
			@Pc(90) int local90 = local9 - local29;
			@Pc(96) int local96 = local9 - arg4.anInt5341;
			if (arg9 == -4) {
				if (arg6 == local7 && local9 == arg7) {
					Static132.anInt3100 = local9;
					Static123.anInt2948 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static174.method3349(arg1, 1, arg6, 1, arg3, arg7, local9, local7)) {
					Static123.anInt2948 = local7;
					Static132.anInt3100 = local9;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg4.method4586(arg2, arg3, arg1, 1, arg6, 1, local9, local7, arg7)) {
					Static132.anInt3100 = local9;
					Static123.anInt2948 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg4.method4587(arg2, local9, arg1, arg7, arg6, local7, 1, arg3)) {
					Static123.anInt2948 = local7;
					Static132.anInt3100 = local9;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg4.method4585(arg5, arg7, arg9, local9, arg6, local7, 1)) {
					Static132.anInt3100 = local9;
					Static123.anInt2948 = local7;
					return true;
				}
			} else if (arg4.method4599(arg9, local9, arg5, arg6, 1, arg7, local7)) {
				Static132.anInt3100 = local9;
				Static123.anInt2948 = local7;
				return true;
			}
			@Pc(250) int local250 = Static315.anIntArrayArray169[local85][local90] + 1;
			if (local85 > 0 && Static98.anIntArrayArray66[local85 - 1][local90] == 0 && (local51[local74 - 1][local96] & 0x42240000) == 0) {
				Static142.anIntArray279[local46] = local7 - 1;
				Static186.anIntArray331[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85 - 1][local90] = 2;
				Static315.anIntArrayArray169[local85 - 1][local90] = local250;
			}
			if (local85 < 127 && Static98.anIntArrayArray66[local85 + 1][local90] == 0 && (local51[local74 + 1][local96] & 0x60240000) == 0) {
				Static142.anIntArray279[local46] = local7 + 1;
				Static186.anIntArray331[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85 + 1][local90] = 8;
				Static315.anIntArrayArray169[local85 + 1][local90] = local250;
			}
			if (local90 > 0 && Static98.anIntArrayArray66[local85][local90 - 1] == 0 && (local51[local74][local96 - 1] & 0x40A40000) == 0) {
				Static142.anIntArray279[local46] = local7;
				Static186.anIntArray331[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85][local90 - 1] = 1;
				Static315.anIntArrayArray169[local85][local90 - 1] = local250;
			}
			if (local90 < 127 && Static98.anIntArrayArray66[local85][local90 + 1] == 0 && (local51[local74][local96 + 1] & 0x48240000) == 0) {
				Static142.anIntArray279[local46] = local7;
				Static186.anIntArray331[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85][local90 + 1] = 4;
				Static315.anIntArrayArray169[local85][local90 + 1] = local250;
			}
			if (local85 > 0 && local90 > 0 && Static98.anIntArrayArray66[local85 - 1][local90 - 1] == 0 && (local51[local74 - 1][local96 - 1] & 0x43A40000) == 0 && (local51[local74 - 1][local96] & 0x42240000) == 0 && (local51[local74][local96 - 1] & 0x40A40000) == 0) {
				Static142.anIntArray279[local46] = local7 - 1;
				Static186.anIntArray331[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85 - 1][local90 - 1] = 3;
				Static315.anIntArrayArray169[local85 - 1][local90 - 1] = local250;
			}
			if (local85 < 127 && local90 > 0 && Static98.anIntArrayArray66[local85 + 1][local90 - 1] == 0 && (local51[local74 + 1][local96 - 1] & 0x60E40000) == 0 && (local51[local74 + 1][local96] & 0x60240000) == 0 && (local51[local74][local96 - 1] & 0x40A40000) == 0) {
				Static142.anIntArray279[local46] = local7 + 1;
				Static186.anIntArray331[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85 + 1][local90 - 1] = 9;
				Static315.anIntArrayArray169[local85 + 1][local90 - 1] = local250;
			}
			if (local85 > 0 && local90 < 127 && Static98.anIntArrayArray66[local85 - 1][local90 + 1] == 0 && (local51[local74 - 1][local96 + 1] & 0x4E240000) == 0 && (local51[local74 - 1][local96] & 0x42240000) == 0 && (local51[local74][local96 + 1] & 0x48240000) == 0) {
				Static142.anIntArray279[local46] = local7 - 1;
				Static186.anIntArray331[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static98.anIntArrayArray66[local85 - 1][local90 + 1] = 6;
				Static315.anIntArrayArray169[local85 - 1][local90 + 1] = local250;
			}
			if (local85 < 127 && local90 < 127 && Static98.anIntArrayArray66[local85 + 1][local90 + 1] == 0 && (local51[local74 + 1][local96 + 1] & 0x78240000) == 0 && (local51[local74 + 1][local96] & 0x60240000) == 0 && (local51[local74][local96 + 1] & 0x48240000) == 0) {
				Static142.anIntArray279[local46] = local7 + 1;
				Static186.anIntArray331[local46] = local9 + 1;
				Static98.anIntArrayArray66[local85 + 1][local90 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static315.anIntArrayArray169[local85 + 1][local90 + 1] = local250;
			}
		}
		Static132.anInt3100 = local9;
		Static123.anInt2948 = local7;
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "(B)V")
	public static void method444() {
		for (@Pc(15) Class4_Sub4_Sub6 local15 = (Class4_Sub4_Sub6) Static337.aClass116_46.method3270(); local15 != null; local15 = (Class4_Sub4_Sub6) Static337.aClass116_46.method3272()) {
			@Pc(20) Class8_Sub1_Sub1 local20 = local15.aClass8_Sub1_Sub1_1;
			if (Static12.anInt267 != local20.aByte77 || local20.aBoolean19) {
				local15.method5687();
				local20.method177();
			} else if (local20.anInt170 <= Static199.anInt4137) {
				local20.method179(Static218.anInt4454);
				if (local20.aBoolean19) {
					local15.method5687();
				} else {
					Static301.method4952(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLclient!lf;)Lclient!gp;")
	public static Class26_Sub2 method445(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class26_Sub2(arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3447(), arg0.method3442(), arg0.method3440());
	}
}
