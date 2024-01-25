import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "Lclient!mq;")
	public static Class71 aClass71_15;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_70 = new Class341(24, 7);

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
	public static void method6132() {
		if (!Static284.method4758()) {
			return;
		}
		if (Static244.aStringArray82 == null) {
			Static233.method4207();
		}
		Static318.anInt5802 = 0;
		Static26.aBoolean26 = true;
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "(B)V")
	public static void method6133() {
		for (@Pc(6) Class15_Sub1 local6 = (Class15_Sub1) Static41.aClass60_1.method1552(); local6 != null; local6 = (Class15_Sub1) Static41.aClass60_1.method1552()) {
			Static89.method1565(local6);
		}
		@Pc(32) int local32;
		@Pc(31) int local31;
		if (Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 1) {
			local32 = 0;
			local31 = 3;
		} else {
			local31 = Static578.anInt6963;
			local32 = Static578.anInt6963;
		}
		Static85.method1478();
		for (@Pc(46) int local46 = local32; local46 <= local31; local46++) {
			Static85.method1480();
			Static85.method1474(local46);
			Static85.method1464(local46);
		}
		Static85.method1471();
		Static85.method1465();
	}
}
