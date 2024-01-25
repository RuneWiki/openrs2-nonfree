import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "[Lclient!gba;")
	public static Class117[] aClass117Array1;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "[F")
	public static float[] aFloatArray60;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "[F")
	public static float[] aFloatArray61;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "[Lclient!via;")
	public static Class377[] aClass377Array1;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray53;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "[F")
	public static float[] aFloatArray62;

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
	public static int anInt9306;

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "[F")
	public static float[] aFloatArray63;

	@OriginalMember(owner = "client!rw", name = "C", descriptor = "[F")
	public static float[] aFloatArray64;

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "[F")
	public static float[] aFloatArray65;

	@OriginalMember(owner = "client!rw", name = "E", descriptor = "[Lclient!vs;")
	public static Class380[] aClass380Array1;

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "[Lclient!gea;")
	public static Class121[] aClass121Array1;

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "[B")
	private static byte[] aByteArray83;

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!rw", name = "K", descriptor = "I")
	public static int anInt9308;

	@OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
	private static int anInt9309;

	@OriginalMember(owner = "client!rw", name = "M", descriptor = "[F")
	public static float[] aFloatArray66;

	@OriginalMember(owner = "client!rw", name = "N", descriptor = "I")
	private static int anInt9310;

	@OriginalMember(owner = "client!rw", name = "F", descriptor = "Z")
	private static boolean aBoolean676 = false;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "()I")
	public static int method8211() {
		@Pc(7) int local7 = aByteArray83[anInt9310] >> anInt9309 & 0x1;
		anInt9309++;
		anInt9310 += anInt9309 >> 3;
		anInt9309 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)F")
	public static float method8212(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!gga;)Z")
	private static boolean method8215(@OriginalArg(0) Class124 arg0) {
		if (!aBoolean676) {
			@Pc(7) byte[] local7 = arg0.method3641(0, 0);
			if (local7 == null) {
				return false;
			}
			method8221(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!gga;II)Lclient!rw;")
	public static Class2_Sub46 method8216(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method8215(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3641(arg1, arg2);
			return local16 == null ? null : new Class2_Sub46(local16);
		} else {
			arg0.method3609(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!gga;I)Lclient!rw;")
	public static Class2_Sub46 method8217(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1) {
		if (method8215(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3610(arg1);
			return local14 == null ? null : new Class2_Sub46(local14);
		} else {
			arg0.method3627(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)I")
	public static int method8219(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9309) {
			local8 = 8 - anInt9309;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray83[anInt9310] >> anInt9309 & local14) << local3;
			anInt9309 = 0;
			anInt9310++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray83[anInt9310] >> anInt9309 & local8) << local3;
			anInt9309 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([BI)V")
	public static void method8220(@OriginalArg(0) byte[] arg0) {
		aByteArray83 = arg0;
		anInt9310 = 0;
		anInt9309 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "([B)V")
	private static void method8221(@OriginalArg(0) byte[] arg0) {
		method8220(arg0);
		anInt9306 = 0x1 << method8219(4);
		anInt9308 = 0x1 << method8219(4);
		aFloatArray65 = new float[anInt9308];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9306 : anInt9308;
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
			local191 = Static8.method135(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static257.method4461(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray60 = local39;
				aFloatArray62 = local84;
				aFloatArray61 = local136;
				anIntArray477 = local185;
			} else {
				aFloatArray63 = local39;
				aFloatArray64 = local84;
				aFloatArray66 = local136;
				anIntArray475 = local185;
			}
		}
		local24 = method8219(8) + 1;
		aClass380Array1 = new Class380[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass380Array1[local28] = new Class380();
		}
		local32 = method8219(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method8219(16);
		}
		@Pc(269) int local269 = method8219(6) + 1;
		aClass377Array1 = new Class377[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass377Array1[local41] = new Class377();
		}
		@Pc(290) int local290 = method8219(6) + 1;
		aClass121Array1 = new Class121[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass121Array1[local86] = new Class121();
		}
		@Pc(311) int local311 = method8219(6) + 1;
		aClass117Array1 = new Class117[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass117Array1[local138] = new Class117();
		}
		@Pc(332) int local332 = method8219(6) + 1;
		aBooleanArray53 = new boolean[local332];
		anIntArray476 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray53[local191] = method8211() != 0;
			method8219(16);
			method8219(16);
			anIntArray476[local191] = method8219(8);
		}
		aBoolean676 = true;
	}
}
