import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Lclient!bo;")
	public static Class35 aClass35_6;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZI)Z")
	public static boolean method6616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static252.method4228(arg1, arg0) || Static583.method7895(arg1, arg0);
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V")
	public static void method6619() {
		if (Static81.anInt9842 == 6) {
			Static81.anInt9842 = 7;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIB)Z")
	public static boolean method6622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(FIFF)I")
	public static int method6625(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 < local26 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
