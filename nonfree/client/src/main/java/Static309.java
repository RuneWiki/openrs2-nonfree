import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "[Lclient!hp;")
	public static Interface6[] anInterface6Array1;

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "Lclient!pj;")
	public static Class248 aClass248_46;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method4643(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static331.method5078(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(43) int local43 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(46) int local46;
			do {
				local46 = arg0.nextInt();
			} while (local46 >= local43);
			return Static294.method4417(arg1, local46);
		}
	}
}
