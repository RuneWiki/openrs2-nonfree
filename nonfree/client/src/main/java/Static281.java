import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	private static int anInt5303;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "[Lclient!eca;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "[F")
	public static float[] aFloatArray43;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "[F")
	public static float[] aFloatArray44;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "[F")
	public static float[] aFloatArray45;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "[B")
	private static byte[] aByteArray127;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "[F")
	public static float[] aFloatArray46;

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kg", name = "E", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "[Lclient!rg;")
	public static Class282[] aClass282Array1;

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
	public static int anInt5305;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "[Lclient!vw;")
	public static Class351[] aClass351Array1;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
	public static int anInt5308;

	@OriginalMember(owner = "client!kg", name = "N", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "[Lclient!hn;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "[F")
	public static float[] aFloatArray50;

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
	private static int anInt5311;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Z")
	private static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
	public static int method4237() {
		@Pc(7) int local7 = aByteArray127[anInt5311] >> anInt5303 & 0x1;
		anInt5303++;
		anInt5311 += anInt5303 >> 3;
		anInt5303 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)F")
	public static float method4238(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ri;)Z")
	private static boolean method4241(@OriginalArg(0) Class284 arg0) {
		if (!aBoolean360) {
			@Pc(7) byte[] local7 = arg0.method6331(0, 0);
			if (local7 == null) {
				return false;
			}
			method4242(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([B)V")
	private static void method4242(@OriginalArg(0) byte[] arg0) {
		method4246(arg0);
		anInt5305 = 0x1 << method4245(4);
		anInt5308 = 0x1 << method4245(4);
		aFloatArray44 = new float[anInt5308];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5305 : anInt5308;
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
			local191 = Static402.method5690(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static430.method5959(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray50 = local39;
				aFloatArray48 = local84;
				aFloatArray46 = local136;
				anIntArray245 = local185;
			} else {
				aFloatArray43 = local39;
				aFloatArray49 = local84;
				aFloatArray45 = local136;
				anIntArray247 = local185;
			}
		}
		local24 = method4245(8) + 1;
		aClass83Array1 = new Class83[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass83Array1[local28] = new Class83();
		}
		local32 = method4245(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4245(16);
		}
		@Pc(269) int local269 = method4245(6) + 1;
		aClass128Array1 = new Class128[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass128Array1[local41] = new Class128();
		}
		@Pc(290) int local290 = method4245(6) + 1;
		aClass282Array1 = new Class282[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass282Array1[local86] = new Class282();
		}
		@Pc(311) int local311 = method4245(6) + 1;
		aClass351Array1 = new Class351[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass351Array1[local138] = new Class351();
		}
		@Pc(332) int local332 = method4245(6) + 1;
		aBooleanArray15 = new boolean[local332];
		anIntArray246 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray15[local191] = method4237() != 0;
			method4245(16);
			method4245(16);
			anIntArray246[local191] = method4245(8);
		}
		aBoolean360 = true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ri;II)Lclient!kg;")
	public static Class3_Sub32 method4244(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4241(arg0)) {
			@Pc(16) byte[] local16 = arg0.method6331(arg1, arg2);
			return local16 == null ? null : new Class3_Sub32(local16);
		} else {
			arg0.method6336(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)I")
	public static int method4245(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5303) {
			local8 = 8 - anInt5303;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray127[anInt5311] >> anInt5303 & local14) << local3;
			anInt5303 = 0;
			anInt5311++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray127[anInt5311] >> anInt5303 & local8) << local3;
			anInt5303 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BI)V")
	public static void method4246(@OriginalArg(0) byte[] arg0) {
		aByteArray127 = arg0;
		anInt5311 = 0;
		anInt5303 = 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ri;I)Lclient!kg;")
	public static Class3_Sub32 method4248(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1) {
		if (method4241(arg0)) {
			@Pc(14) byte[] local14 = arg0.method6357(arg1);
			return local14 == null ? null : new Class3_Sub32(local14);
		} else {
			arg0.method6347(arg1);
			return null;
		}
	}
}
