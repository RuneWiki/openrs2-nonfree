import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public static int anInt6853;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public static int anInt6854;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_199 = new Class88("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public static final int anInt6852 = 1403;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
	public static boolean aBoolean495 = true;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public static int anInt6856 = 2;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg1) {
			Static21.method6671(arg5, arg6, arg3, arg2, arg4, arg1);
		} else if (Static251.anInt5168 <= arg2 - arg1 && arg2 + arg1 <= Static341.anInt6481 && arg3 - arg0 >= Static507.anInt9124 && Static234.anInt4897 >= arg0 + arg3) {
			Static207.method3855(arg0, arg4, arg1, arg6, arg3, arg2, arg5);
		} else {
			Static479.method7194(arg6, arg0, arg5, arg1, arg4, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIIIII)V")
	public static void method5737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 > Static234.anInt4897 || arg2 < Static507.anInt9124) {
			return;
		}
		@Pc(21) boolean local21;
		if (arg4 < Static251.anInt5168) {
			local21 = false;
			arg4 = Static251.anInt5168;
		} else if (arg4 > Static341.anInt6481) {
			arg4 = Static341.anInt6481;
			local21 = false;
		} else {
			local21 = true;
		}
		@Pc(43) boolean local43;
		if (Static251.anInt5168 > arg0) {
			arg0 = Static251.anInt5168;
			local43 = false;
		} else if (Static341.anInt6481 >= arg0) {
			local43 = true;
		} else {
			arg0 = Static341.anInt6481;
			local43 = false;
		}
		if (arg3 >= Static507.anInt9124) {
			Static118.method2461(Static228.anIntArrayArray46[arg3++], arg0, arg1, arg4);
		} else {
			arg3 = Static507.anInt9124;
		}
		if (arg2 > Static234.anInt4897) {
			arg2 = Static234.anInt4897;
		} else {
			Static118.method2461(Static228.anIntArrayArray46[arg2--], arg0, arg1, arg4);
		}
		@Pc(100) int local100;
		if (local21 && local43) {
			for (local100 = arg3; local100 <= arg2; local100++) {
				@Pc(142) int[] local142 = Static228.anIntArrayArray46[local100];
				local142[arg4] = local142[arg0] = arg1;
			}
			return;
		}
		if (local21) {
			for (local100 = arg3; local100 <= arg2; local100++) {
				Static228.anIntArrayArray46[local100][arg4] = arg1;
			}
			return;
		}
		if (local43) {
			for (local100 = arg3; local100 <= arg2; local100++) {
				Static228.anIntArrayArray46[local100][arg0] = arg1;
			}
			return;
		}
	}
}
