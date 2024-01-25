import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "F")
	public static float aFloat29 = 0.0F;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	public static int anInt1458 = 500;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[B")
	public static final byte[] aByteArray21 = new byte[520];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public static void method1418() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static156.anInt3120 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BJ)V")
	public static void method1420(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static339.anInt6426;
		@Pc(9) int local9 = Static230.anInt4531;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (Static140.anInt2779 != local7) {
			local21 = local7 - Static140.anInt2779;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local21 > local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local29 > local21) {
				local29 = local21;
			}
			Static140.anInt2779 += local29;
		}
		if (!Static102.aBoolean179) {
			Static233.aFloat86 += aFloat29 * (float) arg0 / 40.0F * 8.0F;
			Static304.aFloat110 += (float) arg0 * Static302.aFloat90 / 40.0F * 8.0F;
		}
		if (local9 != Static81.anInt1607) {
			local21 = local9 - Static81.anInt1607;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static81.anInt1607 += local29;
		}
		Static59.method1258();
	}
}
