import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame17;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array10;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!jn;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt5972 = -2;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "[Lclient!lr;")
	public static Class195[] aClass195Array1 = new Class195[50];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method4985(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static409.method6395(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIBII)V")
	public static void method4986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static162.method3309(arg4, arg1, arg0, arg3);
			}
		} else if (local10 == 0) {
			Static389.method6145(arg3, arg2, arg4, arg1);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(69) boolean local69 = local10 > local15;
			@Pc(73) int local73;
			@Pc(77) int local77;
			if (local69) {
				local73 = arg3;
				arg3 = arg1;
				local77 = arg2;
				arg1 = local73;
				arg2 = arg0;
				arg0 = local77;
			}
			if (arg2 < arg3) {
				local73 = arg3;
				local77 = arg1;
				arg3 = arg2;
				arg1 = arg0;
				arg2 = local73;
				arg0 = local77;
			}
			local73 = arg1;
			local77 = arg2 - arg3;
			@Pc(109) int local109 = arg0 - arg1;
			@Pc(114) int local114 = -(local77 >> 1);
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(126) int local126 = arg0 > arg1 ? 1 : -1;
			@Pc(130) int local130;
			if (local69) {
				for (local130 = arg3; local130 <= arg2; local130++) {
					local114 += local109;
					Static228.anIntArrayArray46[local130][local73] = arg4;
					if (local114 > 0) {
						local73 += local126;
						local114 -= local77;
					}
				}
			} else {
				for (local130 = arg3; local130 <= arg2; local130++) {
					Static228.anIntArrayArray46[local73][local130] = arg4;
					local114 += local109;
					if (local114 > 0) {
						local114 -= local77;
						local73 += local126;
					}
				}
			}
		}
	}
}
