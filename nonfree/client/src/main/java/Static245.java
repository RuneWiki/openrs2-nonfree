import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)J")
	public static long method4133() {
		return Static602.aClass28_1.method8214();
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public static void method4135() {
		Static368.anInt6773 = 0;
		@Pc(12) int local12 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9) + Static427.anInt7462;
		@Pc(24) int local24 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9) + Static22.anInt329;
		if (local12 >= 3053 && local12 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static368.anInt6773 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static368.anInt6773 = 1;
		}
		if (Static368.anInt6773 == 1 && local12 >= 3139 && local12 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static368.anInt6773 = 0;
		}
	}
}
