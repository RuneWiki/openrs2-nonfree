import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
	public static final int[] anIntArray443 = new int[4096];

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray47 = new boolean[100];

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Lclient!fr;")
	public static final Class90 aClass90_27 = new Class90(0);

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	public static int anInt6716 = -1;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	public static void method5270() {
		if (Static173.aClass128_2 == null) {
			return;
		}
		if (Static173.aClass128_2.anInt3727 == 1) {
			Static173.aClass128_2 = null;
			return;
		}
		if (Static173.aClass128_2.anInt3727 == 2) {
			Static359.method3803(Static176.aClass131_3, 2, Static20.aString1);
			Static173.aClass128_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!bo;IIII)Lclient!gk;")
	public static Class65_Sub3_Sub1 method5273(@OriginalArg(1) Class26_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean78 || Static74.method1330(arg4) && Static74.method1330(arg3)) {
			return new Class65_Sub3_Sub1(arg0, 3553, arg1, arg2, arg4, arg3, true);
		} else if (arg0.aBoolean72) {
			return new Class65_Sub3_Sub1(arg0, 34037, arg1, arg2, arg4, arg3, true);
		} else {
			return new Class65_Sub3_Sub1(arg0, arg1, arg2, arg4, arg3, Static316.method4530(arg4), Static316.method4530(arg3), true);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([[BLclient!cd;I)V")
	public static void method5274(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class33_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt1247; local14++) {
			Static438.method5925();
			for (@Pc(20) int local20 = 0; local20 < Static81.anInt1950 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static171.anInt3288 >> 3; local24++) {
					@Pc(28) boolean local28 = false;
					@Pc(36) int local36 = Static293.anIntArrayArrayArray13[local14][local20][local24];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						if (!arg1.aBoolean106 || local46 == 0) {
							@Pc(60) int local60 = local36 >> 1 & 0x3;
							@Pc(66) int local66 = local36 >> 14 & 0x3FF;
							@Pc(72) int local72 = local36 >> 3 & 0x7FF;
							@Pc(82) int local82 = local72 / 8 + (local66 / 8 << 8);
							for (@Pc(84) int local84 = 0; local84 < Static96.anIntArray119.length; local84++) {
								if (Static96.anIntArray119[local84] == local82 && arg0[local84] != null) {
									@Pc(106) Class2_Sub20 local106 = new Class2_Sub20(arg0[local84]);
									arg1.method906(local72, local24 * 8, local14, Static332.aClass37Array1, local60, local66, local20 * 8, local46, local106);
									arg1.method926(local60, local106, local12[0] == -1 ? local12 : null, local20 * 8, local24 * 8, local66, local72, Static387.aClass26_9, local14, local46);
									local28 = true;
									break;
								}
							}
						}
					}
					if (!local28) {
						arg1.method917(local20 * 8, local14, local24 * 8, 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static45.aClass243_4 = Static303.aClass35_1.method991(Static148.aClass123_1, local12[3], local12[0], local12[2], local12[1]);
			Static47.anInt1254 = local12[4];
		}
	}
}
