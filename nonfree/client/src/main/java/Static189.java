import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!vj;")
	public static Class376 aClass376_1;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "Lclient!da;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_6 = new Class117(4, 3);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2958(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = Static162.method2592(arg1, arg0);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1.charAt(local30) != arg0; local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method2959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg1 + 8 - 1) / 8);
		@Pc(37) int local37 = -((arg3 + 8 - 1) / 8);
		for (@Pc(39) int local39 = local28; local39 < 0; local39++) {
			for (@Pc(43) int local43 = local37; local43 < 0; local43++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local13;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg0;
		}
		return false;
	}
}
