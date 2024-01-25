import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
	private static int anInt7407 = 0;

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Z")
	private static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "Lclient!ow;")
	private static final Class271 aClass271_43 = new Class271();

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	public static synchronized void method6587() {
		while (true) {
			@Pc(10) Class2_Sub9 local10 = (Class2_Sub9) aClass271_43.method7172();
			if (local10 == null) {
				return;
			}
			local10.anInterface4_1.w(true);
			local10.method9825();
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZI)V")
	public static synchronized void method6588() {
		aBoolean556 = true;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V")
	public static synchronized void method6589() {
		anInt7407--;
		if (anInt7407 == 0) {
			method6587();
		}
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
	public static synchronized void method6590() {
		anInt7407++;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method6591(@OriginalArg(0) Interface4 arg0) {
		if (aBoolean556) {
			return;
		}
		if (anInt7407 <= 0) {
			arg0.w(false);
		} else {
			@Pc(15) Class2_Sub9 local15 = new Class2_Sub9();
			local15.anInterface4_1 = arg0;
			aClass271_43.method7174(local15);
		}
	}
}
