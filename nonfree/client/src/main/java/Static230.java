import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_111 = new Class12(103, 3);

	@OriginalMember(owner = "client!li", name = "d", descriptor = "J")
	public static long aLong131 = 0L;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILclient!uj;Lclient!uj;)V")
	public static void method3286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub4 arg3, @OriginalArg(4) Class25_Sub4 arg4) {
		@Pc(4) Class169 local4 = Static175.method2473(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass25_Sub4_2 = arg3;
			local4.aClass25_Sub4_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIZLclient!as;IIIIII)Z")
	public static boolean method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg5 - 64;
		Static77.anIntArrayArray22[64][64] = 99;
		@Pc(27) int local27 = arg2 - 64;
		Static88.anIntArrayArray24[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static2.anIntArray2[0] = arg5;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local35 + 1;
		Static149.anIntArray175[0] = arg2;
		@Pc(49) int[][] local49 = arg3.anIntArrayArray3;
		while (local44 != local41) {
			local7 = Static2.anIntArray2[local41];
			local9 = Static149.anIntArray175[local41];
			@Pc(69) int local69 = local7 - local17;
			@Pc(75) int local75 = local9 - arg3.anInt374;
			@Pc(80) int local80 = local9 - local27;
			@Pc(86) int local86 = local7 - arg3.anInt377;
			local41 = local41 + 1 & 0xFFF;
			if (arg1 == -4) {
				if (local7 == arg7 && arg9 == local9) {
					Static59.anInt1169 = local9;
					Static121.anInt2244 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static311.method4232(local9, local7, 1, arg8, arg0, 1, arg7, arg9)) {
					Static59.anInt1169 = local9;
					Static121.anInt2244 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg3.method272(local9, local7, arg9, 1, arg0, 1, arg4, arg7, arg8)) {
					Static121.anInt2244 = local7;
					Static59.anInt1169 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg3.method271(arg8, arg9, arg7, 1, local9, arg4, arg0, local7)) {
					Static59.anInt1169 = local9;
					Static121.anInt2244 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg3.method277(1, arg6, arg7, arg1, local9, arg9, local7)) {
					Static59.anInt1169 = local9;
					Static121.anInt2244 = local7;
					return true;
				}
			} else if (arg3.method278(arg1, local9, 1, arg7, arg9, arg6, local7)) {
				Static59.anInt1169 = local9;
				Static121.anInt2244 = local7;
				return true;
			}
			@Pc(241) int local241 = Static88.anIntArrayArray24[local69][local80] + 1;
			if (local69 > 0 && Static77.anIntArrayArray22[local69 - 1][local80] == 0 && (local49[local86 - 1][local75] & 0x42240000) == 0) {
				Static2.anIntArray2[local44] = local7 - 1;
				Static149.anIntArray175[local44] = local9;
				local44 = local44 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local69 - 1][local80] = 2;
				Static88.anIntArrayArray24[local69 - 1][local80] = local241;
			}
			if (local69 < 127 && Static77.anIntArrayArray22[local69 + 1][local80] == 0 && (local49[local86 + 1][local75] & 0x60240000) == 0) {
				Static2.anIntArray2[local44] = local7 + 1;
				Static149.anIntArray175[local44] = local9;
				Static77.anIntArrayArray22[local69 + 1][local80] = 8;
				local44 = local44 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local69 + 1][local80] = local241;
			}
			if (local80 > 0 && Static77.anIntArrayArray22[local69][local80 - 1] == 0 && (local49[local86][local75 - 1] & 0x40A40000) == 0) {
				Static2.anIntArray2[local44] = local7;
				Static149.anIntArray175[local44] = local9 - 1;
				Static77.anIntArrayArray22[local69][local80 - 1] = 1;
				local44 = local44 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local69][local80 - 1] = local241;
			}
			if (local80 < 127 && Static77.anIntArrayArray22[local69][local80 + 1] == 0 && (local49[local86][local75 + 1] & 0x48240000) == 0) {
				Static2.anIntArray2[local44] = local7;
				Static149.anIntArray175[local44] = local9 + 1;
				Static77.anIntArrayArray22[local69][local80 + 1] = 4;
				local44 = local44 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local69][local80 + 1] = local241;
			}
			if (local69 > 0 && local80 > 0 && Static77.anIntArrayArray22[local69 - 1][local80 - 1] == 0 && (local49[local86 - 1][local75 - 1] & 0x43A40000) == 0 && (local49[local86 - 1][local75] & 0x42240000) == 0 && (local49[local86][local75 - 1] & 0x40A40000) == 0) {
				Static2.anIntArray2[local44] = local7 - 1;
				Static149.anIntArray175[local44] = local9 - 1;
				local44 = local44 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local69 - 1][local80 - 1] = 3;
				Static88.anIntArrayArray24[local69 - 1][local80 - 1] = local241;
			}
			if (local69 < 127 && local80 > 0 && Static77.anIntArrayArray22[local69 + 1][local80 - 1] == 0 && (local49[local86 + 1][local75 - 1] & 0x60E40000) == 0 && (local49[local86 + 1][local75] & 0x60240000) == 0 && (local49[local86][local75 - 1] & 0x40A40000) == 0) {
				Static2.anIntArray2[local44] = local7 + 1;
				Static149.anIntArray175[local44] = local9 - 1;
				Static77.anIntArrayArray22[local69 + 1][local80 - 1] = 9;
				local44 = local44 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local69 + 1][local80 - 1] = local241;
			}
			if (local69 > 0 && local80 < 127 && Static77.anIntArrayArray22[local69 - 1][local80 + 1] == 0 && (local49[local86 - 1][local75 + 1] & 0x4E240000) == 0 && (local49[local86 - 1][local75] & 0x42240000) == 0 && (local49[local86][local75 + 1] & 0x48240000) == 0) {
				Static2.anIntArray2[local44] = local7 - 1;
				Static149.anIntArray175[local44] = local9 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local69 - 1][local80 + 1] = 6;
				Static88.anIntArrayArray24[local69 - 1][local80 + 1] = local241;
			}
			if (local69 < 127 && local80 < 127 && Static77.anIntArrayArray22[local69 + 1][local80 + 1] == 0 && (local49[local86 + 1][local75 + 1] & 0x78240000) == 0 && (local49[local86 + 1][local75] & 0x60240000) == 0 && (local49[local86][local75 + 1] & 0x48240000) == 0) {
				Static2.anIntArray2[local44] = local7 + 1;
				Static149.anIntArray175[local44] = local9 + 1;
				Static77.anIntArrayArray22[local69 + 1][local80 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local69 + 1][local80 + 1] = local241;
			}
		}
		Static121.anInt2244 = local7;
		Static59.anInt1169 = local9;
		return false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!fo;B)Lclient!gf;")
	public static Class89 method3289(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1) {
		@Pc(13) byte[] local13 = arg1.method1815(arg0);
		return local13 == null ? null : new Class89(local13);
	}
}
