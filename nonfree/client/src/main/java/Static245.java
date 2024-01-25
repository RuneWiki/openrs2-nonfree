import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	public static int anInt4849 = -1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)Lclient!nd;")
	public static Class2_Sub36 method4035() {
		if (Static292.aClass238_57 == null || Static525.aClass211_1 == null) {
			return null;
		}
		for (@Pc(20) Class2_Sub36 local20 = (Class2_Sub36) Static525.aClass211_1.method5216(); local20 != null; local20 = (Class2_Sub36) Static525.aClass211_1.method5216()) {
			@Pc(27) Class105 local27 = Static292.aClass248_4.method6347(local20.anInt6596);
			if (local27 != null && local27.aBoolean281 && local27.method2791(Static292.anInterface5_2)) {
				return local20;
			}
		}
		return null;
	}
}
