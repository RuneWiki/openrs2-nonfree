import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 aClass8_Sub1_Sub3_Sub2_4;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array25;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!ic;")
	private static Class34 aClass34_756 = Static56.method816("Loading textures )2 ");

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt1586 = 0;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array11 = new Class34[500];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_757 = aClass34_756;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public static int anInt1587 = 0;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_758 = Static56.method816("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method935() {
		Static98.aBoolean90 = false;
		Static108.aBoolean98 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method936() {
		aClass34_757 = null;
		aClass8_Sub1_Sub3_Sub2_4 = null;
		aClass34_758 = null;
		aClass34_756 = null;
		aClass34Array11 = null;
		aClass8_Sub1_Sub3_Sub3Array25 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIIII)V")
	public static void method937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == Static132.anInt2834 && arg4 == Static95.anInt2249 && (arg3 == Static88.anInt2344 || !Static108.aBoolean98)) {
			return;
		}
		Static132.anInt2834 = arg2;
		Static95.anInt2249 = arg4;
		Static88.anInt2344 = arg3;
		if (!Static108.aBoolean98) {
			Static88.anInt2344 = 0;
		}
		Static82.method1201(25);
		Static105.method1477(Static113.aClass34_1209, true);
		@Pc(40) int local40 = Static82.anInt1959;
		@Pc(42) int local42 = Static64.anInt2062;
		Static82.anInt1959 = (arg2 - 6) * 8;
		@Pc(53) int local53 = Static82.anInt1959 - local40;
		Static64.anInt2062 = (arg4 - 6) * 8;
		@Pc(66) int local66 = Static64.anInt2062 - local42;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class8_Sub1_Sub1_Sub4_Sub2 local76 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray262[local80] -= local53;
					local76.anIntArray260[local80] -= local66;
				}
				local76.anInt2059 -= local66 * 128;
				local76.anInt2043 -= local53 * 128;
			}
		}
		for (@Pc(126) int local126 = 0; local126 < 2048; local126++) {
			@Pc(132) Class8_Sub1_Sub1_Sub4_Sub1 local132 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local126];
			if (local132 != null) {
				for (@Pc(136) int local136 = 0; local136 < 10; local136++) {
					local132.anIntArray262[local136] -= local53;
					local132.anIntArray260[local136] -= local66;
				}
				local132.anInt2043 -= local53 * 128;
				local132.anInt2059 -= local66 * 128;
			}
		}
		Static42.anInt1024 = arg3;
		@Pc(186) byte local186 = 0;
		@Pc(188) byte local188 = 104;
		Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1226(false, arg0, arg1);
		@Pc(196) byte local196 = 1;
		if (local53 < 0) {
			local188 = -1;
			local196 = -1;
			local186 = 103;
		}
		@Pc(211) byte local211 = 0;
		@Pc(213) byte local213 = 1;
		@Pc(215) byte local215 = 104;
		if (local66 < 0) {
			local211 = 103;
			local215 = -1;
			local213 = -1;
		}
		for (@Pc(225) int local225 = local186; local225 != local188; local225 += local196) {
			for (@Pc(229) int local229 = local211; local229 != local215; local229 += local213) {
				@Pc(235) int local235 = local66 + local229;
				@Pc(240) int local240 = local225 + local53;
				for (@Pc(242) int local242 = 0; local242 < 4; local242++) {
					if (local240 >= 0 && local235 >= 0 && local240 < 104 && local235 < 104) {
						Static21.aClass49ArrayArrayArray1[local242][local225][local229] = Static21.aClass49ArrayArrayArray1[local242][local240][local235];
					} else {
						Static21.aClass49ArrayArrayArray1[local242][local225][local229] = null;
					}
				}
			}
		}
		for (@Pc(316) Class8_Sub18 local316 = (Class8_Sub18) Static20.aClass49_2.method1107(); local316 != null; local316 = (Class8_Sub18) Static20.aClass49_2.method1109()) {
			local316.anInt2367 -= local53;
			local316.anInt2377 -= local66;
			if (local316.anInt2367 < 0 || local316.anInt2377 < 0 || local316.anInt2367 >= 104 || local316.anInt2377 >= 104) {
				local316.method2013();
			}
		}
		Static112.aBoolean100 = false;
		Static86.anInt2179 = -1;
		Static64.anInt2023 = 0;
		if (Static81.anInt1951 != 0) {
			Static81.anInt1951 -= local53;
			Static50.anInt1321 -= local66;
		}
		Static42.aClass49_4.method1105();
		Static82.aClass49_8.method1105();
	}
}
