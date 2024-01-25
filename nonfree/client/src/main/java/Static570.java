import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public static int anInt9983;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "[I")
	public static final int[] anIntArray536 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "[I")
	public static final int[] anIntArray537 = new int[14];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method8150() {
		Static545.method7901();
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(FIFF)I")
	public static int method8151(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(20) float local20 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(29) float local29 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(38) float local38 = arg2 < 0.0F ? -arg2 : arg2;
		if (local29 > local20 && local38 < local29) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local20 < local38 && local38 > local29) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z")
	public static boolean method8152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
