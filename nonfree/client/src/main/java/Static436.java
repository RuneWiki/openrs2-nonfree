import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z")
	public static boolean method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!vj;Z)V")
	public static void method6475(@OriginalArg(0) Class21_Sub1 arg0) {
		if (Static406.aBoolean566) {
			Static112.aClass203Array1[Static112.aClass203Array1.length - 1].method4822(arg0);
		} else {
			Static214.method3482(arg0, Static455.aClass4_Sub3Array6);
		}
	}
}
