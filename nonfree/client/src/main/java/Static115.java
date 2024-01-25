import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!di", name = "o", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "[B")
	private static byte[] aByteArray24;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "I")
	private static int anInt1924;

	@OriginalMember(owner = "client!di", name = "T", descriptor = "I")
	public static int anInt1926;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "I")
	private static int anInt1928;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "[Lclient!jaa;")
	public static Class189[] aClass189Array1;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "I")
	public static int anInt1930;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "[Lclient!fr;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "[Lclient!fq;")
	public static Class127[] aClass127Array1;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "[Lclient!ml;")
	public static Class246[] aClass246Array1;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "[I")
	public static int[] anIntArray151;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Z")
	private static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)F")
	public static float method1662(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!nca;II)Lclient!di;")
	public static Class2_Sub17 method1663(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1671(arg0)) {
			@Pc(16) byte[] local16 = arg0.method6087(arg2, arg1);
			return local16 == null ? null : new Class2_Sub17(local16);
		} else {
			arg0.method6071(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!nca;I)Lclient!di;")
	public static Class2_Sub17 method1664(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1) {
		if (method1671(arg0)) {
			@Pc(14) byte[] local14 = arg0.method6079(arg1);
			return local14 == null ? null : new Class2_Sub17(local14);
		} else {
			arg0.method6072(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([B)V")
	private static void method1665(@OriginalArg(0) byte[] arg0) {
		method1669(arg0);
		anInt1926 = 0x1 << method1668(4);
		anInt1930 = 0x1 << method1668(4);
		aFloatArray12 = new float[anInt1930];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1926 : anInt1930;
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
			local191 = Static496.method7088(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static257.method3644(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray13 = local39;
				aFloatArray15 = local84;
				aFloatArray16 = local136;
				anIntArray151 = local185;
			} else {
				aFloatArray9 = local39;
				aFloatArray11 = local84;
				aFloatArray10 = local136;
				anIntArray149 = local185;
			}
		}
		local24 = method1668(8) + 1;
		aClass246Array1 = new Class246[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass246Array1[local28] = new Class246();
		}
		local32 = method1668(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1668(16);
		}
		@Pc(269) int local269 = method1668(6) + 1;
		aClass127Array1 = new Class127[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass127Array1[local41] = new Class127();
		}
		@Pc(290) int local290 = method1668(6) + 1;
		aClass189Array1 = new Class189[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass189Array1[local86] = new Class189();
		}
		@Pc(311) int local311 = method1668(6) + 1;
		aClass128Array1 = new Class128[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass128Array1[local138] = new Class128();
		}
		@Pc(332) int local332 = method1668(6) + 1;
		aBooleanArray10 = new boolean[local332];
		anIntArray150 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray10[local191] = method1670() != 0;
			method1668(16);
			method1668(16);
			anIntArray150[local191] = method1668(8);
		}
		aBoolean227 = true;
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)I")
	public static int method1668(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1924) {
			local8 = 8 - anInt1924;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray24[anInt1928] >> anInt1924 & local14) << local3;
			anInt1924 = 0;
			anInt1928++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray24[anInt1928] >> anInt1924 & local8) << local3;
			anInt1924 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
	public static void method1669(@OriginalArg(0) byte[] arg0) {
		aByteArray24 = arg0;
		anInt1928 = 0;
		anInt1924 = 0;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()I")
	public static int method1670() {
		@Pc(7) int local7 = aByteArray24[anInt1928] >> anInt1924 & 0x1;
		anInt1924++;
		anInt1928 += anInt1924 >> 3;
		anInt1924 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!nca;)Z")
	private static boolean method1671(@OriginalArg(0) Class254 arg0) {
		if (!aBoolean227) {
			@Pc(7) byte[] local7 = arg0.method6087(0, 0);
			if (local7 == null) {
				return false;
			}
			method1665(local7);
		}
		return true;
	}
}
