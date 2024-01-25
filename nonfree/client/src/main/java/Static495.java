import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)I")
	public static int method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(24) int local24 = local7 >= 8 ? arg1 : arg2;
		@Pc(43) int local43 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg2 : arg3) : arg1;
		return ((local7 & 0x2) == 0 ? local43 : -local43) + ((local7 & 0x1) == 0 ? local24 : -local24);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!ml;)V")
	public static void method7438(@OriginalArg(1) Class213 arg0) {
		Static54.aClass213_1 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7439(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static564.method7988(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static564.method7988(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local49);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static430.method839(local75)) {
				@Pc(83) char local83 = Static157.method6330(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}
}
