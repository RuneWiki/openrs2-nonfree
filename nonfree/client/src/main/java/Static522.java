import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sia", name = "o", descriptor = "Lclient!la;")
	public static Class196 aClass196_109;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method7729(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static323.method5278(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local42 >= local39);
			return Static583.method8236(local42, arg1);
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7730(@OriginalArg(0) String arg0) {
		return Static500.method7397(arg0, jca.class);
	}
}
