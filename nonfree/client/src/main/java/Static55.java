import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!jc;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!qb;")
	public static Class58 aClass58_30 = new Class58();

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_440 = Static129.method2060("::qa_op_test");

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!ge;")
	public static Class29 aClass29_13 = new Class29(64);

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public static int anInt1403 = 0;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!r;")
	public static Class61 aClass61_441 = Static129.method2060("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lclient!r;")
	public static Class61 method1001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return Static93.aClass61_722;
		} else if (local8 < -6) {
			return Static102.aClass61_800;
		} else if (local8 < -3) {
			return Static90.aClass61_700;
		} else if (local8 < 0) {
			return Static112.aClass61_879;
		} else if (local8 > 9) {
			return Static83.aClass61_657;
		} else if (local8 > 6) {
			return Static100.aClass61_776;
		} else if (local8 > 3) {
			return Static87.aClass61_681;
		} else if (local8 > 0) {
			return Static132.aClass61_1088;
		} else {
			return Static66.aClass61_500;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1002() {
		anIntArray208 = null;
		aClass58_30 = null;
		aClass61_440 = null;
		aClass40_2 = null;
		anIntArray207 = null;
		aClass61_441 = null;
		aClass29_13 = null;
	}
}
