import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	public static int anInt9079;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "F")
	public static float aFloat206;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_197 = new Class151(78, 0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public static void method7765() {
		if (!Static677.aBoolean804) {
			Static110.aFloat39 += (-Static110.aFloat39 - 24.0F) / 2.0F;
			Static677.aBoolean804 = true;
			Static123.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
	public static int method7766(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
