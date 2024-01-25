import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	public static int anInt4704;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_6 = new Class61(0, 2, 2, 1);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V")
	public static void method3712(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static253.anInt4787 - Static215.anInt4112;
		if (local8 >= 100) {
			Static161.anInt3316 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static180.aFloat27;
		if (local19 < Static62.anInt1594 >> 8) {
			local19 = Static62.anInt1594 >> 8;
		}
		if (Static384.aBooleanArray20[4] && local19 < Static365.anIntArray398[4] + 128) {
			local19 = Static365.anIntArray398[4] + 128;
		}
		@Pc(56) int local56 = Static179.anInt5783 + (int) Static252.aFloat47 & 0x3FFF;
		Static157.method2539(local19, local56, (local19 >> 3) * 3 + 600 << 0, Static215.anInt4111, arg0, Static35.anInt1000, Static231.method3482(Static6.anInt93, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321) - 50);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static265.anInt5008 = (int) (local107 * (float) (Static265.anInt5008 - Static24.anInt847) + (float) Static24.anInt847);
		Static298.anInt5734 = (int) ((float) Static119.anInt2572 + local107 * (float) (Static298.anInt5734 - Static119.anInt2572));
		Static439.anInt7400 = (int) ((float) (Static439.anInt7400 - Static342.anInt5806) * local107 + (float) Static342.anInt5806);
		Static276.anInt5105 = (int) ((float) Static318.anInt6962 + local107 * (float) (Static276.anInt5105 - Static318.anInt6962));
		@Pc(158) int local158 = Static445.anInt7532 - Static313.anInt5549;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static445.anInt7532 = (int) ((float) local158 * local107 + (float) Static313.anInt5549);
		Static445.anInt7532 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3714(@OriginalArg(1) String arg0) {
		return Static354.method4718(arg0, 10);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!bu;)V")
	public static void method3715(@OriginalArg(1) Class32 arg0) {
		Static19.aClass32_8 = arg0;
	}
}
