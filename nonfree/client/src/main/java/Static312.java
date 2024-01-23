import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public static int anInt5729;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "Lclient!nk;")
	public static Class121 aClass121_136;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
	public static int anInt5731 = -1;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "[I")
	public static int[] anIntArray507 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	public static int anInt5732 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 < 128 || arg4 < 128 || arg6 > 13056 || arg4 > 13056) {
			Static23.anInt402 = -1;
			Static214.anInt4004 = -1;
			return;
		}
		@Pc(31) int local31 = Static69.method4275(arg4, Static65.anInt1300, arg6) - arg3;
		@Pc(35) int local35 = local31 - Static306.anInt5420;
		@Pc(39) int local39 = arg6 - Static94.anInt3434;
		@Pc(43) int local43 = arg4 - Static233.anInt4252;
		@Pc(55) int local55 = Class135.anIntArray335[Static277.anInt4987];
		@Pc(59) int local59 = Class135.anIntArray335[Static93.anInt1895];
		@Pc(63) int local63 = Class135.anIntArray338[Static277.anInt4987];
		@Pc(67) int local67 = Class135.anIntArray338[Static93.anInt1895];
		@Pc(77) int local77 = local67 * local39 + local59 * local43 >> 16;
		@Pc(88) int local88 = local43 * local67 - local59 * local39 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local63 * local35 - local88 * local55 >> 16;
		@Pc(111) int local111 = local55 * local35 + local63 * local88 >> 16;
		if (local111 < 50) {
			Static23.anInt402 = -1;
			Static214.anInt4004 = -1;
		} else if (Static156.aBoolean211) {
			@Pc(124) int local124 = arg2 * 512 >> 8;
			Static214.anInt4004 = arg5 + local90 * local124 / local111;
			@Pc(138) int local138 = arg0 * 512 >> 8;
			Static23.anInt402 = local138 * local101 / local111 + arg1;
		} else {
			Static23.anInt402 = arg1 + (local101 << 9) / local111;
			Static214.anInt4004 = (local90 << 9) / local111 + arg5;
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method4785() {
		@Pc(45) String local45;
		if (Static306.anInt5423 == 1 && Static110.anInt2281 < 2) {
			local45 = Static35.aString222 + Static207.aString221 + Static272.aString340 + " ->";
		} else if (Static133.aBoolean168 && Static110.anInt2281 < 2) {
			local45 = Static148.aString164 + Static207.aString221 + Static88.aString106 + " ->";
		} else if (Static309.aBoolean379 && Static32.aBooleanArray9[81] && Static110.anInt2281 > 2) {
			local45 = Static213.method3842(Static110.anInt2281 - 2);
		} else {
			local45 = Static213.method3842(Static110.anInt2281 - 1);
		}
		if (Static110.anInt2281 > 2) {
			local45 = local45 + "<col=ffffff> / " + (Static110.anInt2281 - 2) + Static47.aString52;
		}
		return local45;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)I")
	public static int method4786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(35) int local35 = Static116.method2097(arg0 + 91923, 4, arg1 + 45365) + (Static116.method2097(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static116.method2097(arg0, 1, arg1) + -128 >> 2) - 128;
		local35 = (int) ((double) local35 * 0.3D) + 35;
		if (local35 < 10) {
			local35 = 10;
		} else if (local35 > 60) {
			local35 = 60;
		}
		return local35;
	}
}
