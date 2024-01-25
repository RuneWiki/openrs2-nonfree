import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt6533;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[Lclient!lf;")
	public static Class114[] aClass114Array3;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	public static int anInt6534 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method5831(@OriginalArg(1) Class14_Sub4 arg0) {
		if (arg0.aByteArray74.length - arg0.anInt2637 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2548();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray74.length - arg0.anInt2637 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method2498();
		if (local44 * 6 != arg0.aByteArray74.length - arg0.anInt2637) {
			return;
		}
		while (true) {
			@Pc(60) int local60;
			@Pc(64) int local64;
			do {
				do {
					do {
						if (arg0.aByteArray74.length <= arg0.anInt2637) {
							return;
						}
						local60 = arg0.method2498();
						local64 = arg0.method2510();
					} while (local60 >= Static30.anIntArray45.length);
				} while (!Static120.aBooleanArray12[local60]);
			} while (Static77.method1919(local60).aChar1 == '1' && (local64 < -1 || local64 > 1));
			Static30.anIntArray45[local60] = local64;
		}
	}
}
