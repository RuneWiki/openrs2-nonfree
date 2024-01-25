import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public static int anInt2937;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!gj;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!ci;")
	public static Class38 aClass38_30;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_36 = new Class21("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_37 = new Class21("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method2618() {
		if (Static252.method4140(Static70.anInt1726) || Static35.method516(Static70.anInt1726)) {
			Static50.method1140(5000, Static235.anInt4645 >> 10, Static108.anInt2350 >> 10);
		} else {
			@Pc(27) int local27 = Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0] >> 3;
			@Pc(34) int local34 = Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] >> 3;
			if (local27 >= 0 && Static193.anInt3853 >> 3 > local27 && local34 >= 0 && Static301.anInt5585 >> 3 > local34) {
				Static50.method1140(5000, local27, local34);
			} else {
				Static50.method1140(0, Static193.anInt3853 >> 4, Static301.anInt5585 >> 4);
			}
		}
		Static263.method4246();
		Static242.method4026();
		Static18.method304();
		Static323.method2077();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method2621() {
		if (Static157.aClass185_Sub1_1.method4641(Static192.anInt3828) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static213.anInt4343 - 4 & 0xFF);
		@Pc(23) int local23 = Static213.anInt4343 % Static193.anInt3853;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static301.anInt5585; local29++) {
				Static180.aByteArrayArrayArray3[local25][local23][local29] = local19;
			}
		}
		if (Static59.anInt1472 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static103.anIntArray192[local29] = -1000000;
			Static326.anIntArray474[local29] = 1000000;
			Static150.anIntArray256[local29] = 0;
			Static77.anIntArray130[local29] = 1000000;
			Static171.anIntArray274[local29] = 0;
		}
		@Pc(94) int local94;
		if (Static275.anInt5173 != 1) {
			local94 = Static21.method356(Static235.anInt4645, Static108.anInt2350, Static59.anInt1472);
			if (local94 - Static405.anInt7103 < 800 && (Static398.aByteArrayArrayArray17[Static59.anInt1472][Static235.anInt4645 >> 7][Static108.anInt2350 >> 7] & 0x4) != 0) {
				Static297.method4527(1, Static294.aClass162ArrayArrayArray2, false, Static108.anInt2350 >> 7, Static235.anInt4645 >> 7);
			}
			return;
		}
		if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7][Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7] & 0x4) != 0) {
			Static297.method4527(0, Static294.aClass162ArrayArrayArray2, false, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7);
		}
		if (Static439.anInt7477 >= 2560) {
			return;
		}
		local94 = Static235.anInt4645 >> 7;
		@Pc(174) int local174 = Static108.anInt2350 >> 7;
		@Pc(179) int local179 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7;
		@Pc(184) int local184 = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7;
		@Pc(191) int local191;
		if (local179 > local94) {
			local191 = local179 - local94;
		} else {
			local191 = local94 - local179;
		}
		@Pc(209) int local209;
		if (local174 < local184) {
			local209 = local184 - local174;
		} else {
			local209 = local174 - local184;
		}
		if (local191 == 0 && local209 == 0 || local191 <= -Static193.anInt3853 || Static193.anInt3853 <= local191 || local209 <= -Static301.anInt5585 || Static301.anInt5585 <= local209) {
			Static417.method5814(null, "RC: " + local94 + "," + local174 + " " + local179 + "," + local184 + " " + Static426.anInt7325 + "," + Static72.anInt1776);
			return;
		}
		@Pc(284) int local284;
		@Pc(286) int local286;
		if (local209 < local191) {
			local284 = local209 * 65536 / local191;
			local286 = 32768;
			while (local179 != local94) {
				if (local179 > local94) {
					local94++;
				} else if (local179 < local94) {
					local94--;
				}
				if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][local94][local174] & 0x4) != 0) {
					Static297.method4527(1, Static294.aClass162ArrayArrayArray2, false, local174, local94);
					break;
				}
				local286 += local284;
				if (local286 >= 65536) {
					if (local184 > local174) {
						local174++;
					} else if (local174 > local184) {
						local174--;
					}
					local286 -= 65536;
					if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][local94][local174] & 0x4) != 0) {
						Static297.method4527(1, Static294.aClass162ArrayArrayArray2, false, local174, local94);
						break;
					}
				}
			}
			return;
		}
		local284 = local191 * 65536 / local209;
		local286 = 32768;
		while (local184 != local174) {
			if (local174 < local184) {
				local174++;
			} else if (local184 < local174) {
				local174--;
			}
			if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][local94][local174] & 0x4) != 0) {
				Static297.method4527(1, Static294.aClass162ArrayArrayArray2, false, local174, local94);
				break;
			}
			local286 += local284;
			if (local286 >= 65536) {
				if (local179 > local94) {
					local94++;
				} else if (local94 > local179) {
					local94--;
				}
				local286 -= 65536;
				if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][local94][local174] & 0x4) != 0) {
					Static297.method4527(1, Static294.aClass162ArrayArrayArray2, false, local174, local94);
					break;
				}
			}
		}
	}
}
