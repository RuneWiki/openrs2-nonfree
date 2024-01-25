import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_100 = new Class387(12, -1);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!ha;Lclient!ef;I)V")
	public static void method7973(@OriginalArg(2) Class57 arg0, @OriginalArg(3) Class102 arg1) {
		Static199.aClass102_64.method1932();
		if (Static379.aBoolean502) {
			return;
		}
		for (@Pc(26) Class5_Sub8 local26 = (Class5_Sub8) arg1.method1916(); local26 != null; local26 = (Class5_Sub8) arg1.method1915()) {
			@Pc(34) Class315 local34 = Static629.aClass33_4.method657(local26.anInt1429);
			if (Static484.method7007(local34)) {
				@Pc(46) boolean local46 = Static339.method5152(arg0, local26, local34);
				if (local46) {
					Static267.method3996(local34, arg0, local26);
				}
			}
		}
	}
}
