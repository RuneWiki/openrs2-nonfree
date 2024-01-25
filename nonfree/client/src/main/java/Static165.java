import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!kr", name = "T", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!kr", name = "W", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!kr", name = "bb", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!kr", name = "eb", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!kr", name = "kb", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!kr", name = "ob", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!kr", name = "ub", descriptor = "I")
	public static int anInt3578;

	@OriginalMember(owner = "client!kr", name = "vb", descriptor = "I")
	public static int anInt3579;

	@OriginalMember(owner = "client!kr", name = "wb", descriptor = "Z")
	public static boolean aBoolean336;

	@OriginalMember(owner = "client!kr", name = "Bb", descriptor = "I")
	public static int anInt3580;

	@OriginalMember(owner = "client!kr", name = "mb", descriptor = "Lclient!qd;")
	public static Class1_Sub8_Sub2 aClass1_Sub8_Sub2_2 = new Class1_Sub8_Sub2(8192);

	@OriginalMember(owner = "client!kr", name = "tb", descriptor = "[I")
	public static final int[] anIntArray323 = new int[8];

	@OriginalMember(owner = "client!kr", name = "xb", descriptor = "[I")
	public static int[] anIntArray324 = new int[1];

	@OriginalMember(owner = "client!kr", name = "yb", descriptor = "[I")
	public static int[] anIntArray325 = new int[1];

	@OriginalMember(owner = "client!kr", name = "zb", descriptor = "[I")
	public static final int[] anIntArray326 = new int[8];

	@OriginalMember(owner = "client!kr", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray327 = new int[8];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3331(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(2) float[] local2 = new float[arg0];
		Static361.method1332(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFI)I")
	public static int method3332(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(9) float local9 = arg0 < (float) 0 ? -arg0 : arg0;
		@Pc(18) float local18 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(27) float local27 = arg2 < 0.0F ? -arg2 : arg2;
		if (local9 < local18 && local27 < local18) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local27 > local9 && local27 > local18) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([SII)[S")
	public static short[] method3333(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(17) short[] local17 = new short[arg1];
		Static361.method1331(arg0, 0, local17, 0, arg1);
		return local17;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([FFIIIIIFIIFII)V")
	public static void method3337(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg2 - arg9;
		@Pc(7) int local7 = arg3 - arg8;
		@Pc(11) int local11 = arg6 - arg5;
		@Pc(32) float local32 = arg0[2] * (float) local3 + (float) local7 * arg0[0] + arg0[1] * (float) local11;
		@Pc(53) float local53 = arg0[3] * (float) local7 + (float) local11 * arg0[4] + (float) local3 * arg0[5];
		@Pc(74) float local74 = (float) local3 * arg0[8] + (float) local11 * arg0[7] + (float) local7 * arg0[6];
		@Pc(85) float local85;
		@Pc(92) float local92;
		if (arg4 == 0) {
			local85 = local32 + arg10 + 0.5F;
			local92 = arg7 + 0.5F - local74;
		} else if (arg4 == 1) {
			local92 = local74 + arg7 + 0.5F;
			local85 = local32 + arg10 + 0.5F;
		} else if (arg4 == 2) {
			local85 = arg10 + 0.5F - local32;
			local92 = arg1 + 0.5F - local53;
		} else if (arg4 == 3) {
			local92 = arg1 + 0.5F - local53;
			local85 = local32 + arg10 + 0.5F;
		} else if (arg4 == 4) {
			local85 = arg7 + local74 + 0.5F;
			local92 = arg1 + 0.5F - local53;
		} else {
			local85 = arg7 + 0.5F - local74;
			local92 = arg1 + 0.5F - local53;
		}
		@Pc(196) float local196;
		if (arg11 == 1) {
			local196 = local85;
			local85 = -local92;
			local92 = local196;
		} else if (arg11 == 2) {
			local85 = -local85;
			local92 = -local92;
		} else if (arg11 == 3) {
			local196 = local85;
			local85 = local92;
			local92 = -local196;
		}
		aFloat47 = local92;
		aFloat42 = local85;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZIIIFI[FII)V")
	public static void method3339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg2 - arg7;
		@Pc(12) int local12 = arg5 - arg0;
		@Pc(16) int local16 = arg8 - arg3;
		@Pc(37) float local37 = (float) local12 * arg6[2] + arg6[1] * (float) local3 + (float) local16 * arg6[0];
		@Pc(58) float local58 = arg6[3] * (float) local16 + arg6[4] * (float) local3 + (float) local12 * arg6[5];
		@Pc(79) float local79 = arg6[8] * (float) local12 + arg6[6] * (float) local16 + (float) local3 * arg6[7];
		@Pc(94) float local94 = (float) Math.sqrt((double) (local79 * local79 + local58 * local58 + local37 * local37));
		@Pc(105) float local105 = (float) Math.atan2((double) local37, (double) local79) / 6.2831855F + 0.5F;
		@Pc(118) float local118 = (float) Math.asin((double) (local58 / local94)) / 3.1415927F + arg4 + 0.5F;
		@Pc(138) float local138;
		if (arg1 == 1) {
			local138 = local105;
			local105 = -local118;
			local118 = local138;
		} else if (arg1 == 2) {
			local105 = -local105;
			local118 = -local118;
		} else if (arg1 == 3) {
			local138 = local105;
			local105 = local118;
			local118 = -local138;
		}
		aFloat46 = local105;
		aFloat43 = local118;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method3342(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(2) byte[] local2 = new byte[arg0];
		Static361.method1335(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIFBFFI)[F")
	public static float[] method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local2[7] = 0.0F;
		local2[5] = 0.0F;
		local2[4] = 1.0F;
		local2[3] = 0.0F;
		local2[8] = local13;
		local2[2] = local21;
		local2[6] = -local21;
		local2[0] = local13;
		local2[1] = 0.0F;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(72) float local72 = (float) arg2 / 32767.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(85) float local85 = -((float) Math.sqrt((double) (1.0F - local72 * local72)));
		@Pc(89) float local89 = 1.0F - local72;
		@Pc(100) float local100 = (float) Math.sqrt((double) (arg1 * arg1 + arg6 * arg6));
		if (local100 == 0.0F && local72 == 0.0F) {
			local5 = local2;
		} else {
			if (local100 != 0.0F) {
				local74 = (float) arg6 / local100;
				local67 = (float) -arg1 / local100;
			}
			local65[6] = local67 * local74 * local89;
			local65[1] = local74 * local85;
			local65[7] = local85 * -local67;
			local65[4] = local72;
			local65[3] = -local74 * local85;
			local65[8] = local72 + local89 * local74 * local74;
			local65[2] = local74 * local67 * local89;
			local65[5] = local67 * local85;
			local65[0] = local72 + local67 * local67 * local89;
			local5[0] = local2[2] * local65[6] + local65[0] * local2[0] + local65[3] * local2[1];
			local5[1] = local65[7] * local2[2] + local65[1] * local2[0] + local65[4] * local2[1];
			local5[2] = local65[5] * local2[1] + local2[0] * local65[2] + local2[2] * local65[8];
			local5[3] = local2[4] * local65[3] + local65[0] * local2[3] + local2[5] * local65[6];
			local5[4] = local2[4] * local65[4] + local65[1] * local2[3] + local2[5] * local65[7];
			local5[5] = local65[8] * local2[5] + local2[4] * local65[5] + local2[3] * local65[2];
			local5[6] = local2[8] * local65[6] + local2[6] * local65[0] + local2[7] * local65[3];
			local5[7] = local65[4] * local2[7] + local2[6] * local65[1] + local65[7] * local2[8];
			local5[8] = local2[8] * local65[8] + local65[2] * local2[6] + local2[7] * local65[5];
		}
		local5[5] *= arg3;
		local5[6] *= arg5;
		local5[8] *= arg5;
		local5[1] *= arg4;
		local5[7] *= arg5;
		local5[4] *= arg3;
		local5[0] *= arg4;
		local5[3] *= arg3;
		local5[2] *= arg4;
		return local5;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BII)I")
	public static int method3349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIFZIIIFI[FI)V")
	public static void method3350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg9 - arg0;
		@Pc(11) int local11 = arg3 - arg4;
		@Pc(15) int local15 = arg7 - arg5;
		@Pc(36) float local36 = arg8[2] * (float) local3 + arg8[1] * (float) local15 + arg8[0] * (float) local11;
		@Pc(57) float local57 = (float) local3 * arg8[5] + (float) local15 * arg8[4] + (float) local11 * arg8[3];
		@Pc(78) float local78 = arg8[8] * (float) local3 + (float) local11 * arg8[6] + (float) local15 * arg8[7];
		@Pc(89) float local89 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local89 *= arg6;
		}
		@Pc(103) float local103 = arg2 + local57 + 0.5F;
		@Pc(116) float local116;
		if (arg1 == 1) {
			local116 = local89;
			local89 = -local103;
			local103 = local116;
		} else if (arg1 == 2) {
			local103 = -local103;
			local89 = -local89;
		} else if (arg1 == 3) {
			local116 = local89;
			local89 = local103;
			local103 = -local116;
		}
		aFloat44 = local103;
		aFloat45 = local89;
	}
}
