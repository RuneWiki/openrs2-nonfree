import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Z")
	private static boolean aBoolean765 = false;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	private static int anInt10874 = 0;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "Lclient!at;")
	private static final Class20 aClass20_75 = new Class20();

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public static synchronized void method9177() {
		while (true) {
			@Pc(4) Class5_Sub21 local4 = (Class5_Sub21) aClass20_75.method369();
			if (local4 == null) {
				return;
			}
			local4.anInterface11_1.w(true);
			local4.method9222();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
	public static synchronized void method9178() {
		aBoolean765 = true;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	public static synchronized void method9179() {
		anInt10874--;
		if (anInt10874 == 0) {
			method9177();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!e;Z)V")
	public static synchronized void method9180(@OriginalArg(0) Interface11 arg0) {
		if (aBoolean765) {
			return;
		}
		if (anInt10874 > 0) {
			@Pc(16) Class5_Sub21 local16 = new Class5_Sub21();
			local16.anInterface11_1 = arg0;
			aClass20_75.method370(local16);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public static synchronized void method9181() {
		anInt10874++;
	}
}
