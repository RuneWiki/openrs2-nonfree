import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt8685 = 0;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "F")
	public static float aFloat185 = 1.0F;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!gba;III)V")
	public static void method7139(@OriginalArg(0) Class115 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static86.anInt2258 = arg2;
		Static51.aClass115_1 = arg0;
		Static149.anInt3333 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method7140() {
		Static249.aClass66_9.ha(((float) Static189.aClass4_Sub2_Sub1_1.anInt9299 * 0.1F + 0.7F) * Static460.aFloat157);
		Static249.aClass66_9.YA(Static32.anInt606, Static518.aFloat190, Static138.aFloat194, (float) (Static572.anInt9516 << 2), (float) (Static41.anInt805 << 2), (float) (Static358.anInt6226 << 2));
		Static249.aClass66_9.method6803(Static117.aClass75_1);
	}
}
