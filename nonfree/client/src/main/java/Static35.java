import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!aj;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt1964 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lclient!oca;")
	public static Class232 method1830(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static356.aClass232Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;IBIZ)V")
	public static void method1831(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static453.method6410(arg1, arg3, false, arg2, null, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!pp;BI)V")
	public static void method1833(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static601.method2939(local6, 0, local6.length, arg0);
		Static104.method1870(arg1, local6, arg2);
	}
}
