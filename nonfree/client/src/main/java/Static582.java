import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
	public static int[] anIntArray727;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
	public static int anInt9545;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[F")
	public static float[] aFloatArray62;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "[I")
	public static int[] anIntArray728;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "[Lclient!eg;")
	public static Class87[] aClass87Array1;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "[F")
	public static float[] aFloatArray63;

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "[Lclient!st;")
	public static Class312[] aClass312Array1;

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
	public static int[] anIntArray729;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
	private static int anInt9549;

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	public static int anInt9550;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
	private static int anInt9551;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "[F")
	public static float[] aFloatArray65;

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "[F")
	public static float[] aFloatArray66;

	@OriginalMember(owner = "client!wj", name = "F", descriptor = "[Lclient!dr;")
	public static Class75[] aClass75Array1;

	@OriginalMember(owner = "client!wj", name = "G", descriptor = "[F")
	public static float[] aFloatArray67;

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "[B")
	private static byte[] aByteArray101;

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "[F")
	public static float[] aFloatArray68;

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "[F")
	public static float[] aFloatArray69;

	@OriginalMember(owner = "client!wj", name = "O", descriptor = "[Lclient!lr;")
	public static Class214[] aClass214Array1;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "Z")
	private static boolean aBoolean747 = false;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I")
	public static int method7785(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9549) {
			local8 = 8 - anInt9549;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray101[anInt9551] >> anInt9549 & local14) << local3;
			anInt9549 = 0;
			anInt9551++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray101[anInt9551] >> anInt9549 & local8) << local3;
			anInt9549 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!pu;I)Lclient!wj;")
	public static Class1_Sub50 method7788(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1) {
		if (method7790(arg0)) {
			@Pc(14) byte[] local14 = arg0.method5691(arg1);
			return local14 == null ? null : new Class1_Sub50(local14);
		} else {
			arg0.method5694(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!pu;II)Lclient!wj;")
	public static Class1_Sub50 method7789(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method7790(arg0)) {
			@Pc(16) byte[] local16 = arg0.method5704(arg1, arg2);
			return local16 == null ? null : new Class1_Sub50(local16);
		} else {
			arg0.method5688(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!pu;)Z")
	private static boolean method7790(@OriginalArg(0) Class270 arg0) {
		if (!aBoolean747) {
			@Pc(7) byte[] local7 = arg0.method5704(0, 0);
			if (local7 == null) {
				return false;
			}
			method7791(local7);
			aBoolean747 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "([B)V")
	private static void method7791(@OriginalArg(0) byte[] arg0) {
		method7792(arg0);
		anInt9545 = 0x1 << method7785(4);
		anInt9550 = 0x1 << method7785(4);
		aFloatArray66 = new float[anInt9550];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9545 : anInt9550;
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
			local191 = Static139.method2103(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static305.method4283(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray67 = local39;
				aFloatArray62 = local84;
				aFloatArray63 = local136;
				anIntArray727 = local185;
			} else {
				aFloatArray68 = local39;
				aFloatArray69 = local84;
				aFloatArray65 = local136;
				anIntArray729 = local185;
			}
		}
		local24 = method7785(8) + 1;
		aClass312Array1 = new Class312[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass312Array1[local28] = new Class312();
		}
		local32 = method7785(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method7785(16);
		}
		@Pc(269) int local269 = method7785(6) + 1;
		aClass75Array1 = new Class75[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass75Array1[local41] = new Class75();
		}
		@Pc(290) int local290 = method7785(6) + 1;
		aClass214Array1 = new Class214[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass214Array1[local86] = new Class214();
		}
		@Pc(311) int local311 = method7785(6) + 1;
		aClass87Array1 = new Class87[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass87Array1[local138] = new Class87();
		}
		@Pc(332) int local332 = method7785(6) + 1;
		aBooleanArray28 = new boolean[local332];
		anIntArray728 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray28[local191] = method7795() != 0;
			method7785(16);
			method7785(16);
			anIntArray728[local191] = method7785(8);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([BI)V")
	public static void method7792(@OriginalArg(0) byte[] arg0) {
		aByteArray101 = arg0;
		anInt9551 = 0;
		anInt9549 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)F")
	public static float method7794(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
	public static int method7795() {
		@Pc(7) int local7 = aByteArray101[anInt9551] >> anInt9549 & 0x1;
		anInt9549++;
		anInt9551 += anInt9549 >> 3;
		anInt9549 &= 0x7;
		return local7;
	}
}
