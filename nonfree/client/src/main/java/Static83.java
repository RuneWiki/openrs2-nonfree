import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!ae;)V")
	public static void method1567(@OriginalArg(1) Class6_Sub1 arg0) {
		@Pc(17) int local17 = arg0.method6445();
		Static348.aClass97Array1 = new Class97[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			Static348.aClass97Array1[local22] = new Class97();
			Static348.aClass97Array1[local22].anInt2936 = arg0.method6445();
			Static348.aClass97Array1[local22].aString20 = arg0.method6462();
		}
		Static301.anInt5335 = arg0.method6445();
		Static383.anInt6838 = arg0.method6445();
		Static63.anInt1715 = arg0.method6445();
		Static175.aClass152_Sub1Array3 = new Class152_Sub1[Static383.anInt6838 + 1 - Static301.anInt5335];
		for (@Pc(74) int local74 = 0; local74 < Static63.anInt1715; local74++) {
			@Pc(80) int local80 = arg0.method6445();
			@Pc(88) Class152_Sub1 local88 = Static175.aClass152_Sub1Array3[local80] = new Class152_Sub1();
			local88.anInt5629 = arg0.method6433();
			local88.anInt5620 = arg0.method6442();
			local88.anInt5635 = local80 + Static301.anInt5335;
			local88.aString47 = arg0.method6462();
			local88.aString46 = arg0.method6462();
		}
		Static220.anInt3988 = arg0.method6442();
		Static425.aBoolean363 = true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method1573() {
		Static71.aClass244_10.method5969();
		for (@Pc(13) Class6_Sub40 local13 = (Class6_Sub40) Static292.aClass244_25.method5976(); local13 != null; local13 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			if (local13.anInt6722 < 1000) {
				local13.method6525();
				Static71.aClass244_10.method5966(local13);
			}
		}
		Static71.aClass244_10.method5971(Static292.aClass244_25);
		@Pc(41) int local41 = -1;
		@Pc(50) Class6_Sub33 local50 = (Class6_Sub33) Static124.aClass244_13.method5976();
		if (local50 != null) {
			local41 = local50.method5293();
		}
		if (!Static250.aBoolean294) {
			if (local41 == 0 && (Static14.anInt440 == 1 && Static151.anInt3129 > 2 || Static141.method1131())) {
				local41 = 2;
			}
			if (local41 == 2 && Static151.anInt3129 > 0 && local50 != null) {
				if (Static240.aClass239_8 == null && Static378.anInt6770 == 0) {
					Static54.method1217(local50.method5290(), local50.method5287());
				} else {
					Static154.anInt3149 = 2;
				}
			}
			if (local41 == 0 && Static151.anInt3129 > 0) {
				Static226.method4723();
			}
			if (Static240.aClass239_8 != null || Static378.anInt6770 != 0) {
				return;
			}
			Static113.aClass6_Sub40_1 = null;
			Static154.anInt3149 = 0;
			return;
		}
		@Pc(65) int local65;
		@Pc(69) int local69;
		if (local41 == -1) {
			local65 = Static186.aClass50_1.method1436();
			local69 = Static186.aClass50_1.method1446();
			if (local65 < Static187.anInt3647 - 10 || local65 > Static382.anInt4224 + Static187.anInt3647 + 10 || Static200.anInt3772 - 10 > local69 || Static200.anInt3772 + Static230.anInt4199 + 10 < local69) {
				Static250.aBoolean294 = false;
				Static401.method5934(Static382.anInt4224, Static187.anInt3647, Static200.anInt3772, Static230.anInt4199);
			}
		}
		if (local41 != 0) {
			return;
		}
		local65 = Static187.anInt3647;
		local69 = Static200.anInt3772;
		@Pc(118) int local118 = Static382.anInt4224;
		@Pc(122) int local122 = local50.method5290();
		@Pc(126) int local126 = local50.method5287();
		@Pc(128) int local128 = -1;
		@Pc(147) int local147;
		for (@Pc(130) int local130 = 0; local130 < Static151.anInt3129; local130++) {
			if (Static215.aBoolean261) {
				local147 = local69 + (Static151.anInt3129 - local130 - 1) * 16 + 33;
				if (local122 > local65 && local65 + local118 > local122 && local147 - 13 < local126 && local147 + 4 > local126) {
					local128 = local130;
				}
			} else {
				local147 = (Static151.anInt3129 - local130 - 1) * 16 + local69 + 31;
				if (local122 > local65 && local122 < local65 + local118 && local126 > local147 - 13 && local147 + 3 > local126) {
					local128 = local130;
				}
			}
		}
		if (local128 != -1) {
			local147 = 0;
			@Pc(237) Class256 local237 = new Class256(Static292.aClass244_25);
			for (@Pc(242) Class6_Sub40 local242 = (Class6_Sub40) local237.method6288(); local242 != null; local242 = (Class6_Sub40) local237.method6292()) {
				if (local147 == local128) {
					Static202.method3123(local126, local242, local122);
				}
				local147++;
			}
		}
		Static250.aBoolean294 = false;
		Static401.method5934(Static382.anInt4224, Static187.anInt3647, Static200.anInt3772, Static230.anInt4199);
		return;
	}
}
