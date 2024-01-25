import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
	public static final int[] anIntArray98 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(B)V")
	public static void method1230() {
		try {
			if (Static237.anInt4541 == 1) {
				@Pc(20) int local20 = Static271.aClass2_Sub3_Sub3_3.method1773();
				if (local20 > 0 && Static271.aClass2_Sub3_Sub3_3.method1763()) {
					local20 -= Static68.anInt1466;
					if (local20 < 0) {
						local20 = 0;
					}
					Static271.aClass2_Sub3_Sub3_3.method1751(local20);
				} else {
					Static271.aClass2_Sub3_Sub3_3.method1752();
					Static271.aClass2_Sub3_Sub3_3.method1778();
					if (Static144.aClass191_93 == null) {
						Static237.anInt4541 = 0;
					} else {
						Static237.anInt4541 = 2;
					}
					Static210.aClass2_Sub21_2 = null;
					Static265.aClass90_41 = null;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static271.aClass2_Sub3_Sub3_3.method1752();
			Static210.aClass2_Sub21_2 = null;
			Static144.aClass191_93 = null;
			Static237.anInt4541 = 0;
			Static265.aClass90_41 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!tq;Lclient!tq;ZLclient!tq;)V")
	public static void method1231(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(3) Class191 arg2) {
		Static77.aClass191_49 = arg0;
		Static221.method3902(arg1, arg2);
	}
}
