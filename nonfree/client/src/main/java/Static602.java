import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "B")
	public static byte aByte133;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString119;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "B")
	public static byte aByte134 = -6;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_6 = new Class7();

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZ)V")
	public static void method8011(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static621.anInt9665 - Static466.anInt7968;
		if (local8 >= 100) {
			Static378.anInt6662 = 1;
			Static18.anInt682 = -1;
			Static65.anInt1581 = -1;
			return;
		}
		@Pc(25) int local25 = (int) Static461.aFloat178;
		if (local25 < Static559.anInt9018 >> 8) {
			local25 = Static559.anInt9018 >> 8;
		}
		if (Static115.aBooleanArray9[4] && Static421.anIntArray447[4] + 128 > local25) {
			local25 = Static421.anIntArray447[4] + 128;
		}
		@Pc(66) int local66 = Static550.anInt8913 + (int) Static204.aFloat82 & 0x3FFF;
		Static388.method5656(arg0, Static647.anInt9959, Static429.anInt7552, local66, (local25 >> 3) * 3 + 600 << 2, local25, Static194.method5133(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109, Static576.anInt9136) - 200);
		@Pc(110) float local110 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static97.anInt2082 = (int) ((float) Static12.anInt158 + (float) (Static97.anInt2082 - Static12.anInt158) * local110);
		Static265.anInt9363 = (int) ((float) Static254.anInt4806 + local110 * (float) (Static265.anInt9363 - Static254.anInt4806));
		Static118.anInt2323 = (int) ((float) Static326.anInt6046 + (float) (Static118.anInt2323 - Static326.anInt6046) * local110);
		Static663.anInt10236 = (int) ((float) Static134.anInt2494 + local110 * (float) (Static663.anInt10236 - Static134.anInt2494));
		@Pc(162) int local162 = Static206.anInt3821 - Static506.anInt8471;
		if (local162 > 8192) {
			local162 -= 16384;
		} else if (local162 < -8192) {
			local162 += 16384;
		}
		Static206.anInt3821 = (int) ((float) local162 * local110 + (float) Static506.anInt8471);
		Static206.anInt3821 &= 0x3FFF;
	}
}
