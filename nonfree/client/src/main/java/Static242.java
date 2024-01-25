import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_208 = new Class158("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
	public static void method6079() {
		Static362.anInt6659 = 0;
		@Pc(12) int local12 = Static278.anInt5374 + (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7);
		@Pc(20) int local20 = (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7) + Static380.anInt6896;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static362.anInt6659 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static362.anInt6659 = 1;
		}
		if (Static362.anInt6659 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static362.anInt6659 = 0;
		}
	}
}
