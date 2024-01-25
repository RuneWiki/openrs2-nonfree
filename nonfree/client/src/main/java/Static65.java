import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_10 = new Class179(14, -1);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1318(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) long local32 = arg0; local32 != 0L; local32 /= 37L) {
				local30++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static271.aCharArray5[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}
}
