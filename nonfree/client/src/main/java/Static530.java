import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "Lclient!gp;")
	public static Class117 aClass117_226;

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
	public static int anInt8939;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "Lclient!haa;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_71 = new Class288(8);

	@OriginalMember(owner = "client!wba", name = "r", descriptor = "[I")
	public static final int[] anIntArray683 = new int[5];

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)V")
	public static void method7240(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static481.anInt8318 - Static167.anInt3381;
		if (local7 >= 100) {
			Static166.anInt3343 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static535.aFloat364;
		if (local18 < Static281.anInt5474 >> 8) {
			local18 = Static281.anInt5474 >> 8;
		}
		if (Static494.aBooleanArray35[4] && Static374.anIntArray512[4] + 128 > local18) {
			local18 = Static374.anIntArray512[4] + 128;
		}
		@Pc(64) int local64 = (int) Static476.aFloat339 + Static297.anInt7034 & 0x3FFF;
		Static386.method3041(Static387.anInt7017, arg0, local64, Static191.method5464(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493, Static367.anInt6860) - 50, Static66.anInt1272, (local18 >> 3) * 3 + 600 << 0, local18);
		@Pc(109) float local109 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static180.anInt3500 = (int) (local109 * (float) (Static180.anInt3500 - Static364.anInt6808) + (float) Static364.anInt6808);
		Static364.anInt6817 = (int) ((float) (Static364.anInt6817 - Static305.anInt6031) * local109 + (float) Static305.anInt6031);
		Static182.anInt3520 = (int) ((float) (Static182.anInt3520 - Static62.anInt8330) * local109 + (float) Static62.anInt8330);
		Static367.anInt6861 = (int) ((float) Static106.anInt2331 + local109 * (float) (Static367.anInt6861 - Static106.anInt2331));
		@Pc(161) int local161 = Static141.anInt2910 - Static206.anInt5076;
		if (local161 > 8192) {
			local161 -= 16384;
		} else if (local161 < -8192) {
			local161 += 16384;
		}
		Static141.anInt2910 = (int) ((float) Static206.anInt5076 + (float) local161 * local109);
		Static141.anInt2910 &= 0x3FFF;
	}
}
