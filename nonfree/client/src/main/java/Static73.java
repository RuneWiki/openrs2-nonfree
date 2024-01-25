import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
	public static int anInt1814;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ca;I)V")
	public static void method1452(@OriginalArg(0) Class36_Sub1 arg0) {
		arg0.aClass22_1 = null;
		@Pc(10) int local10 = arg0.aClass36_Sub6Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass36_Sub6Array1[local12].aBoolean317 = false;
		}
		@Pc(30) Class191[] local30 = Class125.aClass191Array1;
		synchronized (Class125.aClass191Array1) {
			if (local10 < Class125.aClass191Array1.length && Static325.anIntArray783[local10] < 200) {
				Class125.aClass191Array1[local10].method4872(arg0);
				@Pc(55) int local55 = Static325.anIntArray783[local10]++;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)V")
	public static void method1453() {
		@Pc(8) int local8 = Static175.aClass208_3.method5385(Static254.aString312);
		@Pc(18) int local18;
		for (@Pc(13) Class7_Sub32 local13 = (Class7_Sub32) Static76.aClass74_8.method1793(); local13 != null; local13 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			local18 = Static44.method984(local13);
			if (local18 > local8) {
				local8 = local18;
			}
		}
		local8 += 8;
		local18 = Static33.anInt735 * 16 + 21;
		@Pc(44) int local44 = Static240.anInt6396 - local8 / 2;
		if (local44 + local8 > Static128.anInt2823) {
			local44 = Static128.anInt2823 - local8;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(73) int local73 = Static100.anInt2436;
		if (Static214.anInt4266 < local73 + local18) {
			local73 = Static214.anInt4266 - local18;
		}
		if (local73 < 0) {
			local73 = 0;
		}
		Static279.anInt6648 = local44;
		Static343.anInt6507 = (Static274.aBoolean403 ? 26 : 22) + Static33.anInt735 * 16;
		Static263.anInt5172 = local73;
		Static169.aBoolean260 = true;
		Static220.anInt4389 = local8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method1454(@OriginalArg(1) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(16) byte[] local16 = new byte[arg0 * arg0];
		@Pc(18) int local18 = 0;
		@Pc(23) int local23;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			for (local23 = 0; local23 < arg0; local23++) {
				if (local23 <= local20) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(68) int local68;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local68 = 0; local68 < arg0; local68++) {
				if (local23 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(106) int local106;
		for (local68 = 0; local68 < arg0; local68++) {
			for (local106 = 0; local106 < arg0; local106++) {
				if (local106 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(151) int local151;
		for (local106 = arg0 - 1; local106 >= 0; local106--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local106 <= local151) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(190) int local190;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local190 = 0; local190 < arg0; local190++) {
				if (local151 >> 1 >= local190) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(230) int local230;
		for (local190 = 0; local190 < arg0; local190++) {
			for (local230 = 0; local230 < arg0; local230++) {
				if (local18 >= 0 && local18 < local16.length) {
					if (local230 >= local190 << 1) {
						local16[local18] = -1;
					}
					local18++;
				} else {
					local18++;
				}
			}
		}
		local7[1][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(289) int local289;
		for (local230 = 0; local230 < arg0; local230++) {
			for (local289 = arg0 - 1; local289 >= 0; local289--) {
				if (local230 >> 1 >= local289) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(336) int local336;
		for (local289 = arg0 - 1; local289 >= 0; local289--) {
			for (local336 = arg0 - 1; local336 >= 0; local336--) {
				if (local289 << 1 <= local336) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(382) int local382;
		for (local336 = arg0 - 1; local336 >= 0; local336--) {
			for (local382 = arg0 - 1; local382 >= 0; local382--) {
				if (local336 >> 1 >= local382) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(429) int local429;
		for (local382 = arg0 - 1; local382 >= 0; local382--) {
			for (local429 = 0; local429 < arg0; local429++) {
				if (local382 << 1 <= local429) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(476) int local476;
		for (local429 = 0; local429 < arg0; local429++) {
			for (local476 = 0; local476 < arg0; local476++) {
				if (local476 <= local429 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(532) int local532;
		for (local476 = 0; local476 < arg0; local476++) {
			for (local532 = arg0 - 1; local532 >= 0; local532--) {
				if (local532 >= local476 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(573) int local573;
		for (local532 = arg0 - 1; local532 >= 0; local532--) {
			for (local573 = 0; local573 < arg0; local573++) {
				if (local573 >= local532 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(612) int local612;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local612 = 0; local612 < arg0; local612++) {
				if (local573 << 1 >= local612) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(659) int local659;
		for (local612 = 0; local612 < arg0; local612++) {
			for (local659 = arg0 - 1; local659 >= 0; local659--) {
				if (local612 >> 1 <= local659) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(706) int local706;
		for (local659 = arg0 - 1; local659 >= 0; local659--) {
			for (local706 = arg0 - 1; local706 >= 0; local706--) {
				if (local706 <= local659 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(752) int local752;
		for (local706 = arg0 - 1; local706 >= 0; local706--) {
			for (local752 = arg0 - 1; local752 >= 0; local752--) {
				if (local706 >> 1 <= local752) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(799) int local799;
		for (local752 = arg0 - 1; local752 >= 0; local752--) {
			for (local799 = 0; local799 < arg0; local799++) {
				if (local799 <= local752 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(842) int local842;
		for (local799 = 0; local799 < arg0; local799++) {
			for (local842 = 0; local842 < arg0; local842++) {
				if (local799 >> 1 <= local842) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(885) int local885;
		for (local842 = 0; local842 < arg0; local842++) {
			for (local885 = arg0 - 1; local885 >= 0; local885--) {
				if (local842 << 1 >= local885) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(929) int local929;
		for (local885 = 0; local885 < arg0; local885++) {
			for (local929 = 0; local929 < arg0; local929++) {
				if (arg0 / 2 >= local929) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(974) int local974;
		for (local929 = 0; local929 < arg0; local929++) {
			for (local974 = 0; local974 < arg0; local974++) {
				if (arg0 / 2 >= local929) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1015) int local1015;
		for (local974 = 0; local974 < arg0; local974++) {
			for (local1015 = 0; local1015 < arg0; local1015++) {
				if (local1015 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1060) int local1060;
		for (local1015 = 0; local1015 < arg0; local1015++) {
			for (local1060 = 0; local1060 < arg0; local1060++) {
				if (local1015 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1101) int local1101;
		for (local1060 = 0; local1060 < arg0; local1060++) {
			for (local1101 = 0; local1101 < arg0; local1101++) {
				if (local1060 - arg0 / 2 >= local1101) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1143) int local1143;
		for (local1101 = arg0 - 1; local1101 >= 0; local1101--) {
			for (local1143 = 0; local1143 < arg0; local1143++) {
				if (local1101 - arg0 / 2 >= local1143) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1190) int local1190;
		for (local1143 = arg0 - 1; local1143 >= 0; local1143--) {
			for (local1190 = arg0 - 1; local1190 >= 0; local1190--) {
				if (local1143 - arg0 / 2 >= local1190) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1240) int local1240;
		for (local1190 = 0; local1190 < arg0; local1190++) {
			for (local1240 = arg0 - 1; local1240 >= 0; local1240--) {
				if (local1190 - arg0 / 2 >= local1240) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1283) int local1283;
		for (local1240 = 0; local1240 < arg0; local1240++) {
			for (local1283 = 0; local1283 < arg0; local1283++) {
				if (local1240 - arg0 / 2 <= local1283) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1336) int local1336;
		for (local1283 = arg0 - 1; local1283 >= 0; local1283--) {
			for (local1336 = 0; local1336 < arg0; local1336++) {
				if (local1336 >= local1283 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1386) int local1386;
		for (local1336 = arg0 - 1; local1336 >= 0; local1336--) {
			for (local1386 = arg0 - 1; local1386 >= 0; local1386--) {
				if (local1386 >= local1336 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		for (local1386 = 0; local1386 < arg0; local1386++) {
			for (@Pc(1435) int local1435 = arg0 - 1; local1435 >= 0; local1435--) {
				if (local1386 - arg0 / 2 <= local1435) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(Z)V")
	public static void method1455() {
		for (@Pc(7) int local7 = -1; local7 < Static223.anInt4466; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static314.anIntArray758[local7];
			}
			@Pc(24) Class22_Sub2_Sub1_Sub1 local24 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local14];
			if (local24 != null) {
				Static205.method3650(local24.method4421(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V")
	public static void method1456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static61.anInt1534 && arg0 <= Static168.anInt3509 && Static142.anInt3103 <= arg3 && arg1 <= Static314.anInt6030) {
			if (arg2 == 1) {
				Static61.method1217(arg5, arg0, arg4, arg1, arg3);
			} else {
				Static142.method2877(arg2, arg3, arg1, arg5, arg4, arg0);
			}
		} else if (arg2 == 1) {
			Static229.method4020(arg0, arg3, arg5, arg4, arg1);
		} else {
			Static330.method5268(arg3, arg4, arg1, arg0, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)Z")
	public static boolean method1457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static169.aBoolean260) {
			return false;
		}
		@Pc(11) int local11 = arg0 >> 16;
		@Pc(15) int local15 = arg0 & 0xFFFF;
		if (Static298.aClass26ArrayArray1[local11] == null || Static298.aClass26ArrayArray1[local11][local15] == null) {
			return false;
		}
		@Pc(38) Class26 local38 = Static298.aClass26ArrayArray1[local11][local15];
		@Pc(52) Class7_Sub32 local52;
		if (arg1 == -1 && local38.anInt520 == 0) {
			for (local52 = (Class7_Sub32) Static76.aClass74_8.method1793(); local52 != null; local52 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
				if (local52.anInt5229 == 50 || local52.anInt5229 == 1011 || local52.anInt5229 == 42 || local52.anInt5229 == 15 || local52.anInt5229 == 60) {
					for (@Pc(141) Class26 local141 = Static245.method4231(local52.anInt5225); local141 != null; local141 = Static249.method1113(local141)) {
						if (local38.anInt492 == local141.anInt492) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class7_Sub32) Static76.aClass74_8.method1793(); local52 != null; local52 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
				if (arg1 == local52.anInt5226 && local52.anInt5225 == local38.anInt492 && (local52.anInt5229 == 50 || local52.anInt5229 == 1011 || local52.anInt5229 == 42 || local52.anInt5229 == 15 || local52.anInt5229 == 60)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIIII)V")
	public static void method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static164.method3145(arg4);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg4 - arg2;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(23) int local23 = arg4;
		@Pc(31) int local31 = -arg4;
		@Pc(33) int local33 = local17;
		@Pc(36) int local36 = -local17;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (Static142.anInt3103 <= arg1 && arg1 <= Static314.anInt6030) {
			@Pc(54) int[] local54 = Static323.anIntArrayArray55[arg1];
			local62 = Static270.method4496(Static168.anInt3509, arg5 - arg4, Static61.anInt1534);
			local70 = Static270.method4496(Static168.anInt3509, arg5 + arg4, Static61.anInt1534);
			local79 = Static270.method4496(Static168.anInt3509, arg5 - local17, Static61.anInt1534);
			local88 = Static270.method4496(Static168.anInt3509, arg5 + local17, Static61.anInt1534);
			Static282.method4681(arg0, local62, local54, local79);
			Static282.method4681(arg3, local79, local54, local88);
			Static282.method4681(arg0, local88, local54, local70);
		}
		while (local12 < local23) {
			local38 += 2;
			local40 += 2;
			local36 += local40;
			local31 += local38;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				local36 -= local33 << 1;
				Static337.anIntArray814[local33] = local12;
			}
			local12++;
			@Pc(209) int local209;
			@Pc(218) int local218;
			@Pc(229) int[] local229;
			@Pc(159) int local159;
			if (local31 >= 0) {
				local23--;
				local31 -= local23 << 1;
				local159 = arg1 - local23;
				local62 = local23 + arg1;
				if (local62 >= Static142.anInt3103 && local159 <= Static314.anInt6030) {
					if (local23 < local17) {
						local70 = Static337.anIntArray814[local23];
						local79 = Static270.method4496(Static168.anInt3509, local12 + arg5, Static61.anInt1534);
						local88 = Static270.method4496(Static168.anInt3509, arg5 - local12, Static61.anInt1534);
						local209 = Static270.method4496(Static168.anInt3509, arg5 + local70, Static61.anInt1534);
						local218 = Static270.method4496(Static168.anInt3509, arg5 - local70, Static61.anInt1534);
						if (Static314.anInt6030 >= local62) {
							local229 = Static323.anIntArrayArray55[local62];
							Static282.method4681(arg0, local88, local229, local218);
							Static282.method4681(arg3, local218, local229, local209);
							Static282.method4681(arg0, local209, local229, local79);
						}
						if (local159 >= Static142.anInt3103) {
							local229 = Static323.anIntArrayArray55[local159];
							Static282.method4681(arg0, local88, local229, local218);
							Static282.method4681(arg3, local218, local229, local209);
							Static282.method4681(arg0, local209, local229, local79);
						}
					} else {
						local70 = Static270.method4496(Static168.anInt3509, local12 + arg5, Static61.anInt1534);
						local79 = Static270.method4496(Static168.anInt3509, arg5 - local12, Static61.anInt1534);
						if (local62 <= Static314.anInt6030) {
							Static282.method4681(arg0, local79, Static323.anIntArrayArray55[local62], local70);
						}
						if (Static142.anInt3103 <= local159) {
							Static282.method4681(arg0, local79, Static323.anIntArrayArray55[local159], local70);
						}
					}
				}
			}
			local159 = arg1 - local12;
			local62 = local12 + arg1;
			if (local62 >= Static142.anInt3103 && local159 <= Static314.anInt6030) {
				local70 = local23 + arg5;
				local79 = arg5 - local23;
				if (local70 >= Static61.anInt1534 && local79 <= Static168.anInt3509) {
					local70 = Static270.method4496(Static168.anInt3509, local70, Static61.anInt1534);
					local79 = Static270.method4496(Static168.anInt3509, local79, Static61.anInt1534);
					if (local17 > local12) {
						local88 = local33 >= local12 ? local33 : Static337.anIntArray814[local12];
						local209 = Static270.method4496(Static168.anInt3509, local88 + arg5, Static61.anInt1534);
						local218 = Static270.method4496(Static168.anInt3509, arg5 - local88, Static61.anInt1534);
						if (local62 <= Static314.anInt6030) {
							local229 = Static323.anIntArrayArray55[local62];
							Static282.method4681(arg0, local79, local229, local218);
							Static282.method4681(arg3, local218, local229, local209);
							Static282.method4681(arg0, local209, local229, local70);
						}
						if (Static142.anInt3103 <= local159) {
							local229 = Static323.anIntArrayArray55[local159];
							Static282.method4681(arg0, local79, local229, local218);
							Static282.method4681(arg3, local218, local229, local209);
							Static282.method4681(arg0, local209, local229, local70);
						}
					} else {
						if (local62 <= Static314.anInt6030) {
							Static282.method4681(arg0, local79, Static323.anIntArrayArray55[local62], local70);
						}
						if (local159 >= Static142.anInt3103) {
							Static282.method4681(arg0, local79, Static323.anIntArrayArray55[local159], local70);
						}
					}
				}
			}
		}
	}
}
