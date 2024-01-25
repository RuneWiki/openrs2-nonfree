import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Lclient!wo;")
	private static final Class266 aClass266_42 = new Class266();

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method4436() {
		while (true) {
			@Pc(4) Class1_Sub14 local4 = (Class1_Sub14) aClass266_42.method5999();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.ya();
			local4.method6071();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZLclient!ga;)V")
	public static synchronized void method4437(@OriginalArg(1) Interface5 arg0) {
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14();
		local9.anInterface5_1 = arg0;
		aClass266_42.method5998(local9);
	}
}
