import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "[F")
	public static float[] aFloatArray50;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	private static int anInt6701;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	private static int anInt6704;

	@OriginalMember(owner = "client!um", name = "x", descriptor = "[Lclient!ms;")
	public static Class166[] aClass166Array1;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "[Lclient!rp;")
	public static Class217[] aClass217Array1;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "[Lclient!ak;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "[Lclient!ik;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "I")
	public static int anInt6708;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!um", name = "L", descriptor = "I")
	public static int anInt6709;

	@OriginalMember(owner = "client!um", name = "O", descriptor = "[F")
	public static float[] aFloatArray57;

	@OriginalMember(owner = "client!um", name = "Q", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!um", name = "R", descriptor = "[B")
	private static byte[] aByteArray126;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "Z")
	private static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()I")
	public static int method5298() {
		@Pc(7) int local7 = aByteArray126[anInt6704] >> anInt6701 & 0x1;
		anInt6701++;
		anInt6704 += anInt6701 >> 3;
		anInt6701 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)F")
	public static float method5299(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "([B)V")
	private static void method5301(@OriginalArg(0) byte[] arg0) {
		method5303(arg0);
		anInt6709 = 0x1 << method5306(4);
		anInt6708 = 0x1 << method5306(4);
		aFloatArray52 = new float[anInt6708];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6709 : anInt6708;
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
			local191 = Static220.method3458(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static333.method4644(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray50 = local39;
				aFloatArray54 = local84;
				aFloatArray51 = local136;
				anIntArray561 = local185;
			} else {
				aFloatArray55 = local39;
				aFloatArray57 = local84;
				aFloatArray56 = local136;
				anIntArray562 = local185;
			}
		}
		local24 = method5306(8) + 1;
		aClass166Array1 = new Class166[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass166Array1[local28] = new Class166();
		}
		local32 = method5306(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5306(16);
		}
		@Pc(269) int local269 = method5306(6) + 1;
		aClass9Array1 = new Class9[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass9Array1[local41] = new Class9();
		}
		@Pc(290) int local290 = method5306(6) + 1;
		aClass118Array1 = new Class118[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass118Array1[local86] = new Class118();
		}
		@Pc(311) int local311 = method5306(6) + 1;
		aClass217Array1 = new Class217[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass217Array1[local138] = new Class217();
		}
		@Pc(332) int local332 = method5306(6) + 1;
		aBooleanArray24 = new boolean[local332];
		anIntArray560 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray24[local191] = method5298() != 0;
			method5306(16);
			method5306(16);
			anIntArray560[local191] = method5306(8);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!mg;I)Lclient!um;")
	public static Class2_Sub41 method5302(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1) {
		if (method5305(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3711(arg1);
			return local14 == null ? null : new Class2_Sub41(local14);
		} else {
			arg0.method3716(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([BI)V")
	public static void method5303(@OriginalArg(0) byte[] arg0) {
		aByteArray126 = arg0;
		anInt6704 = 0;
		anInt6701 = 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!mg;)Z")
	private static boolean method5305(@OriginalArg(0) Class160 arg0) {
		if (!aBoolean453) {
			@Pc(7) byte[] local7 = arg0.method3696(0, 0);
			if (local7 == null) {
				return false;
			}
			method5301(local7);
			aBoolean453 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
	public static int method5306(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6701) {
			local8 = 8 - anInt6701;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray126[anInt6704] >> anInt6701 & local14) << local3;
			anInt6701 = 0;
			anInt6704++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray126[anInt6704] >> anInt6701 & local8) << local3;
			anInt6701 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!mg;II)Lclient!um;")
	public static Class2_Sub41 method5307(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5305(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3696(arg2, arg1);
			return local16 == null ? null : new Class2_Sub41(local16);
		} else {
			arg0.method3698(arg1, arg2);
			return null;
		}
	}
}
