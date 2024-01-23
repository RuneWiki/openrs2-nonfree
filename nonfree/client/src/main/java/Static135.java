import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "[Lclient!pc;")
	public static Class93[] aClass93Array1;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
	public static int anInt2949;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
	private static int anInt2950;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "[Lclient!dj;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!mg", name = "F", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "[B")
	private static byte[] aByteArray40;

	@OriginalMember(owner = "client!mg", name = "P", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "[Lclient!ha;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
	private static int anInt2956;

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
	public static int anInt2957;

	@OriginalMember(owner = "client!mg", name = "Y", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "[Lclient!vh;")
	public static Class122[] aClass122Array1;

	@OriginalMember(owner = "client!mg", name = "ab", descriptor = "Z")
	private static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
	public static int method2266(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2950) {
			local8 = 8 - anInt2950;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray40[anInt2956] >> anInt2950 & local14) << local3;
			anInt2950 = 0;
			anInt2956++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray40[anInt2956] >> anInt2950 & local8) << local3;
			anInt2950 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jb;II)Lclient!mg;")
	public static Class1_Sub17 method2267(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2269(arg0)) {
			@Pc(16) byte[] local16 = arg0.method819(arg2, arg1);
			return local16 == null ? null : new Class1_Sub17(local16);
		} else {
			arg0.method841(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
	public static int method2268() {
		@Pc(7) int local7 = aByteArray40[anInt2956] >> anInt2950 & 0x1;
		anInt2950++;
		anInt2956 += anInt2950 >> 3;
		anInt2950 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jb;)Z")
	private static boolean method2269(@OriginalArg(0) Class28 arg0) {
		if (!aBoolean252) {
			@Pc(7) byte[] local7 = arg0.method819(0, 0);
			if (local7 == null) {
				return false;
			}
			method2270(local7);
			aBoolean252 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([B)V")
	private static void method2270(@OriginalArg(0) byte[] arg0) {
		method2271(arg0);
		anInt2957 = 0x1 << method2266(4);
		anInt2949 = 0x1 << method2266(4);
		aFloatArray5 = new float[anInt2949];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2957 : anInt2949;
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
			local191 = Static57.method3708(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static19.method381(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray2 = local39;
				aFloatArray6 = local84;
				aFloatArray8 = local136;
				anIntArray251 = local185;
			} else {
				aFloatArray7 = local39;
				aFloatArray9 = local84;
				aFloatArray4 = local136;
				anIntArray253 = local185;
			}
		}
		local24 = method2266(8) + 1;
		aClass122Array1 = new Class122[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass122Array1[local28] = new Class122();
		}
		local32 = method2266(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2266(16);
		}
		@Pc(269) int local269 = method2266(6) + 1;
		aClass31Array1 = new Class31[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass31Array1[local41] = new Class31();
		}
		@Pc(290) int local290 = method2266(6) + 1;
		aClass48Array1 = new Class48[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass48Array1[local86] = new Class48();
		}
		@Pc(311) int local311 = method2266(6) + 1;
		aClass93Array1 = new Class93[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass93Array1[local138] = new Class93();
		}
		@Pc(332) int local332 = method2266(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray252 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method2268() != 0;
			method2266(16);
			method2266(16);
			anIntArray252[local191] = method2266(8);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([BI)V")
	public static void method2271(@OriginalArg(0) byte[] arg0) {
		aByteArray40 = arg0;
		anInt2956 = 0;
		anInt2950 = 0;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)F")
	public static float method2272(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
