import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	public static void method5350() {
		if (!Static38.method636()) {
			return;
		}
		if (Static415.aStringArray33 == null) {
			Static189.method3217();
		}
		Static406.aBoolean496 = true;
		Static209.anInt3960 = 0;
		try {
			Static503.aClipboard1 = Static536.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(28) Exception local28) {
		}
	}
}
