import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!tj", name = "Z", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1171 = Static231.method3737("wave2:");

	@OriginalMember(owner = "client!tj", name = "Q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1169 = aClass107_1171;

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "Lclient!ak;")
	public static Class8 aClass8_8 = new Class8(64);

	@OriginalMember(owner = "client!tj", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1170 = aClass107_1171;

	@OriginalMember(owner = "client!tj", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1172 = Static231.method3737("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Z")
	public static boolean method3282(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static106.aShortArray30[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1001;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method3285(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static153.method2510(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local41 <= local44);
			return Static26.method476(arg1, local44);
		}
	}

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
	public static void method3287() {
		Static95.aClass61_34.method1689();
	}
}
