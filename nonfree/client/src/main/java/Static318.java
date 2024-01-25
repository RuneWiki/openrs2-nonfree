import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "[I")
	public static int[] anIntArray479 = new int[2];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBIIIII)V")
	public static void method4520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static442.anInt7406 = arg3;
		Static262.anInt4606 = arg2;
		Static275.anInt4984 = arg4;
		Static86.anInt1452 = arg5;
		Static460.anInt7742 = arg1;
		Static303.anInt4486 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4521(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg2); local9 != -1; local9 = arg1.indexOf(arg2, arg0.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg0 + arg1.substring(arg2.length() + local9);
		}
		return arg1;
	}
}
