import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	private static int anInt3802;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public static int anInt3803;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "[Lclient!da;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	private static int anInt3805;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "[Lclient!ue;")
	public static Class243[] aClass243Array1;

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "[I")
	public static int[] anIntArray231;

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "[F")
	public static float[] aFloatArray15;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "[F")
	public static float[] aFloatArray16;

	@OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
	public static int anInt3810;

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "[F")
	public static float[] aFloatArray17;

	@OriginalMember(owner = "client!kl", name = "L", descriptor = "[Lclient!wg;")
	public static Class264[] aClass264Array1;

	@OriginalMember(owner = "client!kl", name = "N", descriptor = "[F")
	public static float[] aFloatArray18;

	@OriginalMember(owner = "client!kl", name = "P", descriptor = "[B")
	private static byte[] aByteArray46;

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "[Lclient!tk;")
	public static Class237[] aClass237Array1;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "Z")
	private static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!fo;)Z")
	private static boolean method3127(@OriginalArg(0) Class82 arg0) {
		if (!aBoolean426) {
			@Pc(7) byte[] local7 = arg0.method1817(0, 0);
			if (local7 == null) {
				return false;
			}
			method3133(local7);
			aBoolean426 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)F")
	public static float method3128(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)I")
	public static int method3129(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt3805) {
			local8 = 8 - anInt3805;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray46[anInt3802] >> anInt3805 & local14) << local3;
			anInt3805 = 0;
			anInt3802++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray46[anInt3802] >> anInt3805 & local8) << local3;
			anInt3805 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!fo;I)Lclient!kl;")
	public static Class1_Sub29 method3130(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		if (method3127(arg0)) {
			@Pc(14) byte[] local14 = arg0.method1815(arg1);
			return local14 == null ? null : new Class1_Sub29(local14);
		} else {
			arg0.method1820(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([BI)V")
	public static void method3131(@OriginalArg(0) byte[] arg0) {
		aByteArray46 = arg0;
		anInt3802 = 0;
		anInt3805 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "([B)V")
	private static void method3133(@OriginalArg(0) byte[] arg0) {
		method3131(arg0);
		anInt3803 = 0x1 << method3129(4);
		anInt3810 = 0x1 << method3129(4);
		aFloatArray14 = new float[anInt3810];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt3803 : anInt3810;
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
			local191 = Static428.method5666(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static285.method3941(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray16 = local39;
				aFloatArray15 = local84;
				aFloatArray12 = local136;
				anIntArray231 = local185;
			} else {
				aFloatArray13 = local39;
				aFloatArray18 = local84;
				aFloatArray17 = local136;
				anIntArray230 = local185;
			}
		}
		local24 = method3129(8) + 1;
		aClass264Array1 = new Class264[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass264Array1[local28] = new Class264();
		}
		local32 = method3129(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3129(16);
		}
		@Pc(269) int local269 = method3129(6) + 1;
		aClass243Array1 = new Class243[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass243Array1[local41] = new Class243();
		}
		@Pc(290) int local290 = method3129(6) + 1;
		aClass237Array1 = new Class237[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass237Array1[local86] = new Class237();
		}
		@Pc(311) int local311 = method3129(6) + 1;
		aClass49Array1 = new Class49[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass49Array1[local138] = new Class49();
		}
		@Pc(332) int local332 = method3129(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray232 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method3136() != 0;
			method3129(16);
			method3129(16);
			anIntArray232[local191] = method3129(8);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!fo;II)Lclient!kl;")
	public static Class1_Sub29 method3134(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3127(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1817(arg1, arg2);
			return local16 == null ? null : new Class1_Sub29(local16);
		} else {
			arg0.method1829(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
	public static int method3136() {
		@Pc(7) int local7 = aByteArray46[anInt3802] >> anInt3805 & 0x1;
		anInt3805++;
		anInt3802 += anInt3805 >> 3;
		anInt3805 &= 0x7;
		return local7;
	}
}
