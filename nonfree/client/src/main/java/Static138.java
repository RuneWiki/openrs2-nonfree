import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ah;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!nb;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1032 = Static151.method2243("Create a free account");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1031 = aClass62_1032;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1033 = Static151.method2243("");

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1034 = Static151.method2243("sl_back");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method2055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static122.anInt2718 <= arg3 && Static153.anInt3279 >= arg3 && Static122.anInt2718 <= arg5 && Static153.anInt3279 >= arg5 && Static122.anInt2718 <= arg6 && arg6 <= Static153.anInt3279 && Static122.anInt2718 <= arg1 && Static153.anInt3279 >= arg1 && arg7 >= Static154.anInt3307 && arg7 <= Static15.anInt353 && arg8 >= Static154.anInt3307 && arg8 <= Static15.anInt353 && arg2 >= Static154.anInt3307 && arg2 <= Static15.anInt353 && arg4 >= Static154.anInt3307 && Static15.anInt353 >= arg4) {
			Static53.method777(arg0, arg4, arg7, arg2, arg8, arg6, arg1, arg3, arg5);
		} else {
			Static111.method1707(arg8, arg7, arg1, arg2, arg6, arg5, arg3, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class62 method2056(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static119.method1865(arg0) : Static14.aClass62_101;
	}
}
