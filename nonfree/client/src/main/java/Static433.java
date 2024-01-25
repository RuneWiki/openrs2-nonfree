import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "[Lclient!ur;")
	public static Class300[] aClass300Array1;

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "[F")
	public static float[] aFloatArray57;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "[B")
	private static byte[] aByteArray93;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "[F")
	public static float[] aFloatArray58;

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "[I")
	public static int[] anIntArray676;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "[Lclient!sr;")
	public static Class271[] aClass271Array1;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "[Lclient!uo;")
	public static Class297[] aClass297Array1;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "[Lclient!kt;")
	public static Class169[] aClass169Array1;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
	private static int anInt7957;

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "[F")
	public static float[] aFloatArray59;

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "[F")
	public static float[] aFloatArray60;

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "[F")
	public static float[] aFloatArray62;

	@OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
	public static int anInt7959;

	@OriginalMember(owner = "client!rw", name = "G", descriptor = "[F")
	public static float[] aFloatArray63;

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
	public static int anInt7961;

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "[I")
	public static int[] anIntArray677;

	@OriginalMember(owner = "client!rw", name = "K", descriptor = "[I")
	public static int[] anIntArray678;

	@OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
	private static int anInt7962;

	@OriginalMember(owner = "client!rw", name = "P", descriptor = "[F")
	public static float[] aFloatArray64;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Z")
	private static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!kea;)Z")
	private static boolean method6580(@OriginalArg(0) Class161 arg0) {
		if (!aBoolean564) {
			@Pc(7) byte[] local7 = arg0.method4243(0, 0);
			if (local7 == null) {
				return false;
			}
			method6588(local7);
			aBoolean564 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!kea;I)Lclient!rw;")
	public static Class3_Sub44 method6581(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		if (method6580(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4265(arg1);
			return local14 == null ? null : new Class3_Sub44(local14);
		} else {
			arg0.method4268(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "()I")
	public static int method6582() {
		@Pc(7) int local7 = aByteArray93[anInt7962] >> anInt7957 & 0x1;
		anInt7957++;
		anInt7962 += anInt7957 >> 3;
		anInt7957 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)F")
	public static float method6583(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)I")
	public static int method6585(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7957) {
			local8 = 8 - anInt7957;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray93[anInt7962] >> anInt7957 & local14) << local3;
			anInt7957 = 0;
			anInt7962++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray93[anInt7962] >> anInt7957 & local8) << local3;
			anInt7957 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "([B)V")
	private static void method6588(@OriginalArg(0) byte[] arg0) {
		method6591(arg0);
		anInt7961 = 0x1 << method6585(4);
		anInt7959 = 0x1 << method6585(4);
		aFloatArray58 = new float[anInt7959];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7961 : anInt7959;
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
			local191 = Static192.method3681(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static335.method2593(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray60 = local39;
				aFloatArray62 = local84;
				aFloatArray57 = local136;
				anIntArray678 = local185;
			} else {
				aFloatArray64 = local39;
				aFloatArray59 = local84;
				aFloatArray63 = local136;
				anIntArray676 = local185;
			}
		}
		local24 = method6585(8) + 1;
		aClass169Array1 = new Class169[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass169Array1[local28] = new Class169();
		}
		local32 = method6585(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method6585(16);
		}
		@Pc(269) int local269 = method6585(6) + 1;
		aClass271Array1 = new Class271[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass271Array1[local41] = new Class271();
		}
		@Pc(290) int local290 = method6585(6) + 1;
		aClass300Array1 = new Class300[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass300Array1[local86] = new Class300();
		}
		@Pc(311) int local311 = method6585(6) + 1;
		aClass297Array1 = new Class297[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass297Array1[local138] = new Class297();
		}
		@Pc(332) int local332 = method6585(6) + 1;
		aBooleanArray39 = new boolean[local332];
		anIntArray677 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray39[local191] = method6582() != 0;
			method6585(16);
			method6585(16);
			anIntArray677[local191] = method6585(8);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!kea;II)Lclient!rw;")
	public static Class3_Sub44 method6590(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method6580(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4243(arg2, arg1);
			return local16 == null ? null : new Class3_Sub44(local16);
		} else {
			arg0.method4241(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([BI)V")
	public static void method6591(@OriginalArg(0) byte[] arg0) {
		aByteArray93 = arg0;
		anInt7962 = 0;
		anInt7957 = 0;
	}
}
