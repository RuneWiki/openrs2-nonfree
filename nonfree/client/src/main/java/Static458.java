import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	public static int anInt7538 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5799(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				@Pc(71) char local71 = Static442.aCharArray11[(int) (local57 - arg0 * 37L)];
				if (local71 == '_') {
					@Pc(79) int local79 = local53.length() - 1;
					local53.setCharAt(local79, Character.toUpperCase(local53.charAt(local79)));
					local71 = ' ';
				}
				local53.append(local71);
			}
			local53.reverse();
			local53.setCharAt(0, Character.toUpperCase(local53.charAt(0)));
			return local53.toString();
		}
	}
}
