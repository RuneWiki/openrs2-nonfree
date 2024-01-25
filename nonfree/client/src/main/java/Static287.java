import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "[I")
	public static int[] anIntArray361;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
	private static int anInt4802;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "[Lclient!lv;")
	public static Class152[] aClass152Array1;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "[Lclient!ii;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
	private static int anInt4804;

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
	public static int anInt4805;

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "[Lclient!ig;")
	public static Class116[] aClass116Array1;

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "[B")
	private static byte[] aByteArray71;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	public static int anInt4807;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!nr", name = "M", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "[Lclient!mo;")
	public static Class161[] aClass161Array1;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!nr", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray109;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "Z")
	private static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!oi;I)Lclient!nr;")
	public static Class1_Sub33 method3798(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1) {
		if (method3809(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3997(arg1);
			return local14 == null ? null : new Class1_Sub33(local14);
		} else {
			arg0.method4000(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)F")
	public static float method3799(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([B)V")
	private static void method3800(@OriginalArg(0) byte[] arg0) {
		method3807(arg0);
		anInt4807 = 0x1 << method3803(4);
		anInt4805 = 0x1 << method3803(4);
		aFloatArray27 = new float[anInt4805];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4807 : anInt4805;
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
			local191 = Static357.method4688(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static353.method4607(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray26 = local39;
				aFloatArray23 = local84;
				aFloatArray29 = local136;
				anIntArray361 = local185;
			} else {
				aFloatArray30 = local39;
				aFloatArray25 = local84;
				aFloatArray28 = local136;
				anIntArray360 = local185;
			}
		}
		local24 = method3803(8) + 1;
		aClass118Array1 = new Class118[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass118Array1[local28] = new Class118();
		}
		local32 = method3803(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3803(16);
		}
		@Pc(269) int local269 = method3803(6) + 1;
		aClass161Array1 = new Class161[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass161Array1[local41] = new Class161();
		}
		@Pc(290) int local290 = method3803(6) + 1;
		aClass152Array1 = new Class152[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass152Array1[local86] = new Class152();
		}
		@Pc(311) int local311 = method3803(6) + 1;
		aClass116Array1 = new Class116[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass116Array1[local138] = new Class116();
		}
		@Pc(332) int local332 = method3803(6) + 1;
		aBooleanArray109 = new boolean[local332];
		anIntArray362 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray109[local191] = method3805() != 0;
			method3803(16);
			method3803(16);
			anIntArray362[local191] = method3803(8);
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)I")
	public static int method3803(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4802) {
			local8 = 8 - anInt4802;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray71[anInt4804] >> anInt4802 & local14) << local3;
			anInt4802 = 0;
			anInt4804++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray71[anInt4804] >> anInt4802 & local8) << local3;
			anInt4802 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()I")
	public static int method3805() {
		@Pc(7) int local7 = aByteArray71[anInt4804] >> anInt4802 & 0x1;
		anInt4802++;
		anInt4804 += anInt4802 >> 3;
		anInt4802 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!oi;II)Lclient!nr;")
	public static Class1_Sub33 method3806(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3809(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4002(arg1, arg2);
			return local16 == null ? null : new Class1_Sub33(local16);
		} else {
			arg0.method4024(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BI)V")
	public static void method3807(@OriginalArg(0) byte[] arg0) {
		aByteArray71 = arg0;
		anInt4804 = 0;
		anInt4802 = 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!oi;)Z")
	private static boolean method3809(@OriginalArg(0) Class185 arg0) {
		if (!aBoolean437) {
			@Pc(7) byte[] local7 = arg0.method4002(0, 0);
			if (local7 == null) {
				return false;
			}
			method3800(local7);
			aBoolean437 = true;
		}
		return true;
	}
}
