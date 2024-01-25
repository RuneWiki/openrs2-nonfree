import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!tj;")
	private static final Class357 aClass357_23 = new Class357();

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Z")
	private static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	private static int anInt4727 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	public static synchronized void method3957() {
		aBoolean413 = true;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public static synchronized void method3958() {
		anInt4727--;
		if (anInt4727 == 0) {
			method3961();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!e;)V")
	public static synchronized void method3959(@OriginalArg(1) Interface4 arg0) {
		if (aBoolean413) {
			return;
		}
		if (anInt4727 <= 0) {
			arg0.w(false);
		} else {
			@Pc(17) Class3_Sub38 local17 = new Class3_Sub38();
			local17.anInterface4_1 = arg0;
			aClass357_23.method8401(local17);
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	public static synchronized void method3960() {
		anInt4727++;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static synchronized void method3961() {
		while (true) {
			@Pc(4) Class3_Sub38 local4 = (Class3_Sub38) aClass357_23.method8398();
			if (local4 == null) {
				return;
			}
			local4.anInterface4_1.w(true);
			local4.method9446();
		}
	}
}
