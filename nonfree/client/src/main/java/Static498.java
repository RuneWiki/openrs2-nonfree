import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!mja;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	public static int anInt8306;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "F")
	public static float aFloat143;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method7156() {
		@Pc(17) Class5_Sub44 local17;
		for (local17 = (Class5_Sub44) Static298.aClass102_38.method1916(); local17 != null; local17 = (Class5_Sub44) Static298.aClass102_38.method1915()) {
			Static585.method8416(false, local17);
		}
		for (local17 = (Class5_Sub44) Static605.aClass102_70.method1916(); local17 != null; local17 = (Class5_Sub44) Static605.aClass102_70.method1915()) {
			Static585.method8416(true, local17);
		}
	}
}
