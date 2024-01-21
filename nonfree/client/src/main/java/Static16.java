import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!ff;")
	public static Class11 aClass11_8;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public static int anInt442;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
	public static int anInt444;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "Lclient!kc;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!wd;")
	private static Class80 aClass80_172 = Static2.method59("No response from server)3");

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_171 = aClass80_172;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "Lclient!wd;")
	private static Class80 aClass80_174 = Static2.method59("Loaded config");

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_173 = aClass80_174;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "[I")
	public static int[] anIntArray67 = new int[1000];

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "Lclient!wd;")
	private static Class80 aClass80_178 = Static2.method59("World");

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Lclient!wd;")
	public static Class80 aClass80_175 = aClass80_178;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!wd;")
	public static Class80 aClass80_176 = aClass80_178;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "Lclient!wd;")
	public static Class80 aClass80_177 = Static2.method59("Duell akzeptieren");

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	public static int anInt443 = 0;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Lclient!wd;")
	public static Class80 aClass80_179 = Static2.method59(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "Lclient!wd;")
	public static Class80 aClass80_180 = Static2.method59("Freie Welt");

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "[I")
	public static int[] anIntArray68 = new int[2048];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method253() {
		aClass80_172 = null;
		aCRC32_1 = null;
		aClass80_171 = null;
		aClass80_178 = null;
		aClass11_8 = null;
		aClass22_2 = null;
		aClass80_180 = null;
		aClass80_177 = null;
		aClass80_176 = null;
		aClass80_173 = null;
		aClass80_175 = null;
		anIntArray67 = null;
		anIntArray68 = null;
		aClass80_179 = null;
		aClass80_174 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
	public static boolean method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static2.anIntArrayArray1[local7][local11] = 0;
				Static63.anIntArrayArray21[local7][local11] = 99999999;
			}
		}
		local11 = arg10;
		@Pc(37) int local37 = arg0;
		Static2.anIntArrayArray1[arg10][arg0] = 99;
		@Pc(45) byte local45 = 0;
		@Pc(47) boolean local47 = false;
		@Pc(49) int local49 = 0;
		Static63.anIntArrayArray21[arg10][arg0] = 0;
		Static74.anIntArray257[0] = arg10;
		@Pc(62) int local62 = local45 + 1;
		Static127.anIntArray410[0] = arg0;
		@Pc(67) int local67 = Static74.anIntArray257.length;
		@Pc(72) int[][] local72 = Static17.aClass49Array1[anInt444].anIntArrayArray24;
		@Pc(185) int local185;
		while (local49 != local62) {
			local11 = Static74.anIntArray257[local49];
			local37 = Static127.anIntArray410[local49];
			local49 = (local49 + 1) % local67;
			if (local11 == arg8 && local37 == arg7) {
				local47 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static17.aClass49Array1[anInt444].method1181(arg1 - 1, arg8, arg4, arg7, local37, local11)) {
					local47 = true;
					break;
				}
				if (arg1 < 10 && Static17.aClass49Array1[anInt444].method1174(arg1 - 1, local11, arg8, arg7, local37, arg4)) {
					local47 = true;
					break;
				}
			}
			if (arg6 != 0 && arg5 != 0 && Static17.aClass49Array1[anInt444].method1176(arg6, arg8, local11, arg7, arg3, arg5, local37)) {
				local47 = true;
				break;
			}
			local185 = Static63.anIntArrayArray21[local11][local37] + 1;
			if (local11 > 0 && Static2.anIntArrayArray1[local11 - 1][local37] == 0 && (local72[local11 - 1][local37] & 0x1280108) == 0) {
				Static74.anIntArray257[local62] = local11 - 1;
				Static127.anIntArray410[local62] = local37;
				Static2.anIntArrayArray1[local11 - 1][local37] = 2;
				Static63.anIntArrayArray21[local11 - 1][local37] = local185;
				local62 = (local62 + 1) % local67;
			}
			if (local11 < 103 && Static2.anIntArrayArray1[local11 + 1][local37] == 0 && (local72[local11 + 1][local37] & 0x1280180) == 0) {
				Static74.anIntArray257[local62] = local11 + 1;
				Static127.anIntArray410[local62] = local37;
				local62 = (local62 + 1) % local67;
				Static2.anIntArrayArray1[local11 + 1][local37] = 8;
				Static63.anIntArrayArray21[local11 + 1][local37] = local185;
			}
			if (local37 > 0 && Static2.anIntArrayArray1[local11][local37 - 1] == 0 && (local72[local11][local37 - 1] & 0x1280102) == 0) {
				Static74.anIntArray257[local62] = local11;
				Static127.anIntArray410[local62] = local37 - 1;
				local62 = (local62 + 1) % local67;
				Static2.anIntArrayArray1[local11][local37 - 1] = 1;
				Static63.anIntArrayArray21[local11][local37 - 1] = local185;
			}
			if (local37 < 103 && Static2.anIntArrayArray1[local11][local37 + 1] == 0 && (local72[local11][local37 + 1] & 0x1280120) == 0) {
				Static74.anIntArray257[local62] = local11;
				Static127.anIntArray410[local62] = local37 + 1;
				local62 = (local62 + 1) % local67;
				Static2.anIntArrayArray1[local11][local37 + 1] = 4;
				Static63.anIntArrayArray21[local11][local37 + 1] = local185;
			}
			if (local11 > 0 && local37 > 0 && Static2.anIntArrayArray1[local11 - 1][local37 - 1] == 0 && (local72[local11 - 1][local37 - 1] & 0x128010E) == 0 && (local72[local11 - 1][local37] & 0x1280108) == 0 && (local72[local11][local37 - 1] & 0x1280102) == 0) {
				Static74.anIntArray257[local62] = local11 - 1;
				Static127.anIntArray410[local62] = local37 - 1;
				local62 = (local62 + 1) % local67;
				Static2.anIntArrayArray1[local11 - 1][local37 - 1] = 3;
				Static63.anIntArrayArray21[local11 - 1][local37 - 1] = local185;
			}
			if (local11 < 103 && local37 > 0 && Static2.anIntArrayArray1[local11 + 1][local37 - 1] == 0 && (local72[local11 + 1][local37 - 1] & 0x1280183) == 0 && (local72[local11 + 1][local37] & 0x1280180) == 0 && (local72[local11][local37 - 1] & 0x1280102) == 0) {
				Static74.anIntArray257[local62] = local11 + 1;
				Static127.anIntArray410[local62] = local37 - 1;
				local62 = (local62 + 1) % local67;
				Static2.anIntArrayArray1[local11 + 1][local37 - 1] = 9;
				Static63.anIntArrayArray21[local11 + 1][local37 - 1] = local185;
			}
			if (local11 > 0 && local37 < 103 && Static2.anIntArrayArray1[local11 - 1][local37 + 1] == 0 && (local72[local11 - 1][local37 + 1] & 0x1280138) == 0 && (local72[local11 - 1][local37] & 0x1280108) == 0 && (local72[local11][local37 + 1] & 0x1280120) == 0) {
				Static74.anIntArray257[local62] = local11 - 1;
				Static127.anIntArray410[local62] = local37 + 1;
				local62 = (local62 + 1) % local67;
				Static2.anIntArrayArray1[local11 - 1][local37 + 1] = 6;
				Static63.anIntArrayArray21[local11 - 1][local37 + 1] = local185;
			}
			if (local11 < 103 && local37 < 103 && Static2.anIntArrayArray1[local11 + 1][local37 + 1] == 0 && (local72[local11 + 1][local37 + 1] & 0x12801E0) == 0 && (local72[local11 + 1][local37] & 0x1280180) == 0 && (local72[local11][local37 + 1] & 0x1280120) == 0) {
				Static74.anIntArray257[local62] = local11 + 1;
				Static127.anIntArray410[local62] = local37 + 1;
				Static2.anIntArrayArray1[local11 + 1][local37 + 1] = 12;
				local62 = (local62 + 1) % local67;
				Static63.anIntArrayArray21[local11 + 1][local37 + 1] = local185;
			}
		}
		Static59.anInt1767 = 0;
		@Pc(800) int local800;
		@Pc(807) int local807;
		@Pc(814) int local814;
		if (!local47) {
			if (!arg9) {
				return false;
			}
			local185 = 1000;
			local800 = 100;
			for (local807 = arg8 - 10; local807 <= arg8 + 10; local807++) {
				for (local814 = arg7 - 10; local814 <= arg7 + 10; local814++) {
					if (local807 >= 0 && local814 >= 0 && local807 < 104 && local814 < 104 && Static63.anIntArrayArray21[local807][local814] < 100) {
						@Pc(840) int local840 = 0;
						@Pc(842) int local842 = 0;
						if (arg8 > local807) {
							local840 = arg8 - local807;
						} else if (arg6 + arg8 - 1 < local807) {
							local840 = local807 + 1 - arg6 - arg8;
						}
						if (local814 < arg7) {
							local842 = arg7 - local814;
						} else if (arg7 + arg5 - 1 < local814) {
							local842 = local814 + 1 - arg5 - arg7;
						}
						@Pc(906) int local906 = local840 * local840 + local842 * local842;
						if (local906 < local185 || local185 == local906 && Static63.anIntArrayArray21[local807][local814] < local800) {
							local37 = local814;
							local11 = local807;
							local185 = local906;
							local800 = Static63.anIntArrayArray21[local807][local814];
						}
					}
				}
			}
			if (local185 == 1000) {
				return false;
			}
			if (local11 == arg10 && arg0 == local37) {
				return false;
			}
			Static59.anInt1767 = 1;
		}
		@Pc(970) byte local970 = 0;
		Static74.anIntArray257[0] = local11;
		local49 = local970 + 1;
		Static127.anIntArray410[0] = local37;
		local185 = local800 = Static2.anIntArrayArray1[local11][local37];
		while (local11 != arg10 || local37 != arg0) {
			if (local800 != local185) {
				local800 = local185;
				Static74.anIntArray257[local49] = local11;
				Static127.anIntArray410[local49++] = local37;
			}
			if ((local185 & 0x1) != 0) {
				local37++;
			} else if ((local185 & 0x4) != 0) {
				local37--;
			}
			if ((local185 & 0x2) != 0) {
				local11++;
			} else if ((local185 & 0x8) != 0) {
				local11--;
			}
			local185 = Static2.anIntArrayArray1[local11][local37];
		}
		if (local49 > 0) {
			local67 = local49--;
			local807 = Static127.anIntArray410[local49];
			@Pc(1067) int local1067 = Static74.anIntArray257[local49];
			if (local67 > 25) {
				local67 = 25;
			}
			if (arg2 == 0) {
				Static120.aClass2_Sub17_Sub1_3.method1799(38);
				Static120.aClass2_Sub17_Sub1_3.method1769(local67 + local67 + 3);
			}
			if (arg2 == 1) {
				Static120.aClass2_Sub17_Sub1_3.method1799(183);
				Static120.aClass2_Sub17_Sub1_3.method1769(local67 + local67 + 14 + 3);
			}
			if (arg2 == 2) {
				Static120.aClass2_Sub17_Sub1_3.method1799(138);
				Static120.aClass2_Sub17_Sub1_3.method1769(local67 + local67 + 3);
			}
			Static120.aClass2_Sub17_Sub1_3.method1776(local807 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static57.anInt1736 + local1067);
			Static120.aClass2_Sub17_Sub1_3.method1769(Static10.aBooleanArray2[82] ? 1 : 0);
			Static119.anInt1678 = Static74.anIntArray257[0];
			Static2.anInt121 = Static127.anIntArray410[0];
			for (local814 = 1; local814 < local67; local814++) {
				local49--;
				Static120.aClass2_Sub17_Sub1_3.method1775(Static74.anIntArray257[local49] - local1067);
				Static120.aClass2_Sub17_Sub1_3.method1753(Static127.anIntArray410[local49] - local807);
			}
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
