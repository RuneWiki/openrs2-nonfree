import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt1758;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[B")
	private static byte[] aByteArray22;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	private static int anInt1761;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[Lclient!aw;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private static int anInt1764;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "[Lclient!mia;")
	public static Class218[] aClass218Array1;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "[Lclient!vaa;")
	public static Class352[] aClass352Array1;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "[Lclient!tt;")
	public static Class330[] aClass330Array1;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Z")
	private static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!eq;)Z")
	private static boolean method1531(@OriginalArg(0) Class97 arg0) {
		if (!aBoolean148) {
			@Pc(7) byte[] local7 = arg0.method2545(0, 0);
			if (local7 == null) {
				return false;
			}
			method1541(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public static int method1532(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1764) {
			local8 = 8 - anInt1764;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray22[anInt1761] >> anInt1764 & local14) << local3;
			anInt1764 = 0;
			anInt1761++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray22[anInt1761] >> anInt1764 & local8) << local3;
			anInt1764 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)F")
	public static float method1533(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()I")
	public static int method1536() {
		@Pc(7) int local7 = aByteArray22[anInt1761] >> anInt1764 & 0x1;
		anInt1764++;
		anInt1761 += anInt1764 >> 3;
		anInt1764 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BI)V")
	public static void method1539(@OriginalArg(0) byte[] arg0) {
		aByteArray22 = arg0;
		anInt1761 = 0;
		anInt1764 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!eq;II)Lclient!dc;")
	public static Class2_Sub14 method1540(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1531(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2545(arg2, arg1);
			return local16 == null ? null : new Class2_Sub14(local16);
		} else {
			arg0.method2561(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([B)V")
	private static void method1541(@OriginalArg(0) byte[] arg0) {
		method1539(arg0);
		anInt1766 = 0x1 << method1532(4);
		anInt1758 = 0x1 << method1532(4);
		aFloatArray11 = new float[anInt1758];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1766 : anInt1758;
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
			local191 = Static420.method6395(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static51.method996(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray12 = local39;
				aFloatArray6 = local84;
				aFloatArray10 = local136;
				anIntArray158 = local185;
			} else {
				aFloatArray9 = local39;
				aFloatArray7 = local84;
				aFloatArray5 = local136;
				anIntArray160 = local185;
			}
		}
		local24 = method1532(8) + 1;
		aClass352Array1 = new Class352[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass352Array1[local28] = new Class352();
		}
		local32 = method1532(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1532(16);
		}
		@Pc(269) int local269 = method1532(6) + 1;
		aClass27Array1 = new Class27[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass27Array1[local41] = new Class27();
		}
		@Pc(290) int local290 = method1532(6) + 1;
		aClass218Array1 = new Class218[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass218Array1[local86] = new Class218();
		}
		@Pc(311) int local311 = method1532(6) + 1;
		aClass330Array1 = new Class330[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass330Array1[local138] = new Class330();
		}
		@Pc(332) int local332 = method1532(6) + 1;
		aBooleanArray16 = new boolean[local332];
		anIntArray159 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray16[local191] = method1536() != 0;
			method1532(16);
			method1532(16);
			anIntArray159[local191] = method1532(8);
		}
		aBoolean148 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!eq;I)Lclient!dc;")
	public static Class2_Sub14 method1542(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1) {
		if (method1531(arg0)) {
			@Pc(14) byte[] local14 = arg0.method2570(arg1);
			return local14 == null ? null : new Class2_Sub14(local14);
		} else {
			arg0.method2564(arg1);
			return null;
		}
	}
}
