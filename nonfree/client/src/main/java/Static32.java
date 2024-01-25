import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "[Lclient!ib;")
	public static Class87[] aClass87Array1;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
	public static int anInt801;

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "[Lclient!hq;")
	public static Class84[] aClass84Array1;

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "[B")
	private static byte[] aByteArray16;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "[Lclient!o;")
	public static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
	private static int anInt802;

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
	private static int anInt803;

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bs", name = "O", descriptor = "[Lclient!qc;")
	public static Class167[] aClass167Array1;

	@OriginalMember(owner = "client!bs", name = "Q", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
	public static int anInt807;

	@OriginalMember(owner = "client!bs", name = "S", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "Z")
	private static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()I")
	public static int method833() {
		@Pc(7) int local7 = aByteArray16[anInt803] >> anInt802 & 0x1;
		anInt802++;
		anInt803 += anInt802 >> 3;
		anInt802 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([B)V")
	private static void method834(@OriginalArg(0) byte[] arg0) {
		method842(arg0);
		anInt801 = 0x1 << method840(4);
		anInt807 = 0x1 << method840(4);
		aFloatArray4 = new float[anInt807];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt801 : anInt807;
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
			local191 = Static96.method2070(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static109.method2322(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray3 = local39;
				aFloatArray7 = local84;
				aFloatArray9 = local136;
				anIntArray53 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray6 = local84;
				aFloatArray5 = local136;
				anIntArray54 = local185;
			}
		}
		local24 = method840(8) + 1;
		aClass150Array1 = new Class150[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass150Array1[local28] = new Class150();
		}
		local32 = method840(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method840(16);
		}
		@Pc(269) int local269 = method840(6) + 1;
		aClass167Array1 = new Class167[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass167Array1[local41] = new Class167();
		}
		@Pc(290) int local290 = method840(6) + 1;
		aClass87Array1 = new Class87[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass87Array1[local86] = new Class87();
		}
		@Pc(311) int local311 = method840(6) + 1;
		aClass84Array1 = new Class84[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass84Array1[local138] = new Class84();
		}
		@Pc(332) int local332 = method840(6) + 1;
		aBooleanArray2 = new boolean[local332];
		anIntArray55 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray2[local191] = method833() != 0;
			method840(16);
			method840(16);
			anIntArray55[local191] = method840(8);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ct;II)Lclient!bs;")
	public static Class1_Sub11 method836(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method839(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1161(arg2, arg1);
			return local16 == null ? null : new Class1_Sub11(local16);
		} else {
			arg0.method1162(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ct;)Z")
	private static boolean method839(@OriginalArg(0) Class30 arg0) {
		if (!aBoolean55) {
			@Pc(7) byte[] local7 = arg0.method1161(0, 0);
			if (local7 == null) {
				return false;
			}
			method834(local7);
			aBoolean55 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)I")
	public static int method840(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt802) {
			local8 = 8 - anInt802;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray16[anInt803] >> anInt802 & local14) << local3;
			anInt802 = 0;
			anInt803++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray16[anInt803] >> anInt802 & local8) << local3;
			anInt802 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)F")
	public static float method841(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([BI)V")
	public static void method842(@OriginalArg(0) byte[] arg0) {
		aByteArray16 = arg0;
		anInt803 = 0;
		anInt802 = 0;
	}
}
