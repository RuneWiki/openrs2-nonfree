import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_353 = new Class296(27, 3);

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "[Lclient!hr;")
	public static final Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array6 = new Class1_Sub1_Sub6[14];

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
	public static void method6656() {
		Static158.anInt2905 = 0;
		@Pc(12) int local12 = (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9) + Static470.anInt7897;
		@Pc(20) int local20 = (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9) + Static534.anInt9007;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static158.anInt2905 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static158.anInt2905 = 1;
		}
		if (Static158.anInt2905 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static158.anInt2905 = 0;
		}
	}
}
