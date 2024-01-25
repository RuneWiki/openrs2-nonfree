import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!oba", name = "Tc", descriptor = "I")
	public static int anInt7862;

	@OriginalMember(owner = "client!oba", name = "Oc", descriptor = "I")
	public static int anInt7864 = -1;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ed;)V")
	public static void method6613(@OriginalArg(0) Class88 arg0) {
		Static424.aClass88_1 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "(B)V")
	public static void method6619() {
		Static384.anInt6866 = 0;
		@Pc(21) int local21 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9) + Static714.anInt11156;
		@Pc(28) int local28 = Static339.anInt5859 + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9);
		if (local21 >= 3053 && local21 <= 3156 && local28 >= 3056 && local28 <= 3136) {
			Static384.anInt6866 = 1;
		}
		if (local21 >= 3072 && local21 <= 3118 && local28 >= 9492 && local28 <= 9535) {
			Static384.anInt6866 = 1;
		}
		if (Static384.anInt6866 == 1 && local21 >= 3139 && local21 <= 3199 && local28 >= 3008 && local28 <= 3062) {
			Static384.anInt6866 = 0;
		}
	}
}
