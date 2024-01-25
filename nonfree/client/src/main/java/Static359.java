import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
	public static boolean aBoolean463;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public static int anInt6234;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public static int anInt6232 = 100;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static185.aClass66_14 = Static367.method6819(Static189.aClass4_Sub2_Sub1_1.anInt9297 * 2, Static379.aCanvas13, 0, Static422.aClass31_95, Static263.anInterface3_14);
			if (arg1 != null) {
				Static185.aClass66_14.D(0);
				@Pc(162) Class196 local162 = Static297.method4643(Static318.anInt5720, Static520.aClass31_110);
				@Pc(171) Class91 local171 = Static185.aClass66_14.method6829(local162, Static607.method5879(Static360.aClass31_78, Static318.anInt5720));
				Static485.method6744();
				Static433.method6141(arg1, true, Static185.aClass66_14, local171, local162);
			}
		} else {
			@Pc(12) Class66 local12 = null;
			@Pc(31) Class196 local31;
			@Pc(40) Class91 local40;
			if (arg1 != null) {
				local12 = Static367.method6819(0, Static379.aCanvas13, 0, Static422.aClass31_95, Static263.anInterface3_14);
				local12.D(0);
				local31 = Static297.method4643(Static318.anInt5720, Static520.aClass31_110);
				local40 = local12.method6829(local31, Static607.method5879(Static360.aClass31_78, Static318.anInt5720));
				Static485.method6744();
				Static433.method6141(arg1, true, local12, local40, local31);
			}
			try {
				Static185.aClass66_14 = Static367.method6819(Static189.aClass4_Sub2_Sub1_1.anInt9297 * 2, Static379.aCanvas13, arg0, Static422.aClass31_95, Static263.anInterface3_14);
				if (arg1 != null) {
					local12.D(0);
					local31 = Static297.method4643(Static318.anInt5720, Static520.aClass31_110);
					local40 = local12.method6829(local31, Static607.method5879(Static360.aClass31_78, Static318.anInt5720));
					Static485.method6744();
					Static433.method6141(arg1, true, local12, local40, local31);
				}
				if (Static185.aClass66_14.method6821()) {
					@Pc(94) boolean local94 = true;
					try {
						local94 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(104) Throwable local104) {
					}
					@Pc(110) Class4_Sub6 local110;
					if (local94) {
						local110 = Static185.aClass66_14.method6833(146800640);
					} else {
						local110 = Static185.aClass66_14.method6833(104857600);
					}
					Static185.aClass66_14.method6800(local110);
				}
			} catch (@Pc(121) Throwable local121) {
				Static185.aClass66_14 = Static367.method6819(0, Static379.aCanvas13, 0, Static422.aClass31_95, Static263.anInterface3_14);
				arg0 = 0;
			}
			if (local12 != null) {
				try {
					local12.method6838();
				} catch (@Pc(138) Throwable local138) {
				}
			}
		}
		Static403.anInt6994 = arg0;
		Static571.method7723();
		if (!Static185.aClass66_14.method6848()) {
			Static511.anInt940 = 1;
		}
		Static185.aClass66_14.method6835(Static511.anInt940);
		Static185.aClass66_14.method6813(0);
		Static185.aClass66_14.JA(32);
		Static488.aClass134_6 = Static185.aClass66_14.method6788();
		Static186.aClass134_4 = Static185.aClass66_14.method6788();
		Static289.method4565();
		Static185.aClass66_14.method6839(!Static189.aClass4_Sub2_Sub1_1.aBoolean647);
		if (Static185.aClass66_14.method6849()) {
			Static200.method3593(Static189.aClass4_Sub2_Sub1_1.aBoolean645);
		}
		Static584.method7912(Static38.anInt740 >> 3, Static38.anInt741 >> 3, Static185.aClass66_14);
		Static114.method2345();
		Static179.aBoolean296 = true;
		Static47.aBoolean78 = false;
		Static235.aClass242Array1 = null;
	}
}
