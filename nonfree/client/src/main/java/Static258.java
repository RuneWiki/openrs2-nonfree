import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	private static int anInt4414;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "[B")
	private static byte[] aByteArray53;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
	public static int anInt4417;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "[Lclient!eq;")
	public static Class73[] aClass73Array1;

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "[Lclient!np;")
	public static Class176[] aClass176Array1;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
	public static int anInt4419;

	@OriginalMember(owner = "client!mu", name = "F", descriptor = "[Lclient!mj;")
	public static Class162[] aClass162Array1;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!mu", name = "J", descriptor = "[I")
	public static int[] anIntArray348;

	@OriginalMember(owner = "client!mu", name = "L", descriptor = "I")
	private static int anInt4421;

	@OriginalMember(owner = "client!mu", name = "M", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!mu", name = "O", descriptor = "[Lclient!dp;")
	public static Class59[] aClass59Array1;

	@OriginalMember(owner = "client!mu", name = "P", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!mu", name = "S", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!mu", name = "z", descriptor = "Z")
	private static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "([B)V")
	private static void method3651(@OriginalArg(0) byte[] arg0) {
		method3661(arg0);
		anInt4419 = 0x1 << method3655(4);
		anInt4417 = 0x1 << method3655(4);
		aFloatArray29 = new float[anInt4417];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4419 : anInt4417;
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
			local191 = Static113.method1791(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static6.method146(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray22 = local39;
				aFloatArray28 = local84;
				aFloatArray26 = local136;
				anIntArray348 = local185;
			} else {
				aFloatArray23 = local39;
				aFloatArray25 = local84;
				aFloatArray24 = local136;
				anIntArray349 = local185;
			}
		}
		local24 = method3655(8) + 1;
		aClass59Array1 = new Class59[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass59Array1[local28] = new Class59();
		}
		local32 = method3655(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3655(16);
		}
		@Pc(269) int local269 = method3655(6) + 1;
		aClass162Array1 = new Class162[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass162Array1[local41] = new Class162();
		}
		@Pc(290) int local290 = method3655(6) + 1;
		aClass176Array1 = new Class176[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass176Array1[local86] = new Class176();
		}
		@Pc(311) int local311 = method3655(6) + 1;
		aClass73Array1 = new Class73[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass73Array1[local138] = new Class73();
		}
		@Pc(332) int local332 = method3655(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray350 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method3653() != 0;
			method3655(16);
			method3655(16);
			anIntArray350[local191] = method3655(8);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!hh;I)Lclient!mu;")
	public static Class1_Sub29 method3652(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (method3654(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2346(arg1);
			return local14 == null ? null : new Class1_Sub29(local14);
		} else {
			arg0.method2348(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "()I")
	public static int method3653() {
		@Pc(7) int local7 = aByteArray53[anInt4414] >> anInt4421 & 0x1;
		anInt4421++;
		anInt4414 += anInt4421 >> 3;
		anInt4421 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!hh;)Z")
	private static boolean method3654(@OriginalArg(0) Class109 arg0) {
		if (!aBoolean350) {
			@Pc(7) byte[] local7 = arg0.method2349(0, 0);
			if (local7 == null) {
				return false;
			}
			method3651(local7);
			aBoolean350 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)I")
	public static int method3655(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4421) {
			local8 = 8 - anInt4421;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray53[anInt4414] >> anInt4421 & local14) << local3;
			anInt4421 = 0;
			anInt4414++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray53[anInt4414] >> anInt4421 & local8) << local3;
			anInt4421 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!hh;II)Lclient!mu;")
	public static Class1_Sub29 method3657(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3654(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2349(arg1, arg2);
			return local16 == null ? null : new Class1_Sub29(local16);
		} else {
			arg0.method2354(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)F")
	public static float method3658(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([BI)V")
	public static void method3661(@OriginalArg(0) byte[] arg0) {
		aByteArray53 = arg0;
		anInt4414 = 0;
		anInt4421 = 0;
	}
}
