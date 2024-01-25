import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method2508() {
		if (Static28.aClass346_1 != Static34.aClass346_2) {
			try {
				Static652.method1918("tbrefresh", Static108.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(JI)V")
	public static void method2522(@OriginalArg(0) long arg0) {
		if (Static535.aClass156ArrayArrayArray2 != null) {
			if (Static584.anInt9543 == 1 || Static584.anInt9543 == 5) {
				Static60.method2656(arg0);
			} else if (Static584.anInt9543 == 4) {
				Static341.method5229(arg0);
			}
		}
		Static558.method7838((long) Static235.anInt3998, Static485.aClass126_17);
		if (Static302.anInt4813 != -1) {
			Static493.method7267(Static302.anInt4813);
		}
		for (@Pc(42) int local42 = 0; local42 < Static188.anInt10386; local42++) {
			if (Static609.aBooleanArray58[local42]) {
				Static248.aBooleanArray27[local42] = true;
			}
			Static517.aBooleanArray51[local42] = Static609.aBooleanArray58[local42];
			Static609.aBooleanArray58[local42] = false;
		}
		Static250.anInt4221 = Static235.anInt3998;
		Static173.method2667(-1, (Class357) null, -1);
		Static94.method8737(-1, (Class357) null, -1);
		if (Static302.anInt4813 != -1) {
			Static188.anInt10386 = 0;
			Static151.method2205();
		}
		Static485.aClass126_17.la();
		Static383.method5947(Static485.aClass126_17);
		@Pc(98) int local98 = Static33.method627();
		if (local98 == -1) {
			local98 = Static522.anInt7724;
		}
		if (local98 == -1) {
			local98 = Static631.anInt10289;
		}
		Static362.method5663(local98);
		@Pc(119) int local119 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() << 8;
		Static597.method8366(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125, local119 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315, Static128.anInt2091, local119 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317);
		Static128.anInt2091 = 0;
	}
}
