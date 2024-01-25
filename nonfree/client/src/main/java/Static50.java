import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lclient!bv;")
	public static Class6_Sub7 method1207() {
		if (Static461.aClass211_2 == null || Static57.aClass97_41 == null) {
			return null;
		}
		Static57.aClass97_41.method2514(Static461.aClass211_2);
		@Pc(20) Class6_Sub7 local20 = (Class6_Sub7) Static57.aClass97_41.method2517();
		if (local20 == null) {
			return null;
		} else {
			@Pc(30) Class137 local30 = Static461.aClass42_2.method1147(local20.anInt1365);
			return local30 != null && local30.aBoolean353 && local30.method3765(Static461.anInterface15_2) ? local20 : Static55.method1268();
		}
	}
}
