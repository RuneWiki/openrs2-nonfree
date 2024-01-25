import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_74 = new Class130(75, 3);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public static int anInt4607 = 0;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public static int anInt4608 = -1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBIIIII)V")
	public static void method4084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static630.anInt10099 <= arg4 - arg1 && Static16.anInt4339 >= arg1 + arg4 && Static11.anInt9803 <= arg3 - arg1 && arg1 + arg3 <= Static149.anInt2949) {
			Static592.method8324(arg5, arg1, arg2, arg0, arg3, arg4);
		} else {
			Static520.method8068(arg5, arg3, arg0, arg4, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4086(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static629.method8652(Static501.method7399(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
