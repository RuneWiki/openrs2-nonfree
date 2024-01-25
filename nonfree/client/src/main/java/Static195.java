import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
	public static int anInt3982;

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "[Lclient!pd;")
	public static Class223[] aClass223Array1;

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "[Lclient!ub;")
	public static Class289[] aClass289Array1;

	@OriginalMember(owner = "client!ica", name = "q", descriptor = "[B")
	private static byte[] aByteArray47;

	@OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
	public static int anInt3983;

	@OriginalMember(owner = "client!ica", name = "u", descriptor = "[F")
	public static float[] aFloatArray38;

	@OriginalMember(owner = "client!ica", name = "v", descriptor = "[Lclient!po;")
	public static Class228[] aClass228Array1;

	@OriginalMember(owner = "client!ica", name = "w", descriptor = "[Lclient!gg;")
	public static Class113[] aClass113Array1;

	@OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
	private static int anInt3985;

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!ica", name = "A", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!ica", name = "C", descriptor = "[F")
	public static float[] aFloatArray39;

	@OriginalMember(owner = "client!ica", name = "E", descriptor = "[F")
	public static float[] aFloatArray40;

	@OriginalMember(owner = "client!ica", name = "F", descriptor = "[F")
	public static float[] aFloatArray41;

	@OriginalMember(owner = "client!ica", name = "H", descriptor = "[F")
	public static float[] aFloatArray42;

	@OriginalMember(owner = "client!ica", name = "K", descriptor = "[F")
	public static float[] aFloatArray43;

	@OriginalMember(owner = "client!ica", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ica", name = "O", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!ica", name = "Q", descriptor = "I")
	private static int anInt3991;

	@OriginalMember(owner = "client!ica", name = "B", descriptor = "Z")
	private static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!dn;II)Lclient!ica;")
	public static Class1_Sub21 method3720(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3721(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1888(arg2, arg1);
			return local16 == null ? null : new Class1_Sub21(local16);
		} else {
			arg0.method1893(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!dn;)Z")
	private static boolean method3721(@OriginalArg(0) Class69 arg0) {
		if (!aBoolean320) {
			@Pc(7) byte[] local7 = arg0.method1888(0, 0);
			if (local7 == null) {
				return false;
			}
			method3729(local7);
			aBoolean320 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "()I")
	public static int method3722() {
		@Pc(7) int local7 = aByteArray47[anInt3991] >> anInt3985 & 0x1;
		anInt3985++;
		anInt3991 += anInt3985 >> 3;
		anInt3985 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!dn;I)Lclient!ica;")
	public static Class1_Sub21 method3723(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1) {
		if (method3721(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1890(arg1);
			return local14 == null ? null : new Class1_Sub21(local14);
		} else {
			arg0.method1896(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([BI)V")
	public static void method3726(@OriginalArg(0) byte[] arg0) {
		aByteArray47 = arg0;
		anInt3991 = 0;
		anInt3985 = 0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)F")
	public static float method3727(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "([B)V")
	private static void method3729(@OriginalArg(0) byte[] arg0) {
		method3726(arg0);
		anInt3982 = 0x1 << method3731(4);
		anInt3983 = 0x1 << method3731(4);
		aFloatArray43 = new float[anInt3983];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3982 : anInt3983;
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
			local191 = Static509.method7779(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static244.method4331(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray39 = local39;
				aFloatArray41 = local84;
				aFloatArray42 = local136;
				anIntArray309 = local185;
			} else {
				aFloatArray38 = local39;
				aFloatArray37 = local84;
				aFloatArray40 = local136;
				anIntArray310 = local185;
			}
		}
		local24 = method3731(8) + 1;
		aClass228Array1 = new Class228[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass228Array1[local28] = new Class228();
		}
		local32 = method3731(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3731(16);
		}
		@Pc(269) int local269 = method3731(6) + 1;
		aClass223Array1 = new Class223[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass223Array1[local41] = new Class223();
		}
		@Pc(290) int local290 = method3731(6) + 1;
		aClass113Array1 = new Class113[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass113Array1[local86] = new Class113();
		}
		@Pc(311) int local311 = method3731(6) + 1;
		aClass289Array1 = new Class289[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass289Array1[local138] = new Class289();
		}
		@Pc(332) int local332 = method3731(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray311 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method3722() != 0;
			method3731(16);
			method3731(16);
			anIntArray311[local191] = method3731(8);
		}
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)I")
	public static int method3731(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3985) {
			local8 = 8 - anInt3985;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray47[anInt3991] >> anInt3985 & local14) << local3;
			anInt3985 = 0;
			anInt3991++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray47[anInt3991] >> anInt3985 & local8) << local3;
			anInt3985 += arg0;
		}
		return local1;
	}
}
