import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Z")
	private static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	private static int anInt9427 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!bd;")
	private static final Class32 aClass32_61 = new Class32();

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public static synchronized void method8135() {
		anInt9427++;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static synchronized void method8136() {
		while (true) {
			@Pc(6) Class14_Sub20 local6 = (Class14_Sub20) aClass32_61.method579();
			if (local6 == null) {
				return;
			}
			local6.anInterface5_1.w(true);
			local6.method9513();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static synchronized void method8137() {
		anInt9427--;
		if (anInt9427 == 0) {
			method8136();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZB)V")
	public static synchronized void method8138() {
		aBoolean649 = true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!e;B)V")
	public static synchronized void method8139(@OriginalArg(0) Interface5 arg0) {
		if (aBoolean649) {
			return;
		}
		if (anInt9427 > 0) {
			@Pc(12) Class14_Sub20 local12 = new Class14_Sub20();
			local12.anInterface5_1 = arg0;
			aClass32_61.method582(local12);
		} else {
			arg0.w(false);
		}
	}
}
