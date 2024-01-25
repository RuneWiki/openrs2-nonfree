import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public static int anInt3332;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_56 = new Class215(3, 3);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Lclient!lga;")
	public static Class2_Sub32 method3055() {
		if (Static303.aClass341_2 == null || Static475.aClass56_4 == null) {
			return null;
		}
		for (@Pc(21) Class2_Sub32 local21 = (Class2_Sub32) Static475.aClass56_4.method2110(); local21 != null; local21 = (Class2_Sub32) Static475.aClass56_4.method2110()) {
			@Pc(29) Class153 local29 = Static303.aClass248_2.method6584(local21.anInt6568);
			if (local29 != null && local29.aBoolean387 && local29.method4493(Static303.anInterface6_2)) {
				return local21;
			}
		}
		return null;
	}
}
