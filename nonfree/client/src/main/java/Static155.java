import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	private static int anInt2707 = 0;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Z")
	private static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!nv;")
	private static final Class177 aClass177_15 = new Class177();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static synchronized void method2187() {
		while (true) {
			@Pc(4) Class5_Sub14 local4 = (Class5_Sub14) aClass177_15.method3621();
			if (local4 == null) {
				return;
			}
			local4.anInterface11_1.p();
			local4.method6003();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!nf;I)V")
	public static synchronized void method2188(@OriginalArg(0) Interface11 arg0) {
		if (aBoolean176) {
			return;
		}
		if (anInt2707 > 0) {
			@Pc(9) Class5_Sub14 local9 = new Class5_Sub14();
			local9.anInterface11_1 = arg0;
			aClass177_15.method3615(local9);
		} else {
			arg0.p();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
	public static synchronized void method2189() {
		aBoolean176 = true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static synchronized void method2190() {
		anInt2707--;
		if (anInt2707 == 0) {
			method2187();
		}
	}
}
