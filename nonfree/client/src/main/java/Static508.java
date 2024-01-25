import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	public static void method7815() {
		if (Static56.anIntArray79 != null && Static375.anIntArray163 != null) {
			return;
		}
		Static375.anIntArray163 = new int[256];
		Static56.anIntArray79 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static56.anIntArray79[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static375.anIntArray163[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)B")
	public static byte method7816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
