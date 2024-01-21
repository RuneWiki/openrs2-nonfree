import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array2;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_102 = Static151.method2243("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public static int anInt353 = 100;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public static int anInt354 = 0;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public static int anInt356 = 1;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public static int anInt358 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method240() {
		for (@Pc(10) Class2_Sub1_Sub17 local10 = (Class2_Sub1_Sub17) Static179.aClass13_13.method303(); local10 != null; local10 = (Class2_Sub1_Sub17) Static179.aClass13_13.method309()) {
			@Pc(20) Class7_Sub1 local20 = local10.aClass7_Sub1_1;
			if (Static126.anInt2806 != local20.anInt237 || Static25.anInt581 > local20.anInt243) {
				local10.method3183();
			} else if (Static25.anInt581 >= local20.anInt246) {
				if (local20.anInt240 > 0) {
					@Pc(62) Class7_Sub2_Sub1 local62 = Static9.aClass7_Sub2_Sub1Array1[local20.anInt240 - 1];
					if (local62 != null && local62.anInt3046 >= 0 && local62.anInt3046 < 13312 && local62.anInt3085 >= 0 && local62.anInt3085 < 13312) {
						local20.method171(local62.anInt3046, Static25.anInt581, Static175.method2548(local62.anInt3085, local20.anInt237, local62.anInt3046) - local20.anInt242, local62.anInt3085);
					}
				}
				if (local20.anInt240 < 0) {
					@Pc(115) int local115 = -local20.anInt240 - 1;
					@Pc(120) Class7_Sub2_Sub2 local120;
					if (Static59.anInt1225 == local115) {
						local120 = Static186.aClass7_Sub2_Sub2_1;
					} else {
						local120 = Static62.aClass7_Sub2_Sub2Array1[local115];
					}
					if (local120 != null && local120.anInt3046 >= 0 && local120.anInt3046 < 13312 && local120.anInt3085 >= 0 && local120.anInt3085 < 13312) {
						local20.method171(local120.anInt3046, Static25.anInt581, Static175.method2548(local120.anInt3085, local20.anInt237, local120.anInt3046) - local20.anInt242, local120.anInt3085);
					}
				}
				local20.method172(Static103.anInt2221);
				Static31.method536(Static126.anInt2806, (int) local20.aDouble11, (int) local20.aDouble10, (int) local20.aDouble8, 60, local20, local20.anInt234, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method242() {
		Static22.method399();
		Static173.method2526();
		Static87.method1236();
		Static78.method1107();
		Static57.method793();
		Static200.method2930();
		Static149.method2222();
		Static6.method129();
		Static116.method1784();
		Static213.method3114();
		Static73.method1015();
		Static190.method2724();
		((Class77) Static45.anInterface3_1).method2302();
		Static21.aClass53_2.method1649();
		Static49.aClass71_Sub1_1.method2140();
		Static146.aClass71_Sub1_15.method2140();
		Static173.aClass71_Sub1_21.method2140();
		Static126.aClass71_Sub1_13.method2140();
		Static153.aClass71_Sub1_16.method2140();
		Static63.aClass71_Sub1_5.method2140();
		Static126.aClass71_Sub1_14.method2140();
		Static59.aClass71_Sub1_4.method2140();
		Static56.aClass71_Sub1_3.method2140();
		Static156.aClass71_Sub1_18.method2140();
		Static179.aClass71_Sub1_23.method2140();
	}
}
