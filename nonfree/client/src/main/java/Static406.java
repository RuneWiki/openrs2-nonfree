import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_107 = new Class25(9, 7);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!gf;B)Z")
	public static boolean method5559(@OriginalArg(0) Class94 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean162) {
			return false;
		} else if (!arg0.method2000(Static36.anInterface4_2)) {
			return false;
		} else if (Static90.aClass137_9.method3175((long) arg0.anInt2191) == null) {
			return Static180.aClass137_20.method3175((long) arg0.anInt2178) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IJ)V")
	public static void method5561(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static375.anInt6234;
		@Pc(9) int local9 = Static45.anInt923;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (Static153.anInt2718 != local7) {
			local21 = local7 - Static153.anInt2718;
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
			Static153.anInt2718 += local29;
		}
		if (!Static8.aClass173_Sub1_1.aBoolean311) {
			Static397.aFloat99 += Static201.aFloat66 * (float) arg0 / 40.0F * 8.0F;
			Static367.aFloat104 += (float) arg0 * Static74.aFloat6 / 40.0F * 8.0F;
		}
		if (Static237.anInt4066 != local9) {
			local21 = local9 - Static237.anInt4066;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local21 > local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static237.anInt4066 += local29;
		}
		Static167.method2725();
	}
}
