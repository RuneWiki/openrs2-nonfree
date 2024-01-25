import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Lclient!dn;")
	public static Class69 aClass69_58;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	public static int anInt5322 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)V")
	public static void method4891(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static445.anInt7791 - Static243.anInt4675;
		if (local7 >= 100) {
			Static170.anInt3418 = 1;
			return;
		}
		@Pc(16) int local16 = (int) Static49.aFloat29;
		if (Static243.anInt4676 >> 8 > local16) {
			local16 = Static243.anInt4676 >> 8;
		}
		if (Static174.aBooleanArray6[4] && Static412.anIntArray698[4] + 128 > local16) {
			local16 = Static412.anIntArray698[4] + 128;
		}
		@Pc(54) int local54 = (int) Static135.aFloat193 + Static379.anInt7382 & 0x3FFF;
		Static6.method374(local54, arg0, Static397.anInt6990, local16, Static508.method7754(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954, Static322.anInt6113) - 50, Static60.anInt1483, (local16 >> 3) * 3 + 600 << 0);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static276.anInt8653 = (int) (local105 * (float) (Static276.anInt8653 - Static500.anInt8795) + (float) Static500.anInt8795);
		Static321.anInt6064 = (int) (local105 * (float) (Static321.anInt6064 - Static362.anInt7982) + (float) Static362.anInt7982);
		Static536.anInt9434 = (int) ((float) Static386.anInt8113 + (float) (Static536.anInt9434 - Static386.anInt8113) * local105);
		Static46.anInt1256 = (int) ((float) (Static46.anInt1256 - Static517.anInt9160) * local105 + (float) Static517.anInt9160);
		@Pc(156) int local156 = Static469.anInt8096 - Static364.anInt6575;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static469.anInt8096 = (int) ((float) local156 * local105 + (float) Static364.anInt6575);
		Static469.anInt8096 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I")
	public static int method4895(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static157.anIntArray266[arg0 & 0x3] : 256;
	}
}
