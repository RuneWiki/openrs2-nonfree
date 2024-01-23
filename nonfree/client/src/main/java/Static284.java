import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
	public static int anInt5619;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
	public static int anInt5620;

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
	public static int anInt5624;

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[200];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ek;B)V")
	public static void method4438(@OriginalArg(0) Class42 arg0) {
		Static84.anInt1972 = arg0.method1254("p11_full");
		Static36.anInt936 = arg0.method1254("p12_full");
		Static106.anInt2446 = arg0.method1254("b12_full");
		Static123.anInt2867 = arg0.method1254("hitmarks");
		Static50.anInt1263 = arg0.method1254("hitbar_default");
		Static193.anInt4039 = arg0.method1254("headicons_pk");
		Static214.anInt4371 = arg0.method1254("headicons_prayer");
		Static217.anInt4437 = arg0.method1254("hint_headicons");
		Static184.anInt3966 = arg0.method1254("hint_mapmarkers");
		Static222.anInt4533 = arg0.method1254("mapflag");
		Static182.anInt6010 = arg0.method1254("cross");
		anInt5620 = arg0.method1254("mapdots");
		Static233.anInt6040 = arg0.method1254("scrollbar");
		Static5.anInt4797 = arg0.method1254("name_icons");
		Static101.anInt2396 = arg0.method1254("floorshadows");
		Static161.anInt3591 = arg0.method1254("compass");
		Static14.anInt284 = arg0.method1254("hint_mapedge");
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)V")
	public static void method4439(@OriginalArg(1) boolean arg0) {
		Static166.aBoolean246 = arg0;
		@Pc(132) boolean local132;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(52) int local52;
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(201) int local201;
		if (!Static166.aBoolean246) {
			local19 = Static91.aClass2_Sub16_Sub1_1.method2175();
			local25 = Static91.aClass2_Sub16_Sub1_1.method2137();
			local29 = Static91.aClass2_Sub16_Sub1_1.method2137();
			local34 = Static91.aClass2_Sub16_Sub1_1.method2152();
			local39 = (Static218.anInt4451 - Static91.aClass2_Sub16_Sub1_1.anInt2789) / 16;
			Static204.anIntArrayArray31 = new int[local39][4];
			for (local44 = 0; local44 < local39; local44++) {
				for (local52 = 0; local52 < 4; local52++) {
					Static204.anIntArrayArray31[local44][local52] = Static91.aClass2_Sub16_Sub1_1.method2165();
				}
			}
			local132 = Static236.method3822(Static91.aClass2_Sub16_Sub1_1.method2133());
			local44 = Static91.aClass2_Sub16_Sub1_1.method2130();
			Static53.anIntArray106 = new int[local39];
			Static189.aByteArrayArray10 = null;
			Static223.aByteArrayArray14 = new byte[local39][];
			Static234.aByteArrayArray15 = new byte[local39][];
			Static296.aByteArrayArray19 = new byte[local39][];
			Static76.anIntArray160 = new int[local39];
			Static253.anIntArray485 = new int[local39];
			@Pc(454) boolean local454 = false;
			Static107.anIntArray212 = new int[local39];
			Static195.aByteArrayArray20 = new byte[local39][];
			Static174.anIntArray375 = null;
			if ((local44 / 8 == 48 || local44 / 8 == 49) && local34 / 8 == 48) {
				local454 = true;
			}
			Static60.anIntArray128 = new int[local39];
			if (local44 / 8 == 48 && local34 / 8 == 148) {
				local454 = true;
			}
			local39 = 0;
			for (local185 = (local44 - 6) / 8; local185 <= (local44 + 6) / 8; local185++) {
				for (local190 = (local34 - 6) / 8; local190 <= (local34 + 6) / 8; local190++) {
					local201 = (local185 << 8) + local190;
					if (local454 && (local190 == 49 || local190 == 149 || local190 == 147 || local185 == 50 || local185 == 49 && local190 == 47)) {
						Static253.anIntArray485[local39] = local201;
						Static76.anIntArray160[local39] = -1;
						Static107.anIntArray212[local39] = -1;
						Static53.anIntArray106[local39] = -1;
						Static60.anIntArray128[local39] = -1;
					} else {
						Static253.anIntArray485[local39] = local201;
						Static76.anIntArray160[local39] = Static200.aClass42_61.method1254("m" + local185 + "_" + local190);
						Static107.anIntArray212[local39] = Static200.aClass42_61.method1254("l" + local185 + "_" + local190);
						Static53.anIntArray106[local39] = Static200.aClass42_61.method1254("um" + local185 + "_" + local190);
						Static60.anIntArray128[local39] = Static200.aClass42_61.method1254("ul" + local185 + "_" + local190);
					}
					local39++;
				}
			}
			Static10.method154(local44, local34, local132, local19, local25, local29, false);
			return;
		}
		local19 = Static91.aClass2_Sub16_Sub1_1.method2137();
		local25 = Static91.aClass2_Sub16_Sub1_1.method2152();
		local29 = Static91.aClass2_Sub16_Sub1_1.method2146();
		Static91.aClass2_Sub16_Sub1_1.method2204();
		for (local34 = 0; local34 < 4; local34++) {
			for (local39 = 0; local39 < 13; local39++) {
				for (local44 = 0; local44 < 13; local44++) {
					local52 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
					if (local52 == 1) {
						Static50.anIntArrayArrayArray3[local34][local39][local44] = Static91.aClass2_Sub16_Sub1_1.method2202(26);
					} else {
						Static50.anIntArrayArrayArray3[local34][local39][local44] = -1;
					}
				}
			}
		}
		Static91.aClass2_Sub16_Sub1_1.method2205();
		local34 = (Static218.anInt4451 - Static91.aClass2_Sub16_Sub1_1.anInt2789) / 16;
		Static204.anIntArrayArray31 = new int[local34][4];
		for (local39 = 0; local39 < local34; local39++) {
			for (local44 = 0; local44 < 4; local44++) {
				Static204.anIntArrayArray31[local39][local44] = Static91.aClass2_Sub16_Sub1_1.method2145();
			}
		}
		local132 = Static236.method3822(Static91.aClass2_Sub16_Sub1_1.method2146());
		local39 = Static91.aClass2_Sub16_Sub1_1.method2152();
		local44 = Static91.aClass2_Sub16_Sub1_1.method2137();
		Static174.anIntArray375 = null;
		Static53.anIntArray106 = new int[local34];
		Static296.aByteArrayArray19 = new byte[local34][];
		Static60.anIntArray128 = new int[local34];
		Static253.anIntArray485 = new int[local34];
		Static107.anIntArray212 = new int[local34];
		Static223.aByteArrayArray14 = new byte[local34][];
		Static76.anIntArray160 = new int[local34];
		Static234.aByteArrayArray15 = new byte[local34][];
		Static195.aByteArrayArray20 = new byte[local34][];
		local34 = 0;
		Static189.aByteArrayArray10 = null;
		for (local52 = 0; local52 < 4; local52++) {
			for (local185 = 0; local185 < 13; local185++) {
				for (local190 = 0; local190 < 13; local190++) {
					local201 = Static50.anIntArrayArrayArray3[local52][local185][local190];
					if (local201 != -1) {
						@Pc(211) int local211 = local201 >> 14 & 0x3FF;
						@Pc(217) int local217 = local201 >> 3 & 0x7FF;
						@Pc(227) int local227 = local217 / 8 + (local211 / 8 << 8);
						@Pc(229) int local229;
						for (local229 = 0; local229 < local34; local229++) {
							if (local227 == Static253.anIntArray485[local229]) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static253.anIntArray485[local34] = local227;
							local229 = local227 >> 8 & 0xFF;
							@Pc(271) int local271 = local227 & 0xFF;
							Static76.anIntArray160[local34] = Static200.aClass42_61.method1254("m" + local229 + "_" + local271);
							Static107.anIntArray212[local34] = Static200.aClass42_61.method1254("l" + local229 + "_" + local271);
							Static53.anIntArray106[local34] = Static200.aClass42_61.method1254("um" + local229 + "_" + local271);
							Static60.anIntArray128[local34] = Static200.aClass42_61.method1254("ul" + local229 + "_" + local271);
							local34++;
						}
					}
				}
			}
		}
		Static10.method154(local25, local39, local132, local29, local19, local44, false);
	}
}
