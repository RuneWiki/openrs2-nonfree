import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	private static int anInt3659;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	private static int anInt3661;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "[Lclient!bd;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
	public static int anInt3662;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
	public static int anInt3663;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "[B")
	private static byte[] aByteArray48;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "[Lclient!da;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "[Lclient!ki;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Lclient!rb;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "Z")
	private static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BI)V")
	public static void method2749(@OriginalArg(0) byte[] arg0) {
		aByteArray48 = arg0;
		anInt3661 = 0;
		anInt3659 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([B)V")
	private static void method2753(@OriginalArg(0) byte[] arg0) {
		method2749(arg0);
		anInt3663 = 0x1 << method2754(4);
		anInt3662 = 0x1 << method2754(4);
		aFloatArray2 = new float[anInt3662];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3663 : anInt3662;
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
			local191 = Static28.method2156(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static162.method3436(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray7 = local39;
				aFloatArray8 = local84;
				aFloatArray6 = local136;
				anIntArray482 = local185;
			} else {
				aFloatArray4 = local39;
				aFloatArray5 = local84;
				aFloatArray9 = local136;
				anIntArray480 = local185;
			}
		}
		local24 = method2754(8) + 1;
		aClass61Array1 = new Class61[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass61Array1[local28] = new Class61();
		}
		local32 = method2754(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2754(16);
		}
		@Pc(269) int local269 = method2754(6) + 1;
		aClass18Array1 = new Class18[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass18Array1[local41] = new Class18();
		}
		@Pc(290) int local290 = method2754(6) + 1;
		aClass10Array1 = new Class10[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass10Array1[local86] = new Class10();
		}
		@Pc(311) int local311 = method2754(6) + 1;
		aClass83Array1 = new Class83[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass83Array1[local138] = new Class83();
		}
		@Pc(332) int local332 = method2754(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray481 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method2758() != 0;
			method2754(16);
			method2754(16);
			anIntArray481[local191] = method2754(8);
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
	public static int method2754(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3659) {
			local8 = 8 - anInt3659;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray48[anInt3661] >> anInt3659 & local14) << local3;
			anInt3659 = 0;
			anInt3661++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray48[anInt3661] >> anInt3659 & local8) << local3;
			anInt3659 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ai;)Z")
	private static boolean method2755(@OriginalArg(0) Class7 arg0) {
		if (!aBoolean201) {
			@Pc(7) byte[] local7 = arg0.method3242(0, 0);
			if (local7 == null) {
				return false;
			}
			method2753(local7);
			aBoolean201 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)F")
	public static float method2756(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
	public static int method2758() {
		@Pc(7) int local7 = aByteArray48[anInt3661] >> anInt3659 & 0x1;
		anInt3659++;
		anInt3661 += anInt3659 >> 3;
		anInt3659 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ai;II)Lclient!rf;")
	public static Class1_Sub25 method2759(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2755(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3242(arg1, arg2);
			return local16 == null ? null : new Class1_Sub25(local16);
		} else {
			arg0.method3247(arg1, arg2);
			return null;
		}
	}
}
