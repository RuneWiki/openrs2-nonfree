import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "[Lclient!fm;")
	public static Class81[] aClass81Array1;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!os;")
	public static final Class182 aClass182_36 = new Class182("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public static void method657() {
		if (Static218.anIntArray410 != null && Static132.anIntArray275 != null) {
			return;
		}
		Static218.anIntArray410 = new int[256];
		Static132.anIntArray275 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static218.anIntArray410[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static132.anIntArray275[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public static void method658() {
		if (Static358.anInt6086 == 2) {
			Static458.method6071(3);
		} else if (Static358.anInt6086 == 6) {
			Static458.method6071(7);
		} else if (Static358.anInt6086 == 9) {
			Static458.method6071(10);
			return;
		}
	}
}
