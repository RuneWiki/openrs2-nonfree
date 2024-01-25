import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
	public static int anInt7142;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method6053(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local49.append(Static527.aCharArray11[(int) (local52 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}
}
