import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1539 = Static51.method932("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method2524() {
		aClass10_1539 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method2525(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static11.method2466(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static11.aClass63_6.anApplet1 != null) {
				@Pc(102) Class15 local102 = Static11.aClass63_6.method1962(new URL(Static11.aClass63_6.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static46.anInt1139 + "&u=" + Static85.aLong66 + "&v1=" + Static122.aString2 + "&v2=" + Static122.aString4 + "&e=" + local7));
				while (local102.anInt821 == 0) {
					Static50.method927(1L);
				}
				if (local102.anInt821 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local102.anObject2;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBZIIIIIIIII)Z")
	public static boolean method2527(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static47.anIntArrayArray15[local7][local11] = 0;
				Static121.anIntArrayArray31[local7][local11] = 99999999;
			}
		}
		local11 = arg3;
		Static47.anIntArrayArray15[arg3][arg10] = 99;
		Static121.anIntArrayArray31[arg3][arg10] = 0;
		@Pc(51) int local51 = arg10;
		@Pc(53) int local53 = 0;
		@Pc(55) byte local55 = 0;
		Static169.anIntArray397[0] = arg3;
		@Pc(62) int local62 = local55 + 1;
		Static94.anIntArray233[0] = arg10;
		@Pc(69) int[][] local69 = Static59.aClass27Array1[Static56.anInt1432].anIntArrayArray16;
		@Pc(71) boolean local71 = false;
		@Pc(74) int local74 = Static169.anIntArray397.length;
		@Pc(182) int local182;
		while (local53 != local62) {
			local11 = Static169.anIntArray397[local53];
			local51 = Static94.anIntArray233[local53];
			local53 = (local53 + 1) % local74;
			if (arg5 == local11 && arg9 == local51) {
				local71 = true;
				break;
			}
			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && Static59.aClass27Array1[Static56.anInt1432].method934(arg5, arg6, arg9, local11, arg2 - 1, local51)) {
					local71 = true;
					break;
				}
				if (arg2 < 10 && Static59.aClass27Array1[Static56.anInt1432].method938(arg5, local51, local11, arg2 - 1, arg9, arg6)) {
					local71 = true;
					break;
				}
			}
			if (arg7 != 0 && arg4 != 0 && Static59.aClass27Array1[Static56.anInt1432].method935(local51, arg4, arg9, arg0, local11, arg7, arg5)) {
				local71 = true;
				break;
			}
			local182 = Static121.anIntArrayArray31[local11][local51] + 1;
			if (local11 > 0 && Static47.anIntArrayArray15[local11 - 1][local51] == 0 && (local69[local11 - 1][local51] & 0x12C0108) == 0) {
				Static169.anIntArray397[local62] = local11 - 1;
				Static94.anIntArray233[local62] = local51;
				Static47.anIntArrayArray15[local11 - 1][local51] = 2;
				Static121.anIntArrayArray31[local11 - 1][local51] = local182;
				local62 = (local62 + 1) % local74;
			}
			if (local11 < 103 && Static47.anIntArrayArray15[local11 + 1][local51] == 0 && (local69[local11 + 1][local51] & 0x12C0180) == 0) {
				Static169.anIntArray397[local62] = local11 + 1;
				Static94.anIntArray233[local62] = local51;
				Static47.anIntArrayArray15[local11 + 1][local51] = 8;
				Static121.anIntArrayArray31[local11 + 1][local51] = local182;
				local62 = (local62 + 1) % local74;
			}
			if (local51 > 0 && Static47.anIntArrayArray15[local11][local51 - 1] == 0 && (local69[local11][local51 - 1] & 0x12C0102) == 0) {
				Static169.anIntArray397[local62] = local11;
				Static94.anIntArray233[local62] = local51 - 1;
				Static47.anIntArrayArray15[local11][local51 - 1] = 1;
				local62 = (local62 + 1) % local74;
				Static121.anIntArrayArray31[local11][local51 - 1] = local182;
			}
			if (local51 < 103 && Static47.anIntArrayArray15[local11][local51 + 1] == 0 && (local69[local11][local51 + 1] & 0x12C0120) == 0) {
				Static169.anIntArray397[local62] = local11;
				Static94.anIntArray233[local62] = local51 + 1;
				Static47.anIntArrayArray15[local11][local51 + 1] = 4;
				local62 = (local62 + 1) % local74;
				Static121.anIntArrayArray31[local11][local51 + 1] = local182;
			}
			if (local11 > 0 && local51 > 0 && Static47.anIntArrayArray15[local11 - 1][local51 - 1] == 0 && (local69[local11 - 1][local51 - 1] & 0x12C010E) == 0 && (local69[local11 - 1][local51] & 0x12C0108) == 0 && (local69[local11][local51 - 1] & 0x12C0102) == 0) {
				Static169.anIntArray397[local62] = local11 - 1;
				Static94.anIntArray233[local62] = local51 - 1;
				Static47.anIntArrayArray15[local11 - 1][local51 - 1] = 3;
				Static121.anIntArrayArray31[local11 - 1][local51 - 1] = local182;
				local62 = (local62 + 1) % local74;
			}
			if (local11 < 103 && local51 > 0 && Static47.anIntArrayArray15[local11 + 1][local51 - 1] == 0 && (local69[local11 + 1][local51 - 1] & 0x12C0183) == 0 && (local69[local11 + 1][local51] & 0x12C0180) == 0 && (local69[local11][local51 - 1] & 0x12C0102) == 0) {
				Static169.anIntArray397[local62] = local11 + 1;
				Static94.anIntArray233[local62] = local51 - 1;
				local62 = (local62 + 1) % local74;
				Static47.anIntArrayArray15[local11 + 1][local51 - 1] = 9;
				Static121.anIntArrayArray31[local11 + 1][local51 - 1] = local182;
			}
			if (local11 > 0 && local51 < 103 && Static47.anIntArrayArray15[local11 - 1][local51 + 1] == 0 && (local69[local11 - 1][local51 + 1] & 0x12C0138) == 0 && (local69[local11 - 1][local51] & 0x12C0108) == 0 && (local69[local11][local51 + 1] & 0x12C0120) == 0) {
				Static169.anIntArray397[local62] = local11 - 1;
				Static94.anIntArray233[local62] = local51 + 1;
				local62 = (local62 + 1) % local74;
				Static47.anIntArrayArray15[local11 - 1][local51 + 1] = 6;
				Static121.anIntArrayArray31[local11 - 1][local51 + 1] = local182;
			}
			if (local11 < 103 && local51 < 103 && Static47.anIntArrayArray15[local11 + 1][local51 + 1] == 0 && (local69[local11 + 1][local51 + 1] & 0x12C01E0) == 0 && (local69[local11 + 1][local51] & 0x12C0180) == 0 && (local69[local11][local51 + 1] & 0x12C0120) == 0) {
				Static169.anIntArray397[local62] = local11 + 1;
				Static94.anIntArray233[local62] = local51 + 1;
				local62 = (local62 + 1) % local74;
				Static47.anIntArrayArray15[local11 + 1][local51 + 1] = 12;
				Static121.anIntArrayArray31[local11 + 1][local51 + 1] = local182;
			}
		}
		Static44.anInt1061 = 0;
		@Pc(803) int local803;
		@Pc(808) int local808;
		@Pc(815) int local815;
		@Pc(839) int local839;
		if (!local71) {
			if (!arg1) {
				return false;
			}
			local182 = 1000;
			local803 = 100;
			for (local808 = arg5 - 10; local808 <= arg5 + 10; local808++) {
				for (local815 = arg9 - 10; local815 <= arg9 + 10; local815++) {
					if (local808 >= 0 && local815 >= 0 && local808 < 104 && local815 < 104 && Static121.anIntArrayArray31[local808][local815] < 100) {
						local839 = 0;
						if (local808 < arg5) {
							local839 = arg5 - local808;
						} else if (local808 > arg7 + arg5 - 1) {
							local839 = local808 + 1 - arg7 - arg5;
						}
						@Pc(866) int local866 = 0;
						if (arg9 > local815) {
							local866 = arg9 - local815;
						} else if (arg4 + arg9 - 1 < local815) {
							local866 = local815 + 1 - arg9 - arg4;
						}
						@Pc(900) int local900 = local866 * local866 + local839 * local839;
						if (local182 > local900 || local182 == local900 && local803 > Static121.anIntArrayArray31[local808][local815]) {
							local182 = local900;
							local11 = local808;
							local51 = local815;
							local803 = Static121.anIntArrayArray31[local808][local815];
						}
					}
				}
			}
			if (local182 == 1000) {
				return false;
			}
			if (arg3 == local11 && local51 == arg10) {
				return false;
			}
			Static44.anInt1061 = 1;
		}
		@Pc(973) byte local973 = 0;
		Static169.anIntArray397[0] = local11;
		local53 = local973 + 1;
		Static94.anIntArray233[0] = local51;
		local182 = local803 = Static47.anIntArrayArray15[local11][local51];
		while (arg3 != local11 || arg10 != local51) {
			if (local803 != local182) {
				Static169.anIntArray397[local53] = local11;
				Static94.anIntArray233[local53++] = local51;
				local803 = local182;
			}
			if ((local182 & 0x2) != 0) {
				local11++;
			} else if ((local182 & 0x8) != 0) {
				local11--;
			}
			if ((local182 & 0x1) != 0) {
				local51++;
			} else if ((local182 & 0x4) != 0) {
				local51--;
			}
			local182 = Static47.anIntArrayArray15[local11][local51];
		}
		if (local53 > 0) {
			local74 = local53;
			if (local53 > 25) {
				local74 = 25;
			}
			local53--;
			local815 = Static94.anIntArray233[local53];
			local808 = Static169.anIntArray397[local53];
			if (arg8 == 0) {
				Static141.aClass2_Sub11_Sub1_3.method1495(202);
				Static141.aClass2_Sub11_Sub1_3.method1439(local74 + local74 + 3);
			}
			if (arg8 == 1) {
				Static141.aClass2_Sub11_Sub1_3.method1495(169);
				Static141.aClass2_Sub11_Sub1_3.method1439(local74 + local74 + 3 + 14);
			}
			if (arg8 == 2) {
				Static141.aClass2_Sub11_Sub1_3.method1495(28);
				Static141.aClass2_Sub11_Sub1_3.method1439(local74 + local74 + 3);
			}
			Static141.aClass2_Sub11_Sub1_3.method1480(local815 + Static85.anInt1937);
			Static141.aClass2_Sub11_Sub1_3.method1457(local808 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1439(Static99.aBooleanArray9[82] ? 1 : 0);
			Static40.anInt979 = Static94.anIntArray233[0];
			Static109.anInt2502 = Static169.anIntArray397[0];
			for (local839 = 1; local839 < local74; local839++) {
				local53--;
				Static141.aClass2_Sub11_Sub1_3.method1439(Static169.anIntArray397[local53] - local808);
				Static141.aClass2_Sub11_Sub1_3.method1442(Static94.anIntArray233[local53] - local815);
			}
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
