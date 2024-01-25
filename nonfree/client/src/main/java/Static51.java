import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
	public static int anInt1108;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_13 = new Class216(61, -1);

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_1 = new Class164(14, 0);

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_2 = new Class164(15, 4);

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_3 = new Class164(16, -2);

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_4 = new Class164(17, 0);

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_5 = new Class164(19, -2);

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_6 = new Class164(22, -2);

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_7 = new Class164(23, 4);

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_8 = new Class164(24, -1);

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_9 = new Class164(26, 0);

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_10 = new Class164(27, 0);

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_11 = new Class164(28, -2);

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_12 = new Class164(29, -2);

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "Lclient!iga;")
	public static final Class164 aClass164_13 = new Class164(30, -2);

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	public static final int anInt1109 = 1339;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)V")
	public static void method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static143.method2495(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg4;
		@Pc(23) int local23 = -arg4;
		@Pc(36) int local36 = local14;
		@Pc(39) int local39 = -local14;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(47) int[] local47 = Static172.anIntArrayArray17[arg0];
		@Pc(52) int local52 = arg1 - local14;
		@Pc(57) int local57 = arg1 + local14;
		Static559.method7424(arg5, local47, local52, arg1 - arg4);
		Static559.method7424(arg2, local47, local57, local52);
		Static559.method7424(arg5, local47, arg1 + arg4, local57);
		while (local20 > local10) {
			local41 += 2;
			local43 += 2;
			local23 += local41;
			local39 += local43;
			if (local39 >= 0 && local36 >= 1) {
				Static141.anIntArray185[local36] = local10;
				local36--;
				local39 -= local36 << 1;
			}
			local10++;
			@Pc(124) int[] local124;
			@Pc(131) int[] local131;
			@Pc(135) int local135;
			@Pc(140) int local140;
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(189) int local189;
			if (local23 >= 0) {
				local20--;
				if (local20 >= local14) {
					local124 = Static172.anIntArrayArray17[local20 + arg0];
					local131 = Static172.anIntArrayArray17[arg0 - local20];
					local135 = local10 + arg1;
					local140 = arg1 - local10;
					Static559.method7424(arg5, local124, local135, local140);
					Static559.method7424(arg5, local131, local135, local140);
				} else {
					local124 = Static172.anIntArrayArray17[arg0 + local20];
					local131 = Static172.anIntArrayArray17[arg0 - local20];
					local135 = Static141.anIntArray185[local20];
					local140 = arg1 + local10;
					local180 = arg1 - local10;
					local184 = local135 + arg1;
					local189 = arg1 - local135;
					Static559.method7424(arg5, local124, local189, local180);
					Static559.method7424(arg2, local124, local184, local189);
					Static559.method7424(arg5, local124, local140, local184);
					Static559.method7424(arg5, local131, local189, local180);
					Static559.method7424(arg2, local131, local184, local189);
					Static559.method7424(arg5, local131, local140, local184);
				}
				local23 -= local20 << 1;
			}
			local124 = Static172.anIntArrayArray17[local10 + arg0];
			local131 = Static172.anIntArrayArray17[arg0 - local10];
			local135 = arg1 + local20;
			local140 = arg1 - local20;
			if (local14 <= local10) {
				Static559.method7424(arg5, local124, local135, local140);
				Static559.method7424(arg5, local131, local135, local140);
			} else {
				local180 = local10 > local36 ? Static141.anIntArray185[local10] : local36;
				local184 = local180 + arg1;
				local189 = arg1 - local180;
				Static559.method7424(arg5, local124, local189, local140);
				Static559.method7424(arg2, local124, local184, local189);
				Static559.method7424(arg5, local124, local135, local184);
				Static559.method7424(arg5, local131, local189, local140);
				Static559.method7424(arg2, local131, local184, local189);
				Static559.method7424(arg5, local131, local135, local184);
			}
		}
	}
}
