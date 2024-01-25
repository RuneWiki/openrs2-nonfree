import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Lclient!pm;")
	public static final Class295 aClass295_9 = new Class295(1);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4741(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) int local33 = 0;
			@Pc(35) long local35 = arg0;
			while (local35 != 0L) {
				local35 /= 37L;
				local33++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local33);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static605.aCharArray8[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local53.length() - 1;
					local53.setCharAt(local83, Character.toUpperCase(local53.charAt(local83)));
					local73 = ' ';
				}
				local53.append(local73);
			}
			local53.reverse();
			local53.setCharAt(0, Character.toUpperCase(local53.charAt(0)));
			return local53.toString();
		}
	}
}
