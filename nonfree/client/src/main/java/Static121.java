import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "[Lclient!kf;")
	public static Class63[] aClass63Array1;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
	private static int anInt2667;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "[Lclient!bg;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	public static int anInt2671;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "[Lclient!vg;")
	public static Class121[] aClass121Array1;

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!lj", name = "Q", descriptor = "[Lclient!tf;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!lj", name = "R", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "[B")
	private static byte[] aByteArray23;

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private static int anInt2673;

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
	public static int anInt2676;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "Z")
	private static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!mb;II)Lclient!lj;")
	public static Class1_Sub20 method2117(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2118(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3509(arg2, arg1);
			return local16 == null ? null : new Class1_Sub20(local16);
		} else {
			arg0.method3535(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!mb;)Z")
	private static boolean method2118(@OriginalArg(0) Class70 arg0) {
		if (!aBoolean107) {
			@Pc(7) byte[] local7 = arg0.method3509(0, 0);
			if (local7 == null) {
				return false;
			}
			method2126(local7);
			aBoolean107 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I")
	public static int method2120(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2673) {
			local8 = 8 - anInt2673;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray23[anInt2667] >> anInt2673 & local14) << local3;
			anInt2673 = 0;
			anInt2667++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray23[anInt2667] >> anInt2673 & local8) << local3;
			anInt2673 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)F")
	public static float method2121(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
	public static int method2124() {
		@Pc(7) int local7 = aByteArray23[anInt2667] >> anInt2673 & 0x1;
		anInt2673++;
		anInt2667 += anInt2673 >> 3;
		anInt2673 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "([B)V")
	private static void method2126(@OriginalArg(0) byte[] arg0) {
		method2127(arg0);
		anInt2676 = 0x1 << method2120(4);
		anInt2671 = 0x1 << method2120(4);
		aFloatArray5 = new float[anInt2671];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2676 : anInt2671;
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
			local191 = Static7.method107(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static190.method3183(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray6 = local39;
				aFloatArray1 = local84;
				aFloatArray2 = local136;
				anIntArray161 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray7 = local84;
				aFloatArray3 = local136;
				anIntArray160 = local185;
			}
		}
		local24 = method2120(8) + 1;
		aClass121Array1 = new Class121[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass121Array1[local28] = new Class121();
		}
		local32 = method2120(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2120(16);
		}
		@Pc(269) int local269 = method2120(6) + 1;
		aClass110Array1 = new Class110[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass110Array1[local41] = new Class110();
		}
		@Pc(290) int local290 = method2120(6) + 1;
		aClass63Array1 = new Class63[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass63Array1[local86] = new Class63();
		}
		@Pc(311) int local311 = method2120(6) + 1;
		aClass14Array1 = new Class14[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass14Array1[local138] = new Class14();
		}
		@Pc(332) int local332 = method2120(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray159 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method2124() != 0;
			method2120(16);
			method2120(16);
			anIntArray159[local191] = method2120(8);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([BI)V")
	public static void method2127(@OriginalArg(0) byte[] arg0) {
		aByteArray23 = arg0;
		anInt2667 = 0;
		anInt2673 = 0;
	}
}
