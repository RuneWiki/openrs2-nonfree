import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
	private static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!mg;")
	private static final Class156 aClass156_1 = new Class156();

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private static int anInt1 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
	public static synchronized void method1() {
		aBoolean1 = true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static synchronized void method2() {
		while (true) {
			@Pc(9) Class2_Sub24 local9 = (Class2_Sub24) aClass156_1.method3152();
			if (local9 == null) {
				return;
			}
			local9.anInterface8_1.p();
			local9.method5703();
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public static synchronized void method3() {
		anInt1--;
		if (anInt1 == 0) {
			method2();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!js;)V")
	public static synchronized void method4(@OriginalArg(1) Interface8 arg0) {
		if (aBoolean1) {
			return;
		}
		if (anInt1 <= 0) {
			arg0.p();
		} else {
			@Pc(14) Class2_Sub24 local14 = new Class2_Sub24();
			local14.anInterface8_1 = arg0;
			aClass156_1.method3157(local14);
		}
	}
}
