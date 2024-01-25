import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
	public static int anInt6496;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_42 = new Class329(2, 4, 4, 0);

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(JI)V")
	public static void method5240(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static94.method1990(arg0 - 1L);
			Static94.method1990(1L);
		} else {
			Static94.method1990(arg0);
		}
	}
}
