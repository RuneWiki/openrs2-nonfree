import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "I")
	public static int anInt3692;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public static void method3181() {
		if (Static152.aClass57_4.aBoolean75) {
			Static31.anInt551 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static31.anInt551 = (int) (local37 / 1048576L) + 1;
				} catch (@Pc(47) Throwable local47) {
				}
			}
		} catch (@Pc(49) Exception local49) {
		}
	}
}
