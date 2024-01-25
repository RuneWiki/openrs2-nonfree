import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	private static int anInt7357 = 0;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
	private static boolean aBoolean566 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Lclient!ef;")
	private static final Class102 aClass102_49 = new Class102();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZB)V")
	public static synchronized void method6345() {
		aBoolean566 = true;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public static synchronized void method6346() {
		anInt7357++;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
	public static synchronized void method6347() {
		anInt7357--;
		if (anInt7357 == 0) {
			method6348();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
	public static synchronized void method6348() {
		while (true) {
			@Pc(11) Class5_Sub47 local11 = (Class5_Sub47) aClass102_49.method1928();
			if (local11 == null) {
				return;
			}
			local11.anInterface3_1.w(true);
			local11.method9327(1);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!e;)V")
	public static synchronized void method6349(@OriginalArg(1) Interface3 arg0) {
		if (aBoolean566) {
			return;
		}
		if (anInt7357 > 0) {
			@Pc(19) Class5_Sub47 local19 = new Class5_Sub47();
			local19.anInterface3_1 = arg0;
			aClass102_49.method1921(local19);
		} else {
			arg0.w(false);
		}
	}
}
