import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "[Lclient!sb;")
	public static Class221[] aClass221Array1;

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "[Lclient!gt;")
	public static Class96[] aClass96Array1;

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
	private static int anInt4972;

	@OriginalMember(owner = "client!nu", name = "C", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "[Lclient!en;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
	private static int anInt4975;

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "[Lclient!fk;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!nu", name = "K", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	public static int anInt4976;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!nu", name = "Q", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "Z")
	private static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!he;)Z")
	private static boolean method4180(@OriginalArg(0) Class100 arg0) {
		if (!aBoolean305) {
			@Pc(7) byte[] local7 = arg0.method2520(0, 0);
			if (local7 == null) {
				return false;
			}
			method4186(local7);
			aBoolean305 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!he;I)Lclient!nu;")
	public static Class6_Sub26 method4181(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		if (method4180(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2515(arg1);
			return local14 == null ? null : new Class6_Sub26(local14);
		} else {
			arg0.method2492(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!he;II)Lclient!nu;")
	public static Class6_Sub26 method4182(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4180(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2520(arg2, arg1);
			return local16 == null ? null : new Class6_Sub26(local16);
		} else {
			arg0.method2495(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)F")
	public static float method4183(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "()I")
	public static int method4184() {
		@Pc(7) int local7 = aByteArray62[anInt4975] >> anInt4972 & 0x1;
		anInt4972++;
		anInt4975 += anInt4972 >> 3;
		anInt4972 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([BI)V")
	public static void method4185(@OriginalArg(0) byte[] arg0) {
		aByteArray62 = arg0;
		anInt4975 = 0;
		anInt4972 = 0;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "([B)V")
	private static void method4186(@OriginalArg(0) byte[] arg0) {
		method4185(arg0);
		anInt4978 = 0x1 << method4187(4);
		anInt4976 = 0x1 << method4187(4);
		aFloatArray17 = new float[anInt4976];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4978 : anInt4976;
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
			local191 = Static12.method347(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static368.method4876(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray16 = local39;
				aFloatArray14 = local84;
				aFloatArray10 = local136;
				anIntArray332 = local185;
			} else {
				aFloatArray12 = local39;
				aFloatArray11 = local84;
				aFloatArray15 = local136;
				anIntArray331 = local185;
			}
		}
		local24 = method4187(8) + 1;
		aClass77Array1 = new Class77[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass77Array1[local28] = new Class77();
		}
		local32 = method4187(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4187(16);
		}
		@Pc(269) int local269 = method4187(6) + 1;
		aClass96Array1 = new Class96[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass96Array1[local41] = new Class96();
		}
		@Pc(290) int local290 = method4187(6) + 1;
		aClass64Array1 = new Class64[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass64Array1[local86] = new Class64();
		}
		@Pc(311) int local311 = method4187(6) + 1;
		aClass221Array1 = new Class221[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass221Array1[local138] = new Class221();
		}
		@Pc(332) int local332 = method4187(6) + 1;
		aBooleanArray18 = new boolean[local332];
		anIntArray333 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray18[local191] = method4184() != 0;
			method4187(16);
			method4187(16);
			anIntArray333[local191] = method4187(8);
		}
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I")
	public static int method4187(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4972) {
			local8 = 8 - anInt4972;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray62[anInt4975] >> anInt4972 & local14) << local3;
			anInt4972 = 0;
			anInt4975++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray62[anInt4975] >> anInt4972 & local8) << local3;
			anInt4972 += arg0;
		}
		return local1;
	}
}
