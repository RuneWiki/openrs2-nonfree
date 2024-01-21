import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	private static int anInt125;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	private static int anInt126;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "[Lclient!vf;")
	public static Class86[] aClass86Array1;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "[B")
	private static byte[] aByteArray2;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "[Lclient!dh;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
	public static int anInt128;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
	public static int anInt129;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "[Lclient!m;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "[Lclient!kc;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Z")
	private static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
	public static int method88() {
		@Pc(7) int local7 = aByteArray2[anInt126] >> anInt125 & 0x1;
		anInt125++;
		anInt126 += anInt125 >> 3;
		anInt125 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([B)V")
	private static void method89(@OriginalArg(0) byte[] arg0) {
		method97(arg0);
		anInt129 = 0x1 << method90(4);
		anInt128 = 0x1 << method90(4);
		aFloatArray5 = new float[anInt128];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt129 : anInt128;
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
			local191 = Static112.method1840(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static1.method5(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray2 = local39;
				aFloatArray3 = local84;
				aFloatArray1 = local136;
				anIntArray9 = local185;
			} else {
				aFloatArray7 = local39;
				aFloatArray8 = local84;
				aFloatArray6 = local136;
				anIntArray8 = local185;
			}
		}
		local24 = method90(8) + 1;
		aClass86Array1 = new Class86[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass86Array1[local28] = new Class86();
		}
		local32 = method90(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method90(16);
		}
		@Pc(269) int local269 = method90(6) + 1;
		aClass47Array1 = new Class47[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass47Array1[local41] = new Class47();
		}
		@Pc(290) int local290 = method90(6) + 1;
		aClass21Array1 = new Class21[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass21Array1[local86] = new Class21();
		}
		@Pc(311) int local311 = method90(6) + 1;
		aClass53Array1 = new Class53[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass53Array1[local138] = new Class53();
		}
		@Pc(332) int local332 = method90(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray10 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method88() != 0;
			method90(16);
			method90(16);
			anIntArray10[local191] = method90(8);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
	public static int method90(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt125) {
			local8 = 8 - anInt125;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray2[anInt126] >> anInt125 & local14) << local3;
			anInt125 = 0;
			anInt126++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray2[anInt126] >> anInt125 & local8) << local3;
			anInt125 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
	public static void method91() {
		aByteArray2 = null;
		aClass86Array1 = null;
		aClass47Array1 = null;
		aClass21Array1 = null;
		aClass53Array1 = null;
		aBooleanArray1 = null;
		anIntArray10 = null;
		aFloatArray5 = null;
		aFloatArray2 = null;
		aFloatArray3 = null;
		aFloatArray1 = null;
		aFloatArray7 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		anIntArray9 = null;
		anIntArray8 = null;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)F")
	public static float method92(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jg;)Z")
	private static boolean method95(@OriginalArg(0) Class44 arg0) {
		if (!aBoolean6) {
			@Pc(7) byte[] local7 = arg0.method1624(0, 0);
			if (local7 == null) {
				return false;
			}
			method89(local7);
			aBoolean6 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BI)V")
	public static void method97(@OriginalArg(0) byte[] arg0) {
		aByteArray2 = arg0;
		anInt126 = 0;
		anInt125 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jg;II)Lclient!ad;")
	public static Class3_Sub3 method98(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method95(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1624(arg1, arg2);
			return local16 == null ? null : new Class3_Sub3(local16);
		} else {
			arg0.method1618(arg2, arg1);
			return null;
		}
	}
}
