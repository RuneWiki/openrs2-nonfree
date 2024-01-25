import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public static int anInt5024;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_16 = new Class37(0, 2, 2, 1);

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
	public static final int anInt5038 = 1339;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)I")
	public static int method3967(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public static void method3970() {
		if (Static105.aBoolean100) {
			return;
		}
		Static4.method56(Static292.aClass36ArrayArrayArray2);
		if (Static317.aClass36ArrayArrayArray3 != null) {
			Static4.method56(Static317.aClass36ArrayArrayArray3);
		}
		Static105.aBoolean100 = true;
	}
}
