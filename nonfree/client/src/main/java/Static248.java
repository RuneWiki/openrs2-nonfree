import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
	public static int anInt4433;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_63 = new Class142("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "[I")
	public static final int[] anIntArray328 = new int[6];

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "[I")
	public static final int[] anIntArray329 = new int[1000];

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	public static int anInt4432 = 0;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
	public static void method3525() {
		for (@Pc(10) Class1_Sub20 local10 = (Class1_Sub20) Static303.aClass14_33.method203(); local10 != null; local10 = (Class1_Sub20) Static303.aClass14_33.method208()) {
			if (local10.anInt2541 == -1) {
				local10.anInt2533 = 0;
				if (local10.anInt2536 >= 0 && local10.anInt2539 >= 0 && local10.anInt2536 < Static147.anInt2300 && Static293.anInt4886 > local10.anInt2539) {
					Static397.method5143(local10);
				}
			} else {
				local10.method5953();
			}
		}
	}
}
