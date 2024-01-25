import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZI)Z")
	public static boolean method297(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class5_Sub5_Sub19 local10 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local10 != null; local10 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
			if (Static74.method1184((byte) 127, local10.anInt9210) && (long) arg0 == local10.aLong267) {
				return true;
			}
		}
		if (false) {
			method297(-66);
		}
		return false;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
	public static void method298() {
		if (anIntArray23 != null && Static633.anIntArray577 != null) {
			return;
		}
		anIntArray23 = new int[256];
		Static633.anIntArray577 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(24) double local24 = (double) local15 / 255.0D * 6.283185307179586D;
			anIntArray23[local15] = (int) (Math.sin(local24) * 4096.0D);
			Static633.anIntArray577[local15] = (int) (Math.cos(local24) * 4096.0D);
		}
	}
}
