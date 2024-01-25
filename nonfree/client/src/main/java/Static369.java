import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;IB)V")
	public static void method5768(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static168.method2635();
		if (arg2 == 0) {
			Static485.aClass126_17 = Static64.method1078(0, Static627.aClass5_Sub46_31.aClass11_Sub6_2.method1369() * 2, Static306.anInterface8_5, Static40.aClass384_20, Static181.aCanvas3);
			if (arg1 != null) {
				Static485.aClass126_17.GA(0);
				@Pc(178) Class298 local178 = Static64.method1079(Static360.anInt6361, Static288.aClass384_72);
				@Pc(187) Class6 local187 = Static485.aClass126_17.method7000(local178, Static654.method4059(Static488.aClass384_112, Static360.anInt6361));
				Static639.method8796();
				Static237.method3641(local178, local187, Static485.aClass126_17, true, arg1);
			}
		} else {
			@Pc(9) Class126 local9 = null;
			@Pc(37) Class6 local37;
			if (arg1 != null) {
				local9 = Static64.method1078(0, 0, Static306.anInterface8_5, Static40.aClass384_20, Static181.aCanvas3);
				local9.GA(0);
				@Pc(28) Class298 local28 = Static64.method1079(Static360.anInt6361, Static288.aClass384_72);
				local37 = local9.method7000(local28, Static654.method4059(Static488.aClass384_112, Static360.anInt6361));
				Static639.method8796();
				Static237.method3641(local28, local37, local9, true, arg1);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static485.aClass126_17 = Static64.method1078(arg2, Static627.aClass5_Sub46_31.aClass11_Sub6_2.method1369() * 2, Static306.anInterface8_5, Static40.aClass384_20, Static181.aCanvas3);
					if (arg1 != null) {
						local9.GA(0);
						@Pc(70) Class298 local70 = Static64.method1079(Static360.anInt6361, Static288.aClass384_72);
						@Pc(79) Class6 local79 = local9.method7000(local70, Static654.method4059(Static488.aClass384_112, Static360.anInt6361));
						Static639.method8796();
						Static237.method3641(local70, local79, local9, true, arg1);
					}
					if (Static485.aClass126_17.method7011()) {
						@Pc(93) boolean local93 = true;
						try {
							local93 = Static343.aClass5_Sub28_1.anInt5496 > 256;
						} catch (@Pc(105) Throwable local105) {
						}
						@Pc(111) Class5_Sub23 local111;
						if (local93) {
							local111 = Static485.aClass126_17.method6987(146800640);
						} else {
							local111 = Static485.aClass126_17.method6987(104857600);
						}
						Static485.aClass126_17.method7023(local111);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(122) Throwable local122) {
					@Pc(127) int local127 = Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289();
					if (local127 == 2) {
						Static590.aBoolean775 = true;
					}
					Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_2, 0);
					method5768(arg0, arg1, local127);
					@Pc(144) Object local144 = null;
					var14 = false;
				} finally {
					if (var14) {
						local37 = null;
						if (local9 != null) {
							try {
								local9.method7044();
							} catch (@Pc(342) Throwable local342) {
							}
						}
					}
				}
				if (local9 != null) {
					try {
						local9.method7044();
					} catch (@Pc(322) Throwable local322) {
					}
				}
				return;
			}
			local37 = null;
			if (local9 != null) {
				try {
					local9.method7044();
				} catch (@Pc(332) Throwable local332) {
				}
			}
		}
		Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4291(!arg0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_2, arg2);
		Static621.method8550();
		Static485.aClass126_17.method7046();
		Static485.aClass126_17.X(32);
		Static468.aClass117_6 = Static485.aClass126_17.method6998();
		Static88.aClass117_1 = Static485.aClass126_17.method6998();
		Static587.method8246();
		Static485.aClass126_17.method7048(Static627.aClass5_Sub46_31.aClass11_Sub3_1.method688() == 1);
		if (Static485.aClass126_17.method6976()) {
			Static533.method384(Static627.aClass5_Sub46_31.aClass11_Sub27_1.method7849() == 1);
		}
		Static299.method4347(Static279.anInt4567 >> 3, Static485.aClass126_17, Static111.anInt1752 >> 3);
		Static571.method8044();
		Static335.aClass380Array1 = null;
		Static71.aBoolean80 = false;
		Static9.aBoolean5 = true;
		Static494.method7283();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZ)V")
	public static void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class248 local9 = Static211.aClass248ArrayArray1[arg0][arg1];
		Static578.method8154(local9 == null ? Static235.aClass248_1 : local9, arg2);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public static boolean method5774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static182.method2926(arg0, arg1) | Static122.method1834(arg0, arg1)) & Static85.method1347(arg1, arg0);
	}
}
