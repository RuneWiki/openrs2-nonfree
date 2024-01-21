import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static int anInt4702;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static int anInt4703;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private static int anInt4707;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "[Lclient!ne;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "[Lclient!td;")
	public static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "[I")
	public static int[] anIntArray429;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "[Lclient!lf;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "[B")
	private static byte[] aByteArray47;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "[Lclient!i;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
	private static int anInt4711;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
	private static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!dd;)Z")
	private static boolean method3169(@OriginalArg(0) Class16 arg0) {
		if (!aBoolean207) {
			@Pc(7) byte[] local7 = arg0.method2254(0, 0);
			if (local7 == null) {
				return false;
			}
			method3178(local7);
			aBoolean207 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)F")
	public static float method3170(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!dd;II)Lclient!wd;")
	public static Class1_Sub24 method3171(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3169(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2254(arg2, arg1);
			return local16 == null ? null : new Class1_Sub24(local16);
		} else {
			arg0.method2238(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
	public static void method3172() {
		aByteArray47 = null;
		aClass74Array1 = null;
		aClass41Array1 = null;
		aClass30Array1 = null;
		aClass49Array1 = null;
		aBooleanArray18 = null;
		anIntArray430 = null;
		aFloatArray5 = null;
		aFloatArray3 = null;
		aFloatArray2 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		aFloatArray7 = null;
		aFloatArray4 = null;
		anIntArray429 = null;
		anIntArray428 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)V")
	public static void method3175(@OriginalArg(0) byte[] arg0) {
		aByteArray47 = arg0;
		anInt4707 = 0;
		anInt4711 = 0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()I")
	public static int method3177() {
		@Pc(7) int local7 = aByteArray47[anInt4707] >> anInt4711 & 0x1;
		anInt4711++;
		anInt4707 += anInt4711 >> 3;
		anInt4711 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "([B)V")
	private static void method3178(@OriginalArg(0) byte[] arg0) {
		method3175(arg0);
		anInt4703 = 0x1 << method3179(4);
		anInt4702 = 0x1 << method3179(4);
		aFloatArray5 = new float[anInt4702];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4703 : anInt4702;
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
			local191 = Static141.method1501(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static143.method2709(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray3 = local39;
				aFloatArray2 = local84;
				aFloatArray8 = local136;
				anIntArray429 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray7 = local84;
				aFloatArray4 = local136;
				anIntArray428 = local185;
			}
		}
		local24 = method3179(8) + 1;
		aClass74Array1 = new Class74[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass74Array1[local28] = new Class74();
		}
		local32 = method3179(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3179(16);
		}
		@Pc(269) int local269 = method3179(6) + 1;
		aClass41Array1 = new Class41[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass41Array1[local41] = new Class41();
		}
		@Pc(290) int local290 = method3179(6) + 1;
		aClass30Array1 = new Class30[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass30Array1[local86] = new Class30();
		}
		@Pc(311) int local311 = method3179(6) + 1;
		aClass49Array1 = new Class49[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass49Array1[local138] = new Class49();
		}
		@Pc(332) int local332 = method3179(6) + 1;
		aBooleanArray18 = new boolean[local332];
		anIntArray430 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray18[local191] = method3177() != 0;
			method3179(16);
			method3179(16);
			anIntArray430[local191] = method3179(8);
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public static int method3179(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4711) {
			local8 = 8 - anInt4711;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray47[anInt4707] >> anInt4711 & local14) << local3;
			anInt4711 = 0;
			anInt4707++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray47[anInt4707] >> anInt4711 & local8) << local3;
			anInt4711 += arg0;
		}
		return local1;
	}
}
