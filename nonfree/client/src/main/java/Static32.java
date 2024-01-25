import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_32 = new Class198(64);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZLclient!tj;I)V")
	public static void method558(@OriginalArg(1) int arg0, @OriginalArg(4) Class193 arg1, @OriginalArg(5) int arg2) {
		Static254.anInt2745 = 10000;
		Static51.aBoolean100 = false;
		Static235.anInt4754 = arg0;
		Static16.anInt334 = arg2;
		Static317.aClass193_100 = arg1;
		Static23.anInt458 = 0;
		Static261.anInt5280 = 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vq;IILclient!br;I)V")
	public static void method559(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class21 arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class118 local15 = arg2.method545(arg0);
		if (local15 == null) {
			return;
		}
		arg0.method2709(arg3, arg1, arg2.anInt740 + arg3, arg1 + arg2.anInt758);
		if (Static249.anInt5064 == 2 || Static249.anInt5064 == 5 || Static88.aClass58_12 == null) {
			arg0.method2720(local15, arg3, arg1);
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(53) int local53;
		if (Static353.anInt2640 == 4) {
			local53 = 4096;
			local64 = (int) -Static106.aFloat31 & 0x3FFF;
			local56 = Static207.anInt4327;
			local46 = Static64.anInt1662;
		} else {
			local46 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701;
			local53 = 4096 - Static255.anInt5169 * 16;
			local56 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702;
			local64 = (int) -Static106.aFloat31 + Static75.anInt1928 & 0x3FFF;
		}
		@Pc(91) int local91 = local46 / 32 + 48 + 208 - Static350.anInt6637 * 2;
		@Pc(109) int local109 = Static105.anInt2647 * 4 + 48 - local56 / 32 - (Static105.anInt2647 - 104) * 2;
		Static88.aClass58_12.method4268((float) arg3 + (float) arg2.anInt740 / 2.0F, (float) arg2.anInt758 / 2.0F + (float) arg1, (float) local91, (float) local109, local53, local64 << 2, local15, arg3, arg1);
		@Pc(160) int local160;
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(190) int local190;
		for (@Pc(143) Class4_Sub8 local143 = (Class4_Sub8) Static92.aClass116_2.method3270(); local143 != null; local143 = (Class4_Sub8) Static92.aClass116_2.method3272()) {
			@Pc(148) int local148 = local143.anInt492;
			local160 = (Static24.aClass137_1.anIntArray367[local148] >> 14 & 0x3FFF) - Static286.anInt6699;
			local169 = (Static24.aClass137_1.anIntArray367[local148] & 0x3FFF) - Static136.anInt3193;
			local179 = local160 * 4 + 2 - local46 / 32;
			local190 = local169 * 4 + 2 - local56 / 32;
			Static174.method3348(arg3, local15, arg0, local179, arg1, Static24.aClass137_1.anIntArray368[local148], local190, arg2);
		}
		for (local160 = 0; local160 < Static31.anInt798; local160++) {
			local169 = Static221.anIntArray243[local160] * 4 + 2 - local46 / 32;
			local179 = Static186.anIntArray329[local160] * 4 + 2 - local56 / 32;
			@Pc(246) Class18 local246 = Static113.method2380(Static152.anIntArray284[local160]);
			if (local246.anIntArray23 != null) {
				local246 = local246.method416();
				if (local246 == null || local246.anInt523 == -1) {
					continue;
				}
			}
			Static174.method3348(arg3, local15, arg0, local169, arg1, local246.anInt523, local179, arg2);
		}
		for (@Pc(286) Class4_Sub19 local286 = (Class4_Sub19) Static165.aClass43_20.method1283(); local286 != null; local286 = (Class4_Sub19) Static165.aClass43_20.method1278()) {
			local179 = (int) (local286.aLong223 >> 28 & 0x3L);
			if (Static252.anInt5147 == local179) {
				local190 = (int) (local286.aLong223 & 0x3FFFL) * 4 + 2 - local46 / 32;
				@Pc(335) int local335 = (int) (local286.aLong223 >> 14 & 0x3FFFL) * 4 + 2 - local56 / 32;
				Static221.method2479(local190, arg1, arg3, local15, arg2, Static36.aClass58Array21[0], local335);
			}
		}
		@Pc(399) int local399;
		@Pc(409) int local409;
		for (local179 = 0; local179 < Static145.anInt3273; local179++) {
			@Pc(363) Class8_Sub1_Sub2_Sub2 local363 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local179]];
			if (local363 != null && local363.method4357()) {
				@Pc(372) Class141 local372 = local363.aClass141_1;
				if (local372 != null && local372.anIntArray380 != null) {
					local372 = local372.method3908();
				}
				if (local372 != null && local372.aBoolean341 && local372.aBoolean340) {
					local399 = local363.anInt6701 / 32 - local46 / 32;
					local409 = local363.anInt6702 / 32 - local56 / 32;
					if (local372.anInt4384 == -1) {
						Static221.method2479(local399, arg1, arg3, local15, arg2, Static36.aClass58Array21[1], local409);
					} else {
						Static174.method3348(arg3, local15, arg0, local399, arg1, local372.anInt4384, local409, arg2);
					}
				}
			}
		}
		@Pc(481) int local481;
		for (local190 = 0; local190 < Static289.anInt5643; local190++) {
			@Pc(452) Class8_Sub1_Sub2_Sub1 local452 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local190]];
			if (local452 != null && local452.method2087()) {
				local399 = local452.anInt6701 / 32 - local46 / 32;
				local409 = local452.anInt6702 / 32 - local56 / 32;
				@Pc(479) boolean local479 = false;
				for (local481 = 0; local481 < Static202.anInt4162; local481++) {
					if (local452.aString24.equals(Static73.aStringArray21[local481]) && Static256.anIntArray425[local481] != 0) {
						local479 = true;
						break;
					}
				}
				@Pc(508) boolean local508 = false;
				for (@Pc(510) int local510 = 0; local510 < Static351.anInt6666; local510++) {
					if (local452.aString24.equals(Static66.aClass56Array1[local510].aString16)) {
						local508 = true;
						break;
					}
				}
				@Pc(534) boolean local534 = false;
				if (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2361 != 0 && local452.anInt2361 != 0 && Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2361 == local452.anInt2361) {
					local534 = true;
				}
				if (local479) {
					Static221.method2479(local399, arg1, arg3, local15, arg2, Static36.aClass58Array21[3], local409);
				} else if (local508) {
					Static221.method2479(local399, arg1, arg3, local15, arg2, Static36.aClass58Array21[5], local409);
				} else if (local534) {
					Static221.method2479(local399, arg1, arg3, local15, arg2, Static36.aClass58Array21[4], local409);
				} else {
					Static221.method2479(local399, arg1, arg3, local15, arg2, Static36.aClass58Array21[2], local409);
				}
			}
		}
		@Pc(619) Class187[] local619 = Static116.aClass187Array1;
		@Pc(714) int local714;
		for (local399 = 0; local399 < local619.length; local399++) {
			@Pc(627) Class187 local627 = local619[local399];
			if (local627 != null && local627.anInt5730 != 0 && Static199.anInt4137 % 20 < 10) {
				@Pc(685) int local685;
				if (local627.anInt5730 == 1 && local627.anInt5734 >= 0 && Static169.aClass8_Sub1_Sub2_Sub2Array1.length > local627.anInt5734) {
					@Pc(663) Class8_Sub1_Sub2_Sub2 local663 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local627.anInt5734];
					if (local663 != null) {
						local481 = local663.anInt6701 / 32 - local46 / 32;
						local685 = local663.anInt6702 / 32 - local56 / 32;
						Static212.method2562(local627.anInt5733, local685, arg2, arg1, local481, 360000, local15, arg3);
					}
				}
				if (local627.anInt5730 == 2) {
					local714 = (local627.anInt5735 - Static286.anInt6699) * 4 + 2 - local46 / 32;
					local481 = (local627.anInt5739 - Static136.anInt3193) * 4 + 2 - local56 / 32;
					local685 = local627.anInt5737 * 4;
					local685 *= local685;
					Static212.method2562(local627.anInt5733, local481, arg2, arg1, local714, local685, local15, arg3);
				}
				if (local627.anInt5730 == 10 && local627.anInt5734 >= 0 && Static327.aClass8_Sub1_Sub2_Sub1Array1.length > local627.anInt5734) {
					@Pc(770) Class8_Sub1_Sub2_Sub1 local770 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local627.anInt5734];
					if (local770 != null) {
						local481 = local770.anInt6701 / 32 - local46 / 32;
						local685 = local770.anInt6702 / 32 - local56 / 32;
						Static212.method2562(local627.anInt5733, local685, arg2, arg1, local481, 360000, local15, arg3);
					}
				}
			}
		}
		if (Static353.anInt2640 == 4) {
			return;
		}
		if (Static18.anInt369 != 0) {
			local409 = Static18.anInt369 * 4 + (Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() + -1) * 2 + 2 - local46 / 32;
			local714 = Static39.anInt1027 * 4 + Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() * 2 + 2 - local56 / 32 - 2;
			Static221.method2479(local409, arg1, arg3, local15, arg2, Static312.aClass58Array122[Static10.aBoolean21 ? 1 : 0], local714);
		}
		arg0.method2687(arg3 + arg2.anInt740 / 2 - 1, -1, 3, arg2.anInt758 / 2 + arg1 - 1, 3);
		return;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method560(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = Static93.method2208(arg0.charAt(local17)) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Lclient!hk;")
	public static Class4_Sub4_Sub5 method562(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub4_Sub5 local15 = (Class4_Sub4_Sub5) Static124.aClass124_4.method3525((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static121.aClass193_85.method5047(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static235.method4178(local25);
			Static124.aClass124_4.method3528(local15, (long) arg0);
			return local15;
		}
	}
}
