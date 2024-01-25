import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	public static int anInt8573;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!da;")
	public static Class57 aClass57_10;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_85 = new Class144(52, 3);

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!nt;")
	public static Class270 aClass270_18 = null;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	public static final int anInt8574 = 0;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public static void method7327() {
		if (Static642.anIntArray715 != null && Static523.anIntArray592 != null) {
			return;
		}
		Static523.anIntArray592 = new int[256];
		Static642.anIntArray715 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(33) double local33 = (double) local24 / 255.0D * 6.283185307179586D;
			Static642.anIntArray715[local24] = (int) (Math.sin(local33) * 4096.0D);
			Static523.anIntArray592[local24] = (int) (Math.cos(local33) * 4096.0D);
		}
	}
}
