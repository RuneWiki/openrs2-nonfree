import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
	private static int anInt7614;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "[Lclient!tj;")
	public static Class338[] aClass338Array1;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "[F")
	public static float[] aFloatArray45;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "[F")
	public static float[] aFloatArray46;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray135;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "[F")
	public static float[] aFloatArray47;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "[B")
	private static byte[] aByteArray91;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "[I")
	public static int[] anIntArray551;

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "[Lclient!bg;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
	private static int anInt7617;

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
	public static int anInt7618;

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "[F")
	public static float[] aFloatArray51;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "[Lclient!kl;")
	public static Class194[] aClass194Array1;

	@OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
	public static int anInt7619;

	@OriginalMember(owner = "client!qv", name = "M", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!qv", name = "N", descriptor = "[Lclient!fba;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!qv", name = "P", descriptor = "[F")
	public static float[] aFloatArray52;

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "Z")
	private static boolean aBoolean565 = false;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!wu;)Z")
	private static boolean method6418(@OriginalArg(0) Class380 arg0) {
		if (!aBoolean565) {
			@Pc(7) byte[] local7 = arg0.method8620(0, 0);
			if (local7 == null) {
				return false;
			}
			method6421(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "([B)V")
	private static void method6421(@OriginalArg(0) byte[] arg0) {
		method6428(arg0);
		anInt7619 = 0x1 << method6422(4);
		anInt7618 = 0x1 << method6422(4);
		aFloatArray52 = new float[anInt7618];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt7619 : anInt7618;
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
			local191 = Static418.method5598(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static19.method403(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray48 = local39;
				aFloatArray46 = local84;
				aFloatArray51 = local136;
				anIntArray553 = local185;
			} else {
				aFloatArray49 = local39;
				aFloatArray47 = local84;
				aFloatArray45 = local136;
				anIntArray551 = local185;
			}
		}
		local24 = method6422(8) + 1;
		aClass103Array1 = new Class103[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass103Array1[local28] = new Class103();
		}
		local32 = method6422(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method6422(16);
		}
		@Pc(269) int local269 = method6422(6) + 1;
		aClass338Array1 = new Class338[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass338Array1[local41] = new Class338();
		}
		@Pc(290) int local290 = method6422(6) + 1;
		aClass194Array1 = new Class194[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass194Array1[local86] = new Class194();
		}
		@Pc(311) int local311 = method6422(6) + 1;
		aClass31Array1 = new Class31[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass31Array1[local138] = new Class31();
		}
		@Pc(332) int local332 = method6422(6) + 1;
		aBooleanArray135 = new boolean[local332];
		anIntArray552 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray135[local191] = method6424() != 0;
			method6422(16);
			method6422(16);
			anIntArray552[local191] = method6422(8);
		}
		aBoolean565 = true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)I")
	public static int method6422(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt7617) {
			local8 = 8 - anInt7617;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray91[anInt7614] >> anInt7617 & local14) << local3;
			anInt7617 = 0;
			anInt7614++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray91[anInt7614] >> anInt7617 & local8) << local3;
			anInt7617 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "()I")
	public static int method6424() {
		@Pc(7) int local7 = aByteArray91[anInt7614] >> anInt7617 & 0x1;
		anInt7617++;
		anInt7614 += anInt7617 >> 3;
		anInt7617 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)F")
	public static float method6425(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!wu;I)Lclient!qv;")
	public static Class2_Sub39 method6426(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1) {
		if (method6418(arg0)) {
			@Pc(14) byte[] local14 = arg0.method8616(arg1);
			return local14 == null ? null : new Class2_Sub39(local14);
		} else {
			arg0.method8638(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!wu;II)Lclient!qv;")
	public static Class2_Sub39 method6427(@OriginalArg(0) Class380 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method6418(arg0)) {
			@Pc(16) byte[] local16 = arg0.method8620(arg1, arg2);
			return local16 == null ? null : new Class2_Sub39(local16);
		} else {
			arg0.method8619(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([BI)V")
	public static void method6428(@OriginalArg(0) byte[] arg0) {
		aByteArray91 = arg0;
		anInt7614 = 0;
		anInt7617 = 0;
	}
}
