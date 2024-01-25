import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!k", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public static final int anInt5319 = 16777215;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4760(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(42) int local42 = 0;
			for (@Pc(44) long local44 = arg0; local44 != 0L; local44 /= 37L) {
				local42++;
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local42);
			while (arg0 != 0L) {
				@Pc(70) long local70 = arg0;
				arg0 /= 37L;
				@Pc(84) char local84 = Static672.aCharArray11[(int) (local70 - arg0 * 37L)];
				if (local84 == '_') {
					@Pc(94) int local94 = local64.length() - 1;
					local84 = ' ';
					local64.setCharAt(local94, Character.toUpperCase(local64.charAt(local94)));
				}
				local64.append(local84);
			}
			local64.reverse();
			local64.setCharAt(0, Character.toUpperCase(local64.charAt(0)));
			return local64.toString();
		}
	}
}
