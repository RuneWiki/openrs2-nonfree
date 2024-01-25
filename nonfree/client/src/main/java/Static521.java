import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method6310() {
		@Pc(20) byte[] local20;
		if (Static428.anObject15 == null) {
			@Pc(13) Class32_Sub1_Sub2 local13 = new Class32_Sub1_Sub2();
			local20 = local13.method6967();
			Static428.anObject15 = Static425.method6549(local20);
		}
		if (Static465.anObject17 == null) {
			@Pc(31) Class32_Sub2_Sub1 local31 = new Class32_Sub2_Sub1();
			local20 = local31.method5310();
			Static465.anObject17 = Static425.method6549(local20);
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method6311() {
		if (!Static211.aBoolean370) {
			return;
		}
		while (true) {
			while (Static197.aClass23_Sub1Array1.length > Static369.anInt6841) {
				@Pc(25) Class23_Sub1 local25 = Static197.aClass23_Sub1Array1[Static369.anInt6841];
				if (local25 != null && local25.anInt5199 == -1) {
					if (Static330.aClass12_Sub37_1 == null) {
						Static330.aClass12_Sub37_1 = Static40.aClass59_1.method1598(local25.aString52);
					}
					@Pc(49) int local49 = Static330.aClass12_Sub37_1.anInt6059;
					if (local49 == -1) {
						return;
					}
					Static369.anInt6841++;
					Static330.aClass12_Sub37_1 = null;
					local25.anInt5199 = local49;
				} else {
					Static369.anInt6841++;
				}
			}
			return;
		}
	}
}
