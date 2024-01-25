import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	public static void method2802() {
		Static347.anInt5749 = 0;
		@Pc(12) int local12 = Static365.anInt6047 + (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7);
		@Pc(24) int local24 = (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7) + Static366.anInt6052;
		if (local12 >= 3053 && local12 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static347.anInt5749 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static347.anInt5749 = 1;
		}
		if (Static347.anInt5749 == 1 && local12 >= 3139 && local12 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static347.anInt5749 = 0;
		}
	}
}
