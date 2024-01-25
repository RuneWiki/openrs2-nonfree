import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "[Lclient!od;")
	public static Class211[] aClass211Array1;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)Lclient!wt;")
	public static Class1_Sub51 method7748() {
		if (Static335.aClass295_19 == null || Static282.aClass314_1 == null) {
			return null;
		}
		Static282.aClass314_1.method8058(Static335.aClass295_19);
		@Pc(23) Class1_Sub51 local23 = (Class1_Sub51) Static282.aClass314_1.method8057();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class65 local33 = Static335.aClass32_4.method1129(local23.anInt9566);
			return local33 != null && local33.aBoolean156 && local33.method1818(Static335.anInterface19_2) ? local23 : Static184.method3551();
		}
	}
}
