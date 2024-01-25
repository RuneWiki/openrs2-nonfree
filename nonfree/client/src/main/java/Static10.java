import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!pc;")
	public static Class188 aClass188_6;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "Lclient!eb;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "S")
	public static short aShort4 = 205;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public static void method210() {
		if (Static132.anIntArray145 != null && Static171.anIntArray220 != null) {
			return;
		}
		Static171.anIntArray220 = new int[256];
		Static132.anIntArray145 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static132.anIntArray145[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static171.anIntArray220[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
