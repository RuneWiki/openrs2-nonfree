import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static74 {

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!ni;")
	public static Class223 aClass223_31;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
	public static int anInt2416;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_27 = new Class73(95, 10);

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public static final int anInt2417 = 2;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Z")
	public static boolean method2090(@OriginalArg(0) int arg0) {
		if (arg0 == 10 || arg0 == 25 || arg0 == 11 || arg0 == 12 || arg0 == 17) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method2091(@OriginalArg(0) int arg0) {
		Static502.anIntArray343 = new int[arg0];
		Static515.anIntArray467 = new int[arg0];
		Static372.anIntArray335 = new int[arg0];
		Static574.anIntArray522 = new int[arg0];
		Static84.anIntArray85 = new int[arg0];
	}
}
