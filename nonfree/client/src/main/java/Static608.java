import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static608 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public static int anInt9802;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)I")
	public static int method8331(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method8332(@OriginalArg(2) String arg0) {
		Static329.method5394(arg0, "", "", "", 4, 0);
	}
}
