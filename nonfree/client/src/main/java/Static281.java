import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "[Lclient!wl;")
	public static Class216[] aClass216Array1;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "[B")
	private static byte[] aByteArray85;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
	public static int anInt5538;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "[Lclient!sl;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "[Lclient!kn;")
	public static Class116[] aClass116Array1;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!rm", name = "P", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
	private static int anInt5545;

	@OriginalMember(owner = "client!rm", name = "S", descriptor = "[Lclient!si;")
	public static Class185[] aClass185Array1;

	@OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
	private static int anInt5547;

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "Z")
	private static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([B)V")
	private static void method4888(@OriginalArg(0) byte[] arg0) {
		method4890(arg0);
		anInt5539 = 0x1 << method4896(4);
		anInt5538 = 0x1 << method4896(4);
		aFloatArray19 = new float[anInt5538];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5539 : anInt5538;
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
			local191 = Static241.method4295(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static26.method477(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray21 = local39;
				aFloatArray25 = local84;
				aFloatArray23 = local136;
				anIntArray534 = local185;
			} else {
				aFloatArray24 = local39;
				aFloatArray20 = local84;
				aFloatArray26 = local136;
				anIntArray535 = local185;
			}
		}
		local24 = method4896(8) + 1;
		aClass216Array1 = new Class216[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass216Array1[local28] = new Class216();
		}
		local32 = method4896(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4896(16);
		}
		@Pc(269) int local269 = method4896(6) + 1;
		aClass186Array1 = new Class186[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass186Array1[local41] = new Class186();
		}
		@Pc(290) int local290 = method4896(6) + 1;
		aClass185Array1 = new Class185[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass185Array1[local86] = new Class185();
		}
		@Pc(311) int local311 = method4896(6) + 1;
		aClass116Array1 = new Class116[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass116Array1[local138] = new Class116();
		}
		@Pc(332) int local332 = method4896(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray536 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method4889() != 0;
			method4896(16);
			method4896(16);
			anIntArray536[local191] = method4896(8);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "()I")
	public static int method4889() {
		@Pc(7) int local7 = aByteArray85[anInt5545] >> anInt5547 & 0x1;
		anInt5547++;
		anInt5545 += anInt5547 >> 3;
		anInt5547 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([BI)V")
	public static void method4890(@OriginalArg(0) byte[] arg0) {
		aByteArray85 = arg0;
		anInt5545 = 0;
		anInt5547 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ij;II)Lclient!rm;")
	public static Class5_Sub36 method4892(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4897(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2410(arg2, arg1);
			return local16 == null ? null : new Class5_Sub36(local16);
		} else {
			arg0.method2390(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)F")
	public static float method4893(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)I")
	public static int method4896(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5547) {
			local8 = 8 - anInt5547;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray85[anInt5545] >> anInt5547 & local14) << local3;
			anInt5547 = 0;
			anInt5545++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray85[anInt5545] >> anInt5547 & local8) << local3;
			anInt5547 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ij;)Z")
	private static boolean method4897(@OriginalArg(0) Class93 arg0) {
		if (!aBoolean455) {
			@Pc(7) byte[] local7 = arg0.method2410(0, 0);
			if (local7 == null) {
				return false;
			}
			method4888(local7);
			aBoolean455 = true;
		}
		return true;
	}
}
