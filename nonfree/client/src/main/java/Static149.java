import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!th;")
	public static Class82 aClass82_14 = new Class82();

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[J")
	public static long[] aLongArray8 = new long[200];

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[Lclient!d;")
	public static Class12[] aClass12Array1 = new Class12[4];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method2599() {
		aClass12Array1 = null;
		aLongArray8 = null;
		aClass82_14 = null;
		anIntArray352 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBII)V")
	public static void method2600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static174.anInt1393 == 0 || arg0 == 0 || Static175.anInt3994 >= 50 || arg1 == -1) {
			return;
		}
		Static156.anIntArray383[Static175.anInt3994] = arg1;
		Static17.anIntArray100[Static175.anInt3994] = arg0;
		Static70.anIntArray212[Static175.anInt3994] = arg2;
		Static114.aClass83Array1[Static175.anInt3994] = null;
		Static167.anIntArray434[Static175.anInt3994] = 0;
		Static175.anInt3994++;
	}
}
