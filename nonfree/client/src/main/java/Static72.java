import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!lc", name = "pb", descriptor = "I")
	public static int anInt1744 = 0;

	@OriginalMember(owner = "client!lc", name = "Yb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_815 = Static56.method816("scroll:");

	@OriginalMember(owner = "client!lc", name = "tb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_813 = aClass34_815;

	@OriginalMember(owner = "client!lc", name = "wb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_814 = Static56.method816("Mem:");

	@OriginalMember(owner = "client!lc", name = "ac", descriptor = "Lclient!ic;")
	public static Class34 aClass34_816 = Static56.method816(" loggt sich aus)3");

	@OriginalMember(owner = "client!lc", name = "bc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_817 = aClass34_815;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
	public static void method1067() {
		aClass34_816 = null;
		aClass34_817 = null;
		aClass34_814 = null;
		aClass34_815 = null;
		aClass34_813 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ic;BLclient!dd;Lclient!ic;)[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] method1070(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(8) int local8 = arg1.method1164(arg2);
		@Pc(14) int local14 = arg1.method1159(local8, arg0);
		return Static28.method500(local14, local8, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method1074() {
		if (Static87.aBooleanArray17[98]) {
			Static45.anInt1086 += (12 - Static45.anInt1086) / 2;
		} else if (Static87.aBooleanArray17[99]) {
			Static45.anInt1086 += (-Static45.anInt1086 - 12) / 2;
		} else {
			Static45.anInt1086 /= 2;
		}
		if (Static87.aBooleanArray17[96]) {
			Static106.anInt2450 += (-Static106.anInt2450 - 24) / 2;
		} else if (Static87.aBooleanArray17[97]) {
			Static106.anInt2450 += (24 - Static106.anInt2450) / 2;
		} else {
			Static106.anInt2450 /= 2;
		}
		anInt1744 = anInt1744 + Static106.anInt2450 / 2 & 0x7FF;
		Static59.anInt1552 += Static45.anInt1086 / 2;
		if (Static59.anInt1552 < 128) {
			Static59.anInt1552 = 128;
		}
		@Pc(100) int local100 = Static34.anInt908 + Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059;
		@Pc(105) int local105 = Static14.anInt364 + Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043;
		if (Static112.anInt2505 - local105 < -500 || Static112.anInt2505 - local105 > 500 || Static47.anInt1274 - local100 < -500 || Static47.anInt1274 - local100 > 500) {
			Static112.anInt2505 = local105;
			Static47.anInt1274 = local100;
		}
		if (Static59.anInt1552 > 383) {
			Static59.anInt1552 = 383;
		}
		if (Static112.anInt2505 != local105) {
			Static112.anInt2505 += (local105 - Static112.anInt2505) / 16;
		}
		if (local100 != Static47.anInt1274) {
			Static47.anInt1274 += (local100 - Static47.anInt1274) / 16;
		}
		@Pc(174) int local174 = Static112.anInt2505 >> 7;
		@Pc(178) int local178 = Static47.anInt1274 >> 7;
		@Pc(188) int local188 = Static123.method1945(Static47.anInt1274, Static42.anInt1024, Static112.anInt2505);
		@Pc(190) int local190 = 0;
		@Pc(208) int local208;
		if (local174 > 3 && local178 > 3 && local174 < 100 && local178 < 100) {
			for (local208 = local174 - 4; local208 <= local174 + 4; local208++) {
				for (@Pc(214) int local214 = local178 - 4; local214 <= local178 + 4; local214++) {
					@Pc(218) int local218 = Static42.anInt1024;
					if (local218 < 3 && (Static105.aByteArrayArrayArray5[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(246) int local246 = local188 - Static24.anIntArrayArrayArray4[local218][local208][local214];
					if (local190 < local246) {
						local190 = local246;
					}
				}
			}
		}
		local208 = local190 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (local208 > Static42.anInt1035) {
			Static42.anInt1035 += (local208 - Static42.anInt1035) / 24;
		} else if (local208 < Static42.anInt1035) {
			Static42.anInt1035 += (local208 - Static42.anInt1035) / 80;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!ic;ILclient!ic;BII)V")
	public static void method1076(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static90.aBoolean14 || Static96.anInt552 >= 500) {
			return;
		}
		Static61.aClass34Array11[Static96.anInt552] = arg3;
		Static6.aClass34Array3[Static96.anInt552] = arg1;
		Static50.anIntArray166[Static96.anInt552] = arg4;
		Static117.anIntArray363[Static96.anInt552] = arg0;
		Static104.anIntArray328[Static96.anInt552] = arg2;
		Static21.anIntArray71[Static96.anInt552] = arg5;
		Static96.anInt552++;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)Z")
	public static boolean method1077(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}
}
