import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
	public static int anInt6959;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_11 = new Class117(10, 16);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/Object;Lclient!lc;B)V")
	public static void method6127(@OriginalArg(0) Object arg0, @OriginalArg(1) Class207 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static491.method6679(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([IZ[I)V")
	public static void method6128(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static211.anIntArray728 = null;
			Static552.aByteArrayArrayArray17 = null;
			Static169.anIntArray218 = null;
			return;
		}
		Static169.anIntArray218 = arg0;
		Static211.anIntArray728 = new int[arg0.length];
		Static552.aByteArrayArrayArray17 = new byte[arg0.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static169.anIntArray218.length; local33++) {
			Static552.aByteArrayArrayArray17[local33] = new byte[arg1[local33]][];
		}
	}
}
