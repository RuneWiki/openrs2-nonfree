import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_48 = new Class349(54, 7);

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Lclient!iga;")
	public static final Class2_Sub23 aClass2_Sub23_1 = new Class2_Sub23(0, -1);

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!au;")
	public static final Class21 aClass21_30 = new Class21(128, 4);

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "S")
	public static short aShort34 = 320;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "[I")
	public static final int[] anIntArray229 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIILclient!wg;IIIIII)Z")
	public static boolean method2365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class362 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg3 - 64;
		Static473.anIntArrayArray51[64][64] = 99;
		@Pc(28) int local28 = arg8 - 64;
		Static481.anIntArrayArray53[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static252.anIntArray303[0] = arg3;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static233.anIntArray284[0] = arg8;
		@Pc(50) int[][] local50 = arg4.anIntArrayArray64;
		while (local42 != local45) {
			local7 = Static252.anIntArray303[local42];
			local9 = Static233.anIntArray284[local42];
			local42 = local42 + 1 & 0xFFF;
			@Pc(77) int local77 = local9 - arg4.anInt9521;
			@Pc(82) int local82 = local7 - arg4.anInt9517;
			@Pc(87) int local87 = local7 - local18;
			@Pc(91) int local91 = local9 - local28;
			if (arg2 == -4) {
				if (local7 == arg1 && local9 == arg5) {
					Static540.anInt8913 = local9;
					Static71.anInt4965 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static570.method7437(local7, 1, 1, arg5, arg6, arg1, local9, arg7)) {
					Static540.anInt8913 = local9;
					Static71.anInt4965 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg4.method7599(1, local7, arg1, local9, arg7, arg6, arg5, 1, arg0)) {
					Static540.anInt8913 = local9;
					Static71.anInt4965 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg4.method7600(arg0, local7, arg1, arg7, arg5, 1, arg6, local9)) {
					Static71.anInt4965 = local7;
					Static540.anInt8913 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg4.method7594(1, arg9, arg1, local9, arg2, arg5, local7)) {
					Static71.anInt4965 = local7;
					Static540.anInt8913 = local9;
					return true;
				}
			} else if (arg4.method7598(local9, local7, arg9, arg5, arg1, arg2, 1)) {
				Static71.anInt4965 = local7;
				Static540.anInt8913 = local9;
				return true;
			}
			@Pc(237) int local237 = Static481.anIntArrayArray53[local87][local91] + 1;
			if (local87 > 0 && Static473.anIntArrayArray51[local87 - 1][local91] == 0 && (local50[local82 - 1][local77] & 0x42240000) == 0) {
				Static252.anIntArray303[local45] = local7 - 1;
				Static233.anIntArray284[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local87 - 1][local91] = 2;
				Static481.anIntArrayArray53[local87 - 1][local91] = local237;
			}
			if (local87 < 127 && Static473.anIntArrayArray51[local87 + 1][local91] == 0 && (local50[local82 + 1][local77] & 0x60240000) == 0) {
				Static252.anIntArray303[local45] = local7 + 1;
				Static233.anIntArray284[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local87 + 1][local91] = 8;
				Static481.anIntArrayArray53[local87 + 1][local91] = local237;
			}
			if (local91 > 0 && Static473.anIntArrayArray51[local87][local91 - 1] == 0 && (local50[local82][local77 - 1] & 0x40A40000) == 0) {
				Static252.anIntArray303[local45] = local7;
				Static233.anIntArray284[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local87][local91 - 1] = 1;
				Static481.anIntArrayArray53[local87][local91 - 1] = local237;
			}
			if (local91 < 127 && Static473.anIntArrayArray51[local87][local91 + 1] == 0 && (local50[local82][local77 + 1] & 0x48240000) == 0) {
				Static252.anIntArray303[local45] = local7;
				Static233.anIntArray284[local45] = local9 + 1;
				Static473.anIntArrayArray51[local87][local91 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local87][local91 + 1] = local237;
			}
			if (local87 > 0 && local91 > 0 && Static473.anIntArrayArray51[local87 - 1][local91 - 1] == 0 && (local50[local82 - 1][local77 - 1] & 0x43A40000) == 0 && (local50[local82 - 1][local77] & 0x42240000) == 0 && (local50[local82][local77 - 1] & 0x40A40000) == 0) {
				Static252.anIntArray303[local45] = local7 - 1;
				Static233.anIntArray284[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local87 - 1][local91 - 1] = 3;
				Static481.anIntArrayArray53[local87 - 1][local91 - 1] = local237;
			}
			if (local87 < 127 && local91 > 0 && Static473.anIntArrayArray51[local87 + 1][local91 - 1] == 0 && (local50[local82 + 1][local77 - 1] & 0x60E40000) == 0 && (local50[local82 + 1][local77] & 0x60240000) == 0 && (local50[local82][local77 - 1] & 0x40A40000) == 0) {
				Static252.anIntArray303[local45] = local7 + 1;
				Static233.anIntArray284[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local87 + 1][local91 - 1] = 9;
				Static481.anIntArrayArray53[local87 + 1][local91 - 1] = local237;
			}
			if (local87 > 0 && local91 < 127 && Static473.anIntArrayArray51[local87 - 1][local91 + 1] == 0 && (local50[local82 - 1][local77 + 1] & 0x4E240000) == 0 && (local50[local82 - 1][local77] & 0x42240000) == 0 && (local50[local82][local77 + 1] & 0x48240000) == 0) {
				Static252.anIntArray303[local45] = local7 - 1;
				Static233.anIntArray284[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static473.anIntArrayArray51[local87 - 1][local91 + 1] = 6;
				Static481.anIntArrayArray53[local87 - 1][local91 + 1] = local237;
			}
			if (local87 < 127 && local91 < 127 && Static473.anIntArrayArray51[local87 + 1][local91 + 1] == 0 && (local50[local82 + 1][local77 + 1] & 0x78240000) == 0 && (local50[local82 + 1][local77] & 0x60240000) == 0 && (local50[local82][local77 + 1] & 0x48240000) == 0) {
				Static252.anIntArray303[local45] = local7 + 1;
				Static233.anIntArray284[local45] = local9 + 1;
				Static473.anIntArrayArray51[local87 + 1][local91 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static481.anIntArrayArray53[local87 + 1][local91 + 1] = local237;
			}
		}
		Static71.anInt4965 = local7;
		Static540.anInt8913 = local9;
		return false;
	}
}
