import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	private static int anInt278;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	private static int anInt279;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "[Lclient!en;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	public static int anInt280;

	@OriginalMember(owner = "client!an", name = "v", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!an", name = "x", descriptor = "[B")
	private static byte[] aByteArray3;

	@OriginalMember(owner = "client!an", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!an", name = "D", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!an", name = "E", descriptor = "[Lclient!ij;")
	public static Class94[] aClass94Array1;

	@OriginalMember(owner = "client!an", name = "G", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!an", name = "H", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!an", name = "J", descriptor = "[Lclient!ai;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!an", name = "L", descriptor = "[Lclient!eq;")
	public static Class55[] aClass55Array1;

	@OriginalMember(owner = "client!an", name = "N", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!an", name = "O", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!an", name = "R", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!an", name = "T", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Z")
	private static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BI)V")
	public static void method331(@OriginalArg(0) byte[] arg0) {
		aByteArray3 = arg0;
		anInt278 = 0;
		anInt279 = 0;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I")
	public static int method332(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt279) {
			local8 = 8 - anInt279;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray3[anInt278] >> anInt279 & local14) << local3;
			anInt279 = 0;
			anInt278++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray3[anInt278] >> anInt279 & local8) << local3;
			anInt279 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!qj;II)Lclient!an;")
	public static Class1_Sub4 method335(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method340(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4508(arg2, arg1);
			return local16 == null ? null : new Class1_Sub4(local16);
		} else {
			arg0.method4485(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([B)V")
	private static void method336(@OriginalArg(0) byte[] arg0) {
		method331(arg0);
		anInt280 = 0x1 << method332(4);
		anInt284 = 0x1 << method332(4);
		aFloatArray7 = new float[anInt284];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt280 : anInt284;
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
			local191 = Static128.method2434(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static93.method1733(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray2 = local84;
				aFloatArray8 = local136;
				anIntArray36 = local185;
			} else {
				aFloatArray1 = local39;
				aFloatArray6 = local84;
				aFloatArray3 = local136;
				anIntArray38 = local185;
			}
		}
		local24 = method332(8) + 1;
		aClass53Array1 = new Class53[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass53Array1[local28] = new Class53();
		}
		local32 = method332(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method332(16);
		}
		@Pc(269) int local269 = method332(6) + 1;
		aClass55Array1 = new Class55[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass55Array1[local41] = new Class55();
		}
		@Pc(290) int local290 = method332(6) + 1;
		aClass94Array1 = new Class94[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass94Array1[local86] = new Class94();
		}
		@Pc(311) int local311 = method332(6) + 1;
		aClass8Array1 = new Class8[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass8Array1[local138] = new Class8();
		}
		@Pc(332) int local332 = method332(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray37 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method339() != 0;
			method332(16);
			method332(16);
			anIntArray37[local191] = method332(8);
		}
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)F")
	public static float method338(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()I")
	public static int method339() {
		@Pc(7) int local7 = aByteArray3[anInt278] >> anInt279 & 0x1;
		anInt279++;
		anInt278 += anInt279 >> 3;
		anInt279 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!qj;)Z")
	private static boolean method340(@OriginalArg(0) Class165 arg0) {
		if (!aBoolean32) {
			@Pc(7) byte[] local7 = arg0.method4508(0, 0);
			if (local7 == null) {
				return false;
			}
			method336(local7);
			aBoolean32 = true;
		}
		return true;
	}
}
