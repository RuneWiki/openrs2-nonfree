import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	private static int anInt3722;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "[B")
	private static byte[] aByteArray39;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "[Lclient!vba;")
	public static Class341[] aClass341Array1;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!go", name = "t", descriptor = "[Lclient!jaa;")
	public static Class168[] aClass168Array1;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!go", name = "w", descriptor = "[Lclient!se;")
	public static Class299[] aClass299Array1;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "[Lclient!cr;")
	public static Class60[] aClass60Array1;

	@OriginalMember(owner = "client!go", name = "A", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!go", name = "C", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!go", name = "D", descriptor = "I")
	public static int anInt3729;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!go", name = "G", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!go", name = "H", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!go", name = "I", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!go", name = "K", descriptor = "I")
	private static int anInt3731;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "Z")
	private static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)F")
	public static float method3062(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!pl;I)Lclient!go;")
	public static Class2_Sub20 method3063(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1) {
		if (method3073(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5964(arg1);
			return local14 == null ? null : new Class2_Sub20(local14);
		} else {
			arg0.method5988(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([BI)V")
	public static void method3064(@OriginalArg(0) byte[] arg0) {
		aByteArray39 = arg0;
		anInt3722 = 0;
		anInt3731 = 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V")
	private static void method3067(@OriginalArg(0) byte[] arg0) {
		method3064(arg0);
		anInt3729 = 0x1 << method3071(4);
		anInt3730 = 0x1 << method3071(4);
		aFloatArray28 = new float[anInt3730];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3729 : anInt3730;
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
			local191 = Static233.method3626(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static133.method2290(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray30 = local39;
				aFloatArray26 = local84;
				aFloatArray32 = local136;
				anIntArray209 = local185;
			} else {
				aFloatArray29 = local39;
				aFloatArray25 = local84;
				aFloatArray27 = local136;
				anIntArray208 = local185;
			}
		}
		local24 = method3071(8) + 1;
		aClass299Array1 = new Class299[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass299Array1[local28] = new Class299();
		}
		local32 = method3071(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3071(16);
		}
		@Pc(269) int local269 = method3071(6) + 1;
		aClass168Array1 = new Class168[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass168Array1[local41] = new Class168();
		}
		@Pc(290) int local290 = method3071(6) + 1;
		aClass60Array1 = new Class60[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass60Array1[local86] = new Class60();
		}
		@Pc(311) int local311 = method3071(6) + 1;
		aClass341Array1 = new Class341[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass341Array1[local138] = new Class341();
		}
		@Pc(332) int local332 = method3071(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray210 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method3072() != 0;
			method3071(16);
			method3071(16);
			anIntArray210[local191] = method3071(8);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!pl;II)Lclient!go;")
	public static Class2_Sub20 method3070(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3073(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5985(arg2, arg1);
			return local16 == null ? null : new Class2_Sub20(local16);
		} else {
			arg0.method5990(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)I")
	public static int method3071(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3731) {
			local8 = 8 - anInt3731;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray39[anInt3722] >> anInt3731 & local14) << local3;
			anInt3731 = 0;
			anInt3722++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray39[anInt3722] >> anInt3731 & local8) << local3;
			anInt3731 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()I")
	public static int method3072() {
		@Pc(7) int local7 = aByteArray39[anInt3722] >> anInt3731 & 0x1;
		anInt3731++;
		anInt3722 += anInt3731 >> 3;
		anInt3731 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!pl;)Z")
	private static boolean method3073(@OriginalArg(0) Class259 arg0) {
		if (!aBoolean308) {
			@Pc(7) byte[] local7 = arg0.method5985(0, 0);
			if (local7 == null) {
				return false;
			}
			method3067(local7);
			aBoolean308 = true;
		}
		return true;
	}
}
