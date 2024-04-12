import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2149;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt2153;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int anInt2154;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_4;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 19)
	public static void method1472() {
		aClass2_Sub2_Sub2_Sub2_4 = null;
		Class45.aClass40_613 = null;
		Class45.aClass40_615 = null;
		Class45.aClass6_5 = null;
		Class45.aClass40_616 = null;
		Class45.anIntArray469 = null;
		Class45.aClass40_614 = null;
		Class45.anIntArray470 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V", line = 52)
	public static void method1475(@OriginalArg(0) boolean arg0) {
		if (Class25.anInt986 == Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7 && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7 == Class47.anInt1919) {
			Class25.anInt986 = 0;
		}
		@Pc(33) int local33 = Class54.anInt2067;
		if (arg0) {
			local33 = 1;
		}
		for (@Pc(39) int local39 = 0; local39 < local33; local39++) {
			@Pc(47) Class2_Sub2_Sub12_Sub1_Sub1 local47;
			@Pc(45) int local45;
			if (arg0) {
				local45 = 33538048;
				local47 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1;
			} else {
				local47 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Class41.anIntArray408[local39]];
				local45 = Class41.anIntArray408[local39] << 14;
			}
			if (local47 != null && local47.method1544()) {
				@Pc(72) int local72 = local47.anInt2275 >> 7;
				local47.aBoolean104 = false;
				if ((Class1.aBoolean2 && Class54.anInt2067 > 50 || Class54.anInt2067 > 200) && !arg0 && local47.anInt2318 == local47.anInt2290) {
					local47.aBoolean104 = true;
				}
				@Pc(102) int local102 = local47.anInt2284 >> 7;
				if (local72 >= 0 && local72 < 104 && local102 >= 0 && local102 < 104) {
					if (local47.aClass2_Sub2_Sub12_Sub4_1 == null || Class24.anInt2511 < local47.anInt1377 || Class24.anInt2511 >= local47.anInt1381) {
						if ((local47.anInt2275 & 0x7F) == 64 && (local47.anInt2284 & 0x7F) == 64) {
							if (Class2_Sub3.anInt2587 == RuntimeException_Sub1.anIntArrayArray7[local72][local102]) {
								continue;
							}
							RuntimeException_Sub1.anIntArrayArray7[local72][local102] = Class2_Sub3.anInt2587;
						}
						local47.anInt1379 = Static78.method1383(Static1.anInt8, local47.anInt2275, local47.anInt2284);
						Static85.aClass55_1.method1425(Static1.anInt8, local47.anInt2275, local47.anInt2284, local47.anInt1379, 60, local47, local47.anInt2305, local45, local47.aBoolean172);
					} else {
						local47.aBoolean104 = false;
						local47.anInt1379 = Static78.method1383(Static1.anInt8, local47.anInt2275, local47.anInt2284);
						Static85.aClass55_1.method1457(Static1.anInt8, local47.anInt2275, local47.anInt2284, local47.anInt1379, local47, local47.anInt2305, local45, local47.anInt1368, local47.anInt1376, local47.anInt1369, local47.anInt1386);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I", line = 174)
	public static int method1477() {
		return Class12_Sub1.anInt1860++;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 187)
	public static void method1478() {
		Class18_Sub1.aClass47_5.method1330();
	}
}
