import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	public static int anInt361;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "[Lclient!i;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "[Lclient!ei;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
	private static int anInt363;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	public static int anInt364;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "[Lclient!pi;")
	public static Class81[] aClass81Array1;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "[B")
	private static byte[] aByteArray5;

	@OriginalMember(owner = "client!bj", name = "K", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
	private static int anInt367;

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!bj", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "[Lclient!vg;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "Z")
	private static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!wa;)Z")
	private static boolean method306(@OriginalArg(0) Class23 arg0) {
		if (!aBoolean20) {
			@Pc(7) byte[] local7 = arg0.method738(0, 0);
			if (local7 == null) {
				return false;
			}
			method312(local7);
			aBoolean20 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V")
	public static void method307(@OriginalArg(0) byte[] arg0) {
		aByteArray5 = arg0;
		anInt367 = 0;
		anInt363 = 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!wa;II)Lclient!bj;")
	public static Class5_Sub5 method310(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method306(arg0)) {
			@Pc(16) byte[] local16 = arg0.method738(arg2, arg1);
			return local16 == null ? null : new Class5_Sub5(local16);
		} else {
			arg0.method756(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V")
	private static void method312(@OriginalArg(0) byte[] arg0) {
		method307(arg0);
		anInt364 = 0x1 << method314(4);
		anInt361 = 0x1 << method314(4);
		aFloatArray5 = new float[anInt361];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt364 : anInt361;
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
			local191 = Static204.method3021(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static84.method1441(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray4 = local39;
				aFloatArray7 = local84;
				aFloatArray2 = local136;
				anIntArray27 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray6 = local84;
				aFloatArray3 = local136;
				anIntArray26 = local185;
			}
		}
		local24 = method314(8) + 1;
		aClass81Array1 = new Class81[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass81Array1[local28] = new Class81();
		}
		local32 = method314(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method314(16);
		}
		@Pc(269) int local269 = method314(6) + 1;
		aClass103Array1 = new Class103[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass103Array1[local41] = new Class103();
		}
		@Pc(290) int local290 = method314(6) + 1;
		aClass42Array1 = new Class42[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass42Array1[local86] = new Class42();
		}
		@Pc(311) int local311 = method314(6) + 1;
		aClass28Array1 = new Class28[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass28Array1[local138] = new Class28();
		}
		@Pc(332) int local332 = method314(6) + 1;
		aBooleanArray7 = new boolean[local332];
		anIntArray25 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray7[local191] = method316() != 0;
			method314(16);
			method314(16);
			anIntArray25[local191] = method314(8);
		}
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)F")
	public static float method313(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
	public static int method314(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt363) {
			local8 = 8 - anInt363;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray5[anInt367] >> anInt363 & local14) << local3;
			anInt363 = 0;
			anInt367++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray5[anInt367] >> anInt363 & local8) << local3;
			anInt363 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
	public static int method316() {
		@Pc(7) int local7 = aByteArray5[anInt367] >> anInt363 & 0x1;
		anInt363++;
		anInt367 += anInt363 >> 3;
		anInt363 &= 0x7;
		return local7;
	}
}
