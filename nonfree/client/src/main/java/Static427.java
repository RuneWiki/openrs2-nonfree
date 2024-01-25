import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public static int anInt6948;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "[Lclient!tu;")
	public static Class240[] aClass240Array1;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "[I")
	public static int[] anIntArray509;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	private static int anInt6952;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "[Lclient!mi;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	public static int anInt6953;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "[B")
	private static byte[] aByteArray89;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
	private static int anInt6954;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "[Lclient!pm;")
	public static Class192[] aClass192Array1;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "[Lclient!cp;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!vi", name = "R", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "Z")
	private static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()I")
	public static int method5459() {
		@Pc(7) int local7 = aByteArray89[anInt6952] >> anInt6954 & 0x1;
		anInt6954++;
		anInt6952 += anInt6954 >> 3;
		anInt6954 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!bu;I)Lclient!vi;")
	public static Class3_Sub43 method5460(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1) {
		if (method5469(arg0)) {
			@Pc(14) byte[] local14 = arg0.method811(arg1);
			return local14 == null ? null : new Class3_Sub43(local14);
		} else {
			arg0.method800(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!bu;II)Lclient!vi;")
	public static Class3_Sub43 method5463(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5469(arg0)) {
			@Pc(16) byte[] local16 = arg0.method785(arg2, arg1);
			return local16 == null ? null : new Class3_Sub43(local16);
		} else {
			arg0.method808(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)F")
	public static float method5464(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([BI)V")
	public static void method5465(@OriginalArg(0) byte[] arg0) {
		aByteArray89 = arg0;
		anInt6952 = 0;
		anInt6954 = 0;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "([B)V")
	private static void method5466(@OriginalArg(0) byte[] arg0) {
		method5465(arg0);
		anInt6948 = 0x1 << method5467(4);
		anInt6953 = 0x1 << method5467(4);
		aFloatArray18 = new float[anInt6953];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6948 : anInt6953;
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
			local191 = Static63.method1284(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static203.method3180(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray25 = local39;
				aFloatArray21 = local84;
				aFloatArray22 = local136;
				anIntArray507 = local185;
			} else {
				aFloatArray24 = local39;
				aFloatArray23 = local84;
				aFloatArray19 = local136;
				anIntArray509 = local185;
			}
		}
		local24 = method5467(8) + 1;
		aClass42Array1 = new Class42[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass42Array1[local28] = new Class42();
		}
		local32 = method5467(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5467(16);
		}
		@Pc(269) int local269 = method5467(6) + 1;
		aClass240Array1 = new Class240[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass240Array1[local41] = new Class240();
		}
		@Pc(290) int local290 = method5467(6) + 1;
		aClass192Array1 = new Class192[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass192Array1[local86] = new Class192();
		}
		@Pc(311) int local311 = method5467(6) + 1;
		aClass150Array1 = new Class150[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass150Array1[local138] = new Class150();
		}
		@Pc(332) int local332 = method5467(6) + 1;
		aBooleanArray25 = new boolean[local332];
		anIntArray508 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray25[local191] = method5459() != 0;
			method5467(16);
			method5467(16);
			anIntArray508[local191] = method5467(8);
		}
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)I")
	public static int method5467(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6954) {
			local8 = 8 - anInt6954;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray89[anInt6952] >> anInt6954 & local14) << local3;
			anInt6954 = 0;
			anInt6952++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray89[anInt6952] >> anInt6954 & local8) << local3;
			anInt6954 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!bu;)Z")
	private static boolean method5469(@OriginalArg(0) Class32 arg0) {
		if (!aBoolean597) {
			@Pc(7) byte[] local7 = arg0.method785(0, 0);
			if (local7 == null) {
				return false;
			}
			method5466(local7);
			aBoolean597 = true;
		}
		return true;
	}
}
