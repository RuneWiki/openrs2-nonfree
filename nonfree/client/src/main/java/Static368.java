import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "[B")
	private static byte[] aByteArray77;

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "[Lclient!qea;")
	public static Class261[] aClass261Array1;

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "[Lclient!sd;")
	public static Class283[] aClass283Array1;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "[Lclient!ub;")
	public static Class312[] aClass312Array1;

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "[F")
	public static float[] aFloatArray47;

	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!ofa", name = "w", descriptor = "I")
	private static int anInt6955;

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "[I")
	public static int[] anIntArray493;

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ofa", name = "z", descriptor = "[F")
	public static float[] aFloatArray50;

	@OriginalMember(owner = "client!ofa", name = "B", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
	private static int anInt6957;

	@OriginalMember(owner = "client!ofa", name = "F", descriptor = "[F")
	public static float[] aFloatArray53;

	@OriginalMember(owner = "client!ofa", name = "H", descriptor = "I")
	public static int anInt6959;

	@OriginalMember(owner = "client!ofa", name = "J", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!ofa", name = "K", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!ofa", name = "L", descriptor = "[Lclient!kl;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!ofa", name = "M", descriptor = "I")
	public static int anInt6961;

	@OriginalMember(owner = "client!ofa", name = "P", descriptor = "[F")
	public static float[] aFloatArray54;

	@OriginalMember(owner = "client!ofa", name = "S", descriptor = "Z")
	private static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "()I")
	public static int method5859() {
		@Pc(7) int local7 = aByteArray77[anInt6955] >> anInt6957 & 0x1;
		anInt6957++;
		anInt6955 += anInt6957 >> 3;
		anInt6957 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!jo;)Z")
	private static boolean method5860(@OriginalArg(0) Class168 arg0) {
		if (!aBoolean521) {
			@Pc(7) byte[] local7 = arg0.method4435(0, 0);
			if (local7 == null) {
				return false;
			}
			method5862(local7);
			aBoolean521 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "([B)V")
	private static void method5862(@OriginalArg(0) byte[] arg0) {
		method5867(arg0);
		anInt6961 = 0x1 << method5866(4);
		anInt6959 = 0x1 << method5866(4);
		aFloatArray51 = new float[anInt6959];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt6961 : anInt6959;
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
			local191 = Static330.method5267(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static146.method7206(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray49 = local39;
				aFloatArray48 = local84;
				aFloatArray54 = local136;
				anIntArray495 = local185;
			} else {
				aFloatArray47 = local39;
				aFloatArray50 = local84;
				aFloatArray53 = local136;
				anIntArray494 = local185;
			}
		}
		local24 = method5866(8) + 1;
		aClass312Array1 = new Class312[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass312Array1[local28] = new Class312();
		}
		local32 = method5866(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5866(16);
		}
		@Pc(269) int local269 = method5866(6) + 1;
		aClass283Array1 = new Class283[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass283Array1[local41] = new Class283();
		}
		@Pc(290) int local290 = method5866(6) + 1;
		aClass261Array1 = new Class261[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass261Array1[local86] = new Class261();
		}
		@Pc(311) int local311 = method5866(6) + 1;
		aClass186Array1 = new Class186[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass186Array1[local138] = new Class186();
		}
		@Pc(332) int local332 = method5866(6) + 1;
		aBooleanArray25 = new boolean[local332];
		anIntArray493 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray25[local191] = method5859() != 0;
			method5866(16);
			method5866(16);
			anIntArray493[local191] = method5866(8);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!jo;II)Lclient!ofa;")
	public static Class6_Sub37 method5863(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5860(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4435(arg2, arg1);
			return local16 == null ? null : new Class6_Sub37(local16);
		} else {
			arg0.method4455(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)F")
	public static float method5865(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)I")
	public static int method5866(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt6957) {
			local8 = 8 - anInt6957;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray77[anInt6955] >> anInt6957 & local14) << local3;
			anInt6957 = 0;
			anInt6955++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray77[anInt6955] >> anInt6957 & local8) << local3;
			anInt6957 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BI)V")
	public static void method5867(@OriginalArg(0) byte[] arg0) {
		aByteArray77 = arg0;
		anInt6955 = 0;
		anInt6957 = 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!jo;I)Lclient!ofa;")
	public static Class6_Sub37 method5869(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1) {
		if (method5860(arg0)) {
			@Pc(14) byte[] local14 = arg0.method4438(arg1);
			return local14 == null ? null : new Class6_Sub37(local14);
		} else {
			arg0.method4427(arg1);
			return null;
		}
	}
}
