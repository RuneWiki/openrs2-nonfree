import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
	private static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!au;")
	private static final Class22 aClass22_49 = new Class22();

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	private static int anInt7470 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZB)V")
	public static synchronized void method5895() {
		aBoolean549 = true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public static synchronized void method5896() {
		while (true) {
			@Pc(4) Class4_Sub1 local4 = (Class4_Sub1) aClass22_49.method896();
			if (local4 == null) {
				return;
			}
			local4.anInterface18_1.UA(true);
			local4.method8193();
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	public static synchronized void method5897() {
		anInt7470++;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!p;I)V")
	public static synchronized void method5898(@OriginalArg(0) Interface18 arg0) {
		if (aBoolean549) {
			return;
		}
		if (anInt7470 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(18) Class4_Sub1 local18 = new Class4_Sub1();
			local18.anInterface18_1 = arg0;
			aClass22_49.method894(local18);
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	public static synchronized void method5899() {
		anInt7470--;
		if (anInt7470 == 0) {
			method5896();
		}
	}
}
