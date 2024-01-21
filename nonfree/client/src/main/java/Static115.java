import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	public static final int anInt2418 = 50;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_886 = Static161.method2452("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!lj", name = "Q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_888 = Static161.method2452("flash2:");

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "Lclient!dc;")
	public static Class20 aClass20_887 = aClass20_888;

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_889 = Static161.method2452(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_890 = aClass20_888;

	@OriginalMember(owner = "client!lj", name = "ab", descriptor = "Lclient!dc;")
	public static Class20 aClass20_891 = aClass20_886;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method1844(@OriginalArg(1) Class20 arg0) {
		Static44.aClass20_339 = arg0;
		Static128.method1995();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!mf;Z)V")
	public static void method1845(@OriginalArg(0) Class69 arg0) {
		@Pc(8) int local8 = arg0.anInt2542 == 0 ? arg0.anInt2541 : arg0.anInt2542;
		@Pc(24) int local24 = arg0.anInt2517 == 0 ? arg0.anInt2471 : arg0.anInt2517;
		Static170.method2602(Static155.aClass69ArrayArray1[arg0.anInt2523 >> 16], local24, local8, arg0.anInt2523);
		if (arg0.aClass69Array2 != null) {
			Static170.method2602(arg0.aClass69Array2, local24, local8, arg0.anInt2523);
		}
		@Pc(55) Class5_Sub25 local55 = (Class5_Sub25) Static75.aClass75_7.method2072((long) arg0.anInt2523);
		if (local55 != null) {
			Static53.method920(local8, local24, local55.anInt3526);
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
	public static void method1847() {
		Static120.aClass84_16.method2335();
	}
}
