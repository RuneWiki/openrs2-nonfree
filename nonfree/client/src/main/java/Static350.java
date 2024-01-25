import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	public static int anInt6210;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
	public static int method5216(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg2.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(23) char local23 = 0;
		@Pc(25) char local25 = 0;
		while (local6 > local11 - local23 || local9 > local13 - local25) {
			if (local6 <= local11 - local23) {
				return -1;
			}
			if (local9 <= local13 - local25) {
				return 1;
			}
			@Pc(68) char local68;
			if (local23 == '\u0000') {
				local68 = arg0.charAt(local11++);
			} else {
				local68 = local23;
			}
			@Pc(77) char local77;
			if (local25 == '\u0000') {
				local77 = arg2.charAt(local13++);
			} else {
				local77 = local25;
			}
			local23 = Static393.method5723(local68);
			local25 = Static393.method5723(local77);
			local68 = Static602.method8224(local68, arg1);
			local77 = Static602.method8224(local77, arg1);
			if (local77 != local68 && Character.toUpperCase(local68) != Character.toUpperCase(local77)) {
				local68 = Character.toLowerCase(local68);
				local77 = Character.toLowerCase(local77);
				if (local68 != local77) {
					return Static247.method3507(local68, arg1) - Static247.method3507(local77, arg1);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local6, local9);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg1 == 2) {
				local11 = local6 - local140 - 1;
				local13 = local9 - local140 - 1;
			} else {
				local13 = local140;
				local11 = local140;
			}
			@Pc(166) char local166 = arg0.charAt(local11);
			@Pc(170) char local170 = arg2.charAt(local13);
			if (local170 != local166 && Character.toUpperCase(local166) != Character.toUpperCase(local170)) {
				local166 = Character.toLowerCase(local166);
				local170 = Character.toLowerCase(local170);
				if (local170 != local166) {
					return Static247.method3507(local166, arg1) - Static247.method3507(local170, arg1);
				}
			}
		}
		@Pc(214) int local214 = local6 - local9;
		if (local214 != 0) {
			return local214;
		}
		for (@Pc(220) int local220 = 0; local220 < local138; local220++) {
			@Pc(225) char local225 = arg0.charAt(local220);
			@Pc(229) char local229 = arg2.charAt(local220);
			if (local225 != local229) {
				return Static247.method3507(local225, arg1) - Static247.method3507(local229, arg1);
			}
		}
		return 0;
	}
}
