import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static466 {

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "[I")
	public static final int[] anIntArray503 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "Lclient!le;")
	public static final Class6_Sub32 aClass6_Sub32_1 = new Class6_Sub32(0, -1);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public static void method7048() {
		Static635.aClient1.method1041();
		Static305.aClass260_2.method6403();
		Static305.aClass260_2.aClass322_126 = null;
		Static305.aClass260_2.anInt7199 = 0;
		Static305.aClass260_2.aClass322_127 = null;
		Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
		Static594.anInt9443 = 0;
		Static305.aClass260_2.aClass322_129 = null;
		Static273.method4624();
		Static579.aClass391_3 = null;
		Static531.aClass391_2 = null;
		Static175.aString39 = null;
		Static191.anInt3933 = 0;
		Static188.anInt3786 = 0;
		Static265.anInt5023 = 0;
		Static29.aClass231Array1 = null;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V")
	public static void method7050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static334.anInt5734 = arg1;
		Static159.anInt3316 = arg0;
		if (Static290.anInt10204 == 0) {
			Static294.anInt5224 = Static159.anInt3316 + Static163.anInt3412 * 2;
			Static367.anInt6186 = Static105.anInt2096 * 2 + Static334.anInt5734;
		} else if (Static290.anInt10204 == 1) {
			Static37.anInt497 = Static159.anInt3316 / Static682.anInt10442 + Static53.anInt668 + 2;
			Static585.anInt9330 = Static334.anInt5734 / Static662.anInt10244 + Static100.anInt2036 + 2;
			Static294.anInt5224 = Static682.anInt10442 * Static37.anInt497;
			Static367.anInt6186 = Static662.anInt10244 * Static585.anInt9330;
			Static163.anInt3412 = Static294.anInt5224 - Static159.anInt3316 >> 1;
			Static105.anInt2096 = Static367.anInt6186 - Static334.anInt5734 >> 1;
		} else if (Static290.anInt10204 == 2) {
			Static367.anInt6186 = Static334.anInt5734;
			Static294.anInt5224 = Static159.anInt3316;
			return;
		}
	}
}
