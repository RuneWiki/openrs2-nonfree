import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt40;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	public static final int[] anIntArray3 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z")
	public static boolean method56(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method59() {
		Static534.method7063(Static280.aClass316_63);
		Static340.aClass6_Sub12_Sub2_1.method6047(Static278.method4179());
		Static340.aClass6_Sub12_Sub2_1.method6032(Static367.anInt6719);
		Static340.aClass6_Sub12_Sub2_1.method6032(Static154.anInt2867);
		Static340.aClass6_Sub12_Sub2_1.method6047(Static58.aClass6_Sub17_Sub1_1.anInt9282);
	}
}
