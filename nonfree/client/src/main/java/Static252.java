import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
	private static boolean aBoolean310 = false;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	private static int anInt4891 = 0;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!pu;")
	private static final Class203 aClass203_38 = new Class203();

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public static synchronized void method3746() {
		anInt4891--;
		if (anInt4891 == 0) {
			method3747();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public static synchronized void method3747() {
		while (true) {
			@Pc(6) Class1_Sub41 local6 = (Class1_Sub41) aClass203_38.method4549();
			if (local6 == null) {
				return;
			}
			local6.anInterface1_1.p();
			local6.method6178();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method3748() {
		aBoolean310 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLclient!cl;)V")
	public static synchronized void method3749(@OriginalArg(1) Interface1 arg0) {
		if (aBoolean310) {
			return;
		}
		if (anInt4891 > 0) {
			@Pc(16) Class1_Sub41 local16 = new Class1_Sub41();
			local16.anInterface1_1 = arg0;
			aClass203_38.method4551(local16);
		} else {
			arg0.p();
		}
	}
}
