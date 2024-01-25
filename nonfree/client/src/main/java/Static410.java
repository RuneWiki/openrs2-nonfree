import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
	public static int anInt7034;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "Z")
	public static boolean aBoolean528 = false;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "[I")
	public static final int[] anIntArray437 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5910(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static596.aCharArray19[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(76) int local76 = local50.length() - 1;
					local50.setCharAt(local76, Character.toUpperCase(local50.charAt(local76)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}
}
