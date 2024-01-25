import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_28 = new Class286(60, 16);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public static void method1194() {
		Static476.anInt8172 = 0;
		@Pc(12) int local12 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >> 9) + Static35.anInt906;
		@Pc(19) int local19 = Static130.anInt5246 + (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >> 9);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static476.anInt8172 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static476.anInt8172 = 1;
		}
		if (Static476.anInt8172 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static476.anInt8172 = 0;
		}
	}
}
