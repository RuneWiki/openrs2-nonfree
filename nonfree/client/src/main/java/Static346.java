import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!kg;")
	public static Class135 aClass135_3;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!vg;")
	public static Class250 aClass250_11;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	public static int anInt5656;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static357.aByteArrayArrayArray11[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(JI)V")
	public static void method4404(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static446.anInt7388;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local7 != Static327.anInt5372) {
			local21 = local7 - Static327.anInt5372;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local21 < local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local29 < local21) {
				local29 = local21;
			}
			Static327.anInt5372 += local29;
		}
		@Pc(67) int local67 = Static317.anInt5271;
		if (!Static336.aClass106_Sub1_1.aBoolean470) {
			Static95.aFloat27 += (float) arg0 * Static19.aFloat3 / 40.0F * 8.0F;
			Static278.aFloat52 += (float) arg0 * Static230.aFloat90 / 40.0F * 8.0F;
		}
		if (Static155.anInt2606 != local67) {
			local21 = local67 - Static155.anInt2606;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local29 > local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local21 > local29) {
				local29 = local21;
			}
			Static155.anInt2606 += local29;
		}
		Static430.method5421();
	}
}
