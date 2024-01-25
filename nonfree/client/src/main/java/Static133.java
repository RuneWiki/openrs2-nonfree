import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fda", name = "z", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "[I")
	public static final int[] anIntArray231 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z")
	public static boolean method2508() {
		return Static332.anInt6296 == 0 ? Static290.aClass5_Sub15_Sub4_1.method6527() : true;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!ae;BLjava/awt/Frame;)V")
	public static void method2511(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class83 local6 = arg0.method288(arg1);
			while (local6.anInt2495 == 0) {
				Static213.method3465(10L);
			}
			if (local6.anInt2495 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static213.method3465(100L);
		}
	}
}
