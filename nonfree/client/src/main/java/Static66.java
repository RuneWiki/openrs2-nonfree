import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
	public static int[] anIntArray58;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!laa;B)V")
	public static void method1054(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class198 arg1) {
		while (true) {
			@Pc(10) Class191 local10 = arg1.method4296(arg0);
			while (local10.anInt5014 == 0) {
				Static408.method5841(10L);
			}
			if (local10.anInt5014 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static408.method5841(100L);
		}
	}
}
