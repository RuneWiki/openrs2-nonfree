import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "[F")
	public static float[] aFloatArray27;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "[Lclient!cj;")
	public static Class55[] aClass55Array1;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "[Lclient!wn;")
	public static Class359[] aClass359Array1;

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "[F")
	public static float[] aFloatArray29;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "[Lclient!pq;")
	public static Class272[] aClass272Array1;

	@OriginalMember(owner = "client!jda", name = "r", descriptor = "[Lclient!bl;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!jda", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
	public static int anInt4769;

	@OriginalMember(owner = "client!jda", name = "x", descriptor = "[B")
	private static byte[] aByteArray51;

	@OriginalMember(owner = "client!jda", name = "z", descriptor = "[F")
	public static float[] aFloatArray30;

	@OriginalMember(owner = "client!jda", name = "B", descriptor = "[F")
	public static float[] aFloatArray31;

	@OriginalMember(owner = "client!jda", name = "D", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
	private static int anInt4772;

	@OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
	public static int anInt4773;

	@OriginalMember(owner = "client!jda", name = "G", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!jda", name = "H", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!jda", name = "I", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
	private static int anInt4774;

	@OriginalMember(owner = "client!jda", name = "K", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!jda", name = "M", descriptor = "[F")
	public static float[] aFloatArray34;

	@OriginalMember(owner = "client!jda", name = "o", descriptor = "Z")
	private static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "([B)V")
	private static void method4060(@OriginalArg(0) byte[] arg0) {
		method4064(arg0);
		anInt4773 = 0x1 << method4061(4);
		anInt4769 = 0x1 << method4061(4);
		aFloatArray27 = new float[anInt4769];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4773 : anInt4769;
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
			local191 = Static415.method5946(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static557.method98(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray29 = local39;
				aFloatArray31 = local84;
				aFloatArray34 = local136;
				anIntArray420 = local185;
			} else {
				aFloatArray30 = local39;
				aFloatArray32 = local84;
				aFloatArray33 = local136;
				anIntArray421 = local185;
			}
		}
		local24 = method4061(8) + 1;
		aClass272Array1 = new Class272[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass272Array1[local28] = new Class272();
		}
		local32 = method4061(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method4061(16);
		}
		@Pc(269) int local269 = method4061(6) + 1;
		aClass33Array1 = new Class33[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass33Array1[local41] = new Class33();
		}
		@Pc(290) int local290 = method4061(6) + 1;
		aClass55Array1 = new Class55[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass55Array1[local86] = new Class55();
		}
		@Pc(311) int local311 = method4061(6) + 1;
		aClass359Array1 = new Class359[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass359Array1[local138] = new Class359();
		}
		@Pc(332) int local332 = method4061(6) + 1;
		aBooleanArray20 = new boolean[local332];
		anIntArray419 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray20[local191] = method4069() != 0;
			method4061(16);
			method4061(16);
			anIntArray419[local191] = method4061(8);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)I")
	public static int method4061(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4774) {
			local8 = 8 - anInt4774;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray51[anInt4772] >> anInt4774 & local14) << local3;
			anInt4774 = 0;
			anInt4772++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray51[anInt4772] >> anInt4774 & local8) << local3;
			anInt4774 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "([BI)V")
	public static void method4064(@OriginalArg(0) byte[] arg0) {
		aByteArray51 = arg0;
		anInt4772 = 0;
		anInt4774 = 0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!bi;)Z")
	private static boolean method4065(@OriginalArg(0) Class31 arg0) {
		if (!aBoolean356) {
			@Pc(7) byte[] local7 = arg0.method667(0, 0);
			if (local7 == null) {
				return false;
			}
			method4060(local7);
			aBoolean356 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!bi;I)Lclient!jda;")
	public static Class4_Sub24 method4066(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1) {
		if (method4065(arg0)) {
			@Pc(14) byte[] local14 = arg0.method661(arg1);
			return local14 == null ? null : new Class4_Sub24(local14);
		} else {
			arg0.method679(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!bi;II)Lclient!jda;")
	public static Class4_Sub24 method4068(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method4065(arg0)) {
			@Pc(16) byte[] local16 = arg0.method667(arg1, arg2);
			return local16 == null ? null : new Class4_Sub24(local16);
		} else {
			arg0.method668(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "()I")
	public static int method4069() {
		@Pc(7) int local7 = aByteArray51[anInt4772] >> anInt4774 & 0x1;
		anInt4774++;
		anInt4772 += anInt4774 >> 3;
		anInt4774 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)F")
	public static float method4070(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
