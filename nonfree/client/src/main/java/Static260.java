import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "[Lclient!mh;")
	public static final Class1_Sub3_Sub14[] aClass1_Sub3_Sub14Array7 = new Class1_Sub3_Sub14[14];

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIILclient!za;)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class117 arg4) {
		arg4.ba(arg3, arg1, arg3 + arg0, arg1 + arg2);
		arg4.method5664(arg0, arg1, -16777216, arg2, arg3);
		if (Static8.anInt126 < 100) {
			return;
		}
		@Pc(41) float local41 = (float) Static430.anInt4137 / (float) Static430.anInt4144;
		@Pc(43) int local43 = arg0;
		@Pc(45) int local45 = arg2;
		if (local41 < 1.0F) {
			local45 = (int) ((float) arg0 * local41);
		} else {
			local43 = (int) ((float) arg2 / local41);
		}
		@Pc(72) int local72 = arg1 + (arg2 - local45) / 2;
		@Pc(81) int local81 = arg3 + (arg0 - local43) / 2;
		if (Static360.aClass85_18 == null || arg0 != Static360.aClass85_18.YA() || Static360.aClass85_18.ZA() != arg2) {
			Static430.method3271(Static430.anInt4140, Static430.anInt4137 + Static430.anInt4146, Static430.anInt4140 + Static430.anInt4144, Static430.anInt4146, local81, local72, local81 + local43, local45 + local72);
			Static430.method3273(arg4);
			Static360.aClass85_18 = arg4.method5709(local81, local72, local43, local45, false);
		}
		Static360.aClass85_18.method5406(local81, local72);
		@Pc(129) int local129 = local43 * Static344.anInt5675 / Static430.anInt4144;
		@Pc(135) int local135 = Static454.anInt7225 * local45 / Static430.anInt4137;
		@Pc(143) int local143 = local43 * Static108.anInt1646 / Static430.anInt4144 + local81;
		@Pc(157) int local157 = local72 + local45 - local135 - Static171.anInt2846 * local45 / Static430.anInt4137;
		@Pc(159) int local159 = -1996554240;
		if (Static93.aClass148_2 == Static94.aClass148_3) {
			local159 = -1996488705;
		}
		arg4.P(local143, local157, local129, local135, local159, 1);
		arg4.method5690(local143, local157, local129, local135, local159, 0);
		if (Static47.anInt678 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static80.anInt1104 > 50) {
			local194 = 500 - Static80.anInt1104 * 5;
		} else {
			local194 = Static80.anInt1104 * 5;
		}
		for (@Pc(205) Class1_Sub15 local205 = (Class1_Sub15) Static430.aClass14_23.method203(); local205 != null; local205 = (Class1_Sub15) Static430.aClass14_23.method208()) {
			@Pc(213) Class128 local213 = Static430.aClass36_4.method659(local205.anInt1847);
			if (Static247.method3520(local213)) {
				@Pc(234) int local234;
				@Pc(245) int local245;
				if (Static232.anInt4196 == local205.anInt1847) {
					local234 = local43 * local205.anInt1843 / Static430.anInt4144 + local81;
					local245 = local45 * (Static430.anInt4137 - local205.anInt1842) / Static430.anInt4137 + local72;
					arg4.method5664(4, local245 - 2, local194 << 24 | 0xFFFF00, 4, local234 - 2);
				} else if (Static32.anInt496 != -1 && Static32.anInt496 == local213.anInt3484) {
					local234 = local81 + local205.anInt1843 * local43 / Static430.anInt4144;
					local245 = local72 + (Static430.anInt4137 - local205.anInt1842) * local45 / Static430.anInt4137;
					arg4.method5664(4, local245 - 2, local194 << 24 | 0xFFFF00, 4, local234 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3632(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg0, 14);
		local8.method385();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!hm;I)V")
	public static void method3633(@OriginalArg(0) Class107 arg0) {
		if (arg0.anInt2580 == Static378.anInt6079) {
			Static179.aBooleanArray69[arg0.anInt2665] = true;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void method3634() {
		@Pc(9) int local9 = Static413.aClass1_Sub19_Sub2_1.method2938();
		Static70.anInt4903 = Static413.aClass1_Sub19_Sub2_1.method2915();
		@Pc(19) int local19 = Static413.aClass1_Sub19_Sub2_1.method2919();
		@Pc(30) boolean local30 = Static413.aClass1_Sub19_Sub2_1.method2928() == 1;
		@Pc(36) int local36 = Static413.aClass1_Sub19_Sub2_1.method2938();
		Static113.method1405();
		Static405.method5211(local19);
		Static413.aClass1_Sub19_Sub2_1.method2941();
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(66) int local66;
		for (@Pc(51) int local51 = 0; local51 < 4; local51++) {
			for (local55 = 0; local55 < Static147.anInt2300 >> 3; local55++) {
				for (local59 = 0; local59 < Static293.anInt4886 >> 3; local59++) {
					local66 = Static413.aClass1_Sub19_Sub2_1.method2946(1);
					if (local66 == 1) {
						Static291.anIntArrayArrayArray6[local51][local55][local59] = Static413.aClass1_Sub19_Sub2_1.method2946(26);
					} else {
						Static291.anIntArrayArrayArray6[local51][local55][local59] = -1;
					}
				}
			}
		}
		Static413.aClass1_Sub19_Sub2_1.method2940();
		local55 = (Static379.anInt119 - Static413.aClass1_Sub19_Sub2_1.anInt3698) / 16;
		Static438.anIntArrayArray52 = new int[local55][4];
		for (local59 = 0; local59 < local55; local59++) {
			for (local66 = 0; local66 < 4; local66++) {
				Static438.anIntArrayArray52[local59][local66] = Static413.aClass1_Sub19_Sub2_1.method2877();
			}
		}
		Static106.aByteArrayArray152 = null;
		Static161.aByteArrayArray51 = new byte[local55][];
		Static114.anIntArray155 = null;
		Static292.anIntArray369 = new int[local55];
		Static10.anIntArray385 = new int[local55];
		Static26.anIntArray60 = new int[local55];
		Static457.aByteArrayArray148 = new byte[local55][];
		Static172.aByteArrayArray56 = new byte[local55][];
		Static334.anIntArray397 = new int[local55];
		Static401.aByteArrayArray128 = new byte[local55][];
		Static275.anIntArray353 = new int[local55];
		local55 = 0;
		for (local66 = 0; local66 < 4; local66++) {
			for (@Pc(186) int local186 = 0; local186 < Static147.anInt2300 >> 3; local186++) {
				for (@Pc(190) int local190 = 0; local190 < Static293.anInt4886 >> 3; local190++) {
					@Pc(200) int local200 = Static291.anIntArrayArrayArray6[local66][local186][local190];
					if (local200 != -1) {
						@Pc(209) int local209 = local200 >> 14 & 0x3FF;
						@Pc(215) int local215 = local200 >> 3 & 0x7FF;
						@Pc(226) int local226 = (local209 / 8 << 8) + (local215 / 8);
						for (@Pc(228) int local228 = 0; local228 < local55; local228++) {
							if (local226 == Static334.anIntArray397[local228]) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							Static334.anIntArray397[local55] = local226;
							@Pc(264) int local264 = local226 >> 8 & 0xFF;
							@Pc(268) int local268 = local226 & 0xFF;
							Static292.anIntArray369[local55] = Static210.aClass185_119.method4005("m" + local264 + "_" + local268);
							Static26.anIntArray60[local55] = Static210.aClass185_119.method4005("l" + local264 + "_" + local268);
							Static275.anIntArray353[local55] = Static210.aClass185_119.method4005("um" + local264 + "_" + local268);
							Static10.anIntArray385[local55] = Static210.aClass185_119.method4005("ul" + local264 + "_" + local268);
							local55++;
						}
					}
				}
			}
		}
		Static282.method3774(10, local36, local30, local9);
	}
}
