import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!sp;")
	public static final Class219 aClass219_3 = new Class219("WTQA", 2);

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
	public static int anInt4024 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IJ)V")
	public static void method3266(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = anInt4024 + Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893;
		@Pc(15) int local15 = Static323.anInt5620 + Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892;
		if (Static394.anInt6578 - local10 < -500 || Static394.anInt6578 - local10 > 500 || Static325.anInt5636 - local15 < -500 || Static325.anInt5636 - local15 > 500) {
			Static394.anInt6578 = local10;
			Static325.anInt5636 = local15;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		if (local10 != Static394.anInt6578) {
			local61 = local10 - Static394.anInt6578;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local69 > local61) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local69 < local61) {
				local69 = local61;
			}
			Static394.anInt6578 += local69;
		}
		if (!Static323.aClass50_Sub1_1.aBoolean303) {
			Static164.aFloat142 += Static50.aFloat28 * (float) arg0 / 6.0F;
			Static368.aFloat192 += (float) arg0 * Static380.aFloat195 / 6.0F;
		}
		if (local15 != Static325.anInt5636) {
			local61 = local15 - Static325.anInt5636;
			local69 = (int) ((long) local61 * arg0 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local61 < local69) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local69 < local61) {
				local69 = local61;
			}
			Static325.anInt5636 += local69;
		}
		Static269.method3855();
	}
}
