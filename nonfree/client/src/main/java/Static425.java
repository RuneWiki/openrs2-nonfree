import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt7123;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/util/Random;BI)I")
	public static int method5717(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static280.method3692(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(33) int local33 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(41) int local41;
			do {
				local41 = arg0.nextInt();
			} while (local33 <= local41);
			return Static318.method4135(local41, arg1);
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public static void method5718() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static72.aBooleanArray6[local7] = false;
		}
		Static97.anInt1791 = 1;
		Static320.anInt5206 = -1;
		Static432.anInt7151 = 0;
		Static366.anInt6051 = 0;
		Static171.anInt3113 = -1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method5719() {
		Static298.aClass244_27 = new Class244();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	public static int method5720(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
