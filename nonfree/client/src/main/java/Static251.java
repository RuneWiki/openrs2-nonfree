import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!lc;")
	public static Class98 aClass98_143;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_9;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public static int anInt4741 = 0;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt4743 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public static void method3782(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub2_Sub21 local16 = Static39.method4121(arg0, 2);
		local16.method4361();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method3783() {
		aClass4_Sub2_Sub1_9 = null;
		aClass98_143 = null;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIZZILclient!ra;II)Lclient!bi;")
	public static Class4_Sub2_Sub1 method3784(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class143 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class163 local9 = Static277.method4117(arg4);
		if (arg6 > 1 && local9.anIntArray436 != null) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (local9.anIntArray435[local22] <= arg6 && local9.anIntArray435[local22] != 0) {
					local20 = local9.anIntArray436[local22];
				}
			}
			if (local20 != -1) {
				local9 = Static277.method4117(local20);
			}
		}
		@Pc(67) Class12_Sub2_Sub1 local67 = local9.method3903(arg5);
		if (local67 == null) {
			return null;
		}
		@Pc(74) Class4_Sub2_Sub1_Sub1 local74 = null;
		if (local9.anInt4869 != -1) {
			local74 = (Class4_Sub2_Sub1_Sub1) method3784(true, 0, true, false, local9.anInt4899, arg5, 10, 1);
			if (local74 == null) {
				return null;
			}
		} else if (local9.anInt4892 != -1) {
			local74 = (Class4_Sub2_Sub1_Sub1) method3784(false, arg1, true, false, local9.anInt4880, arg5, arg6, arg7);
			if (local74 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static166.anIntArray293;
		@Pc(122) int local122 = Static166.anInt3307;
		@Pc(124) int local124 = Static166.anInt3305;
		@Pc(127) int[] local127 = new int[4];
		Static166.method2609(local127);
		@Pc(135) Class4_Sub2_Sub1_Sub1 local135 = new Class4_Sub2_Sub1_Sub1(36, 32);
		Static166.method2623(local135.anIntArray387, 36, 32);
		Static204.method3238();
		Static204.method3218(16, 16);
		@Pc(147) int local147 = local9.anInt4907;
		Static204.aBoolean260 = false;
		if (arg0) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg7 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(177) int local177 = local147 * Class131.anIntArray355[local9.anInt4886] >> 16;
		@Pc(186) int local186 = local147 * Class131.anIntArray353[local9.anInt4886] >> 16;
		local67.method3163(local9.anInt4894, local9.anInt4862, local9.anInt4886, local9.anInt4896, local177 + local9.anInt4911 - local67.method3355() / 2, local186 + local9.anInt4911, -1L);
		if (arg7 >= 1) {
			local135.method3472(1);
			if (arg7 >= 2) {
				local135.method3472(16777215);
			}
			Static166.method2623(local135.anIntArray387, 36, 32);
		}
		if (arg1 != 0) {
			local135.method3476(arg1);
		}
		if (local9.anInt4869 != -1) {
			local74.method3454(0, 0);
		} else if (local9.anInt4892 != -1) {
			Static166.method2623(local74.anIntArray387, 36, 32);
			local135.method3454(0, 0);
			local135 = local74;
		}
		if (arg3 && (local9.anInt4887 == 1 || arg6 != 1) && arg6 != -1) {
			Static33.aClass4_Sub2_Sub12_Sub1_2.method4173(Static127.method2094(arg6), 0, 9, 16776960, 1);
		}
		Static166.method2623(local120, local124, local122);
		Static166.method2618(local127);
		Static204.method3238();
		Static204.aBoolean260 = true;
		return Static178.aBoolean216 && !arg2 ? new Class4_Sub2_Sub1_Sub2(local135) : local135;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZ)V")
	public static void method3785(@OriginalArg(0) boolean arg0) {
		@Pc(27) byte local27;
		@Pc(25) byte[][] local25;
		if (Static178.aBoolean216 && arg0) {
			local25 = Static207.aByteArrayArray17;
			local27 = 1;
		} else {
			local25 = Static249.aByteArrayArray19;
			local27 = 4;
		}
		@Pc(35) int[] local35 = null;
		for (@Pc(37) int local37 = 0; local37 < local27; local37++) {
			Static81.method3275();
			for (@Pc(44) int local44 = 0; local44 < 13; local44++) {
				for (@Pc(49) int local49 = 0; local49 < 13; local49++) {
					@Pc(56) boolean local56 = false;
					@Pc(64) int local64 = Static38.anIntArrayArrayArray3[local37][local44][local49];
					if (local64 != -1) {
						@Pc(73) int local73 = local64 >> 24 & 0x3;
						if (!arg0 || local73 == 0) {
							@Pc(86) int local86 = local64 >> 1 & 0x3;
							@Pc(92) int local92 = local64 >> 14 & 0x3FF;
							@Pc(98) int local98 = local64 >> 3 & 0x7FF;
							@Pc(109) int local109 = (local92 / 8 << 8) + (local98 / 8);
							for (@Pc(111) int local111 = 0; local111 < Static262.anIntArray442.length; local111++) {
								if (Static262.anIntArray442[local111] == local109 && local25[local111] != null) {
									local56 = true;
									@Pc(154) int[] local154 = Static23.method378(local73, local25[local111], Static121.aClass63Array1, local49 * 8, local92, local37, local98, local86, arg0, local44 * 8);
									if (local35 == null && local154 != null) {
										local35 = local154;
									}
									break;
								}
							}
						}
					}
					if (!local56) {
						Static255.method3838(8, local49 * 8, local44 * 8, 8, local37);
					}
				}
			}
		}
		if (local35 == null) {
			Static1.anInt4 = -1;
			return;
		}
		Static185.anInt3643 = local35[3];
		Static11.anInt205 = local35[4];
		Static231.anInt4521 = local35[2];
		Static49.anInt1022 = local35[1];
		Static1.anInt4 = local35[0];
	}
}
