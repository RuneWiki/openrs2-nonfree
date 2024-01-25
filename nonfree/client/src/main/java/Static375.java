import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mj", name = "ob", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!mj", name = "Qd", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!mj", name = "md", descriptor = "Lclient!si;")
	public static final Class335 aClass335_19 = new Class335(512);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)V")
	public static void method5845(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 + Static209.anInt4333;
		@Pc(16) int local16 = Static483.anInt8677 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
		if (Static461.anInt8253 - local11 < -2000 || Static461.anInt8253 - local11 > 2000 || Static386.anInt7301 - local16 < -2000 || Static386.anInt7301 - local16 > 2000) {
			Static386.anInt7301 = local16;
			Static461.anInt8253 = local11;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		if (Static461.anInt8253 != local11) {
			local54 = local11 - Static461.anInt8253;
			local62 = (int) (arg0 * (long) local54 / 320L);
			if (local54 > 0) {
				if (local62 == 0) {
					local62 = 1;
				} else if (local62 > local54) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = -1;
			} else if (local62 < local54) {
				local62 = local54;
			}
			Static461.anInt8253 += local62;
		}
		Static278.aFloat108 += Static584.aFloat89 * (float) arg0 / 6.0F;
		if (local16 != Static386.anInt7301) {
			local54 = local16 - Static386.anInt7301;
			local62 = (int) ((long) local54 * arg0 / 320L);
			if (local54 > 0) {
				if (local62 == 0) {
					local62 = 1;
				} else if (local54 < local62) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = -1;
			} else if (local62 < local54) {
				local62 = local54;
			}
			Static386.anInt7301 += local62;
		}
		Static320.aFloat118 += Static24.aFloat3 * (float) arg0 / 6.0F;
		Static27.method474();
	}
}
