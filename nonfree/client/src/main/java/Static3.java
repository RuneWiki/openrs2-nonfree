import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt26;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
	public static final int[] anIntArray1 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method41() {
		if (Static44.anIntArray55 != null && Static57.anIntArray535 != null) {
			return;
		}
		Static57.anIntArray535 = new int[256];
		Static44.anIntArray55 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static44.anIntArray55[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static57.anIntArray535[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
