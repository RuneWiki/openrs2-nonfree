import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
	public static void method612() {
		if (Static122.anIntArray545 != null && Static378.anIntArray381 != null) {
			return;
		}
		Static378.anIntArray381 = new int[256];
		Static122.anIntArray545 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static122.anIntArray545[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static378.anIntArray381[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
