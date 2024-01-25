import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!br", name = "o", descriptor = "Lclient!mg;")
	public static Class160 aClass160_5;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "Lclient!ya;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Lclient!ar;")
	public static Class14 aClass14_3 = new Class14();

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 128 || arg5 < 128 || Static229.anInt4427 * 128 - 256 < arg0 || arg5 > (Static379.anInt6422 - 2) * 128) {
			Static283.anIntArray135[0] = Static283.anIntArray135[1] = -1;
			return;
		}
		@Pc(55) int local55 = Static85.method1695(arg6, arg5, arg0) - arg1;
		Static17.aClass35_4.o(arg3, 0, 0);
		aClass49_1.ea(Static17.aClass35_4);
		aClass49_1.X(arg0, local55, arg5, Static283.anIntArray135);
		Static17.aClass35_4.o(-arg3, 0, 0);
		aClass49_1.ea(Static17.aClass35_4);
	}
}
