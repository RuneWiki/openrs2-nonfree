import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[Lclient!tj;")
	public static Class327[] aClass327Array1;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
	public static int anInt2438;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "[B")
	private static byte[] aByteArray10;

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "[Lclient!l;")
	public static Class187[] aClass187Array1;

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!cr", name = "A", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "[Lclient!ad;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!cr", name = "G", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "[Lclient!rf;")
	public static Class290[] aClass290Array1;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
	private static int anInt2442;

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
	private static int anInt2443;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!cr", name = "M", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "Z")
	private static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!oh;I)Lclient!cr;")
	public static Class8_Sub13 method2064(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		if (method2066(arg0)) {
			@Pc(14) byte[] local14 = arg0.method6305(arg1);
			return local14 == null ? null : new Class8_Sub13(local14);
		} else {
			arg0.method6296(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!oh;)Z")
	private static boolean method2066(@OriginalArg(0) Class237 arg0) {
		if (!aBoolean184) {
			@Pc(7) byte[] local7 = arg0.method6314(0, 0);
			if (local7 == null) {
				return false;
			}
			method2075(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)F")
	public static float method2068(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BI)V")
	public static void method2069(@OriginalArg(0) byte[] arg0) {
		aByteArray10 = arg0;
		anInt2443 = 0;
		anInt2442 = 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!oh;II)Lclient!cr;")
	public static Class8_Sub13 method2070(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2066(arg0)) {
			@Pc(16) byte[] local16 = arg0.method6314(arg1, arg2);
			return local16 == null ? null : new Class8_Sub13(local16);
		} else {
			arg0.method6326(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "()I")
	public static int method2071() {
		@Pc(7) int local7 = aByteArray10[anInt2443] >> anInt2442 & 0x1;
		anInt2442++;
		anInt2443 += anInt2442 >> 3;
		anInt2442 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)I")
	public static int method2072(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2442) {
			local8 = 8 - anInt2442;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray10[anInt2443] >> anInt2442 & local14) << local3;
			anInt2442 = 0;
			anInt2443++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray10[anInt2443] >> anInt2442 & local8) << local3;
			anInt2442 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "([B)V")
	private static void method2075(@OriginalArg(0) byte[] arg0) {
		method2069(arg0);
		anInt2438 = 0x1 << method2072(4);
		anInt2437 = 0x1 << method2072(4);
		aFloatArray27 = new float[anInt2437];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2438 : anInt2437;
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
			local191 = Static112.method2537(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static414.method6516(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray29 = local39;
				aFloatArray32 = local84;
				aFloatArray28 = local136;
				anIntArray97 = local185;
			} else {
				aFloatArray34 = local39;
				aFloatArray33 = local84;
				aFloatArray31 = local136;
				anIntArray98 = local185;
			}
		}
		local24 = method2072(8) + 1;
		aClass7Array1 = new Class7[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass7Array1[local28] = new Class7();
		}
		local32 = method2072(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2072(16);
		}
		@Pc(269) int local269 = method2072(6) + 1;
		aClass290Array1 = new Class290[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass290Array1[local41] = new Class290();
		}
		@Pc(290) int local290 = method2072(6) + 1;
		aClass187Array1 = new Class187[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass187Array1[local86] = new Class187();
		}
		@Pc(311) int local311 = method2072(6) + 1;
		aClass327Array1 = new Class327[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass327Array1[local138] = new Class327();
		}
		@Pc(332) int local332 = method2072(6) + 1;
		aBooleanArray2 = new boolean[local332];
		anIntArray99 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray2[local191] = method2071() != 0;
			method2072(16);
			method2072(16);
			anIntArray99[local191] = method2072(8);
		}
		aBoolean184 = true;
	}
}
