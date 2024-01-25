import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "Z")
	private static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Lclient!jia;")
	private static final Class193 aClass193_3 = new Class193();

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "I")
	private static int anInt692 = 0;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method727() {
		aBoolean65 = true;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V")
	public static synchronized void method728() {
		anInt692++;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)V")
	public static synchronized void method729() {
		while (true) {
			@Pc(4) Class3_Sub22 local4 = (Class3_Sub22) aClass193_3.method4452();
			if (local4 == null) {
				return;
			}
			local4.anInterface6_1.w(true);
			local4.method8770();
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	public static synchronized void method730() {
		anInt692--;
		if (anInt692 == 0) {
			method729();
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!e;B)V")
	public static synchronized void method731(@OriginalArg(0) Interface6 arg0) {
		if (aBoolean65) {
			return;
		}
		if (anInt692 > 0) {
			@Pc(8) Class3_Sub22 local8 = new Class3_Sub22();
			local8.anInterface6_1 = arg0;
			aClass193_3.method4462(local8);
		} else {
			arg0.w(false);
		}
	}
}
