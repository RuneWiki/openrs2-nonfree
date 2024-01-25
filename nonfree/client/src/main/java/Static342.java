import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rk", name = "Oc", descriptor = "I")
	public static int anInt6166;

	@OriginalMember(owner = "client!rk", name = "Rc", descriptor = "I")
	public static int anInt6169 = 0;

	@OriginalMember(owner = "client!rk", name = "Sc", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_203 = new Class186(2, -2);

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	public static void method4771() {
		Static62.aClass112_1.method2330();
		Static339.aClass23_4.method632();
		Static116.aClass50_1.method1383();
		Static2.aClass74_13.method1681();
		Static388.aClass211_1.method4928();
		Static390.aClass204_2.method4628();
		Static269.aClass10_1.method284();
		Static92.aClass89_1.method1919();
		Static73.aClass252_1.method5482();
		Static186.aClass54_1.method1421();
		Static8.aClass226_1.method5107();
		Static236.aClass198_3.method4489();
		Static70.aClass212_6.method4936();
		Static110.aClass262_1.method5688();
		Static85.aClass157_1.method3424();
		Static447.aClass78_1.method1811();
		Static316.aClass88_4.method1913();
		Static419.aClass81_1.method1845();
		Static232.aClass138_2.method2990();
		Static311.aClass174_1.method4002();
		Static198.method2841();
		Static134.method1951();
		Static434.method5579();
		Static22.method5317();
		Static213.aClass69_39.method1594(5);
		Static32.aClass69_7.method1594(5);
		Static110.aClass69_27.method1594(5);
		Static103.aClass69_22.method1594(5);
		Static172.aClass69_35.method1594(5);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/Object;ILclient!hu;)V")
	public static void method4774(@OriginalArg(0) Object arg0, @OriginalArg(2) Class114 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static20.method1515(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
