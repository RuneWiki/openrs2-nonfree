import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "Z")
	public static boolean aBoolean461;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString352 = "flash1:";

	@OriginalMember(owner = "client!up", name = "P", descriptor = "I")
	public static volatile int anInt6143 = 0;

	@OriginalMember(owner = "client!up", name = "V", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!up", name = "X", descriptor = "I")
	public static int anInt6150 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg5) {
			method5465(arg6, arg1, arg5, arg4, arg0, arg3);
		} else if (Static184.anInt6250 <= arg4 - arg5 && arg5 + arg4 <= Static80.anInt4809 && arg6 - arg2 >= Static314.anInt6018 && Static334.anInt6315 >= arg6 + arg2) {
			Static224.method3898(arg6, arg3, arg5, arg0, arg4, arg1, arg2);
		} else {
			Static350.method5770(arg1, arg4, arg2, arg6, arg3, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!bo;B)V")
	public static void method5463(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt5329 - Static180.anInt3606;
		@Pc(32) int local32 = arg0.anInt5259 * 128 + arg0.method4646() * 64;
		@Pc(43) int local43 = arg0.anInt5304 * 128 + arg0.method4646() * 64;
		arg0.anInt5773 += (local43 - arg0.anInt5773) / local9;
		arg0.anInt5334 = 0;
		arg0.anInt5769 += (local32 - arg0.anInt5769) / local9;
		if (arg0.anInt5311 == 0) {
			arg0.method4653(8192);
		}
		if (arg0.anInt5311 == 1) {
			arg0.method4653(12288);
		}
		if (arg0.anInt5311 == 2) {
			arg0.method4653(0);
		}
		if (arg0.anInt5311 == 3) {
			arg0.method4653(4096);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBIII)Lclient!vh;")
	public static Class5_Sub40 method5464(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class5_Sub40 local12 = new Class5_Sub40();
		local12.anInt6233 = arg3;
		local12.anInt6229 = arg1;
		Static265.aClass42_53.method1050((long) arg2, local12);
		Static62.method1263(arg3);
		@Pc(31) Class96 local31 = Static121.method2396(arg2);
		if (local31 != null) {
			Static336.method4719(local31);
		}
		if (Static323.aClass96_20 != null) {
			Static336.method4719(Static323.aClass96_20);
			Static323.aClass96_20 = null;
		}
		Static171.method3254();
		if (local31 != null) {
			Static27.method4647(!arg0, local31);
		}
		if (!arg0) {
			Static223.method3892(arg3);
		}
		if (!arg0 && Static207.anInt4106 != -1) {
			Static55.method1183(1, Static207.anInt4106);
		}
		return local12;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIZI)V")
	private static void method5465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static184.anInt6250 <= arg3 - arg2 && Static80.anInt4809 >= arg3 + arg2 && Static314.anInt6018 <= arg0 - arg2 && Static334.anInt6315 >= arg0 + arg2) {
			Static172.method3271(arg0, arg5, arg3, arg1, arg2, arg4);
		} else {
			Static189.method3471(arg5, arg1, arg0, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 + arg4 > arg5 && arg3 < arg5 + arg7) {
			return arg2 < arg6 + arg1 && arg2 + arg0 > arg6;
		} else {
			return false;
		}
	}
}
