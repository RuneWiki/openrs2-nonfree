import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!mv;")
	public static Class229 aClass229_121;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public static int anInt8962;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt8961 = -1;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method7139() {
		for (@Pc(6) Class2_Sub40 local6 = (Class2_Sub40) Static249.aClass70_26.method1264(); local6 != null; local6 = (Class2_Sub40) Static249.aClass70_26.method1261()) {
			if (local6.aBoolean593) {
				local6.method5859();
			}
		}
		for (@Pc(32) Class2_Sub40 local32 = (Class2_Sub40) Static524.aClass70_58.method1264(); local32 != null; local32 = (Class2_Sub40) Static524.aClass70_58.method1261()) {
			if (local32.aBoolean593) {
				local32.method5859();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z")
	public static boolean method7140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static486.method6250(arg0, arg1) || Static540.method7100(arg1, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIZI)V")
	public static void method7142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static130.anInt2131 <= arg3 - arg1 && Static89.anInt1576 >= arg3 + arg1 && arg5 - arg1 >= Static275.anInt4756 && arg5 + arg1 <= Static48.anInt898) {
			Static265.method3685(arg5, arg2, arg1, arg4, arg3, arg0);
		} else {
			Static320.method4655(arg4, arg0, arg1, arg5, arg2, arg3);
		}
	}
}
