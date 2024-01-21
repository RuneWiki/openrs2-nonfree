import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "[I")
	public static int[] anIntArray199;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
	public static int anInt2620;

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "[Lclient!b;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "[Lclient!ea;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
	public static int anInt2625;

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "[B")
	private static byte[] aByteArray24;

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
	private static int anInt2627;

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "[Lclient!qb;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
	private static int anInt2629;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "Z")
	private static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)F")
	public static float method1839(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)I")
	public static int method1840(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2627) {
			local8 = 8 - anInt2627;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray24[anInt2629] >> anInt2627 & local14) << local3;
			anInt2627 = 0;
			anInt2629++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray24[anInt2629] >> anInt2627 & local8) << local3;
			anInt2627 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ab;II)Lclient!mh;")
	public static Class1_Sub18 method1842(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1844(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3265(arg1, arg2);
			return local16 == null ? null : new Class1_Sub18(local16);
		} else {
			arg0.method3247(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ab;)Z")
	private static boolean method1844(@OriginalArg(0) Class3 arg0) {
		if (!aBoolean153) {
			@Pc(7) byte[] local7 = arg0.method3265(0, 0);
			if (local7 == null) {
				return false;
			}
			method1845(local7);
			aBoolean153 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "([B)V")
	private static void method1845(@OriginalArg(0) byte[] arg0) {
		method1847(arg0);
		anInt2620 = 0x1 << method1840(4);
		anInt2625 = 0x1 << method1840(4);
		aFloatArray9 = new float[anInt2625];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2620 : anInt2625;
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
			local191 = Static117.method1727(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static175.method2874(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray2 = local39;
				aFloatArray4 = local84;
				aFloatArray8 = local136;
				anIntArray200 = local185;
			} else {
				aFloatArray5 = local39;
				aFloatArray7 = local84;
				aFloatArray6 = local136;
				anIntArray201 = local185;
			}
		}
		local24 = method1840(8) + 1;
		aClass25Array1 = new Class25[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass25Array1[local28] = new Class25();
		}
		local32 = method1840(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1840(16);
		}
		@Pc(269) int local269 = method1840(6) + 1;
		aClass2Array1 = new Class2[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass2Array1[local41] = new Class2();
		}
		@Pc(290) int local290 = method1840(6) + 1;
		aClass78Array1 = new Class78[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass78Array1[local86] = new Class78();
		}
		@Pc(311) int local311 = method1840(6) + 1;
		aClass10Array1 = new Class10[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass10Array1[local138] = new Class10();
		}
		@Pc(332) int local332 = method1840(6) + 1;
		aBooleanArray10 = new boolean[local332];
		anIntArray199 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray10[local191] = method1848() != 0;
			method1840(16);
			method1840(16);
			anIntArray199[local191] = method1840(8);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([BI)V")
	public static void method1847(@OriginalArg(0) byte[] arg0) {
		aByteArray24 = arg0;
		anInt2629 = 0;
		anInt2627 = 0;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()I")
	public static int method1848() {
		@Pc(7) int local7 = aByteArray24[anInt2629] >> anInt2627 & 0x1;
		anInt2627++;
		anInt2629 += anInt2627 >> 3;
		anInt2627 &= 0x7;
		return local7;
	}
}
