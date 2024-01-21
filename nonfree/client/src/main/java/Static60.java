import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!hf", name = "xb", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!hf", name = "Ab", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 aClass3_Sub2_Sub2_Sub4_4;

	@OriginalMember(owner = "client!hf", name = "Db", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 aClass3_Sub2_Sub2_Sub4_5;

	@OriginalMember(owner = "client!hf", name = "vb", descriptor = "[I")
	public static int[] anIntArray304 = new int[128];

	@OriginalMember(owner = "client!hf", name = "wb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_537 = Static170.method3101("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!hf", name = "zb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_538 = Static170.method3101("Please reload this page)3");

	@OriginalMember(owner = "client!hf", name = "Bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_539 = aClass28_538;

	@OriginalMember(owner = "client!hf", name = "Eb", descriptor = "I")
	public static final int anInt1755 = 5063219;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIIIII)V")
	public static void method1400(@OriginalArg(0) int[] arg0) {
		Static175.anInt4185 = 25;
		Static34.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static175.anInt4185 + Static175.anInt4185 + 1][Static175.anInt4185 + Static175.anInt4185 + 1];
		Static19.anInt558 = 0;
		Static149.anInt3708 = 0;
		Static55.anInt1559 = 512;
		Static171.anInt4104 = 334;
		Static1.anInt16 = 256;
		Static50.anInt1433 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static175.anInt4185 + Static175.anInt4185 + 3][Static175.anInt4185 + Static175.anInt4185 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static168.anInt4089 = Class3_Sub2_Sub2_Sub2.anIntArray127[local47];
				Static129.anInt3280 = Class3_Sub2_Sub2_Sub2.anIntArray129[local47];
				Static38.anInt1088 = Class3_Sub2_Sub2_Sub2.anIntArray127[local50];
				Static141.anInt3613 = Class3_Sub2_Sub2_Sub2.anIntArray129[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static175.anInt4185 + 1); local82 <= Static175.anInt4185 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static175.anInt4185 + 1); local88 <= Static175.anInt4185 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static167.method3088(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static175.anInt4185 + 1][local88 + Static175.anInt4185 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static175.anInt4185; local77 < Static175.anInt4185; local77++) {
					for (local82 = -Static175.anInt4185; local82 < Static175.anInt4185; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static175.anInt4185 + 1][local82 + local97 + Static175.anInt4185 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static175.anInt4185 + 1][local82 + local97 + Static175.anInt4185 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static175.anInt4185 + 1][local82 + local97 + Static175.anInt4185 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static175.anInt4185 + 1][local82 + local97 + Static175.anInt4185 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static34.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static175.anInt4185][local82 + Static175.anInt4185] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)Z")
	public static boolean method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static94.method2076(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static34.method851(local10 + 1, Static35.anIntArrayArrayArray17[arg0][arg1][arg2] + arg3, local14 + 1) && Static34.method851(local10 + 128 - 1, Static35.anIntArrayArrayArray17[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static34.method851(local10 + 128 - 1, Static35.anIntArrayArrayArray17[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static34.method851(local10 + 1, Static35.anIntArrayArrayArray17[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(Z)V")
	public static void method1402() {
		aClass3_Sub2_Sub2_Sub3Array5 = null;
		aClass28_538 = null;
		aClass3_Sub2_Sub2_Sub4_5 = null;
		anIntArray304 = null;
		aClass3_Sub2_Sub2_Sub4_4 = null;
		aClass28_537 = null;
		aClass28_539 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
