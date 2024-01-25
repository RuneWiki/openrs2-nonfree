import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_60 = new Class126(78, 4);

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
	public static int anInt3411 = -2;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
	public static int anInt3412 = 0;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "[I")
	public static final int[] anIntArray238 = new int[25];

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z")
	public static boolean method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static545.method7550(arg1, arg0) || Static460.method6619(arg1, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/awt/Frame;Lclient!lu;)V")
	public static void method3000(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class231 arg1) {
		while (true) {
			@Pc(6) Class129 local6 = arg1.method5296(arg0);
			while (local6.anInt3299 == 0) {
				Static365.method3472(10L);
			}
			if (local6.anInt3299 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static365.method3472(100L);
		}
	}
}
