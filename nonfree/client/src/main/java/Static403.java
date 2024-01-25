import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
	public static int anInt7063;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	public static int anInt7064;

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "[I")
	public static int[] anIntArray541;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
	public static void method5615() {
		try {
			@Pc(17) int local17;
			if (Static11.anInt142 == 1) {
				local17 = Static97.aClass1_Sub7_Sub2_2.method531();
				if (local17 > 0 && Static97.aClass1_Sub7_Sub2_2.method508()) {
					local17 -= Static290.anInt5018;
					if (local17 < 0) {
						local17 = 0;
					}
					Static97.aClass1_Sub7_Sub2_2.method526(local17);
					return;
				}
				Static97.aClass1_Sub7_Sub2_2.method520();
				Static97.aClass1_Sub7_Sub2_2.method513();
				Static202.aClass1_Sub23_2 = null;
				Static214.aClass84_1 = null;
				if (Static500.aClass270_114 == null) {
					Static11.anInt142 = 0;
				} else {
					Static11.anInt142 = 2;
				}
			}
			if (Static11.anInt142 == 3) {
				local17 = Static97.aClass1_Sub7_Sub2_2.method531();
				if (local17 < anInt7063 && Static97.aClass1_Sub7_Sub2_2.method508()) {
					local17 += Static181.anInt3185;
					if (anInt7063 < local17) {
						local17 = anInt7063;
					}
					Static97.aClass1_Sub7_Sub2_2.method526(local17);
				} else {
					Static11.anInt142 = 0;
					Static181.anInt3185 = 0;
				}
			}
		} catch (@Pc(91) Exception local91) {
			local91.printStackTrace();
			Static97.aClass1_Sub7_Sub2_2.method520();
			Static11.anInt142 = 0;
			Static500.aClass270_114 = null;
			Static214.aClass84_1 = null;
			Static202.aClass1_Sub23_2 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public static void method5616() {
		Static246.aClass22Array14 = null;
		Static147.aClass22Array10 = null;
		Static568.aClass22Array20 = null;
		Static229.aClass22Array13 = null;
		Static74.aClass22_4 = null;
		Static444.aClass22Array15 = null;
		Static216.aClass22Array12 = null;
		Static50.aClass22Array2 = null;
		Static126.aClass22Array8 = null;
		Static442.aClass64_12 = null;
		Static369.aClass22Array18 = null;
		Static418.aClass64_11 = null;
		Static28.aClass64_1 = null;
		Static200.aClass22_20 = null;
		Static172.aClass22Array11 = null;
		Static324.aClass22Array17 = null;
		Static446.aClass22Array19 = null;
		Static308.aClass22Array16 = null;
	}
}
