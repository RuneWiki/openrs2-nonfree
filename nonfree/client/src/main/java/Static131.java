import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!fg;")
	public static final Class112 aClass112_1 = new Class112();

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lclient!dja;")
	public static Class83 method1935() {
		return new Class83(1, false);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method1936(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static197.method3300(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(48) int local48 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(51) int local51;
			do {
				local51 = arg0.nextInt();
			} while (local48 <= local51);
			return Static461.method6497(arg1, local51);
		}
	}
}
