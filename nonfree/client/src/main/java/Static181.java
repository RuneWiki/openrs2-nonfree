import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!tf;")
	public static Class322 aClass322_69;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Lclient!tf;")
	public static Class322 aClass322_70;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Lclient!fg;")
	public static Class96 aClass96_3;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZI)V")
	public static void method3119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static521.anInt8383) {
			Static73.anIntArray76 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static73.anIntArray76[local13] = (local13 << 12) / arg0;
			}
			Static521.anInt8383 = arg0;
			Static296.anInt5049 = arg0 - 1;
			Static317.anInt5421 = arg0 * 32;
		}
		if (Static522.anInt8394 == arg1) {
			return;
		}
		if (Static521.anInt8383 == arg1) {
			Static525.anIntArray553 = Static73.anIntArray76;
		} else {
			Static525.anIntArray553 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static525.anIntArray553[local13] = (local13 << 12) / arg1;
			}
		}
		Static522.anInt8394 = arg1;
		Static68.anInt1579 = arg1 - 1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)I")
	public static int method3120(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
