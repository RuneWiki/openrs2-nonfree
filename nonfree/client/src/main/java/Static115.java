import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	private static int anInt2018 = 0;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
	private static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!ps;")
	private static final Class193 aClass193_24 = new Class193();

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static synchronized void method1849() {
		anInt2018--;
		if (anInt2018 == 0) {
			method1850();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public static synchronized void method1850() {
		while (true) {
			@Pc(6) Class3_Sub12 local6 = (Class3_Sub12) aClass193_24.method4521();
			if (local6 == null) {
				return;
			}
			local6.anInterface12_1.pa();
			local6.method6288();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!v;I)V")
	public static synchronized void method1851(@OriginalArg(0) Interface12 arg0) {
		if (aBoolean121) {
			return;
		}
		if (anInt2018 <= 0) {
			arg0.pa();
		} else {
			@Pc(12) Class3_Sub12 local12 = new Class3_Sub12();
			local12.anInterface12_1 = arg0;
			aClass193_24.method4527(local12);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V")
	public static synchronized void method1852() {
		aBoolean121 = true;
	}
}
