import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "Lclient!hm;")
	public static Class107 aClass107_1 = null;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "(I)V")
	public static void method490() {
		Static305.anInt5076 = 0;
		@Pc(17) int local17 = (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7) + Static315.anInt5207;
		@Pc(24) int local24 = Static47.anInt676 + (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static305.anInt5076 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static305.anInt5076 = 1;
		}
		if (Static305.anInt5076 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static305.anInt5076 = 0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)V")
	public static void method491() {
		Static244.method232((long) Static98.anInt1304, Static186.aClass117_3);
		if (Static118.anInt1785 != -1) {
			Static425.method5421(Static118.anInt1785);
		}
		for (@Pc(20) int local20 = 0; local20 < Static88.anInt1187; local20++) {
			if (Static179.aBooleanArray69[local20]) {
				Static150.aBooleanArray107[local20] = true;
			}
			Static106.aBooleanArray162[local20] = Static179.aBooleanArray69[local20];
			Static179.aBooleanArray69[local20] = false;
		}
		Static378.anInt6079 = Static98.anInt1304;
		if (Static186.aClass117_3.method5689()) {
			Static223.aBoolean510 = true;
		}
		if (Static118.anInt1785 != -1) {
			Static88.anInt1187 = 0;
			Static224.method3209();
		}
		Static186.aClass117_3.va();
		Static156.method2075(Static186.aClass117_3);
		@Pc(71) int local71 = Static82.method1006();
		if (local71 == -1) {
			local71 = Static211.anInt5191;
		}
		if (local71 == -1) {
			local71 = Static379.anInt122;
		}
		Static462.method5972(local71);
		Static71.anInt1041 = 0;
	}

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "(I)V")
	public static void method492() {
		Static424.aClass117_11.method5671(Static416.aFloat82, Static30.aFloat4, Static374.aFloat80);
	}
}
