import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "[I")
	public static final int[] anIntArray86 = new int[1000];

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "[I")
	public static final int[] anIntArray87 = new int[50];

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
	public static int anInt1202 = 0;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static119.method2127(0, arg2, arg5, arg4, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "([Lclient!ab;II)V")
	public static void method857(@OriginalArg(0) Class3[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class3 local14 = arg0[local8];
			if (local14 != null && local14.anInt87 == arg1 && !Static51.method790(local14)) {
				if (local14.anInt91 == 0) {
					method857(arg0, local14.anInt94);
					if (local14.aClass3Array1 != null) {
						method857(local14.aClass3Array1, local14.anInt94);
					}
					@Pc(48) Class2_Sub26 local48 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local14.anInt94);
					if (local48 != null) {
						Static311.method2432(local48.anInt4145);
					}
				}
				if (local14.anInt91 == 6 && local14.anInt48 != -1) {
					@Pc(69) Class102 local69 = Static333.aClass50_2.method1175(local14.anInt48);
					if (local69 != null) {
						local14.anInt112 += Static278.anInt5166;
						while (local14.anInt112 > local69.anIntArray229[local14.anInt82]) {
							local14.anInt112 -= local69.anIntArray229[local14.anInt82];
							local14.anInt82++;
							if (local69.anIntArray231.length <= local14.anInt82) {
								local14.anInt82 -= local69.anInt2996;
								if (local14.anInt82 < 0 || local69.anIntArray231.length <= local14.anInt82) {
									local14.anInt82 = 0;
								}
							}
							local14.anInt80 = local14.anInt82 + 1;
							if (local69.anIntArray231.length <= local14.anInt80) {
								local14.anInt80 -= local69.anInt2996;
								if (local14.anInt80 < 0 || local14.anInt80 >= local69.anIntArray231.length) {
									local14.anInt80 = -1;
								}
							}
							Static128.method2229(local14);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIII)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static179.anInt3768 <= arg3 - arg1 && Static121.anInt6758 >= arg1 + arg3 && arg0 - arg1 >= Static317.anInt5793 && arg1 + arg0 <= Static69.anInt1551) {
			Static49.method727(arg3, arg0, arg2, arg1);
		} else {
			Static144.method2627(arg0, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method860(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static94.method1601(Static115.method2052(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
