import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public static int anInt6976;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "[S")
	public static short[] aShortArray110;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!gp;")
	public static Class117 aClass117_162;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Lclient!od;")
	public static Class130_Sub1 aClass130_Sub1_2;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
	public static String method5669(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static212.method3450(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
	public static int method5670(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local27 * local13 >> 12;
	}
}
