import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!vp;")
	private static final Class254 aClass254_21 = new Class254();

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
	public static void method2617() {
		while (true) {
			@Pc(4) Class1_Sub21 local4 = (Class1_Sub21) aClass254_21.method5436();
			if (local4 == null) {
				return;
			}
			local4.anInterface4_1.ya();
			local4.method5617();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ga;)V")
	public static synchronized void method2618(@OriginalArg(1) Interface4 arg0) {
		@Pc(3) Class1_Sub21 local3 = new Class1_Sub21();
		local3.anInterface4_1 = arg0;
		aClass254_21.method5430(local3);
	}
}
