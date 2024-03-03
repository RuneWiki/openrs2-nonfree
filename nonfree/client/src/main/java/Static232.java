import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!jd;")
	public static Class13 aClass13_14;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 3)
	public static void method4364() {
		Class198.aClass4_109.method81();
		Class146.aClass246_4.method6343();
		Class2_Sub3_Sub36.aClass246_10.method6343();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZII)V", line = 32)
	public static void method4366(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static177.aClass19_8 = Static361.method2824(Static203.aClass177_Sub1_2.anInt4875 * 2, Static305.aClass152_5, Static120.anInterface2_4, Static21.aCanvas1, arg1);
		} else {
			if (arg0) {
				Static177.aClass19_8 = Static361.method2824(0, Static305.aClass152_5, Static120.anInterface2_4, Static21.aCanvas1, 0);
				Static177.aClass19_8.method2869(0);
				@Pc(22) Class239 local22 = Static94.method2167(Static346.anInt7001, Static235.aClass197_64);
				@Pc(31) Class130 local31 = Static177.aClass19_8.method2859(local22, Static372.method1690(Static29.aClass197_5, Static346.anInt7001));
				Static326.method5858(local31, true, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569));
				Static177.aClass19_8.method2885();
				Static347.method6261();
				Static177.aClass19_8.method2827();
			}
			try {
				Static177.aClass19_8 = Static361.method2824(Static203.aClass177_Sub1_2.anInt4875 * 2, Static305.aClass152_5, Static120.anInterface2_4, Static21.aCanvas1, arg1);
			} catch (@Pc(61) Throwable local61) {
				Static177.aClass19_8 = Static361.method2824(0, Static305.aClass152_5, Static120.anInterface2_4, Static21.aCanvas1, 0);
				arg1 = 0;
			}
		}
		if (Static177.aClass19_8.method2851()) {
			@Pc(97) Class2_Sub22 local97 = Static177.aClass19_8.method2878();
			Static177.aClass19_8.method2848(local97);
		}
		Class2_Sub10.anInt1760 = arg1;
		Static181.method3542();
		if (!Static177.aClass19_8.method2871()) {
			Class57_Sub2.anInt3587 = 1;
		}
		Static177.aClass19_8.method2856(Class57_Sub2.anInt3587);
		Static177.aClass19_8.method2895(0);
		Static72.aClass14_3 = Static177.aClass19_8.method2899();
		Static215.aClass14_4 = Static177.aClass19_8.method2899();
		@Pc(127) int local127 = (int) ((double) Class241.anInt7020 * 34.46D);
		if (Static177.aClass19_8.method2890()) {
			local127 += 128;
		}
		Static177.aClass19_8.method2874(50, local127);
		Static177.aClass19_8.method2876(!Static203.aClass177_Sub1_2.aBoolean350);
		if (Static177.aClass19_8.method2860()) {
			Static261.method4883(Static203.aClass177_Sub1_2.aBoolean356);
		}
		Static177.method3501(OutputStream_Sub1.anInt4442 >> 3, Class241.anInt7020 >> 3, Static177.aClass19_8);
		Static323.method5829();
		Class161.aBoolean288 = false;
	}
}
