import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "[Lclient!et;")
	public static Class41_Sub2_Sub1[] aClass41_Sub2_Sub1Array7;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "Lclient!nd;")
	public static final Class222 aClass222_15 = new Class222();

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_148 = new Class56(38, 12);

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_149 = new Class56(82, -2);

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "[I")
	public static int[] anIntArray466 = new int[1];

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_150 = new Class56(102, 19);

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_80 = new Class303(60, -1);

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_53 = new Class112();

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
	public static int anInt7434 = -1;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method6197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(12) Class3_Sub26 local12 = null;
		for (@Pc(17) Class3_Sub26 local17 = (Class3_Sub26) Static469.aClass112_27.method3088(); local17 != null; local17 = (Class3_Sub26) Static469.aClass112_27.method3084()) {
			if (local17.anInt3740 == arg5 && arg6 == local17.anInt3738 && local17.anInt3735 == arg1 && arg3 == local17.anInt3742) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class3_Sub26();
			local12.anInt3740 = arg5;
			local12.anInt3735 = arg1;
			local12.anInt3742 = arg3;
			local12.anInt3738 = arg6;
			if (arg6 >= 0 && arg1 >= 0 && Static54.anInt1038 > arg6 && arg1 < Static140.anInt3026) {
				Static133.method2620(local12);
			}
			Static469.aClass112_27.method3079(local12);
		}
		local12.anInt3745 = arg0;
		local12.anInt3739 = 0;
		local12.anInt3746 = arg4;
		local12.anInt3734 = -1;
		local12.anInt3743 = arg2;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!qg;)Z")
	public static boolean method6199(@OriginalArg(1) Class272 arg0) {
		return Static522.aClass272_12 == arg0 || Static72.aClass272_5 == arg0 || arg0 == Static434.aClass272_9 || Static346.aClass272_8 == arg0;
	}
}
