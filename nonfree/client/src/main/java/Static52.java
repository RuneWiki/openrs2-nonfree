import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lclient!le;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
	public static int anInt1305;

	@OriginalMember(owner = "client!fd", name = "rb", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array12;

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_553 = Static187.method3089("(U0a )2 in: ");

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
	public static int anInt1298 = 1;

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
	public static int anInt1299 = 0;

	@OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_554 = Static187.method3089("OFF");

	@OriginalMember(owner = "client!fd", name = "lb", descriptor = "[I")
	public static final int[] anIntArray92 = new int[1000];

	@OriginalMember(owner = "client!fd", name = "qb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_555 = aClass92_554;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBIII)V")
	public static void method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static41.method731(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg2;
		@Pc(18) int local18 = -arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -local15;
		@Pc(29) int local29 = local15;
		@Pc(31) int local31 = -1;
		@Pc(35) int[] local35 = Static142.anIntArrayArray25[arg3];
		@Pc(37) int local37 = -1;
		@Pc(41) int local41 = local15 + arg4;
		@Pc(46) int local46 = arg4 - local15;
		Static74.method1123(arg4 - arg5, arg1, local35, local46);
		Static74.method1123(local46, arg0, local35, local41);
		Static74.method1123(local41, arg1, local35, arg5 + arg4);
		while (local24 > local10) {
			local37 += 2;
			local31 += 2;
			local18 += local37;
			local27 += local31;
			if (local27 >= 0 && local29 >= 1) {
				Static83.anIntArray154[local29] = local10;
				local29--;
				local27 -= local29 << 1;
			}
			local10++;
			@Pc(138) int[] local138;
			@Pc(124) int[] local124;
			@Pc(132) int local132;
			@Pc(128) int local128;
			@Pc(179) int local179;
			@Pc(184) int local184;
			@Pc(189) int local189;
			if (local18 >= 0) {
				local24--;
				if (local15 <= local24) {
					local124 = Static142.anIntArrayArray25[arg3 - local24];
					local128 = arg4 - local10;
					local132 = arg4 + local10;
					local138 = Static142.anIntArrayArray25[local24 + arg3];
					Static74.method1123(local128, arg1, local138, local132);
					Static74.method1123(local128, arg1, local124, local132);
				} else {
					local138 = Static142.anIntArrayArray25[arg3 + local24];
					local124 = Static142.anIntArrayArray25[arg3 - local24];
					local132 = Static83.anIntArray154[local24];
					local128 = local10 + arg4;
					local179 = arg4 - local10;
					local184 = arg4 + local132;
					local189 = arg4 - local132;
					Static74.method1123(local179, arg1, local138, local189);
					Static74.method1123(local189, arg0, local138, local184);
					Static74.method1123(local184, arg1, local138, local128);
					Static74.method1123(local179, arg1, local124, local189);
					Static74.method1123(local189, arg0, local124, local184);
					Static74.method1123(local184, arg1, local124, local128);
				}
				local18 -= local24 << 1;
			}
			local138 = Static142.anIntArrayArray25[local10 + arg3];
			local132 = local24 + arg4;
			local124 = Static142.anIntArrayArray25[arg3 - local10];
			local128 = arg4 - local24;
			if (local15 <= local10) {
				Static74.method1123(local128, arg1, local138, local132);
				Static74.method1123(local128, arg1, local124, local132);
			} else {
				local179 = local29 >= local10 ? local29 : Static83.anIntArray154[local10];
				local189 = arg4 - local179;
				local184 = local179 + arg4;
				Static74.method1123(local128, arg1, local138, local189);
				Static74.method1123(local189, arg0, local138, local184);
				Static74.method1123(local184, arg1, local138, local132);
				Static74.method1123(local128, arg1, local124, local189);
				Static74.method1123(local189, arg0, local124, local184);
				Static74.method1123(local184, arg1, local124, local132);
			}
		}
	}
}
