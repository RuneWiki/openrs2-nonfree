import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public static int anInt382;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public static int anInt385 = -1;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public static int anInt387 = 0;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	public static int anInt400 = -2;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public static void method359() {
		if (Static326.aClass34_2 != null) {
			Static326.aClass34_2.method5832();
		}
		if (Static292.aClass34_1 != null) {
			Static292.aClass34_1.method5832();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method368(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static206.method3707(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local42 >= local34);
			return Static167.method3291(arg0, local42);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!dp;Lclient!dp;)V")
	public static void method370(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		Static243.aClass53_112 = arg0;
		Static124.aClass53_69 = arg1;
	}
}
