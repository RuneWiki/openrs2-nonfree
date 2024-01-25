import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!wk;")
	public static Class317 aClass317_1;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!qg;")
	public static Class252 aClass252_1;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt2634 = 16777215;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "J")
	public static long aLong65 = 0L;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_23 = new Class77(12, 8);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method2345(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static78.method1703(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local42 <= local45);
			return Static403.method6324(arg1, local45);
		}
	}
}
