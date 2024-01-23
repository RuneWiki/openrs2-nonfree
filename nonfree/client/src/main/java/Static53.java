import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public static int anInt1117;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString29 = "Loading world list data";

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method907() {
		if (Static121.anInt2350 != -1) {
			Static39.method719(Static121.anInt2350);
		}
		for (@Pc(17) int local17 = 0; local17 < Static166.anInt3059; local17++) {
			if (Static267.aBooleanArray25[local17]) {
				Static260.aBooleanArray24[local17] = true;
			}
			Static44.aBooleanArray5[local17] = Static267.aBooleanArray25[local17];
			Static267.aBooleanArray25[local17] = false;
		}
		if (Static240.aBoolean369) {
			Static29.aBoolean56 = true;
		}
		Static93.anInt1770 = -1;
		Static256.aClass127_11 = null;
		Static162.anInt2990 = -1;
		Static51.anInt1077 = Static261.anInt5259;
		if (Static121.anInt2350 != -1) {
			Static166.anInt3059 = 0;
			Static54.method925();
		}
		if (Static240.aBoolean369) {
			Static50.method869();
		} else {
			Static213.method3371();
		}
		Static47.anInt5866 = 0;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method908() {
		if (Static28.aClass6_Sub6_Sub2_1 != null && Static28.aClass6_Sub6_Sub2_1.anInt4562 + 64 - Static28.aClass6_Sub6_Sub2_1.method3509() * 64 >> 7 == Static30.anInt663 && Static28.aClass6_Sub6_Sub2_1.anInt4569 + 64 - Static28.aClass6_Sub6_Sub2_1.method3509() * 64 >> 7 == Static24.anInt554) {
			Static30.anInt663 = 0;
		}
		@Pc(44) int local44;
		for (local44 = 0; local44 < 104; local44++) {
			for (@Pc(49) int local49 = 0; local49 < 104; local49++) {
				Static232.anIntArrayArray39[local44][local49] = 0;
			}
		}
		for (local44 = 0; local44 < Static241.anInt4977; local44++) {
			@Pc(75) Class6_Sub6_Sub2 local75 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local44]];
			if (local75 != null) {
				local75.aBoolean341 = false;
			}
		}
		for (local44 = 0; local44 < Static293.anInt5831; local44++) {
			@Pc(104) Class6_Sub6_Sub1 local104 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local44]];
			if (local104 != null) {
				local104.aBoolean341 = false;
			}
		}
	}
}
