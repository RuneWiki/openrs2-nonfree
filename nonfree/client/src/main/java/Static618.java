import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!va", name = "C", descriptor = "[I")
	public static final int[] anIntArray567 = new int[5];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIII)I")
	public static int method8281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg2 : arg0;
		@Pc(42) int local42 = local12 < 4 ? arg2 : local12 == 12 || local12 == 14 ? arg0 : arg1;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local42 : -local42);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method8284(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) long local30 = arg0; local30 != 0L; local30 /= 37L) {
				local28++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local47.append(Static278.aCharArray5[(int) (local50 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!eca;I)I")
	public static int method8286(@OriginalArg(0) Class90 arg0) {
		if (arg0 == Static663.aClass90_4) {
			return 5890;
		} else if (arg0 == Static619.aClass90_3) {
			return 34167;
		} else if (Static85.aClass90_2 == arg0) {
			return 34168;
		} else if (arg0 == Static85.aClass90_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
