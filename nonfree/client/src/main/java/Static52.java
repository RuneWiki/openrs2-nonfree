import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!d", name = "x", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!d", name = "ub", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!d", name = "Bb", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!d", name = "Cb", descriptor = "I")
	public static int anInt918;

	@OriginalMember(owner = "client!d", name = "Hb", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!d", name = "Ib", descriptor = "I")
	public static int anInt920;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!jj;")
	public static Class2_Sub12_Sub1 aClass2_Sub12_Sub1_1 = new Class2_Sub12_Sub1(8192);

	@OriginalMember(owner = "client!d", name = "yb", descriptor = "[I")
	public static final int[] anIntArray82 = new int[8];

	@OriginalMember(owner = "client!d", name = "zb", descriptor = "[I")
	public static final int[] anIntArray83 = new int[8];

	@OriginalMember(owner = "client!d", name = "Ab", descriptor = "[I")
	public static int[] anIntArray84 = new int[1];

	@OriginalMember(owner = "client!d", name = "Db", descriptor = "[I")
	public static int[] anIntArray85 = new int[1];

	@OriginalMember(owner = "client!d", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray86 = new int[8];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFIFFIZ)[F")
	public static float[] method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(35) float local35 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local2[7] = 0.0F;
		local2[3] = 0.0F;
		local2[6] = -local35;
		local2[5] = 0.0F;
		local2[0] = local13;
		local2[4] = 1.0F;
		local2[8] = local13;
		local2[1] = 0.0F;
		local2[2] = local35;
		@Pc(79) float[] local79 = new float[9];
		@Pc(81) float local81 = 1.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(88) float local88 = (float) arg0 / 32767.0F;
		@Pc(92) float local92 = 1.0F - local88;
		@Pc(103) float local103 = -((float) Math.sqrt((double) (1.0F - local88 * local88)));
		@Pc(114) float local114 = (float) Math.sqrt((double) (arg6 * arg6 + arg3 * arg3));
		if (local114 == 0.0F && local88 == 0.0F) {
			local5 = local2;
		} else {
			if (local114 != 0.0F) {
				local83 = (float) arg6 / local114;
				local81 = (float) -arg3 / local114;
			}
			local79[7] = local103 * -local81;
			local79[4] = local88;
			local79[0] = local81 * local81 * local92 + local88;
			local79[1] = local83 * local103;
			local79[2] = local81 * local83 * local92;
			local79[3] = -local83 * local103;
			local79[6] = local83 * local81 * local92;
			local79[8] = local88 + local92 * local83 * local83;
			local79[5] = local103 * local81;
			local5[0] = local2[1] * local79[3] + local2[0] * local79[0] + local2[2] * local79[6];
			local5[1] = local79[7] * local2[2] + local79[4] * local2[1] + local79[1] * local2[0];
			local5[3] = local79[3] * local2[4] + local79[0] * local2[3] + local2[5] * local79[6];
			local5[2] = local79[8] * local2[2] + local2[0] * local79[2] + local2[1] * local79[5];
			local5[4] = local79[7] * local2[5] + local2[3] * local79[1] + local2[4] * local79[4];
			local5[5] = local2[4] * local79[5] + local79[2] * local2[3] + local79[8] * local2[5];
			local5[6] = local2[6] * local79[0] + local79[3] * local2[7] + local79[6] * local2[8];
			local5[7] = local79[1] * local2[6] + local79[4] * local2[7] + local2[8] * local79[7];
			local5[8] = local2[7] * local79[5] + local79[2] * local2[6] + local79[8] * local2[8];
		}
		local5[6] *= arg2;
		local5[2] *= arg5;
		local5[3] *= arg4;
		local5[7] *= arg2;
		local5[4] *= arg4;
		local5[5] *= arg4;
		local5[8] *= arg2;
		local5[0] *= arg5;
		local5[1] *= arg5;
		return local5;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI[F)[F")
	public static float[] method1133(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(7) float[] local7 = new float[arg0];
		Static369.method2583(arg1, 0, local7, 0, arg0);
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BII)I")
	public static int method1134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method1138(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(10) byte[] local10 = new byte[arg0];
		Static369.method2582(arg1, 0, local10, 0, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIFII[FIFI)V")
	public static void method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg9 - arg7;
		@Pc(7) int local7 = arg5 - arg4;
		@Pc(11) int local11 = arg0 - arg1;
		@Pc(32) float local32 = (float) local3 * arg6[0] + arg6[1] * (float) local7 + arg6[2] * (float) local11;
		@Pc(53) float local53 = (float) local11 * arg6[5] + arg6[3] * (float) local3 + arg6[4] * (float) local7;
		@Pc(74) float local74 = (float) local7 * arg6[7] + (float) local3 * arg6[6] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local85 *= arg8;
		}
		@Pc(100) float local100 = local53 + arg3 + 0.5F;
		@Pc(116) float local116;
		if (arg2 == 1) {
			local116 = local85;
			local85 = -local100;
			local100 = local116;
		} else if (arg2 == 2) {
			local100 = -local100;
			local85 = -local85;
		} else if (arg2 == 3) {
			local116 = local85;
			local85 = local100;
			local100 = -local116;
		}
		aFloat26 = local100;
		aFloat23 = local85;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFFF)I")
	public static int method1146(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(31) float local31 = arg2 < 0.0F ? -arg2 : arg2;
		if (local8 < local17 && local17 > local31) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local8 < local31 && local31 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IF[FIIIIIII)V")
	public static void method1148(@OriginalArg(1) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg4 - arg2;
		@Pc(7) int local7 = arg6 - arg7;
		@Pc(11) int local11 = arg3 - arg8;
		@Pc(32) float local32 = arg1[1] * (float) local11 + (float) local3 * arg1[0] + (float) local7 * arg1[2];
		@Pc(53) float local53 = arg1[4] * (float) local11 + arg1[3] * (float) local3 + (float) local7 * arg1[5];
		@Pc(74) float local74 = (float) local7 * arg1[8] + arg1[6] * (float) local3 + arg1[7] * (float) local11;
		@Pc(98) float local98 = (float) Math.sqrt((double) (local74 * local74 + local32 * local32 + local53 * local53));
		@Pc(109) float local109 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(122) float local122 = arg0 + (float) Math.asin((double) (local53 / local98)) / 3.1415927F + 0.5F;
		@Pc(145) float local145;
		if (arg5 == 1) {
			local145 = local109;
			local109 = -local122;
			local122 = local145;
		} else if (arg5 == 2) {
			local109 = -local109;
			local122 = -local122;
		} else if (arg5 == 3) {
			local145 = local109;
			local109 = local122;
			local122 = -local145;
		}
		aFloat27 = local109;
		aFloat22 = local122;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FI[FIIFIIIFIII)V")
	public static void method1149(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg3 - arg9;
		@Pc(7) int local7 = arg1 - arg7;
		@Pc(11) int local11 = arg11 - arg5;
		@Pc(32) float local32 = arg2[0] * (float) local11 + arg2[1] * (float) local7 + arg2[2] * (float) local3;
		@Pc(53) float local53 = (float) local3 * arg2[5] + (float) local7 * arg2[4] + (float) local11 * arg2[3];
		@Pc(74) float local74 = arg2[8] * (float) local3 + arg2[6] * (float) local11 + (float) local7 * arg2[7];
		@Pc(90) float local90;
		@Pc(84) float local84;
		if (arg10 == 0) {
			local84 = arg4 + 0.5F - local74;
			local90 = arg8 + local32 + 0.5F;
		} else if (arg10 == 1) {
			local90 = arg8 + local32 + 0.5F;
			local84 = local74 + arg4 + 0.5F;
		} else if (arg10 == 2) {
			local84 = arg0 + 0.5F - local53;
			local90 = arg8 + 0.5F - local32;
		} else if (arg10 == 3) {
			local90 = local32 + arg8 + 0.5F;
			local84 = arg0 + 0.5F - local53;
		} else if (arg10 == 4) {
			local90 = arg4 + local74 + 0.5F;
			local84 = arg0 + 0.5F - local53;
		} else {
			local84 = arg0 + 0.5F - local53;
			local90 = arg4 + 0.5F - local74;
		}
		@Pc(185) float local185;
		if (arg6 == 1) {
			local185 = local90;
			local90 = -local84;
			local84 = local185;
		} else if (arg6 == 2) {
			local90 = -local90;
			local84 = -local84;
		} else if (arg6 == 3) {
			local185 = local90;
			local90 = local84;
			local84 = -local185;
		}
		aFloat25 = local84;
		aFloat24 = local90;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[SI)[S")
	public static short[] method1151(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static369.method2578(arg1, 0, local2, 0, arg0);
		return local2;
	}
}
