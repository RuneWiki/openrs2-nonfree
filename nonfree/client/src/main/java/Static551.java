import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public static int anInt9267;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	public static int anInt9268;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_43 = new Class280(64);

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_59 = new Class223();

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I")
	public static int method7986(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return (arg0 & 0xFF80) + local45;
		}
	}
}
