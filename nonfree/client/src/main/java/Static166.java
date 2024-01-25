import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!gk;")
	public static Class86 aClass86_3;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "Lclient!tq;")
	public static Class246 aClass246_3;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5266(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(33) long local33 = arg0;
			while (local33 != 0L) {
				local33 /= 37L;
				local31++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				@Pc(75) char local75 = Static355.aCharArray6[(int) (local61 - arg0 * 37L)];
				if (local75 == '_') {
					@Pc(83) int local83 = local57.length() - 1;
					local57.setCharAt(local83, Character.toUpperCase(local57.charAt(local83)));
					local75 = ' ';
				}
				local57.append(local75);
			}
			local57.reverse();
			local57.setCharAt(0, Character.toUpperCase(local57.charAt(0)));
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	public static void method5268() {
		Static455.anInt7776 = -1;
		Static184.anInt3729 = -1;
		Static38.anInt906 = -1;
		Static431.anInt7385 = 0;
	}
}
