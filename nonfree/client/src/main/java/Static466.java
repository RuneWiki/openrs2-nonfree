import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public static int anInt7616;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!oda;Z)V")
	public static void method6567(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort124; local2 <= arg0.aShort125; local2++) {
			for (@Pc(6) int local6 = arg0.aShort123; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class97 local16 = Static272.aClass97ArrayArrayArray3[arg0.aByte131][local2][local6];
				if (local16 != null) {
					@Pc(21) Class196 local21 = local16.aClass196_2;
					@Pc(23) Class196 local23 = null;
					while (local21 != null) {
						if (local21.aClass20_Sub2_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass196_2 = local21.aClass196_3;
							} else {
								local23.aClass196_3 = local21.aClass196_3;
							}
							local21.method5408();
							break;
						}
						local23 = local21;
						local21 = local21.aClass196_3;
					}
				}
			}
		}
		if (!arg1) {
			Static10.method210(arg0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public static void method6568() {
		Static587.aClass136_6.method3670();
		Static154.aClass321_2.method7950();
		Static195.aClass58_1.method1518();
		Static283.aClass210_2.method5634();
		Static563.aClass346_2.method8193();
		Static266.aClass138_1.method3735();
		Static294.aClass373_2.method8739();
		Static436.aClass292_2.method7398();
		Static230.aClass233_3.method6394();
		Static40.aClass245_1.method6516();
		Static511.aClass34_1.method805();
		Static184.aClass337_2.method8116();
		Static592.aClass304_4.method7761();
		Static26.aClass179_1.method5146();
		Static568.aClass37_1.method860();
		Static25.aClass355_1.method8455();
		Static22.aClass354_1.method8454();
		Static595.aClass92_1.method2344();
		Static131.aClass74_1.method1973();
		Static576.aClass324_2.method7962();
		Static504.aClass335_6.method8111();
		Static19.method334();
		Static126.method2049();
		Static561.method8094();
		Static54.method907();
		Static54.method906();
		Static137.aClass166_16.method4809(5);
		Static31.aClass166_2.method4809(5);
		Static417.aClass166_40.method4809(5);
		Static450.aClass166_43.method4809(5);
		Static244.aClass166_25.method4809(5);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public static void method6575() {
		Static194.aClass32Array10 = null;
		Static52.aClass32Array4 = null;
		Static30.aClass32Array11 = null;
		Static631.aClass50_12 = null;
		Static43.aClass50_2 = null;
		Static564.aClass32Array21 = null;
		Static257.aClass32Array13 = null;
		Static581.aClass32_30 = null;
		Static145.aClass32Array9 = null;
		Static119.aClass32Array8 = null;
		Static246.aClass32Array12 = null;
		Static553.aClass32Array19 = null;
		Static380.aClass32Array7 = null;
		Static499.aClass32Array18 = null;
		Static333.aClass32Array20 = null;
		Static340.aClass32_16 = null;
		Static173.aClass50_5 = null;
		Static272.aClass32Array15 = null;
	}
}
