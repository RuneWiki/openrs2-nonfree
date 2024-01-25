import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZIILjava/lang/String;)V")
	public static void method7201(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static310.method4804();
		if (arg1 == 0) {
			Static213.aClass133_5 = Static173.method2688(Static5.aClass207_2, Static83.aCanvas14, Static97.aClass5_Sub25_8.aClass6_Sub23_2.method7627() * 2, 0, Static31.anInterface3_1);
			if (arg2 != null) {
				Static213.aClass133_5.GA(0);
				@Pc(180) Class272 local180 = Static285.method4512(Static164.anInt2742, Static40.aClass207_73);
				@Pc(189) Class55 local189 = Static213.aClass133_5.method7255(local180, Static649.method2892(Static441.aClass207_89, Static164.anInt2742));
				Static181.method2785();
				Static462.method6852(local180, arg2, Static213.aClass133_5, local189, true);
			}
		} else {
			@Pc(9) Class133 local9 = null;
			@Pc(37) Class55 local37;
			if (arg2 != null) {
				local9 = Static173.method2688(Static5.aClass207_2, Static83.aCanvas14, 0, 0, Static31.anInterface3_1);
				local9.GA(0);
				@Pc(28) Class272 local28 = Static285.method4512(Static164.anInt2742, Static40.aClass207_73);
				local37 = local9.method7255(local28, Static649.method2892(Static441.aClass207_89, Static164.anInt2742));
				Static181.method2785();
				Static462.method6852(local28, arg2, local9, local37, true);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static213.aClass133_5 = Static173.method2688(Static5.aClass207_2, Static83.aCanvas14, Static97.aClass5_Sub25_8.aClass6_Sub23_2.method7627() * 2, arg1, Static31.anInterface3_1);
					if (arg2 != null) {
						local9.GA(0);
						@Pc(70) Class272 local70 = Static285.method4512(Static164.anInt2742, Static40.aClass207_73);
						@Pc(79) Class55 local79 = local9.method7255(local70, Static649.method2892(Static441.aClass207_89, Static164.anInt2742));
						Static181.method2785();
						Static462.method6852(local70, arg2, local9, local79, true);
					}
					if (Static213.aClass133_5.method7314()) {
						@Pc(93) boolean local93 = true;
						try {
							local93 = Static399.aClass5_Sub28_1.anInt4840 > 256;
						} catch (@Pc(105) Throwable local105) {
						}
						@Pc(111) Class5_Sub6 local111;
						if (local93) {
							local111 = Static213.aClass133_5.method7300(146800640);
						} else {
							local111 = Static213.aClass133_5.method7300(104857600);
						}
						Static213.aClass133_5.method7235(local111);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(122) Throwable local122) {
					@Pc(127) int local127 = Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988();
					if (local127 == 2) {
						Static32.aBoolean18 = true;
					}
					Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub11_1);
					method7201(arg0, local127, arg2);
					@Pc(144) Object local144 = null;
					var14 = false;
				} finally {
					if (var14) {
						local37 = null;
						if (local9 != null) {
							try {
								local9.method7295();
							} catch (@Pc(334) Throwable local334) {
							}
						}
					}
				}
				if (local9 != null) {
					try {
						local9.method7295();
					} catch (@Pc(314) Throwable local314) {
					}
				}
				return;
			}
			local37 = null;
			if (local9 != null) {
				try {
					local9.method7295();
				} catch (@Pc(324) Throwable local324) {
				}
			}
		}
		Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3982(!arg0);
		Static97.aClass5_Sub25_8.method3683(arg1, Static97.aClass5_Sub25_8.aClass6_Sub11_1);
		Static196.method3499();
		Static213.aClass133_5.method7266();
		Static213.aClass133_5.X(32);
		Static16.aClass113_2 = Static213.aClass133_5.method7275();
		Static318.aClass113_4 = Static213.aClass133_5.method7275();
		Static364.method5405();
		Static213.aClass133_5.method7289(Static97.aClass5_Sub25_8.aClass6_Sub22_1.method6865() == 1);
		if (Static213.aClass133_5.method7317()) {
			Static58.method967(Static97.aClass5_Sub25_8.aClass6_Sub3_1.method308() == 1);
		}
		Static235.method3914(Static448.anInt7637 >> 3, Static326.anInt5541 >> 3, Static213.aClass133_5);
		Static507.method7588();
		Static339.aBoolean417 = false;
		Static632.aClass142Array1 = null;
		Static532.aBoolean663 = true;
		Static18.method238();
	}
}
