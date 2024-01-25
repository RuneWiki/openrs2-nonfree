import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "Z")
	private static boolean aBoolean561 = false;

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
	private static int anInt8622 = 0;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "Lclient!su;")
	private static final Class298 aClass298_185 = new Class298();

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public static synchronized void method6849() {
		anInt8622--;
		if (anInt8622 == 0) {
			method6853();
		}
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	public static synchronized void method6850() {
		anInt8622++;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!g;B)V")
	public static synchronized void method6851(@OriginalArg(0) Interface4 arg0) {
		if (aBoolean561) {
			return;
		}
		if (anInt8622 > 0) {
			@Pc(11) Class6_Sub21 local11 = new Class6_Sub21();
			local11.anInterface4_1 = arg0;
			aClass298_185.method6812(local11);
		} else {
			arg0.H(false);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZB)V")
	public static synchronized void method6852() {
		aBoolean561 = true;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public static synchronized void method6853() {
		while (true) {
			@Pc(10) Class6_Sub21 local10 = (Class6_Sub21) aClass298_185.method6811();
			if (local10 == null) {
				return;
			}
			local10.anInterface4_1.H(true);
			local10.method7948();
		}
	}
}
