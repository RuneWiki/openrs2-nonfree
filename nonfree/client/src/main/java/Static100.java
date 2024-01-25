import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!ir;")
	public static Class100 aClass100_38;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString76 = "Loading textures - ";

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ir;ILclient!ir;Lclient!ir;)V")
	public static void method1718(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class100 arg2) {
		Static348.aClass100_127 = arg1;
		Static226.method3945(arg2, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z")
	public static boolean method1720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static213.method3734(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static20.method420(local10 + 1, Static69.aClass22Array1[arg0].method4672(arg1, arg2) + arg3, local14 + 1) && Static20.method420(local10 + 128 - 1, Static69.aClass22Array1[arg0].method4672(arg1 + 1, arg2) + arg3, local14 + 1) && Static20.method420(local10 + 128 - 1, Static69.aClass22Array1[arg0].method4672(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static20.method420(local10 + 1, Static69.aClass22Array1[arg0].method4672(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
