import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!id", name = "W", descriptor = "Lclient!r;")
	public static Class61 aClass61_439 = Static129.method2060("Hierhin gehen");

	@OriginalMember(owner = "client!id", name = "X", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BIIII)V")
	public static void method979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static129.anInt3251; local3++) {
			if (Static56.anIntArray209[local3] + Static82.anIntArray288[local3] > arg2 && Static82.anIntArray288[local3] < arg3 + arg2 && Static40.anIntArray176[local3] + Static81.anIntArray444[local3] > arg0 && Static40.anIntArray176[local3] < arg1 + arg0) {
				Static60.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method983() {
		@Pc(13) int local13;
		if (Static38.anInt1481 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static38.anInt1481 > 768) {
					Static85.anIntArray293[local13] = Static17.method398(Static107.anIntArray338[local13], 1024 - Static38.anInt1481, Static55.anIntArray208[local13]);
				} else if (Static38.anInt1481 > 256) {
					Static85.anIntArray293[local13] = Static55.anIntArray208[local13];
				} else {
					Static85.anIntArray293[local13] = Static17.method398(Static55.anIntArray208[local13], 256 - Static38.anInt1481, Static107.anIntArray338[local13]);
				}
			}
		} else if (Static62.anInt1530 <= 0) {
			for (local13 = 0; local13 < 256; local13++) {
				Static85.anIntArray293[local13] = Static107.anIntArray338[local13];
			}
		} else {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static62.anInt1530 > 768) {
					Static85.anIntArray293[local13] = Static17.method398(Static107.anIntArray338[local13], 1024 - Static62.anInt1530, Static43.anIntArray180[local13]);
				} else if (Static62.anInt1530 <= 256) {
					Static85.anIntArray293[local13] = Static17.method398(Static43.anIntArray180[local13], 256 - Static62.anInt1530, Static107.anIntArray338[local13]);
				} else {
					Static85.anIntArray293[local13] = Static43.anIntArray180[local13];
				}
			}
		}
		local13 = 0;
		@Pc(150) int local150 = Static54.aClass5_Sub2_Sub1_Sub4_4.anInt3194 * 9;
		@Pc(152) int local152 = 0;
		@Pc(169) int local169;
		@Pc(182) int local182;
		@Pc(189) int local189;
		@Pc(195) int local195;
		@Pc(207) int local207;
		@Pc(211) int local211;
		for (@Pc(154) int local154 = 1; local154 < 255; local154++) {
			local169 = (256 - local154) * Static41.anIntArray292[local154] / 256 + 22;
			if (local169 < 0) {
				local169 = 0;
			}
			local13 += local169;
			for (local182 = local169; local182 < 128; local182++) {
				local189 = Static133.anIntArray448[local13++];
				local195 = Static54.aClass5_Sub2_Sub1_Sub4_4.anIntArray386[local150++];
				if (local189 == 0) {
					Static32.aClass5_Sub2_Sub1_Sub4_3.anIntArray386[local152++] = local195;
				} else {
					local207 = local189;
					local211 = 256 - local189;
					local189 = Static85.anIntArray293[local189];
					Static32.aClass5_Sub2_Sub1_Sub4_3.anIntArray386[local152++] = ((local195 & 0xFF00FF) * local211 + local207 * (local189 & 0xFF00FF) & 0xFF00FF00) + ((local195 & 0xFF00) * local211 + local207 * (local189 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local189 = 0; local189 < local169; local189++) {
				Static32.aClass5_Sub2_Sub1_Sub4_3.anIntArray386[local152++] = Static54.aClass5_Sub2_Sub1_Sub4_4.anIntArray386[local150++];
			}
			local150 += Static54.aClass5_Sub2_Sub1_Sub4_4.anInt3194 - 128;
		}
		local13 = 0;
		local152 = 0;
		Static32.aClass5_Sub2_Sub1_Sub4_3.method2026(0, 9);
		local150 = Static54.aClass5_Sub2_Sub1_Sub4_4.anInt3194 * 9 + 128;
		for (local169 = 1; local169 < 255; local169++) {
			local182 = Static41.anIntArray292[local169] * (256 - local169) / 256 + 22;
			if (local182 < 0) {
				local182 = 0;
			}
			for (local189 = 0; local189 < local182; local189++) {
				@Pc(336) int local336 = local152++;
				local150--;
				Static97.aClass5_Sub2_Sub1_Sub4_6.anIntArray386[local336] = Static54.aClass5_Sub2_Sub1_Sub4_4.anIntArray386[local150];
			}
			for (local195 = local182; local195 < 128; local195++) {
				local207 = Static133.anIntArray448[local13++];
				local150--;
				local211 = Static54.aClass5_Sub2_Sub1_Sub4_4.anIntArray386[local150];
				if (local207 == 0) {
					Static97.aClass5_Sub2_Sub1_Sub4_6.anIntArray386[local152++] = local211;
				} else {
					@Pc(378) int local378 = local207;
					@Pc(382) int local382 = 256 - local207;
					local207 = Static85.anIntArray293[local207];
					Static97.aClass5_Sub2_Sub1_Sub4_6.anIntArray386[local152++] = (local378 * (local207 & 0xFF00FF) + local382 * (local211 & 0xFF00FF) & 0xFF00FF00) + (local378 * (local207 & 0xFF00) + ((local211 & 0xFF00) * local382) & 0xFF0000) >> 8;
				}
			}
			local13 += local182;
			local150 += Static54.aClass5_Sub2_Sub1_Sub4_4.anInt3194 + 128;
		}
		Static97.aClass5_Sub2_Sub1_Sub4_6.method2026(637, 9);
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
	public static void method984() {
		aClass61_439 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!ke;I)Lclient!r;")
	public static Class61 method985(@OriginalArg(0) Class5_Sub11 arg0) {
		if (Static27.method1860(Static42.method755(arg0)) == 0) {
			return null;
		} else if (arg0.aClass61_509 == null || arg0.aClass61_509.method1716().method1733() == 0) {
			return Static30.aBoolean26 ? Static67.aClass61_507 : null;
		} else {
			return arg0.aClass61_509;
		}
	}
}
