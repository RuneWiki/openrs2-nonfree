import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!ui;")
	public static Class175 aClass175_17 = new Class175(64);

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static int anInt2282 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!si;IIIIII)V")
	public static void method2029(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Class136 local13 = Static160.method2739(arg3);
		if (local13 == null || !local13.aBoolean367 || !local13.method3522()) {
			return;
		}
		@Pc(36) int local36;
		if (local13.anIntArray459 != null) {
			@Pc(34) int[] local34 = new int[local13.anIntArray459.length];
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				@Pc(53) int local53 = Static69.anInt1492 + (int) Static148.aFloat64 & 0x7FF;
				@Pc(57) int local57 = Class87.anIntArray177[local53];
				@Pc(65) int local65 = local57 * 256 / (Static289.anInt5250 + 256);
				@Pc(69) int local69 = Class87.anIntArray173[local53];
				@Pc(77) int local77 = local69 * 256 / (Static289.anInt5250 + 256);
				local34[local36 * 2] = arg1 + arg0.anInt4680 / 2 + (local65 * (local13.anIntArray459[local36 * 2] * 4 + arg5) + local77 * (arg2 - -(local13.anIntArray459[local36 * 2 + 1] * 4)) >> 16);
				local34[local36 * 2 + 1] = arg4 + arg0.anInt4689 / 2 - ((arg2 + local13.anIntArray459[local36 * 2 + 1] * 4) * local65 - local77 * (local13.anIntArray459[local36 * 2] * 4 + arg5) >> 16);
			}
			if (Static71.aBoolean165) {
				Static308.method4590(local34, local13.anInt4075, local13.anInt4075 >>> 24, arg0.anIntArray533, arg0.anIntArray539);
			} else {
				Static12.method178(local34, local13.anInt4075, local13.anInt4075 >>> 24, arg0.anIntArray533, arg0.anIntArray539);
			}
			for (local36 = 0; local36 < local34.length / 2 - 1; local36++) {
				if (Static71.aBoolean165) {
					Static93.method1766(local34[local36 * 2], local34[local36 * 2 + 1], local34[local36 * 2 + 2], local34[(local36 + 1) * 2 + 1], local13.anInt4057, local13.anInt4057 >>> 24, (Class1_Sub5_Sub6_Sub2) arg0.method3973(false));
				} else {
					Static77.method1582(local34[local36 * 2], local34[local36 * 2 + 1], local34[local36 * 2 + 2], local34[(local36 + 1) * 2 + 1], local13.anInt4057, local13.anInt4057 >>> 24, arg0.anIntArray533, arg0.anIntArray539);
				}
			}
			if (Static71.aBoolean165) {
				Static93.method1766(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local13.anInt4057, local13.anInt4057 >>> 24, (Class1_Sub5_Sub6_Sub2) arg0.method3973(false));
			} else {
				Static77.method1582(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local13.anInt4057, local13.anInt4057 >>> 24, arg0.anIntArray533, arg0.anIntArray539);
			}
		}
		@Pc(356) Class57 local356 = null;
		if (local13.anInt4062 != -1) {
			local356 = local13.method3519(false, false);
			if (local356 != null) {
				Static228.method3658(arg2, arg5, arg4, arg1, arg0, local356);
			}
		}
		if (local13.aString142 == null) {
			return;
		}
		@Pc(384) Class1_Sub5_Sub9 local384 = Static170.aClass1_Sub5_Sub9_4;
		if (local13.anInt4058 == 1) {
			local384 = Static238.aClass1_Sub5_Sub9_5;
		}
		if (local13.anInt4058 == 2) {
			local384 = Static19.aClass1_Sub5_Sub9_1;
		}
		local36 = 0;
		if (local356 != null) {
			local36 = local356.anInt3766;
		}
		Static145.method2517(arg0, arg2, arg5, arg4, local36, local13.anInt4068, arg1, local13.aString142, local384);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static37.anInt686; local12++) {
			if (Static23.anIntArray54[local12] + Static35.anIntArray69[local12] > arg2 && Static23.anIntArray54[local12] < arg2 + arg3 && arg0 < Static282.anIntArray563[local12] + Static313.anIntArray613[local12] && Static282.anIntArray563[local12] < arg0 + arg1) {
				Static166.aBooleanArray11[local12] = true;
			}
		}
	}
}
