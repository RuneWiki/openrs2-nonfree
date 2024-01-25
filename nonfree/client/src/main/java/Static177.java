import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!k", name = "o", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "I")
	public static int anInt3146;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "[B")
	private static byte[] aByteArray52;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!k", name = "C", descriptor = "[Lclient!ro;")
	public static Class200[] aClass200Array1;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "I")
	private static int anInt3147;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "I")
	private static int anInt3148;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!k", name = "H", descriptor = "[Lclient!ea;")
	public static Class58[] aClass58Array1;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray70;

	@OriginalMember(owner = "client!k", name = "J", descriptor = "[Lclient!kq;")
	public static Class139[] aClass139Array1;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "[Lclient!ic;")
	public static Class110[] aClass110Array1;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Z")
	private static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!fc;)Z")
	private static boolean method2861(@OriginalArg(0) Class71 arg0) {
		if (!aBoolean228) {
			@Pc(7) byte[] local7 = arg0.method1555(0, 0);
			if (local7 == null) {
				return false;
			}
			method2863(local7);
			aBoolean228 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)I")
	public static int method2862(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3148) {
			local8 = 8 - anInt3148;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray52[anInt3147] >> anInt3148 & local14) << local3;
			anInt3148 = 0;
			anInt3147++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray52[anInt3147] >> anInt3148 & local8) << local3;
			anInt3148 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([B)V")
	private static void method2863(@OriginalArg(0) byte[] arg0) {
		method2868(arg0);
		anInt3146 = 0x1 << method2862(4);
		anInt3144 = 0x1 << method2862(4);
		aFloatArray9 = new float[anInt3144];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3146 : anInt3144;
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
			local191 = Static170.method2760(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static124.method5591(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray16 = local39;
				aFloatArray10 = local84;
				aFloatArray15 = local136;
				anIntArray352 = local185;
			} else {
				aFloatArray12 = local39;
				aFloatArray11 = local84;
				aFloatArray13 = local136;
				anIntArray351 = local185;
			}
		}
		local24 = method2862(8) + 1;
		aClass139Array1 = new Class139[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass139Array1[local28] = new Class139();
		}
		local32 = method2862(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method2862(16);
		}
		@Pc(269) int local269 = method2862(6) + 1;
		aClass58Array1 = new Class58[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass58Array1[local41] = new Class58();
		}
		@Pc(290) int local290 = method2862(6) + 1;
		aClass200Array1 = new Class200[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass200Array1[local86] = new Class200();
		}
		@Pc(311) int local311 = method2862(6) + 1;
		aClass110Array1 = new Class110[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass110Array1[local138] = new Class110();
		}
		@Pc(332) int local332 = method2862(6) + 1;
		aBooleanArray70 = new boolean[local332];
		anIntArray350 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray70[local191] = method2865() != 0;
			method2862(16);
			method2862(16);
			anIntArray350[local191] = method2862(8);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()I")
	public static int method2865() {
		@Pc(7) int local7 = aByteArray52[anInt3147] >> anInt3148 & 0x1;
		anInt3148++;
		anInt3147 += anInt3148 >> 3;
		anInt3148 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)F")
	public static float method2866(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BI)V")
	public static void method2868(@OriginalArg(0) byte[] arg0) {
		aByteArray52 = arg0;
		anInt3147 = 0;
		anInt3148 = 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!fc;II)Lclient!k;")
	public static Class2_Sub23 method2869(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method2861(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1555(arg1, arg2);
			return local16 == null ? null : new Class2_Sub23(local16);
		} else {
			arg0.method1561(arg1, arg2);
			return null;
		}
	}
}
