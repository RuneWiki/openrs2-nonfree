import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_71 = new Class7("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public static int anInt3116 = 0;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "[I")
	public static final int[] anIntArray282 = new int[1];

	@OriginalMember(owner = "client!in", name = "x", descriptor = "[I")
	public static final int[] anIntArray283 = new int[14];

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(B)V")
	public static void method2715() {
		if (Static390.anIntArray570 != null && Static268.anIntArray411 != null) {
			return;
		}
		Static390.anIntArray570 = new int[256];
		Static268.anIntArray411 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static390.anIntArray570[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static268.anIntArray411[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
