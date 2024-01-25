import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	public static int anInt3970;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	public static int method3163() {
		@Pc(10) Class137 local10 = Static144.aClass137_23;
		synchronized (Static144.aClass137_23) {
			return Static144.aClass137_23.method2736();
		}
	}

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "(I)V")
	public static void method3165() {
		if (Static449.anIntArray563 != null && Static214.anIntArray275 != null) {
			return;
		}
		Static214.anIntArray275 = new int[256];
		Static449.anIntArray563 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static449.anIntArray563[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static214.anIntArray275[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
