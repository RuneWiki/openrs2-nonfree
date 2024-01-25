import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIIIIII)V")
	public static void method835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static71.method4523(arg2);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg2 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg2;
		@Pc(23) int local23 = -arg2;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(36) int[] local36 = Static196.anIntArrayArray37[arg4];
		@Pc(46) int local46 = arg1 - local14;
		@Pc(50) int local50 = local14 + arg1;
		Static162.method1731(local46, local36, arg1 - arg2, arg0);
		Static162.method1731(local50, local36, local46, arg5);
		Static162.method1731(arg1 + arg2, local36, local50, arg0);
		while (local20 > local10) {
			local30 += 2;
			local32 += 2;
			local28 += local32;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				Static216.anIntArray359[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(119) int[] local119;
			@Pc(126) int[] local126;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(175) int local175;
			@Pc(179) int local179;
			@Pc(184) int local184;
			if (local23 >= 0) {
				local20--;
				if (local20 >= local14) {
					local119 = Static196.anIntArrayArray37[local20 + arg4];
					local126 = Static196.anIntArrayArray37[arg4 - local20];
					local130 = local10 + arg1;
					local135 = arg1 - local10;
					Static162.method1731(local130, local119, local135, arg0);
					Static162.method1731(local130, local126, local135, arg0);
				} else {
					local119 = Static196.anIntArrayArray37[local20 + arg4];
					local126 = Static196.anIntArrayArray37[arg4 - local20];
					local130 = Static216.anIntArray359[local20];
					local135 = local10 + arg1;
					local175 = arg1 - local10;
					local179 = arg1 + local130;
					local184 = arg1 - local130;
					Static162.method1731(local184, local119, local175, arg0);
					Static162.method1731(local179, local119, local184, arg5);
					Static162.method1731(local135, local119, local179, arg0);
					Static162.method1731(local184, local126, local175, arg0);
					Static162.method1731(local179, local126, local184, arg5);
					Static162.method1731(local135, local126, local179, arg0);
				}
				local23 -= local20 << 1;
			}
			local119 = Static196.anIntArrayArray37[local10 + arg4];
			local126 = Static196.anIntArrayArray37[arg4 - local10];
			local130 = local20 + arg1;
			local135 = arg1 - local20;
			if (local10 >= local14) {
				Static162.method1731(local130, local119, local135, arg0);
				Static162.method1731(local130, local126, local135, arg0);
			} else {
				local175 = local25 < local10 ? Static216.anIntArray359[local10] : local25;
				local179 = local175 + arg1;
				local184 = arg1 - local175;
				Static162.method1731(local184, local119, local135, arg0);
				Static162.method1731(local179, local119, local184, arg5);
				Static162.method1731(local130, local119, local179, arg0);
				Static162.method1731(local184, local126, local135, arg0);
				Static162.method1731(local179, local126, local184, arg5);
				Static162.method1731(local130, local126, local179, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)Z")
	public static boolean method838() {
		return Static221.anInt4557 == 0 ? Static348.aClass3_Sub2_Sub4_3.method5133() : true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method840(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static198.anInt4059;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class88 local26 = Static251.method4221(arg0[local18]);
			if (local26.anInt2662 != -1) {
				@Pc(38) Class57 local38 = (Class57) Static115.aClass198_21.method5242((long) local26.anInt2662);
				if (local38 == null) {
					@Pc(46) Class149 local46 = Static366.method3895(Static317.aClass100_112, local26.anInt2662, 0);
					if (local46 != null) {
						local38 = Static212.aClass122_2.method4757(local46);
						Static115.aClass198_21.method5231((long) local26.anInt2662, local38);
					}
				}
				if (local38 != null) {
					Static274.aClass57Array22[local16] = local38;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
