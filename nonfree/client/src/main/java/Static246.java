import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_69 = new Class96(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public static int anInt4292 = -1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method3556() {
		@Pc(9) int local9 = Static116.aClass1_Sub14_Sub2_1.method4548();
		@Pc(13) int local13 = Static116.aClass1_Sub14_Sub2_1.method4518();
		@Pc(17) int local17 = Static116.aClass1_Sub14_Sub2_1.method4498();
		@Pc(28) boolean local28 = Static116.aClass1_Sub14_Sub2_1.method4491() == 1;
		Static188.anInt3479 = Static116.aClass1_Sub14_Sub2_1.method4548();
		Static41.method546(local9);
		Static116.aClass1_Sub14_Sub2_1.method4567();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static80.anInt6558 >> 3; local46++) {
				for (local50 = 0; local50 < Static104.anInt2048 >> 3; local50++) {
					local57 = Static116.aClass1_Sub14_Sub2_1.method4557(1);
					if (local57 == 1) {
						Static16.anIntArrayArrayArray9[local42][local46][local50] = Static116.aClass1_Sub14_Sub2_1.method4557(26);
					} else {
						Static16.anIntArrayArrayArray9[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static116.aClass1_Sub14_Sub2_1.method4559();
		local46 = (Static282.anInt4732 - Static116.aClass1_Sub14_Sub2_1.anInt5695) / 16;
		Static439.anIntArrayArray58 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static439.anIntArrayArray58[local50][local57] = Static116.aClass1_Sub14_Sub2_1.method4500();
			}
		}
		Static435.aByteArrayArray24 = new byte[local46][];
		Static235.anIntArray330 = new int[local46];
		Static26.aByteArrayArray3 = new byte[local46][];
		Static228.anIntArray311 = new int[local46];
		Static28.anIntArray30 = new int[local46];
		Static242.aByteArrayArray18 = new byte[local46][];
		Static57.anIntArray46 = null;
		Static21.anIntArray25 = new int[local46];
		Static306.aByteArrayArray19 = new byte[local46][];
		Static81.aByteArrayArray5 = null;
		Static68.anIntArray59 = new int[local46];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(189) int local189 = 0; local189 < Static80.anInt6558 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static104.anInt2048 >> 3; local193++) {
					@Pc(203) int local203 = Static16.anIntArrayArrayArray9[local57][local189][local193];
					if (local203 != -1) {
						@Pc(213) int local213 = local203 >> 14 & 0x3FF;
						@Pc(219) int local219 = local203 >> 3 & 0x7FF;
						@Pc(230) int local230 = (local213 / 8 << 8) + (local219 / 8);
						for (@Pc(232) int local232 = 0; local232 < local46; local232++) {
							if (local230 == Static68.anIntArray59[local232]) {
								local230 = -1;
								break;
							}
						}
						if (local230 != -1) {
							Static68.anIntArray59[local46] = local230;
							@Pc(265) int local265 = local230 >> 8 & 0xFF;
							@Pc(269) int local269 = local230 & 0xFF;
							Static21.anIntArray25[local46] = Static162.aClass109_37.method2343("m" + local265 + "_" + local269);
							Static228.anIntArray311[local46] = Static162.aClass109_37.method2343("l" + local265 + "_" + local269);
							Static28.anIntArray30[local46] = Static162.aClass109_37.method2343("um" + local265 + "_" + local269);
							Static235.anIntArray330[local46] = Static162.aClass109_37.method2343("ul" + local265 + "_" + local269);
							local46++;
						}
					}
				}
			}
		}
		Static389.method5445(local13, false, local28, local17);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3557(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static342.anInt6234; local9++) {
			if (arg0.equalsIgnoreCase(Static396.aStringArray40[local9])) {
				return local9;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lclient!cu;")
	public static Class1_Sub1_Sub6 method3559() {
		return Static350.aClass1_Sub1_Sub6_2;
	}
}
