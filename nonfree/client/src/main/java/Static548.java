import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!la;")
	public static Class207 aClass207_115;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public static int anInt9248 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!fc;Z)V")
	public static void method7984(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class100 arg1) {
		while (true) {
			@Pc(10) Class91 local10 = arg1.method2100(arg0);
			while (local10.anInt2271 == 0) {
				Static314.method4821(10L);
			}
			if (local10.anInt2271 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static314.method4821(100L);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7986(@OriginalArg(1) String arg0) {
		return Static438.method8966(arg0, 10);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public static void method7988() {
		Static468.aClass295Array1 = null;
		if (Static428.aBoolean526 && Static138.method2022() != 1) {
			Static476.method7025(0, Static260.method4253(), 0, Static151.anInt2620 == 3 || Static151.anInt2620 == 7, Static87.method1414());
		}
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		if (Static428.aBoolean526) {
			local43 = Static584.method8436();
			local45 = Static88.method1487();
		}
		Static633.method8960(local45, local43, -1, local43, local45 + Static408.anInt7118, Static337.anInt5727, local43 + Static345.anInt5827, local45);
		if (Static468.aClass295Array1 != null) {
			Static470.method7959(Static106.aClass295_6.anInt8038, local43, local45, true, Static162.anInt2730, Static237.anInt4362, Static345.anInt5827 + local43, Static468.aClass295Array1, Static408.anInt7118 + local45, -1412584499);
			Static468.aClass295Array1 = null;
		}
	}
}
