import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
	private static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!rh;")
	private static final Class275 aClass275_73 = new Class275();

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	private static int anInt3637 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!g;)V")
	public static synchronized void method3132(@OriginalArg(1) Interface9 arg0) {
		if (aBoolean241) {
			return;
		}
		if (anInt3637 <= 0) {
			arg0.H(false);
		} else {
			@Pc(17) Class6_Sub29 local17 = new Class6_Sub29();
			local17.anInterface9_1 = arg0;
			aClass275_73.method6370(local17);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	public static synchronized void method3133() {
		while (true) {
			@Pc(4) Class6_Sub29 local4 = (Class6_Sub29) aClass275_73.method6360();
			if (local4 == null) {
				return;
			}
			local4.anInterface9_1.H(true);
			local4.method7849();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
	public static synchronized void method3134() {
		aBoolean241 = true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static synchronized void method3135() {
		anInt3637--;
		if (anInt3637 == 0) {
			method3133();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public static synchronized void method3136() {
		anInt3637++;
	}
}
