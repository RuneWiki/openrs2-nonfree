import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
	public static int anInt3744;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "Lclient!uu;")
	public static Class343 aClass343_101;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "F")
	public static float aFloat79 = 0.0F;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!wq;I[I[I[I)V")
	public static void method3202(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg1[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass140Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass140Array3[local19] = null;
					} else {
						@Pc(36) Class267 local36 = Static474.aClass264_2.method6574(local9);
						@Pc(39) int local39 = local36.anInt7585;
						@Pc(44) Class140 local44 = arg0.aClass140Array3[local19];
						if (local44 != null) {
							if (local44.anInt3758 == local9) {
								if (local39 == 0) {
									local44 = arg0.aClass140Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt3756 = 0;
									local44.anInt3759 = local17;
									local44.anInt3754 = 1;
									local44.anInt3753 = 0;
									local44.anInt3755 = 0;
									if (!arg0.aBoolean772) {
										Static522.method7586(0, arg0, local36);
									}
								} else if (local39 == 2) {
									local44.anInt3753 = 0;
								}
							} else if (local36.anInt7582 >= Static474.aClass264_2.method6574(local44.anInt3758).anInt7582) {
								local44 = arg0.aClass140Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg0.aClass140Array3[local19] = new Class140();
							local44.anInt3759 = local17;
							local44.anInt3756 = 0;
							local44.anInt3753 = 0;
							local44.anInt3755 = 0;
							local44.anInt3758 = local9;
							local44.anInt3754 = 1;
							if (!arg0.aBoolean772) {
								Static522.method7586(0, arg0, local36);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
