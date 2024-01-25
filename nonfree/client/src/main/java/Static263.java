import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jga", name = "Db", descriptor = "I")
	public static int anInt4236;

	@OriginalMember(owner = "client!jga", name = "Gb", descriptor = "Lclient!mj;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!jga", name = "Ab", descriptor = "Lclient!dj;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!jga", name = "Cb", descriptor = "I")
	public static int anInt4235 = 0;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIIB)V")
	public static void method3704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg4 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static246.method3382(arg1, arg0, arg2, arg3);
			}
		} else if (local10 == 0) {
			Static231.method3184(arg0, arg4, arg1, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local10 > local15;
			@Pc(72) int local72;
			@Pc(76) int local76;
			if (local68) {
				local72 = arg0;
				arg0 = arg1;
				local76 = arg4;
				arg4 = arg2;
				arg1 = local72;
				arg2 = local76;
			}
			if (arg4 < arg0) {
				local72 = arg0;
				local76 = arg1;
				arg0 = arg4;
				arg4 = local72;
				arg1 = arg2;
				arg2 = local76;
			}
			local72 = arg1;
			local76 = arg4 - arg0;
			@Pc(112) int local112 = arg2 - arg1;
			@Pc(117) int local117 = -(local76 >> 1);
			@Pc(128) int local128 = arg1 < arg2 ? 1 : -1;
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(137) int local137;
			if (local68) {
				for (local137 = arg0; local137 <= arg4; local137++) {
					Static543.anIntArrayArray57[local137][local72] = arg3;
					local117 += local112;
					if (local117 > 0) {
						local72 += local128;
						local117 -= local76;
					}
				}
			} else {
				for (local137 = arg0; local137 <= arg4; local137++) {
					local117 += local112;
					Static543.anIntArrayArray57[local72][local137] = arg3;
					if (local117 > 0) {
						local72 += local128;
						local117 -= local76;
					}
				}
			}
		}
	}
}
