import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Lclient!pc;")
	public static Class188 aClass188_43;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method2343() {
		Static310.anInt5449 = 0;
		@Pc(13) int local13 = (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7) + Static173.anInt3340;
		@Pc(21) int local21 = (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7) + Static379.anInt6721;
		if (local13 >= 3053 && local13 <= 3156 && local21 >= 3056 && local21 <= 3136) {
			Static310.anInt5449 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local21 >= 9492 && local21 <= 9535) {
			Static310.anInt5449 = 1;
		}
		if (Static310.anInt5449 == 1 && local13 >= 3139 && local13 <= 3199 && local21 >= 3008 && local21 <= 3062) {
			Static310.anInt5449 = 0;
		}
	}
}
