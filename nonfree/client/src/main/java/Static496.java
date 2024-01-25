import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!tw;")
	public static final Class339 aClass339_3 = new Class339(true);

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
	public static int anInt8290 = 0;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
	public static int anInt8292 = -1;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIBI)I")
	public static int method7145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}
}
