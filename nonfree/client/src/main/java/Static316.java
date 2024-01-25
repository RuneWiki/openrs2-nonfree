import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method4556(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static177.method2498(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local42 <= local45);
			return Static340.method5004(local45, arg1);
		}
	}
}
