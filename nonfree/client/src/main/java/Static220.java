import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!jc", name = "Bc", descriptor = "I")
	public static int anInt4342 = 0;

	@OriginalMember(owner = "client!jc", name = "Hc", descriptor = "I")
	public static int anInt4348 = 0;

	@OriginalMember(owner = "client!jc", name = "Jc", descriptor = "[I")
	public static int[] anIntArray429 = new int[2];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method3800(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		@Pc(39) int local39 = arg0 / 10;
		while (local39 != 0) {
			local39 /= 10;
			local35++;
		}
		@Pc(51) char[] local51 = new char[local35];
		local51[0] = '+';
		for (@Pc(65) int local65 = local35 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local69 - arg0 * 10;
			if (local79 >= 10) {
				local51[local65] = (char) (local79 + 87);
			} else {
				local51[local65] = (char) (local79 + 48);
			}
		}
		return new String(local51);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/util/Random;ZI)I")
	public static int method3801(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static535.method7411(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local37 <= local45);
			return Static328.method5051(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(Z)Z")
	public static boolean method3804() {
		return Static302.anInt5579 == 0 ? Static106.aClass1_Sub16_Sub3_1.method5244() : true;
	}
}
