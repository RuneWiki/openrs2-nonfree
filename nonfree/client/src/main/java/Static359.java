import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public static void method5892() {
		for (@Pc(10) Class4_Sub6 local10 = (Class4_Sub6) Static131.aClass120_2.method2957(); local10 != null; local10 = (Class4_Sub6) Static131.aClass120_2.method2957()) {
			Static480.method7173(local10);
		}
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 1) {
			local32 = 0;
			local34 = 3;
		} else {
			local34 = Static35.anInt1167;
			local32 = Static35.anInt1167;
		}
		Static76.method1837();
		for (@Pc(43) int local43 = local32; local43 <= local34; local43++) {
			Static76.method1830();
			Static76.method1839(local43);
			Static76.method1826(local43);
		}
		Static76.method1824();
		Static76.method1838();
	}
}
