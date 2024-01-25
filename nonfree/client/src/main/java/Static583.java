import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "[I")
	public static final int[] anIntArray727 = new int[8];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public static void method7925() {
		if (Static412.anIntArray712 != null && Static6.anIntArray5 != null) {
			return;
		}
		Static6.anIntArray5 = new int[256];
		Static412.anIntArray712 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static412.anIntArray712[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static6.anIntArray5[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)Z")
	public static boolean method7927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
