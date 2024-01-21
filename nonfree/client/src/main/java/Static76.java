import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2149;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt2153;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int anInt2154;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_4;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_613 = Static13.method257(" with @yel@");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static int[] anIntArray469 = new int[100];

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
	public static int[] anIntArray470 = new int[128];

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_614 = Static13.method257("You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3");

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ba;")
	public static Class6 aClass6_5 = new Class6(32);

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_615 = Static13.method257("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_616 = Static13.method257("Loading config )2 ");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method1472() {
		aClass2_Sub2_Sub2_Sub2_4 = null;
		aClass40_613 = null;
		aClass40_615 = null;
		aClass6_5 = null;
		aClass40_616 = null;
		anIntArray469 = null;
		aClass40_614 = null;
		anIntArray470 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V")
	public static void method1475(@OriginalArg(0) boolean arg0) {
		if (Static38.anInt986 == Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7 && Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7 == Static80.anInt1919) {
			Static38.anInt986 = 0;
		}
		@Pc(33) int local33 = Static88.anInt2067;
		if (arg0) {
			local33 = 1;
		}
		for (@Pc(39) int local39 = 0; local39 < local33; local39++) {
			@Pc(47) Class2_Sub2_Sub12_Sub1_Sub1 local47;
			@Pc(45) int local45;
			if (arg0) {
				local45 = 33538048;
				local47 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1;
			} else {
				local47 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Static73.anIntArray408[local39]];
				local45 = Static73.anIntArray408[local39] << 14;
			}
			if (local47 != null && local47.method1544()) {
				@Pc(72) int local72 = local47.anInt2275 >> 7;
				local47.aBoolean104 = false;
				if ((Static1.aBoolean2 && Static88.anInt2067 > 50 || Static88.anInt2067 > 200) && !arg0 && local47.anInt2318 == local47.anInt2290) {
					local47.aBoolean104 = true;
				}
				@Pc(102) int local102 = local47.anInt2284 >> 7;
				if (local72 >= 0 && local72 < 104 && local102 >= 0 && local102 < 104) {
					if (local47.aClass2_Sub2_Sub12_Sub4_1 == null || Static107.anInt2511 < local47.anInt1377 || Static107.anInt2511 >= local47.anInt1381) {
						if ((local47.anInt2275 & 0x7F) == 64 && (local47.anInt2284 & 0x7F) == 64) {
							if (Static22.anInt2587 == Static14.anIntArrayArray7[local72][local102]) {
								continue;
							}
							Static14.anIntArrayArray7[local72][local102] = Static22.anInt2587;
						}
						local47.anInt1379 = Static86.method1383(Static1.anInt8, local47.anInt2275, local47.anInt2284);
						Static93.aClass55_1.method1425(Static1.anInt8, local47.anInt2275, local47.anInt2284, local47.anInt1379, 60, local47, local47.anInt2305, local45, local47.aBoolean172);
					} else {
						local47.aBoolean104 = false;
						local47.anInt1379 = Static86.method1383(Static1.anInt8, local47.anInt2275, local47.anInt2284);
						Static93.aClass55_1.method1457(Static1.anInt8, local47.anInt2275, local47.anInt2284, local47.anInt1379, local47, local47.anInt2305, local45, local47.anInt1368, local47.anInt1376, local47.anInt1369, local47.anInt1386);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
	public static int method1477() {
		return Static15.anInt1860++;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method1478() {
		Static20.aClass47_5.method1330();
	}
}
