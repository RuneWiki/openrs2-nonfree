import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
	public static int anInt7451;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "[I")
	public static final int[] anIntArray421 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
	public static void method5812(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub7_Sub19 local16 = Static73.method5992(8, arg0);
		local16.method7364();
	}
}
