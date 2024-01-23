import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt4458 = 0;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int anInt4459 = 0;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static int[] anIntArray479 = new int[4096];

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString275 = null;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pm;Ljava/awt/Frame;Z)V")
	public static void method3695(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class185 local10 = arg0.method3493(arg1);
			while (local10.anInt5623 == 0) {
				Static303.method4677(10L);
			}
			if (local10.anInt5623 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static303.method4677(100L);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IS)Z")
	public static boolean method3696(@OriginalArg(1) short arg0) {
		if (arg0 == 58 || arg0 == 35 || arg0 == 17 || arg0 == 10 || arg0 == 51 || arg0 == 9 || arg0 == 15 || arg0 == 50) {
			return true;
		} else if (arg0 == 23 || arg0 == 1 || arg0 == 1001 || arg0 == 1009) {
			return true;
		} else if (arg0 == 30 || arg0 == 20 || arg0 == 13 || arg0 == 2 || arg0 == 49) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 34 || arg0 == 7 || arg0 == 18 || arg0 == 11 || arg0 == 3;
		}
	}
}
