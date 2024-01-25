import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!vo;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_52 = new Class269(40, -1);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public static int anInt5103 = 2;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
	public static final int[] anIntArray350 = new int[32];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Z")
	public static boolean method4258(@OriginalArg(1) boolean arg0) {
		@Pc(13) boolean local13 = Static600.aClass87_15.method7914();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static600.aClass87_15.method7940();
		} else if (!Static600.aClass87_15.method7955()) {
			arg0 = false;
		}
		if (local13 == arg0) {
			return false;
		} else {
			Static404.aClass2_Sub13_2.method1383(arg0 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub25_1);
			Static209.method3628();
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(CI)Z")
	public static boolean method4259(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
