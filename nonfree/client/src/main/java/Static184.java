import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "[B")
	private static byte[] aByteArray45;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	private static int anInt3215;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public static int anInt3216;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
	private static int anInt3218;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
	public static int anInt3219;

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "[Lclient!sa;")
	public static Class226[] aClass226Array1;

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "[Lclient!ek;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!jj", name = "H", descriptor = "[Lclient!wf;")
	public static Class261[] aClass261Array1;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "[F")
	public static float[] aFloatArray19;

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "[Lclient!of;")
	public static Class187[] aClass187Array1;

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "Z")
	private static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BI)V")
	public static void method2881(@OriginalArg(0) byte[] arg0) {
		aByteArray45 = arg0;
		anInt3218 = 0;
		anInt3215 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)I")
	public static int method2882(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3215) {
			local8 = 8 - anInt3215;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray45[anInt3218] >> anInt3215 & local14) << local3;
			anInt3215 = 0;
			anInt3218++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray45[anInt3218] >> anInt3215 & local8) << local3;
			anInt3215 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
	public static int method2883() {
		@Pc(7) int local7 = aByteArray45[anInt3218] >> anInt3215 & 0x1;
		anInt3215++;
		anInt3218 += anInt3215 >> 3;
		anInt3215 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!lt;I)Lclient!jj;")
	public static Class6_Sub18 method2885(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		if (method2892(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3691(arg1);
			return local14 == null ? null : new Class6_Sub18(local14);
		} else {
			arg0.method3686(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)F")
	public static float method2886(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!lt;II)Lclient!jj;")
	public static Class6_Sub18 method2887(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2892(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3672(arg2, arg1);
			return local16 == null ? null : new Class6_Sub18(local16);
		} else {
			arg0.method3678(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "([B)V")
	private static void method2891(@OriginalArg(0) byte[] arg0) {
		method2881(arg0);
		anInt3219 = 0x1 << method2882(4);
		anInt3216 = 0x1 << method2882(4);
		aFloatArray16 = new float[anInt3216];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3219 : anInt3216;
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
			local191 = Static278.method4208(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static430.method5870(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray13 = local39;
				aFloatArray18 = local84;
				aFloatArray15 = local136;
				anIntArray301 = local185;
			} else {
				aFloatArray19 = local39;
				aFloatArray14 = local84;
				aFloatArray12 = local136;
				anIntArray300 = local185;
			}
		}
		local24 = method2882(8) + 1;
		aClass68Array1 = new Class68[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass68Array1[local28] = new Class68();
		}
		local32 = method2882(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2882(16);
		}
		@Pc(269) int local269 = method2882(6) + 1;
		aClass187Array1 = new Class187[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass187Array1[local41] = new Class187();
		}
		@Pc(290) int local290 = method2882(6) + 1;
		aClass226Array1 = new Class226[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass226Array1[local86] = new Class226();
		}
		@Pc(311) int local311 = method2882(6) + 1;
		aClass261Array1 = new Class261[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass261Array1[local138] = new Class261();
		}
		@Pc(332) int local332 = method2882(6) + 1;
		aBooleanArray15 = new boolean[local332];
		anIntArray299 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray15[local191] = method2883() != 0;
			method2882(16);
			method2882(16);
			anIntArray299[local191] = method2882(8);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!lt;)Z")
	private static boolean method2892(@OriginalArg(0) Class158 arg0) {
		if (!aBoolean226) {
			@Pc(7) byte[] local7 = arg0.method3672(0, 0);
			if (local7 == null) {
				return false;
			}
			method2891(local7);
			aBoolean226 = true;
		}
		return true;
	}
}
