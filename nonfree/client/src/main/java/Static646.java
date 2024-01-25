import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public static int anInt10250 = 0;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "[I")
	public static final int[] anIntArray902 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
	public static void method8976(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		Static391.method8981();
		if (arg1 == 0) {
			Static674.aClass13_22 = Static550.method7865(0, Static512.aClass15_130, Static35.anInterface4_3, Static24.aClass3_Sub22_4.aClass6_Sub17_1.method5285() * 2, Static126.aCanvas6);
			if (arg0 != null) {
				Static674.aClass13_22.GA(0);
				@Pc(180) Class88 local180 = Static617.method8708(Static218.aClass15_62, Static540.anInt8898);
				@Pc(189) Class69 local189 = Static674.aClass13_22.method8515(local180, Static682.method2750(Static369.aClass15_97, Static540.anInt8898));
				Static633.method8836();
				Static21.method603(local189, Static674.aClass13_22, local180, true, arg0);
			}
		} else {
			@Pc(9) Class13 local9 = null;
			@Pc(37) Class69 local37;
			if (arg0 != null) {
				local9 = Static550.method7865(0, Static512.aClass15_130, Static35.anInterface4_3, 0, Static126.aCanvas6);
				local9.GA(0);
				@Pc(28) Class88 local28 = Static617.method8708(Static218.aClass15_62, Static540.anInt8898);
				local37 = local9.method8515(local28, Static682.method2750(Static369.aClass15_97, Static540.anInt8898));
				Static633.method8836();
				Static21.method603(local37, local9, local28, true, arg0);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static674.aClass13_22 = Static550.method7865(arg1, Static512.aClass15_130, Static35.anInterface4_3, Static24.aClass3_Sub22_4.aClass6_Sub17_1.method5285() * 2, Static126.aCanvas6);
					if (arg0 != null) {
						local9.GA(0);
						@Pc(70) Class88 local70 = Static617.method8708(Static218.aClass15_62, Static540.anInt8898);
						@Pc(79) Class69 local79 = local9.method8515(local70, Static682.method2750(Static369.aClass15_97, Static540.anInt8898));
						Static633.method8836();
						Static21.method603(local79, local9, local70, true, arg0);
					}
					if (Static674.aClass13_22.method8474()) {
						@Pc(93) boolean local93 = true;
						try {
							local93 = Static241.aClass3_Sub10_1.anInt1059 > 256;
						} catch (@Pc(105) Throwable local105) {
						}
						@Pc(111) Class3_Sub5 local111;
						if (local93) {
							local111 = Static674.aClass13_22.method8469(146800640);
						} else {
							local111 = Static674.aClass13_22.method8469(104857600);
						}
						Static674.aClass13_22.method8446(local111);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(122) Throwable local122) {
					@Pc(127) int local127 = Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970();
					if (local127 == 2) {
						Static311.aBoolean377 = true;
					}
					Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub21_1);
					method8976(arg0, local127, arg2);
					@Pc(146) Object local146 = null;
					var14 = false;
				} finally {
					if (var14) {
						local37 = null;
						if (local9 != null) {
							try {
								local9.method8459();
							} catch (@Pc(342) Throwable local342) {
							}
						}
					}
				}
				if (local9 != null) {
					try {
						local9.method8459();
					} catch (@Pc(322) Throwable local322) {
					}
				}
				return;
			}
			local37 = null;
			if (local9 != null) {
				try {
					local9.method8459();
				} catch (@Pc(332) Throwable local332) {
				}
			}
		}
		Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6966(!arg2);
		Static24.aClass3_Sub22_4.method2840(arg1, Static24.aClass3_Sub22_4.aClass6_Sub21_1);
		Static639.method8892();
		Static674.aClass13_22.method8449();
		Static674.aClass13_22.X(32);
		Static63.aClass239_1 = Static674.aClass13_22.method8461();
		Static101.aClass239_2 = Static674.aClass13_22.method8461();
		Static585.method8258();
		Static674.aClass13_22.method8505(Static24.aClass3_Sub22_4.aClass6_Sub6_1.method3210() == 1);
		if (Static674.aClass13_22.method8466()) {
			Static561.method7968(Static24.aClass3_Sub22_4.aClass6_Sub10_1.method4135() == 1);
		}
		Static14.method193(Static158.anInt927 >> 3, Static515.anInt8292 >> 3, Static674.aClass13_22);
		Static225.method3837();
		Static156.aBoolean235 = true;
		Static475.aClass270Array1 = null;
		Static275.aBoolean358 = false;
		Static643.method8930();
	}
}
