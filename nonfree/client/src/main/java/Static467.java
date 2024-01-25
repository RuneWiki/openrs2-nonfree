import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!qm", name = "N", descriptor = "Lclient!da;")
	public static Class50 aClass50_10;

	@OriginalMember(owner = "client!qm", name = "I", descriptor = "Lclient!oi;")
	public static final Class240 aClass240_11 = new Class240("", 10);

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
	public static int anInt8237 = 0;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "[I")
	public static final int[] anIntArray516 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	public static void method7093() {
		if (Static529.aClass112_6.aBoolean264) {
			Static396.anInt7427 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static396.anInt7427 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}
}
