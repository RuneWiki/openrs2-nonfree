import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt5154;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_115 = new Class253(60, 12);

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	public static int anInt5155 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method4074() {
		Static231.aStringArray52 = new String[500];
		Static41.anInt687 = Static112.aClass57_6.anInt1607 + Static112.aClass57_6.anInt1596 + 2;
		Static82.anInt1670 = Static35.aClass57_13.anInt1596 + Static35.aClass57_13.anInt1607 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static231.aStringArray52.length; local27++) {
			Static231.aStringArray52[local27] = "";
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method4075() {
		Static184.aClass99_1.method2627();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static258.aLongArray8[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static51.aLongArray1[local29] = 0L;
		}
		Static305.anInt7340 = 0;
	}
}
