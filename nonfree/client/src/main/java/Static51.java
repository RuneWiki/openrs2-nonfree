import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bw", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_26 = new Class254(44, -2);

	@OriginalMember(owner = "client!bw", name = "H", descriptor = "I")
	public static int anInt1395 = 13156520;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
	public static void method1218(@OriginalArg(0) int arg0) {
		Static98.anInt2326 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static396.anInt7505; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static54.anInt1441; local6++) {
				if (Static256.aClass224ArrayArrayArray1[arg0][local3][local6] == null) {
					Static256.aClass224ArrayArrayArray1[arg0][local3][local6] = new Class224(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static376.anInt7071 && Class179_Sub2.lb >= arg0 && Static376.anInt7071 <= arg3 && Class179_Sub2.lb >= arg3 && arg7 >= Static376.anInt7071 && arg7 <= Class179_Sub2.lb && arg4 >= Static376.anInt7071 && Class179_Sub2.lb >= arg4 && arg2 >= Static96.anInt2302 && arg2 <= Static289.anInt5545 && arg6 >= Static96.anInt2302 && arg6 <= Static289.anInt5545 && Static96.anInt2302 <= arg5 && arg5 <= Static289.anInt5545 && Static96.anInt2302 <= arg1 && arg1 <= Static289.anInt5545) {
			Static326.method5250(arg8, arg6, arg1, arg4, arg0, arg7, arg3, arg5, arg2);
		} else {
			Static462.method7141(arg7, arg6, arg8, arg5, arg1, arg4, arg2, arg0, arg3);
		}
	}
}
