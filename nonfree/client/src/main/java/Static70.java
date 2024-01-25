import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_39 = new Class209("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIBII)V")
	public static void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static327.method4554(arg3, Static181.anInt3543, Static430.anInt7123);
		@Pc(17) int local17 = Static327.method4554(arg4, Static181.anInt3543, Static430.anInt7123);
		@Pc(27) int local27 = Static327.method4554(arg2, Static184.anInt3600, Static8.anInt223);
		@Pc(33) int local33 = Static327.method4554(arg1, Static184.anInt3600, Static8.anInt223);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static64.method1247(local27, Static280.anIntArrayArray51[local35], local33, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg4; local11++) {
				if (arg0 == Static5.anIntArrayArray1[local7][local11] && Static250.anIntArrayArray47[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method1328() {
		@Pc(14) int local14 = (int) ((double) Static229.anInt4427 * 34.46D);
		local14 <<= 0x0;
		if (Static33.aClass49_1.method4439()) {
			local14 += 128;
		}
		Static33.aClass49_1.ia(50, local14);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg2;
		@Pc(21) int local21 = arg0 - arg2;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = (1 - local57) * local25 + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = local45 * (local57 - 3);
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = (local61 - 3) * local53;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg0 - 1) * local100;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local21 - 1);
		@Pc(152) int[] local152 = Static280.anIntArrayArray51[arg1];
		Static64.method1247(arg4 - arg6, local152, arg4 - local16, arg5);
		Static64.method1247(arg4 - local16, local152, arg4 + local16, arg3);
		Static64.method1247(local16 + arg4, local152, arg6 + arg4, arg5);
		while (local9 > 0) {
			@Pc(195) boolean local195 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local134;
					local70 += local116;
					local134 += local104;
					local7++;
					local116 += local104;
				}
			}
			if (local195) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local126;
						local96 += local142;
						local11++;
						local142 += local112;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local88 += local126;
					local96 += local142;
					local11++;
					local126 += local112;
					local142 += local112;
				}
				local88 += -local148;
				local96 += -local132;
				local148 -= local108;
				local132 -= local108;
			}
			if (local79 < 0) {
				local79 += local134;
				local70 += local116;
				local134 += local104;
				local116 += local104;
				local7++;
			}
			local79 += -local122;
			local70 += -local140;
			local140 -= local100;
			local122 -= local100;
			local9--;
			@Pc(334) int local334 = arg1 - local9;
			@Pc(338) int local338 = local9 + arg1;
			@Pc(342) int local342 = local7 + arg4;
			@Pc(347) int local347 = arg4 - local7;
			if (local195) {
				@Pc(353) int local353 = arg4 + local11;
				@Pc(358) int local358 = arg4 - local11;
				Static64.method1247(local347, Static280.anIntArrayArray51[local334], local358, arg5);
				Static64.method1247(local358, Static280.anIntArrayArray51[local334], local353, arg3);
				Static64.method1247(local353, Static280.anIntArrayArray51[local334], local342, arg5);
				Static64.method1247(local347, Static280.anIntArrayArray51[local338], local358, arg5);
				Static64.method1247(local358, Static280.anIntArrayArray51[local338], local353, arg3);
				Static64.method1247(local353, Static280.anIntArrayArray51[local338], local342, arg5);
			} else {
				Static64.method1247(local347, Static280.anIntArrayArray51[local334], local342, arg5);
				Static64.method1247(local347, Static280.anIntArrayArray51[local338], local342, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)S")
	public static short method1330(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local15 * local19 >> 7;
		@Pc(51) int local51 = local19 + local39;
		@Pc(59) int local59;
		if (local51 == 0) {
			local59 = local39 << 1;
		} else {
			local59 = (local39 << 8) / local51;
		}
		return (short) (local59 >> 4 << 7 | local9 << 10 | local51);
	}
}
