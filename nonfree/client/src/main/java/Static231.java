import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Z")
	public static boolean aBoolean537 = true;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public static void method5240() {
		for (@Pc(10) Class2_Sub13 local10 = (Class2_Sub13) Static91.aClass216_22.method5992(); local10 != null; local10 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			if (Static170.method2882(local10.anInt1317)) {
				Static228.method1019(local10);
			}
		}
		if (Static117.anInt2590 == 1) {
			Static29.aBoolean66 = false;
			Static152.method2935(Static60.anInt1316, Static194.anInt3816, Static11.anInt293, Static120.anInt2599);
			return;
		}
		Static152.method2935(Static60.anInt1316, Static194.anInt3816, Static11.anInt293, Static120.anInt2599);
		@Pc(58) int local58 = Static289.aClass188_8.method5318(Static10.aClass93_4.method2819(Static21.anInt455));
		for (@Pc(63) Class2_Sub13 local63 = (Class2_Sub13) Static91.aClass216_22.method5992(); local63 != null; local63 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			@Pc(69) int local69 = Static324.method5685(local63);
			if (local69 > local58) {
				local58 = local69;
			}
		}
		Static120.anInt2599 = local58 + 8;
		Static60.anInt1316 = Static117.anInt2590 * 16 + (Static97.aBoolean602 ? 26 : 22);
	}
}
