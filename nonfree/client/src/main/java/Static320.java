import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(B)V")
	public static void method5048() {
		if (Static161.aClass329_3 != null) {
			Static161.aClass329_3.method8069();
		}
		if (Static101.aThread2 == null) {
			return;
		}
		while (true) {
			try {
				Static101.aThread2.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(B)V")
	public static void method5050() {
		if (!Static101.aBoolean128) {
			Static101.aBoolean128 = true;
			Static173.aFloat21 += (-Static173.aFloat21 - 24.0F) / 2.0F;
			Static5.aBoolean5 = true;
		}
	}
}
