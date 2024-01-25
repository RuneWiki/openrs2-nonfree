import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
	public static int anInt1353;

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "[Lclient!al;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "[Lclient!wo;")
	public static Class379[] aClass379Array1;

	@OriginalMember(owner = "client!cba", name = "z", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!cba", name = "E", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!cba", name = "F", descriptor = "I")
	private static int anInt1357;

	@OriginalMember(owner = "client!cba", name = "G", descriptor = "[B")
	private static byte[] aByteArray22;

	@OriginalMember(owner = "client!cba", name = "K", descriptor = "[Lclient!ufa;")
	public static Class342[] aClass342Array1;

	@OriginalMember(owner = "client!cba", name = "M", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!cba", name = "N", descriptor = "I")
	private static int anInt1360;

	@OriginalMember(owner = "client!cba", name = "O", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!cba", name = "P", descriptor = "[Lclient!fha;")
	public static Class99[] aClass99Array1;

	@OriginalMember(owner = "client!cba", name = "Q", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!cba", name = "R", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "Z")
	private static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([B)V")
	private static void method1135(@OriginalArg(0) byte[] arg0) {
		method1140(arg0);
		anInt1354 = 0x1 << method1144(4);
		anInt1353 = 0x1 << method1144(4);
		aFloatArray4 = new float[anInt1353];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1354 : anInt1353;
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
			local191 = Static88.method1511(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static501.method7468(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray3 = local39;
				aFloatArray10 = local84;
				aFloatArray7 = local136;
				anIntArray96 = local185;
			} else {
				aFloatArray5 = local39;
				aFloatArray8 = local84;
				aFloatArray9 = local136;
				anIntArray97 = local185;
			}
		}
		local24 = method1144(8) + 1;
		aClass379Array1 = new Class379[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass379Array1[local28] = new Class379();
		}
		local32 = method1144(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1144(16);
		}
		@Pc(269) int local269 = method1144(6) + 1;
		aClass99Array1 = new Class99[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass99Array1[local41] = new Class99();
		}
		@Pc(290) int local290 = method1144(6) + 1;
		aClass342Array1 = new Class342[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass342Array1[local86] = new Class342();
		}
		@Pc(311) int local311 = method1144(6) + 1;
		aClass18Array1 = new Class18[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass18Array1[local138] = new Class18();
		}
		@Pc(332) int local332 = method1144(6) + 1;
		aBooleanArray10 = new boolean[local332];
		anIntArray98 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray10[local191] = method1137() != 0;
			method1144(16);
			method1144(16);
			anIntArray98[local191] = method1144(8);
		}
		aBoolean85 = true;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "()I")
	public static int method1137() {
		@Pc(7) int local7 = aByteArray22[anInt1360] >> anInt1357 & 0x1;
		anInt1357++;
		anInt1360 += anInt1357 >> 3;
		anInt1357 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!vd;II)Lclient!cba;")
	public static Class6_Sub7 method1139(@OriginalArg(0) Class353 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1145(arg0)) {
			@Pc(16) byte[] local16 = arg0.method8404(arg1, arg2);
			return local16 == null ? null : new Class6_Sub7(local16);
		} else {
			arg0.method8407(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([BI)V")
	public static void method1140(@OriginalArg(0) byte[] arg0) {
		aByteArray22 = arg0;
		anInt1360 = 0;
		anInt1357 = 0;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)F")
	public static float method1141(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!vd;I)Lclient!cba;")
	public static Class6_Sub7 method1143(@OriginalArg(0) Class353 arg0, @OriginalArg(1) int arg1) {
		if (method1145(arg0)) {
			@Pc(14) byte[] local14 = arg0.method8419(arg1);
			return local14 == null ? null : new Class6_Sub7(local14);
		} else {
			arg0.method8401(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I")
	public static int method1144(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1357) {
			local8 = 8 - anInt1357;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray22[anInt1360] >> anInt1357 & local14) << local3;
			anInt1357 = 0;
			anInt1360++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray22[anInt1360] >> anInt1357 & local8) << local3;
			anInt1357 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!vd;)Z")
	private static boolean method1145(@OriginalArg(0) Class353 arg0) {
		if (!aBoolean85) {
			@Pc(7) byte[] local7 = arg0.method8404(0, 0);
			if (local7 == null) {
				return false;
			}
			method1135(local7);
		}
		return true;
	}
}
