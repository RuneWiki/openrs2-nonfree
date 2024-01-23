import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!lc;")
	public static Class98 aClass98_173;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Lclient!lc;")
	public static Class98 aClass98_174;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public static int anInt5510 = 0;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "[C")
	public static char[] aCharArray45 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method4371() {
		Static82.aClass33_11.method843();
		Static85.aClass33_12.method843();
		Static90.aClass33_13.method843();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
	public static void method4374(@OriginalArg(1) boolean arg0) {
		if (Static217.aBoolean285 != arg0) {
			Static217.aBoolean285 = arg0;
			Static134.method2175();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V")
	public static void method4376(@OriginalArg(0) boolean arg0) {
		Static54.aBoolean77 = arg0;
		@Pc(67) boolean local67;
		@Pc(19) int local19;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(42) int local42;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(159) int local159;
		@Pc(176) int local176;
		@Pc(193) int local193;
		if (!Static54.aBoolean77) {
			local19 = Static101.aClass4_Sub17_Sub1_4.method1868();
			local27 = (Static131.anInt2781 - Static101.aClass4_Sub17_Sub1_4.anInt2400) / 16;
			Static51.anIntArrayArray15 = new int[local27][4];
			for (local33 = 0; local33 < local27; local33++) {
				for (local42 = 0; local42 < 4; local42++) {
					Static51.anIntArrayArray15[local33][local42] = Static101.aClass4_Sub17_Sub1_4.method1850();
				}
			}
			local67 = Static152.method2433(Static101.aClass4_Sub17_Sub1_4.method1872());
			local33 = Static101.aClass4_Sub17_Sub1_4.method1882();
			local42 = Static101.aClass4_Sub17_Sub1_4.method1851();
			local79 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local83 = Static101.aClass4_Sub17_Sub1_4.method1868();
			Static262.anIntArray442 = new int[local27];
			Static22.anIntArray42 = null;
			Static233.anIntArray422 = new int[local27];
			Static61.anIntArray133 = new int[local27];
			Static90.aByteArrayArray9 = new byte[local27][];
			@Pc(99) boolean local99 = false;
			Static171.aByteArrayArray13 = null;
			Static22.anIntArray43 = new int[local27];
			Static81.aByteArrayArray16 = new byte[local27][];
			Static207.aByteArrayArray17 = new byte[local27][];
			if ((local19 / 8 == 48 || local19 / 8 == 49) && local42 / 8 == 48) {
				local99 = true;
			}
			Static271.anIntArray451 = new int[local27];
			if (local19 / 8 == 48 && local42 / 8 == 148) {
				local99 = true;
			}
			Static249.aByteArrayArray19 = new byte[local27][];
			local27 = 0;
			for (local159 = (local19 - 6) / 8; local159 <= (local19 + 6) / 8; local159++) {
				for (local176 = (local42 - 6) / 8; local176 <= (local42 + 6) / 8; local176++) {
					local193 = (local159 << 8) + local176;
					if (local99 && (local176 == 49 || local176 == 149 || local176 == 147 || local159 == 50 || local159 == 49 && local176 == 47)) {
						Static262.anIntArray442[local27] = local193;
						Static233.anIntArray422[local27] = -1;
						Static22.anIntArray43[local27] = -1;
						Static61.anIntArray133[local27] = -1;
						Static271.anIntArray451[local27] = -1;
					} else {
						Static262.anIntArray442[local27] = local193;
						Static233.anIntArray422[local27] = Static106.aClass98_65.method2376("m" + local159 + "_" + local176);
						Static22.anIntArray43[local27] = Static106.aClass98_65.method2376("l" + local159 + "_" + local176);
						Static61.anIntArray133[local27] = Static106.aClass98_65.method2376("um" + local159 + "_" + local176);
						Static271.anIntArray451[local27] = Static106.aClass98_65.method2376("ul" + local159 + "_" + local176);
					}
					local27++;
				}
			}
			Static121.method2054(local33, local83, local67, local19, local42, local79, false);
			return;
		}
		local19 = Static101.aClass4_Sub17_Sub1_4.method1896();
		local27 = Static101.aClass4_Sub17_Sub1_4.method1882();
		local33 = Static101.aClass4_Sub17_Sub1_4.method1837();
		Static101.aClass4_Sub17_Sub1_4.method1904();
		@Pc(368) int local368;
		for (local42 = 0; local42 < 4; local42++) {
			for (local79 = 0; local79 < 13; local79++) {
				for (local83 = 0; local83 < 13; local83++) {
					local368 = Static101.aClass4_Sub17_Sub1_4.method1898(1);
					if (local368 == 1) {
						Static38.anIntArrayArrayArray3[local42][local79][local83] = Static101.aClass4_Sub17_Sub1_4.method1898(26);
					} else {
						Static38.anIntArrayArrayArray3[local42][local79][local83] = -1;
					}
				}
			}
		}
		Static101.aClass4_Sub17_Sub1_4.method1901();
		local42 = (Static131.anInt2781 - Static101.aClass4_Sub17_Sub1_4.anInt2400) / 16;
		Static51.anIntArrayArray15 = new int[local42][4];
		for (local79 = 0; local79 < local42; local79++) {
			for (local83 = 0; local83 < 4; local83++) {
				Static51.anIntArrayArray15[local79][local83] = Static101.aClass4_Sub17_Sub1_4.method1850();
			}
		}
		local79 = Static101.aClass4_Sub17_Sub1_4.method1837();
		local83 = Static101.aClass4_Sub17_Sub1_4.method1868();
		local67 = Static152.method2433(Static101.aClass4_Sub17_Sub1_4.method1865());
		Static207.aByteArrayArray17 = new byte[local42][];
		Static249.aByteArrayArray19 = new byte[local42][];
		Static90.aByteArrayArray9 = new byte[local42][];
		Static271.anIntArray451 = new int[local42];
		Static22.anIntArray43 = new int[local42];
		Static262.anIntArray442 = new int[local42];
		Static171.aByteArrayArray13 = null;
		Static233.anIntArray422 = new int[local42];
		Static22.anIntArray42 = null;
		Static81.aByteArrayArray16 = new byte[local42][];
		Static61.anIntArray133 = new int[local42];
		local42 = 0;
		for (local368 = 0; local368 < 4; local368++) {
			for (local159 = 0; local159 < 13; local159++) {
				for (local176 = 0; local176 < 13; local176++) {
					local193 = Static38.anIntArrayArrayArray3[local368][local159][local176];
					if (local193 != -1) {
						@Pc(530) int local530 = local193 >> 14 & 0x3FF;
						@Pc(536) int local536 = local193 >> 3 & 0x7FF;
						@Pc(546) int local546 = local536 / 8 + (local530 / 8 << 8);
						@Pc(548) int local548;
						for (local548 = 0; local548 < local42; local548++) {
							if (local546 == Static262.anIntArray442[local548]) {
								local546 = -1;
								break;
							}
						}
						if (local546 != -1) {
							local548 = local546 >> 8 & 0xFF;
							Static262.anIntArray442[local42] = local546;
							@Pc(585) int local585 = local546 & 0xFF;
							Static233.anIntArray422[local42] = Static106.aClass98_65.method2376("m" + local548 + "_" + local585);
							Static22.anIntArray43[local42] = Static106.aClass98_65.method2376("l" + local548 + "_" + local585);
							Static61.anIntArray133[local42] = Static106.aClass98_65.method2376("um" + local548 + "_" + local585);
							Static271.anIntArray451[local42] = Static106.aClass98_65.method2376("ul" + local548 + "_" + local585);
							local42++;
						}
					}
				}
			}
		}
		Static121.method2054(local27, local33, local67, local83, local79, local19, false);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILclient!n;III)V")
	public static void method4380(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub23 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt3422 == -1 && arg1.anIntArray297 == null) {
			return;
		}
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = Static71.anInt1312 * arg1.anInt3431 >> 8;
		if (arg4 > arg1.anInt3419) {
			local17 = arg4 - arg1.anInt3419;
		} else if (arg4 < arg1.anInt3418) {
			local17 = arg1.anInt3418 - arg4;
		}
		if (arg0 > arg1.anInt3429) {
			local17 += arg0 - arg1.anInt3429;
		} else if (arg0 < arg1.anInt3417) {
			local17 += arg1.anInt3417 - arg0;
		}
		if (arg1.anInt3430 == 0 || arg1.anInt3430 < local17 - 64 || Static71.anInt1312 == 0 || arg2 != arg1.anInt3420) {
			if (arg1.aClass4_Sub9_Sub1_3 != null) {
				Static219.aClass4_Sub9_Sub4_2.method1470(arg1.aClass4_Sub9_Sub1_3);
				arg1.aClass4_Sub9_Sub1_3 = null;
			}
			if (arg1.aClass4_Sub9_Sub1_2 != null) {
				Static219.aClass4_Sub9_Sub4_2.method1470(arg1.aClass4_Sub9_Sub1_2);
				arg1.aClass4_Sub9_Sub1_2 = null;
			}
			return;
		}
		local17 -= 64;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(149) int local149 = local24 * (arg1.anInt3430 - local17) / arg1.anInt3430;
		if (arg1.aClass4_Sub9_Sub1_3 != null) {
			arg1.aClass4_Sub9_Sub1_3.method776(local149);
		} else if (arg1.anInt3422 >= 0) {
			@Pc(165) Class60 local165 = Static303.method1647(Static35.aClass98_22, arg1.anInt3422, 0);
			if (local165 != null) {
				@Pc(174) Class4_Sub15_Sub1 local174 = local165.method1646().method1487(Static254.aClass56_1);
				@Pc(179) Class4_Sub9_Sub1 local179 = Static302.method809(local174, local149);
				local179.method781(-1);
				Static219.aClass4_Sub9_Sub4_2.method1473(local179);
				arg1.aClass4_Sub9_Sub1_3 = local179;
			}
		}
		if (arg1.aClass4_Sub9_Sub1_2 != null) {
			arg1.aClass4_Sub9_Sub1_2.method776(local149);
			if (!arg1.aClass4_Sub9_Sub1_2.method4390()) {
				arg1.aClass4_Sub9_Sub1_2 = null;
			}
		} else if (arg1.anIntArray297 != null && (arg1.anInt3428 -= arg3) <= 0) {
			@Pc(220) int local220 = (int) ((double) arg1.anIntArray297.length * Math.random());
			@Pc(228) Class60 local228 = Static303.method1647(Static35.aClass98_22, arg1.anIntArray297[local220], 0);
			if (local228 != null) {
				@Pc(237) Class4_Sub15_Sub1 local237 = local228.method1646().method1487(Static254.aClass56_1);
				@Pc(242) Class4_Sub9_Sub1 local242 = Static302.method809(local237, local149);
				local242.method781(0);
				Static219.aClass4_Sub9_Sub4_2.method1473(local242);
				arg1.anInt3428 = arg1.anInt3421 + (int) (Math.random() * (double) (arg1.anInt3423 - arg1.anInt3421));
				arg1.aClass4_Sub9_Sub1_2 = local242;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method4382(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static96.aClass151_1);
		arg0.addMouseMotionListener(Static96.aClass151_1);
		arg0.addFocusListener(Static96.aClass151_1);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	public static void method4385() {
		aClass98_173 = null;
		aCharArray45 = null;
		aClass98_174 = null;
	}
}
