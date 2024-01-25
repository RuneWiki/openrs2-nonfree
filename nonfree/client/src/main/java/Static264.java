import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "Lclient!sv;")
	public static Class195_Sub1 aClass195_Sub1_1;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
	public static int anInt4796 = 0;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZILclient!ur;[BI)Lclient!al;")
	public static Class10_Sub1_Sub1 method3745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class34_Sub2 arg2, @OriginalArg(6) byte[] arg3) {
		if (arg2.aBoolean768 || Static90.method1429(arg1) && Static90.method1429(arg0)) {
			return new Class10_Sub1_Sub1(arg2, 3553, 6406, arg1, arg0, false, arg3, 6406);
		} else if (arg2.aBoolean759) {
			return new Class10_Sub1_Sub1(arg2, 34037, 6406, arg1, arg0, false, arg3, 6406);
		} else {
			return new Class10_Sub1_Sub1(arg2, 6406, arg1, arg0, Static191.method2740(arg1), Static191.method2740(arg0), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!qr;B)Z")
	public static boolean method3746(@OriginalArg(0) Class205 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean653) {
			return false;
		} else if (!arg0.method4516(Static167.anInterface9_2)) {
			return false;
		} else if (Static297.aClass199_156.method4387((long) arg0.anInt5742) == null) {
			return Static303.aClass199_188.method4387((long) arg0.anInt5747) == null;
		} else {
			return false;
		}
	}
}
