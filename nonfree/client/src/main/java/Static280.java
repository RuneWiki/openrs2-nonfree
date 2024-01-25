import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	private static int anInt4750 = 0;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
	private static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!am;")
	private static final Class14 aClass14_28 = new Class14();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public static synchronized void method3755() {
		anInt4750--;
		if (anInt4750 == 0) {
			method3756();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public static synchronized void method3756() {
		while (true) {
			@Pc(4) Class1_Sub1 local4 = (Class1_Sub1) aClass14_28.method202();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.p();
			local4.method5953();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!m;)V")
	public static synchronized void method3757(@OriginalArg(1) Interface5 arg0) {
		if (aBoolean427) {
			return;
		}
		if (anInt4750 <= 0) {
			arg0.p();
		} else {
			@Pc(19) Class1_Sub1 local19 = new Class1_Sub1();
			local19.anInterface5_1 = arg0;
			aClass14_28.method205(local19);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V")
	public static synchronized void method3758() {
		aBoolean427 = true;
	}
}
