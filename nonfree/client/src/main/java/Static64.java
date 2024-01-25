import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	public static int anInt1210;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	public static int anInt1211;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "[I")
	public static final int[] anIntArray56 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_38 = new Class12(29, 0);

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[200];

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg5);
		@Pc(17) int local17 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg0);
		@Pc(23) int local23 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg2);
		@Pc(29) int local29 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg1);
		@Pc(37) int local37 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg5 + arg3);
		@Pc(46) int local46 = Static412.method5316(Static289.anInt5053, Static93.anInt1676, arg0 - arg3);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static2.method38(local29, arg6, Static67.anIntArrayArray13[local48], local23);
		}
		for (@Pc(80) int local80 = local17; local80 > local46; local80--) {
			Static2.method38(local29, arg6, Static67.anIntArrayArray13[local80], local23);
		}
		@Pc(104) int local104 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg2 + arg3);
		@Pc(113) int local113 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg1 - arg3);
		for (@Pc(115) int local115 = local37; local115 <= local46; local115++) {
			@Pc(121) int[] local121 = Static67.anIntArrayArray13[local115];
			Static2.method38(local104, arg6, local121, local23);
			Static2.method38(local113, arg4, local121, local104);
			Static2.method38(local29, arg6, local121, local113);
		}
	}
}
