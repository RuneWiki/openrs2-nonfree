import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	public static int anInt3616;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
	public static int anInt3622 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBII)I")
	public static int method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static64.aBoolean132) {
			arg3 = 1000000;
			Static64.aBoolean132 = false;
		}
		@Pc(18) Class43 local18 = Static54.aClass43ArrayArray1[arg1][arg0];
		@Pc(21) float local21 = local18.aFloat29;
		@Pc(24) int local24 = local18.anInt1343;
		@Pc(27) float local27 = local18.aFloat28;
		@Pc(30) int local30 = local18.anInt1336;
		@Pc(40) float local40 = local18.aFloat27 * ((float) arg2 * 0.1F + 0.7F);
		@Pc(43) int local43 = local18.anInt1339;
		if (!Static222.aBoolean379) {
			local43 = 0;
		}
		@Pc(50) Class1_Sub5_Sub18 local50 = local18.aClass1_Sub5_Sub18_4;
		@Pc(53) float local53 = local18.aFloat24;
		@Pc(56) float local56 = local18.aFloat26;
		@Pc(59) float local59 = local18.aFloat25;
		if (local24 != Static132.anInt2607 || local40 != Static280.aFloat94 || local21 != Static117.aFloat56 || Static26.aFloat16 != local27 || Static238.anInt3861 != local30 || Static176.anInt3425 != local43 || local50 != Static42.aClass1_Sub5_Sub18_3 || local59 != Static260.aFloat86 || local56 != Static206.aFloat74 || local53 != Static135.aFloat61) {
			Static225.aFloat76 = Static126.aFloat35;
			Static27.aFloat17 = Static83.aFloat45;
			Static172.aFloat67 = Static292.aFloat96;
			Static300.aFloat99 = Static105.aFloat50;
			Static272.anInt5003 = Static142.anInt2787;
			Static95.anInt1982 = Static250.anInt4601;
			Static122.anInt2485 = Static79.anInt1737;
			Static24.aFloat15 = Static315.aFloat102;
			Static34.aClass1_Sub5_Sub18_2 = Static24.aClass1_Sub5_Sub18_1;
			Static106.aFloat72 = Static112.aFloat98;
			if (Static280.aClass1_Sub5_Sub18_6 == null || Static280.aClass1_Sub5_Sub18_6 == Static34.aClass1_Sub5_Sub18_2) {
				Static280.aClass1_Sub5_Sub18_6 = new Class1_Sub5_Sub18();
			}
			Static135.aFloat61 = local53;
			Static117.aFloat56 = local21;
			Static42.aClass1_Sub5_Sub18_3 = local50;
			Static206.aFloat74 = local56;
			Static260.aFloat86 = local59;
			Static280.aFloat94 = local40;
			Static238.anInt3861 = local30;
			Static176.anInt3425 = local43;
			Static293.anInt5297 = 0;
			Static26.aFloat16 = local27;
			Static132.anInt2607 = local24;
		}
		if (Static293.anInt5297 < 65536) {
			Static293.anInt5297 += arg3 * 250;
			if (Static293.anInt5297 >= 65536) {
				Static79.anInt1737 = Static176.anInt3425;
				Static293.anInt5297 = 65536;
				Static315.aFloat102 = Static135.aFloat61;
				Static34.aClass1_Sub5_Sub18_2 = null;
				Static126.aFloat35 = Static260.aFloat86;
				Static142.anInt2787 = Static132.anInt2607;
				Static24.aClass1_Sub5_Sub18_1 = Static42.aClass1_Sub5_Sub18_3;
				Static112.aFloat98 = Static26.aFloat16;
				Static83.aFloat45 = Static206.aFloat74;
				Static105.aFloat50 = Static117.aFloat56;
				Static250.anInt4601 = Static238.anInt3861;
				Static292.aFloat96 = Static280.aFloat94;
			} else {
				@Pc(203) int local203 = Static293.anInt5297 >> 8;
				@Pc(209) int local209 = 65536 - Static293.anInt5297 >> 8;
				Static142.anInt2787 = (local203 * (Static132.anInt2607 & 0xFF00) + local209 * (Static272.anInt5003 & 0xFF00) & 0xFF0000) + (local203 * (Static132.anInt2607 & 0xFF00FF) + (Static272.anInt5003 & 0xFF00FF) * local209 & 0xFF00FF00) >> 8;
				Static250.anInt4601 = (local203 * (Static238.anInt3861 & 0xFF00) + (Static95.anInt1982 & 0xFF00) * local209 & 0xFF0000) + (local209 * (Static95.anInt1982 & 0xFF00FF) + ((Static238.anInt3861 & 0xFF00FF) * local203) & 0xFF00FF00) >> 8;
				@Pc(278) float local278 = (float) (65536 - Static293.anInt5297) / 65536.0F;
				@Pc(283) float local283 = (float) Static293.anInt5297 / 65536.0F;
				Static112.aFloat98 = Static26.aFloat16 * local283 + local278 * Static106.aFloat72;
				Static126.aFloat35 = local283 * Static260.aFloat86 + local278 * Static225.aFloat76;
				Static105.aFloat50 = local283 * Static117.aFloat56 + Static300.aFloat99 * local278;
				Static83.aFloat45 = local283 * Static206.aFloat74 + Static27.aFloat17 * local278;
				Static292.aFloat96 = Static172.aFloat67 * local278 + Static280.aFloat94 * local283;
				Static79.anInt1737 = local203 * Static176.anInt3425 + Static122.anInt2485 * local209 >> 8;
				Static315.aFloat102 = local278 * Static24.aFloat15 + Static135.aFloat61 * local283;
				if (Static34.aClass1_Sub5_Sub18_2 != Static42.aClass1_Sub5_Sub18_3) {
					if (Static34.aClass1_Sub5_Sub18_2 == null || Static42.aClass1_Sub5_Sub18_3 == null) {
						Static24.aClass1_Sub5_Sub18_1 = null;
					} else {
						Static24.aClass1_Sub5_Sub18_1 = Static280.aClass1_Sub5_Sub18_6.method3650(Static34.aClass1_Sub5_Sub18_2, Static42.aClass1_Sub5_Sub18_3, (float) Static293.anInt5297 / 65536.0F);
					}
				}
			}
		}
		return Static250.anInt4601;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
	public static void method3199(@OriginalArg(0) int arg0) {
		Static287.anInt5198 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static220.anInt4129; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static298.anInt5372; local8++) {
				if (Static254.aClass1_Sub16ArrayArrayArray3[arg0][local3][local8] == null) {
					Static254.aClass1_Sub16ArrayArrayArray3[arg0][local3][local8] = new Class1_Sub16(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public static void method3203() {
		@Pc(8) int[] local8 = new int[Static73.anInt1580];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static73.anInt1580; local12++) {
			@Pc(23) Class3 local23 = Static69.method1330(local12);
			if (local23.anInt159 >= 0 || local23.anInt178 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static166.anIntArray297 = new int[local10];
		for (local12 = 0; local12 < local10; local12++) {
			Static166.anIntArray297[local12] = local8[local12];
		}
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
	public static void method3207() {
		Static264.aClass1_Sub5_Sub6_10 = null;
		Static206.aClass1_Sub5_Sub6_8 = null;
		Static175.aClass1_Sub5_Sub6_7 = null;
		Static159.aClass1_Sub5_Sub6_6 = null;
		Static144.aClass1_Sub5_Sub6_5 = null;
	}
}
