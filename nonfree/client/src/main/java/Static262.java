import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "[Lclient!ct;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	public static int anInt5466;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "[Lclient!tq;")
	public static Class196[] aClass196Array1;

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "[Lclient!ha;")
	public static Class87[] aClass87Array1;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "[Lclient!hk;")
	public static Class92[] aClass92Array1;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public static int anInt5468;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "[B")
	private static byte[] aByteArray76;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	private static int anInt5470;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
	public static int[] anIntArray426;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	private static int anInt5472;

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Z")
	private static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!iq;II)Lclient!qd;")
	public static Class2_Sub32 method4623(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4631(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2756(arg1, arg2);
			return local16 == null ? null : new Class2_Sub32(local16);
		} else {
			arg0.method2772(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()I")
	public static int method4624() {
		@Pc(7) int local7 = aByteArray76[anInt5472] >> anInt5470 & 0x1;
		anInt5470++;
		anInt5472 += anInt5470 >> 3;
		anInt5470 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BI)V")
	public static void method4625(@OriginalArg(0) byte[] arg0) {
		aByteArray76 = arg0;
		anInt5472 = 0;
		anInt5470 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "([B)V")
	private static void method4627(@OriginalArg(0) byte[] arg0) {
		method4625(arg0);
		anInt5466 = 0x1 << method4628(4);
		anInt5468 = 0x1 << method4628(4);
		aFloatArray28 = new float[anInt5468];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5466 : anInt5468;
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
			local191 = Static132.method2566(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static145.method2831(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray23 = local39;
				aFloatArray27 = local84;
				aFloatArray29 = local136;
				anIntArray426 = local185;
			} else {
				aFloatArray24 = local39;
				aFloatArray25 = local84;
				aFloatArray26 = local136;
				anIntArray425 = local185;
			}
		}
		local24 = method4628(8) + 1;
		aClass196Array1 = new Class196[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass196Array1[local28] = new Class196();
		}
		local32 = method4628(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4628(16);
		}
		@Pc(269) int local269 = method4628(6) + 1;
		aClass87Array1 = new Class87[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass87Array1[local41] = new Class87();
		}
		@Pc(290) int local290 = method4628(6) + 1;
		aClass92Array1 = new Class92[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass92Array1[local86] = new Class92();
		}
		@Pc(311) int local311 = method4628(6) + 1;
		aClass48Array1 = new Class48[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass48Array1[local138] = new Class48();
		}
		@Pc(332) int local332 = method4628(6) + 1;
		aBooleanArray21 = new boolean[local332];
		anIntArray427 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray21[local191] = method4624() != 0;
			method4628(16);
			method4628(16);
			anIntArray427[local191] = method4628(8);
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
	public static int method4628(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5470) {
			local8 = 8 - anInt5470;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray76[anInt5472] >> anInt5470 & local14) << local3;
			anInt5470 = 0;
			anInt5472++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray76[anInt5472] >> anInt5470 & local8) << local3;
			anInt5470 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!iq;)Z")
	private static boolean method4631(@OriginalArg(0) Class104 arg0) {
		if (!aBoolean479) {
			@Pc(7) byte[] local7 = arg0.method2756(0, 0);
			if (local7 == null) {
				return false;
			}
			method4627(local7);
			aBoolean479 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)F")
	public static float method4632(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
