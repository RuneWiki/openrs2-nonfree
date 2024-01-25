import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public static int anInt233;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_1 = new Class26(30);

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "J")
	public static long aLong5 = -1L;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method173(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local29++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static215.aCharArray3[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}
}
