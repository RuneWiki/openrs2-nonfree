import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Lclient!of;")
	public static Class1_Sub1_Sub16 aClass1_Sub1_Sub16_4;

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
	public static int anInt2885;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	public static int anInt2879 = -1;

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "Lclient!th;")
	public static Class169 aClass169_83 = new Class169(50);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V")
	public static void method2325(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static287.anInt5450 != -1) {
				Static191.method3136(Static287.anInt5450);
			}
			for (@Pc(15) Class1_Sub32 local15 = (Class1_Sub32) Static69.aClass156_6.method3822(); local15 != null; local15 = (Class1_Sub32) Static69.aClass156_6.method3820()) {
				Static195.method3172(local15, true);
			}
			Static287.anInt5450 = -1;
			Static69.aClass156_6 = new Class156(8);
			Static301.method4505();
			Static287.anInt5450 = Static229.anInt4491;
			Static118.method1924(false);
			Static124.method1998();
			Static55.method966(Static287.anInt5450);
		}
		Static5.anInt69 = -1;
		Static229.method3597(Static175.anInt3637);
		Static229.aClass22_Sub3_Sub2_2 = new Class22_Sub3_Sub2();
		Static229.aClass22_Sub3_Sub2_2.anInt4623 = 3000;
		Static229.aClass22_Sub3_Sub2_2.anInt4601 = 3000;
		if (!Static291.aBoolean404 && Static35.anInt641 == 0) {
			Static195.method3177(Static241.aClass138_64);
			Static176.method4598(10);
			return;
		}
		if (Static101.anInt1895 == 2) {
			Static105.anInt2016 = Static23.anInt440 << 7;
			Static243.anInt5653 = Static123.anInt2494 << 7;
		} else {
			Static127.method2016();
		}
		if (Static291.aBoolean404) {
			Static175.method2925();
		}
		Static140.method2234();
		Static176.method4598(28);
	}
}
