import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public static int anInt4933 = 0;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Z")
	public static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "[I")
	public static final int[] anIntArray440 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method3907() {
		for (@Pc(6) Class28_Sub3 local6 = (Class28_Sub3) Static14.aClass169_1.method3598(); local6 != null; local6 = (Class28_Sub3) Static14.aClass169_1.method3597()) {
			local6.method3170();
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
	public static void method3909(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static19.aClass223ArrayArrayArray1 = Static142.aClass223ArrayArrayArray2;
			Static244.aClass165Array8 = Static28.aClass165Array1;
		} else {
			Static19.aClass223ArrayArrayArray1 = Static150.aClass223ArrayArrayArray3;
			Static244.aClass165Array8 = Static149.aClass165Array7;
		}
		Static315.anInt5183 = Static19.aClass223ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Object;ILclient!ec;)V")
	public static void method3910(@OriginalArg(0) Object arg0, @OriginalArg(2) Class61 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static214.method2089(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method3911(@OriginalArg(0) int arg0, @OriginalArg(1) Class165 arg1) {
		Static244.aClass165Array8[arg0] = arg1;
	}
}
