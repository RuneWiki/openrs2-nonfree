import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!ol", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBII)V")
	public static void method4237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(4, arg1);
		local13.method1570();
		local13.anInt1930 = arg3;
		local13.anInt1933 = arg2;
		local13.anInt1932 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIB)V")
	public static void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static142.anInt3212 <= arg0 - arg1 && Static450.anInt7594 >= arg1 + arg0 && arg2 - arg1 >= Static161.anInt3448 && Static163.anInt3488 >= arg2 + arg1) {
			Static257.method3887(arg3, arg2, arg1, arg0);
		} else {
			Static351.method4990(arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	public static void method4240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static294.method4291(arg0)) {
			Static249.method3809(arg1, Static300.aClass68ArrayArray3[arg0]);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!qa;Lclient!rn;III)V")
	public static void method4243(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class217 local12;
		if (arg3 < Static177.anInt3621) {
			local12 = Static151.aClass217ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass1_Sub2_1 != null && local12.aClass1_Sub2_1.method5839()) {
				arg1.method5836(local12.aClass1_Sub2_1, true, 0, 0, arg0, Static122.anInt2633);
			}
		}
		if (arg4 < Static177.anInt3621) {
			local12 = Static151.aClass217ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub2_1 != null && local12.aClass1_Sub2_1.method5839()) {
				arg1.method5836(local12.aClass1_Sub2_1, true, Static122.anInt2633, 0, arg0, 0);
			}
		}
		if (arg3 < Static177.anInt3621 && arg4 < Static57.anInt1411) {
			local12 = Static151.aClass217ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub2_1 != null && local12.aClass1_Sub2_1.method5839()) {
				arg1.method5836(local12.aClass1_Sub2_1, true, Static122.anInt2633, 0, arg0, Static122.anInt2633);
			}
		}
		if (arg3 < Static177.anInt3621 && arg4 > 0) {
			local12 = Static151.aClass217ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass1_Sub2_1 != null && local12.aClass1_Sub2_1.method5839()) {
				arg1.method5836(local12.aClass1_Sub2_1, true, -Static122.anInt2633, 0, arg0, Static122.anInt2633);
			}
		}
	}
}
