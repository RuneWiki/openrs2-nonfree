import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "Lclient!mea;")
	public static Class213 aClass213_2;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Z")
	public static boolean method2105() {
		@Pc(7) Class4 local7 = Static593.aClass22_65.aClass4_13.aClass4_285;
		if (local7 == null || Static593.aClass22_65.aClass4_13 == local7) {
			return false;
		}
		@Pc(26) Class4_Sub36 local26 = (Class4_Sub36) local7;
		if (local26.anInt7137 >= 2000) {
			local26.anInt7137 -= 2000;
		}
		return local26.anInt7137 == 1009;
	}
}
