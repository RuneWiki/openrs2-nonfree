import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "[I")
	public static final int[] anIntArray471 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString92 = "";

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method7050(@OriginalArg(1) int arg0) {
		Static78.anInt1381 = arg0;
		Static612.aClass168_88.method3862();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
	public static void method7054(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Static661.method9080();
		if (arg1 == 0) {
			Static273.aClass100_6 = Static121.method1790(Static357.aCanvas8, Static63.aClass126_44, Static577.aClass5_Sub19_25.aClass17_Sub29_1.method9175() * 2, 0, Static472.anInterface7_10);
			if (arg0 != null) {
				Static273.aClass100_6.GA(0);
				@Pc(40) Class196 local40 = Static603.method8267(Static600.aClass126_275, Static157.anInt3080);
				@Pc(49) Class70 local49 = Static273.aClass100_6.method8612(local40, Static692.method8280(Static27.aClass126_18, Static157.anInt3080));
				Static285.method4554();
				Static636.method8809(true, Static273.aClass100_6, local40, arg0, local49);
			}
		} else {
			@Pc(62) Class100 local62 = null;
			@Pc(90) Class70 local90;
			if (arg0 != null) {
				local62 = Static121.method1790(Static357.aCanvas8, Static63.aClass126_44, 0, 0, Static472.anInterface7_10);
				local62.GA(0);
				@Pc(81) Class196 local81 = Static603.method8267(Static600.aClass126_275, Static157.anInt3080);
				local90 = local62.method8612(local81, Static692.method8280(Static27.aClass126_18, Static157.anInt3080));
				Static285.method4554();
				Static636.method8809(true, local62, local81, arg0, local90);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static273.aClass100_6 = Static121.method1790(Static357.aCanvas8, Static63.aClass126_44, Static577.aClass5_Sub19_25.aClass17_Sub29_1.method9175() * 2, arg1, Static472.anInterface7_10);
					if (arg0 != null) {
						local62.GA(0);
						@Pc(123) Class196 local123 = Static603.method8267(Static600.aClass126_275, Static157.anInt3080);
						@Pc(132) Class70 local132 = local62.method8612(local123, Static692.method8280(Static27.aClass126_18, Static157.anInt3080));
						Static285.method4554();
						Static636.method8809(true, local62, local123, arg0, local132);
					}
					if (Static273.aClass100_6.method8600()) {
						@Pc(146) boolean local146 = true;
						try {
							local146 = Static506.aClass5_Sub32_2.anInt5619 > 256;
						} catch (@Pc(159) Throwable local159) {
						}
						@Pc(165) Class5_Sub42 local165;
						if (local146) {
							local165 = Static273.aClass100_6.method8659(146800640);
						} else {
							local165 = Static273.aClass100_6.method8659(104857600);
						}
						Static273.aClass100_6.method8604(local165);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(176) Throwable local176) {
					@Pc(181) int local181 = Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102();
					if (local181 == 2) {
						Static331.aBoolean371 = true;
					}
					Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_2, 0);
					method7054(arg0, local181, arg2);
					@Pc(200) Object local200 = null;
					var14 = false;
				} finally {
					if (var14) {
						local90 = null;
						if (local62 != null) {
							try {
								local62.method8666();
							} catch (@Pc(358) Throwable local358) {
							}
						}
					}
				}
				if (local62 != null) {
					try {
						local62.method8666();
					} catch (@Pc(338) Throwable local338) {
					}
				}
				return;
			}
			local90 = null;
			if (local62 != null) {
				try {
					local62.method8666();
				} catch (@Pc(348) Throwable local348) {
				}
			}
		}
		Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8106(!arg2);
		Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_2, arg1);
		Static326.method3786();
		Static273.aClass100_6.method8580();
		Static273.aClass100_6.X(32);
		Static155.aClass10_2 = Static273.aClass100_6.method8623();
		Static196.aClass10_3 = Static273.aClass100_6.method8623();
		Static671.method9114();
		Static273.aClass100_6.method8651(Static577.aClass5_Sub19_25.aClass17_Sub9_1.method3273() == 1);
		if (Static273.aClass100_6.method8661()) {
			Static293.method6183(Static577.aClass5_Sub19_25.aClass17_Sub17_1.method6214() == 1);
		}
		Static601.method8247(Static271.anInt4910 >> 3, Static613.anInt9909 >> 3, Static273.aClass100_6);
		Static8.method134();
		Static386.aBoolean427 = false;
		Static27.aBoolean20 = true;
		Static256.aClass284Array1 = null;
		Static644.method8892();
	}
}
