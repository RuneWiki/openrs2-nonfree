import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
	private static int anInt6292 = 0;

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "Z")
	private static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "Lclient!fha;")
	private static final Class109 aClass109_40 = new Class109();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V")
	public static synchronized void method5446() {
		aBoolean451 = true;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
	public static synchronized void method5447() {
		anInt6292++;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!e;I)V")
	public static synchronized void method5448(@OriginalArg(0) Interface7 arg0) {
		if (aBoolean451) {
			return;
		}
		if (anInt6292 > 0) {
			@Pc(9) Class2_Sub38 local9 = new Class2_Sub38();
			local9.anInterface7_1 = arg0;
			aClass109_40.method2323(local9);
		} else {
			arg0.w(false);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
	public static synchronized void method5449() {
		anInt6292--;
		if (anInt6292 == 0) {
			method5450();
		}
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V")
	public static synchronized void method5450() {
		while (true) {
			@Pc(4) Class2_Sub38 local4 = (Class2_Sub38) aClass109_40.method2322();
			if (local4 == null) {
				return;
			}
			local4.anInterface7_1.w(true);
			local4.method8653();
		}
	}
}
