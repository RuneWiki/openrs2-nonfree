import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
	public static int anInt5063;

	@OriginalMember(owner = "client!rh", name = "ub", descriptor = "Z")
	public static boolean aBoolean353;

	@OriginalMember(owner = "client!rh", name = "vb", descriptor = "I")
	public static int anInt5064;

	@OriginalMember(owner = "client!rh", name = "zb", descriptor = "I")
	public static int anInt5065;

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "Lclient!oi;")
	public static Class6_Sub10_Sub2 aClass6_Sub10_Sub2_3 = new Class6_Sub10_Sub2(8192);

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "[I")
	public static int[] anIntArray550 = new int[1];

	@OriginalMember(owner = "client!rh", name = "qb", descriptor = "[I")
	public static final int[] anIntArray551 = new int[8];

	@OriginalMember(owner = "client!rh", name = "sb", descriptor = "[I")
	public static int[] anIntArray553 = new int[1];

	@OriginalMember(owner = "client!rh", name = "yb", descriptor = "[I")
	public static final int[] anIntArray554 = new int[8];

	@OriginalMember(owner = "client!rh", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray556 = new int[8];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([BIB)[B")
	public static byte[] method4666(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static358.method954(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIF[FFII)V")
	public static void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = arg9 - arg0;
		@Pc(7) int local7 = arg2 - arg5;
		@Pc(11) int local11 = arg1 - arg4;
		@Pc(37) float local37 = arg7[0] * (float) local7 + (float) local11 * arg7[1] + arg7[2] * (float) local3;
		@Pc(58) float local58 = arg7[3] * (float) local7 + arg7[4] * (float) local11 + (float) local3 * arg7[5];
		@Pc(79) float local79 = (float) local3 * arg7[8] + arg7[6] * (float) local7 + (float) local11 * arg7[7];
		@Pc(90) float local90 = (float) Math.atan2((double) local37, (double) local79) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local90 *= arg6;
		}
		@Pc(104) float local104 = local58 + arg8 + 0.5F;
		@Pc(120) float local120;
		if (arg3 == 1) {
			local120 = local90;
			local90 = -local104;
			local104 = local120;
		} else if (arg3 == 2) {
			local90 = -local90;
			local104 = -local104;
		} else if (arg3 == 3) {
			local120 = local90;
			local90 = local104;
			local104 = -local120;
		}
		Class78_Sub2.lb = local104;
		aFloat79 = local90;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([FIIIIFIIII)V")
	public static void method4672(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg7 - arg1;
		@Pc(7) int local7 = arg6 - arg2;
		@Pc(11) int local11 = arg8 - arg3;
		@Pc(32) float local32 = (float) local7 * arg0[2] + arg0[0] * (float) local11 + arg0[1] * (float) local3;
		@Pc(53) float local53 = arg0[4] * (float) local3 + (float) local11 * arg0[3] + arg0[5] * (float) local7;
		@Pc(74) float local74 = arg0[6] * (float) local11 + (float) local3 * arg0[7] + arg0[8] * (float) local7;
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = arg4 + (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F;
		@Pc(124) float local124;
		if (arg5 == 1) {
			local124 = local100;
			local100 = -local117;
			local117 = local124;
		} else if (arg5 == 2) {
			local100 = -local100;
			local117 = -local117;
		} else if (arg5 == 3) {
			local124 = local100;
			local100 = local117;
			local117 = -local124;
		}
		aFloat81 = local117;
		aFloat80 = local100;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FIFF)I")
	public static int method4673(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(14) float local14 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(23) float local23 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(32) float local32 = arg1 < 0.0F ? -arg1 : arg1;
		if (local23 > local14 && local32 < local23) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local32 > local14 && local23 < local32) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([FIB)[F")
	public static float[] method4674(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static358.method953(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IFFIIIFI)[F")
	public static float[] method4677(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local2[0] = local13;
		local2[5] = 0.0F;
		local2[1] = 0;
		local2[3] = 0.0F;
		local2[2] = local21;
		local2[4] = 1.0F;
		local2[8] = local13;
		local2[6] = -local21;
		local2[7] = 0.0F;
		@Pc(67) float[] local67 = new float[9];
		@Pc(69) float local69 = 1.0F;
		@Pc(71) float local71 = 0.0F;
		@Pc(76) float local76 = (float) arg0 / 32767.0F;
		@Pc(87) float local87 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(91) float local91 = 1.0F - local76;
		@Pc(103) float local103 = (float) Math.sqrt((double) (arg4 * arg4 + arg5 * arg5));
		if (local103 == 0.0F && local76 == 0.0F) {
			local5 = local2;
		} else {
			if (local103 != 0.0F) {
				local71 = (float) arg4 / local103;
				local69 = (float) -arg5 / local103;
			}
			local67[0] = local76 + local91 * local69 * local69;
			local67[3] = local87 * -local71;
			local67[7] = -local69 * local87;
			local67[4] = local76;
			local67[6] = local71 * local69 * local91;
			local67[2] = local69 * local71 * local91;
			local67[5] = local87 * local69;
			local67[1] = local87 * local71;
			local67[8] = local91 * local71 * local71 + local76;
			local5[0] = local2[2] * local67[6] + local2[1] * local67[3] + local67[0] * local2[0];
			local5[1] = local67[4] * local2[1] + local2[0] * local67[1] + local67[7] * local2[2];
			local5[3] = local67[0] * local2[3] + local2[4] * local67[3] + local67[6] * local2[5];
			local5[2] = local67[8] * local2[2] + local67[5] * local2[1] + local2[0] * local67[2];
			local5[4] = local2[5] * local67[7] + local67[4] * local2[4] + local2[3] * local67[1];
			local5[5] = local2[3] * local67[2] + local67[5] * local2[4] + local67[8] * local2[5];
			local5[6] = local67[6] * local2[8] + local2[7] * local67[3] + local67[0] * local2[6];
			local5[7] = local2[8] * local67[7] + local67[4] * local2[7] + local67[1] * local2[6];
			local5[8] = local67[5] * local2[7] + local2[6] * local67[2] + local2[8] * local67[8];
		}
		local5[3] *= arg2;
		local5[4] *= arg2;
		local5[0] *= arg6;
		local5[6] *= arg1;
		local5[1] *= arg6;
		local5[2] *= arg6;
		local5[5] *= arg2;
		local5[7] *= arg1;
		local5[8] *= arg1;
		return local5;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI[FIIIIFIIIFF)V")
	public static void method4678(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float arg11) {
		@Pc(8) int local8 = arg8 - arg9;
		@Pc(12) int local12 = arg3 - arg0;
		@Pc(16) int local16 = arg7 - arg5;
		@Pc(37) float local37 = (float) local16 * arg1[2] + (float) local8 * arg1[1] + (float) local12 * arg1[0];
		@Pc(58) float local58 = (float) local8 * arg1[4] + (float) local12 * arg1[3] + arg1[5] * (float) local16;
		@Pc(79) float local79 = (float) local16 * arg1[8] + (float) local12 * arg1[6] + arg1[7] * (float) local8;
		@Pc(101) float local101;
		@Pc(108) float local108;
		if (arg2 == 0) {
			local108 = arg6 + 0.5F - local79;
			local101 = arg10 + local37 + 0.5F;
		} else if (arg2 == 1) {
			local101 = arg10 + local37 + 0.5F;
			local108 = local79 + arg6 + 0.5F;
		} else if (arg2 == 2) {
			local101 = arg10 + 0.5F - local37;
			local108 = arg11 + 0.5F - local58;
		} else if (arg2 == 3) {
			local101 = local37 + arg10 + 0.5F;
			local108 = arg11 + 0.5F - local58;
		} else if (arg2 == 4) {
			local108 = arg11 + 0.5F - local58;
			local101 = local79 + arg6 + 0.5F;
		} else {
			local108 = arg11 + 0.5F - local58;
			local101 = arg6 + 0.5F - local79;
		}
		@Pc(187) float local187;
		if (arg4 == 1) {
			local187 = local101;
			local101 = -local108;
			local108 = local187;
		} else if (arg4 == 2) {
			local108 = -local108;
			local101 = -local101;
		} else if (arg4 == 3) {
			local187 = local101;
			local101 = local108;
			local108 = -local187;
		}
		aFloat77 = local108;
		aFloat78 = local101;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([SII)[S")
	public static short[] method4679(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		Static358.method957(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BII)I")
	public static int method4680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
