import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_166 = new Class77(93, 12);

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_167 = new Class77(104, 6);

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
	public static final int[] anIntArray752 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method5353() {
		Static46.anInt931 = 0;
		@Pc(16) int local16 = Static376.anInt6607 + (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7);
		@Pc(23) int local23 = Static133.anInt2474 + (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7);
		if (local16 >= 3053 && local16 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static46.anInt931 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static46.anInt931 = 1;
		}
		if (Static46.anInt931 == 1 && local16 >= 3139 && local16 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static46.anInt931 = 0;
		}
	}
}
