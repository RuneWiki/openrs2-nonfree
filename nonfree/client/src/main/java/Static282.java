import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public static int anInt5211;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_13 = new Class368(14, 8);

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method4741() {
		Static276.anInt5122 = 0;
		@Pc(12) int local12 = Static640.anInt11085 + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9);
		@Pc(19) int local19 = Static490.anInt8763 + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static276.anInt5122 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static276.anInt5122 = 1;
		}
		if (Static276.anInt5122 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static276.anInt5122 = 0;
		}
	}
}
