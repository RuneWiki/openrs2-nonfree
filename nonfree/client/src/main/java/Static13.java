import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIILjava/lang/String;)V")
	public static void method164(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static168.method8925();
		if (arg1 == 0) {
			Static488.aClass67_12 = Static494.method7146(Static713.aClass3_Sub55_31.aClass15_Sub20_2.method7387() * 2, Static644.anInterface2_12, 0, Static67.aCanvas1, Static689.aClass221_83);
			if (arg2 != null) {
				Static488.aClass67_12.GA(0);
				@Pc(186) Class330 local186 = Static708.method9245(Static692.anInt10862, Static385.aClass221_110);
				@Pc(195) Class44 local195 = Static488.aClass67_12.method7641(local186, Static728.method4754(Static403.aClass221_115, Static692.anInt10862), true);
				Static458.method6794();
				Static52.method679(Static488.aClass67_12, local186, arg2, true, local195);
			}
		} else {
			@Pc(12) Class67 local12 = null;
			@Pc(40) Class44 local40;
			if (arg2 != null) {
				local12 = Static494.method7146(0, Static644.anInterface2_12, 0, Static67.aCanvas1, Static689.aClass221_83);
				local12.GA(0);
				@Pc(31) Class330 local31 = Static708.method9245(Static692.anInt10862, Static385.aClass221_110);
				local40 = local12.method7641(local31, Static728.method4754(Static403.aClass221_115, Static692.anInt10862), true);
				Static458.method6794();
				Static52.method679(local12, local31, arg2, true, local40);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static488.aClass67_12 = Static494.method7146(Static713.aClass3_Sub55_31.aClass15_Sub20_2.method7387() * 2, Static644.anInterface2_12, arg1, Static67.aCanvas1, Static689.aClass221_83);
					if (arg2 != null) {
						local12.GA(0);
						@Pc(73) Class330 local73 = Static708.method9245(Static692.anInt10862, Static385.aClass221_110);
						@Pc(82) Class44 local82 = local12.method7641(local73, Static728.method4754(Static403.aClass221_115, Static692.anInt10862), true);
						Static458.method6794();
						Static52.method679(local12, local73, arg2, true, local82);
					}
					if (Static488.aClass67_12.method7648()) {
						@Pc(96) boolean local96 = true;
						try {
							local96 = Static50.aClass3_Sub25_1.anInt4197 > 256;
						} catch (@Pc(109) Throwable local109) {
						}
						@Pc(115) Class3_Sub17 local115;
						if (local96) {
							local115 = Static488.aClass67_12.method7665(146800640);
						} else {
							local115 = Static488.aClass67_12.method7665(104857600);
						}
						Static488.aClass67_12.method7715(local115);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(126) Throwable local126) {
					@Pc(131) int local131 = Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071();
					if (local131 == 2) {
						Static72.aBoolean91 = true;
					}
					Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub4_1, 0);
					method164(arg0, local131, arg2);
					@Pc(152) Object local152 = null;
					var14 = false;
				} finally {
					if (var14) {
						local40 = null;
						if (local12 != null) {
							try {
								local12.method7681();
							} catch (@Pc(366) Throwable local366) {
							}
						}
					}
				}
				if (local12 != null) {
					try {
						local12.method7681();
					} catch (@Pc(346) Throwable local346) {
					}
				}
				return;
			}
			local40 = null;
			if (local12 != null) {
				try {
					local12.method7681();
				} catch (@Pc(356) Throwable local356) {
				}
			}
		}
		Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1072(!arg0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub4_1, arg1);
		Static103.method1360();
		Static488.aClass67_12.method7666();
		Static488.aClass67_12.X(32);
		Static122.aClass181_12 = Static488.aClass67_12.method7646();
		Static377.aClass181_7 = Static488.aClass67_12.method7646();
		Static357.method5132();
		Static488.aClass67_12.method7673(Static713.aClass3_Sub55_31.aClass15_Sub17_1.method6666() == 1);
		if (Static488.aClass67_12.method7654()) {
			Static375.method5420(Static713.aClass3_Sub55_31.aClass15_Sub12_1.method4585() == 1);
		}
		Static627.method8500(Static362.anInt8653 >> 3, Static488.aClass67_12, Static206.anInt11291 >> 3);
		Static538.method6234();
		Static169.aBoolean257 = true;
		Static431.aClass95Array1 = null;
		Static675.aBoolean771 = false;
		Static373.method5411();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[Lclient!av;)V")
	public static void method165(@OriginalArg(1) int arg0, @OriginalArg(2) Class20[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(19) Class20 local19 = arg1[local3];
			if (local19 != null) {
				if (local19.anInt532 == 0) {
					if (local19.aClass20Array2 != null) {
						method165(arg0, local19.aClass20Array2);
					}
					@Pc(49) Class3_Sub52 local49 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local19.anInt600);
					if (local49 != null) {
						Static49.method650(arg0, local49.anInt10202);
					}
				}
				@Pc(69) Class3_Sub7 local69;
				if (arg0 == 0 && local19.anObjectArray12 != null) {
					local69 = new Class3_Sub7();
					local69.anObjectArray1 = local19.anObjectArray12;
					local69.aClass20_2 = local19;
					Static185.method2811(local69);
				}
				if (arg0 == 1 && local19.anObjectArray16 != null) {
					if (local19.anInt583 >= 0) {
						@Pc(99) Class20 local99 = Static118.method2045(local19.anInt600);
						if (local99 == null || local99.aClass20Array1 == null || local19.anInt583 >= local99.aClass20Array1.length || local19 != local99.aClass20Array1[local19.anInt583]) {
							continue;
						}
					}
					local69 = new Class3_Sub7();
					local69.anObjectArray1 = local19.anObjectArray16;
					local69.aClass20_2 = local19;
					Static185.method2811(local69);
				}
			}
		}
	}
}
