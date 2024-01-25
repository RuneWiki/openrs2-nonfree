import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!rs", name = "J", descriptor = "Lclient!mo;")
	public static Class143 aClass143_100;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "[I")
	public static final int[] anIntArray493 = new int[500];

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
	public static int anInt5448 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)I")
	public static int method4881(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!e;)V")
	public static void method4882(@OriginalArg(1) Class46 arg0) {
		if (Static45.aBoolean80) {
			Static15.method5427(arg0);
		} else {
			Static103.method2264(arg0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!ne;B)I")
	public static int method4883(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1) {
		if (!Static42.method1040(arg1).method2583(arg0) && arg1.anObjectArray20 == null) {
			return -1;
		} else if (arg1.anIntArray365 == null || arg0 >= arg1.anIntArray365.length) {
			return -1;
		} else {
			return arg1.anIntArray365[arg0];
		}
	}
}
