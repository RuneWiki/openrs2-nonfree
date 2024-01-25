import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public static int anInt6435;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "Lclient!us;")
	public static final Class234 aClass234_131 = new Class234(48, 8);

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	public static void method5690() {
		if (!Static186.method2924()) {
			return;
		}
		if (Static361.aStringArray42 == null) {
			Static323.method4976();
		}
		Static242.anIntArray485 = new int[100];
		Static198.anIntArray385 = new int[100];
		Static132.anInt2501 = 0;
		Static349.aBoolean450 = true;
		Static345.anIntArray636 = new int[100];
		Static17.anIntArray23 = new int[100];
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			Static17.anIntArray23[local26] = (int) ((double) Static199.anInt3567 * Math.random()) << 4;
			Static198.anIntArray385[local26] = (int) (Math.random() * 350.0D) << 4;
			Static345.anIntArray636[local26] = (int) (Math.random() * 102.0D) + 51;
			Static242.anIntArray485[local26] = (int) (Math.random() * 48.0D) + 8;
		}
		try {
			Static28.aClipboard1 = Static144.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(75) Exception local75) {
		}
	}
}
