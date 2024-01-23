import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	private static int anInt4038;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
	private static int anInt4040;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "[Lclient!bg;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "[Lclient!jb;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	public static int anInt4041;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "[B")
	private static byte[] aByteArray56;

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "[Lclient!hf;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!rj", name = "W", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
	public static int anInt4047;

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "Z")
	private static boolean aBoolean248 = false;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "()I")
	public static int method2781() {
		@Pc(7) int local7 = aByteArray56[anInt4038] >> anInt4040 & 0x1;
		anInt4040++;
		anInt4038 += anInt4040 >> 3;
		anInt4040 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "([B)V")
	private static void method2782(@OriginalArg(0) byte[] arg0) {
		method2783(arg0);
		anInt4047 = 0x1 << method2786(4);
		anInt4041 = 0x1 << method2786(4);
		aFloatArray9 = new float[anInt4041];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4047 : anInt4041;
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
			local191 = Static50.method1506(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static202.method1218(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray8 = local39;
				aFloatArray2 = local84;
				aFloatArray5 = local136;
				anIntArray422 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray4 = local84;
				aFloatArray7 = local136;
				anIntArray424 = local185;
			}
		}
		local24 = method2786(8) + 1;
		aClass13Array1 = new Class13[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass13Array1[local28] = new Class13();
		}
		local32 = method2786(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2786(16);
		}
		@Pc(269) int local269 = method2786(6) + 1;
		aClass48Array1 = new Class48[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass48Array1[local41] = new Class48();
		}
		@Pc(290) int local290 = method2786(6) + 1;
		aClass4Array1 = new Class4[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass4Array1[local86] = new Class4();
		}
		@Pc(311) int local311 = method2786(6) + 1;
		aClass40Array1 = new Class40[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass40Array1[local138] = new Class40();
		}
		@Pc(332) int local332 = method2786(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray423 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method2781() != 0;
			method2786(16);
			method2786(16);
			anIntArray423[local191] = method2786(8);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([BI)V")
	public static void method2783(@OriginalArg(0) byte[] arg0) {
		aByteArray56 = arg0;
		anInt4038 = 0;
		anInt4040 = 0;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)F")
	public static float method2784(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!nb;)Z")
	private static boolean method2785(@OriginalArg(0) Class15 arg0) {
		if (!aBoolean248) {
			@Pc(7) byte[] local7 = arg0.method387(0, 0);
			if (local7 == null) {
				return false;
			}
			method2782(local7);
			aBoolean248 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
	public static int method2786(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4040) {
			local8 = 8 - anInt4040;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray56[anInt4038] >> anInt4040 & local14) << local3;
			anInt4040 = 0;
			anInt4038++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray56[anInt4038] >> anInt4040 & local8) << local3;
			anInt4040 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!nb;II)Lclient!rj;")
	public static Class2_Sub24 method2787(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2785(arg0)) {
			@Pc(16) byte[] local16 = arg0.method387(arg2, arg1);
			return local16 == null ? null : new Class2_Sub24(local16);
		} else {
			arg0.method409(arg1, arg2);
			return null;
		}
	}
}
