import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public static int anInt2327;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public static int anInt2325 = 0;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "I")
	public static int anInt2337 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/util/Random;Z)I")
	public static int method1947(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static413.method8723(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local44 >= local41);
			return Static536.method7903(arg0, local44);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Z")
	public static boolean method1948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
