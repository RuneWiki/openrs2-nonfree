import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!u", name = "m", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
	public static int[] anIntArray572;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	private static int anInt7021;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "[Lclient!an;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "[Lclient!ew;")
	public static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "I")
	public static int anInt7023;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "[I")
	public static int[] anIntArray573;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "[Lclient!bu;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "[B")
	private static byte[] aByteArray85;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "[Lclient!wl;")
	public static Class269[] aClass269Array1;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	private static int anInt7027;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "[I")
	public static int[] anIntArray574;

	@OriginalMember(owner = "client!u", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "I")
	public static int anInt7029;

	@OriginalMember(owner = "client!u", name = "O", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
	private static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!mn;II)Lclient!u;")
	public static Class2_Sub41 method5632(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5636(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3658(arg1, arg2);
			return local16 == null ? null : new Class2_Sub41(local16);
		} else {
			arg0.method3647(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([B)V")
	private static void method5633(@OriginalArg(0) byte[] arg0) {
		method5642(arg0);
		anInt7029 = 0x1 << method5641(4);
		anInt7023 = 0x1 << method5641(4);
		aFloatArray22 = new float[anInt7023];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7029 : anInt7023;
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
			local191 = Static109.method1799(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static170.method2521(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray21 = local39;
				aFloatArray28 = local84;
				aFloatArray23 = local136;
				anIntArray572 = local185;
			} else {
				aFloatArray27 = local39;
				aFloatArray26 = local84;
				aFloatArray25 = local136;
				anIntArray573 = local185;
			}
		}
		local24 = method5641(8) + 1;
		aClass13Array1 = new Class13[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass13Array1[local28] = new Class13();
		}
		local32 = method5641(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5641(16);
		}
		@Pc(269) int local269 = method5641(6) + 1;
		aClass269Array1 = new Class269[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass269Array1[local41] = new Class269();
		}
		@Pc(290) int local290 = method5641(6) + 1;
		aClass32Array1 = new Class32[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass32Array1[local86] = new Class32();
		}
		@Pc(311) int local311 = method5641(6) + 1;
		aClass74Array1 = new Class74[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass74Array1[local138] = new Class74();
		}
		@Pc(332) int local332 = method5641(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray574 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method5639() != 0;
			method5641(16);
			method5641(16);
			anIntArray574[local191] = method5641(8);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!mn;I)Lclient!u;")
	public static Class2_Sub41 method5635(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		if (method5636(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3664(arg1);
			return local14 == null ? null : new Class2_Sub41(local14);
		} else {
			arg0.method3666(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!mn;)Z")
	private static boolean method5636(@OriginalArg(0) Class171 arg0) {
		if (!aBoolean465) {
			@Pc(7) byte[] local7 = arg0.method3658(0, 0);
			if (local7 == null) {
				return false;
			}
			method5633(local7);
			aBoolean465 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	public static int method5639() {
		@Pc(7) int local7 = aByteArray85[anInt7027] >> anInt7021 & 0x1;
		anInt7021++;
		anInt7027 += anInt7021 >> 3;
		anInt7021 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)F")
	public static float method5640(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	public static int method5641(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7021) {
			local8 = 8 - anInt7021;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray85[anInt7027] >> anInt7021 & local14) << local3;
			anInt7021 = 0;
			anInt7027++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray85[anInt7027] >> anInt7021 & local8) << local3;
			anInt7021 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)V")
	public static void method5642(@OriginalArg(0) byte[] arg0) {
		aByteArray85 = arg0;
		anInt7027 = 0;
		anInt7021 = 0;
	}
}
