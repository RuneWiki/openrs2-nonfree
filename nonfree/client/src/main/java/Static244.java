import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public static int anInt4874;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public static int anInt4872 = 100;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString169 = "Loaded config";

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public static void method3658() {
		Static226.anInt4614 = 0;
		@Pc(16) int local16 = Static130.anInt2601 + (Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7);
		@Pc(23) int local23 = Static49.anInt1089 + (Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7);
		if (local23 >= 3053 && local23 <= 3156 && local16 >= 3056 && local16 <= 3136) {
			Static226.anInt4614 = 1;
		}
		if (local23 >= 3072 && local23 <= 3118 && local16 >= 9492 && local16 <= 9535) {
			Static226.anInt4614 = 1;
		}
		if (Static226.anInt4614 == 1 && local23 >= 3139 && local23 <= 3199 && local16 >= 3008 && local16 <= 3062) {
			Static226.anInt4614 = 0;
		}
	}
}
