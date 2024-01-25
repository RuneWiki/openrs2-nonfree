import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_124 = new Class179(95, 4);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!vt;ILjava/awt/Frame;)V")
	public static void method2534(@OriginalArg(0) Class380 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class103 local6 = arg0.method8820(arg1);
			while (local6.anInt2541 == 0) {
				Static520.method7923(10L);
			}
			if (local6.anInt2541 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static520.method7923(100L);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
	public static boolean method2535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static673.method9097(arg0, arg1) | (arg0 & 0x2000) != 0 | Static210.method3102(arg0, arg1)) & Static46.method956(arg1, arg0);
	}
}
