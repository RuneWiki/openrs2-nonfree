import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array8;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "Lclient!mk;")
	public static Class2_Sub26 aClass2_Sub26_1;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "[S")
	public static final short[] aShortArray17 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_36 = new Class256("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
	public static final int[] anIntArray100 = new int[1];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V")
	public static void method1354() {
		Static448.method6059(Static58.aClass44_23);
		for (@Pc(23) Class2_Sub25 local23 = (Class2_Sub25) Static398.aClass240_27.method5438(); local23 != null; local23 = (Class2_Sub25) Static398.aClass240_27.method5436()) {
			if (!local23.method6074()) {
				local23 = (Class2_Sub25) Static398.aClass240_27.method5438();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt4162 == 0) {
				Static419.method5701(local23, true, true);
			}
		}
		if (Static351.aClass41_13 != null) {
			Static168.method2616(Static351.aClass41_13);
			Static351.aClass41_13 = null;
		}
	}
}
