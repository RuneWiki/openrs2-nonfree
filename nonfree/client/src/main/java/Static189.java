import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_6 = new Class340("", 19);

	@OriginalMember(owner = "client!gga", name = "Q", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_45 = new Class341(27, 3);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BII)Z")
	public static boolean method3618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static29.method500(arg0, arg1) & Static461.method7372(arg1, arg0);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method3643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg6);
		@Pc(17) int local17 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg5);
		@Pc(23) int local23 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg2);
		@Pc(29) int local29 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg0);
		@Pc(37) int local37 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg1 + arg6);
		@Pc(46) int local46 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg5 - arg1);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static567.method8614(local23, local29, Static186.anIntArrayArray12[local48], arg3);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static567.method8614(local23, local29, Static186.anIntArrayArray12[local72], arg3);
		}
		@Pc(94) int local94 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg2 + arg1);
		@Pc(103) int local103 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg0 - arg1);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static186.anIntArrayArray12[local105];
			Static567.method8614(local23, local94, local111, arg3);
			Static567.method8614(local94, local103, local111, arg4);
			Static567.method8614(local103, local29, local111, arg3);
		}
	}
}
