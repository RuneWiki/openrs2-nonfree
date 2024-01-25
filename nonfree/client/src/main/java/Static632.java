import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
	public static void method8846(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static175.method2575();
		if (arg2 == 0) {
			Static457.aClass57_11 = Static637.method8915(Static637.aClass5_Sub20_31.aClass24_Sub11_1.method3217() * 2, Static24.aCanvas1, 0, Static509.anInterface1_10, Static226.aClass208_56);
			if (arg0 != null) {
				Static457.aClass57_11.GA(0);
				@Pc(182) Class224 local182 = Static494.method7119(Static417.anInt7212, Static85.aClass208_16);
				@Pc(191) Class80 local191 = Static457.aClass57_11.method7708(local182, Static684.method3653(Static345.aClass208_78, Static417.anInt7212));
				Static403.method5923();
				Static299.method1114(true, arg0, local191, local182, Static457.aClass57_11);
			}
		} else {
			@Pc(12) Class57 local12 = null;
			@Pc(40) Class80 local40;
			if (arg0 != null) {
				local12 = Static637.method8915(0, Static24.aCanvas1, 0, Static509.anInterface1_10, Static226.aClass208_56);
				local12.GA(0);
				@Pc(31) Class224 local31 = Static494.method7119(Static417.anInt7212, Static85.aClass208_16);
				local40 = local12.method7708(local31, Static684.method3653(Static345.aClass208_78, Static417.anInt7212));
				Static403.method5923();
				Static299.method1114(true, arg0, local40, local31, local12);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static457.aClass57_11 = Static637.method8915(Static637.aClass5_Sub20_31.aClass24_Sub11_1.method3217() * 2, Static24.aCanvas1, arg2, Static509.anInterface1_10, Static226.aClass208_56);
					if (arg0 != null) {
						local12.GA(0);
						@Pc(73) Class224 local73 = Static494.method7119(Static417.anInt7212, Static85.aClass208_16);
						@Pc(82) Class80 local82 = local12.method7708(local73, Static684.method3653(Static345.aClass208_78, Static417.anInt7212));
						Static403.method5923();
						Static299.method1114(true, arg0, local82, local73, local12);
					}
					if (Static457.aClass57_11.method7642()) {
						@Pc(96) boolean local96 = true;
						try {
							local96 = Static528.aClass5_Sub19_1.anInt3442 > 256;
						} catch (@Pc(107) Throwable local107) {
						}
						@Pc(113) Class5_Sub10 local113;
						if (local96) {
							local113 = Static457.aClass57_11.method7646(146800640);
						} else {
							local113 = Static457.aClass57_11.method7646(104857600);
						}
						Static457.aClass57_11.method7675(local113);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(124) Throwable local124) {
					@Pc(129) int local129 = Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153();
					if (local129 == 2) {
						Static404.aBoolean532 = true;
					}
					Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub10_1);
					method8846(arg0, arg1, local129);
					@Pc(148) Object local148 = null;
					var14 = false;
				} finally {
					if (var14) {
						local40 = null;
						if (local12 != null) {
							try {
								local12.method7722();
							} catch (@Pc(353) Throwable local353) {
							}
						}
					}
				}
				if (local12 != null) {
					try {
						local12.method7722();
					} catch (@Pc(333) Throwable local333) {
					}
				}
				return;
			}
			local40 = null;
			if (local12 != null) {
				try {
					local12.method7722();
				} catch (@Pc(343) Throwable local343) {
				}
			}
		}
		Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3151(!arg1);
		Static637.aClass5_Sub20_31.method3194(arg2, Static637.aClass5_Sub20_31.aClass24_Sub10_1);
		Static5.method8189();
		Static457.aClass57_11.method7724();
		Static457.aClass57_11.X(32);
		Static158.aClass203_4 = Static457.aClass57_11.method7676();
		Static113.aClass203_3 = Static457.aClass57_11.method7676();
		Static197.method8873();
		Static457.aClass57_11.method7678(Static637.aClass5_Sub20_31.aClass24_Sub1_1.method452() == 1);
		if (Static457.aClass57_11.method7706()) {
			Static664.method9167(Static637.aClass5_Sub20_31.aClass24_Sub14_1.method5150() == 1);
		}
		Static155.method2137(Static282.anInt4887 >> 3, Static544.anInt9261 >> 3, Static457.aClass57_11);
		Static277.method4082();
		Static462.aClass277Array1 = null;
		Static261.aBoolean355 = false;
		Static179.aBoolean250 = true;
		Static601.method8649();
	}
}
