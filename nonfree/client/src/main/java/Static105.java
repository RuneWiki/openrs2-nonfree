import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "[Lclient!b;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "[Lclient!uc;")
	public static Class224[] aClass224Array1;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "[B")
	private static byte[] aByteArray29;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "[Lclient!iu;")
	public static Class112[] aClass112Array1;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "[Lclient!cn;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!fp", name = "N", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	public static int anInt2322;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
	private static int anInt2323;

	@OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
	private static int anInt2324;

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "Z")
	private static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([B)V")
	private static void method1870(@OriginalArg(0) byte[] arg0) {
		method1877(arg0);
		anInt2321 = 0x1 << method1872(4);
		anInt2322 = 0x1 << method1872(4);
		aFloatArray5 = new float[anInt2322];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2321 : anInt2322;
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
			local191 = Static188.method3476(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static339.method5452(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray9 = local39;
				aFloatArray11 = local84;
				aFloatArray10 = local136;
				anIntArray194 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray7 = local84;
				aFloatArray12 = local136;
				anIntArray192 = local185;
			}
		}
		local24 = method1872(8) + 1;
		aClass112Array1 = new Class112[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass112Array1[local28] = new Class112();
		}
		local32 = method1872(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1872(16);
		}
		@Pc(269) int local269 = method1872(6) + 1;
		aClass17Array1 = new Class17[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass17Array1[local41] = new Class17();
		}
		@Pc(290) int local290 = method1872(6) + 1;
		aClass224Array1 = new Class224[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass224Array1[local86] = new Class224();
		}
		@Pc(311) int local311 = method1872(6) + 1;
		aClass40Array1 = new Class40[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass40Array1[local138] = new Class40();
		}
		@Pc(332) int local332 = method1872(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray193 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method1875() != 0;
			method1872(16);
			method1872(16);
			anIntArray193[local191] = method1872(8);
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)I")
	public static int method1872(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2323) {
			local8 = 8 - anInt2323;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray29[anInt2324] >> anInt2323 & local14) << local3;
			anInt2323 = 0;
			anInt2324++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray29[anInt2324] >> anInt2323 & local8) << local3;
			anInt2323 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!g;)Z")
	private static boolean method1873(@OriginalArg(0) Class83 arg0) {
		if (!aBoolean169) {
			@Pc(7) byte[] local7 = arg0.method1968(0, 0);
			if (local7 == null) {
				return false;
			}
			method1870(local7);
			aBoolean169 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!g;II)Lclient!fp;")
	public static Class2_Sub13 method1874(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1873(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1968(arg2, arg1);
			return local16 == null ? null : new Class2_Sub13(local16);
		} else {
			arg0.method1949(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "()I")
	public static int method1875() {
		@Pc(7) int local7 = aByteArray29[anInt2324] >> anInt2323 & 0x1;
		anInt2323++;
		anInt2324 += anInt2323 >> 3;
		anInt2323 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)F")
	public static float method1876(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([BI)V")
	public static void method1877(@OriginalArg(0) byte[] arg0) {
		aByteArray29 = arg0;
		anInt2324 = 0;
		anInt2323 = 0;
	}
}
