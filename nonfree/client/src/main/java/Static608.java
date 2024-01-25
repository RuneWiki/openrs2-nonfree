import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "[Lclient!jfa;")
	public static final Interface13[] anInterface13Array4 = new Interface13[75];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method6804(@OriginalArg(1) Class33 arg0) {
		if (Static433.aBoolean672) {
			Static468.method6983(arg0);
		} else {
			Static30.method574(arg0);
		}
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	public static void method6807() {
		@Pc(5) Class112 local5 = Static107.aClass112_13;
		synchronized (Static107.aClass112_13) {
			Static107.aClass112_13.method3638();
		}
		local5 = Static254.aClass112_31;
		synchronized (Static254.aClass112_31) {
			Static254.aClass112_31.method3638();
		}
	}
}
