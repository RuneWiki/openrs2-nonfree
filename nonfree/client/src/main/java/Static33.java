import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!om;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!cc;")
	public static Class26 aClass26_6 = new Class26(64);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[FIBIII[[FIBBLclient!ih;Z[[F[[III)V")
	public static void method521(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) Class4_Sub12 arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(7) int local7 = (arg1 << 8) + 255;
		@Pc(13) int local13 = (arg6 << 8) + 255;
		@Pc(23) int local23 = (arg4 << 8) + 255;
		@Pc(29) int local29 = (arg3 << 8) + 255;
		@Pc(39) int[] local39 = null;
		@Pc(43) int[] local43 = Static35.anIntArrayArray5[arg7];
		@Pc(49) int[] local49 = new int[local43.length >> 1];
		@Pc(51) int local51;
		for (local51 = 0; local51 < local49.length; local51++) {
			local49[local51] = Static309.method4794(arg5, local43[local51 + local51 + 1], arg14, arg12, arg11, null, arg9, local7, arg13, false, 0.0F, arg0, arg8, local43[local51 + local51], local29, local23, local13);
		}
		if (arg10) {
			@Pc(199) int local199;
			if (arg7 == 1) {
				local39 = new int[6];
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local199 = Static309.method4794(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[2] = local49[2];
				local39[0] = local199;
				local39[5] = local49[2];
				local39[3] = local51;
				local39[1] = local51;
				local39[4] = local49[0];
			} else if (arg7 == 2) {
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39 = new int[6];
				local199 = Static309.method4794(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39[1] = local199;
				local39[3] = local51;
				local39[4] = local49[1];
				local39[0] = local49[0];
				local39[2] = local51;
				local39[5] = local49[0];
			} else if (arg7 == 3) {
				local39 = new int[6];
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local199 = Static309.method4794(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39[1] = local49[1];
				local39[4] = local199;
				local39[0] = local49[2];
				local39[3] = local51;
				local39[2] = local51;
				local39[5] = local49[2];
			} else if (arg7 == 4) {
				local39 = new int[3];
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[3];
				local39[1] = local51;
				local39[2] = local49[0];
			} else if (arg7 == 5) {
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39 = new int[] { local49[2], local51, local49[3] };
			} else if (arg7 == 6) {
				local39 = new int[6];
				local51 = Static309.method4794(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local199 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[1] = local51;
				local39[0] = local49[3];
				local39[4] = local49[0];
				local39[3] = local199;
				local39[2] = local199;
				local39[5] = local49[3];
			} else if (arg7 == 7) {
				local39 = new int[6];
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local199 = Static309.method4794(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[2] = local51;
				local39[0] = local49[1];
				local39[3] = local51;
				local39[4] = local49[2];
				local39[1] = local199;
				local39[5] = local49[1];
			} else if (arg7 == 8) {
				local39 = new int[3];
				local51 = Static309.method4794(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[3];
				local39[1] = local51;
				local39[2] = local49[4];
			} else if (arg7 == 9) {
				local51 = Static309.method4794(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local199 = Static309.method4794(arg5, 32, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 96, local29, local23, local13);
				@Pc(720) int local720 = Static309.method4794(arg5, 0, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 64, local29, local23, local13);
				local39 = new int[] { local199, local51, local49[4], local199, local49[4], local49[3], local199, local49[3], local49[2], local199, local49[2], local49[1], local199, local49[1], local720 };
			} else if (arg7 == 10) {
				local39 = new int[9];
				local51 = Static309.method4794(arg5, 128, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local39[0] = local49[2];
				local39[7] = local51;
				local39[4] = local51;
				local39[6] = local49[4];
				local39[8] = local49[0];
				local39[2] = local49[3];
				local39[1] = local51;
				local39[5] = local49[4];
				local39[3] = local49[3];
			} else if (arg7 == 11) {
				local39 = new int[12];
				local51 = Static309.method4794(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 0, local29, local23, local13);
				local199 = Static309.method4794(arg5, 64, arg14, arg12, arg11, null, arg9, local7, arg13, true, 0.0F, arg0, arg8, 128, local29, local23, local13);
				local39[0] = local49[3];
				local39[11] = local199;
				local39[3] = local49[3];
				local39[7] = local199;
				local39[1] = local51;
				local39[10] = local49[1];
				local39[5] = local51;
				local39[8] = local51;
				local39[2] = local49[0];
				local39[9] = local49[2];
				local39[4] = local49[2];
				local39[6] = local49[2];
			}
		}
		arg9.method1871(arg2, arg13, arg14, local49, local39, false);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZII)I")
	public static int method522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static243.anIntArrayArrayArray13 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg2;
		if (arg2 < 3 && (Static174.aByteArrayArrayArray17[1][local12][local16] & 0x2) == 2) {
			local38 = arg2 + 1;
		}
		@Pc(61) int local61 = arg0 & 0x7F;
		@Pc(70) int local70 = arg1 & 0x7F;
		@Pc(98) int local98 = Static243.anIntArrayArrayArray13[local38][local12][local16] * (128 - local70) + local70 * Static243.anIntArrayArrayArray13[local38][local12 + 1][local16] >> 7;
		@Pc(128) int local128 = Static243.anIntArrayArrayArray13[local38][local12 + 1][local16 + 1] * local70 + (128 - local70) * Static243.anIntArrayArrayArray13[local38][local12][local16 + 1] >> 7;
		return local128 * local61 + local98 * (128 - local61) >> 7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIC)C")
	public static char method523(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		if (arg0 != Static73.anInt1626) {
			Static138.anIntArray231 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static138.anIntArray231[local14] = (local14 << 12) / arg0;
			}
			Static48.anInt901 = arg0 - 1;
			Static73.anInt1626 = arg0;
			Static239.anInt4512 = arg0 * 32;
		}
		if (arg1 == Static25.anInt379) {
			return;
		}
		if (arg1 == Static73.anInt1626) {
			Static237.anIntArray478 = Static138.anIntArray231;
		} else {
			Static237.anIntArray478 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static237.anIntArray478[local14] = (local14 << 12) / arg1;
			}
		}
		Static262.anInt5002 = arg1 - 1;
		Static25.anInt379 = arg1;
	}
}
