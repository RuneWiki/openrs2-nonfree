import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "[J")
	public static long[] aLongArray8;

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!vh", name = "P", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!vh", name = "bb", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!vh", name = "mb", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!vh", name = "ub", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!vh", name = "zb", descriptor = "I")
	public static int anInt6164;

	@OriginalMember(owner = "client!vh", name = "Bb", descriptor = "Z")
	public static boolean aBoolean482;

	@OriginalMember(owner = "client!vh", name = "Cb", descriptor = "I")
	public static int anInt6165;

	@OriginalMember(owner = "client!vh", name = "Eb", descriptor = "I")
	public static int anInt6166;

	@OriginalMember(owner = "client!vh", name = "Z", descriptor = "Lclient!jt;")
	public static Class3_Sub5_Sub2 aClass3_Sub5_Sub2_2 = new Class3_Sub5_Sub2(8192);

	@OriginalMember(owner = "client!vh", name = "wb", descriptor = "[I")
	public static int[] anIntArray658 = new int[1];

	@OriginalMember(owner = "client!vh", name = "xb", descriptor = "[I")
	public static int[] anIntArray659 = new int[1];

	@OriginalMember(owner = "client!vh", name = "yb", descriptor = "[I")
	public static final int[] anIntArray660 = new int[8];

	@OriginalMember(owner = "client!vh", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray661 = new int[8];

	@OriginalMember(owner = "client!vh", name = "Db", descriptor = "[I")
	public static final int[] anIntArray662 = new int[8];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(FFFI)I")
	public static int method5498(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(42) float local42 = arg1 < 0.0F ? -arg1 : arg1;
		if (local17 > local8 && local42 < local17) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local42 > local8 && local42 > local17) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([FZI)[F")
	public static float[] method5504(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) float[] local7 = new float[arg1];
		Static400.method1878(arg0, 0, local7, 0, arg1);
		return local7;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method5505(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(2) byte[] local2 = new byte[arg0];
		Static400.method1877(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIF[FIIIII)V")
	public static void method5506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg8 - arg7;
		@Pc(7) int local7 = arg4 - arg1;
		@Pc(11) int local11 = arg5 - arg6;
		@Pc(32) float local32 = (float) local7 * arg3[2] + arg3[0] * (float) local11 + (float) local3 * arg3[1];
		@Pc(53) float local53 = arg3[5] * (float) local7 + arg3[4] * (float) local3 + arg3[3] * (float) local11;
		@Pc(74) float local74 = arg3[8] * (float) local7 + (float) local11 * arg3[6] + (float) local3 * arg3[7];
		@Pc(94) float local94 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(105) float local105 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(118) float local118 = (float) Math.asin((double) (local53 / local94)) / 3.1415927F + arg2 + 0.5F;
		@Pc(123) float local123;
		if (arg0 == 1) {
			local123 = local105;
			local105 = -local118;
			local118 = local123;
		} else if (arg0 == 2) {
			local118 = -local118;
			local105 = -local105;
		} else if (arg0 == 3) {
			local123 = local105;
			local105 = local118;
			local118 = -local123;
		}
		aFloat72 = local105;
		aFloat73 = local118;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(FIIIIIFF)[F")
	public static float[] method5509(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[2] = local21;
		local2[1] = 0.0F;
		local2[0] = local13;
		local2[6] = -local21;
		local2[5] = 0.0F;
		local2[8] = local13;
		local2[7] = 0.0F;
		@Pc(71) float[] local71 = new float[9];
		@Pc(73) float local73 = 1.0F;
		@Pc(75) float local75 = 0.0F;
		@Pc(80) float local80 = (float) arg1 / 32767.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local80 * local80)));
		@Pc(94) float local94 = 1.0F - local80;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2));
		if (local105 == 0.0F && local80 == 0.0F) {
			local5 = local2;
		} else {
			if (local105 != 0.0F) {
				local75 = (float) arg2 / local105;
				local73 = (float) -arg4 / local105;
			}
			local71[5] = local73 * local90;
			local71[4] = local80;
			local71[2] = local94 * local75 * local73;
			local71[0] = local94 * local73 * local73 + local80;
			local71[7] = -local73 * local90;
			local71[8] = local94 * local75 * local75 + local80;
			local71[1] = local90 * local75;
			local71[3] = local90 * -local75;
			local71[6] = local94 * local73 * local75;
			local5[0] = local2[2] * local71[6] + local2[1] * local71[3] + local71[0] * local2[0];
			local5[1] = local2[2] * local71[7] + local71[1] * local2[0] + local2[1] * local71[4];
			local5[2] = local71[2] * local2[0] + local2[1] * local71[5] + local71[8] * local2[2];
			local5[3] = local2[5] * local71[6] + local71[3] * local2[4] + local71[0] * local2[3];
			local5[4] = local71[4] * local2[4] + local2[3] * local71[1] + local71[7] * local2[5];
			local5[5] = local2[3] * local71[2] + local2[4] * local71[5] + local2[5] * local71[8];
			local5[6] = local2[8] * local71[6] + local2[6] * local71[0] + local71[3] * local2[7];
			local5[7] = local71[1] * local2[6] + local71[4] * local2[7] + local71[7] * local2[8];
			local5[8] = local2[6] * local71[2] + local2[7] * local71[5] + local71[8] * local2[8];
		}
		local5[8] *= arg5;
		local5[0] *= arg0;
		local5[7] *= arg5;
		local5[6] *= arg5;
		local5[5] *= arg6;
		local5[4] *= arg6;
		local5[2] *= arg0;
		local5[1] *= arg0;
		local5[3] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)I")
	public static int method5510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([FIFIIIBFIII)V")
	public static void method5512(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg5 - arg1;
		@Pc(7) int local7 = arg3 - arg8;
		@Pc(16) int local16 = arg4 - arg9;
		@Pc(37) float local37 = (float) local7 * arg0[0] + (float) local3 * arg0[1] + arg0[2] * (float) local16;
		@Pc(58) float local58 = arg0[4] * (float) local3 + arg0[3] * (float) local7 + arg0[5] * (float) local16;
		@Pc(79) float local79 = (float) local3 * arg0[7] + arg0[6] * (float) local7 + (float) local16 * arg0[8];
		@Pc(90) float local90 = (float) Math.atan2((double) local37, (double) local79) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local90 *= arg2;
		}
		@Pc(104) float local104 = local58 + arg6 + 0.5F;
		@Pc(111) float local111;
		if (arg7 == 1) {
			local111 = local90;
			local90 = -local104;
			local104 = local111;
		} else if (arg7 == 2) {
			local104 = -local104;
			local90 = -local90;
		} else if (arg7 == 3) {
			local111 = local90;
			local90 = local104;
			local104 = -local111;
		}
		aFloat75 = local90;
		aFloat71 = local104;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IFIFBIIIIIFI[F)V")
	public static void method5513(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(3) int local3 = arg7 - arg10;
		@Pc(7) int local7 = arg8 - arg4;
		@Pc(11) int local11 = arg2 - arg6;
		@Pc(32) float local32 = (float) local7 * arg11[2] + arg11[1] * (float) local11 + (float) local3 * arg11[0];
		@Pc(53) float local53 = (float) local7 * arg11[5] + arg11[4] * (float) local11 + (float) local3 * arg11[3];
		@Pc(74) float local74 = (float) local11 * arg11[7] + arg11[6] * (float) local3 + arg11[8] * (float) local7;
		@Pc(87) float local87;
		@Pc(94) float local94;
		if (arg0 == 0) {
			local87 = local32 + arg3 + 0.5F;
			local94 = arg1 + 0.5F - local74;
		} else if (arg0 == 1) {
			local87 = local32 + arg3 + 0.5F;
			local94 = arg1 + local74 + 0.5F;
		} else if (arg0 == 2) {
			local87 = arg3 + 0.5F - local32;
			local94 = arg9 + 0.5F - local53;
		} else if (arg0 == 3) {
			local94 = arg9 + 0.5F - local53;
			local87 = local32 + arg3 + 0.5F;
		} else if (arg0 == 4) {
			local94 = arg9 + 0.5F - local53;
			local87 = local74 + arg1 + 0.5F;
		} else {
			local87 = arg1 + 0.5F - local74;
			local94 = arg9 + 0.5F - local53;
		}
		@Pc(188) float local188;
		if (arg5 == 1) {
			local188 = local87;
			local87 = -local94;
			local94 = local188;
		} else if (arg5 == 2) {
			local94 = -local94;
			local87 = -local87;
		} else if (arg5 == 3) {
			local188 = local87;
			local87 = local94;
			local94 = -local188;
		}
		aFloat74 = local94;
		aFloat70 = local87;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([SBI)[S")
	public static short[] method5514(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) short[] local8 = new short[arg1];
		Static400.method1880(arg0, 0, local8, 0, arg1);
		return local8;
	}
}
