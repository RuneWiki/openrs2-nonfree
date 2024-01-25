import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "[B")
	public static byte[] aByteArray59;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Lclient!kda;")
	public static Class160 aClass160_40;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "Lclient!mt;")
	public static final Class199 aClass199_6 = new Class199("WTQA", 2);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!lp;Ljava/lang/Object;)V")
	public static void method3281(@OriginalArg(1) Class182 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 50 && arg0.anEventQueue1.peekEvent() != null; local18++) {
			Static505.method7295(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
