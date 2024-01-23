import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Z")
	public static boolean aBoolean301;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Lclient!mi;")
	public static Class112 aClass112_10 = new Class112(64);

	@OriginalMember(owner = "client!na", name = "T", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "[I")
	public static int[] anIntArray358 = new int[32];

	@OriginalMember(owner = "client!na", name = "X", descriptor = "I")
	public static int anInt3467 = -1;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
	public static void method3037() {
		Static17.aClass175_3.method4294();
		Static253.aClass175_37.method4294();
		Static96.aClass175_14.method4294();
		Static26.aClass175_5.method4294();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jo;III)V")
	public static void method3038(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static215.aClass96_18.method2341();
		if (Static265.aBoolean468) {
			return;
		}
		for (@Pc(23) Class1_Sub5_Sub1 local23 = (Class1_Sub5_Sub1) arg0.method2340(); local23 != null; local23 = (Class1_Sub5_Sub1) arg0.method2342()) {
			@Pc(30) Class136 local30 = Static160.method2739(local23.anInt359);
			if (Static171.method2957(local30)) {
				Static89.method1734(local23, arg1, local30, arg2);
				if (local23.aBoolean35) {
					Static122.method2209(local23, local30);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public static void method3039() {
		Static292.aClass1_Sub7_Sub2_3.method2777();
		Static167.aClass119_12 = null;
		Static63.anInt1315 = 1;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lclient!vl;")
	public static Class1_Sub5_Sub23 method3040(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub5_Sub23 local11 = (Class1_Sub5_Sub23) Static66.aClass112_5.method2951((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26 = Static291.aClass119_88.method3235(arg0, 5);
		local11 = new Class1_Sub5_Sub23();
		if (local26 != null) {
			local11.method4504(new Class1_Sub13(local26));
		}
		Static66.aClass112_5.method2950((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	public static void method3041() {
		Static199.aClass175_31.method4287();
		Static22.aClass175_4.method4287();
		Static181.aClass175_27.method4287();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V")
	public static void method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg4 + 1;
		Static103.method1978(arg1, arg3, arg0, Static40.anIntArrayArray6[arg4]);
		@Pc(20) int local20 = arg2 - 1;
		Static103.method1978(arg1, arg3, arg0, Static40.anIntArrayArray6[arg2]);
		for (@Pc(27) int local27 = local11; local27 <= local20; local27++) {
			@Pc(38) int[] local38 = Static40.anIntArrayArray6[local27];
			local38[arg0] = local38[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	public static void method3043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static188.anInt3598 <= arg3 - arg0 && Static289.anInt5245 >= arg0 + arg3 && arg5 - arg0 >= Static231.anInt4333 && Static218.anInt4086 >= arg5 + arg0) {
			Static106.method3316(arg2, arg3, arg4, arg5, arg1, arg0);
		} else {
			Static195.method3368(arg5, arg0, arg4, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)Lclient!qi;")
	public static Class143 method3044(@OriginalArg(1) int arg0) {
		@Pc(16) Class143 local16 = (Class143) Static300.aClass175_43.method4295((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static292.aClass119_91.method3235(arg0, 1);
		local16 = new Class143();
		local16.anInt4277 = arg0;
		if (local27 != null) {
			local16.method3654(new Class1_Sub13(local27));
		}
		local16.method3661();
		if (local16.anInt4280 == 2 && Static25.aClass86_33.method2136((long) arg0) == null) {
			Static25.aClass86_33.method2144(new Class1_Sub22(Static87.anInt1877), (long) arg0);
			Static183.aClass143Array1[Static87.anInt1877++] = local16;
		}
		Static300.aClass175_43.method4285(local16, (long) arg0);
		return local16;
	}
}
