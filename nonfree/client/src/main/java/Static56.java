import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
	public static int anInt1175;

	@OriginalMember(owner = "client!cn", name = "U", descriptor = "Lclient!ig;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_3 = new Class175(0, 5);

	@OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
	public static int anInt1176 = 0;

	@OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
	public static int anInt1177 = 0;

	@OriginalMember(owner = "client!cn", name = "T", descriptor = "[I")
	public static final int[] anIntArray97 = new int[1000];

	@OriginalMember(owner = "client!cn", name = "V", descriptor = "[I")
	public static final int[] anIntArray98 = new int[2048];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)V")
	public static void method1051(@OriginalArg(1) int arg0) {
		Static70.anInt1464 = arg0;
		Static340.anInt5720 = -1;
		Static340.anInt5720 = -1;
		Static380.method5244();
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(III)I")
	public static int method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static394.anIntArray569[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method1055() {
		try {
			if (Static2.anInt9 == 1) {
				@Pc(18) int local18 = Static47.aClass6_Sub5_Sub3_7.method3642();
				if (local18 > 0 && Static47.aClass6_Sub5_Sub3_7.method3656()) {
					local18 -= Static254.anInt3860;
					if (local18 < 0) {
						local18 = 0;
					}
					Static47.aClass6_Sub5_Sub3_7.method3630(local18);
				} else {
					Static47.aClass6_Sub5_Sub3_7.method3664();
					Static47.aClass6_Sub5_Sub3_7.method3652();
					if (Static411.aClass158_87 == null) {
						Static2.anInt9 = 0;
					} else {
						Static2.anInt9 = 2;
					}
					Static140.aClass6_Sub37_1 = null;
					Static187.aClass124_1 = null;
				}
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static47.aClass6_Sub5_Sub3_7.method3664();
			Static411.aClass158_87 = null;
			Static140.aClass6_Sub37_1 = null;
			Static2.anInt9 = 0;
			Static187.aClass124_1 = null;
		}
	}
}
