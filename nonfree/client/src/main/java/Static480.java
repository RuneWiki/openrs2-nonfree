import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "Z")
	private static boolean aBoolean612 = false;

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
	private static int anInt8603 = 0;

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "Lclient!ok;")
	private static final Class262 aClass262_57 = new Class262();

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public static synchronized void method7118() {
		anInt8603++;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public static synchronized void method7119() {
		anInt8603--;
		if (anInt8603 == 0) {
			method7121();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZI)V")
	public static synchronized void method7120() {
		aBoolean612 = true;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V")
	public static synchronized void method7121() {
		while (true) {
			@Pc(9) Class14_Sub52 local9 = (Class14_Sub52) aClass262_57.method6323();
			if (local9 == null) {
				return;
			}
			local9.anInterface6_1.w(true);
			local9.method9315();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!e;B)V")
	public static synchronized void method7122(@OriginalArg(0) Interface6 arg0) {
		if (aBoolean612) {
			return;
		}
		if (anInt8603 <= 0) {
			arg0.w(false);
		} else {
			@Pc(21) Class14_Sub52 local21 = new Class14_Sub52();
			local21.anInterface6_1 = arg0;
			aClass262_57.method6314(local21);
		}
	}
}
