import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!tb;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!pu;")
	public static Class50 aClass50_26;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public static int anInt6497 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5415(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				@Pc(71) char local71 = Static384.aCharArray6[(int) (local57 - arg0 * 37L)];
				if (local71 == '_') {
					@Pc(79) int local79 = local54.length() - 1;
					local71 = ' ';
					local54.setCharAt(local79, Character.toUpperCase(local54.charAt(local79)));
				}
				local54.append(local71);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}
}
