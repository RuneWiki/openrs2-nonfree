import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "[F")
	public static float[] aFloatArray36;

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "[Lclient!ek;")
	public static Class86[] aClass86Array1;

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "[F")
	public static float[] aFloatArray38;

	@OriginalMember(owner = "client!fw", name = "s", descriptor = "[F")
	public static float[] aFloatArray39;

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
	private static int anInt3826;

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "[Lclient!tca;")
	public static Class318[] aClass318Array1;

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
	private static int anInt3827;

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!fw", name = "D", descriptor = "[F")
	public static float[] aFloatArray40;

	@OriginalMember(owner = "client!fw", name = "G", descriptor = "[Lclient!dr;")
	public static Class70[] aClass70Array1;

	@OriginalMember(owner = "client!fw", name = "H", descriptor = "[Lclient!wga;")
	public static Class375[] aClass375Array1;

	@OriginalMember(owner = "client!fw", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
	public static int anInt3830;

	@OriginalMember(owner = "client!fw", name = "L", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!fw", name = "M", descriptor = "[F")
	public static float[] aFloatArray41;

	@OriginalMember(owner = "client!fw", name = "O", descriptor = "[B")
	private static byte[] aByteArray26;

	@OriginalMember(owner = "client!fw", name = "K", descriptor = "Z")
	private static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ni;)Z")
	private static boolean method3239(@OriginalArg(0) Class223 arg0) {
		if (!aBoolean306) {
			@Pc(7) byte[] local7 = arg0.method5954(0, 0);
			if (local7 == null) {
				return false;
			}
			method3249(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "()I")
	public static int method3240() {
		@Pc(7) int local7 = aByteArray26[anInt3826] >> anInt3827 & 0x1;
		anInt3827++;
		anInt3826 += anInt3827 >> 3;
		anInt3827 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ni;I)Lclient!fw;")
	public static Class6_Sub20 method3243(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		if (method3239(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5942(arg1);
			return local14 == null ? null : new Class6_Sub20(local14);
		} else {
			arg0.method5951(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
	public static int method3244(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3827) {
			local8 = 8 - anInt3827;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray26[anInt3826] >> anInt3827 & local14) << local3;
			anInt3827 = 0;
			anInt3826++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray26[anInt3826] >> anInt3827 & local8) << local3;
			anInt3827 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)F")
	public static float method3245(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ni;II)Lclient!fw;")
	public static Class6_Sub20 method3246(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3239(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5954(arg2, arg1);
			return local16 == null ? null : new Class6_Sub20(local16);
		} else {
			arg0.method5960(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([BI)V")
	public static void method3247(@OriginalArg(0) byte[] arg0) {
		aByteArray26 = arg0;
		anInt3826 = 0;
		anInt3827 = 0;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "([B)V")
	private static void method3249(@OriginalArg(0) byte[] arg0) {
		method3247(arg0);
		anInt3825 = 0x1 << method3244(4);
		anInt3830 = 0x1 << method3244(4);
		aFloatArray35 = new float[anInt3830];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3825 : anInt3830;
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
			local191 = Static126.method2629(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static568.method2116(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray37 = local39;
				aFloatArray40 = local84;
				aFloatArray41 = local136;
				anIntArray172 = local185;
			} else {
				aFloatArray36 = local39;
				aFloatArray39 = local84;
				aFloatArray38 = local136;
				anIntArray171 = local185;
			}
		}
		local24 = method3244(8) + 1;
		aClass86Array1 = new Class86[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass86Array1[local28] = new Class86();
		}
		local32 = method3244(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3244(16);
		}
		@Pc(269) int local269 = method3244(6) + 1;
		aClass70Array1 = new Class70[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass70Array1[local41] = new Class70();
		}
		@Pc(290) int local290 = method3244(6) + 1;
		aClass318Array1 = new Class318[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass318Array1[local86] = new Class318();
		}
		@Pc(311) int local311 = method3244(6) + 1;
		aClass375Array1 = new Class375[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass375Array1[local138] = new Class375();
		}
		@Pc(332) int local332 = method3244(6) + 1;
		aBooleanArray8 = new boolean[local332];
		anIntArray173 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray8[local191] = method3240() != 0;
			method3244(16);
			method3244(16);
			anIntArray173[local191] = method3244(8);
		}
		aBoolean306 = true;
	}
}
