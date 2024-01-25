import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "[Lclient!oha;")
	public static Class271[] aClass271Array1;

	@OriginalMember(owner = "client!vt", name = "S", descriptor = "[F")
	public static float[] aFloatArray73;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	private static int anInt10769;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "[I")
	public static int[] anIntArray576;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "[Lclient!eaa;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "[B")
	private static byte[] aByteArray108;

	@OriginalMember(owner = "client!vt", name = "C", descriptor = "[Lclient!vg;")
	public static Class375[] aClass375Array1;

	@OriginalMember(owner = "client!vt", name = "N", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
	public static int anInt10771;

	@OriginalMember(owner = "client!vt", name = "E", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "[F")
	public static float[] aFloatArray75;

	@OriginalMember(owner = "client!vt", name = "F", descriptor = "[F")
	public static float[] aFloatArray76;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
	private static int anInt10775;

	@OriginalMember(owner = "client!vt", name = "D", descriptor = "[F")
	public static float[] aFloatArray77;

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "[I")
	public static int[] anIntArray578;

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "[F")
	public static float[] aFloatArray78;

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
	public static int anInt10776;

	@OriginalMember(owner = "client!vt", name = "G", descriptor = "[F")
	public static float[] aFloatArray79;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "[Lclient!bja;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!vt", name = "O", descriptor = "Z")
	private static boolean aBoolean745 = false;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!rg;)Z")
	private static boolean method9187(@OriginalArg(0) Class310 arg0) {
		if (!aBoolean745) {
			@Pc(7) byte[] local7 = arg0.method7803(0, 0);
			if (local7 == null) {
				return false;
			}
			method9188(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([B)V")
	private static void method9188(@OriginalArg(0) byte[] arg0) {
		method9194(arg0);
		anInt10776 = 0x1 << method9193(4);
		anInt10771 = 0x1 << method9193(4);
		aFloatArray77 = new float[anInt10771];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt10776 : anInt10771;
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
			local191 = Static220.method3803(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static566.method8126(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray79 = local39;
				aFloatArray74 = local84;
				aFloatArray78 = local136;
				anIntArray578 = local185;
			} else {
				aFloatArray73 = local39;
				aFloatArray76 = local84;
				aFloatArray75 = local136;
				anIntArray576 = local185;
			}
		}
		local24 = method9193(8) + 1;
		aClass375Array1 = new Class375[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass375Array1[local28] = new Class375();
		}
		local32 = method9193(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method9193(16);
		}
		@Pc(269) int local269 = method9193(6) + 1;
		aClass41Array1 = new Class41[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass41Array1[local41] = new Class41();
		}
		@Pc(290) int local290 = method9193(6) + 1;
		aClass271Array1 = new Class271[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass271Array1[local86] = new Class271();
		}
		@Pc(311) int local311 = method9193(6) + 1;
		aClass91Array1 = new Class91[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass91Array1[local138] = new Class91();
		}
		@Pc(332) int local332 = method9193(6) + 1;
		aBooleanArray28 = new boolean[local332];
		anIntArray577 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray28[local191] = method9189() != 0;
			method9193(16);
			method9193(16);
			anIntArray577[local191] = method9193(8);
		}
		aBoolean745 = true;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "()I")
	public static int method9189() {
		@Pc(7) int local7 = aByteArray108[anInt10775] >> anInt10769 & 0x1;
		anInt10769++;
		anInt10775 += anInt10769 >> 3;
		anInt10769 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!rg;I)Lclient!vt;")
	public static Class14_Sub53 method9191(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1) {
		if (method9187(arg0)) {
			@Pc(14) byte[] local14 = arg0.method7795(arg1);
			return local14 == null ? null : new Class14_Sub53(local14);
		} else {
			arg0.method7785(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)I")
	public static int method9193(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt10769) {
			local8 = 8 - anInt10769;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray108[anInt10775] >> anInt10769 & local14) << local3;
			anInt10769 = 0;
			anInt10775++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray108[anInt10775] >> anInt10769 & local8) << local3;
			anInt10769 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([BI)V")
	public static void method9194(@OriginalArg(0) byte[] arg0) {
		aByteArray108 = arg0;
		anInt10775 = 0;
		anInt10769 = 0;
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)F")
	public static float method9196(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!rg;II)Lclient!vt;")
	public static Class14_Sub53 method9198(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method9187(arg0)) {
			@Pc(16) byte[] local16 = arg0.method7803(arg2, arg1);
			return local16 == null ? null : new Class14_Sub53(local16);
		} else {
			arg0.method7793(arg2, arg1);
			return null;
		}
	}
}
