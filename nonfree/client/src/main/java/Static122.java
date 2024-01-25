import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!mr;")
	private static final Class223 aClass223_14 = new Class223();

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	private static int anInt2573 = 0;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Z")
	private static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZZ)V")
	public static synchronized void method2422() {
		aBoolean175 = true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static synchronized void method2423() {
		anInt2573--;
		if (anInt2573 == 0) {
			method2424();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static synchronized void method2424() {
		while (true) {
			@Pc(9) Class3_Sub11 local9 = (Class3_Sub11) aClass223_14.method5872();
			if (local9 == null) {
				return;
			}
			local9.anInterface9_1.w(true);
			local9.method8769();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!e;Z)V")
	public static synchronized void method2425(@OriginalArg(0) Interface9 arg0) {
		if (aBoolean175) {
			return;
		}
		if (anInt2573 <= 0) {
			arg0.w(false);
		} else {
			@Pc(20) Class3_Sub11 local20 = new Class3_Sub11();
			local20.anInterface9_1 = arg0;
			aClass223_14.method5868(local20);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static synchronized void method2426() {
		anInt2573++;
	}
}
