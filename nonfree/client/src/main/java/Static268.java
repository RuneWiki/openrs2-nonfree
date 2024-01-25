import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "[Lclient!dh;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "[Lclient!si;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "[I")
	public static int[] anIntArray464;

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
	private static int anInt5109;

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
	public static int anInt5112;

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
	public static int anInt5113;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "[Lclient!ei;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "[Lclient!df;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "[B")
	private static byte[] aByteArray155;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
	private static int anInt5115;

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "[F")
	public static float[] aFloatArray20;

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "Z")
	private static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI)V")
	public static void method4569(@OriginalArg(0) byte[] arg0) {
		aByteArray155 = arg0;
		anInt5115 = 0;
		anInt5109 = 0;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "([B)V")
	private static void method4572(@OriginalArg(0) byte[] arg0) {
		method4569(arg0);
		anInt5113 = 0x1 << method4574(4);
		anInt5112 = 0x1 << method4574(4);
		aFloatArray17 = new float[anInt5112];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5113 : anInt5112;
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
			local191 = Static18.method431(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static133.method4167(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray14 = local39;
				aFloatArray15 = local84;
				aFloatArray20 = local136;
				anIntArray464 = local185;
			} else {
				aFloatArray18 = local39;
				aFloatArray13 = local84;
				aFloatArray19 = local136;
				anIntArray463 = local185;
			}
		}
		local24 = method4574(8) + 1;
		aClass186Array1 = new Class186[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass186Array1[local28] = new Class186();
		}
		local32 = method4574(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4574(16);
		}
		@Pc(269) int local269 = method4574(6) + 1;
		aClass42Array1 = new Class42[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass42Array1[local41] = new Class42();
		}
		@Pc(290) int local290 = method4574(6) + 1;
		aClass40Array1 = new Class40[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass40Array1[local86] = new Class40();
		}
		@Pc(311) int local311 = method4574(6) + 1;
		aClass50Array1 = new Class50[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass50Array1[local138] = new Class50();
		}
		@Pc(332) int local332 = method4574(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray465 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method4578() != 0;
			method4574(16);
			method4574(16);
			anIntArray465[local191] = method4574(8);
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)I")
	public static int method4574(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5109) {
			local8 = 8 - anInt5109;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray155[anInt5115] >> anInt5109 & local14) << local3;
			anInt5109 = 0;
			anInt5115++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray155[anInt5115] >> anInt5109 & local8) << local3;
			anInt5109 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)F")
	public static float method4576(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!mo;)Z")
	private static boolean method4577(@OriginalArg(0) Class143 arg0) {
		if (!aBoolean341) {
			@Pc(7) byte[] local7 = arg0.method3745(0, 0);
			if (local7 == null) {
				return false;
			}
			method4572(local7);
			aBoolean341 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "()I")
	public static int method4578() {
		@Pc(7) int local7 = aByteArray155[anInt5115] >> anInt5109 & 0x1;
		anInt5109++;
		anInt5115 += anInt5109 >> 3;
		anInt5109 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!mo;II)Lclient!qq;")
	public static Class14_Sub26 method4579(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4577(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3745(arg1, arg2);
			return local16 == null ? null : new Class14_Sub26(local16);
		} else {
			arg0.method3749(arg2, arg1);
			return null;
		}
	}
}
