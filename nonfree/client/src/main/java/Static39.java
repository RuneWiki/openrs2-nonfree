import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[ILclient!nv;I[II)Lclient!gga;")
	public static Class1_Sub1 method1278(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class16_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(27) int local27 = arg3[local12] + local12 * arg4;
			for (@Pc(29) int local29 = 0; local29 < arg0[local12]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class1_Sub1(arg1, arg4, arg2, local10);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public static void method1279() {
		if (!Static317.aBoolean656) {
			Static69.aBoolean558 = true;
			Static317.aBoolean656 = true;
			Static146.aFloat76 += (-12.0F - Static146.aFloat76) / 2.0F;
		}
	}
}
