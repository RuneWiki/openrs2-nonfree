import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!pk", name = "ab", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!pk", name = "hb", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!pk", name = "sb", descriptor = "I")
	public static int anInt4804;

	@OriginalMember(owner = "client!pk", name = "Ab", descriptor = "I")
	public static int anInt4805;

	@OriginalMember(owner = "client!pk", name = "Bb", descriptor = "Z")
	public static boolean aBoolean278;

	@OriginalMember(owner = "client!pk", name = "Fb", descriptor = "I")
	public static int anInt4806;

	@OriginalMember(owner = "client!pk", name = "ib", descriptor = "Lclient!ap;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_3 = new Class3_Sub4_Sub1(8192);

	@OriginalMember(owner = "client!pk", name = "tb", descriptor = "[I")
	public static final int[] anIntArray385 = new int[8];

	@OriginalMember(owner = "client!pk", name = "yb", descriptor = "[I")
	public static int[] anIntArray387 = new int[1];

	@OriginalMember(owner = "client!pk", name = "zb", descriptor = "[I")
	public static final int[] anIntArray388 = new int[8];

	@OriginalMember(owner = "client!pk", name = "Db", descriptor = "[I")
	public static final int[] anIntArray389 = new int[8];

	@OriginalMember(owner = "client!pk", name = "Gb", descriptor = "[I")
	public static int[] anIntArray390 = new int[1];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(FIIIZIFF)[F")
	public static float[] method4127(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local2[8] = local13;
		local2[0] = local13;
		local2[6] = -local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[7] = 0.0F;
		local2[2] = local21;
		local2[1] = 0.0F;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(72) float local72 = (float) arg1 / 32767.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(78) float local78 = 1.0F - local72;
		@Pc(88) float local88 = -((float) Math.sqrt((double) (1.0F - local72 * local72)));
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
		if (local99 == 0.0F && local72 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg4 / local99;
				local74 = (float) arg3 / local99;
			}
			local65[2] = local78 * local74 * local67;
			local65[7] = local88 * -local67;
			local65[4] = local72;
			local65[8] = local74 * local74 * local78 + local72;
			local65[0] = local78 * local67 * local67 + local72;
			local65[3] = local88 * -local74;
			local65[1] = local74 * local88;
			local65[6] = local74 * local67 * local78;
			local65[5] = local67 * local88;
			local5[0] = local65[6] * local2[2] + local2[0] * local65[0] + local2[1] * local65[3];
			local5[1] = local2[0] * local65[1] + local65[4] * local2[1] + local2[2] * local65[7];
			local5[3] = local2[5] * local65[6] + local65[0] * local2[3] + local2[4] * local65[3];
			local5[2] = local2[0] * local65[2] + local65[5] * local2[1] + local65[8] * local2[2];
			local5[4] = local65[1] * local2[3] + local2[4] * local65[4] + local65[7] * local2[5];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local65[6] * local2[8];
			local5[5] = local65[8] * local2[5] + local65[5] * local2[4] + local65[2] * local2[3];
			local5[7] = local2[6] * local65[1] + local65[4] * local2[7] + local2[8] * local65[7];
			local5[8] = local65[5] * local2[7] + local2[6] * local65[2] + local65[8] * local2[8];
		}
		local5[7] *= arg6;
		local5[8] *= arg6;
		local5[1] *= arg0;
		local5[2] *= arg0;
		local5[4] *= arg5;
		local5[0] *= arg0;
		local5[3] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB[F)[F")
	public static float[] method4129(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(17) float[] local17 = new float[arg0];
		Static367.method4035(arg1, 0, local17, 0, arg0);
		return local17;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method4132(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static367.method4034(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[SI)[S")
	public static short[] method4133(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static367.method4033(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)I")
	public static int method4135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(FFIF)I")
	public static int method4136(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local26 > local8 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local8 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IFI[FIFIFBIIII)V")
	public static void method4137(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg10 - arg9;
		@Pc(7) int local7 = arg6 - arg11;
		@Pc(11) int local11 = arg4 - arg0;
		@Pc(32) float local32 = (float) local3 * arg3[0] + (float) local7 * arg3[1] + arg3[2] * (float) local11;
		@Pc(53) float local53 = arg3[5] * (float) local11 + (float) local7 * arg3[4] + (float) local3 * arg3[3];
		@Pc(74) float local74 = arg3[8] * (float) local11 + arg3[7] * (float) local7 + arg3[6] * (float) local3;
		@Pc(89) float local89;
		@Pc(83) float local83;
		if (arg8 == 0) {
			local83 = arg5 + 0.5F - local74;
			local89 = arg7 + local32 + 0.5F;
		} else if (arg8 == 1) {
			local89 = local32 + arg7 + 0.5F;
			local83 = arg5 + local74 + 0.5F;
		} else if (arg8 == 2) {
			local89 = arg7 + 0.5F - local32;
			local83 = arg1 + 0.5F - local53;
		} else if (arg8 == 3) {
			local89 = arg7 + local32 + 0.5F;
			local83 = arg1 + 0.5F - local53;
		} else if (arg8 == 4) {
			local89 = local74 + arg5 + 0.5F;
			local83 = arg1 + 0.5F - local53;
		} else {
			local83 = arg1 + 0.5F - local53;
			local89 = arg5 + 0.5F - local74;
		}
		@Pc(185) float local185;
		if (arg2 == 1) {
			local185 = local89;
			local89 = -local83;
			local83 = local185;
		} else if (arg2 == 2) {
			local89 = -local89;
			local83 = -local83;
		} else if (arg2 == 3) {
			local185 = local89;
			local89 = local83;
			local83 = -local185;
		}
		aFloat35 = local89;
		aFloat31 = local83;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III[FFIIIZI)V")
	public static void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg0 - arg6;
		@Pc(11) int local11 = arg7 - arg1;
		@Pc(15) int local15 = arg2 - arg5;
		@Pc(36) float local36 = arg3[2] * (float) local3 + (float) local11 * arg3[0] + arg3[1] * (float) local15;
		@Pc(57) float local57 = (float) local11 * arg3[3] + (float) local15 * arg3[4] + (float) local3 * arg3[5];
		@Pc(78) float local78 = (float) local3 * arg3[8] + (float) local11 * arg3[6] + (float) local15 * arg3[7];
		@Pc(93) float local93 = (float) Math.sqrt((double) (local57 * local57 + local36 * local36 + local78 * local78));
		@Pc(104) float local104 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = arg4 + (float) Math.asin((double) (local57 / local93)) / 3.1415927F + 0.5F;
		@Pc(122) float local122;
		if (arg8 == 1) {
			local122 = local104;
			local104 = -local117;
			local117 = local122;
		} else if (arg8 == 2) {
			local117 = -local117;
			local104 = -local104;
		} else if (arg8 == 3) {
			local122 = local104;
			local104 = local117;
			local117 = -local122;
		}
		aFloat36 = local104;
		aFloat34 = local117;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIFF[FIIII)V")
	public static void method4140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg9 - arg7;
		@Pc(11) int local11 = arg8 - arg1;
		@Pc(32) float local32 = (float) local7 * arg5[2] + arg5[0] * (float) local3 + arg5[1] * (float) local11;
		@Pc(53) float local53 = arg5[3] * (float) local3 + arg5[4] * (float) local11 + arg5[5] * (float) local7;
		@Pc(74) float local74 = arg5[6] * (float) local3 + (float) local11 * arg5[7] + arg5[8] * (float) local7;
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local85 *= arg3;
		}
		@Pc(99) float local99 = local53 + arg4 + 0.5F;
		@Pc(104) float local104;
		if (arg6 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg6 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg6 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		aFloat32 = local85;
		aFloat33 = local99;
	}
}
