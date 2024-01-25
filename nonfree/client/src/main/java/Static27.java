import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "[Lclient!pk;")
	public static Class222[] aClass222Array1;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	private static int anInt513;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "[Lclient!td;")
	public static Class268[] aClass268Array1;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "I")
	private static int anInt514;

	@OriginalMember(owner = "client!av", name = "s", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "I")
	public static int anInt517;

	@OriginalMember(owner = "client!av", name = "x", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!av", name = "y", descriptor = "[Lclient!tm;")
	public static Class272[] aClass272Array1;

	@OriginalMember(owner = "client!av", name = "z", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!av", name = "B", descriptor = "[Lclient!qj;")
	public static Class235[] aClass235Array1;

	@OriginalMember(owner = "client!av", name = "C", descriptor = "I")
	public static int anInt519;

	@OriginalMember(owner = "client!av", name = "D", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!av", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!av", name = "G", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!av", name = "H", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!av", name = "L", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Z")
	private static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()I")
	public static int method608() {
		@Pc(7) int local7 = aByteArray18[anInt514] >> anInt513 & 0x1;
		anInt513++;
		anInt514 += anInt513 >> 3;
		anInt513 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([B)V")
	private static void method609(@OriginalArg(0) byte[] arg0) {
		method617(arg0);
		anInt517 = 0x1 << method614(4);
		anInt519 = 0x1 << method614(4);
		aFloatArray10 = new float[anInt519];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt517 : anInt519;
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
			local191 = Static451.method6881(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static354.method5545(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray8 = local39;
				aFloatArray6 = local84;
				aFloatArray11 = local136;
				anIntArray42 = local185;
			} else {
				aFloatArray5 = local39;
				aFloatArray9 = local84;
				aFloatArray7 = local136;
				anIntArray41 = local185;
			}
		}
		local24 = method614(8) + 1;
		aClass235Array1 = new Class235[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass235Array1[local28] = new Class235();
		}
		local32 = method614(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method614(16);
		}
		@Pc(269) int local269 = method614(6) + 1;
		aClass272Array1 = new Class272[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass272Array1[local41] = new Class272();
		}
		@Pc(290) int local290 = method614(6) + 1;
		aClass268Array1 = new Class268[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass268Array1[local86] = new Class268();
		}
		@Pc(311) int local311 = method614(6) + 1;
		aClass222Array1 = new Class222[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass222Array1[local138] = new Class222();
		}
		@Pc(332) int local332 = method614(6) + 1;
		aBooleanArray3 = new boolean[local332];
		anIntArray43 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray3[local191] = method608() != 0;
			method614(16);
			method614(16);
			anIntArray43[local191] = method614(8);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!dda;I)Lclient!av;")
	public static Class2_Sub6 method610(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1) {
		if (method611(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1599(arg1);
			return local14 == null ? null : new Class2_Sub6(local14);
		} else {
			arg0.method1621(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!dda;)Z")
	private static boolean method611(@OriginalArg(0) Class53 arg0) {
		if (!aBoolean34) {
			@Pc(7) byte[] local7 = arg0.method1616(0, 0);
			if (local7 == null) {
				return false;
			}
			method609(local7);
			aBoolean34 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)F")
	public static float method612(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I")
	public static int method614(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt513) {
			local8 = 8 - anInt513;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray18[anInt514] >> anInt513 & local14) << local3;
			anInt513 = 0;
			anInt514++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray18[anInt514] >> anInt513 & local8) << local3;
			anInt513 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!dda;II)Lclient!av;")
	public static Class2_Sub6 method616(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method611(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1616(arg2, arg1);
			return local16 == null ? null : new Class2_Sub6(local16);
		} else {
			arg0.method1591(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "([BI)V")
	public static void method617(@OriginalArg(0) byte[] arg0) {
		aByteArray18 = arg0;
		anInt514 = 0;
		anInt513 = 0;
	}
}
