import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!lo", name = "W", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!lo", name = "Y", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!lo", name = "db", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!lo", name = "hb", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!lo", name = "pb", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!lo", name = "qb", descriptor = "[J")
	public static long[] aLongArray10;

	@OriginalMember(owner = "client!lo", name = "sb", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!lo", name = "xb", descriptor = "I")
	public static int anInt3802;

	@OriginalMember(owner = "client!lo", name = "Bb", descriptor = "I")
	public static int anInt3803;

	@OriginalMember(owner = "client!lo", name = "Db", descriptor = "Z")
	public static boolean aBoolean283;

	@OriginalMember(owner = "client!lo", name = "Eb", descriptor = "I")
	public static int anInt3804;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "Lclient!fi;")
	public static Class2_Sub13_Sub1 aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1(8192);

	@OriginalMember(owner = "client!lo", name = "yb", descriptor = "[I")
	public static int[] anIntArray470 = new int[1];

	@OriginalMember(owner = "client!lo", name = "zb", descriptor = "[I")
	public static final int[] anIntArray471 = new int[8];

	@OriginalMember(owner = "client!lo", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray472 = new int[8];

	@OriginalMember(owner = "client!lo", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray473 = new int[8];

	@OriginalMember(owner = "client!lo", name = "Fb", descriptor = "[I")
	public static int[] anIntArray474 = new int[1];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)I")
	public static int method3483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3487(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(10) float[] local10 = new float[arg0];
		Static406.method5657(arg1, 0, local10, 0, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[FFIIBIIIFI)V")
	public static void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg9 - arg4;
		@Pc(7) int local7 = arg7 - arg6;
		@Pc(11) int local11 = arg0 - arg5;
		@Pc(32) float local32 = (float) local3 * arg1[0] + arg1[1] * (float) local11 + arg1[2] * (float) local7;
		@Pc(53) float local53 = arg1[4] * (float) local11 + (float) local3 * arg1[3] + (float) local7 * arg1[5];
		@Pc(74) float local74 = (float) local7 * arg1[8] + (float) local3 * arg1[6] + (float) local11 * arg1[7];
		@Pc(94) float local94 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local94 *= arg2;
		}
		@Pc(109) float local109 = arg8 + local53 + 0.5F;
		@Pc(127) float local127;
		if (arg3 == 1) {
			local127 = local94;
			local94 = -local109;
			local109 = local127;
		} else if (arg3 == 2) {
			local94 = -local94;
			local109 = -local109;
		} else if (arg3 == 3) {
			local127 = local94;
			local94 = local109;
			local109 = -local127;
		}
		aFloat44 = local109;
		aFloat41 = local94;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(FFFI)I")
	public static int method3489(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 > local8 && local17 > local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local8 < local26 && local17 < local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(FIFFIBII)[F")
	public static float[] method3492(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local2[8] = local13;
		local2[7] = 0.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[2] = local21;
		local2[0] = local13;
		local2[4] = 1.0F;
		local2[1] = 0.0F;
		local2[3] = 0.0F;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(70) float local70 = 0.0F;
		@Pc(75) float local75 = (float) arg1 / 32767.0F;
		@Pc(85) float local85 = -((float) Math.sqrt((double) (1.0F - local75 * local75)));
		@Pc(90) float local90 = 1.0F - local75;
		@Pc(101) float local101 = (float) Math.sqrt((double) (arg6 * arg6 + arg4 * arg4));
		if (local101 == 0.0F && local75 == 0.0F) {
			local5 = local2;
		} else {
			if (local101 != 0.0F) {
				local68 = (float) -arg6 / local101;
				local70 = (float) arg4 / local101;
			}
			local66[0] = local68 * local68 * local90 + local75;
			local66[1] = local70 * local85;
			local66[2] = local90 * local68 * local70;
			local66[8] = local75 + local70 * local70 * local90;
			local66[3] = local85 * -local70;
			local66[5] = local85 * local68;
			local66[4] = local75;
			local66[6] = local90 * local70 * local68;
			local66[7] = local85 * -local68;
			local5[0] = local2[1] * local66[3] + local2[0] * local66[0] + local2[2] * local66[6];
			local5[1] = local2[2] * local66[7] + local66[4] * local2[1] + local66[1] * local2[0];
			local5[2] = local66[2] * local2[0] + local66[5] * local2[1] + local66[8] * local2[2];
			local5[3] = local66[3] * local2[4] + local66[0] * local2[3] + local2[5] * local66[6];
			local5[4] = local66[7] * local2[5] + local66[1] * local2[3] + local66[4] * local2[4];
			local5[5] = local66[5] * local2[4] + local2[3] * local66[2] + local66[8] * local2[5];
			local5[6] = local66[0] * local2[6] + local2[7] * local66[3] + local2[8] * local66[6];
			local5[7] = local2[8] * local66[7] + local66[1] * local2[6] + local2[7] * local66[4];
			local5[8] = local66[8] * local2[8] + local66[2] * local2[6] + local66[5] * local2[7];
		}
		local5[1] *= arg2;
		local5[2] *= arg2;
		local5[7] *= arg0;
		local5[4] *= arg3;
		local5[5] *= arg3;
		local5[6] *= arg0;
		local5[0] *= arg2;
		local5[3] *= arg3;
		local5[8] *= arg0;
		return local5;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method3493(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = new byte[arg1];
		Static406.method5656(arg0, 0, local18, 0, arg1);
		return local18;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII[FFIIB)V")
	public static void method3496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg1 - arg3;
		@Pc(7) int local7 = arg0 - arg2;
		@Pc(11) int local11 = arg8 - arg7;
		@Pc(32) float local32 = arg5[0] * (float) local3 + (float) local7 * arg5[1] + (float) local11 * arg5[2];
		@Pc(53) float local53 = (float) local11 * arg5[5] + arg5[3] * (float) local3 + arg5[4] * (float) local7;
		@Pc(78) float local78 = arg5[8] * (float) local11 + (float) local3 * arg5[6] + (float) local7 * arg5[7];
		@Pc(93) float local93 = (float) Math.sqrt((double) (local53 * local53 + local32 * local32 + local78 * local78));
		@Pc(104) float local104 = (float) Math.atan2((double) local32, (double) local78) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = (float) Math.asin((double) (local53 / local93)) / 3.1415927F + arg6 + 0.5F;
		@Pc(124) float local124;
		if (arg4 == 1) {
			local124 = local104;
			local104 = -local117;
			local117 = local124;
		} else if (arg4 == 2) {
			local104 = -local104;
			local117 = -local117;
		} else if (arg4 == 3) {
			local124 = local104;
			local104 = local117;
			local117 = -local124;
		}
		aFloat43 = local104;
		aFloat40 = local117;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IFFIFIIIIIII[F)V")
	public static void method3498(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(3) int local3 = arg5 - arg0;
		@Pc(7) int local7 = arg9 - arg10;
		@Pc(11) int local11 = arg7 - arg3;
		@Pc(32) float local32 = (float) local3 * arg11[2] + (float) local7 * arg11[0] + (float) local11 * arg11[1];
		@Pc(53) float local53 = (float) local3 * arg11[5] + (float) local7 * arg11[3] + (float) local11 * arg11[4];
		@Pc(74) float local74 = (float) local3 * arg11[8] + (float) local7 * arg11[6] + (float) local11 * arg11[7];
		@Pc(92) float local92;
		@Pc(98) float local98;
		if (arg6 == 0) {
			local98 = arg1 + 0.5F - local74;
			local92 = arg4 + local32 + 0.5F;
		} else if (arg6 == 1) {
			local92 = local32 + arg4 + 0.5F;
			local98 = local74 + arg1 + 0.5F;
		} else if (arg6 == 2) {
			local92 = arg4 + 0.5F - local32;
			local98 = arg2 + 0.5F - local53;
		} else if (arg6 == 3) {
			local92 = arg4 + local32 + 0.5F;
			local98 = arg2 + 0.5F - local53;
		} else if (arg6 == 4) {
			local98 = arg2 + 0.5F - local53;
			local92 = local74 + arg1 + 0.5F;
		} else {
			local98 = arg2 + 0.5F - local53;
			local92 = arg1 + 0.5F - local74;
		}
		@Pc(186) float local186;
		if (arg8 == 1) {
			local186 = local92;
			local92 = -local98;
			local98 = local186;
		} else if (arg8 == 2) {
			local92 = -local92;
			local98 = -local98;
		} else if (arg8 == 3) {
			local186 = local92;
			local92 = local98;
			local98 = -local186;
		}
		aFloat42 = local92;
		aFloat39 = local98;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[SI)[S")
	public static short[] method3500(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static406.method5652(arg1, 0, local2, 0, arg0);
		return local2;
	}
}
