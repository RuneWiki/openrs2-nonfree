import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_7 = new Class107(100);

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	public static int anInt1028 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1233() {
		@Pc(10) Class107 local10 = Static150.aClass107_17;
		synchronized (Static150.aClass107_17) {
			Static150.aClass107_17.method3012();
		}
		local10 = Static88.aClass107_10;
		synchronized (Static88.aClass107_10) {
			Static88.aClass107_10.method3012();
		}
		local10 = Static224.aClass107_53;
		synchronized (Static224.aClass107_53) {
			Static224.aClass107_53.method3012();
		}
		local10 = Static356.aClass107_59;
		synchronized (Static356.aClass107_59) {
			Static356.aClass107_59.method3012();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public static void method1234() {
		Static263.aClass107_39.method3011(5);
		Static362.aClass107_60.method3011(5);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method1235() {
		Static237.anInt5080 = 0;
		Static152.anInt3476 = 0;
		Static105.anInt2192 = 0;
		Static151.anInt3469 = 0;
	}
}
