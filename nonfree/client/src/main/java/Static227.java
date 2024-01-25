import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[B")
	public static byte[] aByteArray62;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!sc;")
	public static Class179 aClass179_5;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_118 = new Class140("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIB)V")
	public static void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static356.anInt6794 = arg1;
		Static64.anInt1136 = arg0;
		Static50.anInt826 = arg2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZJII)V")
	public static void method4204(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static86.method1714(0, arg1, 0, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], local15, arg2, 0, true, local22);
			return;
		}
		@Pc(48) Class74 local48 = Static228.method4210(local29);
		@Pc(62) int local62;
		@Pc(59) int local59;
		if (local22 == 0 || local22 == 2) {
			local59 = local48.anInt2048;
			local62 = local48.anInt2094;
		} else {
			local59 = local48.anInt2094;
			local62 = local48.anInt2048;
		}
		@Pc(73) int local73 = local48.anInt2091;
		if (local22 != 0) {
			local73 = (local73 << local22 & 0xF) + (local73 >> 4 - local22);
		}
		Static86.method1714(local59, arg1, local73, Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], 0, arg2, local62, true, 0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method4205() {
		Static300.method5057(Static216.aClass157_140);
		Static197.aClass2_Sub12_Sub2_2.method3147(Static26.method3361());
		Static197.aClass2_Sub12_Sub2_2.method3158(Static335.anInt6496);
		Static197.aClass2_Sub12_Sub2_2.method3158(Static25.anInt396);
		Static197.aClass2_Sub12_Sub2_2.method3147(Static181.anInt4031);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fh;B)Lclient!fh;")
	public static Class68 method4206(@OriginalArg(0) Class68 arg0) {
		if (arg0.anInt1830 != -1) {
			return Static8.method144(arg0.anInt1830);
		}
		@Pc(19) int local19 = arg0.anInt1857 >>> 16;
		@Pc(24) Class58 local24 = new Class58(Static303.aClass41_32);
		for (@Pc(34) Class2_Sub40 local34 = (Class2_Sub40) local24.method1361(); local34 != null; local34 = (Class2_Sub40) local24.method1364()) {
			if (local34.anInt6092 == local19) {
				return Static8.method144((int) local34.aLong219);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!dr;)V")
	public static void method4207(@OriginalArg(0) int arg0, @OriginalArg(2) Class37 arg1) {
		Static214.method4054(arg1);
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (arg0 > 1) {
			for (local14 = 0; local14 < Static66.anInt1177; local14++) {
				for (local18 = 0; local18 < Static12.anInt213; local18++) {
					if ((Static243.aByteArrayArrayArray10[1][local14][local18] & 0x2) == 2) {
						Static176.method3420(local14, local18);
					}
				}
			}
		}
		for (local14 = 0; local14 < arg0; local14++) {
			for (local18 = 0; local18 <= Static12.anInt213; local18++) {
				for (@Pc(66) int local66 = 0; local66 <= Static66.anInt1177; local66++) {
					@Pc(83) int local83;
					@Pc(85) int local85;
					@Pc(87) int local87;
					@Pc(134) int local134;
					@Pc(138) int local138;
					@Pc(232) int local232;
					@Pc(240) int local240;
					@Pc(260) int local260;
					@Pc(264) int local264;
					if ((Static314.aByteArrayArrayArray11[local14][local66][local18] & 0x1) != 0) {
						local83 = local18;
						local85 = local18;
						local87 = local14;
						while (local83 > 0 && (Static314.aByteArrayArrayArray11[local14][local66][local83 - 1] & 0x1) != 0) {
							local83--;
						}
						while (Static12.anInt213 > local85 && (Static314.aByteArrayArrayArray11[local14][local66][local85 + 1] & 0x1) != 0) {
							local85++;
						}
						local134 = local14;
						label164: while (local87 > 0) {
							for (local138 = local83; local138 <= local85; local138++) {
								if ((Static314.aByteArrayArrayArray11[local87 - 1][local66][local138] & 0x1) == 0) {
									break label164;
								}
							}
							local87--;
						}
						label153: while (local134 < 3) {
							for (local138 = local83; local138 <= local85; local138++) {
								if ((Static314.aByteArrayArrayArray11[local134 + 1][local66][local138] & 0x1) == 0) {
									break label153;
								}
							}
							local134++;
						}
						local138 = (local85 + 1 - local83) * (local134 + 1 - local87);
						if (local138 >= 2) {
							local232 = Static327.anIntArrayArrayArray12[local134][local66][local83] - 240;
							local240 = Static327.anIntArrayArrayArray12[local87][local66][local83];
							Static248.method4399(1, local66 * 128, local66 * 128, local83 * 128, local85 * 128 + 128, local232, local240);
							for (local260 = local87; local260 <= local134; local260++) {
								for (local264 = local83; local264 <= local85; local264++) {
									Static314.aByteArrayArrayArray11[local260][local66][local264] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static314.aByteArrayArrayArray11[local14][local66][local18] & 0x2) != 0) {
						local83 = local66;
						local85 = local66;
						local87 = local14;
						while (local83 > 0 && (Static314.aByteArrayArrayArray11[local14][local83 - 1][local18] & 0x2) != 0) {
							local83--;
						}
						local134 = local14;
						while (local85 < Static66.anInt1177 && (Static314.aByteArrayArrayArray11[local14][local85 + 1][local18] & 0x2) != 0) {
							local85++;
						}
						label218: while (local87 > 0) {
							for (local138 = local83; local138 <= local85; local138++) {
								if ((Static314.aByteArrayArrayArray11[local87 - 1][local138][local18] & 0x2) == 0) {
									break label218;
								}
							}
							local87--;
						}
						label207: while (local134 < 3) {
							for (local138 = local83; local138 <= local85; local138++) {
								if ((Static314.aByteArrayArrayArray11[local134 + 1][local138][local18] & 0x2) == 0) {
									break label207;
								}
							}
							local134++;
						}
						local138 = (local85 + 1 - local83) * (local134 + 1 - local87);
						if (local138 >= 2) {
							local232 = Static327.anIntArrayArrayArray12[local134][local83][local18] - 240;
							local240 = Static327.anIntArrayArrayArray12[local87][local83][local18];
							Static248.method4399(2, local83 * 128, local85 * 128 + 128, local18 * 128, local18 * 128, local232, local240);
							for (local260 = local87; local260 <= local134; local260++) {
								for (local264 = local83; local264 <= local85; local264++) {
									Static314.aByteArrayArrayArray11[local260][local264][local18] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static314.aByteArrayArrayArray11[local14][local66][local18] & 0x4) != 0) {
						local83 = local66;
						local85 = local66;
						local87 = local18;
						local134 = local18;
						while (local87 > 0 && (Static314.aByteArrayArrayArray11[local14][local66][local87 - 1] & 0x4) != 0) {
							local87--;
						}
						while (local134 < Static12.anInt213 && (Static314.aByteArrayArrayArray11[local14][local66][local134 + 1] & 0x4) != 0) {
							local134++;
						}
						label272: while (local83 > 0) {
							for (local138 = local87; local138 <= local134; local138++) {
								if ((Static314.aByteArrayArrayArray11[local14][local83 - 1][local138] & 0x4) == 0) {
									break label272;
								}
							}
							local83--;
						}
						label261: while (Static66.anInt1177 > local85) {
							for (local138 = local87; local138 <= local134; local138++) {
								if ((Static314.aByteArrayArrayArray11[local14][local85 + 1][local138] & 0x4) == 0) {
									break label261;
								}
							}
							local85++;
						}
						if ((local134 + 1 - local87) * (local85 + (1 - local83)) >= 4) {
							local138 = Static327.anIntArrayArrayArray12[local14][local83][local87];
							Static248.method4399(4, local83 * 128, local85 * 128 + 128, local87 * 128, local134 * 128 + 128, local138, local138);
							for (@Pc(674) int local674 = local83; local674 <= local85; local674++) {
								for (local232 = local87; local232 <= local134; local232++) {
									Static314.aByteArrayArrayArray11[local14][local674][local232] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!fh;)Ljava/lang/String;")
	public static String method4208(@OriginalArg(1) Class68 arg0) {
		if (Static46.method890(arg0).method5641() == 0) {
			return null;
		} else if (arg0.aString22 == null || arg0.aString22.trim().length() == 0) {
			return Static334.aBoolean581 ? "Hidden-use" : null;
		} else {
			return arg0.aString22;
		}
	}
}
