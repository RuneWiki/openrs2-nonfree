import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!li", name = "q", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	private static int anInt2672;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!li", name = "B", descriptor = "I")
	public static int anInt2676;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "[Lclient!ia;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!li", name = "G", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "I")
	public static int anInt2677;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!li", name = "K", descriptor = "[Lclient!ne;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "[Lclient!fg;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!li", name = "O", descriptor = "[Lclient!ed;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!li", name = "U", descriptor = "I")
	private static int anInt2680;

	@OriginalMember(owner = "client!li", name = "V", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!li", name = "W", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "Z")
	private static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!sd;)Z")
	private static boolean method2011(@OriginalArg(0) Class60 arg0) {
		if (!aBoolean107) {
			@Pc(7) byte[] local7 = arg0.method2340(0, 0);
			if (local7 == null) {
				return false;
			}
			method2015(local7);
			aBoolean107 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!sd;II)Lclient!li;")
	public static Class1_Sub18 method2013(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2011(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2340(arg2, arg1);
			return local16 == null ? null : new Class1_Sub18(local16);
		} else {
			arg0.method2317(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([B)V")
	private static void method2015(@OriginalArg(0) byte[] arg0) {
		method2019(arg0);
		anInt2676 = 0x1 << method2016(4);
		anInt2677 = 0x1 << method2016(4);
		aFloatArray8 = new float[anInt2677];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2676 : anInt2677;
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
			local191 = Static131.method2505(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static67.method1156(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray9 = local39;
				aFloatArray2 = local84;
				aFloatArray7 = local136;
				anIntArray304 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray6 = local84;
				aFloatArray5 = local136;
				anIntArray303 = local185;
			}
		}
		local24 = method2016(8) + 1;
		aClass27Array1 = new Class27[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass27Array1[local28] = new Class27();
		}
		local32 = method2016(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2016(16);
		}
		@Pc(269) int local269 = method2016(6) + 1;
		aClass38Array1 = new Class38[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass38Array1[local41] = new Class38();
		}
		@Pc(290) int local290 = method2016(6) + 1;
		aClass24Array1 = new Class24[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass24Array1[local86] = new Class24();
		}
		@Pc(311) int local311 = method2016(6) + 1;
		aClass61Array1 = new Class61[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass61Array1[local138] = new Class61();
		}
		@Pc(332) int local332 = method2016(6) + 1;
		aBooleanArray14 = new boolean[local332];
		anIntArray305 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray14[local191] = method2018() != 0;
			method2016(16);
			method2016(16);
			anIntArray305[local191] = method2016(8);
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I")
	public static int method2016(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2680) {
			local8 = 8 - anInt2680;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray33[anInt2672] >> anInt2680 & local14) << local3;
			anInt2680 = 0;
			anInt2672++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray33[anInt2672] >> anInt2680 & local8) << local3;
			anInt2680 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "()I")
	public static int method2018() {
		@Pc(7) int local7 = aByteArray33[anInt2672] >> anInt2680 & 0x1;
		anInt2680++;
		anInt2672 += anInt2680 >> 3;
		anInt2680 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([BI)V")
	public static void method2019(@OriginalArg(0) byte[] arg0) {
		aByteArray33 = arg0;
		anInt2672 = 0;
		anInt2680 = 0;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)F")
	public static float method2021(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
