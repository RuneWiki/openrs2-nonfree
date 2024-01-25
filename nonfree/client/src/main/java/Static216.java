import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIIIII)V")
	public static void method7126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static38.anInt1413 = arg3;
		Static187.anInt4085 = arg4;
		Static458.anInt8218 = arg0;
		Static526.anInt9182 = arg2;
		Static18.anInt621 = arg1;
		if (Static38.anInt1413 >= 100) {
			@Pc(26) int local26 = Static18.anInt621 * 512 + 256;
			@Pc(32) int local32 = Static187.anInt4085 * 512 + 256;
			@Pc(41) int local41 = Static150.method2982(Static86.anInt10575, local32, local26) - Static526.anInt9182;
			@Pc(46) int local46 = local26 - Static184.anInt4048;
			@Pc(51) int local51 = local41 - Static149.anInt3489;
			@Pc(56) int local56 = local32 - Static259.anInt6990;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local46 * local46 + local56 * local56));
			Static404.anInt4286 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static349.anInt6848 = (int) (Math.atan2((double) local46, (double) local56) * -2607.5945876176133D) & 0x3FFF;
			Static535.anInt9282 = 0;
			if (Static404.anInt4286 < 1024) {
				Static404.anInt4286 = 1024;
			}
			if (Static404.anInt4286 > 3072) {
				Static404.anInt4286 = 3072;
			}
		}
		Static554.anInt9497 = 2;
		Static594.anInt10048 = -1;
		Static214.anInt4587 = -1;
	}
}
