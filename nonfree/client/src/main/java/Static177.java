import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!nj", name = "W", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!nj", name = "T", descriptor = "Z")
	public static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V")
	public static void method3088() {
		Static28.aClass46_5.method1079();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg0) {
			Static100.method1910(arg1, arg5, arg4, arg2, arg6, arg3);
		} else if (arg5 - arg4 >= Static68.anInt1509 && arg5 + arg4 <= Static43.anInt1054 && Static127.anInt2664 <= arg2 - arg0 && arg0 + arg2 <= Static290.anInt6021) {
			Static165.method2846(arg2, arg4, arg1, arg3, arg0, arg6, arg5);
		} else {
			Static201.method3393(arg6, arg3, arg5, arg0, arg4, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg0) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) Class132_Sub1 local24 = Static278.aClass132_Sub1Array2[local18];
		Static278.aClass132_Sub1Array2[local18] = Static278.aClass132_Sub1Array2[arg0];
		Static278.aClass132_Sub1Array2[arg0] = local24;
		for (@Pc(36) int local36 = arg1; local36 < arg0; local36++) {
			if (Static267.method3344(local24, arg5, Static278.aClass132_Sub1Array2[local36], arg4, arg2, arg3) <= 0) {
				@Pc(54) Class132_Sub1 local54 = Static278.aClass132_Sub1Array2[local36];
				Static278.aClass132_Sub1Array2[local36] = Static278.aClass132_Sub1Array2[local20];
				Static278.aClass132_Sub1Array2[local20++] = local54;
			}
		}
		Static278.aClass132_Sub1Array2[arg0] = Static278.aClass132_Sub1Array2[local20];
		Static278.aClass132_Sub1Array2[local20] = local24;
		method3090(local20 - 1, arg1, arg2, arg3, arg4, arg5);
		method3090(arg0, local20 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(B)I")
	public static int method3092() {
		Static184.anInt3907 = 0;
		return Static230.method3097();
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(III)V")
	public static void method3093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static157.anInt3299 = arg0 - Static115.anInt2461;
		Static34.anInt1968 = Static52.anInt1205 + Static239.anInt4870 - arg1 - 1;
	}
}
