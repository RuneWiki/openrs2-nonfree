import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "Lclient!pq;")
	public static Class198 aClass198_1 = new Class198();

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "[I")
	public static final int[] anIntArray65 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ec;BLjava/awt/Frame;)V")
	public static void method562(@OriginalArg(0) Class61 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class236 local10 = arg0.method1462(arg1);
			while (local10.anInt6178 == 0) {
				Static214.method2089(10L);
			}
			if (local10.anInt6178 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static214.method2089(100L);
		}
	}
}
