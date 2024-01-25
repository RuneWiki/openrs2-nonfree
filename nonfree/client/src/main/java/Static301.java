import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!f;")
	public static Class76 aClass76_14;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt5383;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_69 = new Class44(56, 2);

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_129 = new Class81(79, 18);

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "[I")
	public static final int[] anIntArray359 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)V")
	public static void method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static66.anInt1689; local11++) {
			@Pc(17) Rectangle local17 = Class2_Sub20_Sub1.aRectangleArray2[local11];
			if (arg3 < local17.width + local17.x && local17.x < arg0 + arg3 && local17.y + local17.height > arg1 && local17.y < arg2 + arg1) {
				Static378.aBooleanArray47[local11] = true;
			}
		}
	}
}
