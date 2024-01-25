import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!co", name = "F", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_17 = new Class316(1, 7);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZI)V")
	public static void method1111(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static18.anInt5702 = 3;
		Static526.anInt9112 = arg0;
		Static550.method7685(Static416.aClass297_5.anInt8579, Static416.aClass297_5.aString70);
		if (arg1) {
			Static278.method4182("", false, "");
		} else {
			Static526.method7221();
			Static278.method4182(Static535.aString84, false, Static277.aString39);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static529.anInt9806 <= arg1 && arg4 <= Static205.anInt3906 && Static133.anInt2531 <= arg2 && arg5 <= Static52.anInt1226) {
			Static533.method7267(arg0, arg6, arg2, arg4, arg1, arg3, arg5);
		} else {
			Static467.method6523(arg1, arg0, arg4, arg2, arg6, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)Z")
	public static boolean method1114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static267.aByteArrayArrayArray8[1][arg1][arg0] & 0x2) != 0;
	}
}
