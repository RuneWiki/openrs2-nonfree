import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "Lclient!rg;")
	public static Class310 aClass310_132;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
	public static int anInt10731;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "[I")
	public static int[] anIntArray573;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_274 = new Class160(44, 20);

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "Z")
	public static boolean aBoolean740 = false;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "[I")
	public static final int[] anIntArray574 = new int[1];

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V")
	public static void method9163() {
		Static26.anInt351 = 0;
		@Pc(13) int local13 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9) + Static36.anInt617;
		@Pc(26) int local26 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9) + Static550.anInt9242;
		if (local13 >= 3053 && local13 <= 3156 && local26 >= 3056 && local26 <= 3136) {
			Static26.anInt351 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local26 >= 9492 && local26 <= 9535) {
			Static26.anInt351 = 1;
		}
		if (Static26.anInt351 == 1 && local13 >= 3139 && local13 <= 3199 && local26 >= 3008 && local26 <= 3062) {
			Static26.anInt351 = 0;
		}
	}
}
