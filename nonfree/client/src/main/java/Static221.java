import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public static int anInt4091 = 0;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public static int anInt4095 = 0;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	public static int[] anIntArray344 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!hi;IIIII)V")
	public static void method3447(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class175 local7 = Static210.method3349(arg3);
		if (local7 == null || !local7.aBoolean344 || !local7.method4294()) {
			return;
		}
		@Pc(32) int local32;
		if (local7.anIntArray453 != null) {
			@Pc(30) int[] local30 = new int[local7.anIntArray453.length];
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				@Pc(49) int local49 = (int) Static49.aFloat32 + Static189.anInt3613 & 0x7FF;
				@Pc(53) int local53 = Class135.anIntArray338[local49];
				@Pc(61) int local61 = local53 * 256 / (Static309.anInt5618 + 256);
				@Pc(65) int local65 = Class135.anIntArray335[local49];
				@Pc(73) int local73 = local65 * 256 / (Static309.anInt5618 + 256);
				local30[local32 * 2] = arg5 + arg1.anInt2204 / 2 + ((local7.anIntArray453[local32 * 2 + 1] * 4 + arg0) * local73 + local61 * (local7.anIntArray453[local32 * 2] * 4 + arg2) >> 16);
				local30[local32 * 2 + 1] = arg1.anInt2207 / 2 + arg4 - ((arg0 + local7.anIntArray453[local32 * 2 + 1] * 4) * local61 - (local7.anIntArray453[local32 * 2] * 4 + arg2) * local73 >> 16);
			}
			if (Static156.aBoolean211) {
				Static195.method3164(local30, local7.anInt5014, local7.anInt5014 >>> 24, arg1.anIntArray198, arg1.anIntArray190);
			} else {
				Static147.method2499(local30, local7.anInt5014, local7.anInt5014 >>> 24, arg1.anIntArray198, arg1.anIntArray190);
			}
			for (local32 = 0; local32 < local30.length / 2 - 1; local32++) {
				if (Static156.aBoolean211) {
					Static119.method2139(local30[local32 * 2], local30[local32 * 2 + 1], local30[local32 * 2 + 2], local30[(local32 + 1) * 2 + 1], local7.anInt5007, local7.anInt5007 >>> 24, (Class1_Sub2_Sub1_Sub1) arg1.method1920(false));
				} else {
					Static25.method408(local30[local32 * 2], local30[local32 * 2 + 1], local30[local32 * 2 + 2], local30[(local32 + 1) * 2 + 1], local7.anInt5007, local7.anInt5007 >>> 24, arg1.anIntArray198, arg1.anIntArray190);
				}
			}
			if (Static156.aBoolean211) {
				Static119.method2139(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local7.anInt5007, local7.anInt5007 >>> 24, (Class1_Sub2_Sub1_Sub1) arg1.method1920(false));
			} else {
				Static25.method408(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local7.anInt5007, local7.anInt5007 >>> 24, arg1.anIntArray198, arg1.anIntArray190);
			}
		}
		@Pc(360) Class23 local360 = null;
		if (local7.anInt5031 != -1) {
			local360 = local7.method4293(false, false);
			if (local360 != null) {
				Static71.method1435(arg0, arg5, local360, arg2, arg1, arg4);
			}
		}
		if (local7.aString291 == null) {
			return;
		}
		local32 = 0;
		@Pc(392) Class1_Sub2_Sub6 local392 = Static11.aClass1_Sub2_Sub6_1;
		if (local7.anInt5020 == 1) {
			local392 = Static140.aClass1_Sub2_Sub6_3;
		}
		if (local7.anInt5020 == 2) {
			local392 = Static307.aClass1_Sub2_Sub6_4;
		}
		if (local360 != null) {
			local32 = local360.anInt4469;
		}
		Static142.method2454(local32, arg2, local7.anInt5009, local392, arg4, arg1, arg0, arg5, local7.aString291);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static29.anInt517 && arg1 <= Static11.anInt170 && arg0 >= Static98.anInt2007 && arg6 <= Static213.anInt4452) {
			Static132.method3149(arg2, arg6, arg3, arg5, arg4, arg0, arg1);
		} else {
			Static171.method2899(arg1, arg2, arg0, arg5, arg3, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZBI)Ljava/lang/String;")
	public static String method3450(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static308.method4670(arg0);
	}
}
