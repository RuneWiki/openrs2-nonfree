import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "[B")
	private static byte[] aByteArray89;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	private static int anInt8403;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "[Lclient!rda;")
	public static Class300[] aClass300Array1;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "[Lclient!vg;")
	public static Class369[] aClass369Array1;

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "[Lclient!dga;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
	private static int anInt8406;

	@OriginalMember(owner = "client!qw", name = "z", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!qw", name = "A", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!qw", name = "F", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!qw", name = "G", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!qw", name = "H", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "[Lclient!ega;")
	public static Class82[] aClass82Array1;

	@OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
	public static int anInt8410;

	@OriginalMember(owner = "client!qw", name = "L", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!qw", name = "Q", descriptor = "I")
	public static int anInt8414;

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "Z")
	private static boolean aBoolean582 = false;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ae;)Z")
	private static boolean method7143(@OriginalArg(0) Class8 arg0) {
		if (!aBoolean582) {
			@Pc(7) byte[] local7 = arg0.method262(0, 0);
			if (local7 == null) {
				return false;
			}
			method7153(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)F")
	public static float method7144(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "()I")
	public static int method7146() {
		@Pc(7) int local7 = aByteArray89[anInt8406] >> anInt8403 & 0x1;
		anInt8403++;
		anInt8406 += anInt8403 >> 3;
		anInt8403 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([BI)V")
	public static void method7148(@OriginalArg(0) byte[] arg0) {
		aByteArray89 = arg0;
		anInt8406 = 0;
		anInt8403 = 0;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)I")
	public static int method7149(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt8403) {
			local8 = 8 - anInt8403;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray89[anInt8406] >> anInt8403 & local14) << local3;
			anInt8403 = 0;
			anInt8406++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray89[anInt8406] >> anInt8403 & local8) << local3;
			anInt8403 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ae;II)Lclient!qw;")
	public static Class6_Sub46 method7150(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7143(arg0)) {
			@Pc(16) byte[] local16 = arg0.method262(arg2, arg1);
			return local16 == null ? null : new Class6_Sub46(local16);
		} else {
			arg0.method275(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ae;I)Lclient!qw;")
	public static Class6_Sub46 method7152(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		if (method7143(arg0)) {
			@Pc(14) byte[] local14 = arg0.method267(arg1);
			return local14 == null ? null : new Class6_Sub46(local14);
		} else {
			arg0.method273(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "([B)V")
	private static void method7153(@OriginalArg(0) byte[] arg0) {
		method7148(arg0);
		anInt8410 = 0x1 << method7149(4);
		anInt8414 = 0x1 << method7149(4);
		aFloatArray54 = new float[anInt8414];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt8410 : anInt8414;
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
			local191 = Static503.method6621(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static446.method8187(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray56 = local39;
				aFloatArray53 = local84;
				aFloatArray52 = local136;
				anIntArray543 = local185;
			} else {
				aFloatArray55 = local39;
				aFloatArray51 = local84;
				aFloatArray49 = local136;
				anIntArray542 = local185;
			}
		}
		local24 = method7149(8) + 1;
		aClass300Array1 = new Class300[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass300Array1[local28] = new Class300();
		}
		local32 = method7149(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7149(16);
		}
		@Pc(269) int local269 = method7149(6) + 1;
		aClass369Array1 = new Class369[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass369Array1[local41] = new Class369();
		}
		@Pc(290) int local290 = method7149(6) + 1;
		aClass82Array1 = new Class82[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass82Array1[local86] = new Class82();
		}
		@Pc(311) int local311 = method7149(6) + 1;
		aClass66Array1 = new Class66[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass66Array1[local138] = new Class66();
		}
		@Pc(332) int local332 = method7149(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray544 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method7146() != 0;
			method7149(16);
			method7149(16);
			anIntArray544[local191] = method7149(8);
		}
		aBoolean582 = true;
	}
}
