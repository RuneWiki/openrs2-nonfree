import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Lclient!ge;")
	public static Class110 aClass110_3;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Z")
	public static final boolean aBoolean551 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method5415(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		Static640.method8632();
		if (arg0 == 0) {
			Static47.aClass33_3 = Static322.method5439(Static641.anInterface5_12, Static393.aClass181_30, Static552.aClass3_Sub48_30.aClass23_Sub24_2.method6648() * 2, Static177.aCanvas10, 0);
			if (arg1 != null) {
				Static47.aClass33_3.GA(0);
				@Pc(178) Class315 local178 = Static256.method4821(Static151.anInt3728, Static340.aClass181_62);
				@Pc(187) Class25 local187 = Static47.aClass33_3.method6202(local178, Static649.method607(Static150.aClass181_34, Static151.anInt3728));
				Static140.method3138();
				Static646.method8660(true, local178, Static47.aClass33_3, local187, arg1);
			}
		} else {
			@Pc(9) Class33 local9 = null;
			@Pc(37) Class25 local37;
			if (arg1 != null) {
				local9 = Static322.method5439(Static641.anInterface5_12, Static393.aClass181_30, 0, Static177.aCanvas10, 0);
				local9.GA(0);
				@Pc(28) Class315 local28 = Static256.method4821(Static151.anInt3728, Static340.aClass181_62);
				local37 = local9.method6202(local28, Static649.method607(Static150.aClass181_34, Static151.anInt3728));
				Static140.method3138();
				Static646.method8660(true, local28, local9, local37, arg1);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static47.aClass33_3 = Static322.method5439(Static641.anInterface5_12, Static393.aClass181_30, Static552.aClass3_Sub48_30.aClass23_Sub24_2.method6648() * 2, Static177.aCanvas10, arg0);
					if (arg1 != null) {
						local9.GA(0);
						@Pc(70) Class315 local70 = Static256.method4821(Static151.anInt3728, Static340.aClass181_62);
						@Pc(79) Class25 local79 = local9.method6202(local70, Static649.method607(Static150.aClass181_34, Static151.anInt3728));
						Static140.method3138();
						Static646.method8660(true, local70, local9, local79, arg1);
					}
					if (Static47.aClass33_3.method6237()) {
						@Pc(93) boolean local93 = true;
						try {
							local93 = Static2.aClass3_Sub23_1.anInt4394 > 256;
						} catch (@Pc(105) Throwable local105) {
						}
						@Pc(111) Class3_Sub5 local111;
						if (local93) {
							local111 = Static47.aClass33_3.method6158(146800640);
						} else {
							local111 = Static47.aClass33_3.method6158(104857600);
						}
						Static47.aClass33_3.method6196(local111);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(122) Throwable local122) {
					@Pc(127) int local127 = Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152();
					if (local127 == 2) {
						Static111.aBoolean235 = true;
					}
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_2, 0);
					method5415(local127, arg1, arg2);
					@Pc(144) Object local144 = null;
					var14 = false;
				} finally {
					if (var14) {
						local37 = null;
						if (local9 != null) {
							try {
								local9.method6151();
							} catch (@Pc(336) Throwable local336) {
							}
						}
					}
				}
				if (local9 != null) {
					try {
						local9.method6151();
					} catch (@Pc(316) Throwable local316) {
					}
				}
				return;
			}
			local37 = null;
			if (local9 != null) {
				try {
					local9.method6151();
				} catch (@Pc(326) Throwable local326) {
				}
			}
		}
		Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5156(!arg2);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_2, arg0);
		Static577.method6364();
		Static47.aClass33_3.method6212();
		Static47.aClass33_3.X(32);
		Static39.aClass47_1 = Static47.aClass33_3.method6223();
		Static456.aClass47_9 = Static47.aClass33_3.method6223();
		Static545.method7730();
		Static47.aClass33_3.method6197(Static552.aClass3_Sub48_30.aClass23_Sub27_1.method7666() == 1);
		if (Static47.aClass33_3.method6218()) {
			Static278.method6285(Static552.aClass3_Sub48_30.aClass23_Sub19_1.method5517() == 1);
		}
		Static390.method6149(Static47.aClass33_3, Static394.anInt7540 >> 3, Static462.anInt8391 >> 3);
		Static34.method625();
		Static355.aBoolean601 = false;
		Static439.aBoolean678 = true;
		Static531.aClass288Array1 = null;
		Static424.method8061();
	}
}
