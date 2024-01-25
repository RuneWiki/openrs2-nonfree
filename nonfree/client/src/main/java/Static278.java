import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!fc;")
	public static Class71 aClass71_20;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	public static int anInt1556;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIII)V")
	public static void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static71.method1292(local35, true);
	}
}
