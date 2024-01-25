import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Z")
	private static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!hga;")
	private static final Class130 aClass130_43 = new Class130();

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	private static int anInt6820 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static synchronized void method5836() {
		anInt6820++;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	public static synchronized void method5837() {
		anInt6820--;
		if (anInt6820 == 0) {
			method5838();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static synchronized void method5838() {
		while (true) {
			@Pc(4) Class3_Sub30 local4 = (Class3_Sub30) aClass130_43.method3545();
			if (local4 == null) {
				return;
			}
			local4.anInterface18_1.UA(true);
			local4.method7812();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	public static synchronized void method5839() {
		aBoolean550 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!p;)V")
	public static synchronized void method5840(@OriginalArg(1) Interface18 arg0) {
		if (aBoolean550) {
			return;
		}
		if (anInt6820 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(21) Class3_Sub30 local21 = new Class3_Sub30();
			local21.anInterface18_1 = arg0;
			aClass130_43.method3548(local21);
		}
	}
}
