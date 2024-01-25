import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_13 = new Class40("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIILclient!aea;BIIII)Z")
	public static boolean method894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(14) int local14 = arg3;
		@Pc(22) int local22 = arg4 - 64;
		Static453.anIntArrayArray66[64][64] = 99;
		@Pc(33) int local33 = arg3 - 64;
		Static167.anIntArrayArray23[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static271.anIntArray364[0] = arg4;
		@Pc(50) int local50 = local41 + 1;
		Static242.anIntArray309[0] = arg3;
		@Pc(55) int[][] local55 = arg5.anIntArrayArray2;
		while (local43 != local50) {
			local7 = Static271.anIntArray364[local43];
			local14 = Static242.anIntArray309[local43];
			@Pc(70) int local70 = local14 - local33;
			@Pc(74) int local74 = local7 - local22;
			@Pc(80) int local80 = local7 - arg5.anInt163;
			local43 = local43 + 1 & 0xFFF;
			@Pc(92) int local92 = local14 - arg5.anInt162;
			if (arg6 == -4) {
				if (local7 == arg9 && arg8 == local14) {
					Static134.anInt2782 = local14;
					Static128.anInt2699 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static535.method7289(local7, arg1, arg7, 1, 1, arg9, local14, arg8)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local14;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg5.method304(arg0, arg9, arg1, arg8, arg7, 1, 1, local7, local14)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local14;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg5.method312(local14, arg0, local7, arg7, arg1, 1, arg8, arg9)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local14;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg5.method316(local7, arg8, local14, arg9, 1, arg2, arg6)) {
					Static134.anInt2782 = local14;
					Static128.anInt2699 = local7;
					return true;
				}
			} else if (arg5.method311(arg2, local14, arg6, arg9, local7, 1, arg8)) {
				Static134.anInt2782 = local14;
				Static128.anInt2699 = local7;
				return true;
			}
			@Pc(246) int local246 = Static167.anIntArrayArray23[local74][local70] + 1;
			if (local74 > 0 && Static453.anIntArrayArray66[local74 - 1][local70] == 0 && (local55[local80 - 1][local92] & 0x42240000) == 0) {
				Static271.anIntArray364[local50] = local7 - 1;
				Static242.anIntArray309[local50] = local14;
				Static453.anIntArrayArray66[local74 - 1][local70] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local74 - 1][local70] = local246;
			}
			if (local74 < 127 && Static453.anIntArrayArray66[local74 + 1][local70] == 0 && (local55[local80 + 1][local92] & 0x60240000) == 0) {
				Static271.anIntArray364[local50] = local7 + 1;
				Static242.anIntArray309[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local74 + 1][local70] = 8;
				Static167.anIntArrayArray23[local74 + 1][local70] = local246;
			}
			if (local70 > 0 && Static453.anIntArrayArray66[local74][local70 - 1] == 0 && (local55[local80][local92 - 1] & 0x40A40000) == 0) {
				Static271.anIntArray364[local50] = local7;
				Static242.anIntArray309[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local74][local70 - 1] = 1;
				Static167.anIntArrayArray23[local74][local70 - 1] = local246;
			}
			if (local70 < 127 && Static453.anIntArrayArray66[local74][local70 + 1] == 0 && (local55[local80][local92 + 1] & 0x48240000) == 0) {
				Static271.anIntArray364[local50] = local7;
				Static242.anIntArray309[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local74][local70 + 1] = 4;
				Static167.anIntArrayArray23[local74][local70 + 1] = local246;
			}
			if (local74 > 0 && local70 > 0 && Static453.anIntArrayArray66[local74 - 1][local70 - 1] == 0 && (local55[local80 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local80 - 1][local92] & 0x42240000) == 0 && (local55[local80][local92 - 1] & 0x40A40000) == 0) {
				Static271.anIntArray364[local50] = local7 - 1;
				Static242.anIntArray309[local50] = local14 - 1;
				Static453.anIntArrayArray66[local74 - 1][local70 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local74 - 1][local70 - 1] = local246;
			}
			if (local74 < 127 && local70 > 0 && Static453.anIntArrayArray66[local74 + 1][local70 - 1] == 0 && (local55[local80 + 1][local92 - 1] & 0x60E40000) == 0 && (local55[local80 + 1][local92] & 0x60240000) == 0 && (local55[local80][local92 - 1] & 0x40A40000) == 0) {
				Static271.anIntArray364[local50] = local7 + 1;
				Static242.anIntArray309[local50] = local14 - 1;
				Static453.anIntArrayArray66[local74 + 1][local70 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local74 + 1][local70 - 1] = local246;
			}
			if (local74 > 0 && local70 < 127 && Static453.anIntArrayArray66[local74 - 1][local70 + 1] == 0 && (local55[local80 - 1][local92 + 1] & 0x4E240000) == 0 && (local55[local80 - 1][local92] & 0x42240000) == 0 && (local55[local80][local92 + 1] & 0x48240000) == 0) {
				Static271.anIntArray364[local50] = local7 - 1;
				Static242.anIntArray309[local50] = local14 + 1;
				Static453.anIntArrayArray66[local74 - 1][local70 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local74 - 1][local70 + 1] = local246;
			}
			if (local74 < 127 && local70 < 127 && Static453.anIntArrayArray66[local74 + 1][local70 + 1] == 0 && (local55[local80 + 1][local92 + 1] & 0x78240000) == 0 && (local55[local80 + 1][local92] & 0x60240000) == 0 && (local55[local80][local92 + 1] & 0x48240000) == 0) {
				Static271.anIntArray364[local50] = local7 + 1;
				Static242.anIntArray309[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local74 + 1][local70 + 1] = 12;
				Static167.anIntArrayArray23[local74 + 1][local70 + 1] = local246;
			}
		}
		Static134.anInt2782 = local14;
		Static128.anInt2699 = local7;
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public static void method896(@OriginalArg(0) int arg0) {
		Static107.anInt2341 = -1;
		Static489.anInt8411 = arg0;
		Static107.anInt2341 = -1;
		Static117.method2269();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)Z")
	public static boolean method897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
