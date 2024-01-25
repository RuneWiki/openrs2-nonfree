import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "[F")
	public static float[] aFloatArray41;

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "[Lclient!vba;")
	public static Class353[] aClass353Array1;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "[F")
	public static float[] aFloatArray43;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "[F")
	public static float[] aFloatArray44;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "[Lclient!eda;")
	public static Class88[] aClass88Array1;

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
	private static int anInt4925;

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "[F")
	public static float[] aFloatArray45;

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "[B")
	private static byte[] aByteArray61;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "[Lclient!rm;")
	public static Class299[] aClass299Array1;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "[Lclient!fq;")
	public static Class111[] aClass111Array1;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "[F")
	public static float[] aFloatArray46;

	@OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
	public static int anInt4928;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "[F")
	public static float[] aFloatArray47;

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	public static int anInt4930;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
	private static int anInt4932;

	@OriginalMember(owner = "client!hp", name = "M", descriptor = "Z")
	private static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BI)V")
	public static void method4243(@OriginalArg(0) byte[] arg0) {
		aByteArray61 = arg0;
		anInt4932 = 0;
		anInt4925 = 0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)F")
	public static float method4245(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "()I")
	public static int method4247() {
		@Pc(7) int local7 = aByteArray61[anInt4932] >> anInt4925 & 0x1;
		anInt4925++;
		anInt4932 += anInt4925 >> 3;
		anInt4925 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	public static int method4248(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4925) {
			local8 = 8 - anInt4925;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray61[anInt4932] >> anInt4925 & local14) << local3;
			anInt4925 = 0;
			anInt4932++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray61[anInt4932] >> anInt4925 & local8) << local3;
			anInt4925 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "([B)V")
	private static void method4249(@OriginalArg(0) byte[] arg0) {
		method4243(arg0);
		anInt4930 = 0x1 << method4248(4);
		anInt4928 = 0x1 << method4248(4);
		aFloatArray43 = new float[anInt4928];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4930 : anInt4928;
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
			local191 = Static627.method7088(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static315.method5487(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray47 = local39;
				aFloatArray46 = local84;
				aFloatArray44 = local136;
				anIntArray250 = local185;
			} else {
				aFloatArray45 = local39;
				aFloatArray48 = local84;
				aFloatArray41 = local136;
				anIntArray248 = local185;
			}
		}
		local24 = method4248(8) + 1;
		aClass111Array1 = new Class111[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass111Array1[local28] = new Class111();
		}
		local32 = method4248(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4248(16);
		}
		@Pc(269) int local269 = method4248(6) + 1;
		aClass299Array1 = new Class299[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass299Array1[local41] = new Class299();
		}
		@Pc(290) int local290 = method4248(6) + 1;
		aClass88Array1 = new Class88[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass88Array1[local86] = new Class88();
		}
		@Pc(311) int local311 = method4248(6) + 1;
		aClass353Array1 = new Class353[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass353Array1[local138] = new Class353();
		}
		@Pc(332) int local332 = method4248(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray249 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method4247() != 0;
			method4248(16);
			method4248(16);
			anIntArray249[local191] = method4248(8);
		}
		aBoolean368 = true;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!in;)Z")
	private static boolean method4251(@OriginalArg(0) Class157 arg0) {
		if (!aBoolean368) {
			@Pc(7) byte[] local7 = arg0.method4564(0, 0);
			if (local7 == null) {
				return false;
			}
			method4249(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!in;I)Lclient!hp;")
	public static Class2_Sub22 method4252(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1) {
		if (method4251(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4569(arg1);
			return local14 == null ? null : new Class2_Sub22(local14);
		} else {
			arg0.method4575(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!in;II)Lclient!hp;")
	public static Class2_Sub22 method4254(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4251(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4564(arg1, arg2);
			return local16 == null ? null : new Class2_Sub22(local16);
		} else {
			arg0.method4574(arg1, arg2);
			return null;
		}
	}
}
