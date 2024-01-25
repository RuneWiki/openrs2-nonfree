import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "Lclient!ch;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "Lclient!mv;")
	public static Class229 aClass229_126;

	@OriginalMember(owner = "client!vt", name = "C", descriptor = "Z")
	public static boolean aBoolean774 = false;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!ew;)V")
	public static void method7446(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class99 arg1) {
		while (true) {
			@Pc(6) Class5 local6 = arg1.method1777(arg0);
			while (local6.anInt151 == 0) {
				Static263.method3671(10L);
			}
			if (local6.anInt151 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static263.method3671(100L);
		}
	}
}
