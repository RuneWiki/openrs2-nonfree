import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!ij;")
	public static Class93 aClass93_26;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!cp;")
	public static final Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	public static int anInt1368 = -1;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	public static int anInt1369 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method1312() {
		Static125.aClass5_Sub12_Sub2_3.method5125(252);
		Static125.aClass5_Sub12_Sub2_3.method5089(Static101.method1804());
		Static125.aClass5_Sub12_Sub2_3.method5084(Static168.anInt3376);
		Static125.aClass5_Sub12_Sub2_3.method5084(Static256.anInt5066);
		Static125.aClass5_Sub12_Sub2_3.method5089(Static44.anInt747);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!vg;II)I")
	public static int method1313(@OriginalArg(0) Class201 arg0, @OriginalArg(2) int arg1) {
		if (!Static45.method707(arg0).method5750(arg1) && arg0.anObjectArray33 == null) {
			return -1;
		} else if (arg0.anIntArray609 == null || arg0.anIntArray609.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray609[arg1];
		}
	}
}
