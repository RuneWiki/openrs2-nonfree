import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "Lclient!rg;")
	public static Class310 aClass310_115;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "Lclient!qga;")
	public static Class299 aClass299_10;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "[Lclient!kk;")
	public static Interface11[] anInterface11Array1;

	@OriginalMember(owner = "client!tk", name = "K", descriptor = "[I")
	public static int[] anIntArray506;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZI)V")
	public static void method8381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static625.anInt11174 != 0) {
			if (arg0 < 0) {
				for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
					Static269.anIntArray561[local24] = arg1;
				}
			} else {
				Static269.anIntArray561[arg0] = arg1;
			}
		}
		Static472.aClass14_Sub1_Sub3_3.method1919(arg1, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)Z")
	public static boolean method8382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
