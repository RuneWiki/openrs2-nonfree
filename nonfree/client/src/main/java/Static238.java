import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "D")
	public static double aDouble3;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public static int anInt5268 = -1;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public static void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class6_Sub5_Sub19 local12 = Static348.method5721(arg1, 6);
		local12.method5179();
		local12.anInt6198 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)Z")
	public static boolean method4327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Z")
	public static boolean method4328(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method4329(@OriginalArg(0) String arg0) {
		Static548.method7725(4, arg0, 0, "", "", "");
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZIIIIII)V")
	public static void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static309.anInt6227 && Static7.anInt464 >= arg1 && Static309.anInt6227 <= arg0 && arg0 <= Static7.anInt464 && Static309.anInt6227 <= arg2 && Static7.anInt464 >= arg2 && arg8 >= Static309.anInt6227 && Static7.anInt464 >= arg8 && arg7 >= Static633.anInt10644 && arg7 <= Static389.anInt7300 && Static633.anInt10644 <= arg4 && arg4 <= Static389.anInt7300 && arg3 >= Static633.anInt10644 && Static389.anInt7300 >= arg3 && Static633.anInt10644 <= arg5 && Static389.anInt7300 >= arg5) {
			Static332.method5536(arg7, arg3, arg5, arg0, arg1, arg6, arg2, arg8, arg4);
		} else {
			Static577.method5572(arg1, arg6, arg3, arg0, arg8, arg2, arg5, arg7, arg4);
		}
	}
}
