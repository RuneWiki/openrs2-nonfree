import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!bg;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!nca;")
	public static Class254 aClass254_134;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_28 = new Class118(31);

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	public static final int[] anIntArray606 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[Lclient!oh;Z)V")
	public static void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) Class273[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class273 local20 = arg1[local14];
			if (local20 != null && local20.anInt7392 == arg0 && !Static91.method1398(local20)) {
				if (local20.anInt7371 == 0) {
					method7583(local20.anInt7350, arg1);
					if (local20.aClass273Array3 != null) {
						method7583(local20.anInt7350, local20.aClass273Array3);
					}
					@Pc(71) Class2_Sub26 local71 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local20.anInt7350, 0);
					if (local71 != null) {
						Static170.method2534(local71.anInt3020);
					}
				}
				if (local20.anInt7371 == 6 && local20.anInt7337 != -1) {
					if (local20.aClass53_8 == null) {
						local20.aClass53_8 = new Class53_Sub2();
						local20.aClass53_8.method4089(local20.anInt7337);
					}
					if (local20.aClass53_8.method4077(Static371.anInt5922) && local20.aClass53_8.method4098()) {
						local20.aClass53_8.method4087();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I")
	public static int method7584() {
		return Static690.anInt10620;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII)V")
	public static void method7586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static8.anInt99 <= arg3 && arg5 <= Static14.anInt206 && Static617.anInt9501 <= arg0 && arg4 <= Static519.anInt8267) {
			if (arg2 == 1) {
				Static399.method5894(arg3, arg5, arg0, arg1, arg4);
			} else {
				Static30.method436(arg1, arg0, arg4, arg3, arg5, arg2);
			}
		} else if (arg2 == 1) {
			Static269.method3781(arg4, arg0, arg5, arg1, arg3);
		} else {
			Static209.method2953(arg3, arg1, arg2, arg0, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IC)Z")
	public static boolean method7587(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
