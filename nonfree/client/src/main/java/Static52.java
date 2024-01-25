import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!ac;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!gaa;")
	public static Class102 aClass102_2;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	public static void method1027() {
		if (Static90.anIntArray186 != null && Static274.anIntArray525 != null) {
			return;
		}
		Static274.anIntArray525 = new int[256];
		Static90.anIntArray186 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static90.anIntArray186[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static274.anIntArray525[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIBI)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		if (arg0 < arg1) {
			for (local23 = arg0; local23 < arg1; local23++) {
				Static447.anIntArrayArray99[local23][arg3] = arg2;
			}
		} else {
			for (local23 = arg1; local23 < arg0; local23++) {
				Static447.anIntArrayArray99[local23][arg3] = arg2;
			}
		}
	}
}
