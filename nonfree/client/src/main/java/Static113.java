import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
	private static int anInt2210;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "[I")
	public static int[] anIntArray151;

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
	public static int anInt2211;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "[Lclient!tr;")
	public static Class355[] aClass355Array1;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
	private static int anInt2213;

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!eaa", name = "x", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "[B")
	private static byte[] aByteArray28;

	@OriginalMember(owner = "client!eaa", name = "B", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!eaa", name = "G", descriptor = "[Lclient!vd;")
	public static Class370[] aClass370Array1;

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "[Lclient!aga;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "[Lclient!iu;")
	public static Class171[] aClass171Array1;

	@OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
	public static int anInt2217;

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "Z")
	private static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([BI)V")
	public static void method2129(@OriginalArg(0) byte[] arg0) {
		aByteArray28 = arg0;
		anInt2210 = 0;
		anInt2213 = 0;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "()I")
	public static int method2133() {
		@Pc(7) int local7 = aByteArray28[anInt2210] >> anInt2213 & 0x1;
		anInt2213++;
		anInt2210 += anInt2213 >> 3;
		anInt2213 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!bt;)Z")
	private static boolean method2134(@OriginalArg(0) Class34 arg0) {
		if (!aBoolean149) {
			@Pc(7) byte[] local7 = arg0.method1239(0, 0);
			if (local7 == null) {
				return false;
			}
			method2140(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!bt;I)Lclient!eaa;")
	public static Class4_Sub16 method2135(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		if (method2134(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1255(arg1);
			return local14 == null ? null : new Class4_Sub16(local14);
		} else {
			arg0.method1235(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)I")
	public static int method2136(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2213) {
			local8 = 8 - anInt2213;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray28[anInt2210] >> anInt2213 & local14) << local3;
			anInt2213 = 0;
			anInt2210++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray28[anInt2210] >> anInt2213 & local8) << local3;
			anInt2213 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)F")
	public static float method2138(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!bt;II)Lclient!eaa;")
	public static Class4_Sub16 method2139(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2134(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1239(arg1, arg2);
			return local16 == null ? null : new Class4_Sub16(local16);
		} else {
			arg0.method1245(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "([B)V")
	private static void method2140(@OriginalArg(0) byte[] arg0) {
		method2129(arg0);
		anInt2217 = 0x1 << method2136(4);
		anInt2211 = 0x1 << method2136(4);
		aFloatArray13 = new float[anInt2211];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2217 : anInt2211;
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
			local191 = Static214.method3192(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static339.method4624(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray10 = local39;
				aFloatArray8 = local84;
				aFloatArray15 = local136;
				anIntArray150 = local185;
			} else {
				aFloatArray9 = local39;
				aFloatArray11 = local84;
				aFloatArray12 = local136;
				anIntArray152 = local185;
			}
		}
		local24 = method2136(8) + 1;
		aClass11Array1 = new Class11[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass11Array1[local28] = new Class11();
		}
		local32 = method2136(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2136(16);
		}
		@Pc(269) int local269 = method2136(6) + 1;
		aClass370Array1 = new Class370[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass370Array1[local41] = new Class370();
		}
		@Pc(290) int local290 = method2136(6) + 1;
		aClass171Array1 = new Class171[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass171Array1[local86] = new Class171();
		}
		@Pc(311) int local311 = method2136(6) + 1;
		aClass355Array1 = new Class355[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass355Array1[local138] = new Class355();
		}
		@Pc(332) int local332 = method2136(6) + 1;
		aBooleanArray5 = new boolean[local332];
		anIntArray151 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray5[local191] = method2133() != 0;
			method2136(16);
			method2136(16);
			anIntArray151[local191] = method2136(8);
		}
		aBoolean149 = true;
	}
}
