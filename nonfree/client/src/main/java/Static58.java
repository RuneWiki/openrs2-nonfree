import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	public static int anInt1127;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "Lclient!mq;")
	public static Class71 aClass71_3;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	public static int anInt1135 = -1;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V")
	public static void method1113() {
		Static424.aClass266_4.method7116();
		Static81.aClass359_2.method9054();
		Static42.aClass96_2.method2467();
		Static251.aClass328_1.method8263();
		Static522.aClass272_2.method7198();
		Static372.aClass343_1.method8545();
		Static354.aClass40_2.method1121();
		Static391.aClass319_1.method8035();
		Static395.aClass140_1.method4035();
		Static288.aClass187_1.method4893();
		Static87.aClass184_1.method4780();
		Static665.aClass267_2.method7155();
		Static157.aClass353_1.method8903();
		Static350.aClass5_3.method99();
		Static274.aClass392_1.method9734();
		Static142.aClass367_1.method9247();
		Static462.aClass299_1.method7747();
		Static6.aClass176_1.method4647();
		Static294.aClass378_1.method9478();
		Static372.aClass165_2.method4436();
		Static300.aClass197_5.method5092();
		Static226.aClass102_1.method3162();
		Static671.method9802();
		Static196.method3779();
		Static361.method6165();
		Static294.method4865();
		if (Static314.aClass37_6 != Static235.aClass37_5) {
			for (@Pc(89) int local89 = 0; local89 < Static663.aByteArrayArray26.length; local89++) {
				Static663.aByteArrayArray26[local89] = null;
			}
			Static271.anInt5093 = 0;
		}
		Static114.method2012();
		Static85.method1482();
		Static427.method7015();
		Static162.method3286();
		Static206.method3917();
		Static518.aClass22_45.method461();
		Static607.aClass101_15.method8066();
		Static259.method4505();
		Static384.method6481();
		Static256.aClass124_125.method3614();
		Static170.aClass124_45.method3614();
		Static361.aClass124_78.method3614();
		Static362.aClass124_115.method3614();
		Static437.aClass124_88.method3614();
		Static52.aClass124_14.method3614();
		Static502.aClass124_105.method3614();
		Static21.aClass124_7.method3614();
		Static409.aClass124_84.method3614();
		Static390.aClass124_83.method3614();
		Static270.aClass124_58.method3614();
		Static489.aClass124_104.method3614();
		Static670.aClass124_86.method3614();
		Static227.aClass124_49.method3614();
		Static40.aClass124_9.method3614();
		Static472.aClass124_101.method3614();
		Static287.aClass124_63.method3614();
		Static324.aClass124_69.method3614();
		Static345.aClass124_75.method3614();
		Static383.aClass124_79.method3614();
		Static114.aClass124_30.method3614();
		Static233.aClass124_52.method3614();
		Static12.aClass124_6.method3614();
		Static480.aClass124_102.method3614();
		Static47.aClass124_12.method3614();
		Static83.aClass124_21.method3614();
		Static11.aClass124_5.method3614();
		Static521.aClass124_77.method3614();
		Static389.aClass124_82.method3614();
		Static68.aClass124_17.method3614();
		Static632.aClass124_129.method3614();
		Static560.aClass124_118.method3614();
		Static455.aClass124_100.method3614();
		Static603.aClass22_63.method461();
		Static433.aClass22_38.method461();
		Static317.aClass22_35.method461();
		Static388.aClass22_34.method461();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)I")
	public static int method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg1;
		} else if (local18 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return 7 + 1 - arg1 - arg4;
		}
	}
}
