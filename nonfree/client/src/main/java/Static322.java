import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!mw;Z)V")
	public static void method4786(@OriginalArg(0) Class1_Sub3_Sub1 arg0) {
		arg0.method7936(Static443.aClass308_158.method6567());
		arg0.method7936(Static118.aClass308_46.method6567());
		arg0.method7936(Static298.aClass308_106.method6567());
		arg0.method7936(Static227.aClass308_91.method6567());
		arg0.method7936(Static341.aClass308_120.method6567());
		arg0.method7936(Static141.aClass308_56.method6567());
		arg0.method7936(Static51.aClass308_24.method6567());
		arg0.method7936(Static184.aClass308_76.method6567());
		arg0.method7936(Static121.aClass308_48.method6567());
		arg0.method7936(Static528.aClass308_179.method6567());
		arg0.method7936(Static294.aClass308_104.method6567());
		arg0.method7936(Static303.aClass308_109.method6567());
		arg0.method7936(Static220.aClass308_111.method6567());
		arg0.method7936(Static77.aClass308_183.method6567());
		arg0.method7936(Static133.aClass308_53.method6567());
		arg0.method7936(Static218.aClass308_86.method6567());
		arg0.method7936(Static411.aClass308_147.method6567());
		arg0.method7936(Static379.aClass308_135.method6567());
		arg0.method7936(Static575.aClass308_192.method6567());
		arg0.method7936(Static161.aClass308_66.method6567());
		arg0.method7936(Static506.aClass308_171.method6567());
		arg0.method7936(Static231.aClass308_94.method6567());
		arg0.method7936(Static559.aClass308_187.method6567());
		arg0.method7936(Static193.aClass308_80.method6567());
		arg0.method7936(Static438.aClass308_156.method6567());
		arg0.method7936(Static485.aClass308_165.method6567());
		arg0.method7936(Static106.aClass308_41.method6567());
		arg0.method7936(Static584.aClass308_194.method6567());
		arg0.method7936(Static141.aClass308_57.method6567());
		arg0.method7936(Static563.aClass308_188.method6567());
		arg0.method7936(Static155.aClass308_60.method6567());
		arg0.method7936(Static461.aClass308_163.method6567());
		arg0.method7936(Static423.method6001());
		arg0.method7936(Static478.method3879());
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!ls;)V")
	public static void method4788(@OriginalArg(1) Class11_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt7584 - Static518.anInt9331;
		@Pc(23) int local23 = arg0.anInt7557 * 512 + arg0.method6058() * 256;
		@Pc(35) int local35 = arg0.anInt7569 * 512 + arg0.method6058() * 256;
		arg0.anInt7605 = 0;
		arg0.anInt8906 += (local35 - arg0.anInt8906) / local9;
		arg0.anInt8902 += (local23 - arg0.anInt8902) / local9;
		if (arg0.anInt7555 == 0) {
			arg0.method6065(8192);
		}
		if (arg0.anInt7555 == 1) {
			arg0.method6065(12288);
		}
		if (arg0.anInt7555 == 2) {
			arg0.method6065(0);
		}
		if (arg0.anInt7555 == 3) {
			arg0.method6065(4096);
		}
	}
}
