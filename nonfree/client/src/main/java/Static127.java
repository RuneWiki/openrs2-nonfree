import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "Lclient!gh;")
	public static Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public static int anInt2133 = -1;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_27 = new Class208(30, -1);

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_60 = new Class25(91, -2);

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt2141 = 0;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "[Lclient!ct;")
	public static final Interface2[] anInterface2Array1 = new Interface2[128];

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!pb;ILclient!hw;)V")
	public static void method2017(@OriginalArg(1) Class194 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub17 arg2) {
		@Pc(9) Class2_Sub30 local9 = new Class2_Sub30();
		local9.anInt5146 = arg2.method6138();
		local9.anInt5144 = arg2.method6129();
		local9.aClass136Array2 = new Class136[local9.anInt5146];
		local9.aClass136Array1 = new Class136[local9.anInt5146];
		local9.anIntArray432 = new int[local9.anInt5146];
		local9.anIntArray433 = new int[local9.anInt5146];
		local9.aByteArrayArrayArray14 = new byte[local9.anInt5146][][];
		local9.anIntArray431 = new int[local9.anInt5146];
		for (@Pc(53) int local53 = 0; local53 < local9.anInt5146; local53++) {
			try {
				@Pc(59) int local59 = arg2.method6138();
				@Pc(81) String local81;
				@Pc(85) String local85;
				@Pc(89) int local89;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local81 = arg2.method6141();
					local85 = arg2.method6141();
					local89 = 0;
					if (local59 == 1) {
						local89 = arg2.method6129();
					}
					local9.anIntArray433[local53] = local59;
					local9.anIntArray432[local53] = local89;
					local9.aClass136Array1[local53] = arg0.method4414(Static233.method3185(local81), local85);
				} else if (local59 == 3 || local59 == 4) {
					local81 = arg2.method6141();
					local85 = arg2.method6141();
					local89 = arg2.method6138();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg2.method6141();
					}
					@Pc(113) byte[][] local113 = new byte[local89][];
					@Pc(126) int local126;
					if (local59 == 3) {
						for (@Pc(120) int local120 = 0; local120 < local89; local120++) {
							local126 = arg2.method6129();
							local113[local120] = new byte[local126];
							arg2.method6164(local126, local113[local120]);
						}
					}
					local9.anIntArray433[local53] = local59;
					@Pc(151) Class[] local151 = new Class[local89];
					for (local126 = 0; local126 < local89; local126++) {
						local151[local126] = Static233.method3185(local92[local126]);
					}
					local9.aClass136Array2[local53] = arg0.method4406(Static233.method3185(local81), local151, local85);
					local9.aByteArrayArrayArray14[local53] = local113;
				}
			} catch (@Pc(230) ClassNotFoundException local230) {
				local9.anIntArray431[local53] = -1;
			} catch (@Pc(237) SecurityException local237) {
				local9.anIntArray431[local53] = -2;
			} catch (@Pc(244) NullPointerException local244) {
				local9.anIntArray431[local53] = -3;
			} catch (@Pc(251) Exception local251) {
				local9.anIntArray431[local53] = -4;
			} catch (@Pc(258) Throwable local258) {
				local9.anIntArray431[local53] = -5;
			}
		}
		Static242.aClass181_16.method3973(local9);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
	public static boolean method2018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static326.method4644(arg1, arg0) || Static81.method1197(arg1, arg0);
	}
}
