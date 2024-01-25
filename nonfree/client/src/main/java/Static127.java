import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
	public static int[] anIntArray167;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "[Lclient!tn;")
	public static Class192[] aClass192Array1;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
	public static int[] anIntArray168;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private static int anInt2315;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "[Lclient!m;")
	public static Class128[] aClass128Array1;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	public static int anInt2317;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "[Lclient!ud;")
	public static Class197[] aClass197Array1;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	public static int anInt2319;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	private static int anInt2320;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "[Lclient!gn;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
	private static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)F")
	public static float method1930(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!nq;II)Lclient!ie;")
	public static Class11_Sub20 method1935(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1938(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3896(arg2, arg1);
			return local16 == null ? null : new Class11_Sub20(local16);
		} else {
			arg0.method3916(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
	public static void method1936(@OriginalArg(0) byte[] arg0) {
		aByteArray33 = arg0;
		anInt2315 = 0;
		anInt2320 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([B)V")
	private static void method1937(@OriginalArg(0) byte[] arg0) {
		method1936(arg0);
		anInt2319 = 0x1 << method1939(4);
		anInt2317 = 0x1 << method1939(4);
		aFloatArray14 = new float[anInt2317];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2319 : anInt2317;
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
			local191 = Static184.method3190(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static220.method3947(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray11 = local39;
				aFloatArray10 = local84;
				aFloatArray12 = local136;
				anIntArray169 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray9 = local84;
				aFloatArray7 = local136;
				anIntArray168 = local185;
			}
		}
		local24 = method1939(8) + 1;
		aClass85Array1 = new Class85[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass85Array1[local28] = new Class85();
		}
		local32 = method1939(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1939(16);
		}
		@Pc(269) int local269 = method1939(6) + 1;
		aClass128Array1 = new Class128[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass128Array1[local41] = new Class128();
		}
		@Pc(290) int local290 = method1939(6) + 1;
		aClass192Array1 = new Class192[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass192Array1[local86] = new Class192();
		}
		@Pc(311) int local311 = method1939(6) + 1;
		aClass197Array1 = new Class197[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass197Array1[local138] = new Class197();
		}
		@Pc(332) int local332 = method1939(6) + 1;
		aBooleanArray11 = new boolean[local332];
		anIntArray167 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray11[local191] = method1940() != 0;
			method1939(16);
			method1939(16);
			anIntArray167[local191] = method1939(8);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!nq;)Z")
	private static boolean method1938(@OriginalArg(0) Class144 arg0) {
		if (!aBoolean149) {
			@Pc(7) byte[] local7 = arg0.method3896(0, 0);
			if (local7 == null) {
				return false;
			}
			method1937(local7);
			aBoolean149 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I")
	public static int method1939(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2320) {
			local8 = 8 - anInt2320;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray33[anInt2315] >> anInt2320 & local14) << local3;
			anInt2320 = 0;
			anInt2315++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray33[anInt2315] >> anInt2320 & local8) << local3;
			anInt2320 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
	public static int method1940() {
		@Pc(7) int local7 = aByteArray33[anInt2315] >> anInt2320 & 0x1;
		anInt2320++;
		anInt2315 += anInt2320 >> 3;
		anInt2320 &= 0x7;
		return local7;
	}
}
