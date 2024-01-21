import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	private static int anInt3076;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "[Lclient!pd;")
	public static Class60[] aClass60Array1;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private static int anInt3077;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
	public static int anInt3080;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "[B")
	private static byte[] aByteArray40;

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "[Lclient!ra;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "[Lclient!va;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "[Lclient!ib;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
	public static int anInt3083;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "Z")
	private static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ie;II)Lclient!wc;")
	public static Class1_Sub24 method2026(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2036(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1573(arg1, arg2);
			return local16 == null ? null : new Class1_Sub24(local16);
		} else {
			arg0.method1561(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
	private static void method2027(@OriginalArg(0) byte[] arg0) {
		method2028(arg0);
		anInt3083 = 0x1 << method2029(4);
		anInt3080 = 0x1 << method2029(4);
		aFloatArray4 = new float[anInt3080];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3083 : anInt3080;
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
			local191 = Static120.method1909(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static110.method1678(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray6 = local84;
				aFloatArray9 = local136;
				anIntArray377 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray8 = local84;
				aFloatArray7 = local136;
				anIntArray378 = local185;
			}
		}
		local24 = method2029(8) + 1;
		aClass60Array1 = new Class60[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass60Array1[local28] = new Class60();
		}
		local32 = method2029(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2029(16);
		}
		@Pc(269) int local269 = method2029(6) + 1;
		aClass32Array1 = new Class32[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass32Array1[local41] = new Class32();
		}
		@Pc(290) int local290 = method2029(6) + 1;
		aClass66Array1 = new Class66[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass66Array1[local86] = new Class66();
		}
		@Pc(311) int local311 = method2029(6) + 1;
		aClass77Array1 = new Class77[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass77Array1[local138] = new Class77();
		}
		@Pc(332) int local332 = method2029(6) + 1;
		aBooleanArray19 = new boolean[local332];
		anIntArray379 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray19[local191] = method2030() != 0;
			method2029(16);
			method2029(16);
			anIntArray379[local191] = method2029(8);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI)V")
	public static void method2028(@OriginalArg(0) byte[] arg0) {
		aByteArray40 = arg0;
		anInt3076 = 0;
		anInt3077 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I")
	public static int method2029(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3077) {
			local8 = 8 - anInt3077;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray40[anInt3076] >> anInt3077 & local14) << local3;
			anInt3077 = 0;
			anInt3076++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray40[anInt3076] >> anInt3077 & local8) << local3;
			anInt3077 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()I")
	public static int method2030() {
		@Pc(7) int local7 = aByteArray40[anInt3076] >> anInt3077 & 0x1;
		anInt3077++;
		anInt3076 += anInt3077 >> 3;
		anInt3077 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
	public static void method2031() {
		aByteArray40 = null;
		aClass60Array1 = null;
		aClass32Array1 = null;
		aClass66Array1 = null;
		aClass77Array1 = null;
		aBooleanArray19 = null;
		anIntArray379 = null;
		aFloatArray4 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		aFloatArray9 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray7 = null;
		anIntArray377 = null;
		anIntArray378 = null;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)F")
	public static float method2034(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ie;)Z")
	private static boolean method2036(@OriginalArg(0) Class35 arg0) {
		if (!aBoolean184) {
			@Pc(7) byte[] local7 = arg0.method1573(0, 0);
			if (local7 == null) {
				return false;
			}
			method2027(local7);
			aBoolean184 = true;
		}
		return true;
	}
}
