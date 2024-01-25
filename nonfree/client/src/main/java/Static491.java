import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "[I")
	public static final int[] anIntArray684 = new int[4096];

	@OriginalMember(owner = "client!qia", name = "h", descriptor = "Z")
	public static final boolean aBoolean614 = false;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method7085(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(51) StringBuffer local51 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static138.aCharArray2[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local51.length() - 1;
					local68 = ' ';
					local51.setCharAt(local78, Character.toUpperCase(local51.charAt(local78)));
				}
				local51.append(local68);
			}
			local51.reverse();
			local51.setCharAt(0, Character.toUpperCase(local51.charAt(0)));
			return local51.toString();
		}
	}
}
