import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString36 = "";

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "[I")
	public static final int[] anIntArray205 = new int[8];

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public static void method3428() {
		@Pc(3) Class325[] local3 = Class3.aClass325Array33;
		synchronized (Class3.aClass325Array33) {
			for (@Pc(7) int local7 = 0; local7 < Class3.aClass325Array33.length; local7++) {
				Class3.aClass325Array33[local7] = new Class325();
				Static102.anIntArray141[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V")
	public static void method3429() {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static270.aClass341_41.method8524(); local10 != null; local10 = (Class2_Sub37) Static270.aClass341_41.method8519()) {
			if (local10.anInt6984 == -1) {
				local10.anInt6985 = 0;
				if (local10.anInt6994 >= 0 && local10.anInt6987 >= 0 && Static47.anInt1794 > local10.anInt6994 && Static209.anInt4742 > local10.anInt6987) {
					Static453.method7111(local10);
				}
			} else {
				local10.method9253();
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
	public static void method3430() {
		Static538.aClass99_84.method3057();
	}
}
