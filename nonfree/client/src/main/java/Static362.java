import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	public static int anInt6280;

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "[Lclient!bt;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "[Lclient!th;")
	public static Class321[] aClass321Array1;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "[B")
	private static byte[] aByteArray81;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
	public static int anInt6283;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "[Lclient!gs;")
	public static Class121[] aClass121Array1;

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
	private static int anInt6284;

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
	private static int anInt6286;

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "[F")
	public static float[] aFloatArray57;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "[F")
	public static float[] aFloatArray58;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "[F")
	public static float[] aFloatArray59;

	@OriginalMember(owner = "client!nq", name = "L", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "[Lclient!ma;")
	public static Class208[] aClass208Array1;

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
	private static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!om;)Z")
	private static boolean method5443(@OriginalArg(0) Class246 arg0) {
		if (!aBoolean517) {
			@Pc(7) byte[] local7 = arg0.method5653(0, 0);
			if (local7 == null) {
				return false;
			}
			method5444(local7);
			aBoolean517 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([B)V")
	private static void method5444(@OriginalArg(0) byte[] arg0) {
		method5445(arg0);
		anInt6283 = 0x1 << method5447(4);
		anInt6280 = 0x1 << method5447(4);
		aFloatArray56 = new float[anInt6280];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6283 : anInt6280;
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
			local191 = Static328.method5090(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static92.method2050(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray53 = local39;
				aFloatArray54 = local84;
				aFloatArray52 = local136;
				anIntArray496 = local185;
			} else {
				aFloatArray59 = local39;
				aFloatArray57 = local84;
				aFloatArray58 = local136;
				anIntArray495 = local185;
			}
		}
		local24 = method5447(8) + 1;
		aClass121Array1 = new Class121[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass121Array1[local28] = new Class121();
		}
		local32 = method5447(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5447(16);
		}
		@Pc(269) int local269 = method5447(6) + 1;
		aClass208Array1 = new Class208[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass208Array1[local41] = new Class208();
		}
		@Pc(290) int local290 = method5447(6) + 1;
		aClass36Array1 = new Class36[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass36Array1[local86] = new Class36();
		}
		@Pc(311) int local311 = method5447(6) + 1;
		aClass321Array1 = new Class321[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass321Array1[local138] = new Class321();
		}
		@Pc(332) int local332 = method5447(6) + 1;
		aBooleanArray26 = new boolean[local332];
		anIntArray494 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray26[local191] = method5449() != 0;
			method5447(16);
			method5447(16);
			anIntArray494[local191] = method5447(8);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([BI)V")
	public static void method5445(@OriginalArg(0) byte[] arg0) {
		aByteArray81 = arg0;
		anInt6284 = 0;
		anInt6286 = 0;
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)I")
	public static int method5447(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6286) {
			local8 = 8 - anInt6286;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray81[anInt6284] >> anInt6286 & local14) << local3;
			anInt6286 = 0;
			anInt6284++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray81[anInt6284] >> anInt6286 & local8) << local3;
			anInt6286 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "()I")
	public static int method5449() {
		@Pc(7) int local7 = aByteArray81[anInt6284] >> anInt6286 & 0x1;
		anInt6286++;
		anInt6284 += anInt6286 >> 3;
		anInt6286 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!om;II)Lclient!nq;")
	public static Class3_Sub36 method5450(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5443(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5653(arg1, arg2);
			return local16 == null ? null : new Class3_Sub36(local16);
		} else {
			arg0.method5654(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)F")
	public static float method5452(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!om;I)Lclient!nq;")
	public static Class3_Sub36 method5453(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1) {
		if (method5443(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5679(arg1);
			return local14 == null ? null : new Class3_Sub36(local14);
		} else {
			arg0.method5667(arg1);
			return null;
		}
	}
}
