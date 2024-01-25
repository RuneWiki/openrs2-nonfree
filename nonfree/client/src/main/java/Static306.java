import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
	public static int[] anIntArray459;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lclient!fc;")
	public static Class76[] aClass76Array1;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	private static int anInt5127;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[Lclient!wu;")
	public static Class271[] aClass271Array1;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "[B")
	private static byte[] aByteArray77;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "[Lclient!pd;")
	public static Class187[] aClass187Array1;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
	public static int anInt5128;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
	public static int anInt5132;

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
	private static int anInt5134;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "[Lclient!os;")
	public static Class184[] aClass184Array1;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
	private static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ok;I)Lclient!pj;")
	public static Class7_Sub35 method4050(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		if (method4054(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3823(arg1);
			return local14 == null ? null : new Class7_Sub35(local14);
		} else {
			arg0.method3848(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "([B)V")
	private static void method4052(@OriginalArg(0) byte[] arg0) {
		method4058(arg0);
		anInt5128 = 0x1 << method4057(4);
		anInt5132 = 0x1 << method4057(4);
		aFloatArray18 = new float[anInt5132];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5128 : anInt5132;
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
			local191 = Static88.method1559(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static153.method4539(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray19 = local39;
				aFloatArray15 = local84;
				aFloatArray12 = local136;
				anIntArray460 = local185;
			} else {
				aFloatArray13 = local39;
				aFloatArray14 = local84;
				aFloatArray16 = local136;
				anIntArray459 = local185;
			}
		}
		local24 = method4057(8) + 1;
		aClass184Array1 = new Class184[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass184Array1[local28] = new Class184();
		}
		local32 = method4057(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4057(16);
		}
		@Pc(269) int local269 = method4057(6) + 1;
		aClass76Array1 = new Class76[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass76Array1[local41] = new Class76();
		}
		@Pc(290) int local290 = method4057(6) + 1;
		aClass271Array1 = new Class271[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass271Array1[local86] = new Class271();
		}
		@Pc(311) int local311 = method4057(6) + 1;
		aClass187Array1 = new Class187[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass187Array1[local138] = new Class187();
		}
		@Pc(332) int local332 = method4057(6) + 1;
		aBooleanArray27 = new boolean[local332];
		anIntArray461 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray27[local191] = method4060() != 0;
			method4057(16);
			method4057(16);
			anIntArray461[local191] = method4057(8);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ok;)Z")
	private static boolean method4054(@OriginalArg(0) Class178 arg0) {
		if (!aBoolean327) {
			@Pc(7) byte[] local7 = arg0.method3838(0, 0);
			if (local7 == null) {
				return false;
			}
			method4052(local7);
			aBoolean327 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ok;II)Lclient!pj;")
	public static Class7_Sub35 method4056(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4054(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3838(arg2, arg1);
			return local16 == null ? null : new Class7_Sub35(local16);
		} else {
			arg0.method3835(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
	public static int method4057(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5134) {
			local8 = 8 - anInt5134;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray77[anInt5127] >> anInt5134 & local14) << local3;
			anInt5134 = 0;
			anInt5127++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray77[anInt5127] >> anInt5134 & local8) << local3;
			anInt5134 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([BI)V")
	public static void method4058(@OriginalArg(0) byte[] arg0) {
		aByteArray77 = arg0;
		anInt5127 = 0;
		anInt5134 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "()I")
	public static int method4060() {
		@Pc(7) int local7 = aByteArray77[anInt5127] >> anInt5134 & 0x1;
		anInt5134++;
		anInt5127 += anInt5134 >> 3;
		anInt5134 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)F")
	public static float method4061(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
