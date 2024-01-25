import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	private static int anInt3723;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	public static int anInt3726;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	public static int anInt3727;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "[Lclient!oba;")
	public static Class272[] aClass272Array1;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "[Lclient!uga;")
	public static Class373[] aClass373Array1;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "[Lclient!gaa;")
	public static Class129[] aClass129Array1;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[B")
	private static byte[] aByteArray37;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	private static int anInt3733;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "[Lclient!iq;")
	public static Class185[] aClass185Array1;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Z")
	private static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "([B)V")
	private static void method3363(@OriginalArg(0) byte[] arg0) {
		method3372(arg0);
		anInt3727 = 0x1 << method3367(4);
		anInt3726 = 0x1 << method3367(4);
		aFloatArray26 = new float[anInt3726];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3727 : anInt3726;
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
			local191 = Static462.method6277(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static585.method7558(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray28 = local39;
				aFloatArray22 = local84;
				aFloatArray25 = local136;
				anIntArray271 = local185;
			} else {
				aFloatArray24 = local39;
				aFloatArray27 = local84;
				aFloatArray21 = local136;
				anIntArray273 = local185;
			}
		}
		local24 = method3367(8) + 1;
		aClass272Array1 = new Class272[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass272Array1[local28] = new Class272();
		}
		local32 = method3367(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3367(16);
		}
		@Pc(269) int local269 = method3367(6) + 1;
		aClass129Array1 = new Class129[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass129Array1[local41] = new Class129();
		}
		@Pc(290) int local290 = method3367(6) + 1;
		aClass373Array1 = new Class373[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass373Array1[local86] = new Class373();
		}
		@Pc(311) int local311 = method3367(6) + 1;
		aClass185Array1 = new Class185[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass185Array1[local138] = new Class185();
		}
		@Pc(332) int local332 = method3367(6) + 1;
		aBooleanArray6 = new boolean[local332];
		anIntArray272 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray6[local191] = method3368() != 0;
			method3367(16);
			method3367(16);
			anIntArray272[local191] = method3367(8);
		}
		aBoolean229 = true;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)F")
	public static float method3365(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ik;I)Lclient!hb;")
	public static Class3_Sub27 method3366(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1) {
		if (method3370(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3961(arg1);
			return local14 == null ? null : new Class3_Sub27(local14);
		} else {
			arg0.method3964(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
	public static int method3367(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3723) {
			local8 = 8 - anInt3723;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray37[anInt3733] >> anInt3723 & local14) << local3;
			anInt3723 = 0;
			anInt3733++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray37[anInt3733] >> anInt3723 & local8) << local3;
			anInt3723 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()I")
	public static int method3368() {
		@Pc(7) int local7 = aByteArray37[anInt3733] >> anInt3723 & 0x1;
		anInt3723++;
		anInt3733 += anInt3723 >> 3;
		anInt3723 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ik;)Z")
	private static boolean method3370(@OriginalArg(0) Class182 arg0) {
		if (!aBoolean229) {
			@Pc(7) byte[] local7 = arg0.method3985(0, 0);
			if (local7 == null) {
				return false;
			}
			method3363(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ik;II)Lclient!hb;")
	public static Class3_Sub27 method3371(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3370(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3985(arg2, arg1);
			return local16 == null ? null : new Class3_Sub27(local16);
		} else {
			arg0.method3986(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BI)V")
	public static void method3372(@OriginalArg(0) byte[] arg0) {
		aByteArray37 = arg0;
		anInt3733 = 0;
		anInt3723 = 0;
	}
}
