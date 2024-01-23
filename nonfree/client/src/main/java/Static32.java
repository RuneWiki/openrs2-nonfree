import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "[Lclient!sh;")
	public static Class156[] aClass156Array1;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	private static int anInt578;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "[Lclient!fm;")
	public static Class56[] aClass56Array1;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
	private static int anInt579;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "[Lclient!oa;")
	public static Class123[] aClass123Array1;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public static int anInt581;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "[Lclient!nh;")
	public static Class117[] aClass117Array1;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
	public static int anInt584;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "[B")
	private static byte[] aByteArray24;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Z")
	private static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
	public static int method544(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt578) {
			local12 = 8 - anInt578;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray24[anInt579] >> anInt578 & local18) << local3;
			anInt578 = 0;
			anInt579++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray24[anInt579] >> anInt578 & local12) << local3;
			anInt578 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!nm;II)Lclient!ca;")
	public static Class1_Sub6 method546(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method548(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3235(arg2, arg1);
			return local16 == null ? null : new Class1_Sub6(local16);
		} else {
			arg0.method3229(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)F")
	public static float method547(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!nm;)Z")
	private static boolean method548(@OriginalArg(0) Class119 arg0) {
		if (!aBoolean58) {
			@Pc(7) byte[] local7 = arg0.method3235(0, 0);
			if (local7 == null) {
				return false;
			}
			method550(local7);
			aBoolean58 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "([B)V")
	private static void method550(@OriginalArg(0) byte[] arg0) {
		method554(arg0);
		anInt581 = 0x1 << method544(4);
		anInt584 = 0x1 << method544(4);
		aFloatArray6 = new float[anInt584];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt581 : anInt584;
			local30 = local26 >> 1;
			local34 = local26 >> 2;
			local38 = local26 >> 3;
			@Pc(41) float[] local41 = new float[local30];
			for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
				local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
				local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
			}
			@Pc(86) float[] local86 = new float[local30];
			for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
				local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
				local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
			}
			@Pc(138) float[] local138 = new float[local34];
			for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
				local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
				local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
			}
			@Pc(187) int[] local187 = new int[local38];
			@Pc(193) int local193 = Static136.method2354(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static19.method318(local195, local193);
			}
			if (local17 == 0) {
				aFloatArray7 = local41;
				aFloatArray10 = local86;
				aFloatArray9 = local138;
				anIntArray64 = local187;
			} else {
				aFloatArray11 = local41;
				aFloatArray4 = local86;
				aFloatArray8 = local138;
				anIntArray66 = local187;
			}
		}
		local17 = method544(8) + 1;
		aClass156Array1 = new Class156[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass156Array1[local26] = new Class156();
		}
		local26 = method544(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method544(16);
		}
		local26 = method544(6) + 1;
		aClass117Array1 = new Class117[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass117Array1[local30] = new Class117();
		}
		local30 = method544(6) + 1;
		aClass123Array1 = new Class123[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass123Array1[local34] = new Class123();
		}
		local34 = method544(6) + 1;
		aClass56Array1 = new Class56[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass56Array1[local38] = new Class56();
		}
		local38 = method544(6) + 1;
		aBooleanArray2 = new boolean[local38];
		anIntArray65 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray2[local340] = method553() != 0;
			method544(16);
			method544(16);
			anIntArray65[local340] = method544(8);
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
	public static int method553() {
		@Pc(7) int local7 = aByteArray24[anInt579] >> anInt578 & 0x1;
		anInt578++;
		anInt579 += anInt578 >> 3;
		anInt578 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([BI)V")
	public static void method554(@OriginalArg(0) byte[] arg0) {
		aByteArray24 = arg0;
		anInt579 = 0;
		anInt578 = 0;
	}
}
