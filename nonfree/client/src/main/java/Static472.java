import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_111 = new Class186(70, 2);

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Lclient!h;")
	public static final Class114 aClass114_153 = new Class114("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
	public static void method6879() {
		Static423.anInt8969 = 0;
		@Pc(13) int local13 = (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7) + Static324.anInt6132;
		@Pc(20) int local20 = Static517.anInt8716 + (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static423.anInt8969 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static423.anInt8969 = 1;
		}
		if (Static423.anInt8969 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static423.anInt8969 = 0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z")
	public static boolean method6881() {
		if (Static111.aBoolean184) {
			try {
				if ((Boolean) Static554.method4839(Static91.aClass182_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}
}
