import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "[S")
	public static short[] aShortArray130 = new short[256];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method8268(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			@Pc(38) long local38 = arg0;
			while (local38 != 0L) {
				local38 /= 37L;
				local36++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local55.append(Static144.aCharArray4[(int) (local58 - arg0 * 37L)]);
			}
			return local55.reverse().toString();
		}
	}
}
