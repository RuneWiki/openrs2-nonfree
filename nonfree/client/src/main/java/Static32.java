import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
	private static int anInt574;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "[Lclient!u;")
	public static Class173[] aClass173Array1;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	private static int anInt575;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "[Lclient!ng;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "[B")
	private static byte[] aByteArray3;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "[I")
	public static int[] anIntArray49;

	@OriginalMember(owner = "client!ci", name = "D", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
	public static int anInt578;

	@OriginalMember(owner = "client!ci", name = "M", descriptor = "[Lclient!uk;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!ci", name = "P", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!ci", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ci", name = "T", descriptor = "[Lclient!bk;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "Z")
	private static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I")
	public static int method551(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt575) {
			local12 = 8 - anInt575;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray3[anInt574] >> anInt575 & local18) << local3;
			anInt575 = 0;
			anInt574++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray3[anInt574] >> anInt575 & local12) << local3;
			anInt575 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)F")
	public static float method552(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "([B)V")
	private static void method553(@OriginalArg(0) byte[] arg0) {
		method555(arg0);
		anInt571 = 0x1 << method551(4);
		anInt578 = 0x1 << method551(4);
		aFloatArray3 = new float[anInt578];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt571 : anInt578;
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
			@Pc(193) int local193 = Static138.method2211(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static213.method3385(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray5 = local41;
				aFloatArray9 = local86;
				aFloatArray10 = local138;
				anIntArray49 = local187;
			} else {
				aFloatArray7 = local41;
				aFloatArray4 = local86;
				aFloatArray8 = local138;
				anIntArray51 = local187;
			}
		}
		local17 = method551(8) + 1;
		aClass20Array1 = new Class20[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass20Array1[local26] = new Class20();
		}
		local26 = method551(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method551(16);
		}
		local26 = method551(6) + 1;
		aClass118Array1 = new Class118[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass118Array1[local30] = new Class118();
		}
		local30 = method551(6) + 1;
		aClass173Array1 = new Class173[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass173Array1[local34] = new Class173();
		}
		local34 = method551(6) + 1;
		aClass178Array1 = new Class178[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass178Array1[local38] = new Class178();
		}
		local38 = method551(6) + 1;
		aBooleanArray4 = new boolean[local38];
		anIntArray50 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray4[local340] = method559() != 0;
			method551(16);
			method551(16);
			anIntArray50[local340] = method551(8);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ph;)Z")
	private static boolean method554(@OriginalArg(0) Class138 arg0) {
		if (!aBoolean42) {
			@Pc(7) byte[] local7 = arg0.method3346(0, 0);
			if (local7 == null) {
				return false;
			}
			method553(local7);
			aBoolean42 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)V")
	public static void method555(@OriginalArg(0) byte[] arg0) {
		aByteArray3 = arg0;
		anInt574 = 0;
		anInt575 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ph;II)Lclient!ci;")
	public static Class1_Sub6 method557(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method554(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3346(arg1, arg2);
			return local16 == null ? null : new Class1_Sub6(local16);
		} else {
			arg0.method3362(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "()I")
	public static int method559() {
		@Pc(7) int local7 = aByteArray3[anInt574] >> anInt575 & 0x1;
		anInt575++;
		anInt574 += anInt575 >> 3;
		anInt575 &= 0x7;
		return local7;
	}
}
