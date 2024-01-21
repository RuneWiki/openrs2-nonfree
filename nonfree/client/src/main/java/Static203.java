import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
	public static int anInt3983 = 0;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1491 = Static161.method2452("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1492 = Static161.method2452("Schlie-8en");

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	public static int anInt3986 = 0;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array32 = new Class20[500];

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	public static void method3016() {
		@Pc(10) Object local10 = Static46.anObject1;
		synchronized (Static46.anObject1) {
			if (Static47.anInt4217 == 0) {
				Static8.aClass12_1.method297(5, new Class10());
			}
			Static47.anInt4217 = 600;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZIIIII)Lclient!ji;")
	public static Class5_Sub2_Sub10 method3018(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(28) long local28 = ((long) arg4 << 38) + ((long) arg1 + ((long) arg2 << 16)) + (arg0 ? 137438953472L : 0L) + ((long) arg3 << 40);
		@Pc(39) Class5_Sub2_Sub10 local39 = (Class5_Sub2_Sub10) Static17.aClass8_7.method227(local28);
		if (local39 != null) {
			return local39;
		}
		Static149.aBoolean132 = false;
		local39 = Static94.method1543(arg0, arg4, arg1, false, arg3, arg2);
		if (local39 != null && !Static149.aBoolean132) {
			Static17.aClass8_7.method232(local28, local39);
		}
		return local39;
	}
}
