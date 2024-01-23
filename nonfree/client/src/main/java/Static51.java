import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
	public static int anInt1186;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
	private static int anInt1187;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
	public static int anInt1188;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "[Lclient!lg;")
	public static Class99[] aClass99Array1;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "[Lclient!tj;")
	public static Class169[] aClass169Array1;

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
	private static int anInt1191;

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "[B")
	private static byte[] aByteArray40;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "[Lclient!b;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!dl", name = "P", descriptor = "[Lclient!vc;")
	public static Class180[] aClass180Array1;

	@OriginalMember(owner = "client!dl", name = "Q", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!dl", name = "V", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!dl", name = "W", descriptor = "[I")
	public static int[] anIntArray150;

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "Z")
	private static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!th;)Z")
	private static boolean method982(@OriginalArg(0) Class168 arg0) {
		if (!aBoolean87) {
			@Pc(7) byte[] local7 = arg0.method4058(0, 0);
			if (local7 == null) {
				return false;
			}
			method990(local7);
			aBoolean87 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I")
	public static int method986(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt1187) {
			local12 = 8 - anInt1187;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray40[anInt1191] >> anInt1187 & local18) << local3;
			anInt1187 = 0;
			anInt1191++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray40[anInt1191] >> anInt1187 & local12) << local3;
			anInt1187 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!th;II)Lclient!dl;")
	public static Class1_Sub6 method987(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method982(arg0)) {
			@Pc(16) byte[] local16 = arg0.method4058(arg2, arg1);
			return local16 == null ? null : new Class1_Sub6(local16);
		} else {
			arg0.method4072(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "()I")
	public static int method989() {
		@Pc(7) int local7 = aByteArray40[anInt1191] >> anInt1187 & 0x1;
		anInt1187++;
		anInt1191 += anInt1187 >> 3;
		anInt1187 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "([B)V")
	private static void method990(@OriginalArg(0) byte[] arg0) {
		method992(arg0);
		anInt1188 = 0x1 << method986(4);
		anInt1186 = 0x1 << method986(4);
		aFloatArray4 = new float[anInt1186];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt1188 : anInt1186;
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
			@Pc(193) int local193 = Static115.method1850(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static173.method2820(local193, local195);
			}
			if (local17 == 0) {
				aFloatArray9 = local41;
				aFloatArray7 = local86;
				aFloatArray5 = local138;
				anIntArray149 = local187;
			} else {
				aFloatArray6 = local41;
				aFloatArray8 = local86;
				aFloatArray10 = local138;
				anIntArray148 = local187;
			}
		}
		local17 = method986(8) + 1;
		aClass12Array1 = new Class12[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass12Array1[local26] = new Class12();
		}
		local26 = method986(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method986(16);
		}
		local26 = method986(6) + 1;
		aClass180Array1 = new Class180[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass180Array1[local30] = new Class180();
		}
		local30 = method986(6) + 1;
		aClass169Array1 = new Class169[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass169Array1[local34] = new Class169();
		}
		local34 = method986(6) + 1;
		aClass99Array1 = new Class99[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass99Array1[local38] = new Class99();
		}
		local38 = method986(6) + 1;
		aBooleanArray13 = new boolean[local38];
		anIntArray150 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray13[local340] = method989() != 0;
			method986(16);
			method986(16);
			anIntArray150[local340] = method986(8);
		}
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)F")
	public static float method991(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([BI)V")
	public static void method992(@OriginalArg(0) byte[] arg0) {
		aByteArray40 = arg0;
		anInt1191 = 0;
		anInt1187 = 0;
	}
}
