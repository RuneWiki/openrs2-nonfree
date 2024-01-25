import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!ub;")
	private static final Class244 aClass244_48 = new Class244();

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static synchronized void method5677() {
		while (true) {
			@Pc(8) Class4_Sub11 local8 = (Class4_Sub11) aClass244_48.method5268();
			if (local8 == null) {
				return;
			}
			local8.anInterface1_1.EA();
			local8.method6059();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!d;Z)V")
	public static synchronized void method5678(@OriginalArg(0) Interface1 arg0) {
		@Pc(3) Class4_Sub11 local3 = new Class4_Sub11();
		local3.anInterface1_1 = arg0;
		aClass244_48.method5273(local3);
	}
}
