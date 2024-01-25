import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!ar;")
	private static final Class14 aClass14_45 = new Class14();

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!d;B)V")
	public static synchronized void method5378(@OriginalArg(0) Interface2 arg0) {
		@Pc(3) Class2_Sub37 local3 = new Class2_Sub37();
		local3.anInterface2_1 = arg0;
		aClass14_45.method300(local3);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method5379() {
		while (true) {
			@Pc(4) Class2_Sub37 local4 = (Class2_Sub37) aClass14_45.method307();
			if (local4 == null) {
				return;
			}
			local4.anInterface2_1.EA();
			local4.method5866();
		}
	}
}
