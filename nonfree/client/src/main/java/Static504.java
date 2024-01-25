import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public static int anInt8519;

	@OriginalMember(owner = "client!uw", name = "E", descriptor = "[I")
	public static final int[] anIntArray772 = new int[500];

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(JB)V")
	public static void method6971(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static308.anInt5706;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (local7 != Static81.anInt1467) {
			local23 = local7 - Static81.anInt1467;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local31 > local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local31 < local23) {
				local31 = local23;
			}
			Static81.anInt1467 += local31;
		}
		@Pc(73) int local73 = Static88.anInt1782;
		if (local73 != Static69.anInt1327) {
			local23 = local73 - Static69.anInt1327;
			local31 = (int) ((long) local23 * arg0 / 320L);
			if (local23 > 0) {
				if (local31 == 0) {
					local31 = 1;
				} else if (local31 > local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = -1;
			} else if (local23 > local31) {
				local31 = local23;
			}
			Static69.anInt1327 += local31;
		}
		if (!Static544.aClass1_Sub22_Sub1_1.aBoolean389) {
			Static404.aFloat156 += Static71.aFloat15 * (float) arg0 / 40.0F * 8.0F;
			Static50.aFloat13 += (float) arg0 * Static285.aFloat109 / 40.0F * 8.0F;
		}
		Static486.method6644();
	}
}
