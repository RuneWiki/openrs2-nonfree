import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public static int anInt3715;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "[B")
	private static byte[] aByteArray63;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "[Lclient!wd;")
	public static Class245[] aClass245Array1;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	public static int anInt3717;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "[Lclient!oi;")
	public static Class175[] aClass175Array1;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "I")
	private static int anInt3721;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "[Lclient!gt;")
	public static Class96[] aClass96Array1;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "I")
	private static int anInt3724;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "[Lclient!ut;")
	public static Class233[] aClass233Array1;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "Z")
	private static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ui;II)Lclient!m;")
	public static Class1_Sub26 method3026(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3031(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4985(arg2, arg1);
			return local16 == null ? null : new Class1_Sub26(local16);
		} else {
			arg0.method4974(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)I")
	public static int method3027(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3721) {
			local8 = 8 - anInt3721;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray63[anInt3724] >> anInt3721 & local14) << local3;
			anInt3721 = 0;
			anInt3724++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray63[anInt3724] >> anInt3721 & local8) << local3;
			anInt3721 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BI)V")
	public static void method3028(@OriginalArg(0) byte[] arg0) {
		aByteArray63 = arg0;
		anInt3724 = 0;
		anInt3721 = 0;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)F")
	public static float method3030(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ui;)Z")
	private static boolean method3031(@OriginalArg(0) Class230 arg0) {
		if (!aBoolean363) {
			@Pc(7) byte[] local7 = arg0.method4985(0, 0);
			if (local7 == null) {
				return false;
			}
			method3035(local7);
			aBoolean363 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
	public static int method3034() {
		@Pc(7) int local7 = aByteArray63[anInt3724] >> anInt3721 & 0x1;
		anInt3721++;
		anInt3724 += anInt3721 >> 3;
		anInt3721 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([B)V")
	private static void method3035(@OriginalArg(0) byte[] arg0) {
		method3028(arg0);
		anInt3717 = 0x1 << method3027(4);
		anInt3715 = 0x1 << method3027(4);
		aFloatArray13 = new float[anInt3715];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3717 : anInt3715;
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
			local191 = Static84.method1245(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static36.method559(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray18 = local39;
				aFloatArray12 = local84;
				aFloatArray17 = local136;
				anIntArray461 = local185;
			} else {
				aFloatArray14 = local39;
				aFloatArray19 = local84;
				aFloatArray15 = local136;
				anIntArray462 = local185;
			}
		}
		local24 = method3027(8) + 1;
		aClass233Array1 = new Class233[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass233Array1[local28] = new Class233();
		}
		local32 = method3027(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3027(16);
		}
		@Pc(269) int local269 = method3027(6) + 1;
		aClass96Array1 = new Class96[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass96Array1[local41] = new Class96();
		}
		@Pc(290) int local290 = method3027(6) + 1;
		aClass175Array1 = new Class175[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass175Array1[local86] = new Class175();
		}
		@Pc(311) int local311 = method3027(6) + 1;
		aClass245Array1 = new Class245[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass245Array1[local138] = new Class245();
		}
		@Pc(332) int local332 = method3027(6) + 1;
		aBooleanArray19 = new boolean[local332];
		anIntArray463 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray19[local191] = method3034() != 0;
			method3027(16);
			method3027(16);
			anIntArray463[local191] = method3027(8);
		}
	}
}
