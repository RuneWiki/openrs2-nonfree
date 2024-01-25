import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!fs;")
	public static Class76 aClass76_82;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public static int anInt6240 = 0;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method4846() {
		@Pc(5) Class68 local5 = Static442.aClass68_58;
		synchronized (Static442.aClass68_58) {
			Static442.aClass68_58.method1777();
		}
		local5 = Static190.aClass68_20;
		synchronized (Static190.aClass68_20) {
			Static190.aClass68_20.method1777();
		}
	}
}
