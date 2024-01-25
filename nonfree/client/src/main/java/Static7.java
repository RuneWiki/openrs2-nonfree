import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!lh;")
	public static final Class194 aClass194_2 = new Class194("WTI", 5);

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[Lclient!tn;")
	public static final Class6_Sub2_Sub19[] aClass6_Sub2_Sub19Array1 = new Class6_Sub2_Sub19[14];

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_7 = new Class73(89, -1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBZ)I")
	public static int method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub49 local8 = Static84.method1640(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray696.length > arg1) {
			return local8.anIntArray696[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method199(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg0, 6);
		local8.method2580();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)Z")
	public static boolean method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static219.method3784(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static339.anInt6128;
			@Pc(14) int local14 = arg2 << Static339.anInt6128;
			return Static502.method6781(local10 + 1, Static133.aClass59Array3[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static502.method6781(local10 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static502.method6781(local10 + Static112.anInt2178 - 1, Static133.aClass59Array3[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static112.anInt2178 - 1) && Static502.method6781(local10 + 1, Static133.aClass59Array3[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static112.anInt2178 - 1);
		} else {
			return false;
		}
	}
}
