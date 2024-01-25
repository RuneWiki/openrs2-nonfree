import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!or", name = "J", descriptor = "I")
	public static int anInt7996 = 0;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "(I)V")
	public static void method7151() {
		@Pc(7) Class60[] local7 = Class2_Sub15_Sub7_Sub1.aClass60Array1;
		synchronized (Class2_Sub15_Sub7_Sub1.aClass60Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class2_Sub15_Sub7_Sub1.aClass60Array1.length; local11++) {
				Class2_Sub15_Sub7_Sub1.aClass60Array1[local11] = new Class60();
				Static490.anIntArray442[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7152(@OriginalArg(0) String arg0) {
		Static159.method3207("", arg0, 4, "", "", 0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static351.aBoolean516 || !Static175.aBoolean283) {
			return false;
		} else if (Static22.anInt390 < 100) {
			return false;
		} else if (Static328.method5423(arg3, arg1, arg0)) {
			@Pc(28) int local28 = arg1 << Static170.anInt3602;
			@Pc(32) int local32 = arg3 << Static170.anInt3602;
			if (Static571.method8696(Static245.aClass18Array14[arg0].method8537(arg3, arg1), Static536.anInt4502, arg2, Static536.anInt4502, local32, local28)) {
				Static640.anInt11082++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
