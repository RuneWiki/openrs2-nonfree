import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
	public static int anInt1028;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "[Lclient!mc;")
	public static Class166[] aClass166Array1;

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
	private static int anInt1030;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "[Lclient!eh;")
	public static Class73[] aClass73Array1;

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "[Lclient!uu;")
	public static Class253[] aClass253Array1;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "[B")
	private static byte[] aByteArray11;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
	public static int anInt1033;

	@OriginalMember(owner = "client!bt", name = "O", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!bt", name = "R", descriptor = "[Lclient!ef;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "Z")
	private static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!qs;)Z")
	private static boolean method753(@OriginalArg(0) Class211 arg0) {
		if (!aBoolean66) {
			@Pc(7) byte[] local7 = arg0.method4758(0, 0);
			if (local7 == null) {
				return false;
			}
			method756(local7);
			aBoolean66 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)F")
	public static float method755(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "([B)V")
	private static void method756(@OriginalArg(0) byte[] arg0) {
		method764(arg0);
		anInt1028 = 0x1 << method758(4);
		anInt1033 = 0x1 << method758(4);
		aFloatArray9 = new float[anInt1033];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1028 : anInt1033;
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
			local191 = Static256.method1622(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static174.method2953(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray5 = local84;
				aFloatArray10 = local136;
				anIntArray105 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray8 = local84;
				aFloatArray7 = local136;
				anIntArray103 = local185;
			}
		}
		local24 = method758(8) + 1;
		aClass253Array1 = new Class253[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass253Array1[local28] = new Class253();
		}
		local32 = method758(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method758(16);
		}
		@Pc(269) int local269 = method758(6) + 1;
		aClass166Array1 = new Class166[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass166Array1[local41] = new Class166();
		}
		@Pc(290) int local290 = method758(6) + 1;
		aClass71Array1 = new Class71[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass71Array1[local86] = new Class71();
		}
		@Pc(311) int local311 = method758(6) + 1;
		aClass73Array1 = new Class73[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass73Array1[local138] = new Class73();
		}
		@Pc(332) int local332 = method758(6) + 1;
		aBooleanArray4 = new boolean[local332];
		anIntArray104 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray4[local191] = method762() != 0;
			method758(16);
			method758(16);
			anIntArray104[local191] = method758(8);
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	public static int method758(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1030) {
			local8 = 8 - anInt1030;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray11[anInt1031] >> anInt1030 & local14) << local3;
			anInt1030 = 0;
			anInt1031++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray11[anInt1031] >> anInt1030 & local8) << local3;
			anInt1030 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!qs;I)Lclient!bt;")
	public static Class1_Sub6 method761(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1) {
		if (method753(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4774(arg1);
			return local14 == null ? null : new Class1_Sub6(local14);
		} else {
			arg0.method4761(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "()I")
	public static int method762() {
		@Pc(7) int local7 = aByteArray11[anInt1031] >> anInt1030 & 0x1;
		anInt1030++;
		anInt1031 += anInt1030 >> 3;
		anInt1030 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!qs;II)Lclient!bt;")
	public static Class1_Sub6 method763(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method753(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4758(arg2, arg1);
			return local16 == null ? null : new Class1_Sub6(local16);
		} else {
			arg0.method4760(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BI)V")
	public static void method764(@OriginalArg(0) byte[] arg0) {
		aByteArray11 = arg0;
		anInt1031 = 0;
		anInt1030 = 0;
	}
}
