import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!kr;")
	public static Class171 aClass171_149;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt8903 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt8906 = 1;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	public static int anInt8908 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZIZI)V")
	public static void method7325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static242.aClass255ArrayArrayArray2 == null) {
			Static513.aClass122_10.method7265(-16777216, arg0, arg1, arg4, arg2);
		} else if (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >= 0 && Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 < Static459.anInt7799 * 512 && Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >= 0 && Static482.anInt7990 * 512 > Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141) {
			Static45.anInt915++;
			if (Static63.aClass49_Sub2_Sub2_Sub1_1 != null && Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 + 256 - Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() * 256 >> 9 == Static364.anInt6445 && Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 + 256 - Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() * 256 >> 9 == Static377.anInt6886) {
				Static377.anInt6886 = -1;
				Static364.anInt6445 = -1;
				Static19.method499();
			}
			Static147.method2362();
			if (!arg3) {
				Static207.method3559();
			}
			Static163.method2510();
			Static539.method7502(arg1, true, arg0, arg4, arg2);
			@Pc(116) int local116 = Static514.anInt8674;
			@Pc(118) int local118 = Static376.anInt6882;
			@Pc(120) int local120 = Static280.anInt5244;
			@Pc(122) int local122 = Static211.anInt4099;
			@Pc(130) int local130;
			@Pc(163) int local163;
			if (Static448.anInt7701 == 1) {
				local130 = (int) Static50.aFloat13;
				if (Static384.anInt6973 >> 8 > local130) {
					local130 = Static384.anInt6973 >> 8;
				}
				if (Static170.aBooleanArray18[4] && Static379.anIntArray822[4] + 128 > local130) {
					local130 = Static379.anIntArray822[4] + 128;
				}
				local163 = Static232.anInt4618 + (int) Static404.aFloat156 & 0x3FFF;
				method7326((local130 >> 3) * 3 + 600 << 2, local130, Static69.anInt1327, local163, Static81.anInt1467, local122, Static38.method884(Static501.anInt8491, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141) - 200);
			} else if (Static448.anInt7701 == 4) {
				local130 = (int) Static50.aFloat13;
				if (Static384.anInt6973 >> 8 > local130) {
					local130 = Static384.anInt6973 >> 8;
				}
				if (Static170.aBooleanArray18[4] && local130 < Static379.anIntArray822[4] + 128) {
					local130 = Static379.anIntArray822[4] + 128;
				}
				local163 = (int) Static404.aFloat156 & 0x3FFF;
				method7326((local130 >> 3) * 3 + 600 << 2, local130, Static69.anInt1327, local163, Static81.anInt1467, local122, Static38.method884(Static501.anInt8491, Static308.anInt5706, Static88.anInt1782) - 200);
			} else if (Static448.anInt7701 == 5) {
				Static468.method6554(local122);
			}
			local130 = Static522.anInt8770;
			local163 = Static504.anInt8519;
			@Pc(272) int local272 = Static516.anInt8682;
			@Pc(274) int local274 = Static381.anInt6946;
			@Pc(276) int local276 = Static305.anInt5631;
			@Pc(320) int local320;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static170.aBooleanArray18[local278]) {
					local320 = (int) ((double) -Static302.anIntArray556[local278] + Math.random() * (double) (Static302.anIntArray556[local278] * 2 + 1) + Math.sin((double) Static260.anIntArray518[local278] / 100.0D * (double) Static541.anIntArray841[local278]) * (double) Static379.anIntArray822[local278]);
					if (local278 == 4) {
						Static381.anInt6946 += local320;
						if (Static381.anInt6946 < 1024) {
							Static381.anInt6946 = 1024;
						} else if (Static381.anInt6946 > 3072) {
							Static381.anInt6946 = 3072;
						}
					}
					if (local278 == 3) {
						Static305.anInt5631 = Static305.anInt5631 + local320 & 0x3FFF;
					}
					if (local278 == 0) {
						Static522.anInt8770 += local320 << 2;
					}
					if (local278 == 2) {
						Static516.anInt8682 += local320 << 2;
					}
					if (local278 == 1) {
						Static504.anInt8519 += local320 << 2;
					}
				}
			}
			if (Static522.anInt8770 < 0) {
				Static522.anInt8770 = 0;
			}
			if (Static522.anInt8770 > (Static93.anInt1898 << 9) - 1) {
				Static522.anInt8770 = (Static93.anInt1898 << 9) - 1;
			}
			if (Static516.anInt8682 < 0) {
				Static516.anInt8682 = 0;
			}
			if ((Static382.anInt6965 << 9) - 1 < Static516.anInt8682) {
				Static516.anInt8682 = (Static382.anInt6965 << 9) - 1;
			}
			Static328.method5045();
			Static532.method7369();
			Static513.aClass122_10.N(local120, local116, local118 + local120, local122 + local116);
			Static513.aClass122_10.method7284();
			local320 = Static24.anInt539;
			if (Static40.aClass117_1 == null) {
				Static513.aClass122_10.Z(local320);
			} else {
				Static40.aClass117_1.method2621(local122, Static381.anInt6946, Static513.aClass122_10, Static305.anInt5631, local116, local118, local320, Static101.anInt7613 << 3, local120);
			}
			Static63.method1142();
			Static37.aClass118_3.B(Static522.anInt8770, Static504.anInt8519, Static516.anInt8682, -Static381.anInt6946 & 0x3FFF, -Static305.anInt5631 & 0x3FFF, -Static363.anInt6440 & 0x3FFF);
			Static513.aClass122_10.method7250(Static37.aClass118_3);
			Static513.aClass122_10.b(local120 + local118 / 2, local116 - -(local122 / 2), Static407.anInt7234 << 1, Static407.anInt7234 << 1);
			Static298.method4743(Static407.anInt7234 << 1, Static407.anInt7234 << 1, local122 / 2 + local116, local118 / 2 + local120);
			Static310.method4871(-Static363.anInt6440 & 0x3FFF, -Static305.anInt5631 & 0x3FFF, -Static381.anInt6946 & 0x3FFF, Static504.anInt8519, Static516.anInt8682, Static522.anInt8770);
			@Pc(561) byte local561 = Static544.aClass1_Sub22_Sub1_1.method4661(Static374.anInt6861) == 2 ? (byte) Static45.anInt915 : 1;
			Static19.method497(Static513.aClass122_10, Static436.anInt6850, Static61.anInt1166, Static37.aClass118_3, Static522.anInt8770, Static504.anInt8519, Static516.anInt8682, Static406.aByteArrayArrayArray15, Static220.anIntArray429, Static238.anIntArray611, client.lb, Static306.anIntArray564, Static383.anIntArray578, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 + 1, local561, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9, !Static544.aClass1_Sub22_Sub1_1.aBoolean379);
			Static63.method1142();
			if (Static268.anInt5100 == 9) {
				Static196.method3412(local118, local122, local120, local116);
				Static232.method4013(local122, local118, local120, local116);
				Static93.method1642(local122, local116, local120, local118);
				Static424.method6220(local116, local122, local118, local120);
			}
			Static406.method6067();
			Static516.anInt8682 = local272;
			Static504.anInt8519 = local163;
			Static381.anInt6946 = local274;
			Static522.anInt8770 = local130;
			Static305.anInt5631 = local276;
			if (Static81.aBoolean92 && Static322.aClass114_2.method2604() == 0) {
				Static81.aBoolean92 = false;
			}
			if (Static81.aBoolean92) {
				Static513.aClass122_10.method7265(-16777216, local122, local120, local118, local116);
				Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168), false, Static112.aClass67_3);
			}
		} else {
			Static513.aClass122_10.method7265(-16777216, arg0, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static533.aShort134 + (Static268.aShort87 - Static533.aShort134) * local7 / 100;
		@Pc(43) int local43 = arg0 * local33 >> 8;
		@Pc(49) int local49 = 16384 - arg1 & 0x3FFF;
		@Pc(56) int local56 = 16384 - arg3 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local43;
		if (local49 != 0) {
			local60 = -local43 * Class310.anIntArray827[local49] >> 14;
			local62 = local43 * Class310.anIntArray826[local49] >> 14;
		}
		if (local56 != 0) {
			local58 = Class310.anIntArray827[local56] * local62 >> 14;
			local62 = Class310.anIntArray826[local56] * local62 >> 14;
		}
		Static504.anInt8519 = arg6 - local60;
		Static522.anInt8770 = arg4 - local58;
		Static363.anInt6440 = 0;
		Static381.anInt6946 = arg1;
		Static305.anInt5631 = arg3;
		Static516.anInt8682 = arg2 - local62;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method7327() {
		Static487.aClass122_8.method7277(Static498.aFloat160, Static235.aFloat99, Static124.aFloat26);
	}
}
