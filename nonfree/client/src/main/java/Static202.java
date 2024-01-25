import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt3188;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)I")
	public static int method2894(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJ)V")
	public static void method2895(@OriginalArg(1) long arg0) {
		@Pc(14) int local14 = Static602.anInt9811;
		@Pc(25) int local25;
		@Pc(33) int local33;
		if (local14 != Static410.anInt7502) {
			local25 = local14 - Static410.anInt7502;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local25 < local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local25 > local33) {
				local33 = local25;
			}
			Static410.anInt7502 += local33;
		}
		@Pc(72) int local72 = Static349.anInt6751;
		Static401.aFloat165 += (float) arg0 * Static620.aFloat208 / 40.0F * 8.0F;
		if (Static528.anInt9022 != local72) {
			local25 = local72 - Static528.anInt9022;
			local33 = (int) (arg0 * (long) local25 / 320L);
			if (local25 > 0) {
				if (local33 == 0) {
					local33 = 1;
				} else if (local25 < local33) {
					local33 = local25;
				}
			} else if (local33 == 0) {
				local33 = -1;
			} else if (local25 > local33) {
				local33 = local25;
			}
			Static528.anInt9022 += local33;
		}
		Static620.aFloat209 += (float) arg0 * Static83.aFloat69 / 40.0F * 8.0F;
		Static492.method6922();
	}
}
