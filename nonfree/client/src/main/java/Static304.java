import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!rl", name = "R", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!rl", name = "ob", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!rl", name = "sb", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!rl", name = "wb", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!rl", name = "Db", descriptor = "I")
	public static int anInt5633;

	@OriginalMember(owner = "client!rl", name = "Eb", descriptor = "I")
	public static int anInt5634;

	@OriginalMember(owner = "client!rl", name = "Fb", descriptor = "Z")
	public static boolean aBoolean415;

	@OriginalMember(owner = "client!rl", name = "Hb", descriptor = "I")
	public static int anInt5635;

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "Lclient!kc;")
	public static Class2_Sub24_Sub1 aClass2_Sub24_Sub1_3 = new Class2_Sub24_Sub1(8192);

	@OriginalMember(owner = "client!rl", name = "zb", descriptor = "[I")
	public static int[] anIntArray490 = new int[1];

	@OriginalMember(owner = "client!rl", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray491 = new int[8];

	@OriginalMember(owner = "client!rl", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray492 = new int[8];

	@OriginalMember(owner = "client!rl", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray493 = new int[8];

	@OriginalMember(owner = "client!rl", name = "Ib", descriptor = "[I")
	public static int[] anIntArray494 = new int[1];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI[S)[S")
	public static short[] method4977(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static394.method2442(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B[FI)[F")
	public static float[] method4979(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static394.method2440(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)I")
	public static int method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IFFF)I")
	public static int method4984(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(22) float local22 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(31) float local31 = arg2 < 0.0F ? -arg2 : arg2;
		if (local22 > local8 && local22 > local31) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local31 > local8 && local22 < local31) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method4987(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static394.method2443(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIFI[FIIFIIIII)V")
	public static void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg9 - arg11;
		@Pc(7) int local7 = arg3 - arg8;
		@Pc(11) int local11 = arg10 - arg1;
		@Pc(32) float local32 = arg4[2] * (float) local7 + arg4[0] * (float) local11 + arg4[1] * (float) local3;
		@Pc(53) float local53 = (float) local11 * arg4[3] + (float) local3 * arg4[4] + arg4[5] * (float) local7;
		@Pc(74) float local74 = (float) local11 * arg4[6] + (float) local3 * arg4[7] + (float) local7 * arg4[8];
		@Pc(92) float local92;
		@Pc(86) float local86;
		if (arg6 == 0) {
			local86 = arg2 + 0.5F - local74;
			local92 = local32 + arg0 + 0.5F;
		} else if (arg6 == 1) {
			local86 = arg2 + local74 + 0.5F;
			local92 = local32 + arg0 + 0.5F;
		} else if (arg6 == 2) {
			local86 = arg7 + 0.5F - local53;
			local92 = arg0 + 0.5F - local32;
		} else if (arg6 == 3) {
			local86 = arg7 + 0.5F - local53;
			local92 = local32 + arg0 + 0.5F;
		} else if (arg6 == 4) {
			local86 = arg7 + 0.5F - local53;
			local92 = local74 + arg2 + 0.5F;
		} else {
			local86 = arg7 + 0.5F - local53;
			local92 = arg2 + 0.5F - local74;
		}
		@Pc(188) float local188;
		if (arg5 == 1) {
			local188 = local92;
			local92 = -local86;
			local86 = local188;
		} else if (arg5 == 2) {
			local86 = -local86;
			local92 = -local92;
		} else if (arg5 == 3) {
			local188 = local92;
			local92 = local86;
			local86 = -local188;
		}
		aFloat64 = local86;
		aFloat66 = local92;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIIIIIII[FI)V")
	public static void method4994(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg2 - arg4;
		@Pc(7) int local7 = arg1 - arg8;
		@Pc(11) int local11 = arg3 - arg6;
		@Pc(32) float local32 = arg7[2] * (float) local11 + (float) local7 * arg7[1] + arg7[0] * (float) local3;
		@Pc(53) float local53 = arg7[5] * (float) local11 + arg7[3] * (float) local3 + arg7[4] * (float) local7;
		@Pc(74) float local74 = (float) local11 * arg7[8] + arg7[6] * (float) local3 + (float) local7 * arg7[7];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local53 * local53 + local32 * local32 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = arg0 + (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F;
		@Pc(135) float local135;
		if (arg5 == 1) {
			local135 = local100;
			local100 = -local113;
			local113 = local135;
		} else if (arg5 == 2) {
			local113 = -local113;
			local100 = -local100;
		} else if (arg5 == 3) {
			local135 = local100;
			local100 = local113;
			local113 = -local135;
		}
		aFloat68 = local100;
		aFloat65 = local113;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIFFI[FIII)V")
	public static void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg2 - arg9;
		@Pc(7) int local7 = arg3 - arg8;
		@Pc(11) int local11 = arg6 - arg1;
		@Pc(32) float local32 = (float) local11 * arg7[1] + (float) local3 * arg7[0] + arg7[2] * (float) local7;
		@Pc(53) float local53 = arg7[4] * (float) local11 + (float) local3 * arg7[3] + (float) local7 * arg7[5];
		@Pc(74) float local74 = arg7[8] * (float) local7 + (float) local3 * arg7[6] + arg7[7] * (float) local11;
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local85 *= arg4;
		}
		@Pc(105) float local105 = arg5 + local53 + 0.5F;
		@Pc(110) float local110;
		if (arg0 == 1) {
			local110 = local85;
			local85 = -local105;
			local105 = local110;
		} else if (arg0 == 2) {
			local85 = -local85;
			local105 = -local105;
		} else if (arg0 == 3) {
			local110 = local85;
			local85 = local105;
			local105 = -local110;
		}
		aFloat67 = local85;
		aFloat63 = local105;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIFIIIIF)[F")
	public static float[] method4996(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local2[5] = 0.0F;
		local2[2] = local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		local2[0] = local13;
		local2[3] = 0.0F;
		local2[6] = -local21;
		local2[4] = 1.0F;
		local2[1] = 0.0F;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(73) float local73 = (float) arg5 / 32767.0F;
		@Pc(75) float local75 = 0.0F;
		@Pc(85) float local85 = -((float) Math.sqrt((double) (1.0F - local73 * local73)));
		@Pc(89) float local89 = 1.0F - local73;
		@Pc(100) float local100 = (float) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2));
		if (local100 == 0.0F && local73 == 0.0F) {
			local5 = local2;
		} else {
			if (local100 != 0.0F) {
				local68 = (float) -arg2 / local100;
				local75 = (float) arg4 / local100;
			}
			local66[7] = -local68 * local85;
			local66[0] = local73 + local68 * local68 * local89;
			local66[8] = local73 + local75 * local75 * local89;
			local66[5] = local85 * local68;
			local66[2] = local75 * local68 * local89;
			local66[6] = local89 * local68 * local75;
			local66[4] = local73;
			local66[3] = local85 * -local75;
			local66[1] = local85 * local75;
			local5[0] = local2[0] * local66[0] + local66[3] * local2[1] + local2[2] * local66[6];
			local5[1] = local66[4] * local2[1] + local66[1] * local2[0] + local66[7] * local2[2];
			local5[2] = local2[0] * local66[2] + local2[1] * local66[5] + local66[8] * local2[2];
			local5[3] = local2[3] * local66[0] + local66[3] * local2[4] + local66[6] * local2[5];
			local5[4] = local66[1] * local2[3] + local2[4] * local66[4] + local66[7] * local2[5];
			local5[5] = local2[3] * local66[2] + local2[4] * local66[5] + local2[5] * local66[8];
			local5[6] = local66[6] * local2[8] + local2[6] * local66[0] + local66[3] * local2[7];
			local5[7] = local2[7] * local66[4] + local2[6] * local66[1] + local2[8] * local66[7];
			local5[8] = local66[2] * local2[6] + local66[5] * local2[7] + local66[8] * local2[8];
		}
		local5[7] *= arg0;
		local5[3] *= arg1;
		local5[5] *= arg1;
		local5[1] *= arg6;
		local5[2] *= arg6;
		local5[4] *= arg1;
		local5[8] *= arg0;
		local5[6] *= arg0;
		local5[0] *= arg6;
		return local5;
	}
}
