import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public static int anInt7811;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "J")
	public static long aLong249;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_96 = new Class241(30, 8);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method6959() {
		Static225.anInt4393 = 0;
		@Pc(17) int local17 = Static50.anInt606 + (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9);
		@Pc(25) int local25 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9) + Static404.anInt7039;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static225.anInt4393 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static225.anInt4393 = 1;
		}
		if (Static225.anInt4393 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static225.anInt4393 = 0;
		}
	}
}
