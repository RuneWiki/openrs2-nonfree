import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!aq;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	public static void method2744() {
		for (@Pc(10) Class102_Sub8 local10 = (Class102_Sub8) Static501.aClass249_8.method5812(); local10 != null; local10 = (Class102_Sub8) Static501.aClass249_8.method5812()) {
			Static285.method4043(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503)) {
			local30 = 3;
			local31 = 0;
		} else {
			local30 = Static356.anInt6242;
			local31 = Static356.anInt6242;
		}
		Static65.method863();
		for (@Pc(40) int local40 = local31; local40 <= local30; local40++) {
			Static65.method864();
			Static65.method870(local40);
			Static65.method869(local40);
		}
		Static65.method857();
		Static65.method861();
	}
}
