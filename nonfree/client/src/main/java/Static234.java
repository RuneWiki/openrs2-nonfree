import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!wl;")
	private static final Class265 aClass265_35 = new Class265();

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLclient!ga;)V")
	public static synchronized void method3563(@OriginalArg(1) Interface3 arg0) {
		@Pc(8) Class2_Sub27 local8 = new Class2_Sub27();
		local8.anInterface3_1 = arg0;
		aClass265_35.method5999(local8);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	public static void method3564() {
		while (true) {
			@Pc(4) Class2_Sub27 local4 = (Class2_Sub27) aClass265_35.method5995();
			if (local4 == null) {
				return;
			}
			local4.anInterface3_1.ya();
			local4.method6072();
		}
	}
}
