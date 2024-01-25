import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!di", name = "F", descriptor = "I")
	public static int anInt1430;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "I")
	public static int anInt1435;

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "Lclient!ct;")
	public static Class30 aClass30_13;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "I")
	public static int anInt1434 = 0;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "[I")
	public static final int[] anIntArray118 = new int[13];

	@OriginalMember(owner = "client!di", name = "O", descriptor = "I")
	public static int anInt1436 = -1;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I")
	public static int method1385(@OriginalArg(1) int arg0) {
		@Pc(19) Class9 local19 = Static147.method2867(arg0);
		@Pc(22) int local22 = local19.anInt284;
		@Pc(25) int local25 = local19.anInt286;
		@Pc(28) int local28 = local19.anInt285;
		@Pc(35) int local35 = Class79.anIntArray189[local28 - local25];
		return local35 & Static87.anIntArray147[local22] >> local25;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
	public static void method1386() {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(0, 15);
		local13.method3481();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg2 < 0 || arg6 >= Static311.anInt5653 - 1 || arg2 >= Static189.anInt3820 - 1) {
			return;
		}
		if (Static105.aClass155ArrayArrayArray3 == null) {
			return;
		}
		@Pc(36) Interface4 local36;
		if (arg1 == 0) {
			local36 = (Interface4) Static342.method5727(arg0, arg6, arg2);
			@Pc(42) Interface4 local42 = (Interface4) Static150.method4955(arg0, arg6, arg2);
			if (local36 != null && arg3 != 2) {
				if (local36 instanceof Class11_Sub5_Sub3) {
					((Class11_Sub5_Sub3) local36).aClass156_2.method4190(arg5);
				} else {
					Static31.method823(arg0, arg2, local36.method5927(), arg6, arg1, arg5, arg4, arg3);
				}
			}
			if (local42 != null) {
				if (local42 instanceof Class11_Sub5_Sub3) {
					((Class11_Sub5_Sub3) local42).aClass156_2.method4190(arg5);
				} else {
					Static31.method823(arg0, arg2, local42.method5927(), arg6, arg1, arg5, arg4, arg3);
				}
			}
		} else if (arg1 == 1) {
			local36 = (Interface4) Static74.method1619(arg0, arg6, arg2);
			if (local36 != null) {
				if (local36 instanceof Class11_Sub4_Sub3) {
					((Class11_Sub4_Sub3) local36).aClass156_4.method4190(arg5);
				} else {
					@Pc(115) int local115 = local36.method5927();
					if (arg3 == 4 || arg3 == 5) {
						Static31.method823(arg0, arg2, local115, arg6, arg1, arg5, arg4, 4);
					} else if (arg3 == 6) {
						Static31.method823(arg0, arg2, local115, arg6, arg1, arg5, arg4 + 4, 4);
					} else if (arg3 == 7) {
						Static31.method823(arg0, arg2, local115, arg6, arg1, arg5, (arg4 + 2 & 0x3) + 4, 4);
					} else if (arg3 == 8) {
						Static31.method823(arg0, arg2, local115, arg6, arg1, arg5, arg4 + 4, 4);
						Static31.method823(arg0, arg2, local115, arg6, arg1, arg5, (arg4 + 2 & 0x3) + 4, 4);
					}
				}
			}
		} else if (arg1 == 2) {
			local36 = (Interface4) Static138.method2791(arg0, arg6, arg2, jb.class);
			if (local36 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local36 instanceof Class11_Sub2_Sub5) {
					((Class11_Sub2_Sub5) local36).aClass156_3.method4190(arg5);
				} else {
					Static31.method823(arg0, arg2, local36.method5927(), arg6, arg1, arg5, arg4, arg3);
				}
			}
		} else if (arg1 == 3) {
			local36 = (Interface4) Static109.method2324(arg0, arg6, arg2);
			if (local36 != null) {
				if (local36 instanceof Class11_Sub1_Sub2) {
					((Class11_Sub1_Sub2) local36).aClass156_1.method4190(arg5);
				} else {
					Static31.method823(arg0, arg2, local36.method5927(), arg6, arg1, arg5, arg4, arg3);
				}
			}
		}
	}
}
