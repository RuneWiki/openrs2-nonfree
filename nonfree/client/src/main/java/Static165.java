import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!kf", name = "mb", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!kf", name = "rb", descriptor = "I")
	public static int anInt3300;

	@OriginalMember(owner = "client!kf", name = "sb", descriptor = "Z")
	public static boolean aBoolean257;

	@OriginalMember(owner = "client!kf", name = "tb", descriptor = "I")
	public static int anInt3301;

	@OriginalMember(owner = "client!kf", name = "Bb", descriptor = "I")
	public static int anInt3302;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Lclient!ed;")
	public static Class5_Sub12_Sub1 aClass5_Sub12_Sub1_1 = new Class5_Sub12_Sub1(8192);

	@OriginalMember(owner = "client!kf", name = "yb", descriptor = "[I")
	public static int[] anIntArray345 = new int[1];

	@OriginalMember(owner = "client!kf", name = "zb", descriptor = "[I")
	public static int[] anIntArray346 = new int[1];

	@OriginalMember(owner = "client!kf", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray347 = new int[8];

	@OriginalMember(owner = "client!kf", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray348 = new int[8];

	@OriginalMember(owner = "client!kf", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray349 = new int[8];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB[S)[S")
	public static short[] method3002(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(8) short[] local8 = new short[arg0];
		Static368.method5431(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIFIIIFFI[FI)V")
	public static void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg2 - arg1;
		@Pc(7) int local7 = arg9 - arg6;
		@Pc(11) int local11 = arg3 - arg0;
		@Pc(32) float local32 = (float) local11 * arg10[1] + (float) local7 * arg10[0] + (float) local3 * arg10[2];
		@Pc(57) float local57 = (float) local11 * arg10[4] + arg10[3] * (float) local7 + arg10[5] * (float) local3;
		@Pc(78) float local78 = arg10[6] * (float) local7 + arg10[7] * (float) local11 + arg10[8] * (float) local3;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (arg11 == 0) {
			local87 = arg7 + 0.5F - local78;
			local93 = local32 + arg4 + 0.5F;
		} else if (arg11 == 1) {
			local93 = arg4 + local32 + 0.5F;
			local87 = arg7 + local78 + 0.5F;
		} else if (arg11 == 2) {
			local87 = arg8 + 0.5F - local57;
			local93 = arg4 + 0.5F - local32;
		} else if (arg11 == 3) {
			local87 = arg8 + 0.5F - local57;
			local93 = arg4 + local32 + 0.5F;
		} else if (arg11 == 4) {
			local87 = arg8 + 0.5F - local57;
			local93 = arg7 + local78 + 0.5F;
		} else {
			local87 = arg8 + 0.5F - local57;
			local93 = arg7 + 0.5F - local78;
		}
		@Pc(205) float local205;
		if (arg5 == 1) {
			local205 = local93;
			local93 = -local87;
			local87 = local205;
		} else if (arg5 == 2) {
			local93 = -local93;
			local87 = -local87;
		} else if (arg5 == 3) {
			local205 = local93;
			local93 = local87;
			local87 = -local205;
		}
		aFloat32 = local87;
		aFloat28 = local93;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB[F)[F")
	public static float[] method3005(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(2) float[] local2 = new float[arg0];
		Static368.method5430(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI[FFIIIIII)V")
	public static void method3006(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 - arg8;
		@Pc(13) int local13 = arg4 - arg3;
		@Pc(17) int local17 = arg7 - arg5;
		@Pc(38) float local38 = (float) local17 * arg1[1] + arg1[0] * (float) local13 + (float) local9 * arg1[2];
		@Pc(59) float local59 = (float) local13 * arg1[3] + (float) local17 * arg1[4] + (float) local9 * arg1[5];
		@Pc(80) float local80 = arg1[8] * (float) local9 + (float) local17 * arg1[7] + (float) local13 * arg1[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg2 + 0.5F;
		@Pc(124) float local124;
		if (arg0 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg0 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg0 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		aFloat30 = local106;
		aFloat31 = local119;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)I")
	public static int method3009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[B)[B")
	public static byte[] method3010(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(8) byte[] local8 = new byte[arg0];
		Static368.method5429(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(FIIIIIB[FIFI)V")
	public static void method3012(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg1 - arg2;
		@Pc(11) int local11 = arg9 - arg5;
		@Pc(15) int local15 = arg7 - arg3;
		@Pc(36) float local36 = (float) local11 * arg6[2] + (float) local15 * arg6[0] + (float) local7 * arg6[1];
		@Pc(57) float local57 = arg6[3] * (float) local15 + arg6[4] * (float) local7 + arg6[5] * (float) local11;
		@Pc(78) float local78 = arg6[6] * (float) local15 + arg6[7] * (float) local7 + arg6[8] * (float) local11;
		@Pc(89) float local89 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local89 *= arg0;
		}
		@Pc(103) float local103 = arg8 + local57 + 0.5F;
		@Pc(122) float local122;
		if (arg4 == 1) {
			local122 = local89;
			local89 = -local103;
			local103 = local122;
		} else if (arg4 == 2) {
			local89 = -local89;
			local103 = -local103;
		} else if (arg4 == 3) {
			local122 = local89;
			local89 = local103;
			local103 = -local122;
		}
		aFloat27 = local103;
		aFloat29 = local89;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(FIIIIFIF)[F")
	public static float[] method3015(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local2[8] = local13;
		local2[0] = local13;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[1] = 0.0F;
		local2[7] = 0.0F;
		local2[6] = -local21;
		local2[3] = 0.0F;
		local2[2] = local21;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(72) float local72 = (float) arg3 / 32767.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(87) float local87 = 1.0F - local72;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local72 * local72)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
		if (local109 == 0.0F && local72 == 0.0F) {
			local5 = local2;
		} else {
			if (local109 != 0.0F) {
				local67 = (float) -arg2 / local109;
				local74 = (float) arg5 / local109;
			}
			local65[5] = local98 * local67;
			local65[6] = local67 * local74 * local87;
			local65[2] = local74 * local67 * local87;
			local65[1] = local74 * local98;
			local65[4] = local72;
			local65[3] = -local74 * local98;
			local65[0] = local67 * local67 * local87 + local72;
			local65[7] = -local67 * local98;
			local65[8] = local87 * local74 * local74 + local72;
			local5[0] = local65[6] * local2[2] + local65[3] * local2[1] + local2[0] * local65[0];
			local5[1] = local65[4] * local2[1] + local2[0] * local65[1] + local65[7] * local2[2];
			local5[2] = local65[8] * local2[2] + local65[2] * local2[0] + local65[5] * local2[1];
			local5[3] = local65[3] * local2[4] + local2[3] * local65[0] + local65[6] * local2[5];
			local5[4] = local65[7] * local2[5] + local65[1] * local2[3] + local65[4] * local2[4];
			local5[5] = local2[4] * local65[5] + local2[3] * local65[2] + local65[8] * local2[5];
			local5[6] = local65[3] * local2[7] + local65[0] * local2[6] + local2[8] * local65[6];
			local5[7] = local2[8] * local65[7] + local65[1] * local2[6] + local65[4] * local2[7];
			local5[8] = local2[8] * local65[8] + local65[5] * local2[7] + local65[2] * local2[6];
		}
		local5[1] *= arg0;
		local5[5] *= arg6;
		local5[0] *= arg0;
		local5[2] *= arg0;
		local5[3] *= arg6;
		local5[6] *= arg4;
		local5[7] *= arg4;
		local5[8] *= arg4;
		local5[4] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZFFF)I")
	public static int method3018(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		if (local21 > local12 && local30 < local21) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local30 && local30 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
