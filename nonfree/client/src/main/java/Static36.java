import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[Lclient!sb;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[B")
	private static byte[] aByteArray13;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[Lclient!hb;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	public static int anInt1065;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private static int anInt1066;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
	public static int anInt1067;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "[Lclient!me;")
	public static Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
	private static int anInt1070;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
	private static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	public static void method874() {
		aByteArray13 = null;
		aClass1Array1 = null;
		aClass72Array1 = null;
		aClass37Array1 = null;
		aClass52Array1 = null;
		aBooleanArray6 = null;
		anIntArray196 = null;
		aFloatArray2 = null;
		aFloatArray8 = null;
		aFloatArray6 = null;
		aFloatArray7 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray1 = null;
		anIntArray197 = null;
		anIntArray195 = null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()I")
	public static int method875() {
		@Pc(7) int local7 = aByteArray13[anInt1070] >> anInt1066 & 0x1;
		anInt1066++;
		anInt1070 += anInt1066 >> 3;
		anInt1066 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ah;II)Lclient!ec;")
	public static Class3_Sub5 method877(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method883(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1021(arg1, arg2);
			return local16 == null ? null : new Class3_Sub5(local16);
		} else {
			arg0.method1014(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)F")
	public static float method878(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V")
	private static void method879(@OriginalArg(0) byte[] arg0) {
		method881(arg0);
		anInt1065 = 0x1 << method880(4);
		anInt1067 = 0x1 << method880(4);
		aFloatArray2 = new float[anInt1067];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1065 : anInt1067;
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
			local191 = Static140.method2743(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static44.method3008(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray8 = local39;
				aFloatArray6 = local84;
				aFloatArray7 = local136;
				anIntArray197 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray5 = local84;
				aFloatArray1 = local136;
				anIntArray195 = local185;
			}
		}
		local24 = method880(8) + 1;
		aClass1Array1 = new Class1[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass1Array1[local28] = new Class1();
		}
		local32 = method880(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method880(16);
		}
		@Pc(269) int local269 = method880(6) + 1;
		aClass72Array1 = new Class72[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass72Array1[local41] = new Class72();
		}
		@Pc(290) int local290 = method880(6) + 1;
		aClass37Array1 = new Class37[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass37Array1[local86] = new Class37();
		}
		@Pc(311) int local311 = method880(6) + 1;
		aClass52Array1 = new Class52[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass52Array1[local138] = new Class52();
		}
		@Pc(332) int local332 = method880(6) + 1;
		aBooleanArray6 = new boolean[local332];
		anIntArray196 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray6[local191] = method875() != 0;
			method880(16);
			method880(16);
			anIntArray196[local191] = method880(8);
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I")
	public static int method880(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1066) {
			local8 = 8 - anInt1066;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray13[anInt1070] >> anInt1066 & local14) << local3;
			anInt1066 = 0;
			anInt1070++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray13[anInt1070] >> anInt1066 & local8) << local3;
			anInt1066 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI)V")
	public static void method881(@OriginalArg(0) byte[] arg0) {
		aByteArray13 = arg0;
		anInt1070 = 0;
		anInt1066 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ah;)Z")
	private static boolean method883(@OriginalArg(0) Class7 arg0) {
		if (!aBoolean57) {
			@Pc(7) byte[] local7 = arg0.method1021(0, 0);
			if (local7 == null) {
				return false;
			}
			method879(local7);
			aBoolean57 = true;
		}
		return true;
	}
}
