import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	private static int anInt4864 = 0;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Z")
	private static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!dm;")
	private static final Class73 aClass73_39 = new Class73();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public static synchronized void method4111() {
		aBoolean384 = true;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static synchronized void method4112() {
		anInt4864--;
		if (anInt4864 == 0) {
			method4113();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static synchronized void method4113() {
		while (true) {
			@Pc(4) Class12_Sub14 local4 = (Class12_Sub14) aClass73_39.method2008();
			if (local4 == null) {
				return;
			}
			local4.anInterface12_1.NA(true);
			local4.method7967();
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public static synchronized void method4114() {
		anInt4864++;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!o;I)V")
	public static synchronized void method4115(@OriginalArg(0) Interface12 arg0) {
		if (aBoolean384) {
			return;
		}
		if (anInt4864 > 0) {
			@Pc(8) Class12_Sub14 local8 = new Class12_Sub14();
			local8.anInterface12_1 = arg0;
			aClass73_39.method2012(local8);
		} else {
			arg0.NA(false);
		}
	}
}
