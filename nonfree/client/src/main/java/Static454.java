import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt7639;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_153 = new Class136(49, 6);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
	public static boolean method6737(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method6739() {
		Static519.aClass163_7.method3887();
		Static244.aClass210_5.method4994();
		Static575.aClass190_2.method4304();
		Static525.aClass371_4.method8557();
		Static258.aClass138_1.method3194();
		Static479.aClass348_1.method8200();
		Static396.aClass359_2.method8412();
		Static452.aClass170_4.method3997();
		Static386.aClass338_1.method8028();
		Static520.aClass381_1.method8800();
		Static608.aClass151_1.method3579();
		Static39.aClass56_3.method1172();
		Static40.aClass273_3.method6533();
		Static472.aClass317_1.method7535();
		Static246.aClass258_1.method6203();
		Static499.aClass121_1.method2664();
		Static629.aClass20_1.method491();
		Static586.aClass337_1.method7925();
		Static398.aClass102_1.method2076();
		Static320.aClass133_1.method3124();
		Static39.aClass9_1.method173();
		Static23.method489();
		Static157.method2381();
		Static22.method484();
		Static319.method4978();
		Static622.method8560();
		Static648.aClass293_78.method6927();
		Static407.aClass293_47.method6927();
		Static247.aClass293_30.method6927();
		Static186.aClass293_20.method6927();
		Static82.aClass293_9.method6927();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method6740() {
		Static607.anInt9954 = 0;
		Static306.anInt4861 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static180.anInt3253; local15++) {
			@Pc(21) int local21 = Static116.anInt1804 * local15;
			for (@Pc(23) int local23 = 0; local23 < Static116.anInt1804; local23++) {
				@Pc(29) int local29 = local23 + local21;
				Static311.anInterface16Array1[local29].method8546(local23 * Static133.anInt3875, local15 * Static549.anInt9105, Static133.anInt3875, Static549.anInt9105, true);
			}
		}
	}
}
