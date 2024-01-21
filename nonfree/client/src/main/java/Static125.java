import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public static int anInt2902;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "[Lclient!jd;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "[Lclient!fd;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "[Lclient!cb;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "[B")
	private static byte[] aByteArray30;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
	private static int anInt2903;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "[Lclient!rb;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
	private static int anInt2909;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "Z")
	private static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([B)V")
	private static void method1939(@OriginalArg(0) byte[] arg0) {
		method1945(arg0);
		anInt2902 = 0x1 << method1948(4);
		anInt2900 = 0x1 << method1948(4);
		aFloatArray4 = new float[anInt2900];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2902 : anInt2900;
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
			local191 = Static46.method858(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static141.method2184(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray6 = local39;
				aFloatArray3 = local84;
				aFloatArray5 = local136;
				anIntArray254 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray7 = local84;
				aFloatArray2 = local136;
				anIntArray253 = local185;
			}
		}
		local24 = method1948(8) + 1;
		aClass39Array1 = new Class39[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass39Array1[local28] = new Class39();
		}
		local32 = method1948(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1948(16);
		}
		@Pc(269) int local269 = method1948(6) + 1;
		aClass23Array1 = new Class23[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass23Array1[local41] = new Class23();
		}
		@Pc(290) int local290 = method1948(6) + 1;
		aClass72Array1 = new Class72[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass72Array1[local86] = new Class72();
		}
		@Pc(311) int local311 = method1948(6) + 1;
		aClass12Array1 = new Class12[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass12Array1[local138] = new Class12();
		}
		@Pc(332) int local332 = method1948(6) + 1;
		aBooleanArray10 = new boolean[local332];
		anIntArray252 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray10[local191] = method1942() != 0;
			method1948(16);
			method1948(16);
			anIntArray252[local191] = method1948(8);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!c;II)Lclient!pb;")
	public static Class2_Sub18 method1941(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1944(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1605(arg2, arg1);
			return local16 == null ? null : new Class2_Sub18(local16);
		} else {
			arg0.method1596(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
	public static int method1942() {
		@Pc(7) int local7 = aByteArray30[anInt2903] >> anInt2909 & 0x1;
		anInt2909++;
		anInt2903 += anInt2909 >> 3;
		anInt2909 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!c;)Z")
	private static boolean method1944(@OriginalArg(0) Class10 arg0) {
		if (!aBoolean120) {
			@Pc(7) byte[] local7 = arg0.method1605(0, 0);
			if (local7 == null) {
				return false;
			}
			method1939(local7);
			aBoolean120 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
	public static void method1945(@OriginalArg(0) byte[] arg0) {
		aByteArray30 = arg0;
		anInt2903 = 0;
		anInt2909 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()V")
	public static void method1947() {
		aByteArray30 = null;
		aClass39Array1 = null;
		aClass23Array1 = null;
		aClass72Array1 = null;
		aClass12Array1 = null;
		aBooleanArray10 = null;
		anIntArray252 = null;
		aFloatArray4 = null;
		aFloatArray6 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray8 = null;
		aFloatArray7 = null;
		aFloatArray2 = null;
		anIntArray254 = null;
		anIntArray253 = null;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)I")
	public static int method1948(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2909) {
			local8 = 8 - anInt2909;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray30[anInt2903] >> anInt2909 & local14) << local3;
			anInt2909 = 0;
			anInt2903++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray30[anInt2903] >> anInt2909 & local8) << local3;
			anInt2909 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)F")
	public static float method1949(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
