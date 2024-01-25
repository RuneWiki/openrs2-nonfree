import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fba", name = "M", descriptor = "Lclient!og;")
	public static Class215 aClass215_1;

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "Lclient!qda;")
	public static final Class243 aClass243_9 = new Class243();

	@OriginalMember(owner = "client!fba", name = "P", descriptor = "I")
	public static int anInt2665 = 0;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "(I)V")
	public static void method2251() {
		@Pc(10) int local10 = 0;
		if (Static7.aClass3_Sub15_Sub1_1 != null) {
			local10 = Static7.aClass3_Sub15_Sub1_1.method6955(Static382.anInt7091);
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (local10 == 2) {
			local29 = Static265.anInt5511 <= 800 ? Static265.anInt5511 : 800;
			Static493.anInt9484 = (Static265.anInt5511 - local29) / 2;
			local45 = Static211.anInt4645 > 600 ? 600 : Static211.anInt4645;
			Static480.anInt8652 = local29;
			Static412.anInt7547 = local45;
			Static531.anInt9232 = 0;
		} else if (local10 == 1) {
			local29 = Static265.anInt5511 <= 1024 ? Static265.anInt5511 : 1024;
			Static480.anInt8652 = local29;
			local45 = Static211.anInt4645 <= 768 ? Static211.anInt4645 : 768;
			Static493.anInt9484 = (Static265.anInt5511 - local29) / 2;
			Static531.anInt9232 = 0;
			Static412.anInt7547 = local45;
		} else {
			Static412.anInt7547 = Static211.anInt4645;
			Static531.anInt9232 = 0;
			Static480.anInt8652 = Static265.anInt5511;
			Static493.anInt9484 = 0;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BJ)V")
	public static void method2252(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 + Static410.anInt7538;
		@Pc(16) int local16 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 + Static308.anInt6011;
		if (Static8.anInt583 - local11 < -2000 || Static8.anInt583 - local11 > 2000 || Static366.anInt6836 - local16 < -2000 || Static366.anInt6836 - local16 > 2000) {
			Static366.anInt6836 = local16;
			Static8.anInt583 = local11;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		if (Static8.anInt583 != local11) {
			local53 = local11 - Static8.anInt583;
			local61 = (int) (arg0 * (long) local53 / 320L);
			if (local53 <= 0) {
				if (local61 == 0) {
					local61 = -1;
				} else if (local53 > local61) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = 1;
			} else if (local61 > local53) {
				local61 = local53;
			}
			Static8.anInt583 += local61;
		}
		if (!Static7.aClass3_Sub15_Sub1_1.aBoolean604) {
			Static343.aFloat198 += (float) arg0 * Static481.aFloat254 / 6.0F;
			Static487.aFloat258 += Static479.aFloat252 * (float) arg0 / 6.0F;
		}
		if (Static366.anInt6836 != local16) {
			local53 = local16 - Static366.anInt6836;
			local61 = (int) (arg0 * (long) local53 / 320L);
			if (local53 <= 0) {
				if (local61 == 0) {
					local61 = -1;
				} else if (local61 < local53) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = 1;
			} else if (local53 < local61) {
				local61 = local53;
			}
			Static366.anInt6836 += local61;
		}
		Static199.method3746();
	}
}
