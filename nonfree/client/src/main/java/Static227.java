import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!ko;")
	private static final Class142 aClass142_22 = new Class142();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method3280() {
		while (true) {
			@Pc(11) Class1_Sub35 local11 = (Class1_Sub35) aClass142_22.method3196();
			if (local11 == null) {
				return;
			}
			local11.anInterface4_1.ya();
			local11.method5965();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ga;)V")
	public static synchronized void method3281(@OriginalArg(1) Interface4 arg0) {
		@Pc(7) Class1_Sub35 local7 = new Class1_Sub35();
		local7.anInterface4_1 = arg0;
		aClass142_22.method3212(local7);
	}
}
