import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt5246;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
	public static int[] anIntArray489;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt5249;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[B")
	private static byte[] aByteArray60;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	private static int anInt5251;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "[Lclient!bs;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
	private static int anInt5252;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "[Lclient!pn;")
	public static Class160[] aClass160Array1;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "[Lclient!go;")
	public static Class86[] aClass86Array1;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "[Lclient!ul;")
	public static Class200[] aClass200Array1;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Z")
	private static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([B)V")
	private static void method4553(@OriginalArg(0) byte[] arg0) {
		method4556(arg0);
		anInt5246 = 0x1 << method4563(4);
		anInt5249 = 0x1 << method4563(4);
		aFloatArray19 = new float[anInt5249];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5246 : anInt5249;
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
			local191 = Static92.method1447(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static194.method3442(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray20 = local39;
				aFloatArray17 = local84;
				aFloatArray18 = local136;
				anIntArray490 = local185;
			} else {
				aFloatArray21 = local39;
				aFloatArray23 = local84;
				aFloatArray16 = local136;
				anIntArray491 = local185;
			}
		}
		local24 = method4563(8) + 1;
		aClass86Array1 = new Class86[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass86Array1[local28] = new Class86();
		}
		local32 = method4563(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4563(16);
		}
		@Pc(269) int local269 = method4563(6) + 1;
		aClass200Array1 = new Class200[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass200Array1[local41] = new Class200();
		}
		@Pc(290) int local290 = method4563(6) + 1;
		aClass160Array1 = new Class160[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass160Array1[local86] = new Class160();
		}
		@Pc(311) int local311 = method4563(6) + 1;
		aClass30Array1 = new Class30[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass30Array1[local138] = new Class30();
		}
		@Pc(332) int local332 = method4563(6) + 1;
		aBooleanArray22 = new boolean[local332];
		anIntArray489 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray22[local191] = method4558() != 0;
			method4563(16);
			method4563(16);
			anIntArray489[local191] = method4563(8);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)V")
	public static void method4556(@OriginalArg(0) byte[] arg0) {
		aByteArray60 = arg0;
		anInt5252 = 0;
		anInt5251 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()I")
	public static int method4558() {
		@Pc(7) int local7 = aByteArray60[anInt5252] >> anInt5251 & 0x1;
		anInt5251++;
		anInt5252 += anInt5251 >> 3;
		anInt5251 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)F")
	public static float method4560(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!lm;II)Lclient!ra;")
	public static Class1_Sub38 method4561(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4562(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3009(arg2, arg1);
			return local16 == null ? null : new Class1_Sub38(local16);
		} else {
			arg0.method3011(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!lm;)Z")
	private static boolean method4562(@OriginalArg(0) Class134 arg0) {
		if (!aBoolean431) {
			@Pc(7) byte[] local7 = arg0.method3009(0, 0);
			if (local7 == null) {
				return false;
			}
			method4553(local7);
			aBoolean431 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)I")
	public static int method4563(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5251) {
			local8 = 8 - anInt5251;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray60[anInt5252] >> anInt5251 & local14) << local3;
			anInt5251 = 0;
			anInt5252++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray60[anInt5252] >> anInt5251 & local8) << local3;
			anInt5251 += arg0;
		}
		return local1;
	}
}
