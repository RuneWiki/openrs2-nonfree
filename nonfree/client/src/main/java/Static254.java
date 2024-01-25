import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[F")
	public static float[] aFloatArray32;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "[F")
	public static float[] aFloatArray33;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	private static int anInt4640;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "[Lclient!is;")
	public static Class149[] aClass149Array1;

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "[Lclient!vv;")
	public static Class337[] aClass337Array1;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "[F")
	public static float[] aFloatArray35;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
	public static int anInt4641;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!ju", name = "D", descriptor = "[Lclient!sfa;")
	public static Class290[] aClass290Array1;

	@OriginalMember(owner = "client!ju", name = "F", descriptor = "[F")
	public static float[] aFloatArray36;

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
	private static int anInt4642;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "[Lclient!te;")
	public static Class305[] aClass305Array1;

	@OriginalMember(owner = "client!ju", name = "K", descriptor = "[F")
	public static float[] aFloatArray37;

	@OriginalMember(owner = "client!ju", name = "L", descriptor = "[F")
	public static float[] aFloatArray38;

	@OriginalMember(owner = "client!ju", name = "N", descriptor = "[F")
	public static float[] aFloatArray39;

	@OriginalMember(owner = "client!ju", name = "Q", descriptor = "I")
	public static int anInt4646;

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "Z")
	private static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([B)V")
	private static void method3941(@OriginalArg(0) byte[] arg0) {
		method3952(arg0);
		anInt4641 = 0x1 << method3950(4);
		anInt4646 = 0x1 << method3950(4);
		aFloatArray36 = new float[anInt4646];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt4641 : anInt4646;
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
			local191 = Static1.method54(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static154.method2452(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray32 = local39;
				aFloatArray35 = local84;
				aFloatArray37 = local136;
				anIntArray386 = local185;
			} else {
				aFloatArray39 = local39;
				aFloatArray38 = local84;
				aFloatArray33 = local136;
				anIntArray385 = local185;
			}
		}
		local24 = method3950(8) + 1;
		aClass337Array1 = new Class337[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass337Array1[local28] = new Class337();
		}
		local32 = method3950(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method3950(16);
		}
		@Pc(269) int local269 = method3950(6) + 1;
		aClass305Array1 = new Class305[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass305Array1[local41] = new Class305();
		}
		@Pc(290) int local290 = method3950(6) + 1;
		aClass290Array1 = new Class290[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass290Array1[local86] = new Class290();
		}
		@Pc(311) int local311 = method3950(6) + 1;
		aClass149Array1 = new Class149[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass149Array1[local138] = new Class149();
		}
		@Pc(332) int local332 = method3950(6) + 1;
		aBooleanArray17 = new boolean[local332];
		anIntArray387 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray17[local191] = method3942() != 0;
			method3950(16);
			method3950(16);
			anIntArray387[local191] = method3950(8);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "()I")
	public static int method3942() {
		@Pc(7) int local7 = aByteArray62[anInt4642] >> anInt4640 & 0x1;
		anInt4640++;
		anInt4642 += anInt4640 >> 3;
		anInt4640 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!pj;II)Lclient!ju;")
	public static Class6_Sub23 method3944(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method3947(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5797(arg1, arg2);
			return local16 == null ? null : new Class6_Sub23(local16);
		} else {
			arg0.method5788(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!pj;)Z")
	private static boolean method3947(@OriginalArg(0) Class248 arg0) {
		if (!aBoolean343) {
			@Pc(7) byte[] local7 = arg0.method5797(0, 0);
			if (local7 == null) {
				return false;
			}
			method3941(local7);
			aBoolean343 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)F")
	public static float method3948(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!pj;I)Lclient!ju;")
	public static Class6_Sub23 method3949(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1) {
		if (method3947(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5795(arg1);
			return local14 == null ? null : new Class6_Sub23(local14);
		} else {
			arg0.method5804(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "(I)I")
	public static int method3950(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt4640) {
			local8 = 8 - anInt4640;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray62[anInt4642] >> anInt4640 & local14) << local3;
			anInt4640 = 0;
			anInt4642++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray62[anInt4642] >> anInt4640 & local8) << local3;
			anInt4640 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([BI)V")
	public static void method3952(@OriginalArg(0) byte[] arg0) {
		aByteArray62 = arg0;
		anInt4642 = 0;
		anInt4640 = 0;
	}
}
