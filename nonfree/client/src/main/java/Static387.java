import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static387 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4996(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static534.method7452(-1, arg1, -1, arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public static void method4997() {
		Static136.method2433();
	}
}
