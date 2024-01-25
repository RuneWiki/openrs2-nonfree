import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!bha", name = "y", descriptor = "I")
	public static int anInt1287;

	@OriginalMember(owner = "client!bha", name = "G", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!bha", name = "F", descriptor = "I")
	public static int anInt1294;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZBZ)V")
	public static void method1224(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2) {
			Static66.anInt1579 = -1;
		}
		Static217.aBoolean224 = arg2;
		Static110.aString41 = arg1;
		Static612.aString118 = arg0;
		Static251.aBoolean246 = arg3;
		if (!Static217.aBoolean224 && (Static110.aString41.equals("") || Static612.aString118.equals(""))) {
			Static625.method8221(3);
			return;
		}
		if (Static11.anInt525 != 1) {
			Static92.anInt2098 = -1;
			Static325.anInt5284 = -1;
			Static151.anInt2726 = 0;
		}
		Static265.aClass292_3.aBoolean535 = false;
		Static625.method8221(-3);
		Static607.anInt9202 = 0;
		Static74.anInt1708 = 1;
		Static5.anInt218 = 0;
	}
}
