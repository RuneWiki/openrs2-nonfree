import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	public static int anInt4053;

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_64 = new Class186(23, 7);

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_65 = new Class186(37, -2);

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_66 = new Class186(107, -2);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method3704(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static220.method3379(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local37);
			return Static202.method3187(arg0, local45);
		}
	}
}
