import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
	public static int anInt9311;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "[I")
	public static int[] anIntArray585;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "[F")
	public static float[] aFloatArray81;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "[F")
	public static float[] aFloatArray82;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "[F")
	public static float[] aFloatArray83;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
	private static int anInt9313;

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "[B")
	private static byte[] aByteArray97;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lclient!is;")
	public static Class163[] aClass163Array1;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "[Lclient!ev;")
	public static Class89[] aClass89Array1;

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "[F")
	public static float[] aFloatArray85;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "[F")
	public static float[] aFloatArray86;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "[Lclient!uu;")
	public static Class338[] aClass338Array1;

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "[F")
	public static float[] aFloatArray87;

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "[I")
	public static int[] anIntArray586;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
	private static int anInt9318;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
	public static int anInt9319;

	@OriginalMember(owner = "client!vp", name = "M", descriptor = "[F")
	public static float[] aFloatArray88;

	@OriginalMember(owner = "client!vp", name = "N", descriptor = "[Lclient!mo;")
	public static Class224[] aClass224Array1;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "Z")
	private static boolean aBoolean695 = false;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)F")
	public static float method7590(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()I")
	public static int method7591() {
		@Pc(7) int local7 = aByteArray97[anInt9318] >> anInt9313 & 0x1;
		anInt9313++;
		anInt9318 += anInt9313 >> 3;
		anInt9313 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!sea;II)Lclient!vp;")
	public static Class1_Sub49 method7593(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7596(arg0)) {
			@Pc(16) byte[] local16 = arg0.method6569(arg1, arg2);
			return local16 == null ? null : new Class1_Sub49(local16);
		} else {
			arg0.method6545(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!sea;I)Lclient!vp;")
	public static Class1_Sub49 method7595(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1) {
		if (method7596(arg0)) {
			@Pc(14) byte[] local14 = arg0.method6547(arg1);
			return local14 == null ? null : new Class1_Sub49(local14);
		} else {
			arg0.method6538(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!sea;)Z")
	private static boolean method7596(@OriginalArg(0) Class308 arg0) {
		if (!aBoolean695) {
			@Pc(7) byte[] local7 = arg0.method6569(0, 0);
			if (local7 == null) {
				return false;
			}
			method7600(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([BI)V")
	public static void method7597(@OriginalArg(0) byte[] arg0) {
		aByteArray97 = arg0;
		anInt9318 = 0;
		anInt9313 = 0;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I")
	public static int method7598(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9313) {
			local8 = 8 - anInt9313;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray97[anInt9318] >> anInt9313 & local14) << local3;
			anInt9313 = 0;
			anInt9318++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray97[anInt9318] >> anInt9313 & local8) << local3;
			anInt9313 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([B)V")
	private static void method7600(@OriginalArg(0) byte[] arg0) {
		method7597(arg0);
		anInt9311 = 0x1 << method7598(4);
		anInt9319 = 0x1 << method7598(4);
		aFloatArray82 = new float[anInt9319];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9311 : anInt9319;
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
			local191 = Static77.method7407(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static28.method558(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray81 = local39;
				aFloatArray85 = local84;
				aFloatArray86 = local136;
				anIntArray587 = local185;
			} else {
				aFloatArray87 = local39;
				aFloatArray88 = local84;
				aFloatArray83 = local136;
				anIntArray586 = local185;
			}
		}
		local24 = method7598(8) + 1;
		aClass338Array1 = new Class338[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass338Array1[local28] = new Class338();
		}
		local32 = method7598(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7598(16);
		}
		@Pc(269) int local269 = method7598(6) + 1;
		aClass89Array1 = new Class89[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass89Array1[local41] = new Class89();
		}
		@Pc(290) int local290 = method7598(6) + 1;
		aClass224Array1 = new Class224[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass224Array1[local86] = new Class224();
		}
		@Pc(311) int local311 = method7598(6) + 1;
		aClass163Array1 = new Class163[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass163Array1[local138] = new Class163();
		}
		@Pc(332) int local332 = method7598(6) + 1;
		aBooleanArray38 = new boolean[local332];
		anIntArray585 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray38[local191] = method7591() != 0;
			method7598(16);
			method7598(16);
			anIntArray585[local191] = method7598(8);
		}
		aBoolean695 = true;
	}
}
