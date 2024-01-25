import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_31 = new Class198("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)I")
	public static int method1709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!za;Lclient!ae;ILclient!cl;)Z")
	public static boolean method1710(@OriginalArg(2) Class200 arg0, @OriginalArg(3) Class6 arg1, @OriginalArg(5) Class5_Sub8 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray8 != null) {
			local13 = Static98.anInt3337 - (Static98.anInt3337 - Static98.anInt3335) * (arg2.anInt943 + (arg1.anInt97 - Static98.anInt3326)) / (Static98.anInt3333 - Static98.anInt3326);
			local7 = Static98.anInt3327 + (arg2.anInt948 + arg1.anInt116 - Static98.anInt3336) * (-Static98.anInt3327 + Static98.anInt3329) / (Static98.anInt3330 - Static98.anInt3336);
			local9 = Static98.anInt3327 + (Static98.anInt3329 - Static98.anInt3327) * (arg2.anInt948 + arg1.anInt118 + -Static98.anInt3336) / (Static98.anInt3330 - Static98.anInt3336);
			local11 = Static98.anInt3337 - (arg1.anInt100 + arg2.anInt943 - Static98.anInt3326) * (Static98.anInt3337 - Static98.anInt3335) / (Static98.anInt3333 - Static98.anInt3326);
		}
		@Pc(110) Class49 local110 = null;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		if (arg1.anInt102 != -1) {
			if (arg2.aBoolean77 && arg1.anInt127 != -1) {
				local110 = arg1.method84(true, arg0);
			} else {
				local110 = arg1.method84(false, arg0);
			}
			if (local110 != null) {
				local112 = arg2.anInt950 - (local110.RA() + 1 >> 1);
				if (local7 > local112) {
					local7 = local112;
				}
				local114 = arg2.anInt950 + (local110.RA() + 1 >> 1);
				local116 = arg2.anInt952 - (local110.Q() + 1 >> 1);
				if (local114 > local9) {
					local9 = local114;
				}
				if (local116 < local11) {
					local11 = local116;
				}
				local118 = arg2.anInt952 + (local110.Q() + 1 >> 1);
				if (local13 < local118) {
					local13 = local118;
				}
			}
		}
		@Pc(222) Class269 local222 = null;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(285) int local285;
		@Pc(308) int local308;
		if (arg1.aString1 != null) {
			local222 = Static28.method5136(arg1.anInt119);
			if (local222 != null) {
				local224 = Static113.aClass14_5.method278(null, null, arg1.aString1, Static427.aStringArray45);
				local226 = arg2.anInt952;
				if (local110 == null) {
					local226 -= local222.method5958() * local224 / 2;
				} else {
					local226 -= (local110.Q() >> 1) + local224 * local222.method5960();
				}
				for (local285 = 0; local285 < local224; local285++) {
					@Pc(291) String local291 = Static427.aStringArray45[local285];
					if (local224 - 1 > local285) {
						local291 = local291.substring(0, local291.length() - 4);
					}
					local308 = local222.method5961(local291);
					if (local228 < local308) {
						local228 = local308;
					}
				}
				local230 = arg2.anInt950 - local228 / 2;
				if (local7 > local230) {
					local7 = local230;
				}
				local232 = local228 / 2 + arg2.anInt950;
				if (local232 > local9) {
					local9 = local232;
				}
				local234 = local226;
				local236 = local226 + local224 * local222.method5960();
				if (local234 < local11) {
					local11 = local234;
				}
				if (local236 > local13) {
					local13 = local236;
				}
			}
		}
		if (Static98.anInt3327 > local9 || Static98.anInt3329 < local7 || local13 < Static98.anInt3335 || Static98.anInt3337 < local11) {
			return true;
		}
		@Pc(406) int local406;
		if (arg1.anIntArray8 != null) {
			@Pc(404) int[] local404 = new int[arg1.anIntArray8.length];
			for (local406 = 0; local406 < local404.length / 2; local406++) {
				local308 = arg1.anIntArray8[local406 * 2] + arg2.anInt948;
				@Pc(430) int local430 = arg2.anInt943 + arg1.anIntArray8[local406 * 2 + 1];
				local404[local406 * 2] = Static98.anInt3327 + (local308 - Static98.anInt3336) * (Static98.anInt3329 + -Static98.anInt3327) / (Static98.anInt3330 - Static98.anInt3336);
				local404[local406 * 2 + 1] = Static98.anInt3337 - (local430 - Static98.anInt3326) * (-Static98.anInt3335 + Static98.anInt3337) / (Static98.anInt3333 - Static98.anInt3326);
			}
			Static100.method1407(arg0, local404, arg1.anInt121);
			for (local308 = 0; local308 < local404.length / 2 - 1; local308++) {
				arg0.method5876(local404[(local308 + 1) * 2 + 1], local404[local308 * 2 + 1], local404[local308 * 2 + 2], local404[local308 * 2], arg1.anInt106);
			}
			arg0.method5876(local404[1], local404[local404.length - 1], local404[0], local404[local404.length - 2], arg1.anInt106);
		}
		if (local110 != null) {
			if (Static320.anInt4977 > 0 && (Static54.anInt944 != -1 && Static54.anInt944 == arg2.anInt953 || Static34.anInt675 != -1 && arg1.anInt129 == Static34.anInt675)) {
				if (Static350.anInt5747 <= 50) {
					local285 = Static350.anInt5747 * 2;
				} else {
					local285 = (100 - Static350.anInt5747) * 2;
				}
				local406 = local285 << 24 | 0xFFFF00;
				arg0.method5836(arg2.anInt952, arg2.anInt950, local110.YA() / 2 + 7, local406);
				arg0.method5836(arg2.anInt952, arg2.anInt950, local110.YA() / 2 + 5, local406);
				arg0.method5836(arg2.anInt952, arg2.anInt950, local110.YA() / 2 + 3, local406);
				arg0.method5836(arg2.anInt952, arg2.anInt950, local110.YA() / 2 + 1, local406);
				arg0.method5836(arg2.anInt952, arg2.anInt950, local110.YA() / 2, local406);
			}
			local110.method5785(arg2.anInt950 - (local110.RA() >> 1), arg2.anInt952 - (local110.Q() >> 1));
		}
		if (arg1.aString1 != null && local222 != null) {
			Static232.method3035(local226, local222, arg2, local228, local224, arg0, arg1);
		}
		if (arg1.anInt102 != -1 || arg1.aString1 != null) {
			@Pc(716) Class5_Sub29 local716 = new Class5_Sub29(arg2);
			local716.anInt4544 = local230;
			local716.anInt4541 = local232;
			local716.anInt4543 = local236;
			local716.anInt4546 = local118;
			local716.anInt4540 = local234;
			local716.anInt4542 = local112;
			local716.anInt4547 = local114;
			local716.anInt4539 = local116;
			Static382.aClass177_35.method3615(local716);
		}
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1712(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static12.method193(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static150.anInt2695; local33++) {
			@Pc(39) String local39 = Static338.aStringArray36[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static12.method193(local39);
			if (local39 != null && local39.equals(local20)) {
				Static150.anInt2695--;
				for (@Pc(63) int local63 = local33; local63 < Static150.anInt2695; local63++) {
					Static338.aStringArray36[local63] = Static338.aStringArray36[local63 + 1];
					Static263.aStringArray31[local63] = Static263.aStringArray31[local63 + 1];
					Static65.aStringArray34[local63] = Static65.aStringArray34[local63 + 1];
					Static417.aStringArray44[local63] = Static417.aStringArray44[local63 + 1];
					Static53.aBooleanArray4[local63] = Static53.aBooleanArray4[local63 + 1];
				}
				Static62.anInt1134 = Static319.anInt4969;
				Static288.method3576(Static87.aClass194_21);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg0));
				Static281.aClass5_Sub15_Sub2_13.method5545(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ue;I)I")
	public static int method1713(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) String local7 = Static381.method3064(arg0);
		@Pc(9) int[] local9 = null;
		if (Static403.method5362(arg0.anInt6815)) {
			local9 = Static306.aClass67_3.method1452((int) arg0.aLong215).anIntArray50;
		} else if (arg0.anInt6820 != -1) {
			local9 = Static306.aClass67_3.method1452(arg0.anInt6820).anIntArray50;
		} else if (Static449.method5910(arg0.anInt6815)) {
			@Pc(40) Class5_Sub7 local40 = (Class5_Sub7) Static380.aClass252_36.method5659((long) arg0.aLong215);
			if (local40 != null) {
				@Pc(45) Class2_Sub1_Sub3_Sub1 local45 = local40.aClass2_Sub1_Sub3_Sub1_1;
				@Pc(48) Class131 local48 = local45.aClass131_1;
				if (local48.anIntArray209 != null) {
					local48 = local48.method2781(Static408.aClass39_1);
				}
				if (local48 != null) {
					local9 = local48.anIntArray211;
				}
			}
		} else if (Static464.method5865(arg0.anInt6815)) {
			@Pc(82) Class114 local82;
			if (arg0.anInt6815 == 1003) {
				local82 = Static398.aClass256_4.method5782((int) arg0.aLong215);
			} else {
				local82 = Static398.aClass256_4.method5782((int) (arg0.aLong215 >>> 32 & 0x7FFFFFFFL));
			}
			if (local82.anIntArray170 != null) {
				local82 = local82.method2393(Static408.aClass39_1);
			}
			if (local82 != null) {
				local9 = local82.anIntArray167;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static211.method2803(local9);
		}
		@Pc(135) int local135 = Static21.aClass14_1.method282(Static324.aClass49Array11, local7);
		if (arg0.aBoolean458) {
			local135 += Static18.aClass49_1.YA() + 4;
		}
		return local135;
	}
}
