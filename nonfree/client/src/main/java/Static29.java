import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bda", name = "w", descriptor = "Lclient!fl;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
	public static int anInt524 = 0;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method431(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static392.method5808(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(36) int local36 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(39) int local39;
			do {
				local39 = arg1.nextInt();
			} while (local36 <= local39);
			return Static409.method1599(arg0, local39);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
	public static boolean method432() {
		if (Static465.aBoolean538) {
			try {
				Static587.method3349(Static189.anApplet4, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}
