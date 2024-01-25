import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public static int anInt4840 = 2;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "[Lclient!rj;")
	public static final Class177[] aClass177Array2 = new Class177[14];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public static void method4199() {
		for (@Pc(3) int local3 = 0; local3 < Static323.anInt6731; local3++) {
			@Pc(9) Class147 local9 = Static53.method1079(local3);
			if (local9 != null && local9.anInt4399 == 0) {
				Static326.anIntArray552[local3] = 0;
				Static81.anIntArray119[local3] = 0;
			}
		}
		Static346.aClass207_36 = new Class207(128);
	}
}
