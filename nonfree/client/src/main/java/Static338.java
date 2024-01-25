import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "[Lclient!bga;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "[F")
	public static float[] aFloatArray55;

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "[F")
	public static float[] aFloatArray56;

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
	private static int anInt6213;

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
	private static int anInt6215;

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "[Lclient!iaa;")
	public static Class158[] aClass158Array1;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "[Lclient!sga;")
	public static Class318[] aClass318Array1;

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "[B")
	private static byte[] aByteArray53;

	@OriginalMember(owner = "client!lea", name = "B", descriptor = "[F")
	public static float[] aFloatArray58;

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
	public static int anInt6218;

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "[F")
	public static float[] aFloatArray59;

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
	public static int anInt6220;

	@OriginalMember(owner = "client!lea", name = "M", descriptor = "[Lclient!ffa;")
	public static Class117[] aClass117Array1;

	@OriginalMember(owner = "client!lea", name = "N", descriptor = "[F")
	public static float[] aFloatArray60;

	@OriginalMember(owner = "client!lea", name = "P", descriptor = "[F")
	public static float[] aFloatArray61;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "Z")
	private static boolean aBoolean548 = false;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)F")
	public static float method5166(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!wm;I)Lclient!lea;")
	public static Class5_Sub38 method5167(@OriginalArg(0) Class390 arg0, @OriginalArg(1) int arg1) {
		if (method5173(arg0)) {
			@Pc(14) byte[] local14 = arg0.method8923(arg1);
			return local14 == null ? null : new Class5_Sub38(local14);
		} else {
			arg0.method8905(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([B)V")
	private static void method5168(@OriginalArg(0) byte[] arg0) {
		method5175(arg0);
		anInt6218 = 0x1 << method5170(4);
		anInt6220 = 0x1 << method5170(4);
		aFloatArray54 = new float[anInt6220];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6218 : anInt6220;
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
			local191 = Static139.method2419(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static570.method7872(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray61 = local39;
				aFloatArray59 = local84;
				aFloatArray55 = local136;
				anIntArray359 = local185;
			} else {
				aFloatArray56 = local39;
				aFloatArray58 = local84;
				aFloatArray60 = local136;
				anIntArray360 = local185;
			}
		}
		local24 = method5170(8) + 1;
		aClass158Array1 = new Class158[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass158Array1[local28] = new Class158();
		}
		local32 = method5170(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5170(16);
		}
		@Pc(269) int local269 = method5170(6) + 1;
		aClass117Array1 = new Class117[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass117Array1[local41] = new Class117();
		}
		@Pc(290) int local290 = method5170(6) + 1;
		aClass318Array1 = new Class318[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass318Array1[local86] = new Class318();
		}
		@Pc(311) int local311 = method5170(6) + 1;
		aClass36Array1 = new Class36[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass36Array1[local138] = new Class36();
		}
		@Pc(332) int local332 = method5170(6) + 1;
		aBooleanArray25 = new boolean[local332];
		anIntArray358 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray25[local191] = method5169() != 0;
			method5170(16);
			method5170(16);
			anIntArray358[local191] = method5170(8);
		}
		aBoolean548 = true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()I")
	public static int method5169() {
		@Pc(7) int local7 = aByteArray53[anInt6213] >> anInt6215 & 0x1;
		anInt6215++;
		anInt6213 += anInt6215 >> 3;
		anInt6215 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)I")
	public static int method5170(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6215) {
			local8 = 8 - anInt6215;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray53[anInt6213] >> anInt6215 & local14) << local3;
			anInt6215 = 0;
			anInt6213++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray53[anInt6213] >> anInt6215 & local8) << local3;
			anInt6215 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!wm;II)Lclient!lea;")
	public static Class5_Sub38 method5172(@OriginalArg(0) Class390 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5173(arg0)) {
			@Pc(16) byte[] local16 = arg0.method8914(arg1, arg2);
			return local16 == null ? null : new Class5_Sub38(local16);
		} else {
			arg0.method8902(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!wm;)Z")
	private static boolean method5173(@OriginalArg(0) Class390 arg0) {
		if (!aBoolean548) {
			@Pc(7) byte[] local7 = arg0.method8914(0, 0);
			if (local7 == null) {
				return false;
			}
			method5168(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([BI)V")
	public static void method5175(@OriginalArg(0) byte[] arg0) {
		aByteArray53 = arg0;
		anInt6213 = 0;
		anInt6215 = 0;
	}
}
