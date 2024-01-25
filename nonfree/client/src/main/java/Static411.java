import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Z")
	private static boolean aBoolean568 = false;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!mfa;")
	private static final Class211 aClass211_63 = new Class211();

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	private static int anInt7692 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static synchronized void method6417() {
		while (true) {
			@Pc(4) Class6_Sub5 local4 = (Class6_Sub5) aClass211_63.method5180();
			if (local4 == null) {
				return;
			}
			local4.anInterface4_1.H(true);
			local4.method8151();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V")
	public static synchronized void method6418() {
		aBoolean568 = true;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static synchronized void method6419() {
		anInt7692--;
		if (anInt7692 == 0) {
			method6417();
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static synchronized void method6420() {
		anInt7692++;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!g;B)V")
	public static synchronized void method6421(@OriginalArg(0) Interface4 arg0) {
		if (aBoolean568) {
			return;
		}
		if (anInt7692 > 0) {
			@Pc(11) Class6_Sub5 local11 = new Class6_Sub5();
			local11.anInterface4_1 = arg0;
			aClass211_63.method5173(local11);
		} else {
			arg0.H(false);
		}
	}
}
