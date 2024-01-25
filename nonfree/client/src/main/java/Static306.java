import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_125 = new Class209(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	public static void method4340(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static131.anInt2821 - Static61.anInt1366;
		if (local7 >= 100) {
			Static159.anInt3195 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static287.aFloat74;
		if (local23 < Static4.anInt120 >> 8) {
			local23 = Static4.anInt120 >> 8;
		}
		if (Static129.aBooleanArray15[4] && Static22.anIntArray48[4] + 128 > local23) {
			local23 = Static22.anIntArray48[4] + 128;
		}
		@Pc(64) int local64 = (int) Static202.aFloat62 + Static279.anInt5093 & 0x3FFF;
		Static1.method703((local23 >> 3) * 3 + 600 << 0, Static335.anInt941, Static85.method1695(Static383.anInt6436, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119) - 50, local23, arg0, local64, Static290.anInt5208);
		@Pc(109) float local109 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static23.anInt567 = (int) ((float) Static340.anInt5848 + (float) (Static23.anInt567 - Static340.anInt5848) * local109);
		Static355.anInt6031 = (int) ((float) Static184.anInt3598 + (float) (Static355.anInt6031 - Static184.anInt3598) * local109);
		Static119.anInt2680 = (int) ((float) Static67.anInt1492 + (float) (Static119.anInt2680 - Static67.anInt1492) * local109);
		Static364.anInt6270 = (int) ((float) (Static364.anInt6270 - Static203.anInt4634) * local109 + (float) Static203.anInt4634);
		@Pc(160) int local160 = Static140.anInt2975 - Static363.anInt6254;
		if (local160 > 8192) {
			local160 -= 16384;
		} else if (local160 < -8192) {
			local160 += 16384;
		}
		Static140.anInt2975 = (int) ((float) Static363.anInt6254 + local109 * (float) local160);
		Static140.anInt2975 &= 0x3FFF;
	}
}
