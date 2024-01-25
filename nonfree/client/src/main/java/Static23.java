import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[Lclient!ws;")
	public static Class268[] aClass268Array1;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	public static int anInt683;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private static int anInt684;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public static int anInt686;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "[Lclient!oj;")
	public static Class176[] aClass176Array1;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "[Lclient!jv;")
	public static Class129[] aClass129Array1;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "[B")
	private static byte[] aByteArray5;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "[Lclient!tm;")
	public static Class222[] aClass222Array1;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	private static int anInt692;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "Z")
	private static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dn;II)Lclient!bb;")
	public static Class3_Sub6 method647(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method657(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1384(arg1, arg2);
			return local16 == null ? null : new Class3_Sub6(local16);
		} else {
			arg0.method1388(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	public static int method648(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt692) {
			local8 = 8 - anInt692;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray5[anInt684] >> anInt692 & local14) << local3;
			anInt692 = 0;
			anInt684++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray5[anInt684] >> anInt692 & local8) << local3;
			anInt692 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)F")
	public static float method649(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dn;I)Lclient!bb;")
	public static Class3_Sub6 method650(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		if (method657(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1391(arg1);
			return local14 == null ? null : new Class3_Sub6(local14);
		} else {
			arg0.method1365(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()I")
	public static int method653() {
		@Pc(7) int local7 = aByteArray5[anInt684] >> anInt692 & 0x1;
		anInt692++;
		anInt684 += anInt692 >> 3;
		anInt692 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "([B)V")
	private static void method655(@OriginalArg(0) byte[] arg0) {
		method656(arg0);
		anInt686 = 0x1 << method648(4);
		anInt683 = 0x1 << method648(4);
		aFloatArray3 = new float[anInt683];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt686 : anInt683;
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
			local191 = Static345.method4948(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static123.method2188(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray9 = local39;
				aFloatArray6 = local84;
				aFloatArray4 = local136;
				anIntArray52 = local185;
			} else {
				aFloatArray7 = local39;
				aFloatArray10 = local84;
				aFloatArray5 = local136;
				anIntArray51 = local185;
			}
		}
		local24 = method648(8) + 1;
		aClass129Array1 = new Class129[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass129Array1[local28] = new Class129();
		}
		local32 = method648(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method648(16);
		}
		@Pc(269) int local269 = method648(6) + 1;
		aClass268Array1 = new Class268[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass268Array1[local41] = new Class268();
		}
		@Pc(290) int local290 = method648(6) + 1;
		aClass222Array1 = new Class222[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass222Array1[local86] = new Class222();
		}
		@Pc(311) int local311 = method648(6) + 1;
		aClass176Array1 = new Class176[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass176Array1[local138] = new Class176();
		}
		@Pc(332) int local332 = method648(6) + 1;
		aBooleanArray4 = new boolean[local332];
		anIntArray53 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray4[local191] = method653() != 0;
			method648(16);
			method648(16);
			anIntArray53[local191] = method648(8);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BI)V")
	public static void method656(@OriginalArg(0) byte[] arg0) {
		aByteArray5 = arg0;
		anInt684 = 0;
		anInt692 = 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dn;)Z")
	private static boolean method657(@OriginalArg(0) Class56 arg0) {
		if (!aBoolean30) {
			@Pc(7) byte[] local7 = arg0.method1384(0, 0);
			if (local7 == null) {
				return false;
			}
			method655(local7);
			aBoolean30 = true;
		}
		return true;
	}
}
