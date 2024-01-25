import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_10 = new Class261(1);

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_73 = new Class230(37, 7);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIB)I")
	public static int method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)Z")
	public static boolean method6127() {
		return Static361.aBoolean607;
	}
}
