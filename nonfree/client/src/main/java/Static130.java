import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt3271;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[Lclient!ph;")
	public static Class106[] aClass106Array1;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[B")
	private static byte[] aByteArray42;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "[Lclient!da;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[Lclient!fk;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	private static int anInt3276;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "I")
	public static int anInt3277;

	@OriginalMember(owner = "client!la", name = "K", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "I")
	private static int anInt3279;

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "[Lclient!sd;")
	public static Class121[] aClass121Array1;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "Z")
	private static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)F")
	public static float method2469(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!hc;)Z")
	private static boolean method2470(@OriginalArg(0) Class51 arg0) {
		if (!aBoolean173) {
			@Pc(7) byte[] local7 = arg0.method1874(0, 0);
			if (local7 == null) {
				return false;
			}
			method2476(local7);
			aBoolean173 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!hc;II)Lclient!la;")
	public static Class1_Sub18 method2472(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2470(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1874(arg1, arg2);
			return local16 == null ? null : new Class1_Sub18(local16);
		} else {
			arg0.method1862(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)V")
	public static void method2475(@OriginalArg(0) byte[] arg0) {
		aByteArray42 = arg0;
		anInt3279 = 0;
		anInt3276 = 0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "([B)V")
	private static void method2476(@OriginalArg(0) byte[] arg0) {
		method2475(arg0);
		anInt3271 = 0x1 << method2477(4);
		anInt3277 = 0x1 << method2477(4);
		aFloatArray3 = new float[anInt3277];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3271 : anInt3277;
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
			local191 = Static67.method1314(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static175.method3001(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray7 = local84;
				aFloatArray8 = local136;
				anIntArray252 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray4 = local84;
				aFloatArray2 = local136;
				anIntArray251 = local185;
			}
		}
		local24 = method2477(8) + 1;
		aClass121Array1 = new Class121[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass121Array1[local28] = new Class121();
		}
		local32 = method2477(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2477(16);
		}
		@Pc(269) int local269 = method2477(6) + 1;
		aClass29Array1 = new Class29[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass29Array1[local41] = new Class29();
		}
		@Pc(290) int local290 = method2477(6) + 1;
		aClass44Array1 = new Class44[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass44Array1[local86] = new Class44();
		}
		@Pc(311) int local311 = method2477(6) + 1;
		aClass106Array1 = new Class106[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass106Array1[local138] = new Class106();
		}
		@Pc(332) int local332 = method2477(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray250 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method2478() != 0;
			method2477(16);
			method2477(16);
			anIntArray250[local191] = method2477(8);
		}
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(I)I")
	public static int method2477(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3276) {
			local8 = 8 - anInt3276;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray42[anInt3279] >> anInt3276 & local14) << local3;
			anInt3276 = 0;
			anInt3279++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray42[anInt3279] >> anInt3276 & local8) << local3;
			anInt3276 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
	public static int method2478() {
		@Pc(7) int local7 = aByteArray42[anInt3279] >> anInt3276 & 0x1;
		anInt3276++;
		anInt3279 += anInt3276 >> 3;
		anInt3276 &= 0x7;
		return local7;
	}
}
