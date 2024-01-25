import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!ug;")
	private static final Class243 aClass243_29 = new Class243();

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method3665() {
		while (true) {
			@Pc(9) Class3_Sub38 local9 = (Class3_Sub38) aClass243_29.method5204();
			if (local9 == null) {
				return;
			}
			local9.anInterface2_1.ya();
			local9.method5977();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!ga;)V")
	public static synchronized void method3666(@OriginalArg(1) Interface2 arg0) {
		@Pc(3) Class3_Sub38 local3 = new Class3_Sub38();
		local3.anInterface2_1 = arg0;
		aClass243_29.method5198(local3);
	}
}
