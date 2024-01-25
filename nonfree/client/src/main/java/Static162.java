import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "Lclient!qda;")
	public static Class295 aClass295_1;

	@OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
	public static int anInt3401 = -1;

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIB)I")
	public static int method3207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static604.method8321(arg1 - 1, arg0 + -1) + Static604.method8321(arg1 - 1, arg0 + 1) + Static604.method8321(arg1 - -1, arg0 + -1) + Static604.method8321(arg1 + 1, arg0 + 1);
		@Pc(74) int local74 = Static604.method8321(arg1, arg0 - 1) + Static604.method8321(arg1, arg0 + 1) + Static604.method8321(arg1 + -1, arg0) + Static604.method8321(arg1 + 1, arg0);
		@Pc(79) int local79 = Static604.method8321(arg1, arg0);
		return local79 / 4 + local74 / 8 + local45 / 16;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIIIIIIIIILclient!uda;)Z")
	public static boolean method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class356 arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg6;
		@Pc(35) int local35 = arg0 - 64;
		Static2.anIntArrayArray1[64][64] = 99;
		@Pc(46) int local46 = arg6 - 64;
		Static311.anIntArrayArray30[64][64] = 0;
		@Pc(54) byte local54 = 0;
		Static173.anIntArray191[0] = arg0;
		@Pc(60) int local60 = 0;
		@Pc(63) int local63 = local54 + 1;
		Static313.anIntArray315[0] = arg6;
		@Pc(68) int[][] local68 = arg9.anIntArrayArray53;
		while (local60 != local63) {
			local7 = Static173.anIntArray191[local60];
			local9 = Static313.anIntArray315[local60];
			@Pc(82) int local82 = local9 - local46;
			@Pc(88) int local88 = local7 - arg9.anInt9620;
			@Pc(94) int local94 = local9 - arg9.anInt9604;
			local60 = local60 + 1 & 0xFFF;
			@Pc(105) int local105 = local7 - local35;
			if (arg2 == -4) {
				if (local7 == arg3 && arg7 == local9) {
					Static322.anInt5560 = local9;
					Static150.anInt3124 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static51.method616(1, local7, local9, 1, arg3, arg8, arg7, arg1)) {
					Static322.anInt5560 = local9;
					Static150.anInt3124 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg9.method8384(arg7, arg4, arg1, arg3, local7, 1, 1, arg8, local9)) {
					Static322.anInt5560 = local9;
					Static150.anInt3124 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg9.method8390(arg7, local9, arg1, local7, 1, arg3, arg4, arg8)) {
					Static150.anInt3124 = local7;
					Static322.anInt5560 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg9.method8392(local9, arg5, arg3, local7, arg7, arg2, 1)) {
					Static150.anInt3124 = local7;
					Static322.anInt5560 = local9;
					return true;
				}
			} else if (arg9.method8398(local7, arg5, local9, arg2, arg3, 1, arg7)) {
				Static150.anInt3124 = local7;
				Static322.anInt5560 = local9;
				return true;
			}
			@Pc(284) int local284 = Static311.anIntArrayArray30[local105][local82] + 1;
			if (local105 > 0 && Static2.anIntArrayArray1[local105 - 1][local82] == 0 && (local68[local88 - 1][local94] & 0x42240000) == 0) {
				Static173.anIntArray191[local63] = local7 - 1;
				Static313.anIntArray315[local63] = local9;
				local63 = local63 + 1 & 0xFFF;
				Static2.anIntArrayArray1[local105 - 1][local82] = 2;
				Static311.anIntArrayArray30[local105 - 1][local82] = local284;
			}
			if (local105 < 127 && Static2.anIntArrayArray1[local105 + 1][local82] == 0 && (local68[local88 + 1][local94] & 0x60240000) == 0) {
				Static173.anIntArray191[local63] = local7 + 1;
				Static313.anIntArray315[local63] = local9;
				local63 = local63 + 1 & 0xFFF;
				Static2.anIntArrayArray1[local105 + 1][local82] = 8;
				Static311.anIntArrayArray30[local105 + 1][local82] = local284;
			}
			if (local82 > 0 && Static2.anIntArrayArray1[local105][local82 - 1] == 0 && (local68[local88][local94 - 1] & 0x40A40000) == 0) {
				Static173.anIntArray191[local63] = local7;
				Static313.anIntArray315[local63] = local9 - 1;
				local63 = local63 + 1 & 0xFFF;
				Static2.anIntArrayArray1[local105][local82 - 1] = 1;
				Static311.anIntArrayArray30[local105][local82 - 1] = local284;
			}
			if (local82 < 127 && Static2.anIntArrayArray1[local105][local82 + 1] == 0 && (local68[local88][local94 + 1] & 0x48240000) == 0) {
				Static173.anIntArray191[local63] = local7;
				Static313.anIntArray315[local63] = local9 + 1;
				Static2.anIntArrayArray1[local105][local82 + 1] = 4;
				local63 = local63 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local105][local82 + 1] = local284;
			}
			if (local105 > 0 && local82 > 0 && Static2.anIntArrayArray1[local105 - 1][local82 - 1] == 0 && (local68[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local68[local88 - 1][local94] & 0x42240000) == 0 && (local68[local88][local94 - 1] & 0x40A40000) == 0) {
				Static173.anIntArray191[local63] = local7 - 1;
				Static313.anIntArray315[local63] = local9 - 1;
				local63 = local63 + 1 & 0xFFF;
				Static2.anIntArrayArray1[local105 - 1][local82 - 1] = 3;
				Static311.anIntArrayArray30[local105 - 1][local82 - 1] = local284;
			}
			if (local105 < 127 && local82 > 0 && Static2.anIntArrayArray1[local105 + 1][local82 - 1] == 0 && (local68[local88 + 1][local94 - 1] & 0x60E40000) == 0 && (local68[local88 + 1][local94] & 0x60240000) == 0 && (local68[local88][local94 - 1] & 0x40A40000) == 0) {
				Static173.anIntArray191[local63] = local7 + 1;
				Static313.anIntArray315[local63] = local9 - 1;
				Static2.anIntArrayArray1[local105 + 1][local82 - 1] = 9;
				local63 = local63 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local105 + 1][local82 - 1] = local284;
			}
			if (local105 > 0 && local82 < 127 && Static2.anIntArrayArray1[local105 - 1][local82 + 1] == 0 && (local68[local88 - 1][local94 + 1] & 0x4E240000) == 0 && (local68[local88 - 1][local94] & 0x42240000) == 0 && (local68[local88][local94 + 1] & 0x48240000) == 0) {
				Static173.anIntArray191[local63] = local7 - 1;
				Static313.anIntArray315[local63] = local9 + 1;
				Static2.anIntArrayArray1[local105 - 1][local82 + 1] = 6;
				local63 = local63 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local105 - 1][local82 + 1] = local284;
			}
			if (local105 < 127 && local82 < 127 && Static2.anIntArrayArray1[local105 + 1][local82 + 1] == 0 && (local68[local88 + 1][local94 + 1] & 0x78240000) == 0 && (local68[local88 + 1][local94] & 0x60240000) == 0 && (local68[local88][local94 + 1] & 0x48240000) == 0) {
				Static173.anIntArray191[local63] = local7 + 1;
				Static313.anIntArray315[local63] = local9 + 1;
				Static2.anIntArrayArray1[local105 + 1][local82 + 1] = 12;
				local63 = local63 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local105 + 1][local82 + 1] = local284;
			}
		}
		Static322.anInt5560 = local9;
		Static150.anInt3124 = local7;
		return false;
	}
}
