import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	private static int anInt5029;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
	public static int anInt5031;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "[B")
	private static byte[] aByteArray70;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray37;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "[Lclient!j;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
	private static int anInt5033;

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "[Lclient!fs;")
	public static Class82[] aClass82Array1;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
	public static int anInt5037;

	@OriginalMember(owner = "client!ok", name = "K", descriptor = "[Lclient!ai;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "[Lclient!dh;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "Z")
	private static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([BI)V")
	public static void method4179(@OriginalArg(0) byte[] arg0) {
		aByteArray70 = arg0;
		anInt5029 = 0;
		anInt5033 = 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ul;)Z")
	private static boolean method4181(@OriginalArg(0) Class246 arg0) {
		if (!aBoolean345) {
			@Pc(7) byte[] local7 = arg0.method5477(0, 0);
			if (local7 == null) {
				return false;
			}
			method4186(local7);
			aBoolean345 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)F")
	public static float method4182(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()I")
	public static int method4185() {
		@Pc(7) int local7 = aByteArray70[anInt5029] >> anInt5033 & 0x1;
		anInt5033++;
		anInt5029 += anInt5033 >> 3;
		anInt5033 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "([B)V")
	private static void method4186(@OriginalArg(0) byte[] arg0) {
		method4179(arg0);
		anInt5037 = 0x1 << method4189(4);
		anInt5031 = 0x1 << method4189(4);
		aFloatArray20 = new float[anInt5031];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5037 : anInt5031;
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
			local191 = Static317.method4489(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static442.method5827(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray23 = local39;
				aFloatArray21 = local84;
				aFloatArray17 = local136;
				anIntArray439 = local185;
			} else {
				aFloatArray16 = local39;
				aFloatArray18 = local84;
				aFloatArray19 = local136;
				anIntArray441 = local185;
			}
		}
		local24 = method4189(8) + 1;
		aClass118Array1 = new Class118[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass118Array1[local28] = new Class118();
		}
		local32 = method4189(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4189(16);
		}
		@Pc(269) int local269 = method4189(6) + 1;
		aClass50Array1 = new Class50[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass50Array1[local41] = new Class50();
		}
		@Pc(290) int local290 = method4189(6) + 1;
		aClass5Array1 = new Class5[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass5Array1[local86] = new Class5();
		}
		@Pc(311) int local311 = method4189(6) + 1;
		aClass82Array1 = new Class82[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass82Array1[local138] = new Class82();
		}
		@Pc(332) int local332 = method4189(6) + 1;
		aBooleanArray37 = new boolean[local332];
		anIntArray440 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray37[local191] = method4185() != 0;
			method4189(16);
			method4189(16);
			anIntArray440[local191] = method4189(8);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ul;II)Lclient!ok;")
	public static Class1_Sub34 method4187(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4181(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5477(arg1, arg2);
			return local16 == null ? null : new Class1_Sub34(local16);
		} else {
			arg0.method5490(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ul;I)Lclient!ok;")
	public static Class1_Sub34 method4188(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1) {
		if (method4181(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5499(arg1);
			return local14 == null ? null : new Class1_Sub34(local14);
		} else {
			arg0.method5497(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)I")
	public static int method4189(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5033) {
			local8 = 8 - anInt5033;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray70[anInt5029] >> anInt5033 & local14) << local3;
			anInt5033 = 0;
			anInt5029++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray70[anInt5029] >> anInt5033 & local8) << local3;
			anInt5033 += arg0;
		}
		return local1;
	}
}
