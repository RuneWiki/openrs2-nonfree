import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!s", name = "m", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	public static int anInt6203;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public static int anInt6205;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
	public static final int[] anIntArray381 = new int[256];

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_154 = new Class163(39, 15);

	@OriginalMember(owner = "client!s", name = "p", descriptor = "S")
	public static short aShort89 = 205;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IJ)V")
	public static void method5111(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static370.anInt6269;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (Static43.anInt5650 != local11) {
			local23 = local11 - Static43.anInt5650;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 <= 0) {
				if (local31 == 0) {
					local31 = -1;
				} else if (local31 < local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = 1;
			} else if (local23 < local31) {
				local31 = local23;
			}
			Static43.anInt5650 += local31;
		}
		@Pc(71) int local71 = Static180.anInt3334;
		if (!Static39.aClass79_Sub1_1.aBoolean160) {
			Static275.aFloat61 += (float) arg0 * Static313.aFloat87 / 40.0F * 8.0F;
			Static19.aFloat6 += Static292.aFloat84 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local71 != Static32.anInt603) {
			local23 = local71 - Static32.anInt603;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local23 < local31) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local31 < local23) {
				local31 = local23;
			}
			Static32.anInt603 += local31;
		}
		Static252.method3554();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method5112() {
		if (Static39.aClass79_Sub1_1.method1948(Static402.anInt6656) || Static436.anInt7298 == Static276.anInt4606) {
			Static279.method3851(Static413.aClass167_11);
			if (Static258.anInt4313 != Static276.anInt4606) {
				Static53.method998();
			}
		} else {
			Static251.method5279(Static149.anInt2745, 10, Static37.anInt629, false);
		}
	}
}
