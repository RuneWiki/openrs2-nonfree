import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static437 {

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	public static int anInt7778;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "[I")
	public static final int[] anIntArray531 = new int[6];

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "[I")
	public static final int[] anIntArray532 = new int[4096];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
	public static boolean method6512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
