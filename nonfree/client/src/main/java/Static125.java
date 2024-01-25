import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "Lclient!fr;")
	private static final Class85 aClass85_13 = new Class85();

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	public static synchronized void method2024() {
		while (true) {
			@Pc(4) Class7_Sub43 local4 = (Class7_Sub43) aClass85_13.method2004();
			if (local4 == null) {
				return;
			}
			local4.anInterface3_1.EA();
			local4.method5802();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLclient!d;)V")
	public static synchronized void method2025(@OriginalArg(1) Interface3 arg0) {
		@Pc(3) Class7_Sub43 local3 = new Class7_Sub43();
		local3.anInterface3_1 = arg0;
		aClass85_13.method2011(local3);
	}
}
