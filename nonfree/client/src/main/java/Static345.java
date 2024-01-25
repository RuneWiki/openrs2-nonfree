import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static345 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	public static int anInt5819;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	public static int anInt5821;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	public static int anInt5823 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)Z")
	public static boolean method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method4830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static399.anInt2866 <= arg2 - arg1 && Static372.anInt6316 >= arg2 + arg1 && arg0 - arg1 >= Static316.anInt5349 && arg1 + arg0 <= Static418.anInt7030) {
			Static218.method6135(arg0, arg2, arg3, arg1);
		} else {
			Static319.method4440(arg2, arg0, arg1, arg3);
		}
	}
}
