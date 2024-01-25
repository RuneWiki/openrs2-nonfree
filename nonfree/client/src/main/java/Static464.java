import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!to", name = "w", descriptor = "I")
	public static int anInt8379;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Lclient!hf;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public static final int anInt8376 = 0;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_83 = new Class243(65, 4);

	@OriginalMember(owner = "client!to", name = "u", descriptor = "J")
	public static long aLong209 = 0L;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7004(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static386.aCharArray9[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7008(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static23.method572("\n", arg0, "%0a"));
	}
}
