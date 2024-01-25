import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	public static int anInt5039 = 2;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4201(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static290.method4368(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static290.method4368(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(54) int local54 = local14 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local54);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static187.method3180(local79)) {
				@Pc(87) char local87 = Static9.method238(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}
}
