import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3384(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class4_Sub14 local17 = Static196.method3380(Static17.aClass159_1, Static300.aClass173_86);
			local17.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg0));
			local17.aClass4_Sub11_Sub1_3.method4945(arg0);
			Static353.method5712(local17);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public static void method3385() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static165.aClass153Array1[local7] = null;
		}
		Static530.anInt9433 = 0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!wd;ILjava/lang/Object;)V")
	public static void method3386(@OriginalArg(0) Class354 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 50 && arg0.anEventQueue1.peekEvent() != null; local18++) {
			Static63.method1019(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(46) Exception local46) {
		}
	}
}
