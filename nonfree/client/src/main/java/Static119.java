import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!en", name = "c", descriptor = "I")
	public static int anInt7676;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_104 = new Class160(66, 3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method6349(@OriginalArg(0) Class121 arg0) {
		if (Static161.aClass275_56.method6361() == 0) {
			return;
		}
		@Pc(28) Class6_Sub42 local28;
		if (Static567.anInt9503 == 0) {
			for (local28 = (Class6_Sub42) Static161.aClass275_56.method6366(); local28 != null; local28 = (Class6_Sub42) Static161.aClass275_56.method6364()) {
				Static295.aClass256_2.method5931(Static43.aClass56_1, local28.aBoolean489 ? Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 : null, arg0, arg0, local28.anInt6984, false, local28.anInt6980, false, local28.anInt6982, local28.anInt6985, local28.anInt6983);
				local28.method7849();
			}
			Static260.method3643();
			return;
		}
		if (Static91.aClass121_11 == null) {
			@Pc(75) Canvas local75 = new Canvas();
			local75.setSize(36, 32);
			Static91.aClass121_11 = Static348.method7144(0, Static509.aClass251_143, 0, local75, Static499.anInterface7_13);
			Static453.aClass56_5 = Static91.aClass121_11.method7123(Static148.method2192(Static425.anInt9464, Static492.aClass251_136), Static589.method4748(Static447.aClass251_141, Static425.anInt9464));
		}
		for (local28 = (Class6_Sub42) Static161.aClass275_56.method6366(); local28 != null; local28 = (Class6_Sub42) Static161.aClass275_56.method6364()) {
			Static295.aClass256_2.method5931(Static453.aClass56_5, local28.aBoolean489 ? Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 : null, arg0, Static91.aClass121_11, local28.anInt6984, false, local28.anInt6980, false, local28.anInt6982, local28.anInt6985, local28.anInt6983);
			local28.method7849();
		}
	}
}
