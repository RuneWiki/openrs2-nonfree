import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "Lclient!wia;")
	public static Class386 aClass386_133;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method8803(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static243.aCharArray2[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}
}
