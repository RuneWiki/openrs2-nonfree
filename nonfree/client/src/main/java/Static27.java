import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!fh;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_568 = Static118.method2249("This world is full)3");

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!oc;")
	public static Class65 aClass65_567 = aClass65_568;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!oc;")
	public static Class65 aClass65_569 = null;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "[[[Lclient!v;")
	public static final Class91[][][] aClass91ArrayArrayArray1 = new Class91[4][104][104];

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_570 = Static118.method2249("Freie Welt");

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_571 = Static118.method2249("headicons_pk");

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_572 = Static118.method2249("null");

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_573 = Static118.method2249("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)Lclient!c;")
	public static Class10 method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
	public static int method487(@OriginalArg(0) int arg0) {
		if (Static107.anInt2630 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}
}
