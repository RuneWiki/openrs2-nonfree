import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!dp", name = "I", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!dp", name = "M", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!dp", name = "S", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!dp", name = "ob", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!dp", name = "ub", descriptor = "I")
	public static int anInt1496;

	@OriginalMember(owner = "client!dp", name = "vb", descriptor = "I")
	public static int anInt1497;

	@OriginalMember(owner = "client!dp", name = "Ab", descriptor = "I")
	public static int anInt1499;

	@OriginalMember(owner = "client!dp", name = "Fb", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!dp", name = "V", descriptor = "Lclient!bh;")
	public static Class14_Sub4_Sub1 aClass14_Sub4_Sub1_1 = new Class14_Sub4_Sub1(8192);

	@OriginalMember(owner = "client!dp", name = "rb", descriptor = "[I")
	public static int[] anIntArray104 = new int[1];

	@OriginalMember(owner = "client!dp", name = "sb", descriptor = "[I")
	public static final int[] anIntArray105 = new int[8];

	@OriginalMember(owner = "client!dp", name = "tb", descriptor = "[I")
	public static final int[] anIntArray106 = new int[8];

	@OriginalMember(owner = "client!dp", name = "xb", descriptor = "[I")
	public static final int[] anIntArray107 = new int[8];

	@OriginalMember(owner = "client!dp", name = "yb", descriptor = "[I")
	public static int[] anIntArray108 = new int[1];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IFFF)I")
	public static int method1456(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(22) float local22 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(31) float local31 = arg0 < 0.0F ? -arg0 : arg0;
		if (local13 < local22 && local22 > local31) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local31 > local13 && local31 > local22) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIFFIIF)[F")
	public static float[] method1457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(11) float[] local11 = new float[9];
		@Pc(14) float[] local14 = new float[9];
		@Pc(22) float local22 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local11[5] = 0.0F;
		local11[1] = 0.0F;
		local11[4] = 1.0F;
		local11[8] = local22;
		local11[0] = local22;
		local11[6] = -local30;
		local11[2] = local30;
		local11[3] = 0.0F;
		local11[7] = 0.0F;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg1 / 32767.0F;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(100) float local100 = 1.0F - local84;
		@Pc(111) float local111 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local111 == 0.0F && local84 == 0.0F) {
			local14 = local11;
		} else {
			if (local111 != 0.0F) {
				local77 = (float) -arg5 / local111;
				local79 = (float) arg4 / local111;
			}
			local75[7] = -local77 * local95;
			local75[5] = local95 * local77;
			local75[8] = local84 + local79 * local79 * local100;
			local75[1] = local79 * local95;
			local75[0] = local100 * local77 * local77 + local84;
			local75[3] = -local79 * local95;
			local75[4] = local84;
			local75[6] = local100 * local79 * local77;
			local75[2] = local79 * local77 * local100;
			local14[0] = local75[3] * local11[1] + local11[0] * local75[0] + local75[6] * local11[2];
			local14[1] = local11[2] * local75[7] + local11[0] * local75[1] + local11[1] * local75[4];
			local14[2] = local75[2] * local11[0] + local75[5] * local11[1] + local11[2] * local75[8];
			local14[3] = local75[6] * local11[5] + local75[0] * local11[3] + local11[4] * local75[3];
			local14[4] = local75[7] * local11[5] + local75[4] * local11[4] + local11[3] * local75[1];
			local14[5] = local75[5] * local11[4] + local75[2] * local11[3] + local11[5] * local75[8];
			local14[6] = local75[6] * local11[8] + local11[7] * local75[3] + local11[6] * local75[0];
			local14[7] = local75[7] * local11[8] + local75[4] * local11[7] + local11[6] * local75[1];
			local14[8] = local11[6] * local75[2] + local11[7] * local75[5] + local75[8] * local11[8];
		}
		local14[3] *= arg6;
		local14[0] *= arg3;
		local14[2] *= arg3;
		local14[1] *= arg3;
		local14[7] *= arg2;
		local14[5] *= arg6;
		local14[4] *= arg6;
		local14[6] *= arg2;
		local14[8] *= arg2;
		return local14;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([FIIIBIIIFIF)V")
	public static void method1459(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(9) int local9 = arg4 - arg1;
		@Pc(13) int local13 = arg5 - arg6;
		@Pc(17) int local17 = arg3 - arg2;
		@Pc(38) float local38 = (float) local17 * arg0[0] + arg0[1] * (float) local13 + arg0[2] * (float) local9;
		@Pc(59) float local59 = arg0[5] * (float) local9 + (float) local17 * arg0[3] + arg0[4] * (float) local13;
		@Pc(80) float local80 = arg0[6] * (float) local17 + (float) local13 * arg0[7] + arg0[8] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local91 *= arg9;
		}
		@Pc(106) float local106 = local59 + arg7 + 0.5F;
		@Pc(113) float local113;
		if (arg8 == 1) {
			local113 = local91;
			local91 = -local106;
			local106 = local113;
		} else if (arg8 == 2) {
			local91 = -local91;
			local106 = -local106;
		} else if (arg8 == 3) {
			local113 = local91;
			local91 = local106;
			local106 = -local113;
		}
		aFloat28 = local106;
		aFloat31 = local91;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIBIFI[FI)V")
	public static void method1463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg0 - arg1;
		@Pc(7) int local7 = arg3 - arg6;
		@Pc(11) int local11 = arg4 - arg8;
		@Pc(32) float local32 = (float) local3 * arg7[0] + arg7[1] * (float) local7 + arg7[2] * (float) local11;
		@Pc(53) float local53 = (float) local11 * arg7[5] + arg7[3] * (float) local3 + arg7[4] * (float) local7;
		@Pc(74) float local74 = (float) local11 * arg7[8] + arg7[7] * (float) local7 + arg7[6] * (float) local3;
		@Pc(97) float local97 = (float) Math.sqrt((double) (local74 * local74 + local53 * local53 + local32 * local32));
		@Pc(108) float local108 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(121) float local121 = (float) Math.asin((double) (local53 / local97)) / 3.1415927F + arg5 + 0.5F;
		@Pc(141) float local141;
		if (arg2 == 1) {
			local141 = local108;
			local108 = -local121;
			local121 = local141;
		} else if (arg2 == 2) {
			local121 = -local121;
			local108 = -local108;
		} else if (arg2 == 3) {
			local141 = local108;
			local108 = local121;
			local121 = -local141;
		}
		aFloat32 = local108;
		aFloat30 = local121;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method1464(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(8) byte[] local8 = new byte[arg0];
		Static358.method769(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[S)[S")
	public static short[] method1465(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(7) short[] local7 = new short[arg0];
		Static358.method765(arg1, 0, local7, 0, arg0);
		return local7;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B[FI)[F")
	public static float[] method1466(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) float[] local10 = new float[arg1];
		Static358.method764(arg0, 0, local10, 0, arg1);
		return local10;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BIIII[FFIIFIIF)V")
	public static void method1473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(3) int local3 = arg10 - arg7;
		@Pc(7) int local7 = arg0 - arg2;
		@Pc(11) int local11 = arg9 - arg1;
		@Pc(32) float local32 = arg4[2] * (float) local7 + (float) local11 * arg4[1] + (float) local3 * arg4[0];
		@Pc(53) float local53 = (float) local11 * arg4[4] + arg4[3] * (float) local3 + arg4[5] * (float) local7;
		@Pc(74) float local74 = arg4[8] * (float) local7 + arg4[6] * (float) local3 + arg4[7] * (float) local11;
		@Pc(90) float local90;
		@Pc(84) float local84;
		if (arg3 == 0) {
			local84 = arg11 + 0.5F - local74;
			local90 = arg8 + local32 + 0.5F;
		} else if (arg3 == 1) {
			local84 = arg11 + local74 + 0.5F;
			local90 = arg8 + local32 + 0.5F;
		} else if (arg3 == 2) {
			local84 = arg5 + 0.5F - local53;
			local90 = arg8 + 0.5F - local32;
		} else if (arg3 == 3) {
			local90 = local32 + arg8 + 0.5F;
			local84 = arg5 + 0.5F - local53;
		} else if (arg3 == 4) {
			local90 = local74 + arg11 + 0.5F;
			local84 = arg5 + 0.5F - local53;
		} else {
			local84 = arg5 + 0.5F - local53;
			local90 = arg11 + 0.5F - local74;
		}
		@Pc(199) float local199;
		if (arg6 == 1) {
			local199 = local90;
			local90 = -local84;
			local84 = local199;
		} else if (arg6 == 2) {
			local84 = -local84;
			local90 = -local90;
		} else if (arg6 == 3) {
			local199 = local90;
			local90 = local84;
			local84 = -local199;
		}
		aFloat29 = local84;
		aFloat33 = local90;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BII)I")
	public static int method1475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
