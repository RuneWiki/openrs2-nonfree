import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public static int anInt5225;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "Z")
	public static boolean aBoolean443;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
	public static int anInt5237 = 0;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public static void method4346() {
		if (Static279.anInt5648 == 5) {
			Static279.anInt5648 = 6;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	public static int method4347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static87.anIntArray196[arg0 & 0x3] : Static193.anIntArray355[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BJ)V")
	public static void method4348(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static2.anInt5073;
		@Pc(14) int local14 = Static331.anInt6556;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (Static294.anInt3998 != local7) {
			local26 = local7 - Static294.anInt3998;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local26 > local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local26 < local34) {
				local34 = local26;
			}
			Static294.anInt3998 += local34;
		}
		if (!Static166.aBoolean307) {
			Static138.aFloat35 += Static229.aFloat44 * (float) arg0 / 40.0F * 8.0F;
			Static174.aFloat39 += Static203.aFloat41 * (float) arg0 / 40.0F * 8.0F;
		}
		if (Static5.anInt133 != local14) {
			local26 = local14 - Static5.anInt133;
			local34 = (int) (arg0 * (long) local26 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local34 < local26) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local34 > local26) {
				local34 = local26;
			}
			Static5.anInt133 += local34;
		}
		Static251.method4339();
	}
}
