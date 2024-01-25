import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(JB)V")
	public static void method3554(@OriginalArg(0) long arg0) {
		if (Static421.aClass217ArrayArrayArray5 != null) {
			if (Static254.anInt4612 == 1 || Static254.anInt4612 == 5) {
				Static20.method248(arg0);
			} else if (Static254.anInt4612 == 4) {
				Static394.method5843(arg0);
			}
		}
		Static36.method540((long) Static631.anInt10493, Static213.aClass133_5);
		if (Static337.anInt5727 != -1) {
			Static78.method1352(Static337.anInt5727);
		}
		for (@Pc(38) int local38 = 0; local38 < Static463.anInt7779; local38++) {
			if (Static264.aBooleanArray16[local38]) {
				Static27.aBooleanArray2[local38] = true;
			}
			Static273.aBooleanArray17[local38] = Static264.aBooleanArray16[local38];
			Static264.aBooleanArray16[local38] = false;
		}
		Static444.anInt7588 = Static631.anInt10493;
		Static377.method5548(null, -1, -1);
		Static138.method2020(null, -1, -1);
		if (Static337.anInt5727 != -1) {
			Static463.anInt7779 = 0;
			Static548.method7988();
		}
		Static213.aClass133_5.la();
		Static372.method5484(Static213.aClass133_5);
		@Pc(101) int local101 = Static124.method1880();
		if (local101 == -1) {
			local101 = Static578.anInt4589;
		}
		if (local101 == -1) {
			local101 = Static320.anInt5431;
		}
		Static469.method6945(local101);
		@Pc(121) int local121 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() << 8;
		Static197.method8831(local121 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132, Static435.anInt7492, local121 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231);
		Static435.anInt7492 = 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Lclient!iba;")
	public static Class5_Sub26 method3555() {
		if (Static620.aClass330_46 == null || Static345.aClass199_1 == null) {
			return null;
		}
		Static345.aClass199_1.method4555(Static620.aClass330_46);
		@Pc(18) Class5_Sub26 local18 = (Class5_Sub26) Static345.aClass199_1.method4552();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class299 local28 = Static620.aClass42_4.method937(local18.anInt4151);
			return local28 != null && local28.aBoolean587 && local28.method7064(Static620.anInterface12_2) ? local18 : Static476.method7030();
		}
	}
}
