import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "[I")
	public static final int[] anIntArray261 = new int[100];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BIIZ)Ljava/lang/String;")
	public static String method2458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg0[arg1 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(45) char local45 = Static49.aCharArray3[local27 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local27 = local45;
				}
				local13[local15++] = (char) local27;
			}
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!wq;IIIBIIIII)Z")
	public static boolean method2460(@OriginalArg(0) int arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg3;
		@Pc(14) int local14 = arg8;
		@Pc(23) int local23 = arg3 - 64;
		@Pc(27) int local27 = arg8 - 64;
		Static384.anIntArrayArray57[64][64] = 99;
		Static33.anIntArrayArray12[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static102.anIntArray137[0] = arg3;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static161.anIntArray252[0] = arg8;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray66;
		while (local50 != local47) {
			local14 = Static161.anIntArray252[local47];
			local12 = Static102.anIntArray137[local47];
			@Pc(70) int local70 = local14 - local27;
			local47 = local47 + 1 & 0xFFF;
			@Pc(80) int local80 = local12 - local23;
			@Pc(86) int local86 = local12 - arg1.anInt7539;
			@Pc(92) int local92 = local14 - arg1.anInt7518;
			if (arg6 == -4) {
				if (local12 == arg4 && local14 == arg0) {
					Static126.anInt2567 = local12;
					Static123.anInt6825 = local14;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static303.method4186(local14, arg7, 2, arg2, arg0, arg4, 2, local12)) {
					Static126.anInt2567 = local12;
					Static123.anInt6825 = local14;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg1.method5806(local12, 2, arg2, arg5, local14, 2, arg0, arg7, arg4)) {
					Static123.anInt6825 = local14;
					Static126.anInt2567 = local12;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg1.method5810(arg2, 2, arg4, local12, arg0, arg7, local14, arg5)) {
					Static123.anInt6825 = local14;
					Static126.anInt2567 = local12;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg1.method5801(arg6, arg0, local12, arg9, local14, 2, arg4)) {
					Static126.anInt2567 = local12;
					Static123.anInt6825 = local14;
					return true;
				}
			} else if (arg1.method5800(arg4, arg6, local12, 2, local14, arg9, arg0)) {
				Static123.anInt6825 = local14;
				Static126.anInt2567 = local12;
				return true;
			}
			@Pc(244) int local244 = Static33.anIntArrayArray12[local80][local70] + 1;
			if (local80 > 0 && Static384.anIntArrayArray57[local80 - 1][local70] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static102.anIntArray137[local50] = local12 - 1;
				Static161.anIntArray252[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local80 - 1][local70] = 2;
				Static33.anIntArrayArray12[local80 - 1][local70] = local244;
			}
			if (local80 < 126 && Static384.anIntArrayArray57[local80 + 1][local70] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static102.anIntArray137[local50] = local12 + 1;
				Static161.anIntArray252[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local80 + 1][local70] = 8;
				Static33.anIntArrayArray12[local80 + 1][local70] = local244;
			}
			if (local70 > 0 && Static384.anIntArrayArray57[local80][local70 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static102.anIntArray137[local50] = local12;
				Static161.anIntArray252[local50] = local14 - 1;
				Static384.anIntArrayArray57[local80][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static33.anIntArrayArray12[local80][local70 - 1] = local244;
			}
			if (local70 < 126 && Static384.anIntArrayArray57[local80][local70 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static102.anIntArray137[local50] = local12;
				Static161.anIntArray252[local50] = local14 + 1;
				Static384.anIntArrayArray57[local80][local70 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static33.anIntArrayArray12[local80][local70 + 1] = local244;
			}
			if (local80 > 0 && local70 > 0 && Static384.anIntArrayArray57[local80 - 1][local70 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static102.anIntArray137[local50] = local12 - 1;
				Static161.anIntArray252[local50] = local14 - 1;
				Static384.anIntArrayArray57[local80 - 1][local70 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static33.anIntArrayArray12[local80 - 1][local70 - 1] = local244;
			}
			if (local80 < 126 && local70 > 0 && Static384.anIntArrayArray57[local80 + 1][local70 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static102.anIntArray137[local50] = local12 + 1;
				Static161.anIntArray252[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local80 + 1][local70 - 1] = 9;
				Static33.anIntArrayArray12[local80 + 1][local70 - 1] = local244;
			}
			if (local80 > 0 && local70 < 126 && Static384.anIntArrayArray57[local80 - 1][local70 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static102.anIntArray137[local50] = local12 - 1;
				Static161.anIntArray252[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local80 - 1][local70 + 1] = 6;
				Static33.anIntArrayArray12[local80 - 1][local70 + 1] = local244;
			}
			if (local80 < 126 && local70 < 126 && Static384.anIntArrayArray57[local80 + 1][local70 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static102.anIntArray137[local50] = local12 + 1;
				Static161.anIntArray252[local50] = local14 + 1;
				Static384.anIntArrayArray57[local80 + 1][local70 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static33.anIntArrayArray12[local80 + 1][local70 + 1] = local244;
			}
		}
		Static126.anInt2567 = local12;
		Static123.anInt6825 = local14;
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V")
	public static void method2461(@OriginalArg(0) int arg0) {
		Static68.anIntArray382 = new int[arg0];
		Static322.anIntArray502 = new int[arg0];
		Static385.anIntArray500 = new int[arg0];
		Static90.anIntArray123 = new int[arg0];
		Static254.anIntArray385 = new int[arg0];
	}
}
