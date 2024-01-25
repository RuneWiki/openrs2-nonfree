import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!vr;")
	private static final Class258 aClass258_20 = new Class258();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ga;B)V")
	public static synchronized void method1934(@OriginalArg(0) Interface5 arg0) {
		@Pc(3) Class4_Sub28 local3 = new Class4_Sub28();
		local3.anInterface5_1 = arg0;
		aClass258_20.method5526(local3);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	public static void method1935() {
		while (true) {
			@Pc(4) Class4_Sub28 local4 = (Class4_Sub28) aClass258_20.method5530();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.ya();
			local4.method5854();
		}
	}
}
