import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "[S")
	public static final short[] aShortArray42 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;")
	public static String[] method1936(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static252.method3568(arg0, arg1);
		@Pc(20) String[] local20 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0.charAt(local30) != arg1; local30++) {
			}
			local20[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local10] = arg0.substring(local24);
		return local20;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method1938(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static285.aClass60Array8 != Static127.aClass60Array7) {
			@Pc(11) int local11 = Static34.aClass60Array10[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class60 local18 = Static34.aClass60Array10[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method7890(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.aa(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
