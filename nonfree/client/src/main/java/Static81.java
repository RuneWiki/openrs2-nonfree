import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "Lclient!kb;")
	public static Class9 aClass9_42;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
	public static int anInt2178 = -1;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	public static int anInt2179 = -1;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "Lclient!v;")
	private static Class62 aClass62_966 = Static45.method753(" has logged out)3");

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
	public static int anInt2180 = 0;

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
	public static int anInt2181 = -1;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "Lclient!v;")
	public static Class62 aClass62_967 = Static45.method753("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "[[I")
	private static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "Lclient!v;")
	public static Class62 aClass62_968 = aClass62_966;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] method1318() {
		@Pc(8) Class3_Sub1_Sub1_Sub4[] local8 = new Class3_Sub1_Sub1_Sub4[Static99.anInt2603];
		for (@Pc(10) int local10 = 0; local10 < Static99.anInt2603; local10++) {
			@Pc(20) Class3_Sub1_Sub1_Sub4 local20 = local8[local10] = new Class3_Sub1_Sub1_Sub4();
			local20.anInt2687 = Static39.anInt1163;
			local20.anInt2688 = Static14.anInt551;
			local20.anInt2683 = Static98.anIntArray281[local10];
			local20.anInt2684 = Static36.anIntArray78[local10];
			local20.anInt2686 = Static75.anIntArray228[local10];
			local20.anInt2685 = Static50.anIntArray310[local10];
			@Pc(50) byte[] local50 = Static98.aByteArrayArray9[local10];
			@Pc(56) int local56 = local20.anInt2685 * local20.anInt2686;
			local20.anIntArray306 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray306[local62] = Static70.anIntArray201[local50[local62] & 0xFF];
			}
		}
		Static51.method1440();
		return local8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIIIIIIIIII)Z")
	public static boolean method1319(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				anIntArrayArray21[local3][local7] = 0;
				Static45.anIntArrayArray11[local3][local7] = 99999999;
			}
		}
		anIntArrayArray21[arg4][arg9] = 99;
		Static45.anIntArrayArray11[arg4][arg9] = 0;
		@Pc(47) int local47 = arg9;
		local7 = arg4;
		@Pc(51) byte local51 = 0;
		Static99.anIntArray285[0] = arg4;
		@Pc(58) int local58 = local51 + 1;
		Static48.anIntArray110[0] = arg9;
		@Pc(62) boolean local62 = false;
		@Pc(64) int local64 = 0;
		@Pc(69) int[][] local69 = Static32.aClass11Array1[Static27.anInt818].anIntArrayArray3;
		@Pc(72) int local72 = Static99.anIntArray285.length;
		@Pc(189) int local189;
		while (local64 != local58) {
			local7 = Static99.anIntArray285[local64];
			local47 = Static48.anIntArray110[local64];
			local64 = (local64 + 1) % local72;
			if (arg6 == local7 && local47 == arg8) {
				local62 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static32.aClass11Array1[Static27.anInt818].method307(arg2 - 1, arg6, local47, arg5, arg8, local7)) {
					local62 = true;
					break;
				}
				if (arg2 < 10 && Static32.aClass11Array1[Static27.anInt818].method308(arg8, arg5, local47, arg2 - 1, local7, arg6)) {
					local62 = true;
					break;
				}
			}
			if (arg3 != 0 && arg7 != 0 && Static32.aClass11Array1[Static27.anInt818].method310(local47, arg8, local7, arg6, arg0, arg7, arg3)) {
				local62 = true;
				break;
			}
			local189 = Static45.anIntArrayArray11[local7][local47] + 1;
			if (local7 > 0 && anIntArrayArray21[local7 - 1][local47] == 0 && (local69[local7 - 1][local47] & 0x1280108) == 0) {
				Static99.anIntArray285[local58] = local7 - 1;
				Static48.anIntArray110[local58] = local47;
				local58 = (local58 + 1) % local72;
				anIntArrayArray21[local7 - 1][local47] = 2;
				Static45.anIntArrayArray11[local7 - 1][local47] = local189;
			}
			if (local7 < 103 && anIntArrayArray21[local7 + 1][local47] == 0 && (local69[local7 + 1][local47] & 0x1280180) == 0) {
				Static99.anIntArray285[local58] = local7 + 1;
				Static48.anIntArray110[local58] = local47;
				anIntArrayArray21[local7 + 1][local47] = 8;
				local58 = (local58 + 1) % local72;
				Static45.anIntArrayArray11[local7 + 1][local47] = local189;
			}
			if (local47 > 0 && anIntArrayArray21[local7][local47 - 1] == 0 && (local69[local7][local47 - 1] & 0x1280102) == 0) {
				Static99.anIntArray285[local58] = local7;
				Static48.anIntArray110[local58] = local47 - 1;
				local58 = (local58 + 1) % local72;
				anIntArrayArray21[local7][local47 - 1] = 1;
				Static45.anIntArrayArray11[local7][local47 - 1] = local189;
			}
			if (local47 < 103 && anIntArrayArray21[local7][local47 + 1] == 0 && (local69[local7][local47 + 1] & 0x1280120) == 0) {
				Static99.anIntArray285[local58] = local7;
				Static48.anIntArray110[local58] = local47 + 1;
				local58 = (local58 + 1) % local72;
				anIntArrayArray21[local7][local47 + 1] = 4;
				Static45.anIntArrayArray11[local7][local47 + 1] = local189;
			}
			if (local7 > 0 && local47 > 0 && anIntArrayArray21[local7 - 1][local47 - 1] == 0 && (local69[local7 - 1][local47 - 1] & 0x128010E) == 0 && (local69[local7 - 1][local47] & 0x1280108) == 0 && (local69[local7][local47 - 1] & 0x1280102) == 0) {
				Static99.anIntArray285[local58] = local7 - 1;
				Static48.anIntArray110[local58] = local47 - 1;
				anIntArrayArray21[local7 - 1][local47 - 1] = 3;
				Static45.anIntArrayArray11[local7 - 1][local47 - 1] = local189;
				local58 = (local58 + 1) % local72;
			}
			if (local7 < 103 && local47 > 0 && anIntArrayArray21[local7 + 1][local47 - 1] == 0 && (local69[local7 + 1][local47 - 1] & 0x1280183) == 0 && (local69[local7 + 1][local47] & 0x1280180) == 0 && (local69[local7][local47 - 1] & 0x1280102) == 0) {
				Static99.anIntArray285[local58] = local7 + 1;
				Static48.anIntArray110[local58] = local47 - 1;
				anIntArrayArray21[local7 + 1][local47 - 1] = 9;
				Static45.anIntArrayArray11[local7 + 1][local47 - 1] = local189;
				local58 = (local58 + 1) % local72;
			}
			if (local7 > 0 && local47 < 103 && anIntArrayArray21[local7 - 1][local47 + 1] == 0 && (local69[local7 - 1][local47 + 1] & 0x1280138) == 0 && (local69[local7 - 1][local47] & 0x1280108) == 0 && (local69[local7][local47 + 1] & 0x1280120) == 0) {
				Static99.anIntArray285[local58] = local7 - 1;
				Static48.anIntArray110[local58] = local47 + 1;
				local58 = (local58 + 1) % local72;
				anIntArrayArray21[local7 - 1][local47 + 1] = 6;
				Static45.anIntArrayArray11[local7 - 1][local47 + 1] = local189;
			}
			if (local7 < 103 && local47 < 103 && anIntArrayArray21[local7 + 1][local47 + 1] == 0 && (local69[local7 + 1][local47 + 1] & 0x12801E0) == 0 && (local69[local7 + 1][local47] & 0x1280180) == 0 && (local69[local7][local47 + 1] & 0x1280120) == 0) {
				Static99.anIntArray285[local58] = local7 + 1;
				Static48.anIntArray110[local58] = local47 + 1;
				anIntArrayArray21[local7 + 1][local47 + 1] = 12;
				Static45.anIntArrayArray11[local7 + 1][local47 + 1] = local189;
				local58 = (local58 + 1) % local72;
			}
		}
		Static40.anInt1177 = 0;
		@Pc(805) int local805;
		@Pc(812) int local812;
		@Pc(819) int local819;
		if (!local62) {
			if (!arg1) {
				return false;
			}
			local189 = 1000;
			local805 = 100;
			for (local812 = arg6 - 10; local812 <= arg6 + 10; local812++) {
				for (local819 = arg8 - 10; local819 <= arg8 + 10; local819++) {
					if (local812 >= 0 && local819 >= 0 && local812 < 104 && local819 < 104 && Static45.anIntArrayArray11[local812][local819] < 100) {
						@Pc(845) int local845 = 0;
						if (arg6 > local812) {
							local845 = arg6 - local812;
						} else if (local812 > arg6 + arg3 - 1) {
							local845 = local812 + 1 - arg6 - arg3;
						}
						@Pc(877) int local877 = 0;
						if (local819 < arg8) {
							local877 = arg8 - local819;
						} else if (arg8 + arg7 - 1 < local819) {
							local877 = local819 + 1 - arg7 - arg8;
						}
						@Pc(916) int local916 = local877 * local877 + local845 * local845;
						if (local916 < local189 || local916 == local189 && local805 > Static45.anIntArrayArray11[local812][local819]) {
							local189 = local916;
							local805 = Static45.anIntArrayArray11[local812][local819];
							local7 = local812;
							local47 = local819;
						}
					}
				}
			}
			if (local189 == 1000) {
				return false;
			}
			if (arg4 == local7 && local47 == arg9) {
				return false;
			}
			Static40.anInt1177 = 1;
		}
		@Pc(992) byte local992 = 0;
		Static99.anIntArray285[0] = local7;
		local64 = local992 + 1;
		Static48.anIntArray110[0] = local47;
		local189 = local805 = anIntArrayArray21[local7][local47];
		while (local7 != arg4 || arg9 != local47) {
			if (local189 != local805) {
				Static99.anIntArray285[local64] = local7;
				local805 = local189;
				Static48.anIntArray110[local64++] = local47;
			}
			if ((local189 & 0x1) != 0) {
				local47++;
			} else if ((local189 & 0x4) != 0) {
				local47--;
			}
			if ((local189 & 0x2) != 0) {
				local7++;
			} else if ((local189 & 0x8) != 0) {
				local7--;
			}
			local189 = anIntArrayArray21[local7][local47];
		}
		if (local64 > 0) {
			local72 = local64--;
			@Pc(1091) int local1091 = Static99.anIntArray285[local64];
			local812 = Static48.anIntArray110[local64];
			if (local72 > 25) {
				local72 = 25;
			}
			if (arg10 == 0) {
				Static63.aClass3_Sub8_Sub1_6.method1824(67);
				Static63.aClass3_Sub8_Sub1_6.method1806(local72 + local72 + 3);
			}
			if (arg10 == 1) {
				Static63.aClass3_Sub8_Sub1_6.method1824(132);
				Static63.aClass3_Sub8_Sub1_6.method1806(local72 + local72 + 3 + 14);
			}
			if (arg10 == 2) {
				Static63.aClass3_Sub8_Sub1_6.method1824(33);
				Static63.aClass3_Sub8_Sub1_6.method1806(local72 + local72 + 3);
			}
			Static63.aClass3_Sub8_Sub1_6.method1804(local812 + Static41.anInt1196);
			Static89.anInt2413 = Static99.anIntArray285[0];
			Static55.anInt1539 = Static48.anIntArray110[0];
			for (local819 = 1; local819 < local72; local819++) {
				local64--;
				Static63.aClass3_Sub8_Sub1_6.method1798(Static99.anIntArray285[local64] - local1091);
				Static63.aClass3_Sub8_Sub1_6.method1806(Static48.anIntArray110[local64] - local812);
			}
			Static63.aClass3_Sub8_Sub1_6.method1762(Static2.anInt56 + local1091);
			Static63.aClass3_Sub8_Sub1_6.method1795(Static109.aBooleanArray13[82] ? 1 : 0);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z")
	public static boolean method1320(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method1321() {
		aClass62_968 = null;
		aClass9_42 = null;
		anIntArrayArray21 = null;
		aClass62_967 = null;
		aClass62_966 = null;
	}
}
