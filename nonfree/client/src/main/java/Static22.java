import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[Lclient!d;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "[Lclient!na;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "[Lclient!ji;")
	public static Class52[] aClass52Array1;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "[Lclient!n;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
	public static int anInt642;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
	private static int anInt643;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "[B")
	private static byte[] aByteArray8;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
	private static int anInt646;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
	public static int anInt649;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "Z")
	private static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	public static int method489() {
		@Pc(7) int local7 = aByteArray8[anInt646] >> anInt643 & 0x1;
		anInt643++;
		anInt646 += anInt643 >> 3;
		anInt643 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ve;II)Lclient!cb;")
	public static Class1_Sub4 method490(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method498(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2208(arg1, arg2);
			return local16 == null ? null : new Class1_Sub4(local16);
		} else {
			arg0.method2194(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([BI)V")
	public static void method491(@OriginalArg(0) byte[] arg0) {
		aByteArray8 = arg0;
		anInt646 = 0;
		anInt643 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I")
	public static int method492(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt643) {
			local8 = 8 - anInt643;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray8[anInt646] >> anInt643 & local14) << local3;
			anInt643 = 0;
			anInt646++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray8[anInt646] >> anInt643 & local8) << local3;
			anInt643 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([B)V")
	private static void method495(@OriginalArg(0) byte[] arg0) {
		method491(arg0);
		anInt642 = 0x1 << method492(4);
		anInt649 = 0x1 << method492(4);
		aFloatArray1 = new float[anInt649];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt642 : anInt649;
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
			local191 = Static54.method2991(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static168.method2876(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray2 = local39;
				aFloatArray6 = local84;
				aFloatArray8 = local136;
				anIntArray51 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray4 = local84;
				aFloatArray7 = local136;
				anIntArray53 = local185;
			}
		}
		local24 = method492(8) + 1;
		aClass66Array1 = new Class66[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass66Array1[local28] = new Class66();
		}
		local32 = method492(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method492(16);
		}
		@Pc(269) int local269 = method492(6) + 1;
		aClass52Array1 = new Class52[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass52Array1[local41] = new Class52();
		}
		@Pc(290) int local290 = method492(6) + 1;
		aClass20Array1 = new Class20[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass20Array1[local86] = new Class20();
		}
		@Pc(311) int local311 = method492(6) + 1;
		aClass67Array1 = new Class67[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass67Array1[local138] = new Class67();
		}
		@Pc(332) int local332 = method492(6) + 1;
		aBooleanArray5 = new boolean[local332];
		anIntArray52 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray5[local191] = method489() != 0;
			method492(16);
			method492(16);
			anIntArray52[local191] = method492(8);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ve;)Z")
	private static boolean method498(@OriginalArg(0) Class69 arg0) {
		if (!aBoolean28) {
			@Pc(7) byte[] local7 = arg0.method2208(0, 0);
			if (local7 == null) {
				return false;
			}
			method495(local7);
			aBoolean28 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)F")
	public static float method499(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
