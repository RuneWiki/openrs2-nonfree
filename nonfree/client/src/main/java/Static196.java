import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public static int anInt3539;

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "[Lclient!ku;")
	public static Class134[] aClass134Array1;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
	private static int anInt3541;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "[Lclient!fi;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
	private static int anInt3543;

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "[Lclient!vv;")
	public static Class262[] aClass262Array1;

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!jm", name = "I", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!jm", name = "J", descriptor = "[Lclient!pe;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!jm", name = "K", descriptor = "[B")
	private static byte[] aByteArray69;

	@OriginalMember(owner = "client!jm", name = "L", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
	public static int anInt3547;

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!jm", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "Z")
	private static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)F")
	public static float method3044(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!uu;)Z")
	private static boolean method3046(@OriginalArg(0) Class250 arg0) {
		if (!aBoolean271) {
			@Pc(7) byte[] local7 = arg0.method5806(0, 0);
			if (local7 == null) {
				return false;
			}
			method3047(local7);
			aBoolean271 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([B)V")
	private static void method3047(@OriginalArg(0) byte[] arg0) {
		method3052(arg0);
		anInt3539 = 0x1 << method3051(4);
		anInt3547 = 0x1 << method3051(4);
		aFloatArray19 = new float[anInt3547];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3539 : anInt3547;
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
			local191 = Static263.method5521(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static84.method4999(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray16 = local39;
				aFloatArray14 = local84;
				aFloatArray18 = local136;
				anIntArray221 = local185;
			} else {
				aFloatArray13 = local39;
				aFloatArray15 = local84;
				aFloatArray17 = local136;
				anIntArray220 = local185;
			}
		}
		local24 = method3051(8) + 1;
		aClass186Array1 = new Class186[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass186Array1[local28] = new Class186();
		}
		local32 = method3051(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3051(16);
		}
		@Pc(269) int local269 = method3051(6) + 1;
		aClass134Array1 = new Class134[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass134Array1[local41] = new Class134();
		}
		@Pc(290) int local290 = method3051(6) + 1;
		aClass262Array1 = new Class262[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass262Array1[local86] = new Class262();
		}
		@Pc(311) int local311 = method3051(6) + 1;
		aClass71Array1 = new Class71[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass71Array1[local138] = new Class71();
		}
		@Pc(332) int local332 = method3051(6) + 1;
		aBooleanArray15 = new boolean[local332];
		anIntArray222 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray15[local191] = method3053() != 0;
			method3051(16);
			method3051(16);
			anIntArray222[local191] = method3051(8);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!uu;II)Lclient!jm;")
	public static Class3_Sub27 method3049(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3046(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5806(arg1, arg2);
			return local16 == null ? null : new Class3_Sub27(local16);
		} else {
			arg0.method5796(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)I")
	public static int method3051(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3541) {
			local8 = 8 - anInt3541;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray69[anInt3543] >> anInt3541 & local14) << local3;
			anInt3541 = 0;
			anInt3543++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray69[anInt3543] >> anInt3541 & local8) << local3;
			anInt3541 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI)V")
	public static void method3052(@OriginalArg(0) byte[] arg0) {
		aByteArray69 = arg0;
		anInt3543 = 0;
		anInt3541 = 0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "()I")
	public static int method3053() {
		@Pc(7) int local7 = aByteArray69[anInt3543] >> anInt3541 & 0x1;
		anInt3541++;
		anInt3543 += anInt3541 >> 3;
		anInt3541 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!uu;I)Lclient!jm;")
	public static Class3_Sub27 method3054(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		if (method3046(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5814(arg1);
			return local14 == null ? null : new Class3_Sub27(local14);
		} else {
			arg0.method5813(arg1);
			return null;
		}
	}
}
