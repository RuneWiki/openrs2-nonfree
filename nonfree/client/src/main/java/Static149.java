import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!jn", name = "I", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!jn", name = "Q", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!jn", name = "nb", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!jn", name = "qb", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!jn", name = "rb", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!jn", name = "sb", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!jn", name = "Ab", descriptor = "Z")
	public static boolean aBoolean219;

	@OriginalMember(owner = "client!jn", name = "Cb", descriptor = "I")
	public static int anInt3056;

	@OriginalMember(owner = "client!jn", name = "Fb", descriptor = "I")
	public static int anInt3057;

	@OriginalMember(owner = "client!jn", name = "Gb", descriptor = "I")
	public static int anInt3058;

	@OriginalMember(owner = "client!jn", name = "W", descriptor = "Lclient!fe;")
	public static Class5_Sub1_Sub2 aClass5_Sub1_Sub2_2 = new Class5_Sub1_Sub2(8192);

	@OriginalMember(owner = "client!jn", name = "yb", descriptor = "[I")
	public static final int[] anIntArray208 = new int[8];

	@OriginalMember(owner = "client!jn", name = "zb", descriptor = "[I")
	public static final int[] anIntArray209 = new int[8];

	@OriginalMember(owner = "client!jn", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray210 = new int[8];

	@OriginalMember(owner = "client!jn", name = "Db", descriptor = "[I")
	public static int[] anIntArray211 = new int[1];

	@OriginalMember(owner = "client!jn", name = "Eb", descriptor = "[I")
	public static int[] anIntArray212 = new int[1];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([BIB)[B")
	public static byte[] method2851(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static359.method756(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([FII)[F")
	public static float[] method2852(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static359.method759(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IFIIIFIIIII[FF)V")
	public static void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) float arg11) {
		@Pc(3) int local3 = arg3 - arg8;
		@Pc(7) int local7 = arg6 - arg5;
		@Pc(11) int local11 = arg0 - arg9;
		@Pc(32) float local32 = (float) local3 * arg10[0] + arg10[1] * (float) local7 + (float) local11 * arg10[2];
		@Pc(53) float local53 = (float) local11 * arg10[5] + arg10[3] * (float) local3 + (float) local7 * arg10[4];
		@Pc(78) float local78 = arg10[8] * (float) local11 + (float) local7 * arg10[7] + (float) local3 * arg10[6];
		@Pc(107) float local107;
		@Pc(101) float local101;
		if (arg2 == 0) {
			local101 = arg4 + 0.5F - local78;
			local107 = arg11 + local32 + 0.5F;
		} else if (arg2 == 1) {
			local107 = local32 + arg11 + 0.5F;
			local101 = local78 + arg4 + 0.5F;
		} else if (arg2 == 2) {
			local101 = arg1 + 0.5F - local53;
			local107 = arg11 + 0.5F - local32;
		} else if (arg2 == 3) {
			local101 = arg1 + 0.5F - local53;
			local107 = arg11 + local32 + 0.5F;
		} else if (arg2 == 4) {
			local107 = arg4 + local78 + 0.5F;
			local101 = arg1 + 0.5F - local53;
		} else {
			local107 = arg4 + 0.5F - local78;
			local101 = arg1 + 0.5F - local53;
		}
		@Pc(196) float local196;
		if (arg7 == 1) {
			local196 = local107;
			local107 = -local101;
			local101 = local196;
		} else if (arg7 == 2) {
			local107 = -local107;
			local101 = -local101;
		} else if (arg7 == 3) {
			local196 = local107;
			local107 = local101;
			local101 = -local196;
		}
		aFloat37 = local107;
		aFloat38 = local101;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIFIIFIF)[F")
	public static float[] method2858(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local2[7] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[8] = local13;
		local2[0] = local13;
		local2[6] = -local21;
		local2[2] = local21;
		local2[1] = 0.0F;
		local2[3] = 0.0F;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg5 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg3 * arg3));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local69 = (float) arg3 / local99;
				local67 = (float) -arg0 / local99;
			}
			local65[0] = local74 + local88 * local67 * local67;
			local65[5] = local67 * local84;
			local65[2] = local67 * local69 * local88;
			local65[1] = local84 * local69;
			local65[4] = local74;
			local65[6] = local88 * local67 * local69;
			local65[3] = local84 * -local69;
			local65[7] = local84 * -local67;
			local65[8] = local88 * local69 * local69 + local74;
			local5[0] = local65[3] * local2[1] + local2[0] * local65[0] + local2[2] * local65[6];
			local5[1] = local65[4] * local2[1] + local65[1] * local2[0] + local65[7] * local2[2];
			local5[2] = local2[1] * local65[5] + local2[0] * local65[2] + local2[2] * local65[8];
			local5[3] = local65[0] * local2[3] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local65[4] * local2[4] + local65[1] * local2[3] + local65[7] * local2[5];
			local5[6] = local65[6] * local2[8] + local65[3] * local2[7] + local2[6] * local65[0];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local65[8] * local2[5];
			local5[7] = local2[8] * local65[7] + local65[1] * local2[6] + local2[7] * local65[4];
			local5[8] = local2[8] * local65[8] + local2[7] * local65[5] + local65[2] * local2[6];
		}
		local5[7] *= arg4;
		local5[6] *= arg4;
		local5[4] *= arg1;
		local5[0] *= arg6;
		local5[1] *= arg6;
		local5[2] *= arg6;
		local5[5] *= arg1;
		local5[8] *= arg4;
		local5[3] *= arg1;
		return local5;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBFIIFIIII[F)V")
	public static void method2860(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(3) int local3 = arg6 - arg7;
		@Pc(7) int local7 = arg3 - arg0;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = arg9[0] * (float) local11 + arg9[1] * (float) local3 + arg9[2] * (float) local7;
		@Pc(53) float local53 = arg9[5] * (float) local7 + (float) local11 * arg9[3] + (float) local3 * arg9[4];
		@Pc(74) float local74 = arg9[8] * (float) local7 + (float) local11 * arg9[6] + (float) local3 * arg9[7];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local85 *= arg4;
		}
		@Pc(107) float local107 = local53 + arg1 + 0.5F;
		@Pc(122) float local122;
		if (arg8 == 1) {
			local122 = local85;
			local85 = -local107;
			local107 = local122;
		} else if (arg8 == 2) {
			local107 = -local107;
			local85 = -local85;
		} else if (arg8 == 3) {
			local122 = local85;
			local85 = local107;
			local107 = -local122;
		}
		aFloat40 = local85;
		aFloat36 = local107;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[SB)[S")
	public static short[] method2862(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(8) short[] local8 = new short[arg0];
		Static359.method753(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)I")
	public static int method2863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(FFFB)I")
	public static int method2864(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local17 < local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIFIBIIII[F)V")
	public static void method2870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(3) int local3 = arg5 - arg6;
		@Pc(7) int local7 = arg3 - arg4;
		@Pc(11) int local11 = arg1 - arg0;
		@Pc(37) float local37 = (float) local7 * arg8[1] + arg8[0] * (float) local11 + arg8[2] * (float) local3;
		@Pc(58) float local58 = arg8[5] * (float) local3 + (float) local11 * arg8[3] + arg8[4] * (float) local7;
		@Pc(79) float local79 = arg8[8] * (float) local3 + arg8[6] * (float) local11 + (float) local7 * arg8[7];
		@Pc(94) float local94 = (float) Math.sqrt((double) (local37 * local37 + local58 * local58 + local79 * local79));
		@Pc(105) float local105 = (float) Math.atan2((double) local37, (double) local79) / 6.2831855F + 0.5F;
		@Pc(118) float local118 = (float) Math.asin((double) (local58 / local94)) / 3.1415927F + arg2 + 0.5F;
		@Pc(139) float local139;
		if (arg7 == 1) {
			local139 = local105;
			local105 = -local118;
			local118 = local139;
		} else if (arg7 == 2) {
			local105 = -local105;
			local118 = -local118;
		} else if (arg7 == 3) {
			local139 = local105;
			local105 = local118;
			local118 = -local139;
		}
		aFloat39 = local118;
		aFloat35 = local105;
	}
}
