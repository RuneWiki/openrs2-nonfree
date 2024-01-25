import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	public static int anInt4078;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!fr;")
	public static Class85 aClass85_27;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	public static int anInt4080;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	public static int anInt4079 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ya;Lclient!qj;IIIII)V")
	public static void method3238(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static315.anInt5183) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static264.anInt4480) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static295.anInt4910 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class223 local62 = Static19.aClass223ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static244.aClass165Array8[local17].l(local23, local32) + Static244.aClass165Array8[local17].l(local23 + 1, local32) + Static244.aClass165Array8[local17].l(local23, local32 + 1) + Static244.aClass165Array8[local17].l(local23 + 1, local32 + 1)) / 4 - (Static244.aClass165Array8[arg2].l(arg3, arg4) + Static244.aClass165Array8[arg2].l(arg3 + 1, arg4) + Static244.aClass165Array8[arg2].l(arg3, arg4 + 1) + Static244.aClass165Array8[arg2].l(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class26_Sub3 local143 = local62.aClass26_Sub3_2;
									@Pc(146) Class26_Sub3 local146 = local62.aClass26_Sub3_1;
									if (local143 != null && local143.method5721()) {
										arg1.method5712(arg0, local140, (local23 - arg3) * Static363.anInt5820 + (1 - arg5) * Static297.anInt4923, (local32 - arg4) * Static363.anInt5820 + (1 - arg6) * Static297.anInt4923, local143, local1);
									}
									if (local146 != null && local146.method5721()) {
										arg1.method5712(arg0, local140, (local23 - arg3) * Static363.anInt5820 + (1 - arg5) * Static297.anInt4923, (local32 - arg4) * Static363.anInt5820 + (1 - arg6) * Static297.anInt4923, local146, local1);
									}
									for (@Pc(219) Class270 local219 = local62.aClass270_1; local219 != null; local219 = local219.aClass270_3) {
										@Pc(223) Class26_Sub2 local223 = local219.aClass26_Sub2_2;
										if (local223 != null && local223.method5721() && (local23 == local223.aShort105 || local23 == local3) && (local32 == local223.aShort103 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort104 + 1 - local223.aShort105;
											@Pc(260) int local260 = local223.aShort102 + 1 - local223.aShort103;
											arg1.method5712(arg0, local140, (local223.aShort105 - arg3) * Static363.anInt5820 + (local252 - arg5) * Static297.anInt4923, (local223.aShort103 - arg4) * Static363.anInt5820 + (local260 - arg6) * Static297.anInt4923, local223, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
