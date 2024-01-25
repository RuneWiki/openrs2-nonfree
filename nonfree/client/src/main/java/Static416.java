import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "[Lclient!wu;")
	public static Class271[] aClass271Array1;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "[B")
	private static byte[] aByteArray91;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "[Lclient!ia;")
	public static Class109[] aClass109Array1;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "[F")
	public static float[] aFloatArray21;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
	private static int anInt6943;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "[Lclient!ie;")
	public static Class112[] aClass112Array1;

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
	public static int anInt6945;

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "[Lclient!hf;")
	public static Class98[] aClass98Array1;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
	private static int anInt6947;

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
	public static int anInt6948;

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!uo", name = "P", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "Z")
	private static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)I")
	public static int method5488(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6947) {
			local8 = 8 - anInt6947;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray91[anInt6943] >> anInt6947 & local14) << local3;
			anInt6947 = 0;
			anInt6943++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray91[anInt6943] >> anInt6947 & local8) << local3;
			anInt6947 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!um;)Z")
	private static boolean method5490(@OriginalArg(0) Class243 arg0) {
		if (!aBoolean465) {
			@Pc(7) byte[] local7 = arg0.method5455(0, 0);
			if (local7 == null) {
				return false;
			}
			method5495(local7);
			aBoolean465 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "()I")
	public static int method5491() {
		@Pc(7) int local7 = aByteArray91[anInt6943] >> anInt6947 & 0x1;
		anInt6947++;
		anInt6943 += anInt6947 >> 3;
		anInt6947 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)F")
	public static float method5494(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([B)V")
	private static void method5495(@OriginalArg(0) byte[] arg0) {
		method5499(arg0);
		anInt6945 = 0x1 << method5488(4);
		anInt6948 = 0x1 << method5488(4);
		aFloatArray23 = new float[anInt6948];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6945 : anInt6948;
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
			local191 = Static160.method2271(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static326.method4008(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray25 = local39;
				aFloatArray21 = local84;
				aFloatArray26 = local136;
				anIntArray472 = local185;
			} else {
				aFloatArray27 = local39;
				aFloatArray28 = local84;
				aFloatArray22 = local136;
				anIntArray473 = local185;
			}
		}
		local24 = method5488(8) + 1;
		aClass98Array1 = new Class98[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass98Array1[local28] = new Class98();
		}
		local32 = method5488(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5488(16);
		}
		@Pc(269) int local269 = method5488(6) + 1;
		aClass271Array1 = new Class271[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass271Array1[local41] = new Class271();
		}
		@Pc(290) int local290 = method5488(6) + 1;
		aClass109Array1 = new Class109[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass109Array1[local86] = new Class109();
		}
		@Pc(311) int local311 = method5488(6) + 1;
		aClass112Array1 = new Class112[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass112Array1[local138] = new Class112();
		}
		@Pc(332) int local332 = method5488(6) + 1;
		aBooleanArray25 = new boolean[local332];
		anIntArray474 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray25[local191] = method5491() != 0;
			method5488(16);
			method5488(16);
			anIntArray474[local191] = method5488(8);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!um;I)Lclient!uo;")
	public static Class5_Sub43 method5496(@OriginalArg(0) Class243 arg0, @OriginalArg(1) int arg1) {
		if (method5490(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5459(arg1);
			return local14 == null ? null : new Class5_Sub43(local14);
		} else {
			arg0.method5463(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!um;II)Lclient!uo;")
	public static Class5_Sub43 method5497(@OriginalArg(0) Class243 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5490(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5455(arg2, arg1);
			return local16 == null ? null : new Class5_Sub43(local16);
		} else {
			arg0.method5482(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([BI)V")
	public static void method5499(@OriginalArg(0) byte[] arg0) {
		aByteArray91 = arg0;
		anInt6943 = 0;
		anInt6947 = 0;
	}
}
