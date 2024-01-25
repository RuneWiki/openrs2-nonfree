import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public static int anInt8243;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public static int anInt8251;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public static int anInt8244 = -2;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
	public static final int anInt8250 = 1338;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBII)V")
	public static void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static11.anInt9803 <= arg3 && arg3 <= Static149.anInt2949) {
			@Pc(20) int local20 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1);
			@Pc(26) int local26 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg2);
			Static377.method6072(arg3, arg0, local20, local26);
		}
	}
}
