import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "F")
	public static float aFloat142 = 1.0F;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_45 = new Class109();

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "[I")
	public static final int[] anIntArray500 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Z")
	public static boolean aBoolean530 = true;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IC)Z")
	public static boolean method5991(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
