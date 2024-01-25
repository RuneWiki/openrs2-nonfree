import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "[Lclient!bc;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "[F")
	public static float[] aFloatArray70;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "[Lclient!nv;")
	public static Class247[] aClass247Array1;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
	private static int anInt8180;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "[Lclient!lu;")
	public static Class218[] aClass218Array1;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "[I")
	public static int[] anIntArray598;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "[B")
	private static byte[] aByteArray86;

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "[F")
	public static float[] aFloatArray73;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
	private static int anInt8185;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "[F")
	public static float[] aFloatArray75;

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "[F")
	public static float[] aFloatArray76;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "[I")
	public static int[] anIntArray599;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
	public static int anInt8186;

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
	public static int anInt8187;

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "[F")
	public static float[] aFloatArray77;

	@OriginalMember(owner = "client!rm", name = "Q", descriptor = "[Lclient!sj;")
	public static Class316[] aClass316Array1;

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "Z")
	private static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([BI)V")
	public static void method7031(@OriginalArg(0) byte[] arg0) {
		aByteArray86 = arg0;
		anInt8185 = 0;
		anInt8180 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!nd;)Z")
	private static boolean method7033(@OriginalArg(0) Class238 arg0) {
		if (!aBoolean597) {
			@Pc(7) byte[] local7 = arg0.method5567(0, 0);
			if (local7 == null) {
				return false;
			}
			method7036(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!nd;I)Lclient!rm;")
	public static Class2_Sub38 method7034(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1) {
		if (method7033(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5580(arg1);
			return local14 == null ? null : new Class2_Sub38(local14);
		} else {
			arg0.method5568(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "([B)V")
	private static void method7036(@OriginalArg(0) byte[] arg0) {
		method7031(arg0);
		anInt8187 = 0x1 << method7039(4);
		anInt8186 = 0x1 << method7039(4);
		aFloatArray77 = new float[anInt8186];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt8187 : anInt8186;
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
			local191 = Static138.method2523(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static367.method5450(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray70 = local39;
				aFloatArray72 = local84;
				aFloatArray76 = local136;
				anIntArray599 = local185;
			} else {
				aFloatArray73 = local39;
				aFloatArray75 = local84;
				aFloatArray71 = local136;
				anIntArray598 = local185;
			}
		}
		local24 = method7039(8) + 1;
		aClass316Array1 = new Class316[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass316Array1[local28] = new Class316();
		}
		local32 = method7039(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7039(16);
		}
		@Pc(269) int local269 = method7039(6) + 1;
		aClass218Array1 = new Class218[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass218Array1[local41] = new Class218();
		}
		@Pc(290) int local290 = method7039(6) + 1;
		aClass247Array1 = new Class247[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass247Array1[local86] = new Class247();
		}
		@Pc(311) int local311 = method7039(6) + 1;
		aClass30Array1 = new Class30[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass30Array1[local138] = new Class30();
		}
		@Pc(332) int local332 = method7039(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray597 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method7041() != 0;
			method7039(16);
			method7039(16);
			anIntArray597[local191] = method7039(8);
		}
		aBoolean597 = true;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)F")
	public static float method7037(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!nd;II)Lclient!rm;")
	public static Class2_Sub38 method7038(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7033(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5567(arg2, arg1);
			return local16 == null ? null : new Class2_Sub38(local16);
		} else {
			arg0.method5571(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)I")
	public static int method7039(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt8180) {
			local8 = 8 - anInt8180;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray86[anInt8185] >> anInt8180 & local14) << local3;
			anInt8180 = 0;
			anInt8185++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray86[anInt8185] >> anInt8180 & local8) << local3;
			anInt8180 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "()I")
	public static int method7041() {
		@Pc(7) int local7 = aByteArray86[anInt8185] >> anInt8180 & 0x1;
		anInt8180++;
		anInt8185 += anInt8180 >> 3;
		anInt8180 &= 0x7;
		return local7;
	}
}
