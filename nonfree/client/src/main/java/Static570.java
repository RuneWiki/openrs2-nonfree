import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "[I")
	public static int[] anIntArray590;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "[Lclient!iia;")
	public static Class177[] aClass177Array1;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
	public static int anInt9076;

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
	public static int anInt9078;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "[B")
	private static byte[] aByteArray99;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "[F")
	public static float[] aFloatArray68;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "[I")
	public static int[] anIntArray591;

	@OriginalMember(owner = "client!tea", name = "w", descriptor = "[I")
	public static int[] anIntArray592;

	@OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
	private static int anInt9080;

	@OriginalMember(owner = "client!tea", name = "y", descriptor = "[F")
	public static float[] aFloatArray69;

	@OriginalMember(owner = "client!tea", name = "z", descriptor = "[F")
	public static float[] aFloatArray70;

	@OriginalMember(owner = "client!tea", name = "B", descriptor = "[F")
	public static float[] aFloatArray71;

	@OriginalMember(owner = "client!tea", name = "C", descriptor = "[Lclient!sca;")
	public static Class318[] aClass318Array1;

	@OriginalMember(owner = "client!tea", name = "E", descriptor = "[Lclient!gf;")
	public static Class141[] aClass141Array1;

	@OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
	private static int anInt9083;

	@OriginalMember(owner = "client!tea", name = "G", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!tea", name = "H", descriptor = "[Lclient!rf;")
	public static Class306[] aClass306Array1;

	@OriginalMember(owner = "client!tea", name = "K", descriptor = "[F")
	public static float[] aFloatArray73;

	@OriginalMember(owner = "client!tea", name = "M", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!tea", name = "L", descriptor = "Z")
	private static boolean aBoolean675 = false;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!gj;I)Lclient!tea;")
	public static Class3_Sub51 method7700(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		if (method7707(arg0)) {
			@Pc(14) byte[] local14 = arg0.method3135(arg1);
			return local14 == null ? null : new Class3_Sub51(local14);
		} else {
			arg0.method3130(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "()I")
	public static int method7701() {
		@Pc(7) int local7 = aByteArray99[anInt9080] >> anInt9083 & 0x1;
		anInt9083++;
		anInt9080 += anInt9083 >> 3;
		anInt9083 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([B)V")
	private static void method7703(@OriginalArg(0) byte[] arg0) {
		method7710(arg0);
		anInt9078 = 0x1 << method7706(4);
		anInt9076 = 0x1 << method7706(4);
		aFloatArray70 = new float[anInt9076];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9078 : anInt9076;
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
			local191 = Static289.method7950(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static200.method3154(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray74 = local39;
				aFloatArray72 = local84;
				aFloatArray68 = local136;
				anIntArray590 = local185;
			} else {
				aFloatArray71 = local39;
				aFloatArray73 = local84;
				aFloatArray69 = local136;
				anIntArray591 = local185;
			}
		}
		local24 = method7706(8) + 1;
		aClass306Array1 = new Class306[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass306Array1[local28] = new Class306();
		}
		local32 = method7706(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7706(16);
		}
		@Pc(269) int local269 = method7706(6) + 1;
		aClass318Array1 = new Class318[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass318Array1[local41] = new Class318();
		}
		@Pc(290) int local290 = method7706(6) + 1;
		aClass141Array1 = new Class141[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass141Array1[local86] = new Class141();
		}
		@Pc(311) int local311 = method7706(6) + 1;
		aClass177Array1 = new Class177[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass177Array1[local138] = new Class177();
		}
		@Pc(332) int local332 = method7706(6) + 1;
		aBooleanArray26 = new boolean[local332];
		anIntArray592 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray26[local191] = method7701() != 0;
			method7706(16);
			method7706(16);
			anIntArray592[local191] = method7706(8);
		}
		aBoolean675 = true;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!gj;II)Lclient!tea;")
	public static Class3_Sub51 method7705(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7707(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3125(arg2, arg1);
			return local16 == null ? null : new Class3_Sub51(local16);
		} else {
			arg0.method3113(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)I")
	public static int method7706(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9083) {
			local8 = 8 - anInt9083;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray99[anInt9080] >> anInt9083 & local14) << local3;
			anInt9083 = 0;
			anInt9080++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray99[anInt9080] >> anInt9083 & local8) << local3;
			anInt9083 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!gj;)Z")
	private static boolean method7707(@OriginalArg(0) Class143 arg0) {
		if (!aBoolean675) {
			@Pc(7) byte[] local7 = arg0.method3125(0, 0);
			if (local7 == null) {
				return false;
			}
			method7703(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)F")
	public static float method7709(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([BI)V")
	public static void method7710(@OriginalArg(0) byte[] arg0) {
		aByteArray99 = arg0;
		anInt9080 = 0;
		anInt9083 = 0;
	}
}
