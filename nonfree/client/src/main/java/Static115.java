import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "[Lclient!da;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
	private static int anInt2584;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "[Lclient!ei;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
	private static int anInt2587;

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "[Lclient!be;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "[Lclient!lf;")
	public static Class56[] aClass56Array1;

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "[B")
	private static byte[] aByteArray23;

	@OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "Z")
	private static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([BI)V")
	public static void method1773(@OriginalArg(0) byte[] arg0) {
		aByteArray23 = arg0;
		anInt2584 = 0;
		anInt2587 = 0;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)F")
	public static float method1775(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!bc;)Z")
	private static boolean method1779(@OriginalArg(0) Class1 arg0) {
		if (!aBoolean100) {
			@Pc(7) byte[] local7 = arg0.method60(0, 0);
			if (local7 == null) {
				return false;
			}
			method1782(local7);
			aBoolean100 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
	public static int method1780() {
		@Pc(7) int local7 = aByteArray23[anInt2584] >> anInt2587 & 0x1;
		anInt2587++;
		anInt2584 += anInt2587 >> 3;
		anInt2587 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)I")
	public static int method1781(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2587) {
			local8 = 8 - anInt2587;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray23[anInt2584] >> anInt2587 & local14) << local3;
			anInt2587 = 0;
			anInt2584++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray23[anInt2584] >> anInt2587 & local8) << local3;
			anInt2587 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "([B)V")
	private static void method1782(@OriginalArg(0) byte[] arg0) {
		method1773(arg0);
		anInt2586 = 0x1 << method1781(4);
		anInt2591 = 0x1 << method1781(4);
		aFloatArray3 = new float[anInt2591];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2586 : anInt2591;
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
			local191 = Static170.method2729(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static148.method2369(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray7 = local39;
				aFloatArray5 = local84;
				aFloatArray6 = local136;
				anIntArray332 = local185;
			} else {
				aFloatArray2 = local39;
				aFloatArray8 = local84;
				aFloatArray9 = local136;
				anIntArray333 = local185;
			}
		}
		local24 = method1781(8) + 1;
		aClass11Array1 = new Class11[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass11Array1[local28] = new Class11();
		}
		local32 = method1781(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1781(16);
		}
		@Pc(269) int local269 = method1781(6) + 1;
		aClass25Array1 = new Class25[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass25Array1[local41] = new Class25();
		}
		@Pc(290) int local290 = method1781(6) + 1;
		aClass56Array1 = new Class56[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass56Array1[local86] = new Class56();
		}
		@Pc(311) int local311 = method1781(6) + 1;
		aClass17Array1 = new Class17[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass17Array1[local138] = new Class17();
		}
		@Pc(332) int local332 = method1781(6) + 1;
		aBooleanArray15 = new boolean[local332];
		anIntArray331 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray15[local191] = method1780() != 0;
			method1781(16);
			method1781(16);
			anIntArray331[local191] = method1781(8);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!bc;II)Lclient!mi;")
	public static Class3_Sub18 method1783(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1779(arg0)) {
			@Pc(16) byte[] local16 = arg0.method60(arg1, arg2);
			return local16 == null ? null : new Class3_Sub18(local16);
		} else {
			arg0.method52(arg1, arg2);
			return null;
		}
	}
}
