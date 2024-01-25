import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!pr;")
	public static Class261 aClass261_1;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!ri;")
	public static Class284 aClass284_147;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method6954(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static172.aCharArray3[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6956(@OriginalArg(1) String arg0) {
		return Static529.method7268(arg0);
	}
}
