import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JZ)V")
	public static void method5659(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static208.anInt3482 + Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833;
		@Pc(15) int local15 = Static404.anInt6612 + Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835;
		if (Static133.anInt2393 - local10 < -500 || Static133.anInt2393 - local10 > 500 || Static153.anInt2665 - local15 < -500 || Static153.anInt2665 - local15 > 500) {
			Static133.anInt2393 = local10;
			Static153.anInt2665 = local15;
		}
		@Pc(56) int local56;
		@Pc(64) int local64;
		if (local10 != Static133.anInt2393) {
			local56 = local10 - Static133.anInt2393;
			local64 = (int) ((long) local56 * arg0 / 320L);
			if (local56 > 0) {
				if (local64 == 0) {
					local64 = 1;
				} else if (local64 > local56) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = -1;
			} else if (local64 < local56) {
				local64 = local56;
			}
			Static133.anInt2393 += local64;
		}
		if (!Static2.aClass148_Sub1_1.aBoolean245) {
			Static332.aFloat80 += Static371.aFloat96 * (float) arg0 / 6.0F;
			Static113.aFloat19 += Static126.aFloat5 * (float) arg0 / 6.0F;
		}
		if (local15 != Static153.anInt2665) {
			local56 = local15 - Static153.anInt2665;
			local64 = (int) (arg0 * (long) local56 / 320L);
			if (local56 <= 0) {
				if (local64 == 0) {
					local64 = -1;
				} else if (local64 < local56) {
					local64 = local56;
				}
			} else if (local64 == 0) {
				local64 = 1;
			} else if (local64 > local56) {
				local64 = local56;
			}
			Static153.anInt2665 += local64;
		}
		Static442.method5596();
	}
}
