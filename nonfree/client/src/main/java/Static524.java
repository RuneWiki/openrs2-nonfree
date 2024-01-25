import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "[Lclient!s;")
	public static Class96[] aClass96Array2;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!qp;")
	public static Class304 aClass304_2;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static int anInt8592 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZII)Z")
	public static boolean method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FIFF)I")
	public static int method7531(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(13) float local13 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(24) float local24 = arg0 < (float) 0 ? -arg0 : arg0;
		@Pc(34) float local34 = arg2 < 0.0F ? -arg2 : arg2;
		if (local13 < local24 && local24 > local34) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local34 > local13 && local24 < local34) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
