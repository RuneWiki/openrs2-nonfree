import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!or;")
	private static final Class244 aClass244_15 = new Class244();

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	private static int anInt1157 = 0;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
	private static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	public static synchronized void method1085() {
		aBoolean95 = true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!p;)V")
	public static synchronized void method1086(@OriginalArg(1) Interface17 arg0) {
		if (aBoolean95) {
			return;
		}
		if (anInt1157 <= 0) {
			arg0.UA(false);
		} else {
			@Pc(15) Class3_Sub43 local15 = new Class3_Sub43();
			local15.anInterface17_1 = arg0;
			aClass244_15.method5570(local15);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public static synchronized void method1087() {
		while (true) {
			@Pc(4) Class3_Sub43 local4 = (Class3_Sub43) aClass244_15.method5578();
			if (local4 == null) {
				return;
			}
			local4.anInterface17_1.UA(true);
			local4.method8128();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public static synchronized void method1088() {
		anInt1157--;
		if (anInt1157 == 0) {
			method1087();
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	public static synchronized void method1089() {
		anInt1157++;
	}
}
