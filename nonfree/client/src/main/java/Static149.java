import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!og", name = "V", descriptor = "Z")
	public static boolean aBoolean70;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "I")
	public static int anInt1846;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Lclient!qe;")
	public static Class78 aClass78_421 = Static199.method3560(" loggt sich aus)3");

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
	public static int anInt1859 = 7759444;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIBII)V")
	public static void method1480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg2; local7++) {
			for (@Pc(11) int local11 = arg4; local11 <= arg3 + arg4; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static220.aByteArrayArrayArray15[arg0][local11][local7] = 127;
				}
			}
		}
		@Pc(73) int local73;
		for (@Pc(69) int local69 = arg1; local69 < arg1 + arg2; local69++) {
			for (local73 = arg4; local73 < arg3 + arg4; local73++) {
				if (local73 >= 0 && local73 < 104 && local69 >= 0 && local69 < 104) {
					Static144.anIntArrayArrayArray7[arg0][local73][local69] = arg0 > 0 ? Static144.anIntArrayArrayArray7[arg0 - 1][local73][local69] : 0;
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local73 = arg1 + 1; local73 < arg1 + arg2; local73++) {
				if (local73 >= 0 && local73 < 104) {
					Static144.anIntArrayArrayArray7[arg0][arg4][local73] = Static144.anIntArrayArrayArray7[arg0][arg4 - 1][local73];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local73 = arg4 + 1; local73 < arg3 + arg4; local73++) {
				if (local73 >= 0 && local73 < 104) {
					Static144.anIntArrayArrayArray7[arg0][local73][arg1] = Static144.anIntArrayArrayArray7[arg0][local73][arg1 - 1];
				}
			}
		}
		if (arg4 < 0 || arg1 < 0 || arg4 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 > 0 && Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1] != 0) {
				Static144.anIntArrayArrayArray7[arg0][arg4][arg1] = Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1];
				return;
			}
			if (arg1 > 0 && Static144.anIntArrayArrayArray7[arg0][arg4][arg1 - 1] != 0) {
				Static144.anIntArrayArrayArray7[arg0][arg4][arg1] = Static144.anIntArrayArrayArray7[arg0][arg4][arg1 - 1];
				return;
			}
			if (arg4 > 0 && arg1 > 0 && Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1 - 1] != 0) {
				Static144.anIntArrayArrayArray7[arg0][arg4][arg1] = Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1] != Static144.anIntArrayArrayArray7[arg0 - 1][arg4 - 1][arg1]) {
			Static144.anIntArrayArrayArray7[arg0][arg4][arg1] = Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1];
			return;
		}
		if (arg1 > 0 && Static144.anIntArrayArrayArray7[arg0 - 1][arg4][arg1 - 1] != Static144.anIntArrayArrayArray7[arg0][arg4][arg1 - 1]) {
			Static144.anIntArrayArrayArray7[arg0][arg4][arg1] = Static144.anIntArrayArrayArray7[arg0][arg4][arg1 - 1];
			return;
		}
		if (arg4 > 0 && arg1 > 0 && Static144.anIntArrayArrayArray7[arg0 - 1][arg4 - 1][arg1 - 1] != Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1 - 1]) {
			Static144.anIntArrayArrayArray7[arg0][arg4][arg1] = Static144.anIntArrayArrayArray7[arg0][arg4 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIIIIIIILclient!c;IILclient!qc;I)Lclient!qc;")
	public static Class5_Sub3 method1481(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub3_Sub3 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class5_Sub3 arg11, @OriginalArg(13) int arg12) {
		@Pc(25) long local25 = ((long) arg12 << 48) + (long) (arg1 + (arg6 << 16) + (arg9 << 24)) + ((long) arg3 << 32);
		@Pc(37) Class5_Sub3 local37 = (Class5_Sub3) Static70.aClass53_11.method1793(local25);
		@Pc(121) int local121;
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(129) int local129;
		@Pc(153) int local153;
		if (local37 == null) {
			@Pc(44) byte local44;
			if (arg1 == 1) {
				local44 = 9;
			} else if (arg1 == 2) {
				local44 = 12;
			} else if (arg1 == 3) {
				local44 = 15;
			} else if (arg1 == 4) {
				local44 = 18;
			} else {
				local44 = 21;
			}
			@Pc(90) int[] local90 = new int[] { 64, 96, 128 };
			@Pc(111) Class5_Sub7 local111 = new Class5_Sub7(local44 * 3 + 1, -local44 + local44 * 6, 0);
			@Pc(115) int[][] local115 = new int[3][local44];
			local121 = local111.method3786(0, 0);
			@Pc(135) int local135;
			@Pc(163) int local163;
			for (local123 = 0; local123 < 3; local123++) {
				local129 = local90[local123];
				local133 = local90[local123];
				for (local135 = 0; local135 < local44; local135++) {
					@Pc(143) int local143 = (local135 << 11) / local44;
					local153 = Class77.anIntArray631[local143] * local133 + arg4 >> 16;
					local163 = local129 * Class77.anIntArray632[local143] + arg2 >> 16;
					local115[local123][local135] = local111.method3786(local153, local163);
				}
			}
			for (local133 = 0; local133 < 3; local133++) {
				local129 = (local133 * 256 + 128) / 3;
				local135 = 256 - local129;
				@Pc(213) byte local213 = (byte) (arg9 * local129 + local135 * arg6 >> 8);
				@Pc(258) short local258 = (short) (((arg3 & 0x7F) * local135 + local129 * (arg12 & 0x7F) & 0x7F00) + ((arg12 & 0xFC00) * local129 + local135 * (arg3 & 0xFC00) & 0xFC0000) + ((arg3 & 0x380) * local135 + local129 * (arg12 & 0x380) & 0x38000) >> 8);
				for (local163 = 0; local163 < local44; local163++) {
					if (local133 == 0) {
						local111.method3785(local121, local115[0][(local163 + 1) % local44], local115[0][local163], local258, local213);
					} else {
						local111.method3785(local115[local133 - 1][local163], local115[local133 - 1][(local163 + 1) % local44], local115[local133][(local163 + 1) % local44], local258, local213);
						local111.method3785(local115[local133 - 1][local163], local115[local133][(local163 + 1) % local44], local115[local133][local163], local258, local213);
					}
				}
			}
			local37 = local111.method3795(64, 768, -50, -10, -50);
			Static70.aClass53_11.method1794(local37, local25);
		}
		@Pc(381) int local381 = arg1 * 64 - 1;
		@Pc(384) int local384 = -local381;
		@Pc(387) int local387 = -local381;
		local121 = local381;
		@Pc(392) int local392 = arg11.method1431();
		local123 = arg11.method1416();
		@Pc(397) int local397 = local381;
		if (arg0) {
			if (arg5 > 640 && arg5 < 1408) {
				local121 = local381 + 128;
			}
			if (arg5 > 128 && arg5 < 896) {
				local384 -= 128;
			}
			if (arg5 > 1664 || arg5 < 384) {
				local387 -= 128;
			}
			if (arg5 > 1152 && arg5 < 1920) {
				local397 = local381 + 128;
			}
		}
		@Pc(437) Class2_Sub3_Sub22 local437 = null;
		if (local397 < local123) {
			local123 = local397;
		}
		local133 = arg11.method1426();
		local129 = arg11.method1422();
		if (local129 > local121) {
			local129 = local121;
		}
		if (arg8 != null) {
			@Pc(460) int local460 = arg8.anIntArray76[arg10];
			local437 = Static34.method424(local460 >> 16);
			arg10 = local460 & 0xFFFF;
		}
		if (local133 < local387) {
			local133 = local387;
		}
		if (local384 > local392) {
			local392 = local384;
		}
		if (local437 == null) {
			local37 = local37.method1417(true, true);
			local37.method1412((local123 - local392) / 2, 128, (local129 - local133) / 2);
			local37.method1432((local123 + local392) / 2, 0, (local133 + local129) / 2);
		} else {
			local37 = local37.method1417(!local437.method2707(arg10), true);
			local37.method1412((local123 - local392) / 2, 128, (local129 - local133) / 2);
			local37.method1432((local123 + local392) / 2, 0, (local133 + local129) / 2);
			local37.method1420(local437, arg10);
		}
		if (arg5 != 0) {
			local37.method1414(arg5);
		}
		@Pc(572) Class5_Sub3_Sub1 local572 = (Class5_Sub3_Sub1) local37;
		if (Static208.method3667(local392 + arg4, Static137.anInt3136, local133 + arg2) != arg7 || arg7 != Static208.method3667(local123 + arg4, Static137.anInt3136, arg2 + local129)) {
			for (local153 = 0; local153 < local572.anInt1782; local153++) {
				local572.anIntArray305[local153] += Static208.method3667(arg4 + local572.anIntArray309[local153], Static137.anInt3136, arg2 + local572.anIntArray308[local153]) - arg7;
			}
			local572.aBoolean66 = false;
		}
		return local37;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public static void method1485() {
		Static10.method219();
		Static74.method1230();
		Static59.method768();
		Static27.method362();
		Static171.method3142();
		Static203.method3591();
		Static51.method671();
		Static95.method1666();
		Static92.method1616();
		Static35.method428();
		Static2.method27();
		Static209.method3063();
		Static94.method1646();
		Static107.method1851();
		((Class35) Static163.anInterface4_1).method770();
		Static171.aClass110_18.method3889();
		Static50.aClass72_Sub1_6.method3172();
		Static166.aClass72_Sub1_12.method3172();
		Static169.aClass72_Sub1_28.method3172();
		Static124.aClass72_Sub1_24.method3172();
		Static95.aClass72_Sub1_18.method3172();
		Static90.aClass72_Sub1_17.method3172();
		Static110.aClass72_Sub1_23.method3172();
		Static215.aClass72_Sub1_33.method3172();
		Static122.aClass72_Sub1_16.method3172();
		Static223.aClass72_Sub1_34.method3172();
		Static97.aClass72_Sub1_19.method3172();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZII)V")
	public static void method1486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == Static90.anInt2014 && arg4 == Static225.anInt4878 && (arg3 == Static150.anInt3435 || Static48.method633())) {
			return;
		}
		Static225.anInt4878 = arg4;
		Static150.anInt3435 = arg3;
		Static90.anInt2014 = arg1;
		if (Static48.method633()) {
			Static150.anInt3435 = 0;
		}
		Static125.method1281(25);
		Static90.method1592(Static62.aClass78_300, true);
		@Pc(49) int local49 = Static28.anInt497;
		@Pc(51) int local51 = Static57.anInt628;
		Static28.anInt497 = (arg1 - 6) * 8;
		Static57.anInt628 = (arg4 - 6) * 8;
		@Pc(67) int local67 = Static57.anInt628 - local51;
		@Pc(74) int local74 = Static28.anInt497 - local49;
		@Pc(80) int local80;
		@Pc(90) int local90;
		for (local80 = 0; local80 < 32768; local80++) {
			@Pc(86) Class5_Sub2_Sub1 local86 = Static95.aClass5_Sub2_Sub1Array1[local80];
			if (local86 != null) {
				for (local90 = 0; local90 < 10; local90++) {
					local86.anIntArray333[local90] -= local74;
					local86.anIntArray334[local90] -= local67;
				}
				local86.anInt1849 -= local74 * 128;
				local86.anInt1827 -= local67 * 128;
			}
		}
		for (local80 = 0; local80 < 2048; local80++) {
			@Pc(243) Class5_Sub2_Sub2 local243 = Static213.aClass5_Sub2_Sub2Array3[local80];
			if (local243 != null) {
				for (local90 = 0; local90 < 10; local90++) {
					local243.anIntArray333[local90] -= local74;
					local243.anIntArray334[local90] -= local67;
				}
				local243.anInt1849 -= local74 * 128;
				local243.anInt1827 -= local67 * 128;
			}
		}
		@Pc(295) byte local295 = 0;
		Static137.anInt3136 = arg3;
		Static31.aClass5_Sub2_Sub2_1.method1483(arg0, arg2, false);
		@Pc(305) byte local305 = 104;
		@Pc(307) byte local307 = 1;
		@Pc(309) byte local309 = 104;
		if (local74 < 0) {
			local295 = 103;
			local307 = -1;
			local309 = -1;
		}
		@Pc(319) byte local319 = 1;
		@Pc(321) byte local321 = 0;
		if (local67 < 0) {
			local321 = 103;
			local305 = -1;
			local319 = -1;
		}
		for (@Pc(331) int local331 = local295; local331 != local309; local331 += local307) {
			for (@Pc(335) int local335 = local321; local335 != local305; local335 += local319) {
				@Pc(342) int local342 = local331 + local74;
				@Pc(346) int local346 = local67 + local335;
				for (@Pc(348) int local348 = 0; local348 < 4; local348++) {
					if (local342 >= 0 && local346 >= 0 && local342 < 104 && local346 < 104) {
						Static1.aClass44ArrayArrayArray1[local348][local331][local335] = Static1.aClass44ArrayArrayArray1[local348][local342][local346];
					} else {
						Static1.aClass44ArrayArrayArray1[local348][local331][local335] = null;
					}
				}
			}
		}
		for (@Pc(415) Class2_Sub25 local415 = (Class2_Sub25) Static165.aClass44_44.method1359(); local415 != null; local415 = (Class2_Sub25) Static165.aClass44_44.method1356()) {
			local415.anInt3270 -= local67;
			local415.anInt3279 -= local74;
			if (local415.anInt3279 < 0 || local415.anInt3270 < 0 || local415.anInt3279 >= 104 || local415.anInt3270 >= 104) {
				local415.method3986();
			}
		}
		if (Static8.anInt268 != 0) {
			Static66.anInt1316 -= local67;
			Static8.anInt268 -= local74;
		}
		Static66.anInt1313 = -1;
		Static145.anInt3290 = 1;
		Static143.anInt3258 = 0;
		Static95.aClass44_21.method1362();
		Static225.aClass44_62.method1362();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
	public static void method1490() {
		for (@Pc(10) Class2_Sub25 local10 = (Class2_Sub25) Static165.aClass44_44.method1359(); local10 != null; local10 = (Class2_Sub25) Static165.aClass44_44.method1356()) {
			if (local10.anInt3271 == -1) {
				local10.anInt3276 = 0;
				Static142.method2535(local10);
			} else {
				local10.method3986();
			}
		}
	}
}
