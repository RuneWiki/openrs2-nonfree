import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!fu", name = "y", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!fu", name = "L", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!fu", name = "db", descriptor = "Z")
	public static boolean aBoolean165;

	@OriginalMember(owner = "client!fu", name = "hb", descriptor = "I")
	public static int anInt1957;

	@OriginalMember(owner = "client!fu", name = "ib", descriptor = "I")
	public static int anInt1958;

	@OriginalMember(owner = "client!fu", name = "sb", descriptor = "I")
	public static int anInt1959;

	@OriginalMember(owner = "client!fu", name = "R", descriptor = "Lclient!ob;")
	public static Class1_Sub33_Sub1 aClass1_Sub33_Sub1_1 = new Class1_Sub33_Sub1(8192);

	@OriginalMember(owner = "client!fu", name = "gb", descriptor = "[I")
	public static int[] anIntArray250 = new int[1];

	@OriginalMember(owner = "client!fu", name = "nb", descriptor = "[I")
	public static int[] anIntArray252 = new int[1];

	@OriginalMember(owner = "client!fu", name = "tb", descriptor = "[I")
	public static final int[] anIntArray253 = new int[8];

	@OriginalMember(owner = "client!fu", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray254 = new int[8];

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([FBI)[F")
	public static float[] method1609(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static404.method4341(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(F[FBIIIIFIII)V")
	public static void method1616(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg4 - arg7;
		@Pc(12) int local12 = arg9 - arg8;
		@Pc(16) int local16 = arg3 - arg5;
		@Pc(37) float local37 = arg1[2] * (float) local16 + (float) local3 * arg1[0] + arg1[1] * (float) local12;
		@Pc(58) float local58 = (float) local16 * arg1[5] + (float) local12 * arg1[4] + arg1[3] * (float) local3;
		@Pc(79) float local79 = (float) local3 * arg1[6] + arg1[7] * (float) local12 + (float) local16 * arg1[8];
		@Pc(90) float local90 = (float) Math.atan2((double) local37, (double) local79) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local90 *= arg0;
		}
		@Pc(105) float local105 = local58 + arg6 + 0.5F;
		@Pc(112) float local112;
		if (arg2 == 1) {
			local112 = local90;
			local90 = -local105;
			local105 = local112;
		} else if (arg2 == 2) {
			local105 = -local105;
			local90 = -local90;
		} else if (arg2 == 3) {
			local112 = local90;
			local90 = local105;
			local105 = -local112;
		}
		aFloat7 = local90;
		aFloat9 = local105;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIZIFIII[F)V")
	public static void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(3) int local3 = arg5 - arg1;
		@Pc(11) int local11 = arg6 - arg3;
		@Pc(15) int local15 = arg0 - arg2;
		@Pc(36) float local36 = (float) local15 * arg8[1] + (float) local11 * arg8[0] + arg8[2] * (float) local3;
		@Pc(57) float local57 = (float) local11 * arg8[3] + (float) local15 * arg8[4] + (float) local3 * arg8[5];
		@Pc(78) float local78 = (float) local3 * arg8[8] + arg8[6] * (float) local11 + (float) local15 * arg8[7];
		@Pc(93) float local93 = (float) Math.sqrt((double) (local57 * local57 + local36 * local36 + local78 * local78));
		@Pc(104) float local104 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = arg4 + (float) Math.asin((double) (local57 / local93)) / 3.1415927F + 0.5F;
		@Pc(124) float local124;
		if (arg7 == 1) {
			local124 = local104;
			local104 = -local117;
			local117 = local124;
		} else if (arg7 == 2) {
			local104 = -local104;
			local117 = -local117;
		} else if (arg7 == 3) {
			local124 = local104;
			local104 = local117;
			local117 = -local124;
		}
		aFloat6 = local117;
		aFloat8 = local104;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII[FIIFIIFBF)V")
	public static void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float arg10, @OriginalArg(12) float arg11) {
		@Pc(3) int local3 = arg5 - arg2;
		@Pc(7) int local7 = arg9 - arg8;
		@Pc(11) int local11 = arg3 - arg0;
		@Pc(32) float local32 = arg4[2] * (float) local7 + (float) local3 * arg4[0] + (float) local11 * arg4[1];
		@Pc(53) float local53 = arg4[5] * (float) local7 + arg4[3] * (float) local3 + arg4[4] * (float) local11;
		@Pc(74) float local74 = (float) local11 * arg4[7] + arg4[6] * (float) local3 + (float) local7 * arg4[8];
		@Pc(108) float local108;
		@Pc(102) float local102;
		if (arg1 == 0) {
			local102 = arg7 + 0.5F - local74;
			local108 = arg10 + local32 + 0.5F;
		} else if (arg1 == 1) {
			local108 = local32 + arg10 + 0.5F;
			local102 = arg7 + local74 + 0.5F;
		} else if (arg1 == 2) {
			local108 = arg10 + 0.5F - local32;
			local102 = arg11 + 0.5F - local53;
		} else if (arg1 == 3) {
			local102 = arg11 + 0.5F - local53;
			local108 = arg10 + local32 + 0.5F;
		} else if (arg1 == 4) {
			local102 = arg11 + 0.5F - local53;
			local108 = local74 + arg7 + 0.5F;
		} else {
			local108 = arg7 + 0.5F - local74;
			local102 = arg11 + 0.5F - local53;
		}
		@Pc(198) float local198;
		if (arg6 == 1) {
			local198 = local108;
			local108 = -local102;
			local102 = local198;
		} else if (arg6 == 2) {
			local108 = -local108;
			local102 = -local102;
		} else if (arg6 == 3) {
			local198 = local108;
			local108 = local102;
			local102 = -local198;
		}
		aFloat5 = local108;
		aFloat4 = local102;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method1624(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(2) byte[] local2 = new byte[arg0];
		Static404.method4337(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[SI)[S")
	public static short[] method1625(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(2) short[] local2 = new short[arg0];
		Static404.method4342(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(FIFIIFII)[F")
	public static float[] method1626(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local2[1] = 0.0F;
		local2[7] = 0.0F;
		local2[8] = local13;
		local2[4] = 1.0F;
		local2[0] = local13;
		local2[6] = -local21;
		local2[3] = 0.0F;
		local2[5] = 0.0F;
		local2[2] = local21;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(70) float local70 = 0.0F;
		@Pc(75) float local75 = (float) arg6 / 32767.0F;
		@Pc(80) float local80 = 1.0F - local75;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local75 * local75)));
		@Pc(101) float local101 = (float) Math.sqrt((double) (arg3 * arg3 + arg1 * arg1));
		if (local101 == 0.0F && local75 == 0.0F) {
			local5 = local2;
		} else {
			if (local101 != 0.0F) {
				local68 = (float) -arg3 / local101;
				local70 = (float) arg1 / local101;
			}
			local66[5] = local68 * local90;
			local66[3] = -local70 * local90;
			local66[0] = local75 + local68 * local68 * local80;
			local66[8] = local75 + local70 * local70 * local80;
			local66[6] = local80 * local68 * local70;
			local66[4] = local75;
			local66[1] = local90 * local70;
			local66[2] = local80 * local70 * local68;
			local66[7] = local90 * -local68;
			local5[0] = local66[0] * local2[0] + local2[1] * local66[3] + local66[6] * local2[2];
			local5[1] = local66[7] * local2[2] + local66[1] * local2[0] + local66[4] * local2[1];
			local5[3] = local2[4] * local66[3] + local66[0] * local2[3] + local2[5] * local66[6];
			local5[2] = local66[8] * local2[2] + local66[5] * local2[1] + local2[0] * local66[2];
			local5[4] = local66[4] * local2[4] + local66[1] * local2[3] + local2[5] * local66[7];
			local5[5] = local66[8] * local2[5] + local2[3] * local66[2] + local2[4] * local66[5];
			local5[6] = local66[0] * local2[6] + local66[3] * local2[7] + local2[8] * local66[6];
			local5[7] = local2[8] * local66[7] + local2[6] * local66[1] + local2[7] * local66[4];
			local5[8] = local66[8] * local2[8] + local66[5] * local2[7] + local2[6] * local66[2];
		}
		local5[4] *= arg0;
		local5[8] *= arg2;
		local5[0] *= arg5;
		local5[7] *= arg2;
		local5[1] *= arg5;
		local5[2] *= arg5;
		local5[3] *= arg0;
		local5[5] *= arg0;
		local5[6] *= arg2;
		return local5;
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(III)I")
	public static int method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(FZFF)I")
	public static int method1628(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		if (local8 < local21 && local21 > local30) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local8 < local30 && local30 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
