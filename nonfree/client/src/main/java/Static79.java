import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "Lclient!bo;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!dq", name = "J", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_61 = new Class107(71, -1);

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
	public static int anInt1766 = 64;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_18 = new Class179(23, 7);

	@OriginalMember(owner = "client!dq", name = "P", descriptor = "[I")
	public static final int[] anIntArray134 = new int[16];

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIII)V")
	public static void method1540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static149.method5330(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static163.anIntArrayArray35[arg1];
		@Pc(45) int local45 = arg3 - local15;
		Static59.method1261(local40, local45, arg3 - arg5, arg2);
		@Pc(58) int local58 = arg3 + local15;
		Static59.method1261(local40, local58, local45, arg4);
		Static59.method1261(local40, arg5 + arg3, local58, arg2);
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static152.anIntArray262[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(116) int[] local116;
			@Pc(123) int[] local123;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(173) int local173;
			@Pc(178) int local178;
			@Pc(183) int local183;
			if (local27 >= 0) {
				local24--;
				if (local15 <= local24) {
					local116 = Static163.anIntArrayArray35[local24 + arg1];
					local123 = Static163.anIntArrayArray35[arg1 - local24];
					local128 = arg3 + local10;
					local133 = arg3 - local10;
					Static59.method1261(local116, local128, local133, arg2);
					Static59.method1261(local123, local128, local133, arg2);
				} else {
					local116 = Static163.anIntArrayArray35[local24 + arg1];
					local123 = Static163.anIntArrayArray35[arg1 - local24];
					local128 = Static152.anIntArray262[local24];
					local133 = local10 + arg3;
					local173 = arg3 - local10;
					local178 = arg3 + local128;
					local183 = arg3 - local128;
					Static59.method1261(local116, local183, local173, arg2);
					Static59.method1261(local116, local178, local183, arg4);
					Static59.method1261(local116, local133, local178, arg2);
					Static59.method1261(local123, local183, local173, arg2);
					Static59.method1261(local123, local178, local183, arg4);
					Static59.method1261(local123, local133, local178, arg2);
				}
				local27 -= local24 << 1;
			}
			local116 = Static163.anIntArrayArray35[arg1 + local10];
			local123 = Static163.anIntArrayArray35[arg1 - local10];
			local128 = arg3 + local24;
			local133 = arg3 - local24;
			if (local10 >= local15) {
				Static59.method1261(local116, local128, local133, arg2);
				Static59.method1261(local123, local128, local133, arg2);
			} else {
				local173 = local29 >= local10 ? local29 : Static152.anIntArray262[local10];
				local178 = arg3 + local173;
				local183 = arg3 - local173;
				Static59.method1261(local116, local183, local133, arg2);
				Static59.method1261(local116, local178, local183, arg4);
				Static59.method1261(local116, local128, local178, arg2);
				Static59.method1261(local123, local183, local133, arg2);
				Static59.method1261(local123, local178, local183, arg4);
				Static59.method1261(local123, local128, local178, arg2);
			}
		}
	}
}
