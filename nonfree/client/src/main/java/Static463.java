import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "F")
	public static float aFloat149 = 1.0F;

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public static void method4990() {
		Static219.anInt3646 = 0;
		@Pc(18) int local18 = (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7) + Static31.anInt618;
		@Pc(25) int local25 = Static226.anInt3768 + (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7);
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static219.anInt3646 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static219.anInt3646 = 1;
		}
		if (Static219.anInt3646 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static219.anInt3646 = 0;
		}
	}
}
