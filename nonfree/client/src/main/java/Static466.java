import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6894(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static529.anInt8750; local9++) {
			if (arg0.equalsIgnoreCase(Static562.aStringArray36[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method6897(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(13) int local13 = Static494.method7189(arg0, arg1);
		@Pc(18) String[] local18 = new String[local13 + 1];
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			@Pc(27) int local27;
			for (local27 = local22; arg0 != arg1.charAt(local27); local27++) {
			}
			local18[local20++] = arg1.substring(local22, local27);
			local22 = local27 + 1;
		}
		local18[local13] = arg1.substring(local22);
		return local18;
	}
}
