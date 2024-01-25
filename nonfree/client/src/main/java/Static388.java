import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
	private static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	private static int anInt6851 = 0;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Lclient!gk;")
	private static final Class112 aClass112_50 = new Class112();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public static synchronized void method5739() {
		anInt6851++;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static synchronized void method5740() {
		while (true) {
			@Pc(4) Class3_Sub19 local4 = (Class3_Sub19) aClass112_50.method3094();
			if (local4 == null) {
				return;
			}
			local4.anInterface16_1.UA(true);
			local4.method7825();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
	public static synchronized void method5741() {
		aBoolean507 = true;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public static synchronized void method5742() {
		anInt6851--;
		if (anInt6851 == 0) {
			method5740();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!p;)V")
	public static synchronized void method5743(@OriginalArg(1) Interface16 arg0) {
		if (aBoolean507) {
			return;
		}
		if (anInt6851 > 0) {
			@Pc(11) Class3_Sub19 local11 = new Class3_Sub19();
			local11.anInterface16_1 = arg0;
			aClass112_50.method3079(local11);
		} else {
			arg0.UA(false);
		}
	}
}
