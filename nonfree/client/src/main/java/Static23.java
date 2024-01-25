import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!wh;")
	public static Class246 aClass246_2;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt300;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!us;")
	public static final Class234 aClass234_10 = new Class234(22, -1);

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!us;")
	public static final Class234 aClass234_11 = new Class234(6, -2);

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!ck;")
	public static final Class3_Sub5_Sub1 aClass3_Sub5_Sub1_1 = new Class3_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[200];

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_8 = new Class57("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt305 = 0;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_9 = new Class57("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!vf;)V")
	public static void method287(@OriginalArg(0) Class3_Sub12_Sub1 arg0) {
		if (Static104.anInt2067 >= 65535) {
			return;
		}
		Static19.aClass3_Sub12_Sub1Array1[Static104.anInt2067] = arg0;
		Static305.aBooleanArray124[Static104.anInt2067] = false;
		Static104.anInt2067++;
		@Pc(18) int local18 = arg0.anInt6145;
		if (arg0.aBoolean479) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt6145;
		if (arg0.aBoolean478) {
			local26 = Static164.anInt2901 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt6122 + Static132.anInt2502 - arg0.anInt6129 >> Static187.anInt3390;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt6122 + arg0.anInt6129 - Static132.anInt2502 >> Static187.anInt3390;
			if (local66 >= Static103.anInt2050) {
				local66 = Static103.anInt2050 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray93[local38++];
				@Pc(96) int local96 = (arg0.anInt6127 + Static132.anInt2502 - arg0.anInt6129 >> Static187.anInt3390) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static44.anInt791) {
					local104 = Static44.anInt791 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static201.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static201.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2067;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static201.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2067 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static201.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2067 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static201.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2067 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method288() {
		if (Static164.aClass154_Sub1_1.method5402(Static2.anInt68) != 2) {
			return;
		}
		@Pc(23) byte local23 = (byte) (Static226.anInt3990 - 4 & 0xFF);
		@Pc(27) int local27 = Static226.anInt3990 % Static12.anInt161;
		@Pc(33) int local33;
		for (@Pc(29) int local29 = 0; local29 < 4; local29++) {
			for (local33 = 0; local33 < Static44.anInt787; local33++) {
				Static330.aByteArrayArrayArray18[local29][local27][local33] = local23;
			}
		}
		if (Static363.anInt6170 == 3) {
			return;
		}
		for (local33 = 0; local33 < 2; local33++) {
			Static85.anIntArray170[local33] = -1000000;
			Static364.anIntArray651[local33] = 1000000;
			Static230.anIntArray433[local33] = 0;
			Static145.anIntArray289[local33] = 1000000;
			Static267.anIntArray620[local33] = 0;
		}
		@Pc(109) int local109;
		if (Static88.anInt1815 != 1) {
			local109 = Static55.method1005(Static339.anInt5726, Static363.anInt6170, Static206.anInt3639);
			if (local109 - Static243.anInt4289 < 800 && (Static13.aByteArrayArrayArray17[Static363.anInt6170][Static206.anInt3639 >> 7][Static339.anInt5726 >> 7] & 0x4) != 0) {
				Static189.method2997(Static339.anInt5726 >> 7, Static69.aClass48ArrayArrayArray1, 1, false, Static206.anInt3639 >> 7);
				return;
			}
			return;
		}
		if ((Static13.aByteArrayArrayArray17[Static363.anInt6170][Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7][Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7] & 0x4) != 0) {
			Static189.method2997(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7, Static69.aClass48ArrayArrayArray1, 0, false, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7);
		}
		if (Static327.anInt5556 >= 2560) {
			return;
		}
		local109 = Static206.anInt3639 >> 7;
		@Pc(187) int local187 = Static339.anInt5726 >> 7;
		@Pc(192) int local192 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7;
		@Pc(197) int local197 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7;
		@Pc(208) int local208;
		if (local192 <= local109) {
			local208 = local109 - local192;
		} else {
			local208 = local192 - local109;
		}
		@Pc(223) int local223;
		if (local197 <= local187) {
			local223 = local187 - local197;
		} else {
			local223 = local197 - local187;
		}
		if (local208 == 0 && local223 == 0 || local208 <= -Static12.anInt161 || local208 >= Static12.anInt161 || -Static44.anInt787 >= local223 || Static44.anInt787 <= local223) {
			Static355.method5328("RC: " + local109 + "," + local187 + " " + local192 + "," + local197 + " " + Static21.anInt265 + "," + Static103.anInt2044, null);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local208 <= local223) {
			local295 = local208 * 65536 / local223;
			local297 = 32768;
			while (local197 != local187) {
				if (local197 > local187) {
					local187++;
				} else if (local197 < local187) {
					local187--;
				}
				if ((Static13.aByteArrayArrayArray17[Static363.anInt6170][local109][local187] & 0x4) != 0) {
					Static189.method2997(local187, Static69.aClass48ArrayArrayArray1, 1, false, local109);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					local297 -= 65536;
					if (local109 < local192) {
						local109++;
					} else if (local192 < local109) {
						local109--;
					}
					if ((Static13.aByteArrayArrayArray17[Static363.anInt6170][local109][local187] & 0x4) != 0) {
						Static189.method2997(local187, Static69.aClass48ArrayArrayArray1, 1, false, local109);
						return;
					}
				}
			}
			return;
		}
		local295 = local223 * 65536 / local208;
		local297 = 32768;
		while (local109 != local192) {
			if (local192 > local109) {
				local109++;
			} else if (local192 < local109) {
				local109--;
			}
			if ((Static13.aByteArrayArrayArray17[Static363.anInt6170][local109][local187] & 0x4) != 0) {
				Static189.method2997(local187, Static69.aClass48ArrayArrayArray1, 1, false, local109);
				return;
			}
			local297 += local295;
			if (local297 >= 65536) {
				if (local187 < local197) {
					local187++;
				} else if (local197 < local187) {
					local187--;
				}
				local297 -= 65536;
				if ((Static13.aByteArrayArrayArray17[Static363.anInt6170][local109][local187] & 0x4) != 0) {
					Static189.method2997(local187, Static69.aClass48ArrayArrayArray1, 1, false, local109);
					return;
				}
			}
		}
	}
}
