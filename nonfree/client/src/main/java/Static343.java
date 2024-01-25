import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public static int anInt5305 = 1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_84 = new Class349(57, 3);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)I")
	public static int method4762(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0x3F;
		@Pc(19) int local19 = arg0 >> 6 & 0x3;
		if (local13 == 18) {
			if (local19 == 0) {
				return 1;
			}
			if (local19 == 1) {
				return 2;
			}
			if (local19 == 2) {
				return 4;
			}
			if (local19 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local19 == 0) {
				return 16;
			}
			if (local19 == 1) {
				return 32;
			}
			if (local19 == 2) {
				return 64;
			}
			if (local19 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
