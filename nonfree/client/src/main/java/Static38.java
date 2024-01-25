import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method635() {
		Static485.method6816();
		Static567.method7826(Static58.aClass6_Sub17_Sub1_1.aBoolean600);
		Static431.aClass189_2 = Static26.method357(22050, Static77.aCanvas1, Static174.aClass313_24, 0);
		Static431.aClass189_2.method4937(Static139.aClass6_Sub15_Sub3_1);
		Static271.aClass189_1 = Static26.method357(2048, Static77.aCanvas1, Static174.aClass313_24, 1);
		Static271.aClass189_1.method4937(Static204.aClass6_Sub15_Sub1_1);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z")
	public static boolean method636() {
		if (Static375.anInt9162 < 1) {
			return false;
		} else {
			return Static338.aClass45_6 != Static101.aClass45_4 || Static113.anInt1927 >= 2;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Lclient!cc;")
	public static Class45 method637(@OriginalArg(0) int arg0) {
		@Pc(16) Class45[] local16 = Static261.method3995();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class45 local24 = local16[local18];
			if (local24.anInt1007 == arg0) {
				return local24;
			}
		}
		return null;
	}
}
