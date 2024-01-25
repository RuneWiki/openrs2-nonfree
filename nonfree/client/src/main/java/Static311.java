import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	private static int anInt5990;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "[B")
	private static byte[] aByteArray79;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "[F")
	public static float[] aFloatArray42;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "[F")
	public static float[] aFloatArray43;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "[F")
	public static float[] aFloatArray44;

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "[F")
	public static float[] aFloatArray45;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "[Lclient!cd;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "[Lclient!tw;")
	public static Class291[] aClass291Array1;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "[F")
	public static float[] aFloatArray47;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "[F")
	public static float[] aFloatArray48;

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
	private static int anInt5995;

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
	public static int anInt5996;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "[Lclient!ug;")
	public static Class297[] aClass297Array1;

	@OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
	public static int anInt5999;

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "[Lclient!sn;")
	public static Class275[] aClass275Array1;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "[F")
	public static float[] aFloatArray49;

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "Z")
	private static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([BI)V")
	public static void method5004(@OriginalArg(0) byte[] arg0) {
		aByteArray79 = arg0;
		anInt5990 = 0;
		anInt5995 = 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!an;II)Lclient!mq;")
	public static Class12_Sub35 method5005(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method5007(arg0)) {
			@Pc(16) byte[] local16 = arg0.method408(arg1, arg2);
			return local16 == null ? null : new Class12_Sub35(local16);
		} else {
			arg0.method397(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!an;)Z")
	private static boolean method5007(@OriginalArg(0) Class16 arg0) {
		if (!aBoolean456) {
			@Pc(7) byte[] local7 = arg0.method408(0, 0);
			if (local7 == null) {
				return false;
			}
			method5012(local7);
			aBoolean456 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)F")
	public static float method5008(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!an;I)Lclient!mq;")
	public static Class12_Sub35 method5010(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		if (method5007(arg0)) {
			@Pc(14) byte[] local14 = arg0.method410(arg1);
			return local14 == null ? null : new Class12_Sub35(local14);
		} else {
			arg0.method389(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
	public static int method5011(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt5995) {
			local8 = 8 - anInt5995;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray79[anInt5990] >> anInt5995 & local14) << local3;
			anInt5995 = 0;
			anInt5990++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray79[anInt5990] >> anInt5995 & local8) << local3;
			anInt5995 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "([B)V")
	private static void method5012(@OriginalArg(0) byte[] arg0) {
		method5004(arg0);
		anInt5999 = 0x1 << method5011(4);
		anInt5996 = 0x1 << method5011(4);
		aFloatArray44 = new float[anInt5996];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt5999 : anInt5996;
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
			local191 = Static483.method7240(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static183.method3611(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray42 = local39;
				aFloatArray43 = local84;
				aFloatArray49 = local136;
				anIntArray418 = local185;
			} else {
				aFloatArray48 = local39;
				aFloatArray45 = local84;
				aFloatArray47 = local136;
				anIntArray419 = local185;
			}
		}
		local24 = method5011(8) + 1;
		aClass297Array1 = new Class297[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass297Array1[local28] = new Class297();
		}
		local32 = method5011(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method5011(16);
		}
		@Pc(269) int local269 = method5011(6) + 1;
		aClass48Array1 = new Class48[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass48Array1[local41] = new Class48();
		}
		@Pc(290) int local290 = method5011(6) + 1;
		aClass291Array1 = new Class291[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass291Array1[local86] = new Class291();
		}
		@Pc(311) int local311 = method5011(6) + 1;
		aClass275Array1 = new Class275[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass275Array1[local138] = new Class275();
		}
		@Pc(332) int local332 = method5011(6) + 1;
		aBooleanArray38 = new boolean[local332];
		anIntArray417 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray38[local191] = method5015() != 0;
			method5011(16);
			method5011(16);
			anIntArray417[local191] = method5011(8);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "()I")
	public static int method5015() {
		@Pc(7) int local7 = aByteArray79[anInt5990] >> anInt5995 & 0x1;
		anInt5995++;
		anInt5990 += anInt5995 >> 3;
		anInt5995 &= 0x7;
		return local7;
	}
}
