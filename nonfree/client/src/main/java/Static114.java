import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!ti;")
	public static Class112 aClass112_4;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[[[Lclient!ea;")
	public static Class1_Sub7[][][] aClass1_Sub7ArrayArrayArray2;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "I")
	public static int anInt2490;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public static int anInt2484 = 1;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!ia;")
	public static Class51 aClass51_834 = Static64.method1101("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!la", name = "U", descriptor = "Lclient!ia;")
	public static Class51 aClass51_835 = Static64.method1101("Mem:");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)Z")
	public static boolean method1907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static77.method1327(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static20.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static155.anInt3423) {
					if (!Static181.method3050(local10, local24, local14)) {
						return false;
					}
					if (!Static181.method3050(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static181.method3050(local10, local28, local14)) {
						return false;
					}
					if (!Static181.method3050(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static181.method3050(local10, local32, local14)) {
					return false;
				}
				if (!Static181.method3050(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static70.anInt1623) {
					if (!Static181.method3050(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static181.method3050(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static181.method3050(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static181.method3050(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static181.method3050(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static181.method3050(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static155.anInt3423) {
					if (!Static181.method3050(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static181.method3050(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static181.method3050(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static181.method3050(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static181.method3050(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static181.method3050(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static70.anInt1623) {
					if (!Static181.method3050(local10, local24, local14)) {
						return false;
					}
					if (!Static181.method3050(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static181.method3050(local10, local28, local14)) {
						return false;
					}
					if (!Static181.method3050(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static181.method3050(local10, local32, local14)) {
					return false;
				}
				if (!Static181.method3050(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static181.method3050(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static181.method3050(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static181.method3050(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static181.method3050(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static181.method3050(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
	public static void method1909(@OriginalArg(1) boolean arg0) {
		Static65.aBoolean70 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(157) int local157;
		@Pc(161) int local161;
		@Pc(165) int local165;
		if (!Static65.aBoolean70) {
			local17 = Static225.aClass1_Sub16_Sub1_4.method3794();
			local21 = (Static142.anInt3128 - Static225.aClass1_Sub16_Sub1_4.anInt4860) / 16;
			Static8.anIntArrayArray1 = new int[local21][4];
			for (local25 = 0; local25 < local21; local25++) {
				for (local29 = 0; local29 < 4; local29++) {
					Static8.anIntArrayArray1[local25][local29] = Static225.aClass1_Sub16_Sub1_4.method3804();
				}
			}
			local29 = Static225.aClass1_Sub16_Sub1_4.method3783();
			local34 = Static225.aClass1_Sub16_Sub1_4.method3809();
			local38 = Static225.aClass1_Sub16_Sub1_4.method3771();
			local42 = Static225.aClass1_Sub16_Sub1_4.method3805();
			@Pc(384) boolean local384 = false;
			Static43.aByteArrayArray1 = new byte[local21][];
			Static143.anIntArray209 = new int[local21];
			Static164.anIntArray240 = new int[local21];
			Static55.aByteArrayArray2 = new byte[local21][];
			if ((local34 / 8 == 48 || local34 / 8 == 49) && (local42 / 8) == 48) {
				local384 = true;
			}
			if (local34 / 8 == 48 && local42 / 8 == 148) {
				local384 = true;
			}
			Static163.aByteArrayArray10 = null;
			Static67.anIntArray100 = new int[local21];
			Static199.anIntArray325 = null;
			local21 = 0;
			for (local157 = (local34 - 6) / 8; local157 <= (local34 + 6) / 8; local157++) {
				for (local161 = (local42 - 6) / 8; local161 <= (local42 + 6) / 8; local161++) {
					local165 = local161 + (local157 << 8);
					if (local384 && (local161 == 49 || local161 == 149 || local161 == 147 || local157 == 50 || local157 == 49 && local161 == 47)) {
						Static164.anIntArray240[local21] = local165;
						Static143.anIntArray209[local21] = -1;
						Static67.anIntArray100[local21] = -1;
					} else {
						Static164.anIntArray240[local21] = local165;
						Static143.anIntArray209[local21] = Static199.aClass70_Sub1_59.method3523(Static150.method2574(new Class51[] { Static115.aClass51_850, Static27.method511(local157), Static176.aClass51_1316, Static27.method511(local161) }));
						Static67.anIntArray100[local21] = Static199.aClass70_Sub1_59.method3523(Static150.method2574(new Class51[] { Static21.aClass51_191, Static27.method511(local157), Static176.aClass51_1316, Static27.method511(local161) }));
					}
					local21++;
				}
			}
			Static16.method296(local34, local29, local42, local17, local38);
			return;
		}
		local17 = Static225.aClass1_Sub16_Sub1_4.method3805();
		local21 = Static225.aClass1_Sub16_Sub1_4.method3783();
		local25 = Static225.aClass1_Sub16_Sub1_4.method3763();
		local29 = Static225.aClass1_Sub16_Sub1_4.method3809();
		Static225.aClass1_Sub16_Sub1_4.method3827();
		@Pc(49) int local49;
		for (local34 = 0; local34 < 4; local34++) {
			for (local38 = 0; local38 < 13; local38++) {
				for (local42 = 0; local42 < 13; local42++) {
					local49 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
					if (local49 == 1) {
						Static152.anIntArrayArrayArray8[local34][local38][local42] = Static225.aClass1_Sub16_Sub1_4.method3824(26);
					} else {
						Static152.anIntArrayArrayArray8[local34][local38][local42] = -1;
					}
				}
			}
		}
		Static225.aClass1_Sub16_Sub1_4.method3826();
		local38 = (Static142.anInt3128 - Static225.aClass1_Sub16_Sub1_4.anInt4860) / 16;
		Static8.anIntArrayArray1 = new int[local38][4];
		for (local42 = 0; local42 < local38; local42++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static8.anIntArrayArray1[local42][local49] = Static225.aClass1_Sub16_Sub1_4.method3769();
			}
		}
		local49 = Static225.aClass1_Sub16_Sub1_4.method3805();
		Static199.anIntArray325 = null;
		Static163.aByteArrayArray10 = null;
		Static143.anIntArray209 = new int[local38];
		Static164.anIntArray240 = new int[local38];
		Static43.aByteArrayArray1 = new byte[local38][];
		Static67.anIntArray100 = new int[local38];
		Static55.aByteArrayArray2 = new byte[local38][];
		local38 = 0;
		for (local157 = 0; local157 < 4; local157++) {
			for (local161 = 0; local161 < 13; local161++) {
				for (local165 = 0; local165 < 13; local165++) {
					@Pc(175) int local175 = Static152.anIntArrayArrayArray8[local157][local161][local165];
					if (local175 != -1) {
						@Pc(185) int local185 = local175 >> 14 & 0x3FF;
						@Pc(191) int local191 = local175 >> 3 & 0x7FF;
						@Pc(202) int local202 = (local185 / 8 << 8) + (local191 / 8);
						for (@Pc(204) int local204 = 0; local204 < local38; local204++) {
							if (Static164.anIntArray240[local204] == local202) {
								local202 = -1;
								break;
							}
						}
						if (local202 != -1) {
							Static164.anIntArray240[local38] = local202;
							@Pc(237) int local237 = local202 >> 8 & 0xFF;
							@Pc(241) int local241 = local202 & 0xFF;
							Static143.anIntArray209[local38] = Static199.aClass70_Sub1_59.method3523(Static150.method2574(new Class51[] { Static115.aClass51_850, Static27.method511(local237), Static176.aClass51_1316, Static27.method511(local241) }));
							Static67.anIntArray100[local38] = Static199.aClass70_Sub1_59.method3523(Static150.method2574(new Class51[] { Static21.aClass51_191, Static27.method511(local237), Static176.aClass51_1316, Static27.method511(local241) }));
							local38++;
						}
					}
				}
			}
		}
		Static16.method296(local49, local21, local17, local29, local25);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
	public static void method1911() {
		for (@Pc(19) Class1_Sub2_Sub16 local19 = (Class1_Sub2_Sub16) Static205.aClass105_21.method3120(); local19 != null; local19 = (Class1_Sub2_Sub16) Static205.aClass105_21.method3109()) {
			@Pc(24) Class5_Sub3 local24 = local19.aClass5_Sub3_1;
			if (Static197.anInt2422 != local24.anInt2354 || local24.aBoolean96) {
				local19.method3758();
			} else if (Static109.anInt2430 >= local24.anInt2361) {
				local24.method1806(Static48.anInt1156);
				if (local24.aBoolean96) {
					local19.method3758();
				} else {
					Static178.method3022(local24.anInt2354, local24.anInt2352, local24.anInt2345, local24.anInt2358, 60, local24, 0, -1L, false);
				}
			}
		}
	}
}
