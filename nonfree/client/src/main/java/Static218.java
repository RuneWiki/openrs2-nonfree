import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_26 = new Class102(260);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z")
	public static boolean method3184() {
		@Pc(7) Class1 local7 = Static202.aClass227_21.aClass1_225.aClass1_262;
		if (local7 == null || Static202.aClass227_21.aClass1_225 == local7) {
			return false;
		}
		@Pc(24) Class1_Sub19 local24 = (Class1_Sub19) local7;
		if (local24.anInt2416 >= 2000) {
			local24.anInt2416 -= 2000;
		}
		return local24.anInt2416 == 1012;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public static void method3185() {
		Static25.aClass102_4.method2262(5);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	public static void method3187() {
		Static301.method4121(false);
		if (Static89.anInt1631 >= 0 && Static89.anInt1631 != 0) {
			Static379.method4990(Static89.anInt1631);
			Static89.anInt1631 = -1;
		}
	}
}
