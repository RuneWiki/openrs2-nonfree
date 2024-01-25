import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "[F")
	public static float[] aFloatArray23;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	public static int anInt6687;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "[Lclient!ur;")
	public static Class198[] aClass198Array1;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	private static int anInt6688;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "[F")
	public static float[] aFloatArray24;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "[F")
	public static float[] aFloatArray25;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "[F")
	public static float[] aFloatArray26;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "[B")
	private static byte[] aByteArray88;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "[Lclient!tb;")
	public static Class187[] aClass187Array1;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "[Lclient!ki;")
	public static Class109[] aClass109Array1;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "[F")
	public static float[] aFloatArray28;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	public static int anInt6690;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "[I")
	public static int[] anIntArray499;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "[Lclient!pe;")
	public static Class154[] aClass154Array1;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	private static int anInt6698;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Z")
	private static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!tq;II)Lclient!vi;")
	public static Class2_Sub43 method5791(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5795(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5459(arg1, arg2);
			return local16 == null ? null : new Class2_Sub43(local16);
		} else {
			arg0.method5454(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)F")
	public static float method5794(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!tq;)Z")
	private static boolean method5795(@OriginalArg(0) Class191 arg0) {
		if (!aBoolean586) {
			@Pc(7) byte[] local7 = arg0.method5459(0, 0);
			if (local7 == null) {
				return false;
			}
			method5798(local7);
			aBoolean586 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([BI)V")
	public static void method5796(@OriginalArg(0) byte[] arg0) {
		aByteArray88 = arg0;
		anInt6698 = 0;
		anInt6688 = 0;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)I")
	public static int method5797(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6688) {
			local8 = 8 - anInt6688;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray88[anInt6698] >> anInt6688 & local14) << local3;
			anInt6688 = 0;
			anInt6698++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray88[anInt6698] >> anInt6688 & local8) << local3;
			anInt6688 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "([B)V")
	private static void method5798(@OriginalArg(0) byte[] arg0) {
		method5796(arg0);
		anInt6687 = 0x1 << method5797(4);
		anInt6690 = 0x1 << method5797(4);
		aFloatArray29 = new float[anInt6690];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6687 : anInt6690;
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
			local191 = Static301.method4605(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static183.method3309(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray28 = local39;
				aFloatArray25 = local84;
				aFloatArray27 = local136;
				anIntArray499 = local185;
			} else {
				aFloatArray23 = local39;
				aFloatArray26 = local84;
				aFloatArray24 = local136;
				anIntArray498 = local185;
			}
		}
		local24 = method5797(8) + 1;
		aClass109Array1 = new Class109[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass109Array1[local28] = new Class109();
		}
		local32 = method5797(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5797(16);
		}
		@Pc(269) int local269 = method5797(6) + 1;
		aClass187Array1 = new Class187[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass187Array1[local41] = new Class187();
		}
		@Pc(290) int local290 = method5797(6) + 1;
		aClass198Array1 = new Class198[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass198Array1[local86] = new Class198();
		}
		@Pc(311) int local311 = method5797(6) + 1;
		aClass154Array1 = new Class154[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass154Array1[local138] = new Class154();
		}
		@Pc(332) int local332 = method5797(6) + 1;
		aBooleanArray32 = new boolean[local332];
		anIntArray500 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray32[local191] = method5799() != 0;
			method5797(16);
			method5797(16);
			anIntArray500[local191] = method5797(8);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
	public static int method5799() {
		@Pc(7) int local7 = aByteArray88[anInt6698] >> anInt6688 & 0x1;
		anInt6688++;
		anInt6698 += anInt6688 >> 3;
		anInt6688 &= 0x7;
		return local7;
	}
}
