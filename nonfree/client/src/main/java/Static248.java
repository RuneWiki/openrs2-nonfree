import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!hp;")
	public static Class112 aClass112_3;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)Z")
	public static boolean method3657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static595.method8432(arg1, arg0) & Static454.method6569(arg1, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLclient!so;)Lclient!vha;")
	public static Class369 method3659(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(12) int local12 = arg0.method5900();
		return new Class369(local12);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public static void method3660(@OriginalArg(0) int arg0) {
		if (Static404.anIntArray538 == null || Static404.anIntArray538.length < arg0) {
			Static404.anIntArray538 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ad;I)I")
	public static int method3661(@OriginalArg(0) Class7 arg0) {
		if (arg0 == Static448.aClass7_6) {
			return 9216;
		} else if (Static622.aClass7_9 == arg0) {
			return 34065;
		} else if (Static536.aClass7_7 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
