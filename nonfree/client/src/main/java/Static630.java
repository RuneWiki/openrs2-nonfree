import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "Lclient!ae;")
	public static Class8 aClass8_97;

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	public static int anInt6216;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "[I")
	public static final int[] anIntArray366 = new int[1000];

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
	public static int anInt6211 = 0;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_87 = new Class289(86, 7);

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "[Lclient!g;")
	public static final Class6_Sub4_Sub4[] aClass6_Sub4_Sub4Array4 = new Class6_Sub4_Sub4[14];

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	public static int anInt6215 = 0;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "[Lclient!nf;")
	public static final Class238[] aClass238Array3 = new Class238[37];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
	public static void method5247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static367.aClass132_7 == null) {
			return;
		}
		@Pc(10) int local10 = Static519.anInt8647;
		@Pc(12) int local12 = Static415.anInt7233;
		Static433.method6413(arg1, arg0);
		if (Static353.anInt6019 == 0) {
			Static675.anInterface16_1 = null;
			Static675.anInterface16_1 = Static367.aClass132_7.method7463(Static367.aClass132_7.method7436(Static457.anInt7638, Static554.anInt9288), Static367.aClass132_7.method7459(Static457.anInt7638, Static554.anInt9288));
		} else if (Static353.anInt6019 == 1 && (Static155.anInterface16Array1 == null || local10 != Static519.anInt8647 || Static415.anInt7233 != local12)) {
			Static155.anInterface16Array1 = new Interface16[Static415.anInt7233 * Static519.anInt8647];
			for (@Pc(61) int local61 = 0; local61 < Static155.anInterface16Array1.length; local61++) {
				Static155.anInterface16Array1[local61] = Static367.aClass132_7.method7463(Static367.aClass132_7.method7436(Static208.anInt3594, Static263.anInt4574), Static367.aClass132_7.method7459(Static208.anInt3594, Static263.anInt4574));
			}
			Static309.anIntArray138 = new int[Static415.anInt7233 * Static519.anInt8647];
			Static281.anInt4834 = 1;
		}
		Static119.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)I")
	public static int method5248() {
		return Static169.anIntArray157 == null ? 0 : Static169.anIntArray157.length * 2;
	}
}
