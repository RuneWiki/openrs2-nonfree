import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "I")
	public static int anInt5885 = 0;

	@OriginalMember(owner = "client!nja", name = "o", descriptor = "[Lclient!ne;")
	public static final Class4_Sub5_Sub15[] aClass4_Sub5_Sub15Array3 = new Class4_Sub5_Sub15[14];

	@OriginalMember(owner = "client!nja", name = "q", descriptor = "Lclient!ap;")
	public static Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!nja", name = "y", descriptor = "I")
	public static int anInt5896 = 0;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static472.anInt7503 && Static257.anInt4172 >= arg1 && Static472.anInt7503 <= arg5 && Static257.anInt4172 >= arg5 && Static472.anInt7503 <= arg3 && arg3 <= Static257.anInt4172 && Static472.anInt7503 <= arg4 && arg4 <= Static257.anInt4172 && arg7 >= Static73.anInt1542 && Static527.anInt8177 >= arg7 && arg8 >= Static73.anInt1542 && Static527.anInt8177 >= arg8 && arg6 >= Static73.anInt1542 && arg6 <= Static527.anInt8177 && arg2 >= Static73.anInt1542 && arg2 <= Static527.anInt8177) {
			Static540.method7230(arg1, arg4, arg3, arg5, arg8, arg6, arg2, arg0, arg7);
		} else {
			Static197.method4792(arg3, arg8, arg1, arg2, arg4, arg7, arg0, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZIIZ)V")
	public static void method5157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 0) {
			Static90.method7669(false);
		} else {
			Static618.anInt9707 = Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052();
			Static46.method825(0, true);
		}
		Static430.aBoolean524 = arg3;
		Static50.anInt1094 = arg0;
		Static559.anInt8609 = arg2;
		Static154.method461(arg1);
	}
}
