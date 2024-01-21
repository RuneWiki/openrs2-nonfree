import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	public static int anInt611;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	public static int anInt613;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[Lclient!l;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "[B")
	private static byte[] aByteArray6;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private static int anInt615;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[Lclient!gf;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	private static int anInt618;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "[Lclient!we;")
	public static Class89[] aClass89Array1;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "[Lclient!rc;")
	public static Class69[] aClass69Array1;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "Z")
	private static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)F")
	public static float method482(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
	public static int method483(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt615) {
			local8 = 8 - anInt615;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray6[anInt618] >> anInt615 & local14) << local3;
			anInt615 = 0;
			anInt618++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray6[anInt618] >> anInt615 & local8) << local3;
			anInt615 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;)Z")
	private static boolean method484(@OriginalArg(0) Class76 arg0) {
		if (!aBoolean25) {
			@Pc(7) byte[] local7 = arg0.method3316(0, 0);
			if (local7 == null) {
				return false;
			}
			method492(local7);
			aBoolean25 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	public static void method485() {
		aByteArray6 = null;
		aClass89Array1 = null;
		aClass44Array1 = null;
		aClass31Array1 = null;
		aClass69Array1 = null;
		aBooleanArray1 = null;
		anIntArray36 = null;
		aFloatArray2 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray7 = null;
		aFloatArray1 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		anIntArray37 = null;
		anIntArray38 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BI)V")
	public static void method487(@OriginalArg(0) byte[] arg0) {
		aByteArray6 = arg0;
		anInt618 = 0;
		anInt615 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!u;II)Lclient!cc;")
	public static Class1_Sub6 method490(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method484(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3316(arg2, arg1);
			return local16 == null ? null : new Class1_Sub6(local16);
		} else {
			arg0.method3329(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()I")
	public static int method491() {
		@Pc(7) int local7 = aByteArray6[anInt618] >> anInt615 & 0x1;
		anInt615++;
		anInt618 += anInt615 >> 3;
		anInt615 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "([B)V")
	private static void method492(@OriginalArg(0) byte[] arg0) {
		method487(arg0);
		anInt611 = 0x1 << method483(4);
		anInt613 = 0x1 << method483(4);
		aFloatArray2 = new float[anInt613];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt611 : anInt613;
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
			local191 = Static121.method2476(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static125.method2529(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray4 = local84;
				aFloatArray7 = local136;
				anIntArray37 = local185;
			} else {
				aFloatArray1 = local39;
				aFloatArray3 = local84;
				aFloatArray8 = local136;
				anIntArray38 = local185;
			}
		}
		local24 = method483(8) + 1;
		aClass89Array1 = new Class89[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass89Array1[local28] = new Class89();
		}
		local32 = method483(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method483(16);
		}
		@Pc(269) int local269 = method483(6) + 1;
		aClass44Array1 = new Class44[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass44Array1[local41] = new Class44();
		}
		@Pc(290) int local290 = method483(6) + 1;
		aClass31Array1 = new Class31[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass31Array1[local86] = new Class31();
		}
		@Pc(311) int local311 = method483(6) + 1;
		aClass69Array1 = new Class69[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass69Array1[local138] = new Class69();
		}
		@Pc(332) int local332 = method483(6) + 1;
		aBooleanArray1 = new boolean[local332];
		anIntArray36 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray1[local191] = method491() != 0;
			method483(16);
			method483(16);
			anIntArray36[local191] = method483(8);
		}
	}
}
