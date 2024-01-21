import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1113 = Static181.method2795("Untersuchen");

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
	public static int anInt3832 = -1;

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1114 = Static181.method2795("");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V")
	public static void method2903(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static162.anInt3930; local3++) {
			@Pc(11) Class24_Sub4_Sub2 local11 = Static47.aClass24_Sub4_Sub2Array1[Static207.anIntArray402[local3]];
			@Pc(20) long local20 = (long) Static207.anIntArray402[local3] << 32 | 0x20000000L;
			if (local11 != null && local11.method2521() && arg0 == local11.aClass2_Sub2_Sub24_1.aBoolean149 && local11.aClass2_Sub2_Sub24_1.method2450()) {
				@Pc(41) int local41 = local11.anInt3349 >> 7;
				@Pc(46) int local46 = local11.anInt3316 >> 7;
				if (local46 >= 0 && local46 < 104 && local41 >= 0 && local41 < 104) {
					if (local11.anInt3332 == 1 && (local11.anInt3316 & 0x7F) == 64 && (local11.anInt3349 & 0x7F) == 64) {
						if (Static167.anIntArrayArray24[local46][local41] == Static213.anInt4243) {
							continue;
						}
						Static167.anIntArrayArray24[local46][local41] = Static213.anInt4243;
					}
					if (!local11.aClass2_Sub2_Sub24_1.aBoolean151) {
						local20 |= Long.MIN_VALUE;
					}
					local11.anInt3303 = Static177.method2711(local11.anInt3316 + local11.anInt3332 * 64 - 64, Static43.anInt1126, local11.anInt3349 + (local11.anInt3332 - 1) * 64);
					Static98.method1682(Static43.anInt1126, local11.anInt3316, local11.anInt3349, local11.anInt3303, (local11.anInt3332 - 1) * 64 + 60, local11, local11.anInt3331, local20, local11.aBoolean156);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!eh;ILclient!eh;)V")
	public static void method2904(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		Static190.aClass28_176 = arg0;
		Static132.aClass28_135 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!qe;)V")
	public static void method2905(@OriginalArg(1) Class83 arg0) {
		if (Static156.anInt4250 >= 2) {
			@Pc(15) int local15;
			@Pc(36) int local36;
			if (arg0.method2398(Static211.aClass83_1201)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(26) Runtime local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static165.method2554(0, Static67.method1268(new Class83[] { Static2.aClass83_11, Static129.method2179(local36), Static205.aClass83_1164 }), null);
			}
			if (arg0.method2398(Static54.aClass83_413)) {
				Static71.method1377();
			}
			if (arg0.method2398(Static31.aClass83_233)) {
				Static167.aBoolean160 = true;
			}
			if (arg0.method2398(Static13.aClass83_76)) {
				Static167.aBoolean160 = false;
			}
			arg0.method2398(Static89.aClass83_1229);
			arg0.method2398(Static25.aClass83_1142);
			if (arg0.method2398(Static131.aClass83_840)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(100) int local100 = 1; local100 < 103; local100++) {
						for (local36 = 1; local36 < 103; local36++) {
							Static117.aClass22Array1[local15].anIntArrayArray4[local100][local36] = 0;
						}
					}
				}
			}
			if (arg0.method2415(Static147.aClass83_1180) && Static214.anInt4256 != 0) {
				Static104.method1813(arg0.method2422(6).method2399());
			}
			if (arg0.method2398(Static83.aClass83_587) && Static214.anInt4256 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2415(Static22.aClass83_138)) {
				Static95.anInt2022 = arg0.method2422(12).method2403().method2399();
				Static165.method2554(0, Static67.method1268(new Class83[] { Static107.aClass83_929, Static129.method2179(Static95.anInt2022) }), null);
			}
			if (arg0.method2398(Static47.aClass83_371)) {
				Static60.aBoolean108 = true;
			}
		}
		Static69.aClass2_Sub3_Sub1_2.method284(57);
		Static69.aClass2_Sub3_Sub1_2.method247(arg0.method2428() - 1);
		Static69.aClass2_Sub3_Sub1_2.method229(arg0.method2422(2));
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method2906() {
		if (Static175.aClass25_5 != null) {
			Static175.aClass25_5.method796();
			Static175.aClass25_5 = null;
		}
		Static129.method2178();
		Static154.method2372();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static117.aClass22Array1[local17].method738();
		}
		Static114.method2021();
		System.gc();
		Static123.method2103();
		Static125.aBoolean136 = false;
		Static118.anInt2711 = -1;
		Static160.method2457();
		Static197.method2972(10);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
	public static void method2909(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static209.anInt4155 && Static36.anInt940 >= arg5 && arg1 >= Static147.anInt4074 && arg0 <= Static61.anInt1501) {
			if (arg4 == 1) {
				Static11.method292(arg5, arg0, arg3, arg2, arg1);
			} else {
				Static57.method1118(arg5, arg2, arg3, arg4, arg1, arg0);
			}
		} else if (arg4 == 1) {
			Static94.method1608(arg2, arg1, arg3, arg5, arg0);
		} else {
			Static167.method2590(arg2, arg4, arg3, arg1, arg5, arg0);
		}
	}
}
