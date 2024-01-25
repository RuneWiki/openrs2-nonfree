import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!is", name = "J", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!is", name = "L", descriptor = "I")
	public static volatile int anInt2646 = 0;

	@OriginalMember(owner = "client!is", name = "N", descriptor = "[I")
	public static final int[] anIntArray269 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Z")
	public static boolean method2266() {
		return Static217.anInt951 != 0 || Static305.anInt6104 >= 2;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BJ)V")
	public static void method2267(@OriginalArg(1) long arg0) {
		@Pc(15) int local15 = Static67.anInt1459;
		@Pc(27) int local27;
		@Pc(35) int local35;
		if (local15 != Static29.anInt545) {
			local27 = local15 - Static29.anInt545;
			local35 = (int) (arg0 * (long) local27 / 320L);
			if (local27 > 0) {
				if (local35 == 0) {
					local35 = 1;
				} else if (local35 > local27) {
					local35 = local27;
				}
			} else if (local35 == 0) {
				local35 = -1;
			} else if (local27 > local35) {
				local35 = local27;
			}
			Static29.anInt545 += local35;
		}
		@Pc(77) int local77 = Static18.anInt355;
		if (!Static317.aBoolean521) {
			Static318.aFloat77 += Static81.aFloat8 * (float) arg0 / 40.0F * 8.0F;
			Static143.aFloat21 += Static93.aFloat9 * (float) arg0 / 40.0F * 8.0F;
		}
		if (Static163.anInt3374 != local77) {
			local27 = local77 - Static163.anInt3374;
			local35 = (int) (arg0 * (long) local27 / 320L);
			if (local27 <= 0) {
				if (local35 == 0) {
					local35 = -1;
				} else if (local27 > local35) {
					local35 = local27;
				}
			} else if (local35 == 0) {
				local35 = 1;
			} else if (local27 < local35) {
				local35 = local27;
			}
			Static163.anInt3374 += local35;
		}
		Static340.method5645();
	}
}
