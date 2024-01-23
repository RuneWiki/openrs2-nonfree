import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "Z")
	public static boolean aBoolean436;

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString188 = "Please remove ";

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lclient!hh;")
	public static Class69 aClass69_27 = new Class69();

	@OriginalMember(owner = "client!wc", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString189 = "purple:";

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
	public static int anInt5784 = 1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZII)V")
	public static void method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 + arg1;
		@Pc(14) int local14 = arg0 - arg3;
		@Pc(18) int local18 = arg4 + arg3;
		@Pc(23) int local23 = arg2 - arg3;
		@Pc(36) int local36;
		for (local36 = arg1; local36 < local9; local36++) {
			Static288.method4405(arg5, arg2, arg4, Static151.anIntArrayArray26[local36]);
		}
		for (local36 = arg0; local36 > local14; local36--) {
			Static288.method4405(arg5, arg2, arg4, Static151.anIntArrayArray26[local36]);
		}
		for (local36 = local9; local36 <= local14; local36++) {
			@Pc(79) int[] local79 = Static151.anIntArrayArray26[local36];
			Static288.method4405(arg5, local18, arg4, local79);
			Static288.method4405(arg5, arg2, local23, local79);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZBLclient!kh;)V")
	public static void method4465(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub2_Sub12 arg1) {
		@Pc(9) int local9;
		if (Static240.aBoolean369 || arg0) {
			local9 = Static166.anInt3046;
			@Pc(15) int local15 = local9 * 956 / 503;
			Static242.aClass1_Sub2_Sub2_10.method3922((Static145.anInt2690 - local15) / 2, 0, local15, local9);
			Static296.aClass48_1.method3616(Static145.anInt2690 / 2 - Static296.aClass48_1.anInt4754 / 2, 18);
		}
		arg1.method4382(Static251.aString174, Static145.anInt2690 / 2, Static166.anInt3046 / 2 - 26, 16777215, -1);
		local9 = Static166.anInt3046 / 2 - 18;
		if (Static240.aBoolean369) {
			Static50.method868(Static145.anInt2690 / 2 - 152, local9, 304, 34, 9179409);
			Static50.method868(Static145.anInt2690 / 2 - 151, local9 + 1, 302, 32, 0);
			Static50.method866(Static145.anInt2690 / 2 - 150, local9 - -2, Static217.anInt4478 * 3, 30, 9179409);
			Static50.method866(Static217.anInt4478 * 3 + Static145.anInt2690 / 2 - 150, local9 - -2, 300 - Static217.anInt4478 * 3, 30, 0);
		} else {
			Static213.method3370(Static145.anInt2690 / 2 - 152, local9, 304, 34, 9179409);
			Static213.method3370(Static145.anInt2690 / 2 - 151, local9 + 1, 302, 32, 0);
			Static213.method3362(Static145.anInt2690 / 2 - 150, local9 + 2, Static217.anInt4478 * 3, 30, 9179409);
			Static213.method3362(Static145.anInt2690 / 2 + Static217.anInt4478 * 3 - 150, local9 + 2, 300 - Static217.anInt4478 * 3, 30, 0);
		}
		arg1.method4382(Static250.aString170, Static145.anInt2690 / 2, Static166.anInt3046 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!ak;)Lclient!bf;")
	public static Class1_Sub2_Sub2 method4466(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1) {
		return Static126.method1947(arg1, arg0) ? Static54.method923() : null;
	}
}
