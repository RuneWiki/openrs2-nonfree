import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
	public static int anInt624;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
	public static int anInt625;

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "Lclient!mm;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "Lclient!tn;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
	public static int anInt629 = 0;

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_46 = new Class12(107, 10);

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_47 = new Class12(44, -1);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static47.anInt762 <= arg5 && arg5 <= Static60.anInt1086 && Static47.anInt762 <= arg1 && arg1 <= Static60.anInt1086 && arg3 >= Static47.anInt762 && Static60.anInt1086 >= arg3 && arg0 >= Static47.anInt762 && arg0 <= Static60.anInt1086 && arg2 >= Static357.anInt6537 && arg2 <= Static85.anInt1517 && arg6 >= Static357.anInt6537 && arg6 <= Static85.anInt1517 && Static357.anInt6537 <= arg8 && arg8 <= Static85.anInt1517 && arg4 >= Static357.anInt6537 && Static85.anInt1517 >= arg4) {
			Static164.method2553(arg5, arg0, arg3, arg7, arg2, arg8, arg4, arg1, arg6);
		} else {
			Static333.method4790(arg8, arg5, arg1, arg3, arg4, arg6, arg0, arg2, arg7);
		}
	}
}
