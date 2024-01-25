import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static int anInt6170;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt6167 = -1;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt6168 = 0;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
	public static final int[] anIntArray663 = new int[25];

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!dt;")
	public static Class62 aClass62_19 = null;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg6 < 0 || arg4 >= Static12.anInt161 - 1 || arg6 >= Static44.anInt787 - 1) {
			return;
		}
		if (Static69.aClass48ArrayArrayArray1 == null) {
			return;
		}
		@Pc(36) Interface3 local36;
		if (arg3 == 0) {
			local36 = (Interface3) Static343.method5200(arg1, arg4, arg6);
			@Pc(42) Interface3 local42 = (Interface3) Static78.method1315(arg1, arg4, arg6);
			if (local36 != null && arg5 != 2) {
				if (local36 instanceof Class28_Sub3_Sub2) {
					((Class28_Sub3_Sub2) local36).aClass170_1.method3973(arg0);
				} else {
					Static298.method4593(arg6, arg1, arg0, arg5, arg3, local36.method5420(), arg2, arg4);
				}
			}
			if (local42 != null) {
				if (local42 instanceof Class28_Sub3_Sub2) {
					((Class28_Sub3_Sub2) local42).aClass170_1.method3973(arg0);
				} else {
					Static298.method4593(arg6, arg1, arg0, arg5, arg3, local42.method5420(), arg2, arg4);
				}
			}
		} else if (arg3 == 1) {
			local36 = (Interface3) Static202.method3148(arg1, arg4, arg6);
			if (local36 != null) {
				if (local36 instanceof Class28_Sub4_Sub2) {
					((Class28_Sub4_Sub2) local36).aClass170_4.method3973(arg0);
				} else {
					@Pc(220) int local220 = local36.method5420();
					if (arg5 == 4 || arg5 == 5) {
						Static298.method4593(arg6, arg1, arg0, 4, arg3, local220, arg2, arg4);
					} else if (arg5 == 6) {
						Static298.method4593(arg6, arg1, arg0, 4, arg3, local220, arg2 + 4, arg4);
					} else if (arg5 == 7) {
						Static298.method4593(arg6, arg1, arg0, 4, arg3, local220, (arg2 + 2 & 0x3) + 4, arg4);
					} else if (arg5 == 8) {
						Static298.method4593(arg6, arg1, arg0, 4, arg3, local220, arg2 + 4, arg4);
						Static298.method4593(arg6, arg1, arg0, 4, arg3, local220, (arg2 + 2 & 0x3) + 4, arg4);
					}
				}
			}
		} else if (arg3 == 2) {
			local36 = (Interface3) Static30.method472(arg1, arg4, arg6, gg.class);
			if (local36 != null) {
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (local36 instanceof Class28_Sub1_Sub6) {
					((Class28_Sub1_Sub6) local36).aClass170_3.method3973(arg0);
				} else {
					Static298.method4593(arg6, arg1, arg0, arg5, arg3, local36.method5420(), arg2, arg4);
				}
			}
		} else if (arg3 == 3) {
			local36 = (Interface3) Static277.method4347(arg1, arg4, arg6);
			if (local36 != null) {
				if (local36 instanceof Class28_Sub2_Sub3) {
					((Class28_Sub2_Sub3) local36).aClass170_2.method3973(arg0);
				} else {
					Static298.method4593(arg6, arg1, arg0, arg5, arg3, local36.method5420(), arg2, arg4);
				}
			}
		}
	}
}
