import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!tu;")
	private static final Class229 aClass229_32 = new Class229();

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method4133() {
		while (true) {
			@Pc(9) Class3_Sub12 local9 = (Class3_Sub12) aClass229_32.method5331();
			if (local9 == null) {
				return;
			}
			local9.anInterface3_1.ya();
			local9.method5987();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ga;I)V")
	public static synchronized void method4134(@OriginalArg(0) Interface3 arg0) {
		@Pc(11) Class3_Sub12 local11 = new Class3_Sub12();
		local11.anInterface3_1 = arg0;
		aClass229_32.method5321(local11);
	}
}
