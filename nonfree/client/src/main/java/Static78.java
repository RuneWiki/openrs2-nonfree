import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_551 = Static161.method2452("Starting 3d library");

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!dc;")
	public static Class20 aClass20_552 = aClass20_551;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_553 = Static161.method2452("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_554 = Static161.method2452("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_555 = Static161.method2452("weiss:");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method1239(@OriginalArg(0) Class23 arg0) {
		Static50.aClass23_22 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public static void method1241() {
		Static43.aClass5_Sub6_Sub1_2.method3087(244);
		Static43.aClass5_Sub6_Sub1_2.method3037(0L);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
	public static int method1242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static198.method2925(arg0 - 1, arg1 + -1) + Static198.method2925(arg0 - 1, arg1 + 1) + Static198.method2925(arg0 + 1, arg1 + -1) + Static198.method2925(arg0 + 1, arg1 - -1);
		@Pc(74) int local74 = Static198.method2925(arg0, arg1 - 1) + Static198.method2925(arg0, arg1 + 1) + Static198.method2925(arg0 + -1, arg1) + Static198.method2925(arg0 - -1, arg1);
		@Pc(79) int local79 = Static198.method2925(arg0, arg1);
		return local79 / 4 + local74 / 8 + local46 / 16;
	}
}
