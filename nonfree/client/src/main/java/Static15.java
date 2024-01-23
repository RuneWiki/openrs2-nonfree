import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	public static int anInt378;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!an", name = "v", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!an", name = "y", descriptor = "I")
	private static int anInt382;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!an", name = "A", descriptor = "[Lclient!vn;")
	public static Class174[] aClass174Array1;

	@OriginalMember(owner = "client!an", name = "B", descriptor = "I")
	public static int anInt383;

	@OriginalMember(owner = "client!an", name = "D", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!an", name = "E", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!an", name = "F", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!an", name = "I", descriptor = "[Lclient!pa;")
	public static Class131[] aClass131Array1;

	@OriginalMember(owner = "client!an", name = "J", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "[Lclient!ej;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!an", name = "N", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!an", name = "O", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!an", name = "P", descriptor = "[Lclient!tg;")
	public static Class155[] aClass155Array1;

	@OriginalMember(owner = "client!an", name = "R", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!an", name = "S", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!an", name = "T", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
	private static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([B)V")
	private static void method290(@OriginalArg(0) byte[] arg0) {
		method291(arg0);
		anInt383 = 0x1 << method297(4);
		anInt378 = 0x1 << method297(4);
		aFloatArray5 = new float[anInt378];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt383 : anInt378;
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
			@Pc(193) int local193 = Static171.method2598(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static36.method3656(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray2 = local41;
				aFloatArray4 = local86;
				aFloatArray7 = local138;
				anIntArray33 = local187;
			} else {
				aFloatArray6 = local41;
				aFloatArray8 = local86;
				aFloatArray3 = local138;
				anIntArray34 = local187;
			}
		}
		local17 = method297(8) + 1;
		aClass131Array1 = new Class131[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass131Array1[local26] = new Class131();
		}
		local26 = method297(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method297(16);
		}
		local26 = method297(6) + 1;
		aClass47Array1 = new Class47[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass47Array1[local30] = new Class47();
		}
		local30 = method297(6) + 1;
		aClass155Array1 = new Class155[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass155Array1[local34] = new Class155();
		}
		local34 = method297(6) + 1;
		aClass174Array1 = new Class174[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass174Array1[local38] = new Class174();
		}
		local38 = method297(6) + 1;
		aBooleanArray1 = new boolean[local38];
		anIntArray32 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray1[local340] = method299() != 0;
			method297(16);
			method297(16);
			anIntArray32[local340] = method297(8);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BI)V")
	public static void method291(@OriginalArg(0) byte[] arg0) {
		aByteArray1 = arg0;
		anInt382 = 0;
		anInt380 = 0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ak;)Z")
	private static boolean method292(@OriginalArg(0) Class7 arg0) {
		if (!aBoolean31) {
			@Pc(7) byte[] local7 = arg0.method253(0, 0);
			if (local7 == null) {
				return false;
			}
			method290(local7);
			aBoolean31 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)F")
	public static float method294(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)I")
	public static int method297(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt380) {
			local12 = 8 - anInt380;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray1[anInt382] >> anInt380 & local18) << local3;
			anInt380 = 0;
			anInt382++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray1[anInt382] >> anInt380 & local12) << local3;
			anInt380 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ak;II)Lclient!an;")
	public static Class1_Sub3 method298(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method292(arg0)) {
			@Pc(16) byte[] local16 = arg0.method253(arg2, arg1);
			return local16 == null ? null : new Class1_Sub3(local16);
		} else {
			arg0.method235(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()I")
	public static int method299() {
		@Pc(7) int local7 = aByteArray1[anInt382] >> anInt380 & 0x1;
		anInt380++;
		anInt382 += anInt380 >> 3;
		anInt380 &= 0x7;
		return local7;
	}
}
