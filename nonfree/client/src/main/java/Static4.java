import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
	public static int anInt178;

	@OriginalMember(owner = "client!ad", name = "zb", descriptor = "I")
	public static int anInt180;

	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
	public static int anInt181;

	@OriginalMember(owner = "client!ad", name = "Cb", descriptor = "Z")
	public static boolean aBoolean10;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!bp;")
	public static Class1_Sub7_Sub1 aClass1_Sub7_Sub1_1 = new Class1_Sub7_Sub1(8192);

	@OriginalMember(owner = "client!ad", name = "tb", descriptor = "[I")
	public static final int[] anIntArray15 = new int[8];

	@OriginalMember(owner = "client!ad", name = "ub", descriptor = "[I")
	public static int[] anIntArray16 = new int[1];

	@OriginalMember(owner = "client!ad", name = "xb", descriptor = "[I")
	public static final int[] anIntArray17 = new int[8];

	@OriginalMember(owner = "client!ad", name = "yb", descriptor = "[I")
	public static final int[] anIntArray18 = new int[8];

	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "[I")
	public static int[] anIntArray19 = new int[1];

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IBI)I")
	public static int method226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[B)[B")
	public static byte[] method227(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(8) byte[] local8 = new byte[arg0];
		Static374.method2826(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([FII)[F")
	public static float[] method228(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static374.method2830(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([FIFIIFIIIIFII)V")
	public static void method234(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float arg10, @OriginalArg(11) int arg11) {
		@Pc(3) int local3 = arg4 - arg11;
		@Pc(7) int local7 = arg7 - arg3;
		@Pc(11) int local11 = arg8 - arg1;
		@Pc(32) float local32 = (float) local7 * arg0[2] + (float) local3 * arg0[1] + (float) local11 * arg0[0];
		@Pc(53) float local53 = (float) local11 * arg0[3] + arg0[4] * (float) local3 + arg0[5] * (float) local7;
		@Pc(74) float local74 = arg0[7] * (float) local3 + arg0[6] * (float) local11 + (float) local7 * arg0[8];
		@Pc(94) float local94;
		@Pc(88) float local88;
		if (arg9 == 0) {
			local94 = local32 + arg10 + 0.5F;
			local88 = arg5 + 0.5F - local74;
		} else if (arg9 == 1) {
			local88 = arg5 + local74 + 0.5F;
			local94 = arg10 + local32 + 0.5F;
		} else if (arg9 == 2) {
			local94 = arg10 + 0.5F - local32;
			local88 = arg2 + 0.5F - local53;
		} else if (arg9 == 3) {
			local94 = local32 + arg10 + 0.5F;
			local88 = arg2 + 0.5F - local53;
		} else if (arg9 == 4) {
			local88 = arg2 + 0.5F - local53;
			local94 = arg5 + local74 + 0.5F;
		} else {
			local94 = arg5 + 0.5F - local74;
			local88 = arg2 + 0.5F - local53;
		}
		@Pc(186) float local186;
		if (arg6 == 1) {
			local186 = local94;
			local94 = -local88;
			local88 = local186;
		} else if (arg6 == 2) {
			local94 = -local94;
			local88 = -local88;
		} else if (arg6 == 3) {
			local186 = local94;
			local94 = local88;
			local88 = -local186;
		}
		aFloat4 = local88;
		aFloat1 = local94;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFIF)I")
	public static int method237(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(25) float local25 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(34) float local34 = arg1 < 0.0F ? -arg1 : arg1;
		if (local25 > local8 && local34 < local25) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local8 < local34 && local34 > local25) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([SIB)[S")
	public static short[] method241(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(10) short[] local10 = new short[arg1];
		Static374.method2827(arg0, 0, local10, 0, arg1);
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IFIIIII[FII)V")
	public static void method243(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg5 - arg8;
		@Pc(7) int local7 = arg3 - arg2;
		@Pc(11) int local11 = arg0 - arg4;
		@Pc(37) float local37 = (float) local7 * arg7[2] + arg7[1] * (float) local11 + (float) local3 * arg7[0];
		@Pc(58) float local58 = arg7[5] * (float) local7 + arg7[4] * (float) local11 + (float) local3 * arg7[3];
		@Pc(79) float local79 = (float) local11 * arg7[7] + (float) local3 * arg7[6] + (float) local7 * arg7[8];
		@Pc(94) float local94 = (float) Math.sqrt((double) (local79 * local79 + local58 * local58 + local37 * local37));
		@Pc(105) float local105 = (float) Math.atan2((double) local37, (double) local79) / 6.2831855F + 0.5F;
		@Pc(118) float local118 = (float) Math.asin((double) (local58 / local94)) / 3.1415927F + arg1 + 0.5F;
		@Pc(125) float local125;
		if (arg6 == 1) {
			local125 = local105;
			local105 = -local118;
			local118 = local125;
		} else if (arg6 == 2) {
			local118 = -local118;
			local105 = -local105;
		} else if (arg6 == 3) {
			local125 = local105;
			local105 = local118;
			local118 = -local125;
		}
		aFloat6 = local118;
		aFloat3 = local105;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIFIZFF)[F")
	public static float[] method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local2[6] = -local21;
		local2[5] = 0.0F;
		local2[8] = local13;
		local2[0] = local13;
		local2[4] = 1.0F;
		local2[3] = 0.0F;
		local2[7] = 0.0F;
		local2[2] = local21;
		local2[1] = 0.0F;
		@Pc(71) float[] local71 = new float[9];
		@Pc(73) float local73 = 1.0F;
		@Pc(75) float local75 = 0.0F;
		@Pc(80) float local80 = (float) arg1 / 32767.0F;
		@Pc(91) float local91 = -((float) Math.sqrt((double) (1.0F - local80 * local80)));
		@Pc(96) float local96 = 1.0F - local80;
		@Pc(107) float local107 = (float) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4));
		if (local107 == 0.0F && local80 == 0.0F) {
			local5 = local2;
		} else {
			if (local107 != 0.0F) {
				local73 = (float) -arg0 / local107;
				local75 = (float) arg4 / local107;
			}
			local71[0] = local73 * local73 * local96 + local80;
			local71[1] = local75 * local91;
			local71[6] = local73 * local75 * local96;
			local71[2] = local75 * local73 * local96;
			local71[3] = -local75 * local91;
			local71[5] = local73 * local91;
			local71[8] = local80 + local96 * local75 * local75;
			local71[4] = local80;
			local71[7] = -local73 * local91;
			local5[0] = local2[2] * local71[6] + local2[0] * local71[0] + local2[1] * local71[3];
			local5[1] = local71[4] * local2[1] + local71[1] * local2[0] + local2[2] * local71[7];
			local5[2] = local71[2] * local2[0] + local71[5] * local2[1] + local71[8] * local2[2];
			local5[3] = local2[5] * local71[6] + local71[3] * local2[4] + local2[3] * local71[0];
			local5[4] = local2[5] * local71[7] + local71[4] * local2[4] + local71[1] * local2[3];
			local5[6] = local71[6] * local2[8] + local71[3] * local2[7] + local2[6] * local71[0];
			local5[5] = local71[8] * local2[5] + local2[3] * local71[2] + local71[5] * local2[4];
			local5[7] = local2[8] * local71[7] + local71[1] * local2[6] + local71[4] * local2[7];
			local5[8] = local2[8] * local71[8] + local2[6] * local71[2] + local2[7] * local71[5];
		}
		local5[8] *= arg5;
		local5[1] *= arg6;
		local5[2] *= arg6;
		local5[3] *= arg3;
		local5[7] *= arg5;
		local5[6] *= arg5;
		local5[5] *= arg3;
		local5[0] *= arg6;
		local5[4] *= arg3;
		return local5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[FFFIIIIII)V")
	public static void method245(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg4 - arg9;
		@Pc(7) int local7 = arg8 - arg5;
		@Pc(11) int local11 = arg6 - arg0;
		@Pc(32) float local32 = arg1[0] * (float) local11 + arg1[1] * (float) local7 + arg1[2] * (float) local3;
		@Pc(53) float local53 = arg1[5] * (float) local3 + arg1[3] * (float) local11 + (float) local7 * arg1[4];
		@Pc(74) float local74 = (float) local11 * arg1[6] + (float) local7 * arg1[7] + (float) local3 * arg1[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local85 *= arg2;
		}
		@Pc(107) float local107 = arg3 + local53 + 0.5F;
		@Pc(114) float local114;
		if (arg7 == 1) {
			local114 = local85;
			local85 = -local107;
			local107 = local114;
		} else if (arg7 == 2) {
			local85 = -local85;
			local107 = -local107;
		} else if (arg7 == 3) {
			local114 = local85;
			local85 = local107;
			local107 = -local114;
		}
		aFloat2 = local107;
		aFloat5 = local85;
	}
}
