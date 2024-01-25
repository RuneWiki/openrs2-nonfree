import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
	public static int anInt2949 = 0;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "[I")
	public static final int[] anIntArray272 = new int[8];

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "[I")
	public static final int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	public static void method2618() {
		Static111.aClass154_38.method4220(5);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method2621(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static342.method5574(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(36) int local36 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local44 >= local36);
			return Static82.method1454(local44, arg1);
		}
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)V")
	public static void method2627() {
		Static317.aClass154_98.method4219();
	}
}
