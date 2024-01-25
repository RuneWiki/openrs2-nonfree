import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public static int anInt106 = 0;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public static void method81() {
		@Pc(1) Class119 local1 = Static253.aClass119_210;
		synchronized (Static253.aClass119_210) {
			Static253.aClass119_210.method3312();
		}
		local1 = Static119.aClass119_76;
		synchronized (Static119.aClass119_76) {
			Static119.aClass119_76.method3312();
		}
		@Pc(36) Class148 local36 = Static129.aClass148_1;
		synchronized (Static129.aClass148_1) {
			Static129.aClass148_1.method4059();
		}
	}
}
