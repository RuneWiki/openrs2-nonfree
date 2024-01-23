import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "[Lclient!ij;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	public static int anInt3413;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
	private static int anInt3415;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "[B")
	private static byte[] aByteArray46;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	public static int anInt3417;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "[Lclient!ma;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
	private static int anInt3418;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "[Lclient!ai;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "[Lclient!ub;")
	public static Class115[] aClass115Array1;

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
	private static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
	public static int method2751(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3415) {
			local8 = 8 - anInt3415;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray46[anInt3418] >> anInt3415 & local14) << local3;
			anInt3415 = 0;
			anInt3418++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray46[anInt3418] >> anInt3415 & local8) << local3;
			anInt3415 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "([B)V")
	private static void method2753(@OriginalArg(0) byte[] arg0) {
		method2761(arg0);
		anInt3417 = 0x1 << method2751(4);
		anInt3413 = 0x1 << method2751(4);
		aFloatArray9 = new float[anInt3413];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3417 : anInt3413;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static198.method3179(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static159.method3334(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray3 = local84;
				aFloatArray8 = local136;
				anIntArray367 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray2 = local84;
				aFloatArray5 = local136;
				anIntArray365 = local185;
			}
		}
		local24 = method2751(8) + 1;
		aClass54Array1 = new Class54[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass54Array1[local28] = new Class54();
		}
		local32 = method2751(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2751(16);
		}
		@Pc(269) int local269 = method2751(6) + 1;
		aClass72Array1 = new Class72[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass72Array1[local41] = new Class72();
		}
		@Pc(290) int local290 = method2751(6) + 1;
		aClass115Array1 = new Class115[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass115Array1[local86] = new Class115();
		}
		@Pc(311) int local311 = method2751(6) + 1;
		aClass7Array1 = new Class7[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass7Array1[local138] = new Class7();
		}
		@Pc(332) int local332 = method2751(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray366 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method2754() != 0;
			method2751(16);
			method2751(16);
			anIntArray366[local191] = method2751(8);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()I")
	public static int method2754() {
		@Pc(7) int local7 = aByteArray46[anInt3418] >> anInt3415 & 0x1;
		anInt3415++;
		anInt3418 += anInt3415 >> 3;
		anInt3415 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)F")
	public static float method2757(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!pa;)Z")
	private static boolean method2759(@OriginalArg(0) Class86 arg0) {
		if (!aBoolean143) {
			@Pc(7) byte[] local7 = arg0.method3325(0, 0);
			if (local7 == null) {
				return false;
			}
			method2753(local7);
			aBoolean143 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!pa;II)Lclient!pi;")
	public static Class1_Sub23 method2760(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2759(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3325(arg1, arg2);
			return local16 == null ? null : new Class1_Sub23(local16);
		} else {
			arg0.method3329(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([BI)V")
	public static void method2761(@OriginalArg(0) byte[] arg0) {
		aByteArray46 = arg0;
		anInt3418 = 0;
		anInt3415 = 0;
	}
}
