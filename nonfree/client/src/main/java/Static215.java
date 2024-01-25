import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	public static int anInt4496;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
	public static int anInt4497;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_26 = new Class329(1, 2, 2, 0);

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Z")
	public static boolean method3594() {
		if (Static458.aBoolean553) {
			try {
				Static600.method2906("showVideoAd", Static304.anApplet1);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}
}
