import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gga", name = "v", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!gga", name = "R", descriptor = "[Lclient!ij;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!gga", name = "u", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!gga", name = "S", descriptor = "I")
	public static int anInt3410;

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!gga", name = "s", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!gga", name = "J", descriptor = "[Lclient!iba;")
	public static Class163[] aClass163Array1;

	@OriginalMember(owner = "client!gga", name = "K", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!gga", name = "F", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!gga", name = "O", descriptor = "I")
	public static int anInt3413;

	@OriginalMember(owner = "client!gga", name = "N", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "[Lclient!ig;")
	public static Class167[] aClass167Array1;

	@OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
	private static int anInt3415;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!gga", name = "E", descriptor = "I")
	private static int anInt3416;

	@OriginalMember(owner = "client!gga", name = "G", descriptor = "[F")
	public static float[] aFloatArray36;

	@OriginalMember(owner = "client!gga", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!gga", name = "C", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!gga", name = "T", descriptor = "[Lclient!tc;")
	public static Class344[] aClass344Array1;

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "Z")
	private static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!gda;)Z")
	private static boolean method3141(@OriginalArg(0) Class126 arg0) {
		if (!aBoolean245) {
			@Pc(7) byte[] local7 = arg0.method3086(0, 0);
			if (local7 == null) {
				return false;
			}
			method3148(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BI)V")
	public static void method3142(@OriginalArg(0) byte[] arg0) {
		aByteArray32 = arg0;
		anInt3415 = 0;
		anInt3416 = 0;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)F")
	public static float method3143(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!gda;II)Lclient!gga;")
	public static Class5_Sub22 method3146(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3141(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3086(arg2, arg1);
			return local16 == null ? null : new Class5_Sub22(local16);
		} else {
			arg0.method3068(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "([B)V")
	private static void method3148(@OriginalArg(0) byte[] arg0) {
		method3142(arg0);
		anInt3413 = 0x1 << method3151(4);
		anInt3410 = 0x1 << method3151(4);
		aFloatArray35 = new float[anInt3410];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3413 : anInt3410;
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
			local191 = Static281.method4513(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static83.method1336(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray37 = local39;
				aFloatArray34 = local84;
				aFloatArray36 = local136;
				anIntArray157 = local185;
			} else {
				aFloatArray33 = local39;
				aFloatArray31 = local84;
				aFloatArray32 = local136;
				anIntArray158 = local185;
			}
		}
		local24 = method3151(8) + 1;
		aClass167Array1 = new Class167[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass167Array1[local28] = new Class167();
		}
		local32 = method3151(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3151(16);
		}
		@Pc(269) int local269 = method3151(6) + 1;
		aClass344Array1 = new Class344[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass344Array1[local41] = new Class344();
		}
		@Pc(290) int local290 = method3151(6) + 1;
		aClass163Array1 = new Class163[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass163Array1[local86] = new Class163();
		}
		@Pc(311) int local311 = method3151(6) + 1;
		aClass170Array1 = new Class170[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass170Array1[local138] = new Class170();
		}
		@Pc(332) int local332 = method3151(6) + 1;
		aBooleanArray11 = new boolean[local332];
		anIntArray156 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray11[local191] = method3150() != 0;
			method3151(16);
			method3151(16);
			anIntArray156[local191] = method3151(8);
		}
		aBoolean245 = true;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!gda;I)Lclient!gga;")
	public static Class5_Sub22 method3149(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		if (method3141(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3069(arg1);
			return local14 == null ? null : new Class5_Sub22(local14);
		} else {
			arg0.method3077(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "()I")
	public static int method3150() {
		@Pc(7) int local7 = aByteArray32[anInt3415] >> anInt3416 & 0x1;
		anInt3416++;
		anInt3415 += anInt3416 >> 3;
		anInt3416 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I")
	public static int method3151(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3416) {
			local8 = 8 - anInt3416;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray32[anInt3415] >> anInt3416 & local14) << local3;
			anInt3416 = 0;
			anInt3415++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray32[anInt3415] >> anInt3416 & local8) << local3;
			anInt3416 += arg0;
		}
		return local1;
	}
}
