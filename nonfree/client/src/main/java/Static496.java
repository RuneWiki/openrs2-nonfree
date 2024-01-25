import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	public static int anInt7941;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!da;ILclient!pga;ILclient!oh;IILjava/lang/String;IIILclient!aa;)V")
	public static void method7084(@OriginalArg(0) Class68 arg0, @OriginalArg(2) Class289 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class273 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class1 arg10) {
		@Pc(13) int local13;
		if (Static60.anInt1040 == 4) {
			local13 = (int) Static213.aFloat46 & 0x3FFF;
		} else {
			local13 = (int) Static213.aFloat46 + Static91.anInt1623 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt7402 / 2, arg3.anInt7385 / 2) + 10;
		@Pc(43) int local43 = arg9 * arg9 + arg5 * arg5;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(58) int local58 = Class145_Sub1.anIntArray761[local13];
		@Pc(62) int local62 = Class145_Sub1.anIntArray760[local13];
		if (Static60.anInt1040 != 4) {
			local58 = local58 * 256 / (Static505.anInt8017 + 256);
			local62 = local62 * 256 / (Static505.anInt8017 + 256);
		}
		@Pc(93) int local93 = local62 * arg5 + local58 * arg9 >> 14;
		@Pc(104) int local104 = arg9 * local62 - arg5 * local58 >> 14;
		@Pc(111) int local111 = arg1.method6939(100, arg6, (Class43[]) null);
		@Pc(124) int local124 = local93 - local111 / 2;
		@Pc(132) int local132 = arg1.method6934(0, arg6, 100, (Class43[]) null);
		if (local124 >= -arg3.anInt7402 && local124 <= arg3.anInt7402 && -arg3.anInt7385 <= local104 && local104 <= arg3.anInt7385) {
			arg0.method7900(50, (int[]) null, arg2, arg4, arg3.anInt7385 / 2 + arg4 - arg7 - local104 - local132, local111, arg10, 0, arg6, 0, 1, arg3.anInt7402 / 2 + local124 + arg8, (Class43[]) null, arg8, 0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(JII)Ljava/lang/String;")
	public static String method7085(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static97.method1514(arg0);
		@Pc(10) int local10 = Static246.aCalendar3.get(5);
		@Pc(14) int local14 = Static246.aCalendar3.get(2);
		@Pc(18) int local18 = Static246.aCalendar3.get(1);
		return arg1 == 3 ? Static517.method7328(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static437.aStringArrayArray2[arg1][local14] + "-" + local18;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Lclient!vo;Ljava/lang/String;ZZI)V")
	public static void method7086(@OriginalArg(0) String arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (!arg3) {
			Static584.method8123(arg0, 3, arg1);
			return;
		}
		@Pc(20) String local20;
		if (Static688.aString122.startsWith("win") && arg1.aBoolean913) {
			local20 = null;
			if (Static214.anApplet1 != null) {
				local20 = Static214.anApplet1.getParameter("haveie6");
			}
			if (local20 == null || !local20.equals("1")) {
				@Pc(42) Class163 local42 = Static584.method8123(arg0, 0, arg1);
				Static609.aClass163_6 = local42;
				Static686.aString116 = arg0;
				Static136.aClass389_3 = arg1;
				return;
			}
		}
		if (Static688.aString122.startsWith("mac")) {
			local20 = null;
			if (Static214.anApplet1 != null) {
				local20 = Static214.anApplet1.getParameter("havefirefox");
			}
			if (local20 != null && local20.equals("1") && arg4) {
				Static514.method7280(1, arg2, arg1, arg0);
				return;
			}
		}
		Static584.method8123(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method7087(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(75) int local75;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local75 = 0; local75 < arg0; local75++) {
				if (local26 >= local75) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(124) int local124;
		for (local75 = 0; local75 < arg0; local75++) {
			for (local124 = 0; local124 < arg0; local124++) {
				if (local124 >= local75) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(173) int local173;
		for (local124 = arg0 - 1; local124 >= 0; local124--) {
			for (local173 = 0; local173 < arg0; local173++) {
				if (local124 <= local173) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(232) int local232;
		for (local173 = arg0 - 1; local173 >= 0; local173--) {
			for (local232 = 0; local232 < arg0; local232++) {
				if (local232 <= local173 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(287) int local287;
		for (local232 = 0; local232 < arg0; local232++) {
			for (local287 = 0; local287 < arg0; local287++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local232 << 1 <= local287) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(357) int local357;
		for (local287 = 0; local287 < arg0; local287++) {
			for (local357 = arg0 - 1; local357 >= 0; local357--) {
				if (local357 <= local287 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(412) int local412;
		for (local357 = arg0 - 1; local357 >= 0; local357--) {
			for (local412 = arg0 - 1; local412 >= 0; local412--) {
				if (local412 >= local357 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(470) int local470;
		for (local412 = arg0 - 1; local412 >= 0; local412--) {
			for (local470 = arg0 - 1; local470 >= 0; local470--) {
				if (local470 <= local412 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(525) int local525;
		for (local470 = arg0 - 1; local470 >= 0; local470--) {
			for (local525 = 0; local525 < arg0; local525++) {
				if (local525 >= local470 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(580) int local580;
		for (local525 = 0; local525 < arg0; local525++) {
			for (local580 = 0; local580 < arg0; local580++) {
				if (local580 <= local525 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(643) int local643;
		for (local580 = 0; local580 < arg0; local580++) {
			for (local643 = arg0 - 1; local643 >= 0; local643--) {
				if (local643 >= local580 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(697) int local697;
		for (local643 = arg0 - 1; local643 >= 0; local643--) {
			for (local697 = 0; local697 < arg0; local697++) {
				if (local697 >= local643 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(753) int local753;
		for (local697 = 0; local697 < arg0; local697++) {
			for (local753 = 0; local753 < arg0; local753++) {
				if (local753 <= local697 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(808) int local808;
		for (local753 = 0; local753 < arg0; local753++) {
			for (local808 = arg0 - 1; local808 >= 0; local808--) {
				if (local753 >> 1 <= local808) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(867) int local867;
		for (local808 = arg0 - 1; local808 >= 0; local808--) {
			for (local867 = arg0 - 1; local867 >= 0; local867--) {
				if (local808 << 1 >= local867) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(921) int local921;
		for (local867 = arg0 - 1; local867 >= 0; local867--) {
			for (local921 = arg0 - 1; local921 >= 0; local921--) {
				if (local867 >> 1 <= local921) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(973) int local973;
		for (local921 = arg0 - 1; local921 >= 0; local921--) {
			for (local973 = 0; local973 < arg0; local973++) {
				if (local921 << 1 >= local973) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1028) int local1028;
		for (local973 = 0; local973 < arg0; local973++) {
			for (local1028 = 0; local1028 < arg0; local1028++) {
				if (local973 >> 1 <= local1028) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1083) int local1083;
		for (local1028 = 0; local1028 < arg0; local1028++) {
			for (local1083 = arg0 - 1; local1083 >= 0; local1083--) {
				if (local1028 << 1 >= local1083) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1142) int local1142;
		for (local1083 = 0; local1083 < arg0; local1083++) {
			for (local1142 = 0; local1142 < arg0; local1142++) {
				if (local1142 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1199) int local1199;
		for (local1142 = 0; local1142 < arg0; local1142++) {
			for (local1199 = 0; local1199 < arg0; local1199++) {
				if (arg0 / 2 >= local1142) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1248) int local1248;
		for (local1199 = 0; local1199 < arg0; local1199++) {
			for (local1248 = 0; local1248 < arg0; local1248++) {
				if (arg0 / 2 <= local1248) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1301) int local1301;
		for (local1248 = 0; local1248 < arg0; local1248++) {
			for (local1301 = 0; local1301 < arg0; local1301++) {
				if (local1248 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1354) int local1354;
		for (local1301 = 0; local1301 < arg0; local1301++) {
			for (local1354 = 0; local1354 < arg0; local1354++) {
				if (local1301 - arg0 / 2 >= local1354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1416) int local1416;
		for (local1354 = arg0 - 1; local1354 >= 0; local1354--) {
			for (local1416 = 0; local1416 < arg0; local1416++) {
				if (local1416 <= local1354 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1478) int local1478;
		for (local1416 = arg0 - 1; local1416 >= 0; local1416--) {
			for (local1478 = arg0 - 1; local1478 >= 0; local1478--) {
				if (local1416 - arg0 / 2 >= local1478) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1539) int local1539;
		for (local1478 = 0; local1478 < arg0; local1478++) {
			for (local1539 = arg0 - 1; local1539 >= 0; local1539--) {
				if (local1478 - arg0 / 2 >= local1539) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1609) int local1609;
		for (local1539 = 0; local1539 < arg0; local1539++) {
			for (local1609 = 0; local1609 < arg0; local1609++) {
				if (local1539 - arg0 / 2 <= local1609) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1670) int local1670;
		for (local1609 = arg0 - 1; local1609 >= 0; local1609--) {
			for (local1670 = 0; local1670 < arg0; local1670++) {
				if (local1609 - arg0 / 2 <= local1670) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1733) int local1733;
		for (local1670 = arg0 - 1; local1670 >= 0; local1670--) {
			for (local1733 = arg0 - 1; local1733 >= 0; local1733--) {
				if (local1670 - arg0 / 2 <= local1733) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1733 = 0; local1733 < arg0; local1733++) {
			for (@Pc(1784) int local1784 = arg0 - 1; local1784 >= 0; local1784--) {
				if (local1733 - arg0 / 2 <= local1784) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
	public static int method7088(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
