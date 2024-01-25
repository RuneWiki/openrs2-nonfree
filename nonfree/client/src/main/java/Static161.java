import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!km", name = "u", descriptor = "I")
	public static int anInt3632;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public static int anInt3637;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Z")
	public static final boolean aBoolean302 = false;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!km", name = "I", descriptor = "I")
	public static int anInt3644 = 64;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
	public static void method3102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg0 >= Static338.anInt5369 && Static295.anInt5964 >= arg2 + arg0 && Static229.anInt4777 <= arg5 - arg0 && Static165.anInt3366 >= arg0 + arg5) {
			Static75.method1393(arg4, arg1, arg2, arg3, arg0, arg5);
		} else {
			Static310.method5204(arg0, arg2, arg1, arg5, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public static void method3103() {
		try {
			if (Static177.anInt5898 == 1) {
				@Pc(16) int local16 = Static129.aClass4_Sub13_Sub3_1.method4892();
				if (local16 > 0 && Static129.aClass4_Sub13_Sub3_1.method4903()) {
					local16 -= Static160.anInt3616;
					if (local16 < 0) {
						local16 = 0;
					}
					Static129.aClass4_Sub13_Sub3_1.method4894(local16);
				} else {
					Static129.aClass4_Sub13_Sub3_1.method4890();
					Static129.aClass4_Sub13_Sub3_1.method4870();
					if (Static74.aClass11_38 == null) {
						Static177.anInt5898 = 0;
					} else {
						Static177.anInt5898 = 2;
					}
					Static316.aClass163_3 = null;
					Static116.aClass4_Sub17_2 = null;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static129.aClass4_Sub13_Sub3_1.method4890();
			Static316.aClass163_3 = null;
			Static74.aClass11_38 = null;
			Static177.anInt5898 = 0;
			Static116.aClass4_Sub17_2 = null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public static void method3104() {
		Static189.aClass130_88.method3514();
		for (@Pc(13) Class4_Sub18 local13 = (Class4_Sub18) Static248.aClass130_112.method3499(); local13 != null; local13 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			if (local13.anInt2905 < 1000) {
				local13.method5667();
				Static189.aClass130_88.method3510(local13);
			}
		}
		Static189.aClass130_88.method3511(Static248.aClass130_112);
		if (Static215.aClass72_15 != null || (Static301.aClass72_19 != null || Static109.anInt2407 > 0)) {
			return;
		}
		@Pc(61) int local61 = Static9.anInt6461;
		@Pc(79) int local79;
		if (!Static173.aBoolean319) {
			if (local61 == 1 && Static282.anInt5713 > 0) {
				local79 = ((Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248).anInt2905;
				if (local79 == 41 || local79 == 26 || local79 == 35 || local79 == 43 || local79 == 31 || local79 == 15 || local79 == 32 || local79 == 5 || local79 == 13 || local79 == 1 || local79 == 16 || local79 == 1001) {
					@Pc(134) Class4_Sub18 local134 = (Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248;
					@Pc(139) Class72 local139 = Static66.method1243(local134.anInt2906);
					@Pc(142) Class4_Sub2 local142 = Static46.method876(local139);
					if (local142.method263()) {
						Static337.aBoolean513 = false;
						Static83.anInt1766 = 0;
						if (Static215.aClass72_15 != null) {
							Static238.method4097(Static215.aClass72_15);
						}
						Static215.aClass72_15 = Static66.method1243(local134.anInt2906);
						Static100.anInt2288 = Static65.anInt1361;
						Static121.anInt2745 = Static237.anInt4924;
						Static49.anInt1090 = local134.anInt2907;
						Static238.method4097(Static215.aClass72_15);
						return;
					}
				}
			}
			if (local61 <= 0 && Static118.anInt2544 > 0) {
				local61 = Static118.anInt2544;
			}
			Static118.anInt2544 = 0;
			if (local61 == 1 && (Static82.anInt1737 == 1 && Static282.anInt5713 > 2 || Static72.method1364())) {
				local61 = 2;
			}
			if (local61 == 2 && Static282.anInt5713 > 0) {
				Static204.method3617();
			}
			if (local61 == 1 && Static282.anInt5713 > 0) {
				Static298.method5069();
				return;
			}
			return;
		}
		@Pc(229) int local229;
		if (local61 != 1) {
			local79 = Static38.anInt830;
			local229 = Static184.anInt4055;
			if (Static111.anInt2449 - 10 > local79 || local79 > Static111.anInt2450 + Static111.anInt2449 + 10 || local229 < Static87.anInt1931 - 10 || Static87.anInt1931 + Static223.anInt4637 + 10 < local229) {
				Static173.aBoolean319 = false;
				Static222.method3817(Static223.anInt4637, Static111.anInt2450, Static111.anInt2449, Static87.anInt1931);
			}
		}
		if (local61 != 1) {
			return;
		}
		local79 = Static111.anInt2449;
		local229 = Static87.anInt1931;
		@Pc(270) int local270 = Static111.anInt2450;
		@Pc(272) int local272 = Static65.anInt1361;
		@Pc(274) int local274 = Static237.anInt4924;
		@Pc(276) int local276 = -1;
		@Pc(295) int local295;
		for (@Pc(278) int local278 = 0; local278 < Static282.anInt5713; local278++) {
			if (Static104.aBoolean594) {
				local295 = (Static282.anInt5713 - local278 - 1) * 16 + local229 + 33;
				if (local79 < local272 && local270 + local79 > local272 && local274 > local295 - 13 && local274 < local295 + 3) {
					local276 = local278;
				}
			} else {
				local295 = local229 + (Static282.anInt5713 + -1 + -local278) * 16 + 31;
				if (local272 > local79 && local79 + local270 > local272 && local274 > local295 - 13 && local274 < local295 + 3) {
					local276 = local278;
				}
			}
		}
		if (local276 != -1) {
			local295 = 0;
			@Pc(377) Class140 local377 = new Class140(Static248.aClass130_112);
			for (@Pc(382) Class4_Sub18 local382 = (Class4_Sub18) local377.method3687(); local382 != null; local382 = (Class4_Sub18) local377.method3688()) {
				if (local276 == local295) {
					Static245.method4233(local382);
				}
				local295++;
			}
		}
		Static173.aBoolean319 = false;
		Static222.method3817(Static223.anInt4637, Static111.anInt2450, Static111.anInt2449, Static87.anInt1931);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IC)Z")
	public static boolean method3105(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static276.method4776(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static330.aCharArray7;
			for (@Pc(31) int local31 = 0; local31 < local18.length; local31++) {
				@Pc(37) char local37 = local18[local31];
				if (local37 == arg0) {
					return true;
				}
			}
			@Pc(53) char[] local53 = Static169.aCharArray5;
			for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
				@Pc(61) char local61 = local53[local55];
				if (arg0 == local61) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
	public static void method3107() {
		Static139.anIntArray281 = null;
		Static166.aBoolean306 = false;
		Static327.anIntArray509 = null;
		Static301.aClipboard1 = null;
		Static258.anIntArray440 = null;
		Static327.aBooleanArray31 = null;
		Static240.method4159();
	}
}
