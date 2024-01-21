import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt555;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public static int anInt559 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!sa;")
	public static Class72 aClass72_3 = new Class72(500);

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public static int anInt566 = 0;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
	public static int[] anIntArray41 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "Lclient!cd;")
	private static Class10 aClass10_262 = Static51.method932("Click to switch");

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_260 = aClass10_262;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_261 = Static51.method932(" weitere Optionen");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
	public static void method376(@OriginalArg(0) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static64.anInt1578; local7++) {
			@Pc(15) Class2_Sub1_Sub3_Sub2_Sub2 local15 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static8.anIntArray15[local7]];
			@Pc(23) int local23 = (Static8.anIntArray15[local7] << 14) + 536870912;
			if (local15 != null && local15.method2467() && local15.aClass2_Sub1_Sub2_1.aBoolean3 == arg0 && local15.aClass2_Sub1_Sub2_1.method58()) {
				@Pc(44) int local44 = local15.anInt3499 >> 7;
				@Pc(49) int local49 = local15.anInt3454 >> 7;
				if (local49 >= 0 && local49 < 104 && local44 >= 0 && local44 < 104) {
					if (local15.anInt3467 == 1 && (local15.anInt3454 & 0x7F) == 64 && (local15.anInt3499 & 0x7F) == 64) {
						if (Static10.anIntArrayArray2[local49][local44] == Static115.anInt2612) {
							continue;
						}
						Static10.anIntArrayArray2[local49][local44] = Static115.anInt2612;
					}
					if (!local15.aClass2_Sub1_Sub2_1.aBoolean4) {
						local23 += Integer.MIN_VALUE;
					}
					Static180.aClass60_1.method1812(Static56.anInt1432, local15.anInt3454, local15.anInt3499, Static178.method2702((local15.anInt3467 - 1) * 64 + local15.anInt3499, (local15.anInt3467 + -1) * 64 + local15.anInt3454, Static56.anInt1432), local15.anInt3467 * 64 + 60 - 64, local15, local15.anInt3489, local23, local15.aBoolean154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method379() {
		for (@Pc(11) Class2_Sub1_Sub3_Sub1 local11 = (Class2_Sub1_Sub3_Sub1) Static177.aClass12_16.method384(); local11 != null; local11 = (Class2_Sub1_Sub3_Sub1) Static177.aClass12_16.method381()) {
			if (local11.anInt128 != Static56.anInt1432 || local11.aBoolean6) {
				local11.method2705();
			} else if (local11.anInt115 <= Static14.anInt386) {
				local11.method85(Static123.anInt2778);
				if (local11.aBoolean6) {
					local11.method2705();
				} else {
					Static180.aClass60_1.method1812(local11.anInt128, local11.anInt122, local11.anInt118, local11.anInt127, 60, local11, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public static void method383() {
		aClass10_262 = null;
		anIntArray40 = null;
		anIntArray41 = null;
		aClass72_3 = null;
		aClass10_261 = null;
		aClass10_260 = null;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	public static void method387() {
		if (Static169.aClass23_12 != null || Static16.aClass23_1 != null) {
			return;
		}
		@Pc(18) int local18 = Static40.anInt976;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(74) int local74;
		if (Static119.aBoolean119) {
			if (local18 != 1) {
				local27 = Static72.anInt1723;
				local29 = Static61.anInt3635;
				if (Static119.anInt2712 - 10 > local27 || Static159.anInt3393 + Static119.anInt2712 + 10 < local27 || Static107.anInt2462 - 10 > local29 || local29 > Static167.anInt2027 + Static107.anInt2462 + 10) {
					Static119.aBoolean119 = false;
					Static98.method1627(Static119.anInt2712, Static107.anInt2462, Static159.anInt3393, Static167.anInt2027);
				}
			}
			if (local18 == 1) {
				local27 = Static119.anInt2712;
				local29 = Static107.anInt2462;
				local74 = Static159.anInt3393;
				@Pc(76) int local76 = Static62.anInt1534;
				@Pc(78) int local78 = Static40.anInt977;
				@Pc(80) int local80 = -1;
				for (@Pc(82) int local82 = 0; local82 < Static46.anInt1135; local82++) {
					@Pc(98) int local98 = local29 + (Static46.anInt1135 - local82 - 1) * 15 + 31;
					if (local76 > local27 && local74 + local27 > local76 && local78 > local98 - 13 && local98 + 3 > local78) {
						local80 = local82;
					}
				}
				if (local80 != -1) {
					Static38.method780(local80);
				}
				Static119.aBoolean119 = false;
				Static98.method1627(Static119.anInt2712, Static107.anInt2462, Static159.anInt3393, Static167.anInt2027);
				return;
			}
			return;
		}
		if (local18 == 1 && Static46.anInt1135 > 0) {
			local27 = Static93.anIntArray229[Static46.anInt1135 - 1];
			if (local27 == 31 || local27 == 20 || local27 == 25 || local27 == 13 || local27 == 4 || local27 == 28 || local27 == 51 || local27 == 14 || local27 == 2 || local27 == 24 || local27 == 12 || local27 == 1001) {
				local74 = Static157.anIntArray359[Static46.anInt1135 - 1];
				local29 = Static177.anIntArray421[Static46.anInt1135 - 1];
				@Pc(228) Class23 local228 = Static102.method2541(local74);
				if (Static54.method983(Static126.method2068(local228)) || Static115.method1842(Static126.method2068(local228))) {
					Static149.anInt3232 = 0;
					Static105.aBoolean108 = false;
					if (Static169.aClass23_12 != null) {
						Static3.method34(Static169.aClass23_12);
					}
					Static169.aClass23_12 = Static102.method2541(local74);
					Static12.anInt366 = Static62.anInt1534;
					Static83.anInt1905 = Static40.anInt977;
					Static19.anInt494 = local29;
					Static3.method34(Static169.aClass23_12);
					return;
				}
			}
		}
		if (local18 == 1 && (Static131.anInt2911 == 1 && Static46.anInt1135 > 2 || Static139.method2197(Static46.anInt1135 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static46.anInt1135 > 0) {
			Static38.method780(Static46.anInt1135 - 1);
		}
		if (local18 != 2 || Static46.anInt1135 <= 0) {
			return;
		}
		Static8.method156();
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
	public static void method389() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(9) int local9 = 0; local9 < Static46.anInt1135 - 1; local9++) {
				if (Static93.anIntArray229[local9] < 1000 && Static93.anIntArray229[local9 + 1] > 1000) {
					@Pc(29) Class10 local29 = Static75.aClass10Array12[local9];
					Static75.aClass10Array12[local9] = Static75.aClass10Array12[local9 + 1];
					local3 = false;
					Static75.aClass10Array12[local9 + 1] = local29;
					@Pc(49) Class10 local49 = Static80.aClass10Array14[local9];
					Static80.aClass10Array14[local9] = Static80.aClass10Array14[local9 + 1];
					Static80.aClass10Array14[local9 + 1] = local49;
					@Pc(67) int local67 = Static93.anIntArray229[local9];
					Static93.anIntArray229[local9] = Static93.anIntArray229[local9 + 1];
					Static93.anIntArray229[local9 + 1] = local67;
					@Pc(85) int local85 = Static177.anIntArray421[local9];
					Static177.anIntArray421[local9] = Static177.anIntArray421[local9 + 1];
					Static177.anIntArray421[local9 + 1] = local85;
					@Pc(103) int local103 = Static157.anIntArray359[local9];
					Static157.anIntArray359[local9] = Static157.anIntArray359[local9 + 1];
					Static157.anIntArray359[local9 + 1] = local103;
					@Pc(121) int local121 = Static27.anIntArray60[local9];
					Static27.anIntArray60[local9] = Static27.anIntArray60[local9 + 1];
					Static27.anIntArray60[local9 + 1] = local121;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!kh;Lclient!kh;B)V")
	public static void method390(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1) {
		Static103.aClass29_45 = arg0;
		Static56.aClass29_28 = arg1;
		Static12.anInt361 = Static56.aClass29_28.method1039(3);
	}
}
