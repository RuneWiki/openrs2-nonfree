import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
	public static int anInt802;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_359 = Static187.method3089("3D)2Softwarebibliothek gestartet");

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
	public static int anInt799 = 0;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "[I")
	public static final int[] anIntArray61 = new int[200];

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "[I")
	public static final int[] anIntArray62 = new int[128];

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_360 = Static187.method3089("Login");

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_361 = aClass92_360;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIBI)V")
	public static void method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static183.anInt3928 == arg1 && Static145.anInt2925 == arg0 && (arg4 == Static102.anInt2214 || !Static111.aBoolean141)) {
			return;
		}
		Static145.anInt2925 = arg0;
		Static183.anInt3928 = arg1;
		Static102.anInt2214 = arg4;
		if (!Static111.aBoolean141) {
			Static102.anInt2214 = 0;
		}
		Static48.method862(25);
		Static80.method1240(Static26.aClass92_265, true);
		@Pc(40) int local40 = Static100.anInt2141;
		@Pc(42) int local42 = Static138.anInt2800;
		Static138.anInt2800 = (arg0 - 6) * 8;
		Static100.anInt2141 = (arg1 - 6) * 8;
		@Pc(59) int local59 = Static138.anInt2800 - local42;
		@Pc(64) int local64 = Static100.anInt2141 - local40;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class8_Sub3_Sub2 local76 = Static177.aClass8_Sub3_Sub2Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray309[local80] -= local64;
					local76.anIntArray312[local80] -= local59;
				}
				local76.anInt3606 -= local59 * 128;
				local76.anInt3600 -= local64 * 128;
			}
		}
		for (@Pc(126) int local126 = 0; local126 < 2048; local126++) {
			@Pc(132) Class8_Sub3_Sub1 local132 = Static47.aClass8_Sub3_Sub1Array1[local126];
			if (local132 != null) {
				for (@Pc(136) int local136 = 0; local136 < 10; local136++) {
					local132.anIntArray309[local136] -= local64;
					local132.anIntArray312[local136] -= local59;
				}
				local132.anInt3606 -= local59 * 128;
				local132.anInt3600 -= local64 * 128;
			}
		}
		Static192.anInt4180 = arg4;
		@Pc(184) byte local184 = 0;
		Static15.aClass8_Sub3_Sub1_1.method2678(arg2, arg3, false);
		@Pc(192) byte local192 = 104;
		@Pc(194) byte local194 = 1;
		if (local64 < 0) {
			local192 = -1;
			local184 = 103;
			local194 = -1;
		}
		@Pc(212) byte local212 = 0;
		@Pc(214) byte local214 = 104;
		@Pc(216) byte local216 = 1;
		if (local59 < 0) {
			local212 = 103;
			local216 = -1;
			local214 = -1;
		}
		for (@Pc(229) int local229 = local184; local229 != local192; local229 += local194) {
			for (@Pc(233) int local233 = local212; local233 != local214; local233 += local216) {
				@Pc(239) int local239 = local233 + local59;
				@Pc(243) int local243 = local64 + local229;
				for (@Pc(245) int local245 = 0; local245 < 4; local245++) {
					if (local243 >= 0 && local239 >= 0 && local243 < 104 && local239 < 104) {
						Static210.aClass20ArrayArrayArray1[local245][local229][local233] = Static210.aClass20ArrayArrayArray1[local245][local243][local239];
					} else {
						Static210.aClass20ArrayArrayArray1[local245][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(309) Class1_Sub8 local309 = (Class1_Sub8) Static73.aClass20_6.method467(); local309 != null; local309 = (Class1_Sub8) Static73.aClass20_6.method468()) {
			local309.anInt1251 -= local64;
			local309.anInt1250 -= local59;
			if (local309.anInt1251 < 0 || local309.anInt1250 < 0 || local309.anInt1251 >= 104 || local309.anInt1250 >= 104) {
				local309.method3414();
			}
		}
		Static190.anInt4134 = -1;
		if (Static120.anInt2555 != 0) {
			Static120.anInt2555 -= local64;
			Static189.anInt4125 -= local59;
		}
		Static40.aBoolean199 = false;
		Static45.anInt1163 = 0;
		Static89.aClass20_9.method469();
		Static69.aClass20_5.method469();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ka;Z)Lclient!vb;")
	public static Class90 method605(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(3) Class90 local3 = new Class90();
		local3.anInt4209 = arg0.method3023();
		local3.aClass1_Sub3_Sub19_1 = Static68.method1065(local3.anInt4209);
		return local3;
	}
}
