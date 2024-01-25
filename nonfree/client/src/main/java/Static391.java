import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Lclient!nl;")
	public static Class171 aClass171_100;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
	public static int anInt6626 = 0;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
	public static int anInt6627 = 0;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "[I")
	public static final int[] anIntArray1357 = new int[13];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/Object;Lclient!is;)V")
	public static void method5670(@OriginalArg(1) Object arg0, @OriginalArg(2) Class111 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static358.method2028(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
