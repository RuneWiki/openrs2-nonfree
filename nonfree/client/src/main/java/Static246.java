import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[Lclient!gt;")
	public static Class88[] aClass88Array1;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray43;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "[F")
	public static float[] aFloatArray22;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
	private static int anInt4912;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "[Lclient!vd;")
	public static Class238[] aClass238Array1;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
	private static int anInt4915;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public static int anInt4916;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "[Lclient!p;")
	public static Class175[] aClass175Array1;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[Lclient!pt;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "[B")
	private static byte[] aByteArray58;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)F", line = 5)
	public static float method4513(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I", line = 18)
	public static int method4514(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4912) {
			local8 = 8 - anInt4912;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray58[anInt4915] >> anInt4912 & local14) << local3;
			anInt4912 = 0;
			anInt4915++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray58[anInt4915] >> anInt4912 & local8) << local3;
			anInt4912 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([B)V", line = 45)
	private static void method4515(@OriginalArg(0) byte[] arg0) {
		method4518(arg0);
		anInt4916 = 0x1 << method4514(4);
		anInt4913 = 0x1 << method4514(4);
		aFloatArray23 = new float[anInt4913];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4916 : anInt4913;
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
			local191 = Static264.method4930(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static127.method6072(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray26 = local39;
				aFloatArray27 = local84;
				aFloatArray25 = local136;
				anIntArray335 = local185;
			} else {
				aFloatArray28 = local39;
				aFloatArray24 = local84;
				aFloatArray22 = local136;
				anIntArray337 = local185;
			}
		}
		local24 = method4514(8) + 1;
		aClass175Array1 = new Class175[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass175Array1[local28] = new Class175();
		}
		local32 = method4514(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4514(16);
		}
		@Pc(269) int local269 = method4514(6) + 1;
		aClass238Array1 = new Class238[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass238Array1[local41] = new Class238();
		}
		@Pc(290) int local290 = method4514(6) + 1;
		aClass186Array1 = new Class186[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass186Array1[local86] = new Class186();
		}
		@Pc(311) int local311 = method4514(6) + 1;
		aClass88Array1 = new Class88[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass88Array1[local138] = new Class88();
		}
		@Pc(332) int local332 = method4514(6) + 1;
		aBooleanArray43 = new boolean[local332];
		anIntArray336 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray43[local191] = method4523() != 0;
			method4514(16);
			method4514(16);
			anIntArray336[local191] = method4514(8);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)V", line = 659)
	public static void method4518(@OriginalArg(0) byte[] arg0) {
		aByteArray58 = arg0;
		anInt4915 = 0;
		anInt4912 = 0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!r;II)Lclient!pf;", line = 752)
	public static Class2_Sub27 method4521(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4522(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5090(arg2, arg1);
			return local16 == null ? null : new Class2_Sub27(local16);
		} else {
			arg0.method5089(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!r;)Z", line = 767)
	private static boolean method4522(@OriginalArg(0) Class197 arg0) {
		if (!Class2_Sub27.aBoolean368) {
			@Pc(7) byte[] local7 = arg0.method5090(0, 0);
			if (local7 == null) {
				return false;
			}
			method4515(local7);
			Class2_Sub27.aBoolean368 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()I", line = 792)
	public static int method4523() {
		@Pc(7) int local7 = aByteArray58[anInt4915] >> anInt4912 & 0x1;
		anInt4912++;
		anInt4915 += anInt4912 >> 3;
		anInt4912 &= 0x7;
		return local7;
	}
}
