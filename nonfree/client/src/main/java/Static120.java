import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_36 = new Class117("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method1443() {
		Static199.method3600();
		Static294.aClass132_2 = null;
		Static85.aClass129_2 = null;
		Static87.aClass132_1 = null;
		Static305.aClass132_3 = null;
		Static247.aClass214ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBLclient!uo;)V")
	public static void method1444(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1) {
		Static261.method4534(arg1);
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg0 > 1) {
			for (local17 = 0; local17 < Static24.anInt454; local17++) {
				for (local21 = 0; local21 < Static240.anInt4832; local21++) {
					if ((Static1.aByteArrayArrayArray1[1][local17][local21] & 0x2) == 2) {
						Static107.method1637(local17, local21);
					}
				}
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			for (local21 = 0; local21 <= Static240.anInt4832; local21++) {
				for (@Pc(57) int local57 = 0; local57 <= Static24.anInt454; local57++) {
					@Pc(71) int local71;
					@Pc(73) int local73;
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(126) int local126;
					@Pc(215) int local215;
					@Pc(223) int local223;
					@Pc(243) int local243;
					@Pc(247) int local247;
					if ((Static277.aByteArrayArrayArray11[local17][local57][local21] & 0x1) != 0) {
						local71 = local21;
						local73 = local21;
						local75 = local17;
						local77 = local17;
						while (Static240.anInt4832 > local73 && (Static277.aByteArrayArrayArray11[local17][local57][local73 + 1] & 0x1) != 0) {
							local73++;
						}
						while (local71 > 0 && (Static277.aByteArrayArrayArray11[local17][local57][local71 - 1] & 0x1) != 0) {
							local71--;
						}
						label164: while (local75 > 0) {
							for (local126 = local71; local126 <= local73; local126++) {
								if ((Static277.aByteArrayArrayArray11[local75 - 1][local57][local126] & 0x1) == 0) {
									break label164;
								}
							}
							local75--;
						}
						label153: while (local77 < 3) {
							for (local126 = local71; local126 <= local73; local126++) {
								if ((Static277.aByteArrayArrayArray11[local77 + 1][local57][local126] & 0x1) == 0) {
									break label153;
								}
							}
							local77++;
						}
						local126 = (local73 + 1 - local71) * (local77 + (1 - local75));
						if (local126 >= 2) {
							local215 = Static263.anIntArrayArrayArray13[local77][local57][local71] - 240;
							local223 = Static263.anIntArrayArrayArray13[local75][local57][local71];
							Static8.method80(1, local57 * 128, local57 * 128, local71 * 128, local73 * 128 + 128, local215, local223);
							for (local243 = local75; local243 <= local77; local243++) {
								for (local247 = local71; local247 <= local73; local247++) {
									Static277.aByteArrayArrayArray11[local243][local57][local247] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static277.aByteArrayArrayArray11[local17][local57][local21] & 0x2) != 0) {
						local71 = local57;
						local73 = local57;
						local75 = local17;
						while (Static24.anInt454 > local73 && (Static277.aByteArrayArrayArray11[local17][local73 + 1][local21] & 0x2) != 0) {
							local73++;
						}
						while (local71 > 0 && (Static277.aByteArrayArrayArray11[local17][local71 - 1][local21] & 0x2) != 0) {
							local71--;
						}
						local77 = local17;
						label217: while (local75 > 0) {
							for (local126 = local71; local126 <= local73; local126++) {
								if ((Static277.aByteArrayArrayArray11[local75 - 1][local126][local21] & 0x2) == 0) {
									break label217;
								}
							}
							local75--;
						}
						label206: while (local77 < 3) {
							for (local126 = local71; local126 <= local73; local126++) {
								if ((Static277.aByteArrayArrayArray11[local77 + 1][local126][local21] & 0x2) == 0) {
									break label206;
								}
							}
							local77++;
						}
						local126 = (local73 + 1 - local71) * ((local77 + 1) - local75);
						if (local126 >= 2) {
							local215 = Static263.anIntArrayArrayArray13[local77][local71][local21] - 240;
							local223 = Static263.anIntArrayArrayArray13[local75][local71][local21];
							Static8.method80(2, local71 * 128, local73 * 128 + 128, local21 * 128, local21 * 128, local215, local223);
							for (local243 = local75; local243 <= local77; local243++) {
								for (local247 = local71; local247 <= local73; local247++) {
									Static277.aByteArrayArrayArray11[local243][local247][local21] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static277.aByteArrayArrayArray11[local17][local57][local21] & 0x4) != 0) {
						local71 = local57;
						local73 = local57;
						for (local75 = local21; local75 > 0 && (Static277.aByteArrayArrayArray11[local17][local57][local75 - 1] & 0x4) != 0; local75--) {
						}
						for (local77 = local21; Static240.anInt4832 > local77 && (Static277.aByteArrayArrayArray11[local17][local57][local77 + 1] & 0x4) != 0; local77++) {
						}
						label271: while (local71 > 0) {
							for (local126 = local75; local126 <= local77; local126++) {
								if ((Static277.aByteArrayArrayArray11[local17][local71 - 1][local126] & 0x4) == 0) {
									break label271;
								}
							}
							local71--;
						}
						label260: while (local73 < Static24.anInt454) {
							for (local126 = local75; local126 <= local77; local126++) {
								if ((Static277.aByteArrayArrayArray11[local17][local73 + 1][local126] & 0x4) == 0) {
									break label260;
								}
							}
							local73++;
						}
						if ((local77 + 1 - local75) * (local73 + 1 - local71) >= 4) {
							local126 = Static263.anIntArrayArrayArray13[local17][local71][local75];
							Static8.method80(4, local71 * 128, local73 * 128 + 128, local75 * 128, local77 * 128 + 128, local126, local126);
							for (@Pc(667) int local667 = local71; local667 <= local73; local667++) {
								for (local215 = local75; local215 <= local77; local215++) {
									Static277.aByteArrayArrayArray11[local17][local667][local215] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBII)V")
	public static void method1445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1008) {
			Static93.method1351(10, arg1, arg2);
		} else if (arg0 == 1009) {
			Static93.method1351(11, arg1, arg2);
		} else if (arg0 == 1007) {
			Static93.method1351(12, arg1, arg2);
		} else if (arg0 == 1001) {
			Static93.method1351(13, arg1, arg2);
		} else if (arg0 == 1012) {
			Static93.method1351(14, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public static void method1447() {
		Static176.aClass11_Sub14_1 = new Class11_Sub14(Static208.aClass117_115.method2684(Static230.anInt4634), "", Static288.anInt5695, 1006, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIILclient!og;)V")
	public static void method1448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11_Sub29 arg3) {
		@Pc(16) long local16 = (long) (arg2 | arg0 << 14 | arg1 << 28);
		@Pc(22) Class11_Sub40 local22 = (Class11_Sub40) Static301.aClass58_35.method1009(local16);
		if (local22 == null) {
			local22 = new Class11_Sub40();
			Static301.aClass58_35.method1006(local16, local22);
			local22.aClass16_53.method190(arg3);
			return;
		}
		@Pc(44) Class170 local44 = Static283.method4717(arg3.anInt4569);
		@Pc(47) int local47 = local44.anInt5330;
		if (local44.anInt5333 == 1) {
			local47 *= arg3.anInt4574 + 1;
		}
		for (@Pc(69) Class11_Sub29 local69 = (Class11_Sub29) local22.aClass16_53.method193(); local69 != null; local69 = (Class11_Sub29) local22.aClass16_53.method188()) {
			local44 = Static283.method4717(local69.anInt4569);
			@Pc(79) int local79 = local44.anInt5330;
			if (local44.anInt5333 == 1) {
				local79 *= local69.anInt4574 + 1;
			}
			if (local47 > local79) {
				Static79.method4500(local69, arg3);
				return;
			}
		}
		local22.aClass16_53.method190(arg3);
	}
}
