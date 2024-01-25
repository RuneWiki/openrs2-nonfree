import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
	public static int anInt6355;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "[Lclient!fd;")
	public static Class98_Sub1[] aClass98_Sub1Array1 = new Class98_Sub1[0];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IZI)V")
	public static void method5170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static570.anInt9813 != 0) {
			if (arg0 < 0) {
				for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
					Static26.anIntArray32[local13] = arg1;
				}
			} else {
				Static26.anIntArray32[arg0] = arg1;
			}
		}
		Static608.aClass8_Sub16_Sub1_4.method2282(arg1, arg0);
	}
}
