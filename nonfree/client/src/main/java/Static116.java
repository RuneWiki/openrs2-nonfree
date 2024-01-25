import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "[Lclient!wda;")
	public static Class355[] aClass355Array1;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	private static int anInt2642;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
	private static int anInt2643;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "[Lclient!tfa;")
	public static Class313[] aClass313Array1;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	public static int anInt2646;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "[Lclient!naa;")
	public static Class228[] aClass228Array1;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "[Lclient!ida;")
	public static Class147[] aClass147Array1;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
	private static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	public static int method2115(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2642) {
			local8 = 8 - anInt2642;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray18[anInt2643] >> anInt2642 & local14) << local3;
			anInt2642 = 0;
			anInt2643++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray18[anInt2643] >> anInt2642 & local8) << local3;
			anInt2642 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vo;I)Lclient!ee;")
	public static Class4_Sub12 method2118(@OriginalArg(0) Class348 arg0, @OriginalArg(1) int arg1) {
		if (method2122(arg0)) {
			@Pc(14) byte[] local14 = arg0.method7969(arg1);
			return local14 == null ? null : new Class4_Sub12(local14);
		} else {
			arg0.method7960(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
	public static void method2119(@OriginalArg(0) byte[] arg0) {
		aByteArray18 = arg0;
		anInt2643 = 0;
		anInt2642 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)F")
	public static float method2120(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vo;)Z")
	private static boolean method2122(@OriginalArg(0) Class348 arg0) {
		if (!aBoolean205) {
			@Pc(7) byte[] local7 = arg0.method7964(0, 0);
			if (local7 == null) {
				return false;
			}
			method2123(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "([B)V")
	private static void method2123(@OriginalArg(0) byte[] arg0) {
		method2119(arg0);
		anInt2649 = 0x1 << method2115(4);
		anInt2646 = 0x1 << method2115(4);
		aFloatArray31 = new float[anInt2646];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2649 : anInt2646;
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
			local191 = Static507.method7317(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static270.method4366(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray29 = local39;
				aFloatArray28 = local84;
				aFloatArray27 = local136;
				anIntArray123 = local185;
			} else {
				aFloatArray32 = local39;
				aFloatArray34 = local84;
				aFloatArray30 = local136;
				anIntArray124 = local185;
			}
		}
		local24 = method2115(8) + 1;
		aClass228Array1 = new Class228[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass228Array1[local28] = new Class228();
		}
		local32 = method2115(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2115(16);
		}
		@Pc(269) int local269 = method2115(6) + 1;
		aClass147Array1 = new Class147[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass147Array1[local41] = new Class147();
		}
		@Pc(290) int local290 = method2115(6) + 1;
		aClass355Array1 = new Class355[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass355Array1[local86] = new Class355();
		}
		@Pc(311) int local311 = method2115(6) + 1;
		aClass313Array1 = new Class313[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass313Array1[local138] = new Class313();
		}
		@Pc(332) int local332 = method2115(6) + 1;
		aBooleanArray4 = new boolean[local332];
		anIntArray122 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray4[local191] = method2125() != 0;
			method2115(16);
			method2115(16);
			anIntArray122[local191] = method2115(8);
		}
		aBoolean205 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vo;II)Lclient!ee;")
	public static Class4_Sub12 method2124(@OriginalArg(0) Class348 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2122(arg0)) {
			@Pc(16) byte[] local16 = arg0.method7964(arg2, arg1);
			return local16 == null ? null : new Class4_Sub12(local16);
		} else {
			arg0.method7972(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()I")
	public static int method2125() {
		@Pc(7) int local7 = aByteArray18[anInt2643] >> anInt2642 & 0x1;
		anInt2642++;
		anInt2643 += anInt2642 >> 3;
		anInt2642 &= 0x7;
		return local7;
	}
}
