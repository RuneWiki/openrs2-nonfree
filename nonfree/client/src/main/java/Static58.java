import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Lclient!daa;")
	public static Class14_Sub11 aClass14_Sub11_1;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZBLjava/lang/String;I)V")
	public static void method1206(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static141.method1569();
		if (arg2 == 0) {
			Static677.aClass137_47 = Static473.method6864(0, Static55.aClass386_16, Static526.anInterface3_10, Static68.aCanvas2, Static56.aClass14_Sub22_5.aClass21_Sub9_1.method2372() * 2);
			if (arg1 != null) {
				Static677.aClass137_47.GA(0);
				@Pc(183) Class158 local183 = Static512.method7464(Static329.aClass386_78, Static335.anInt6336);
				@Pc(192) Class38 local192 = Static677.aClass137_47.method7870(local183, Static688.method8628(Static666.aClass386_141, Static335.anInt6336));
				Static357.method5405();
				Static88.method8992(local192, true, Static677.aClass137_47, arg1, local183);
			}
		} else {
			@Pc(12) Class137 local12 = null;
			@Pc(40) Class38 local40;
			if (arg1 != null) {
				local12 = Static473.method6864(0, Static55.aClass386_16, Static526.anInterface3_10, Static68.aCanvas2, 0);
				local12.GA(0);
				@Pc(31) Class158 local31 = Static512.method7464(Static329.aClass386_78, Static335.anInt6336);
				local40 = local12.method7870(local31, Static688.method8628(Static666.aClass386_141, Static335.anInt6336));
				Static357.method5405();
				Static88.method8992(local40, true, local12, arg1, local31);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static677.aClass137_47 = Static473.method6864(arg2, Static55.aClass386_16, Static526.anInterface3_10, Static68.aCanvas2, Static56.aClass14_Sub22_5.aClass21_Sub9_1.method2372() * 2);
					if (arg1 != null) {
						local12.GA(0);
						@Pc(73) Class158 local73 = Static512.method7464(Static329.aClass386_78, Static335.anInt6336);
						@Pc(82) Class38 local82 = local12.method7870(local73, Static688.method8628(Static666.aClass386_141, Static335.anInt6336));
						Static357.method5405();
						Static88.method8992(local82, true, local12, arg1, local73);
					}
					if (Static677.aClass137_47.method7868()) {
						@Pc(98) boolean local98 = true;
						try {
							local98 = aClass14_Sub11_1.anInt1980 > 256;
						} catch (@Pc(110) Throwable local110) {
						}
						@Pc(116) Class14_Sub7 local116;
						if (local98) {
							local116 = Static677.aClass137_47.method7875(146800640);
						} else {
							local116 = Static677.aClass137_47.method7875(104857600);
						}
						Static677.aClass137_47.method7916(local116);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(127) Throwable local127) {
					@Pc(132) int local132 = Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541();
					if (local132 == 2) {
						Static524.aBoolean637 = true;
					}
					Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_2, 0);
					method1206(arg0, arg1, local132);
					@Pc(149) Object local149 = null;
					var14 = false;
				} finally {
					if (var14) {
						local40 = null;
						if (local12 != null) {
							try {
								local12.method7935();
							} catch (@Pc(349) Throwable local349) {
							}
						}
					}
				}
				if (local12 != null) {
					try {
						local12.method7935();
					} catch (@Pc(329) Throwable local329) {
					}
				}
				return;
			}
			local40 = null;
			if (local12 != null) {
				try {
					local12.method7935();
				} catch (@Pc(339) Throwable local339) {
				}
			}
		}
		Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7543(!arg0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_2, arg2);
		Static509.method7443();
		Static677.aClass137_47.method7930();
		Static677.aClass137_47.X(32);
		Static551.aClass26_7 = Static677.aClass137_47.method7918();
		Static491.aClass26_12 = Static677.aClass137_47.method7918();
		Static541.method8228();
		Static677.aClass137_47.method7897(Static56.aClass14_Sub22_5.aClass21_Sub12_1.method3283() == 1);
		if (Static677.aClass137_47.method7936()) {
			Static154.method2473(Static56.aClass14_Sub22_5.aClass21_Sub29_1.method9295() == 1);
		}
		Static487.method7822(Static26.anInt462 >> 3, Static677.aClass137_47, Static445.anInt6140 >> 3);
		Static677.method9300();
		Static574.aClass235Array1 = null;
		Static6.aBoolean3 = true;
		Static26.aBoolean36 = false;
		Static102.method1817();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(CII)I")
	public static int method1207(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(21) char local21 = Character.toLowerCase(arg0);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}
}
