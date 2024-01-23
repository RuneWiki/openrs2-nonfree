import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString88;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "I")
	public static int anInt2450 = 0;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZI)I")
	public static int method1947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(19) int local19 = arg0 & arg2 - 1;
		@Pc(23) int local23 = arg0 / arg2;
		@Pc(28) int local28 = Static95.method4069(local23, local7);
		@Pc(35) int local35 = Static95.method4069(local23, local7 + 1);
		@Pc(47) int local47 = Static95.method4069(local23 + 1, local7);
		@Pc(56) int local56 = Static95.method4069(local23 + 1, local7 + 1);
		@Pc(63) int local63 = Static111.method1801(local13, arg2, local35, local28);
		@Pc(70) int local70 = Static111.method1801(local13, arg2, local56, local47);
		return Static111.method1801(local19, arg2, local70, local63);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static257.anInt5010 + arg0 * Static172.anInt155 >> 16;
		@Pc(19) int local19 = arg3 * Static172.anInt155 - arg0 * Static257.anInt5010 >> 16;
		@Pc(29) int local29 = arg1 * Static138.anInt2726 + local19 * Static91.anInt1749 >> 16;
		@Pc(39) int local39 = arg1 * Static91.anInt1749 - local19 * Static138.anInt2726 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static138.anInt2726 + local19 * Static91.anInt1749 >> 16;
		@Pc(76) int local76 = arg2 * Static91.anInt1749 - local19 * Static138.anInt2726 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static25.anInt487 && local87 < Static25.anInt487) {
			return false;
		} else if (local50 > Static187.anInt3768 && local87 > Static187.anInt3768) {
			return false;
		} else if (local56 < Static56.anInt1120 && local93 < Static56.anInt1120) {
			return false;
		} else {
			return local56 <= Static38.anInt768 || local93 <= Static38.anInt768;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method1949() {
		Static272.aClass169_144.method4018();
		Static296.aClass169_155.method4018();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(CIB)C")
	public static char method1950(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZLjava/lang/String;)I")
	public static int method1952(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(36) int local36 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(49) char local49 = arg1.charAt(local38);
			if (local38 == 0) {
				if (local49 == '-') {
					local31 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local49 >= '0' && local49 <= '9') {
				local80 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local80 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local80 = local49 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local80) {
				throw new NumberFormatException();
			}
			if (local31) {
				local80 = -local80;
			}
			@Pc(128) int local128 = local29 * arg0 + local80;
			if (local128 / arg0 != local29) {
				throw new NumberFormatException();
			}
			local33 = true;
			local29 = local128;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local29;
	}
}
