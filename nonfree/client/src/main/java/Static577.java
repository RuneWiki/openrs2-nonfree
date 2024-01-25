import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
	public static int anInt9328;

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
	private static int anInt9330;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "[F")
	public static float[] aFloatArray105;

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "[F")
	public static float[] aFloatArray106;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "[Lclient!sv;")
	public static Class316[] aClass316Array1;

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "[F")
	public static float[] aFloatArray107;

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "[F")
	public static float[] aFloatArray108;

	@OriginalMember(owner = "client!wda", name = "w", descriptor = "[B")
	private static byte[] aByteArray100;

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "[F")
	public static float[] aFloatArray109;

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "[F")
	public static float[] aFloatArray110;

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "I")
	public static int anInt9332;

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "[F")
	public static float[] aFloatArray111;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "[Lclient!uba;")
	public static Class333[] aClass333Array1;

	@OriginalMember(owner = "client!wda", name = "F", descriptor = "[I")
	public static int[] anIntArray602;

	@OriginalMember(owner = "client!wda", name = "J", descriptor = "[I")
	public static int[] anIntArray603;

	@OriginalMember(owner = "client!wda", name = "K", descriptor = "[Lclient!dca;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!wda", name = "L", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!wda", name = "N", descriptor = "I")
	private static int anInt9336;

	@OriginalMember(owner = "client!wda", name = "R", descriptor = "[Lclient!ts;")
	public static Class330[] aClass330Array1;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "Z")
	private static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!tf;II)Lclient!wda;")
	public static Class3_Sub50 method7744(@OriginalArg(0) Class322 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7745(arg0)) {
			@Pc(16) byte[] local16 = arg0.method6802(arg1, arg2);
			return local16 == null ? null : new Class3_Sub50(local16);
		} else {
			arg0.method6808(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!tf;)Z")
	private static boolean method7745(@OriginalArg(0) Class322 arg0) {
		if (!aBoolean728) {
			@Pc(7) byte[] local7 = arg0.method6802(0, 0);
			if (local7 == null) {
				return false;
			}
			method7750(local7);
			aBoolean728 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!tf;I)Lclient!wda;")
	public static Class3_Sub50 method7747(@OriginalArg(0) Class322 arg0, @OriginalArg(1) int arg1) {
		if (method7745(arg0)) {
			@Pc(14) byte[] local14 = arg0.method6807(arg1);
			return local14 == null ? null : new Class3_Sub50(local14);
		} else {
			arg0.method6797(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "()I")
	public static int method7749() {
		@Pc(7) int local7 = aByteArray100[anInt9330] >> anInt9336 & 0x1;
		anInt9336++;
		anInt9330 += anInt9336 >> 3;
		anInt9336 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([B)V")
	private static void method7750(@OriginalArg(0) byte[] arg0) {
		method7753(arg0);
		anInt9332 = 0x1 << method7751(4);
		anInt9328 = 0x1 << method7751(4);
		aFloatArray111 = new float[anInt9328];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9332 : anInt9328;
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
			local191 = Static565.method7622(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static297.method4423(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray106 = local39;
				aFloatArray110 = local84;
				aFloatArray109 = local136;
				anIntArray603 = local185;
			} else {
				aFloatArray107 = local39;
				aFloatArray108 = local84;
				aFloatArray105 = local136;
				anIntArray602 = local185;
			}
		}
		local24 = method7751(8) + 1;
		aClass330Array1 = new Class330[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass330Array1[local28] = new Class330();
		}
		local32 = method7751(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7751(16);
		}
		@Pc(269) int local269 = method7751(6) + 1;
		aClass333Array1 = new Class333[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass333Array1[local41] = new Class333();
		}
		@Pc(290) int local290 = method7751(6) + 1;
		aClass316Array1 = new Class316[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass316Array1[local86] = new Class316();
		}
		@Pc(311) int local311 = method7751(6) + 1;
		aClass64Array1 = new Class64[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass64Array1[local138] = new Class64();
		}
		@Pc(332) int local332 = method7751(6) + 1;
		aBooleanArray28 = new boolean[local332];
		anIntArray604 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray28[local191] = method7749() != 0;
			method7751(16);
			method7751(16);
			anIntArray604[local191] = method7751(8);
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I")
	public static int method7751(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9336) {
			local8 = 8 - anInt9336;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray100[anInt9330] >> anInt9336 & local14) << local3;
			anInt9336 = 0;
			anInt9330++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray100[anInt9330] >> anInt9336 & local8) << local3;
			anInt9336 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([BI)V")
	public static void method7753(@OriginalArg(0) byte[] arg0) {
		aByteArray100 = arg0;
		anInt9330 = 0;
		anInt9336 = 0;
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)F")
	public static float method7754(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
