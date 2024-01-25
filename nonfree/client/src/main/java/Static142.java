import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_15 = new Class340(128, 4);

	@OriginalMember(owner = "client!ek", name = "R", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_24 = new Class305(38, -1);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2492(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				local50.append(Static384.aCharArray6[(int) (local53 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	public static int method2501() {
		if ((double) Static330.aFloat9 == 3.0D) {
			return 37;
		} else if ((double) Static330.aFloat9 == 4.0D) {
			return 50;
		} else if ((double) Static330.aFloat9 == 6.0D) {
			return 75;
		} else if ((double) Static330.aFloat9 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
