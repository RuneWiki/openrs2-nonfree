import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!da", name = "C", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
	public static int anInt1417;

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "Z")
	public static boolean aBoolean105;

	@OriginalMember(owner = "client!da", name = "tb", descriptor = "I")
	public static int anInt1418;

	@OriginalMember(owner = "client!da", name = "ub", descriptor = "I")
	public static int anInt1419;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Lclient!lb;")
	public static Class4_Sub11_Sub2 aClass4_Sub11_Sub2_1 = new Class4_Sub11_Sub2(8192);

	@OriginalMember(owner = "client!da", name = "rb", descriptor = "[I")
	public static final int[] anIntArray81 = new int[8];

	@OriginalMember(owner = "client!da", name = "sb", descriptor = "[I")
	public static int[] anIntArray82 = new int[1];

	@OriginalMember(owner = "client!da", name = "wb", descriptor = "[I")
	public static final int[] anIntArray83 = new int[8];

	@OriginalMember(owner = "client!da", name = "zb", descriptor = "[I")
	public static int[] anIntArray85 = new int[1];

	@OriginalMember(owner = "client!da", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray86 = new int[8];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIFIIIIII[F)V")
	public static void method1130(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(3) int local3 = arg4 - arg5;
		@Pc(7) int local7 = arg6 - arg0;
		@Pc(11) int local11 = arg3 - arg2;
		@Pc(32) float local32 = arg8[0] * (float) local11 + arg8[1] * (float) local3 + arg8[2] * (float) local7;
		@Pc(53) float local53 = arg8[4] * (float) local3 + (float) local11 * arg8[3] + arg8[5] * (float) local7;
		@Pc(74) float local74 = arg8[6] * (float) local11 + arg8[7] * (float) local3 + arg8[8] * (float) local7;
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg1 + 0.5F;
		@Pc(120) float local120;
		if (arg7 == 1) {
			local120 = local100;
			local100 = -local113;
			local113 = local120;
		} else if (arg7 == 2) {
			local113 = -local113;
			local100 = -local100;
		} else if (arg7 == 3) {
			local120 = local100;
			local100 = local113;
			local113 = -local120;
		}
		aFloat5 = local100;
		aFloat9 = local113;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFIF)I")
	public static int method1131(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(16) float local16 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(25) float local25 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(34) float local34 = arg0 < 0.0F ? -arg0 : arg0;
		if (local25 > local16 && local25 > local34) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local34 > local16 && local25 < local34) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method1134(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static359.method761(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([FII)[F")
	public static float[] method1137(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float[] local8 = new float[arg1];
		Static359.method765(arg0, 0, local8, 0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIFFIIIFI[FII)V")
	public static void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) int arg11) {
		@Pc(3) int local3 = arg11 - arg0;
		@Pc(7) int local7 = arg2 - arg7;
		@Pc(11) int local11 = arg5 - arg6;
		@Pc(36) float local36 = (float) local11 * arg10[2] + (float) local7 * arg10[0] + (float) local3 * arg10[1];
		@Pc(57) float local57 = (float) local3 * arg10[4] + arg10[3] * (float) local7 + arg10[5] * (float) local11;
		@Pc(78) float local78 = (float) local7 * arg10[6] + (float) local3 * arg10[7] + arg10[8] * (float) local11;
		@Pc(89) float local89;
		@Pc(96) float local96;
		if (arg9 == 0) {
			local89 = local36 + arg3 + 0.5F;
			local96 = arg4 + 0.5F - local78;
		} else if (arg9 == 1) {
			local89 = local36 + arg3 + 0.5F;
			local96 = arg4 + local78 + 0.5F;
		} else if (arg9 == 2) {
			local89 = arg3 + 0.5F - local36;
			local96 = arg8 + 0.5F - local57;
		} else if (arg9 == 3) {
			local96 = arg8 + 0.5F - local57;
			local89 = arg3 + local36 + 0.5F;
		} else if (arg9 == 4) {
			local89 = arg4 + local78 + 0.5F;
			local96 = arg8 + 0.5F - local57;
		} else {
			local89 = arg4 + 0.5F - local78;
			local96 = arg8 + 0.5F - local57;
		}
		@Pc(206) float local206;
		if (arg1 == 1) {
			local206 = local89;
			local89 = -local96;
			local96 = local206;
		} else if (arg1 == 2) {
			local96 = -local96;
			local89 = -local89;
		} else if (arg1 == 3) {
			local206 = local89;
			local89 = local96;
			local96 = -local206;
		}
		aFloat6 = local89;
		aFloat7 = local96;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FIFIFIII)[F")
	public static float[] method1139(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local2[0] = local13;
		local2[2] = local21;
		local2[8] = local13;
		local2[4] = 1.0F;
		local2[7] = 0.0F;
		local2[3] = 0.0F;
		local2[5] = 0.0F;
		local2[1] = 0.0F;
		local2[6] = -local21;
		@Pc(72) float[] local72 = new float[9];
		@Pc(74) float local74 = 1.0F;
		@Pc(76) float local76 = 0.0F;
		@Pc(81) float local81 = (float) arg5 / 32767.0F;
		@Pc(85) float local85 = 1.0F - local81;
		@Pc(96) float local96 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(107) float local107 = (float) Math.sqrt((double) (arg1 * arg1 + arg6 * arg6));
		if (local107 == 0.0F && local81 == 0.0F) {
			local5 = local2;
		} else {
			if (local107 != 0.0F) {
				local74 = (float) -arg1 / local107;
				local76 = (float) arg6 / local107;
			}
			local72[0] = local85 * local74 * local74 + local81;
			local72[3] = local96 * -local76;
			local72[1] = local96 * local76;
			local72[2] = local85 * local74 * local76;
			local72[7] = -local74 * local96;
			local72[4] = local81;
			local72[6] = local76 * local74 * local85;
			local72[5] = local74 * local96;
			local72[8] = local85 * local76 * local76 + local81;
			local5[0] = local2[2] * local72[6] + local2[0] * local72[0] + local2[1] * local72[3];
			local5[1] = local2[0] * local72[1] + local72[4] * local2[1] + local72[7] * local2[2];
			local5[3] = local72[6] * local2[5] + local72[0] * local2[3] + local2[4] * local72[3];
			local5[2] = local2[0] * local72[2] + local2[1] * local72[5] + local72[8] * local2[2];
			local5[4] = local2[5] * local72[7] + local2[4] * local72[4] + local72[1] * local2[3];
			local5[6] = local72[0] * local2[6] + local72[3] * local2[7] + local2[8] * local72[6];
			local5[5] = local72[2] * local2[3] + local72[5] * local2[4] + local2[5] * local72[8];
			local5[7] = local72[1] * local2[6] + local2[7] * local72[4] + local72[7] * local2[8];
			local5[8] = local72[5] * local2[7] + local2[6] * local72[2] + local2[8] * local72[8];
		}
		local5[6] *= arg2;
		local5[7] *= arg2;
		local5[0] *= arg0;
		local5[2] *= arg0;
		local5[1] *= arg0;
		local5[5] *= arg4;
		local5[4] *= arg4;
		local5[8] *= arg2;
		local5[3] *= arg4;
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[SI)[S")
	public static short[] method1142(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		Static359.method762(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([FIIFIIIIIFI)V")
	public static void method1144(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg7 - arg2;
		@Pc(7) int local7 = arg9 - arg6;
		@Pc(11) int local11 = arg4 - arg1;
		@Pc(32) float local32 = (float) local11 * arg0[0] + arg0[1] * (float) local3 + arg0[2] * (float) local7;
		@Pc(53) float local53 = arg0[5] * (float) local7 + arg0[4] * (float) local3 + arg0[3] * (float) local11;
		@Pc(74) float local74 = (float) local11 * arg0[6] + arg0[7] * (float) local3 + arg0[8] * (float) local7;
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local85 *= arg8;
		}
		@Pc(100) float local100 = arg3 + local53 + 0.5F;
		@Pc(118) float local118;
		if (arg5 == 1) {
			local118 = local85;
			local85 = -local100;
			local100 = local118;
		} else if (arg5 == 2) {
			local85 = -local85;
			local100 = -local100;
		} else if (arg5 == 3) {
			local118 = local85;
			local85 = local100;
			local100 = -local118;
		}
		aFloat8 = local100;
		aFloat4 = local85;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(III)I")
	public static int method1145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
