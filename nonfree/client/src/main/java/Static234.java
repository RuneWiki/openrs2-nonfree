import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public static int anInt4651 = 0;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[I")
	public static final int[] anIntArray624 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	public static int anInt4653 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!bd;Ljava/awt/Frame;I)V")
	public static void method4076(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(4) Class99 local4 = arg0.method376(arg1);
			while (local4.anInt2836 == 0) {
				Static129.method2634(10L);
			}
			if (local4.anInt2836 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static129.method2634(100L);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BB)Z")
	public static boolean method4077(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class7_Sub3 local13 = new Class7_Sub3(arg0);
		@Pc(17) int local17 = local13.method2772();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method2772() == 1;
		if (local33) {
			Static289.method1922(local13);
		}
		Static266.method4454(local13);
		return true;
	}
}
