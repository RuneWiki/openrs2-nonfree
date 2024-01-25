import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "Lclient!dm;")
	public static Class76 aClass76_5;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIB)V")
	public static void method3546(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static427.anInt7845 = 0;
		Static631.anInt10922 = arg1;
		Static457.anInt8209 = 0;
		Static407.anInt7583 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZII)V")
	public static void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static311.anInt5615 != 0) {
			if (arg1 >= 0) {
				Static208.anIntArray470[arg1] = arg0;
			} else {
				for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
					Static208.anIntArray470[local13] = arg0;
				}
			}
		}
		Static300.aClass2_Sub26_Sub3_8.method6983(arg0, arg1);
	}
}
