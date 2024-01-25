import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_53 = new Class181(63, 0);

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
	public static int anInt6779 = 0;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5968(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static282.aCharArray3[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}
}
