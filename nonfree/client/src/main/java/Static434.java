import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "Lclient!mba;")
	private static final Class216 aClass216_54 = new Class216();

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "Z")
	private static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "I")
	private static int anInt7558 = 0;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(BLclient!e;)V")
	public static synchronized void method6594(@OriginalArg(1) Interface8 arg0) {
		if (aBoolean540) {
			return;
		}
		if (anInt7558 <= 0) {
			arg0.w(false);
		} else {
			@Pc(20) Class3_Sub34 local20 = new Class3_Sub34();
			local20.anInterface8_1 = arg0;
			aClass216_54.method5449(local20);
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V")
	public static synchronized void method6595() {
		while (true) {
			@Pc(4) Class3_Sub34 local4 = (Class3_Sub34) aClass216_54.method5462();
			if (local4 == null) {
				return;
			}
			local4.anInterface8_1.w(true);
			local4.method8682();
		}
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)V")
	public static synchronized void method6596() {
		anInt7558++;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V")
	public static synchronized void method6597() {
		anInt7558--;
		if (anInt7558 == 0) {
			method6595();
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZB)V")
	public static synchronized void method6598() {
		aBoolean540 = true;
	}
}
