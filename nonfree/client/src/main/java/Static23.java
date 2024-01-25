import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	public static int anInt553;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)Z")
	public static boolean method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	public static void method426() {
		Static366.aClass261Array1 = null;
		if (Static319.aBoolean356 && Static626.method8388() != 1) {
			Static45.method743(Static213.method2958(), 0, Static5.method104(), 0, Static324.anInt5145 == 3 || Static324.anInt5145 == 7);
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (Static319.aBoolean356) {
			local34 = Static274.method3801();
			local36 = Static69.method966();
		}
		Static613.method8239(Static38.anInt777, -1, local36, local34, Static511.anInt8548 + local34, Static153.anInt2747 + local36, local36, local34);
		if (Static366.aClass261Array1 != null) {
			Static636.method8556(Static366.aClass261Array1, local34, Static589.anInt9581, Static583.aClass261_12.anInt6625, local36 + Static153.anInt2747, -1412584499, local36, Static14.anInt165, true, local34 + Static511.anInt8548);
			Static366.aClass261Array1 = null;
		}
	}
}
