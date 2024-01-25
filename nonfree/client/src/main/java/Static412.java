import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
	public static int[] anIntArray592;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
	public static int anInt7139 = -2;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([BI)[B")
	public static byte[] method5918(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static602.method1586(arg0, 0, local9, 0, local6);
		return local9;
	}
}
