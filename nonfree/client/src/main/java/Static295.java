import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[S")
	public static short[] aShortArray88 = new short[256];

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
	public static int[] anIntArray428 = new int[1];

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_119 = new Class209("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method4251() {
		Static121.aClass171_19.method3936();
		Static440.aClass171_60.method3936();
		Static343.aClass171_48.method3936();
		Static237.aClass171_39.method3936();
		Static185.aClass171_30.method3936();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!dr;ILjava/lang/Object;)V")
	public static void method4252(@OriginalArg(0) Class59 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg0.anEventQueue1.peekEvent() != null; local15++) {
			Static81.method1477(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
