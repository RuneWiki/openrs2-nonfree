import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!hc;")
	public static Class51 aClass51_73;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!hc;")
	public static Class51 aClass51_74;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
	public static int[] anIntArray430 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/Object;BLclient!d;)V")
	public static void method3733(@OriginalArg(0) Object arg0, @OriginalArg(2) Class28 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static30.method587(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!hc;Lclient!ob;ILclient!hc;)V")
	public static void method3735(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) Class51 arg2) {
		aClass51_74 = arg2;
		Static91.anInterface2_1 = arg1;
		Static57.aClass51_20 = arg0;
		if (Static57.aClass51_20 != null) {
			Static244.anInt5254 = Static57.aClass51_20.method1875(1);
		}
		if (aClass51_74 != null) {
			Static71.anInt1924 = aClass51_74.method1875(1);
		}
	}
}
