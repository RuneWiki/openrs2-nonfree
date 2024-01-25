import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!rd", name = "mb", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!rd", name = "pb", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!rd", name = "rb", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!rd", name = "wb", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!rd", name = "xb", descriptor = "I")
	public static int anInt5295;

	@OriginalMember(owner = "client!rd", name = "Bb", descriptor = "I")
	public static int anInt5296;

	@OriginalMember(owner = "client!rd", name = "Db", descriptor = "Z")
	public static boolean aBoolean441;

	@OriginalMember(owner = "client!rd", name = "Gb", descriptor = "I")
	public static int anInt5297;

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lclient!jm;")
	public static Class1_Sub21_Sub1 aClass1_Sub21_Sub1_2 = new Class1_Sub21_Sub1(8192);

	@OriginalMember(owner = "client!rd", name = "yb", descriptor = "[I")
	public static final int[] anIntArray499 = new int[8];

	@OriginalMember(owner = "client!rd", name = "zb", descriptor = "[I")
	public static final int[] anIntArray500 = new int[8];

	@OriginalMember(owner = "client!rd", name = "Ab", descriptor = "[I")
	public static int[] anIntArray501 = new int[1];

	@OriginalMember(owner = "client!rd", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray502 = new int[8];

	@OriginalMember(owner = "client!rd", name = "Eb", descriptor = "[I")
	public static int[] anIntArray503 = new int[1];

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(III)I")
	public static int method4622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([FII)[F")
	public static float[] method4624(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(15) float[] local15 = new float[arg1];
		Static361.method1851(arg0, 0, local15, 0, arg1);
		return local15;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZFFF)I")
	public static int method4625(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(22) float local22 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(31) float local31 = arg1 < 0.0F ? -arg1 : arg1;
		if (local22 > local13 && local31 < local22) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local13 < local31 && local31 > local22) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IFIFIFIB)[F")
	public static float[] method4629(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local2[3] = 0.0F;
		local2[8] = local13;
		local2[0] = local13;
		local2[2] = local21;
		local2[4] = 1.0F;
		local2[7] = 0.0F;
		local2[1] = 0.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		@Pc(73) float[] local73 = new float[9];
		@Pc(75) float local75 = 1.0F;
		@Pc(77) float local77 = 0.0F;
		@Pc(82) float local82 = (float) arg0 / 32767.0F;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local82 * local82)));
		@Pc(98) float local98 = 1.0F - local82;
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg6 * arg6 + arg4 * arg4));
		if (local109 == 0.0F && local82 == 0.0F) {
			local5 = local2;
		} else {
			if (local109 != 0.0F) {
				local75 = (float) -arg6 / local109;
				local77 = (float) arg4 / local109;
			}
			local73[6] = local98 * local75 * local77;
			local73[5] = local93 * local75;
			local73[8] = local82 + local98 * local77 * local77;
			local73[3] = local93 * -local77;
			local73[2] = local77 * local75 * local98;
			local73[0] = local75 * local75 * local98 + local82;
			local73[4] = local82;
			local73[7] = -local75 * local93;
			local73[1] = local93 * local77;
			local5[0] = local73[6] * local2[2] + local2[1] * local73[3] + local73[0] * local2[0];
			local5[1] = local73[7] * local2[2] + local2[1] * local73[4] + local73[1] * local2[0];
			local5[3] = local73[6] * local2[5] + local2[3] * local73[0] + local2[4] * local73[3];
			local5[2] = local73[5] * local2[1] + local73[2] * local2[0] + local73[8] * local2[2];
			local5[4] = local2[3] * local73[1] + local73[4] * local2[4] + local73[7] * local2[5];
			local5[6] = local73[6] * local2[8] + local73[3] * local2[7] + local73[0] * local2[6];
			local5[5] = local73[8] * local2[5] + local73[2] * local2[3] + local2[4] * local73[5];
			local5[7] = local73[4] * local2[7] + local2[6] * local73[1] + local2[8] * local73[7];
			local5[8] = local73[2] * local2[6] + local2[7] * local73[5] + local73[8] * local2[8];
		}
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[3] *= arg5;
		local5[7] *= arg3;
		local5[2] *= arg1;
		local5[0] *= arg1;
		local5[6] *= arg3;
		local5[1] *= arg1;
		local5[8] *= arg3;
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[FIIFIIIFIIFI)V")
	public static void method4630(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg0 - arg8;
		@Pc(7) int local7 = arg4 - arg9;
		@Pc(11) int local11 = arg11 - arg5;
		@Pc(32) float local32 = arg1[1] * (float) local7 + (float) local11 * arg1[0] + (float) local3 * arg1[2];
		@Pc(53) float local53 = (float) local3 * arg1[5] + arg1[4] * (float) local7 + arg1[3] * (float) local11;
		@Pc(74) float local74 = arg1[8] * (float) local3 + (float) local11 * arg1[6] + arg1[7] * (float) local7;
		@Pc(98) float local98;
		@Pc(105) float local105;
		if (arg2 == 0) {
			local105 = arg10 + 0.5F - local74;
			local98 = local32 + arg3 + 0.5F;
		} else if (arg2 == 1) {
			local105 = arg10 + local74 + 0.5F;
			local98 = local32 + arg3 + 0.5F;
		} else if (arg2 == 2) {
			local105 = arg7 + 0.5F - local53;
			local98 = arg3 + 0.5F - local32;
		} else if (arg2 == 3) {
			local98 = local32 + arg3 + 0.5F;
			local105 = arg7 + 0.5F - local53;
		} else if (arg2 == 4) {
			local105 = arg7 + 0.5F - local53;
			local98 = local74 + arg10 + 0.5F;
		} else {
			local98 = arg10 + 0.5F - local74;
			local105 = arg7 + 0.5F - local53;
		}
		@Pc(197) float local197;
		if (arg6 == 1) {
			local197 = local98;
			local98 = -local105;
			local105 = local197;
		} else if (arg6 == 2) {
			local105 = -local105;
			local98 = -local98;
		} else if (arg6 == 3) {
			local197 = local98;
			local98 = local105;
			local105 = -local197;
		}
		aFloat69 = local98;
		aFloat66 = local105;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([SII)[S")
	public static short[] method4632(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		Static361.method1849(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([FBIIIIIIIF)V")
	public static void method4633(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(3) int local3 = arg5 - arg6;
		@Pc(7) int local7 = arg3 - arg2;
		@Pc(11) int local11 = arg1 - arg7;
		@Pc(32) float local32 = (float) local7 * arg0[0] + (float) local3 * arg0[1] + arg0[2] * (float) local11;
		@Pc(53) float local53 = (float) local11 * arg0[5] + (float) local7 * arg0[3] + arg0[4] * (float) local3;
		@Pc(74) float local74 = arg0[6] * (float) local7 + (float) local3 * arg0[7] + (float) local11 * arg0[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local74 * local74 + local53 * local53 + local32 * local32));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg8 + 0.5F;
		@Pc(126) float local126;
		if (arg4 == 1) {
			local126 = local100;
			local100 = -local113;
			local113 = local126;
		} else if (arg4 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg4 == 3) {
			local126 = local100;
			local100 = local113;
			local113 = -local126;
		}
		aFloat65 = local100;
		aFloat70 = local113;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method4634(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(2) byte[] local2 = new byte[arg0];
		Static361.method1853(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([FFFIIIIBIII)V")
	public static void method4635(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg3 - arg7;
		@Pc(7) int local7 = arg8 - arg6;
		@Pc(11) int local11 = arg9 - arg5;
		@Pc(32) float local32 = (float) local3 * arg0[0] + arg0[1] * (float) local11 + (float) local7 * arg0[2];
		@Pc(53) float local53 = arg0[5] * (float) local7 + arg0[4] * (float) local11 + arg0[3] * (float) local3;
		@Pc(74) float local74 = arg0[8] * (float) local7 + (float) local11 * arg0[7] + (float) local3 * arg0[6];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local85 *= arg1;
		}
		@Pc(106) float local106 = arg2 + local53 + 0.5F;
		@Pc(111) float local111;
		if (arg4 == 1) {
			local111 = local85;
			local85 = -local106;
			local106 = local111;
		} else if (arg4 == 2) {
			local85 = -local85;
			local106 = -local106;
		} else if (arg4 == 3) {
			local111 = local85;
			local85 = local106;
			local106 = -local111;
		}
		aFloat67 = local85;
		aFloat68 = local106;
	}
}
