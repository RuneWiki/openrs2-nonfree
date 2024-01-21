import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "[Lclient!mh;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
	private static int anInt850;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "[Lclient!f;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "[Lclient!hd;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	private static int anInt854;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	public static int anInt855;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "[Lclient!vh;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
	public static int anInt857;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Z")
	private static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)F")
	public static float method683(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BI)V")
	public static void method685(@OriginalArg(0) byte[] arg0) {
		aByteArray15 = arg0;
		anInt850 = 0;
		anInt854 = 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!pe;II)Lclient!cg;")
	public static Class2_Sub4 method686(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method689(arg0)) {
			@Pc(16) byte[] local16 = arg0.method521(arg2, arg1);
			return local16 == null ? null : new Class2_Sub4(local16);
		} else {
			arg0.method538(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
	public static int method687() {
		@Pc(7) int local7 = aByteArray15[anInt850] >> anInt854 & 0x1;
		anInt854++;
		anInt850 += anInt854 >> 3;
		anInt854 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
	public static int method688(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt854) {
			local8 = 8 - anInt854;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray15[anInt850] >> anInt854 & local14) << local3;
			anInt854 = 0;
			anInt850++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray15[anInt850] >> anInt854 & local8) << local3;
			anInt854 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!pe;)Z")
	private static boolean method689(@OriginalArg(0) Class13 arg0) {
		if (!aBoolean31) {
			@Pc(7) byte[] local7 = arg0.method521(0, 0);
			if (local7 == null) {
				return false;
			}
			method691(local7);
			aBoolean31 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "([B)V")
	private static void method691(@OriginalArg(0) byte[] arg0) {
		method685(arg0);
		anInt857 = 0x1 << method688(4);
		anInt855 = 0x1 << method688(4);
		aFloatArray2 = new float[anInt855];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt857 : anInt855;
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
			local191 = Static102.method2331(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static168.method3122(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray7 = local39;
				aFloatArray4 = local84;
				aFloatArray8 = local136;
				anIntArray91 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray5 = local84;
				aFloatArray1 = local136;
				anIntArray90 = local185;
			}
		}
		local24 = method688(8) + 1;
		aClass33Array1 = new Class33[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass33Array1[local28] = new Class33();
		}
		local32 = method688(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method688(16);
		}
		@Pc(269) int local269 = method688(6) + 1;
		aClass24Array1 = new Class24[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass24Array1[local41] = new Class24();
		}
		@Pc(290) int local290 = method688(6) + 1;
		aClass91Array1 = new Class91[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass91Array1[local86] = new Class91();
		}
		@Pc(311) int local311 = method688(6) + 1;
		aClass54Array1 = new Class54[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass54Array1[local138] = new Class54();
		}
		@Pc(332) int local332 = method688(6) + 1;
		aBooleanArray2 = new boolean[local332];
		anIntArray89 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray2[local191] = method687() != 0;
			method688(16);
			method688(16);
			anIntArray89[local191] = method688(8);
		}
	}
}
